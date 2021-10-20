package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.vision.L;
import vigqyno.C0201;

@Keep
public class LogUtils {
    public static oj1 zza(long j, int i) {
        oj1 oj1 = new oj1();
        jj1 jj1 = new jj1();
        oj1.e = jj1;
        gj1 gj1 = new gj1();
        gj1[] gj1Arr = new gj1[1];
        jj1.e = gj1Arr;
        gj1Arr[0] = gj1;
        gj1.h = Long.valueOf(j);
        gj1.i = Long.valueOf((long) i);
        gj1.j = new nj1[i];
        return oj1;
    }

    public static bj1 zzd(Context context) {
        bj1 bj1 = new bj1();
        bj1.c = context.getPackageName();
        String zze = zze(context);
        if (zze != null) {
            bj1.d = zze;
        }
        return bj1;
    }

    private static String zze(Context context) {
        try {
            return hq0.a(context).d(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            L.zza(e, C0201.m82(38329), context.getPackageName());
            return null;
        }
    }
}
