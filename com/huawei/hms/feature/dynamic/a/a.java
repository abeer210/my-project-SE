package com.huawei.hms.feature.dynamic.a;

import android.util.Log;
import dalvik.system.PathClassLoader;
import vigqyno.C0201;

public final class a extends PathClassLoader {
    private static final String a = a.class.getSimpleName();

    public a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith(C0201.m82(21858)) && !str.startsWith(C0201.m82(21859))) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(a, C0201.m82(21860).concat(String.valueOf(str)));
            }
        }
        return super.loadClass(str, z);
    }
}
