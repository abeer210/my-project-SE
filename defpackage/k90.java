package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: k90  reason: default package */
/* compiled from: FadeDrawable */
public class k90 extends f90 {
    private final Drawable[] i;
    private final boolean j;
    private final int k;
    public int l;
    public int m;
    public long n;
    public int[] o;
    public int[] p;
    public int q;
    public boolean[] u;
    public int v;

    public k90(Drawable[] drawableArr) {
        this(drawableArr, false);
    }

    private void j(Canvas canvas, Drawable drawable, int i2) {
        if (drawable != null && i2 > 0) {
            this.v++;
            drawable.mutate().setAlpha(i2);
            this.v--;
            drawable.draw(canvas);
        }
    }

    private void q() {
        this.l = 2;
        Arrays.fill(this.o, this.k);
        this.o[0] = 255;
        Arrays.fill(this.p, this.k);
        this.p[0] = 255;
        Arrays.fill(this.u, this.j);
        this.u[0] = true;
    }

    private boolean s(float f) {
        boolean z = true;
        for (int i2 = 0; i2 < this.i.length; i2++) {
            int i3 = this.u[i2] ? 1 : -1;
            int[] iArr = this.p;
            iArr[i2] = (int) (((float) this.o[i2]) + (((float) (i3 * 255)) * f));
            if (iArr[i2] < 0) {
                iArr[i2] = 0;
            }
            int[] iArr2 = this.p;
            if (iArr2[i2] > 255) {
                iArr2[i2] = 255;
            }
            if (this.u[i2] && this.p[i2] < 255) {
                z = false;
            }
            if (!this.u[i2] && this.p[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[LOOP:0: B:20:0x004e->B:22:0x0053, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[EDGE_INSN: B:25:0x0065->B:23:0x0065 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.f90
    public void draw(Canvas canvas) {
        Drawable[] drawableArr;
        boolean z;
        int i2 = this.l;
        int i3 = 2;
        int i4 = 0;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 == 1) {
                z50.i(this.m > 0);
                z = s(((float) (p() - this.n)) / ((float) this.m));
                if (!z) {
                    i3 = 1;
                }
                this.l = i3;
            }
            while (true) {
                drawableArr = this.i;
                if (i4 < drawableArr.length) {
                    break;
                }
                j(canvas, drawableArr[i4], (this.p[i4] * this.q) / 255);
                i4++;
            }
            if (z2) {
                invalidateSelf();
                return;
            }
            return;
        }
        System.arraycopy(this.p, 0, this.o, 0, this.i.length);
        this.n = p();
        z = s(this.m == 0 ? 1.0f : 0.0f);
        if (!z) {
            i3 = 1;
        }
        this.l = i3;
        z2 = z;
        while (true) {
            drawableArr = this.i;
            if (i4 < drawableArr.length) {
            }
            j(canvas, drawableArr[i4], (this.p[i4] * this.q) / 255);
            i4++;
        }
        if (z2) {
        }
    }

    public int getAlpha() {
        return this.q;
    }

    public void i() {
        this.v++;
    }

    public void invalidateSelf() {
        if (this.v == 0) {
            super.invalidateSelf();
        }
    }

    public void k() {
        this.v--;
        invalidateSelf();
    }

    public void l() {
        this.l = 0;
        Arrays.fill(this.u, true);
        invalidateSelf();
    }

    public void m(int i2) {
        this.l = 0;
        this.u[i2] = true;
        invalidateSelf();
    }

    public void n(int i2) {
        this.l = 0;
        this.u[i2] = false;
        invalidateSelf();
    }

    public void o() {
        this.l = 2;
        for (int i2 = 0; i2 < this.i.length; i2++) {
            this.p[i2] = this.u[i2] ? 255 : 0;
        }
        invalidateSelf();
    }

    public long p() {
        return SystemClock.uptimeMillis();
    }

    public void r(int i2) {
        this.m = i2;
        if (this.l == 1) {
            this.l = 0;
        }
    }

    @Override // defpackage.f90
    public void setAlpha(int i2) {
        if (this.q != i2) {
            this.q = i2;
            invalidateSelf();
        }
    }

    public k90(Drawable[] drawableArr, boolean z) {
        super(drawableArr);
        int i2 = 0;
        z50.j(drawableArr.length < 1 ? false : true, C0201.m82(37646));
        this.i = drawableArr;
        this.o = new int[drawableArr.length];
        this.p = new int[drawableArr.length];
        this.q = 255;
        this.u = new boolean[drawableArr.length];
        this.v = 0;
        this.j = z;
        this.k = z ? 255 : i2;
        q();
    }
}
