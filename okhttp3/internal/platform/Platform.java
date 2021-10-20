package okhttp3.internal.platform;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import vigqyno.C0201;

public class Platform {
    public static final int INFO = 0;
    private static final Platform PLATFORM = findPlatform();
    public static final int WARN = 0;
    private static final Logger logger = Logger.getLogger(OkHttpClient.class.getName());

    static {
        C0201.m83(Platform.class, 699);
    }

    public static List<String> alpnProtocolNames(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public static byte[] concatLengthPrefixed(List<Protocol> list) {
        ay2 ay2 = new ay2();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                ay2.c0(protocol.toString().length());
                ay2.r0(protocol.toString());
            }
        }
        return ay2.I();
    }

    private static Platform findPlatform() {
        ConscryptPlatform buildIfSupported;
        Platform buildIfSupported2 = AndroidPlatform.buildIfSupported();
        if (buildIfSupported2 != null) {
            return buildIfSupported2;
        }
        if (isConscryptPreferred() && (buildIfSupported = ConscryptPlatform.buildIfSupported()) != null) {
            return buildIfSupported;
        }
        Jdk9Platform buildIfSupported3 = Jdk9Platform.buildIfSupported();
        if (buildIfSupported3 != null) {
            return buildIfSupported3;
        }
        Platform buildIfSupported4 = JdkWithJettyBootPlatform.buildIfSupported();
        if (buildIfSupported4 != null) {
            return buildIfSupported4;
        }
        return new Platform();
    }

    public static Platform get() {
        return PLATFORM;
    }

    public static boolean isConscryptPreferred() {
        if (C0201.m82(35037).equals(System.getProperty(C0201.m82(35036)))) {
            return true;
        }
        return C0201.m82(35038).equals(Security.getProviders()[0].getName());
    }

    public static <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        Object readFieldOrNull;
        for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                }
                return null;
            } catch (NoSuchFieldException unused) {
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        String r1 = C0201.m82(35039);
        if (str.equals(r1) || (readFieldOrNull = readFieldOrNull(obj, Object.class, r1)) == null) {
            return null;
        }
        return (T) readFieldOrNull(readFieldOrNull, cls, str);
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(buildTrustRootIndex(x509TrustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        return new BasicTrustRootIndex(x509TrustManager.getAcceptedIssuers());
    }

    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String getPrefix() {
        return C0201.m82(35042);
    }

    public SSLContext getSSLContext() {
        if (C0201.m82(35044).equals(System.getProperty(C0201.m82(35043)))) {
            try {
                return SSLContext.getInstance(C0201.m82(35045));
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance(C0201.m82(35046));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(C0201.m82(35047), e);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public Object getStackTraceForCloseable(String str) {
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        return true;
    }

    public void log(int i, String str, Throwable th) {
        logger.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void logCloseableLeak(String str, Object obj) {
        if (obj == null) {
            str = str + C0201.m82(35048);
        }
        log(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        try {
            Object readFieldOrNull = readFieldOrNull(sSLSocketFactory, Class.forName(C0201.m82(35049)), C0201.m82(35050));
            if (readFieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, C0201.m82(35051));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public CertificateChainCleaner buildCertificateChainCleaner(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager trustManager = trustManager(sSLSocketFactory);
        if (trustManager != null) {
            return buildCertificateChainCleaner(trustManager);
        }
        throw new IllegalStateException(C0201.m82(35040) + get() + C0201.m82(35041) + sSLSocketFactory.getClass());
    }
}
