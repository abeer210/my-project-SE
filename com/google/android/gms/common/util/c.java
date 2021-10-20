package com.google.android.gms.common.util;

import android.util.Base64;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class c {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
