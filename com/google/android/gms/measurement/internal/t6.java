package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;

public final class t6 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        u.k(strArr);
        u.k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }
}
