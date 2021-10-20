package com.huawei.updatesdk.b.a.b;

import android.util.ArrayMap;
import android.util.ArraySet;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.PublicKey;
import vigqyno.C0201;

public class c {

    static class a {
        public ArrayMap<String, ArraySet<PublicKey>> a = null;
        public ArraySet<String> b = null;
    }

    public static a a(File file) {
        a aVar = new a();
        Object b = b(file);
        if (b != null) {
            Object a2 = a(b, C0201.m82(35165));
            if (a2 instanceof ArrayMap) {
                aVar.a = (ArrayMap) a2;
            }
            Object a3 = a(b, C0201.m82(35166));
            if (a3 instanceof ArraySet) {
                aVar.b = (ArraySet) a3;
            }
        }
        return aVar;
    }

    private static Object a(Object obj, String str) {
        String str2;
        String r0 = C0201.m82(35167);
        try {
            return Class.forName(C0201.m82(35168)).getDeclaredField(str).get(obj);
        } catch (ClassNotFoundException unused) {
            str2 = C0201.m82(35172);
        } catch (NoSuchFieldException unused2) {
            str2 = C0201.m82(35171);
        } catch (IllegalAccessException unused3) {
            str2 = C0201.m82(35170);
        } catch (NoSuchFieldError unused4) {
            str2 = C0201.m82(35169);
        }
        com.huawei.updatesdk.a.a.b.a.a.a.c(r0, str2);
        return null;
    }

    private static Object b(File file) {
        String str;
        String r0 = C0201.m82(35173);
        try {
            Class<?> cls = Class.forName(C0201.m82(35174));
            return cls.getDeclaredMethod(C0201.m82(35175), File.class, Integer.TYPE).invoke(cls.newInstance(), file, 0);
        } catch (ClassNotFoundException unused) {
            str = C0201.m82(35181);
            com.huawei.updatesdk.a.a.b.a.a.a.c(r0, str);
            return null;
        } catch (NoSuchMethodException unused2) {
            str = C0201.m82(35180);
            com.huawei.updatesdk.a.a.b.a.a.a.c(r0, str);
            return null;
        } catch (InstantiationException unused3) {
            str = C0201.m82(35179);
            com.huawei.updatesdk.a.a.b.a.a.a.c(r0, str);
            return null;
        } catch (IllegalAccessException unused4) {
            str = C0201.m82(35178);
            com.huawei.updatesdk.a.a.b.a.a.a.c(r0, str);
            return null;
        } catch (InvocationTargetException unused5) {
            str = C0201.m82(35177);
            com.huawei.updatesdk.a.a.b.a.a.a.c(r0, str);
            return null;
        } catch (Exception e) {
            str = C0201.m82(35176) + e.getMessage();
            com.huawei.updatesdk.a.a.b.a.a.a.c(r0, str);
            return null;
        }
    }
}
