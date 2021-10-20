package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: c6  reason: default package */
/* compiled from: SidePropagation */
public class c6 extends d7 {
    private float b = 3.0f;
    private int c = 80;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    private int h(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.c;
        boolean z = true;
        if (i9 != 8388611) {
            if (i9 == 8388613) {
                if (k3.w(view) != 1) {
                    z = false;
                }
            }
            if (i9 != 3) {
                return (i7 - i) + Math.abs(i4 - i2);
            }
            if (i9 == 5) {
                return (i - i5) + Math.abs(i4 - i2);
            }
            if (i9 == 48) {
                return (i8 - i2) + Math.abs(i3 - i);
            }
            if (i9 != 80) {
                return 0;
            }
            return (i2 - i6) + Math.abs(i3 - i);
        } else if (k3.w(view) != 1) {
            z = false;
        }
        i9 = 5;
        if (i9 != 3) {
        }
    }

    private int i(ViewGroup viewGroup) {
        int i = this.c;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }

    @Override // defpackage.h6
    public long c(ViewGroup viewGroup, e6 e6Var, k6 k6Var, k6 k6Var2) {
        int i;
        int i2;
        int i3;
        k6 k6Var3 = k6Var;
        if (k6Var3 == null && k6Var2 == null) {
            return 0;
        }
        Rect u = e6Var.u();
        if (k6Var2 == null || e(k6Var3) == 0) {
            i = -1;
        } else {
            k6Var3 = k6Var2;
            i = 1;
        }
        int f = f(k6Var3);
        int g = g(k6Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (u != null) {
            i3 = u.centerX();
            i2 = u.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float h = ((float) h(viewGroup, f, g, i3, i2, round, round2, width, height)) / ((float) i(viewGroup));
        long t = e6Var.t();
        if (t < 0) {
            t = 300;
        }
        return (long) Math.round((((float) (t * ((long) i))) / this.b) * h);
    }

    public void j(int i) {
        this.c = i;
    }
}
