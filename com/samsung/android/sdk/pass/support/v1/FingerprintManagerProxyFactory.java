package com.samsung.android.sdk.pass.support.v1;

import android.content.Context;
import android.util.Log;
import com.samsung.android.sdk.pass.support.IFingerprintManagerProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class FingerprintManagerProxyFactory {

    /* access modifiers changed from: private */
    public static class a implements InvocationHandler {
        private Object a;
        private Map b = new HashMap();

        public a(Object obj) {
            this.a = obj;
            Method[] methods = IFingerprintManagerProxy.class.getMethods();
            Method[] methods2 = obj.getClass().getMethods();
            for (Method method : methods2) {
                String name = method.getName();
                if (a(methods, method)) {
                    this.b.put(name, method);
                }
            }
        }

        private static boolean a(Method[] methodArr, Method method) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Method method2 : methodArr) {
                if (method2.getName().equals(name)) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes == null || parameterTypes2 == null) {
                        return true;
                    }
                    if (parameterTypes.length == parameterTypes2.length) {
                        int length = parameterTypes.length;
                        boolean z = false;
                        for (int i = 0; i < length; i++) {
                            if (!parameterTypes2[i].equals(parameterTypes[i])) {
                                z = true;
                            }
                        }
                        if (!z) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Method method2 = (Method) this.b.get(method.getName());
            if (method2 != null) {
                return method2.invoke(this.a, objArr);
            }
            return null;
        }
    }

    public static IFingerprintManagerProxy create(Context context) {
        Object obj;
        try {
            obj = Class.forName(C0201.m82(3536)).getMethod(C0201.m82(3537), Context.class).invoke(null, context);
        } catch (Exception e) {
            Log.e(C0201.m82(3539), C0201.m82(3538) + e);
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        a aVar = new a(obj);
        return (IFingerprintManagerProxy) Proxy.newProxyInstance(FingerprintManagerProxyFactory.class.getClassLoader(), new Class[]{IFingerprintManagerProxy.class}, aVar);
    }
}
