package com.reactnativecommunity.netinfo;

import android.content.Context;
import androidx.core.content.b;
import vigqyno.C0201;

/* compiled from: NetInfoUtils */
public class e {
    public static boolean a(Context context) {
        return b.a(context, C0201.m82(32159)) == 0;
    }

    public static void b(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b;
        }
    }
}
