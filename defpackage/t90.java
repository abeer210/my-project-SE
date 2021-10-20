package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: t90  reason: default package */
/* compiled from: RoundedDrawable */
public abstract class t90 extends Drawable implements p90, x90 {
    public final Matrix A = new Matrix();
    private float B = 0.0f;
    private boolean C = false;
    private boolean D = false;
    private boolean E = true;
    private y90 F;
    private final Drawable a;
    public boolean b = false;
    public boolean c = false;
    public float d = 0.0f;
    public final Path e = new Path();
    public boolean f = true;
    public int g = 0;
    public final Path h = new Path();
    private final float[] i = new float[8];
    public final float[] j = new float[8];
    public float[] k;
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final RectF n = new RectF();
    public final RectF o = new RectF();
    public RectF p;
    public final Matrix q = new Matrix();
    public final Matrix u = new Matrix();
    public final Matrix v = new Matrix();
    public final Matrix w = new Matrix();
    public final Matrix x = new Matrix();
    public Matrix y;
    public Matrix z;

    public t90(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.p90
    public void a(int i2, float f2) {
        if (this.g != i2 || this.d != f2) {
            this.g = i2;
            this.d = f2;
            this.E = true;
            invalidateSelf();
        }
    }

    @Override // defpackage.x90
    public void b(y90 y90) {
        this.F = y90;
    }

    @Override // defpackage.p90
    public void c(boolean z2) {
        this.b = z2;
        this.E = true;
        invalidateSelf();
    }

    public void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public boolean d() {
        return this.D;
    }

    public void draw(Canvas canvas) {
        if (oh0.d()) {
            oh0.a(C0201.m82(13144));
        }
        this.a.draw(canvas);
        if (oh0.d()) {
            oh0.b();
        }
    }

    @Override // defpackage.p90
    public void e(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            invalidateSelf();
        }
    }

    @Override // defpackage.p90
    public void f(boolean z2) {
        if (this.C != z2) {
            this.C = z2;
            this.E = true;
            invalidateSelf();
        }
    }

    public boolean g() {
        return this.b || this.c || this.d > 0.0f;
    }

    public int getAlpha() {
        return this.a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public void h() {
        float[] fArr;
        if (this.E) {
            this.h.reset();
            RectF rectF = this.l;
            float f2 = this.d;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.b) {
                this.h.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i2 = 0;
                while (true) {
                    fArr = this.j;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    fArr[i2] = (this.i[i2] + this.B) - (this.d / 2.0f);
                    i2++;
                }
                this.h.addRoundRect(this.l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.l;
            float f3 = this.d;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.e.reset();
            float f4 = this.B + (this.C ? this.d : 0.0f);
            this.l.inset(f4, f4);
            if (this.b) {
                this.e.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.C) {
                if (this.k == null) {
                    this.k = new float[8];
                }
                for (int i3 = 0; i3 < this.j.length; i3++) {
                    this.k[i3] = this.i[i3] - this.d;
                }
                this.e.addRoundRect(this.l, this.k, Path.Direction.CW);
            } else {
                this.e.addRoundRect(this.l, this.i, Path.Direction.CW);
            }
            float f5 = -f4;
            this.l.inset(f5, f5);
            this.e.setFillType(Path.FillType.WINDING);
            this.E = false;
        }
    }

    @Override // defpackage.p90
    public void i(float f2) {
        if (this.B != f2) {
            this.B = f2;
            this.E = true;
            invalidateSelf();
        }
    }

    @Override // defpackage.p90
    public void j(float f2) {
        boolean z2 = false;
        z50.i(f2 >= 0.0f);
        Arrays.fill(this.i, f2);
        if (f2 != 0.0f) {
            z2 = true;
        }
        this.c = z2;
        this.E = true;
        invalidateSelf();
    }

    public void k() {
        Matrix matrix;
        y90 y90 = this.F;
        if (y90 != null) {
            y90.d(this.v);
            this.F.h(this.l);
        } else {
            this.v.reset();
            this.l.set(getBounds());
        }
        this.n.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.o.set(this.a.getBounds());
        this.q.setRectToRect(this.n, this.o, Matrix.ScaleToFit.FILL);
        if (this.C) {
            RectF rectF = this.p;
            if (rectF == null) {
                this.p = new RectF(this.l);
            } else {
                rectF.set(this.l);
            }
            RectF rectF2 = this.p;
            float f2 = this.d;
            rectF2.inset(f2, f2);
            if (this.y == null) {
                this.y = new Matrix();
            }
            this.y.setRectToRect(this.l, this.p, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.y;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.v.equals(this.w) || !this.q.equals(this.u) || ((matrix = this.y) != null && !matrix.equals(this.z))) {
            this.f = true;
            this.v.invert(this.x);
            this.A.set(this.v);
            if (this.C) {
                this.A.postConcat(this.y);
            }
            this.A.preConcat(this.q);
            this.w.set(this.v);
            this.u.set(this.q);
            if (this.C) {
                Matrix matrix3 = this.z;
                if (matrix3 == null) {
                    this.z = new Matrix(this.y);
                } else {
                    matrix3.set(this.y);
                }
            } else {
                Matrix matrix4 = this.z;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.l.equals(this.m)) {
            this.E = true;
            this.m.set(this.l);
        }
    }

    @Override // defpackage.p90
    public void m(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.i, 0.0f);
            this.c = false;
        } else {
            z50.c(fArr.length == 8, C0201.m82(13145));
            System.arraycopy(fArr, 0, this.i, 0, 8);
            this.c = false;
            for (int i2 = 0; i2 < 8; i2++) {
                this.c |= fArr[i2] > 0.0f;
            }
        }
        this.E = true;
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    public void setAlpha(int i2) {
        this.a.setAlpha(i2);
    }

    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        this.a.setColorFilter(i2, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
