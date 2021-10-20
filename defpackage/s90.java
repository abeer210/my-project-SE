package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: s90  reason: default package */
/* compiled from: RoundedCornersDrawable */
public class s90 extends l90 implements p90 {
    public b e = b.OVERLAY_COLOR;
    private final RectF f = new RectF();
    private RectF g;
    private Matrix h;
    private final float[] i = new float[8];
    public final float[] j = new float[8];
    public final Paint k = new Paint(1);
    private boolean l = false;
    private float m = 0.0f;
    private int n = 0;
    private int o = 0;
    private float p = 0.0f;
    private boolean q = false;
    private boolean u = false;
    private final Path v = new Path();
    private final Path w = new Path();
    private final RectF x = new RectF();

    /* renamed from: s90$a */
    /* compiled from: RoundedCornersDrawable */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            iArr[b.CLIPPING.ordinal()] = 1;
            a[b.OVERLAY_COLOR.ordinal()] = 2;
        }
    }

    /* renamed from: s90$b */
    /* compiled from: RoundedCornersDrawable */
    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s90(Drawable drawable) {
        super(drawable);
        z50.g(drawable);
    }

    private void t() {
        float[] fArr;
        this.v.reset();
        this.w.reset();
        this.x.set(getBounds());
        RectF rectF = this.x;
        float f2 = this.p;
        rectF.inset(f2, f2);
        this.v.addRect(this.x, Path.Direction.CW);
        if (this.l) {
            this.v.addCircle(this.x.centerX(), this.x.centerY(), Math.min(this.x.width(), this.x.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.v.addRoundRect(this.x, this.i, Path.Direction.CW);
        }
        RectF rectF2 = this.x;
        float f3 = this.p;
        rectF2.inset(-f3, -f3);
        RectF rectF3 = this.x;
        float f4 = this.m;
        rectF3.inset(f4 / 2.0f, f4 / 2.0f);
        if (this.l) {
            this.w.addCircle(this.x.centerX(), this.x.centerY(), Math.min(this.x.width(), this.x.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.j;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.i[i2] + this.p) - (this.m / 2.0f);
                i2++;
            }
            this.w.addRoundRect(this.x, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.x;
        float f5 = this.m;
        rectF4.inset((-f5) / 2.0f, (-f5) / 2.0f);
    }

    @Override // defpackage.p90
    public void a(int i2, float f2) {
        this.n = i2;
        this.m = f2;
        t();
        invalidateSelf();
    }

    @Override // defpackage.p90
    public void c(boolean z) {
        this.l = z;
        t();
        invalidateSelf();
    }

    @Override // defpackage.l90
    public void draw(Canvas canvas) {
        this.f.set(getBounds());
        int i2 = a.a[this.e.ordinal()];
        if (i2 == 1) {
            int save = canvas.save();
            this.v.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.v);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i2 == 2) {
            if (this.q) {
                RectF rectF = this.g;
                if (rectF == null) {
                    this.g = new RectF(this.f);
                    this.h = new Matrix();
                } else {
                    rectF.set(this.f);
                }
                RectF rectF2 = this.g;
                float f2 = this.m;
                rectF2.inset(f2, f2);
                this.h.setRectToRect(this.f, this.g, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f);
                canvas.concat(this.h);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.k.setStyle(Paint.Style.FILL);
            this.k.setColor(this.o);
            this.k.setStrokeWidth(0.0f);
            this.k.setFilterBitmap(r());
            this.v.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.v, this.k);
            if (this.l) {
                float width = ((this.f.width() - this.f.height()) + this.m) / 2.0f;
                float height = ((this.f.height() - this.f.width()) + this.m) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f;
                    float f3 = rectF3.left;
                    canvas.drawRect(f3, rectF3.top, f3 + width, rectF3.bottom, this.k);
                    RectF rectF4 = this.f;
                    float f4 = rectF4.right;
                    canvas.drawRect(f4 - width, rectF4.top, f4, rectF4.bottom, this.k);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f;
                    float f5 = rectF5.left;
                    float f6 = rectF5.top;
                    canvas.drawRect(f5, f6, rectF5.right, f6 + height, this.k);
                    RectF rectF6 = this.f;
                    float f7 = rectF6.left;
                    float f8 = rectF6.bottom;
                    canvas.drawRect(f7, f8 - height, rectF6.right, f8, this.k);
                }
            }
        }
        if (this.n != 0) {
            this.k.setStyle(Paint.Style.STROKE);
            this.k.setColor(this.n);
            this.k.setStrokeWidth(this.m);
            this.v.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.w, this.k);
        }
    }

    @Override // defpackage.p90
    public void e(boolean z) {
        if (this.u != z) {
            this.u = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.p90
    public void f(boolean z) {
        this.q = z;
        t();
        invalidateSelf();
    }

    @Override // defpackage.p90
    public void i(float f2) {
        this.p = f2;
        t();
        invalidateSelf();
    }

    @Override // defpackage.p90
    public void j(float f2) {
        Arrays.fill(this.i, f2);
        t();
        invalidateSelf();
    }

    @Override // defpackage.p90
    public void m(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.i, 0.0f);
        } else {
            z50.c(fArr.length == 8, C0201.m82(15355));
            System.arraycopy(fArr, 0, this.i, 0, 8);
        }
        t();
        invalidateSelf();
    }

    @Override // defpackage.l90
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        t();
    }

    public boolean r() {
        return this.u;
    }

    public void s(int i2) {
        this.o = i2;
        invalidateSelf();
    }
}
