package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import vigqyno.C0201;

/* renamed from: q0  reason: default package */
/* compiled from: RoundRectDrawableWithShadow */
public class q0 extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    public static a r;
    private final int a;
    private Paint b;
    private Paint c;
    private Paint d;
    private final RectF e;
    private float f;
    private Path g;
    private float h;
    private float i;
    private float j;
    private ColorStateList k;
    private boolean l;
    private final int m;
    private final int n;
    private boolean o;
    private boolean p;

    /* renamed from: q0$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    private void a(Rect rect) {
        float f2 = this.h;
        float f3 = 1.5f * f2;
        this.e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        b();
    }

    private void b() {
        float f2 = this.f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.i;
        rectF2.inset(-f3, -f3);
        Path path = this.g;
        if (path == null) {
            this.g = new Path();
        } else {
            path.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f4 = this.f;
        float f5 = f4 / (this.i + f4);
        Paint paint = this.c;
        float f6 = this.f + this.i;
        int i2 = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.n}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.d;
        float f7 = this.f;
        float f8 = this.i;
        int i3 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.d.setAntiAlias(false);
    }

    public static float c(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = (double) f2;
        double d3 = (double) f3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        return (float) (d2 + ((1.0d - q) * d3));
    }

    public static float d(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        double d2 = (double) (f2 * 1.5f);
        double d3 = (double) f3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        return (float) (d2 + ((1.0d - q) * d3));
    }

    private void e(Canvas canvas) {
        float f2 = this.f;
        float f3 = (-f2) - this.i;
        float f4 = f2 + ((float) this.a) + (this.j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.e.width() - f5 > 0.0f;
        boolean z2 = this.e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.e.width() - f5, -this.f, this.d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.e.width() - f5, (-this.f) + this.i, this.d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.e.height() - f5, -this.f, this.d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.e.height() - f5, -this.f, this.d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        String r0 = C0201.m82(35520);
        if (f2 < 0.0f) {
            throw new IllegalArgumentException(C0201.m82(35522) + f2 + r0);
        } else if (f3 >= 0.0f) {
            float t = (float) t(f2);
            float t2 = (float) t(f3);
            if (t > t2) {
                if (!this.p) {
                    this.p = true;
                }
                t = t2;
            }
            if (this.j != t || this.h != t2) {
                this.j = t;
                this.h = t2;
                this.i = (float) ((int) ((t * 1.5f) + ((float) this.a) + 0.5f));
                this.l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(35521) + f3 + r0);
        }
    }

    private int t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            a(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.e, this.f, this.b);
    }

    public ColorStateList f() {
        return this.k;
    }

    public float g() {
        return this.f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) d(this.h, this.f, this.o));
        int ceil2 = (int) Math.ceil((double) c(this.h, this.f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f2 = this.h;
        return (Math.max(f2, this.f + ((float) this.a) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.h * 1.5f) + ((float) this.a)) * 2.0f);
    }

    public float k() {
        float f2 = this.h;
        return (Math.max(f2, this.f + ((float) this.a) + (f2 / 2.0f)) * 2.0f) + ((this.h + ((float) this.a)) * 2.0f);
    }

    public float l() {
        return this.j;
    }

    public void m(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f2) {
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (this.f != f3) {
                this.f = f3;
                this.l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(35523) + f2 + C0201.m82(35524));
    }

    public void q(float f2) {
        s(this.j, f2);
    }

    public void r(float f2) {
        s(f2, this.h);
    }

    public void setAlpha(int i2) {
        this.b.setAlpha(i2);
        this.c.setAlpha(i2);
        this.d.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
