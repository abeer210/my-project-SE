package com.huawei.hms.feature.dynamic.a;

import android.util.Log;
import dalvik.system.DexClassLoader;
import vigqyno.C0201;

public final class b extends DexClassLoader {
    private static final String a = b.class.getSimpleName();

    public b(String str, String str2, ClassLoader classLoader) {
        super(str, str2, null, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith(C0201.m82(21913)) && !str.startsWith(C0201.m82(21914))) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(a, C0201.m82(21915).concat(String.valueOf(str)));
            }
        }
        return super.loadClass(str, z);
    }
}
