package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import vigqyno.C0201;

public class JdkWithJettyBootPlatform extends Platform {
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    private static class JettyNegoProvider implements InvocationHandler {
        private final List<String> protocols;
        public String selected;
        public boolean unsupported;

        public JettyNegoProvider(List<String> list) {
            this.protocols = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.EMPTY_STRING_ARRAY;
            }
            if (name.equals(C0201.m82(1079)) && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals(C0201.m82(1080)) && Void.TYPE == returnType) {
                this.unsupported = true;
                return null;
            } else if (name.equals(C0201.m82(1081)) && objArr.length == 0) {
                return this.protocols;
            } else {
                if ((name.equals(C0201.m82(1082)) || name.equals(C0201.m82(1083))) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.protocols.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.selected = str;
                            return str;
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                } else if ((!name.equals(C0201.m82(1084)) && !name.equals(C0201.m82(1085))) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.selected = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    public JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    public static Platform buildIfSupported() {
        String r0 = C0201.m82(1655);
        try {
            Class<?> cls = Class.forName(C0201.m82(1656));
            Class<?> cls2 = Class.forName(r0 + C0201.m82(1657));
            Class<?> cls3 = Class.forName(r0 + C0201.m82(1658));
            Class<?> cls4 = Class.forName(r0 + C0201.m82(1659));
            return new JdkWithJettyBootPlatform(cls.getMethod(C0201.m82(1660), SSLSocket.class, cls2), cls.getMethod(C0201.m82(1661), SSLSocket.class), cls.getMethod(C0201.m82(1662), SSLSocket.class), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sSLSocket) {
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Util.assertionError(C0201.m82(1663), e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        List<String> alpnProtocolNames = Platform.alpnProtocolNames(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new JettyNegoProvider(alpnProtocolNames));
            this.putMethod.invoke(null, sSLSocket, newProxyInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Util.assertionError(C0201.m82(1664), e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        try {
            JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
            if (!jettyNegoProvider.unsupported && jettyNegoProvider.selected == null) {
                Platform.get().log(4, C0201.m82(1665), null);
                return null;
            } else if (jettyNegoProvider.unsupported) {
                return null;
            } else {
                return jettyNegoProvider.selected;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Util.assertionError(C0201.m82(1666), e);
        }
    }
}
