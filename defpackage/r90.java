package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: r90  reason: default package */
/* compiled from: RoundedColorDrawable */
public class r90 extends Drawable implements p90 {
    private final float[] a = new float[8];
    public final float[] b = new float[8];
    public float[] c;
    public final Paint d = new Paint(1);
    private boolean e = false;
    private float f = 0.0f;
    private float g = 0.0f;
    private int h = 0;
    private boolean i = false;
    private boolean j = false;
    public final Path k = new Path();
    public final Path l = new Path();
    private int m = 0;
    private final RectF n = new RectF();
    private int o = 255;

    public r90(int i2) {
        g(i2);
    }

    @TargetApi(11)
    public static r90 b(ColorDrawable colorDrawable) {
        return new r90(colorDrawable.getColor());
    }

    private void h() {
        float[] fArr;
        float[] fArr2;
        this.k.reset();
        this.l.reset();
        this.n.set(getBounds());
        RectF rectF = this.n;
        float f2 = this.f;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i2 = 0;
        if (this.e) {
            this.l.addCircle(this.n.centerX(), this.n.centerY(), Math.min(this.n.width(), this.n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i3 = 0;
            while (true) {
                fArr2 = this.b;
                if (i3 >= fArr2.length) {
                    break;
                }
                fArr2[i3] = (this.a[i3] + this.g) - (this.f / 2.0f);
                i3++;
            }
            this.l.addRoundRect(this.n, fArr2, Path.Direction.CW);
        }
        RectF rectF2 = this.n;
        float f3 = this.f;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.g + (this.i ? this.f : 0.0f);
        this.n.inset(f4, f4);
        if (this.e) {
            this.k.addCircle(this.n.centerX(), this.n.centerY(), Math.min(this.n.width(), this.n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.i) {
            if (this.c == null) {
                this.c = new float[8];
            }
            while (true) {
                fArr = this.c;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = this.a[i2] - this.f;
                i2++;
            }
            this.k.addRoundRect(this.n, fArr, Path.Direction.CW);
        } else {
            this.k.addRoundRect(this.n, this.a, Path.Direction.CW);
        }
        float f5 = -f4;
        this.n.inset(f5, f5);
    }

    @Override // defpackage.p90
    public void a(int i2, float f2) {
        if (this.h != i2) {
            this.h = i2;
            invalidateSelf();
        }
        if (this.f != f2) {
            this.f = f2;
            h();
            invalidateSelf();
        }
    }

    @Override // defpackage.p90
    public void c(boolean z) {
        this.e = z;
        h();
        invalidateSelf();
    }

    public boolean d() {
        return this.j;
    }

    public void draw(Canvas canvas) {
        this.d.setColor(j90.c(this.m, this.o));
        this.d.setStyle(Paint.Style.FILL);
        this.d.setFilterBitmap(d());
        canvas.drawPath(this.k, this.d);
        if (this.f != 0.0f) {
            this.d.setColor(j90.c(this.h, this.o));
            this.d.setStyle(Paint.Style.STROKE);
            this.d.setStrokeWidth(this.f);
            canvas.drawPath(this.l, this.d);
        }
    }

    @Override // defpackage.p90
    public void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.p90
    public void f(boolean z) {
        if (this.i != z) {
            this.i = z;
            h();
            invalidateSelf();
        }
    }

    public void g(int i2) {
        if (this.m != i2) {
            this.m = i2;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.o;
    }

    public int getOpacity() {
        return j90.b(j90.c(this.m, this.o));
    }

    @Override // defpackage.p90
    public void i(float f2) {
        if (this.g != f2) {
            this.g = f2;
            h();
            invalidateSelf();
        }
    }

    @Override // defpackage.p90
    public void j(float f2) {
        z50.c(f2 >= 0.0f, C0201.m82(28299));
        Arrays.fill(this.a, f2);
        h();
        invalidateSelf();
    }

    @Override // defpackage.p90
    public void m(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.a, 0.0f);
        } else {
            z50.c(fArr.length == 8, C0201.m82(28300));
            System.arraycopy(fArr, 0, this.a, 0, 8);
        }
        h();
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h();
    }

    public void setAlpha(int i2) {
        if (i2 != this.o) {
            this.o = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
