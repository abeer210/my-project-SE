package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: yf2  reason: default package */
/* compiled from: Interpolation */
public enum yf2 {
    ACCELERATE,
    DECELERATE,
    ACCELERATE_DECELERATE,
    DEFAULT,
    NO_VALUE;

    /* renamed from: yf2$a */
    /* compiled from: Interpolation */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[yf2.values().length];
            a = iArr;
            iArr[yf2.ACCELERATE.ordinal()] = 1;
            a[yf2.DECELERATE.ordinal()] = 2;
            a[yf2.ACCELERATE_DECELERATE.ordinal()] = 3;
            try {
                a[yf2.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public TimeInterpolator b() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 3) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i != 4) {
            return null;
        }
        return new LinearInterpolator();
    }
}
