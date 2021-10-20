package com.google.android.gms.vision;

import android.util.Log;
import androidx.annotation.Keep;
import vigqyno.C0201;

@Keep
public class L {
    public static boolean isLoggable(int i) {
        return 4 <= i;
    }

    public static int zza(String str, Object... objArr) {
        if (!isLoggable(2)) {
            return 0;
        }
        return Log.v(C0201.m82(15119), String.format(str, objArr));
    }

    public static int zzb(String str, Object... objArr) {
        if (!isLoggable(3)) {
            return 0;
        }
        return Log.d(C0201.m82(15122), String.format(str, objArr));
    }

    public static int zzc(String str, Object... objArr) {
        if (!isLoggable(6)) {
            return 0;
        }
        return Log.e(C0201.m82(15123), String.format(str, objArr));
    }

    public static int zza(Throwable th, String str, Object... objArr) {
        if (!isLoggable(6)) {
            return 0;
        }
        boolean isLoggable = isLoggable(3);
        String r1 = C0201.m82(15120);
        if (isLoggable) {
            return Log.e(r1, String.format(str, objArr), th);
        }
        String format = String.format(str, objArr);
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + String.valueOf(valueOf).length());
        sb.append(format);
        sb.append(C0201.m82(15121));
        sb.append(valueOf);
        return Log.e(r1, sb.toString());
    }
}
