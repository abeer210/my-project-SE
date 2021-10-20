package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import vigqyno.C0201;

public final class m5 {
    public static <T> T a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format(C0201.m82(11502), str, cls.getCanonicalName(), t2.getClass().getCanonicalName()));
    }

    public static void b(Bundle bundle, Object obj) {
        boolean z = obj instanceof Double;
        String r1 = C0201.m82(11503);
        if (z) {
            bundle.putDouble(r1, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(r1, ((Long) obj).longValue());
        } else {
            bundle.putString(r1, obj.toString());
        }
    }
}
