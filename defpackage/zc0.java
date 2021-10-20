package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import vigqyno.C0188;

/* renamed from: zc0  reason: default package */
/* compiled from: DefaultBitmapMemoryCacheParamsSupplier */
public class zc0 implements c60<hd0> {
    private static final long b = TimeUnit.MINUTES.toMillis(5);
    private final ActivityManager a;

    public zc0(ActivityManager activityManager) {
        this.a = activityManager;
    }

    private int b() {
        int min = Math.min(this.a.getMemoryClass() * 1048576, (int) C0188.f24);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    /* renamed from: a */
    public hd0 get() {
        return new hd0(b(), 256, C0188.f24, C0188.f24, C0188.f24, b);
    }
}
