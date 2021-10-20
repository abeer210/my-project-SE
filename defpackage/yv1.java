package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: yv1  reason: default package */
/* compiled from: AnimationUtils */
public class yv1 {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new m4();
    public static final TimeInterpolator c = new l4();
    public static final TimeInterpolator d = new n4();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int b(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
