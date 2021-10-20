package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import vigqyno.C0201;

/* compiled from: RNInstallReferrerClient */
public class c {
    private static Class<?> d;
    private static Class<?> e;
    private static Class<?> f;
    private final SharedPreferences a;
    private Object b;
    private Object c;

    /* compiled from: RNInstallReferrerClient */
    private class b implements InvocationHandler {
        private b() {
        }

        public void a() {
            Log.d(C0201.m82(24670), C0201.m82(24671));
        }

        public void b(int i) {
            String r0 = C0201.m82(24672);
            String r1 = C0201.m82(24673);
            if (i == 0) {
                try {
                    Log.d(r1, C0201.m82(24676));
                    Object invoke = c.d.getMethod(r0, new Class[0]).invoke(c.this.b, new Object[0]);
                    SharedPreferences.Editor edit = c.this.a.edit();
                    edit.putString(C0201.m82(24677), (String) c.f.getMethod(r0, new Class[0]).invoke(invoke, new Object[0]));
                    edit.apply();
                    c.d.getMethod(C0201.m82(24678), new Class[0]).invoke(c.this.b, new Object[0]);
                } catch (Exception e) {
                    PrintStream printStream = System.err;
                    printStream.println(C0201.m82(24679) + e.getMessage());
                    e.printStackTrace(System.err);
                }
            } else if (i == 1) {
                Log.d(r1, C0201.m82(24675));
            } else if (i == 2) {
                Log.d(r1, C0201.m82(24674));
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                if (name.equals(C0201.m82(24680)) && objArr != null && (objArr[0] instanceof Integer)) {
                    b(((Integer) objArr[0]).intValue());
                    return null;
                } else if (!name.equals(C0201.m82(24681))) {
                    return null;
                } else {
                    a();
                    return null;
                }
            } catch (Exception e) {
                throw new RuntimeException(C0201.m82(24682) + e.getMessage());
            }
        }
    }

    static {
        try {
            d = Class.forName(C0201.m82(15149));
            e = Class.forName(C0201.m82(15150));
            f = Class.forName(C0201.m82(15151));
        } catch (Exception unused) {
            System.err.println(C0201.m82(15152));
        }
    }

    public c(Context context) {
        this.a = context.getSharedPreferences(C0201.m82(15153), 0);
        Class<?> cls = d;
        if (cls != null && e != null && f != null) {
            try {
                Object invoke = cls.getMethod(C0201.m82(15154), Context.class).invoke(null, context);
                this.b = invoke.getClass().getMethod(C0201.m82(15155), new Class[0]).invoke(invoke, new Object[0]);
                this.c = Proxy.newProxyInstance(e.getClassLoader(), new Class[]{e}, new b());
                d.getMethod(C0201.m82(15156), e).invoke(this.b, this.c);
            } catch (Exception e2) {
                PrintStream printStream = System.err;
                printStream.println(C0201.m82(15157) + e2.getMessage());
                e2.printStackTrace(System.err);
            }
        }
    }
}
