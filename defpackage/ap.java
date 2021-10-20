package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: ap  reason: default package */
/* compiled from: LogTime */
public final class ap {
    private static final double a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        a = d;
    }

    public static double a(long j) {
        double b = (double) (b() - j);
        double d = a;
        Double.isNaN(b);
        return b * d;
    }

    @TargetApi(17)
    public static long b() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
