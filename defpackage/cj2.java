package defpackage;

import android.os.Build;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cj2  reason: default package */
/* compiled from: CompatUtils */
public class cj2 {
    private static final AtomicInteger a = new AtomicInteger(1);

    public static int a() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 19) {
            return View.generateViewId();
        }
        do {
            i = a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!a.compareAndSet(i, i2));
        return i;
    }
}
