package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.g;
import vigqyno.C0201;

/* renamed from: dk0  reason: default package */
/* compiled from: BaseLayoutAnimation */
public abstract class dk0 extends bk0 {

    /* renamed from: dk0$a */
    /* compiled from: BaseLayoutAnimation */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[ck0.values().length];
            a = iArr;
            iArr[ck0.OPACITY.ordinal()] = 1;
            a[ck0.SCALE_XY.ordinal()] = 2;
            a[ck0.SCALE_X.ordinal()] = 3;
            try {
                a[ck0.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // defpackage.bk0
    public Animation b(View view, int i, int i2, int i3, int i4) {
        ck0 ck0 = this.c;
        if (ck0 != null) {
            int i5 = a.a[ck0.ordinal()];
            float f = 0.0f;
            if (i5 == 1) {
                float alpha = g() ? view.getAlpha() : 0.0f;
                if (!g()) {
                    f = view.getAlpha();
                }
                return new mk0(view, alpha, f);
            } else if (i5 == 2) {
                float f2 = g() ? 1.0f : 0.0f;
                float f3 = g() ? 0.0f : 1.0f;
                return new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
            } else if (i5 == 3) {
                return new ScaleAnimation(g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
            } else if (i5 == 4) {
                return new ScaleAnimation(1.0f, 1.0f, g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
            } else {
                throw new g(C0201.m82(2289) + this.c);
            }
        } else {
            throw new g(C0201.m82(2290));
        }
    }

    @Override // defpackage.bk0
    public boolean e() {
        return this.d > 0 && this.c != null;
    }

    public abstract boolean g();
}
