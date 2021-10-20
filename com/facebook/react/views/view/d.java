package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.i0;
import com.facebook.yoga.g;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: ReactViewBackgroundDrawable */
public class d extends Drawable {
    private i0 a;
    private i0 b;
    private i0 c;
    private c d;
    private PathEffect e;
    private Path f;
    private Path g;
    private Path h;
    private Path i;
    private Path j;
    private RectF k;
    private RectF l;
    private RectF m;
    private RectF n;
    private PointF o;
    private PointF p;
    private PointF q;
    private PointF r;
    private boolean s = false;
    private float t = Float.NaN;
    private final Paint u = new Paint(1);
    private int v = 0;
    private int w = 255;
    private float[] x;
    private final Context y;
    private int z;

    /* access modifiers changed from: package-private */
    /* compiled from: ReactViewBackgroundDrawable */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            iArr[c.SOLID.ordinal()] = 1;
            a[c.DASHED.ordinal()] = 2;
            try {
                a[c.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: ReactViewBackgroundDrawable */
    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* access modifiers changed from: private */
    /* compiled from: ReactViewBackgroundDrawable */
    public enum c {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect b(c cVar, float f) {
            int i = a.a[cVar.ordinal()];
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            } else if (i != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
        }
    }

    public d(Context context) {
        this.y = context;
    }

    private void B() {
        if (this.s) {
            this.s = false;
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.g == null) {
                this.g = new Path();
            }
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.j == null) {
                this.j = new Path();
            }
            if (this.k == null) {
                this.k = new RectF();
            }
            if (this.l == null) {
                this.l = new RectF();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            this.f.reset();
            this.g.reset();
            this.h.reset();
            this.j.reset();
            this.k.set(getBounds());
            this.l.set(getBounds());
            this.m.set(getBounds());
            this.n.set(getBounds());
            RectF k2 = k();
            RectF rectF = this.k;
            rectF.top += k2.top;
            rectF.bottom -= k2.bottom;
            rectF.left += k2.left;
            rectF.right -= k2.right;
            RectF rectF2 = this.n;
            rectF2.top += k2.top * 0.5f;
            rectF2.bottom -= k2.bottom * 0.5f;
            rectF2.left += k2.left * 0.5f;
            rectF2.right -= k2.right * 0.5f;
            float m2 = m();
            float h2 = h(m2, b.TOP_LEFT);
            float h3 = h(m2, b.TOP_RIGHT);
            float h4 = h(m2, b.BOTTOM_LEFT);
            float h5 = h(m2, b.BOTTOM_RIGHT);
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z2 = o() == 1;
                float g2 = g(b.TOP_START);
                float g3 = g(b.TOP_END);
                float g4 = g(b.BOTTOM_START);
                float g5 = g(b.BOTTOM_END);
                if (com.facebook.react.modules.i18nmanager.a.d().b(this.y)) {
                    if (!g.a(g2)) {
                        h2 = g2;
                    }
                    if (!g.a(g3)) {
                        h3 = g3;
                    }
                    if (!g.a(g4)) {
                        h4 = g4;
                    }
                    if (!g.a(g5)) {
                        h5 = g5;
                    }
                    float f2 = z2 ? h3 : h2;
                    if (z2) {
                        h3 = h2;
                    }
                    float f3 = z2 ? h5 : h4;
                    if (z2) {
                        h5 = h4;
                    }
                    h4 = f3;
                    h2 = f2;
                } else {
                    float f4 = z2 ? g3 : g2;
                    if (!z2) {
                        g2 = g3;
                    }
                    float f5 = z2 ? g5 : g4;
                    if (!z2) {
                        g4 = g5;
                    }
                    if (!g.a(f4)) {
                        h2 = f4;
                    }
                    if (!g.a(g2)) {
                        h3 = g2;
                    }
                    if (!g.a(f5)) {
                        h4 = f5;
                    }
                    if (!g.a(g4)) {
                        h5 = g4;
                    }
                }
            }
            float max = Math.max(h2 - k2.left, 0.0f);
            float max2 = Math.max(h2 - k2.top, 0.0f);
            float max3 = Math.max(h3 - k2.right, 0.0f);
            float max4 = Math.max(h3 - k2.top, 0.0f);
            float max5 = Math.max(h5 - k2.right, 0.0f);
            float max6 = Math.max(h5 - k2.bottom, 0.0f);
            float max7 = Math.max(h4 - k2.left, 0.0f);
            float max8 = Math.max(h4 - k2.bottom, 0.0f);
            this.f.addRoundRect(this.k, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
            this.g.addRoundRect(this.l, new float[]{h2, h2, h3, h3, h5, h5, h4, h4}, Path.Direction.CW);
            i0 i0Var = this.a;
            float a2 = i0Var != null ? i0Var.a(8) / 2.0f : 0.0f;
            float f6 = h2 + a2;
            float f7 = h3 + a2;
            float f8 = h5 + a2;
            float f9 = h4 + a2;
            this.h.addRoundRect(this.m, new float[]{f6, f6, f7, f7, f8, f8, f9, f9}, Path.Direction.CW);
            Path path = this.j;
            RectF rectF3 = this.n;
            float[] fArr = new float[8];
            float f10 = k2.left;
            fArr[0] = Math.max(h2 - (f10 * 0.5f), f10 > 0.0f ? h2 / f10 : 0.0f);
            float f11 = k2.top;
            fArr[1] = Math.max(h2 - (f11 * 0.5f), f11 > 0.0f ? h2 / f11 : 0.0f);
            float f12 = k2.right;
            fArr[2] = Math.max(h3 - (f12 * 0.5f), f12 > 0.0f ? h3 / f12 : 0.0f);
            float f13 = k2.top;
            fArr[3] = Math.max(h3 - (f13 * 0.5f), f13 > 0.0f ? h3 / f13 : 0.0f);
            float f14 = k2.right;
            fArr[4] = Math.max(h5 - (f14 * 0.5f), f14 > 0.0f ? h5 / f14 : 0.0f);
            float f15 = k2.bottom;
            fArr[5] = Math.max(h5 - (f15 * 0.5f), f15 > 0.0f ? h5 / f15 : 0.0f);
            float f16 = k2.left;
            fArr[6] = Math.max(h4 - (f16 * 0.5f), f16 > 0.0f ? h4 / f16 : 0.0f);
            float f17 = k2.bottom;
            fArr[7] = Math.max(h4 - (f17 * 0.5f), f17 > 0.0f ? h4 / f17 : 0.0f);
            path.addRoundRect(rectF3, fArr, Path.Direction.CW);
            if (this.o == null) {
                this.o = new PointF();
            }
            PointF pointF = this.o;
            RectF rectF4 = this.k;
            float f18 = rectF4.left;
            pointF.x = f18;
            float f19 = rectF4.top;
            pointF.y = f19;
            RectF rectF5 = this.l;
            l((double) f18, (double) f19, (double) ((max * 2.0f) + f18), (double) ((max2 * 2.0f) + f19), (double) rectF5.left, (double) rectF5.top, (double) f18, (double) f19, pointF);
            if (this.r == null) {
                this.r = new PointF();
            }
            PointF pointF2 = this.r;
            RectF rectF6 = this.k;
            float f20 = rectF6.left;
            pointF2.x = f20;
            float f21 = rectF6.bottom;
            pointF2.y = f21;
            RectF rectF7 = this.l;
            l((double) f20, (double) (f21 - (max8 * 2.0f)), (double) ((max7 * 2.0f) + f20), (double) f21, (double) rectF7.left, (double) rectF7.bottom, (double) f20, (double) f21, pointF2);
            if (this.p == null) {
                this.p = new PointF();
            }
            PointF pointF3 = this.p;
            RectF rectF8 = this.k;
            float f22 = rectF8.right;
            pointF3.x = f22;
            float f23 = rectF8.top;
            pointF3.y = f23;
            RectF rectF9 = this.l;
            l((double) (f22 - (max3 * 2.0f)), (double) f23, (double) f22, (double) ((max4 * 2.0f) + f23), (double) rectF9.right, (double) rectF9.top, (double) f22, (double) f23, pointF3);
            if (this.q == null) {
                this.q = new PointF();
            }
            PointF pointF4 = this.q;
            RectF rectF10 = this.k;
            float f24 = rectF10.right;
            pointF4.x = f24;
            float f25 = rectF10.bottom;
            pointF4.y = f25;
            RectF rectF11 = this.l;
            l((double) (f24 - (max5 * 2.0f)), (double) (f25 - (2.0f * max6)), (double) f24, (double) f25, (double) rectF11.right, (double) rectF11.bottom, (double) f24, (double) f25, pointF4);
        }
    }

    private void C() {
        c cVar = this.d;
        PathEffect b2 = cVar != null ? c.b(cVar, n()) : null;
        this.e = b2;
        this.u.setPathEffect(b2);
    }

    private static int a(float f2, float f3) {
        return ((((int) f2) << 24) & -16777216) | (((int) f3) & 16777215);
    }

    private void b(Canvas canvas, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (i2 != 0) {
            if (this.i == null) {
                this.i = new Path();
            }
            this.u.setColor(i2);
            this.i.reset();
            this.i.moveTo(f2, f3);
            this.i.lineTo(f4, f5);
            this.i.lineTo(f6, f7);
            this.i.lineTo(f8, f9);
            this.i.lineTo(f2, f3);
            canvas.drawPath(this.i, this.u);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    private void c(Canvas canvas) {
        int i2;
        int i3;
        int e2;
        int i4;
        d dVar;
        this.u.setStyle(Paint.Style.FILL);
        int b2 = a.b(this.v, this.w);
        if (Color.alpha(b2) != 0) {
            this.u.setColor(b2);
            canvas.drawRect(getBounds(), this.u);
        }
        RectF k2 = k();
        int round = Math.round(k2.left);
        int round2 = Math.round(k2.top);
        int round3 = Math.round(k2.right);
        int round4 = Math.round(k2.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int f2 = f(0);
            int f3 = f(1);
            int f4 = f(2);
            int f5 = f(3);
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z2 = o() == 1;
                int f6 = f(4);
                int f7 = f(5);
                if (com.facebook.react.modules.i18nmanager.a.d().b(this.y)) {
                    if (q(4)) {
                        f2 = f6;
                    }
                    if (q(5)) {
                        f4 = f7;
                    }
                    int i5 = z2 ? f4 : f2;
                    if (!z2) {
                        f2 = f4;
                    }
                    i2 = f2;
                    i3 = i5;
                } else {
                    int i6 = z2 ? f7 : f6;
                    if (!z2) {
                        f6 = f7;
                    }
                    boolean q2 = q(4);
                    boolean q3 = q(5);
                    boolean z3 = z2 ? q3 : q2;
                    if (!z2) {
                        q2 = q3;
                    }
                    if (z3) {
                        f2 = i6;
                    }
                    if (q2) {
                        i3 = f2;
                        i2 = f6;
                    }
                }
                int i7 = bounds.left;
                int i8 = bounds.top;
                e2 = e(round, round2, round3, round4, i3, f3, i2, f5);
                if (e2 != 0) {
                    this.u.setAntiAlias(false);
                    int width = bounds.width();
                    int height = bounds.height();
                    if (round > 0) {
                        float f8 = (float) i7;
                        float f9 = (float) i8;
                        float f10 = (float) (i7 + round);
                        float f11 = (float) (i8 + round2);
                        int i9 = i8 + height;
                        i4 = i8;
                        b(canvas, i3, f8, f9, f10, f11, f10, (float) (i9 - round4), f8, (float) i9);
                    } else {
                        i4 = i8;
                    }
                    if (round2 > 0) {
                        float f12 = (float) i7;
                        float f13 = (float) i4;
                        float f14 = (float) (i7 + round);
                        float f15 = (float) (i4 + round2);
                        int i10 = i7 + width;
                        b(canvas, f3, f12, f13, f14, f15, (float) (i10 - round3), f15, (float) i10, f13);
                    }
                    if (round3 > 0) {
                        int i11 = i7 + width;
                        float f16 = (float) i11;
                        int i12 = i4 + height;
                        float f17 = (float) (i11 - round3);
                        b(canvas, i2, f16, (float) i4, f16, (float) i12, f17, (float) (i12 - round4), f17, (float) (i4 + round2));
                    }
                    if (round4 > 0) {
                        float f18 = (float) i7;
                        int i13 = i4 + height;
                        float f19 = (float) i13;
                        int i14 = i7 + width;
                        float f20 = (float) (i13 - round4);
                        dVar = this;
                        dVar.b(canvas, f5, f18, f19, (float) i14, f19, (float) (i14 - round3), f20, (float) (i7 + round), f20);
                    } else {
                        dVar = this;
                    }
                    dVar.u.setAntiAlias(true);
                    return;
                } else if (Color.alpha(e2) != 0) {
                    int i15 = bounds.right;
                    int i16 = bounds.bottom;
                    this.u.setColor(e2);
                    if (round > 0) {
                        canvas.drawRect((float) i7, (float) i8, (float) (i7 + round), (float) (i16 - round4), this.u);
                    }
                    if (round2 > 0) {
                        canvas.drawRect((float) (i7 + round), (float) i8, (float) i15, (float) (i8 + round2), this.u);
                    }
                    if (round3 > 0) {
                        canvas.drawRect((float) (i15 - round3), (float) (i8 + round2), (float) i15, (float) i16, this.u);
                    }
                    if (round4 > 0) {
                        canvas.drawRect((float) i7, (float) (i16 - round4), (float) (i15 - round3), (float) i16, this.u);
                    }
                }
            }
            i3 = f2;
            i2 = f4;
            int i72 = bounds.left;
            int i82 = bounds.top;
            e2 = e(round, round2, round3, round4, i3, f3, i2, f5);
            if (e2 != 0) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b1  */
    private void d(Canvas canvas) {
        int i2;
        int i3;
        float f2;
        float f3;
        float f4;
        float f5;
        B();
        canvas.save();
        int b2 = a.b(this.v, this.w);
        if (Color.alpha(b2) != 0) {
            this.u.setColor(b2);
            this.u.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f, this.u);
        }
        RectF k2 = k();
        boolean z2 = false;
        int f6 = f(0);
        int f7 = f(1);
        int f8 = f(2);
        int f9 = f(3);
        if (k2.top > 0.0f || k2.bottom > 0.0f || k2.left > 0.0f || k2.right > 0.0f) {
            float n2 = n();
            int f10 = f(8);
            if (k2.top != n2 || k2.bottom != n2 || k2.left != n2 || k2.right != n2 || f6 != f10 || f7 != f10 || f8 != f10 || f9 != f10) {
                this.u.setStyle(Paint.Style.FILL);
                canvas.clipPath(this.g, Region.Op.INTERSECT);
                canvas.clipPath(this.f, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT >= 17) {
                    if (o() == 1) {
                        z2 = true;
                    }
                    int f11 = f(4);
                    int f12 = f(5);
                    if (com.facebook.react.modules.i18nmanager.a.d().b(this.y)) {
                        if (q(4)) {
                            f6 = f11;
                        }
                        if (q(5)) {
                            f8 = f12;
                        }
                        i3 = z2 ? f8 : f6;
                        if (!z2) {
                            f6 = f8;
                        }
                        i2 = f6;
                    } else {
                        int i4 = z2 ? f12 : f11;
                        if (!z2) {
                            f11 = f12;
                        }
                        boolean q2 = q(4);
                        boolean q3 = q(5);
                        boolean z3 = z2 ? q3 : q2;
                        if (!z2) {
                            q2 = q3;
                        }
                        if (z3) {
                            f6 = i4;
                        }
                        if (q2) {
                            i3 = f6;
                            i2 = f11;
                        }
                    }
                    RectF rectF = this.l;
                    float f13 = rectF.left;
                    float f14 = rectF.right;
                    float f15 = rectF.top;
                    float f16 = rectF.bottom;
                    if (k2.left <= 0.0f) {
                        PointF pointF = this.o;
                        float f17 = pointF.x;
                        float f18 = pointF.y;
                        PointF pointF2 = this.r;
                        f3 = f16;
                        f4 = f15;
                        f5 = f14;
                        f2 = f13;
                        b(canvas, i3, f13, f15, f17, f18, pointF2.x, pointF2.y, f13, f3);
                    } else {
                        f3 = f16;
                        f4 = f15;
                        f5 = f14;
                        f2 = f13;
                    }
                    if (k2.top > 0.0f) {
                        PointF pointF3 = this.o;
                        float f19 = pointF3.x;
                        float f20 = pointF3.y;
                        PointF pointF4 = this.p;
                        b(canvas, f7, f2, f4, f19, f20, pointF4.x, pointF4.y, f5, f4);
                    }
                    if (k2.right > 0.0f) {
                        PointF pointF5 = this.p;
                        float f21 = pointF5.x;
                        float f22 = pointF5.y;
                        PointF pointF6 = this.q;
                        b(canvas, i2, f5, f4, f21, f22, pointF6.x, pointF6.y, f5, f3);
                    }
                    if (k2.bottom > 0.0f) {
                        PointF pointF7 = this.r;
                        float f23 = pointF7.x;
                        float f24 = pointF7.y;
                        PointF pointF8 = this.q;
                        b(canvas, f9, f2, f3, f23, f24, pointF8.x, pointF8.y, f5, f3);
                    }
                }
                i3 = f6;
                i2 = f8;
                RectF rectF2 = this.l;
                float f132 = rectF2.left;
                float f142 = rectF2.right;
                float f152 = rectF2.top;
                float f162 = rectF2.bottom;
                if (k2.left <= 0.0f) {
                }
                if (k2.top > 0.0f) {
                }
                if (k2.right > 0.0f) {
                }
                if (k2.bottom > 0.0f) {
                }
            } else if (n2 > 0.0f) {
                this.u.setColor(a.b(f10, this.w));
                this.u.setStyle(Paint.Style.STROKE);
                this.u.setStrokeWidth(n2);
                canvas.drawPath(this.j, this.u);
            }
        }
        canvas.restore();
    }

    private static int e(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = -1;
        int i11 = (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1) & (i4 > 0 ? i8 : -1);
        if (i5 > 0) {
            i10 = i9;
        }
        int i12 = i10 & i11;
        if (i2 <= 0) {
            i6 = 0;
        }
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i6 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        int i14 = i13 | i8;
        if (i5 <= 0) {
            i9 = 0;
        }
        if (i12 == (i14 | i9)) {
            return i12;
        }
        return 0;
    }

    private int f(int i2) {
        i0 i0Var = this.b;
        float a2 = i0Var != null ? i0Var.a(i2) : 0.0f;
        i0 i0Var2 = this.c;
        return a(i0Var2 != null ? i0Var2.a(i2) : 255.0f, a2);
    }

    private static void l(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, PointF pointF) {
        double d10 = (d2 + d4) / 2.0d;
        double d11 = (d3 + d5) / 2.0d;
        double d12 = d6 - d10;
        double d13 = d7 - d11;
        double abs = Math.abs(d4 - d2) / 2.0d;
        double abs2 = Math.abs(d5 - d3) / 2.0d;
        double d14 = ((d9 - d11) - d13) / ((d8 - d10) - d12);
        double d15 = d13 - (d12 * d14);
        double d16 = abs2 * abs2;
        double d17 = abs * abs;
        double d18 = d16 + (d17 * d14 * d14);
        double d19 = abs * 2.0d * abs * d15 * d14;
        double d20 = (-(d17 * ((d15 * d15) - d16))) / d18;
        double d21 = d18 * 2.0d;
        double sqrt = ((-d19) / d21) - Math.sqrt(d20 + Math.pow(d19 / d21, 2.0d));
        double d22 = sqrt + d10;
        double d23 = (d14 * sqrt) + d15 + d11;
        if (!Double.isNaN(d22) && !Double.isNaN(d23)) {
            pointF.x = (float) d22;
            pointF.y = (float) d23;
        }
    }

    private boolean q(int i2) {
        i0 i0Var = this.b;
        float f2 = Float.NaN;
        float a2 = i0Var != null ? i0Var.a(i2) : Float.NaN;
        i0 i0Var2 = this.c;
        if (i0Var2 != null) {
            f2 = i0Var2.a(i2);
        }
        return !g.a(a2) && !g.a(f2);
    }

    private void s(int i2, float f2) {
        if (this.c == null) {
            this.c = new i0(255.0f);
        }
        if (!com.facebook.react.uimanager.d.a(this.c.b(i2), f2)) {
            this.c.d(i2, f2);
            invalidateSelf();
        }
    }

    private void u(int i2, float f2) {
        if (this.b == null) {
            this.b = new i0(0.0f);
        }
        if (!com.facebook.react.uimanager.d.a(this.b.b(i2), f2)) {
            this.b.d(i2, f2);
            invalidateSelf();
        }
    }

    public boolean A(int i2) {
        if (this.z == i2) {
            return false;
        }
        this.z = i2;
        return r(i2);
    }

    public void draw(Canvas canvas) {
        C();
        if (!p()) {
            c(canvas);
        } else {
            d(canvas);
        }
    }

    public float g(b bVar) {
        return h(Float.NaN, bVar);
    }

    public int getAlpha() {
        return this.w;
    }

    public int getOpacity() {
        return a.a(a.b(this.v, this.w));
    }

    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((g.a(this.t) || this.t <= 0.0f) && this.x == null) {
            outline.setRect(getBounds());
        } else {
            B();
            outline.setConvexPath(this.h);
        }
    }

    public float h(float f2, b bVar) {
        float[] fArr = this.x;
        if (fArr == null) {
            return f2;
        }
        float f3 = fArr[bVar.ordinal()];
        return g.a(f3) ? f2 : f3;
    }

    public float i(float f2, int i2) {
        i0 i0Var = this.a;
        if (i0Var == null) {
            return f2;
        }
        float b2 = i0Var.b(i2);
        return g.a(b2) ? f2 : b2;
    }

    public int j() {
        return this.v;
    }

    public RectF k() {
        float i2 = i(0.0f, 8);
        boolean z2 = true;
        float i3 = i(i2, 1);
        float i4 = i(i2, 3);
        float i5 = i(i2, 0);
        float i6 = i(i2, 2);
        if (Build.VERSION.SDK_INT >= 17 && this.a != null) {
            if (o() != 1) {
                z2 = false;
            }
            float b2 = this.a.b(4);
            float b3 = this.a.b(5);
            if (com.facebook.react.modules.i18nmanager.a.d().b(this.y)) {
                if (!g.a(b2)) {
                    i5 = b2;
                }
                if (!g.a(b3)) {
                    i6 = b3;
                }
                float f2 = z2 ? i6 : i5;
                if (z2) {
                    i6 = i5;
                }
                i5 = f2;
            } else {
                float f3 = z2 ? b3 : b2;
                if (!z2) {
                    b2 = b3;
                }
                if (!g.a(f3)) {
                    i5 = f3;
                }
                if (!g.a(b2)) {
                    i6 = b2;
                }
            }
        }
        return new RectF(i5, i3, i6, i4);
    }

    public float m() {
        if (g.a(this.t)) {
            return 0.0f;
        }
        return this.t;
    }

    public float n() {
        i0 i0Var = this.a;
        if (i0Var == null || g.a(i0Var.b(8))) {
            return 0.0f;
        }
        return this.a.b(8);
    }

    public int o() {
        return this.z;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
    }

    public boolean p() {
        if (!g.a(this.t) && this.t > 0.0f) {
            return true;
        }
        float[] fArr = this.x;
        if (fArr != null) {
            for (float f2 : fArr) {
                if (!g.a(f2) && f2 > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(int i2) {
        return false;
    }

    public void setAlpha(int i2) {
        if (i2 != this.w) {
            this.w = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t(int i2, float f2, float f3) {
        u(i2, f2);
        s(i2, f3);
    }

    public void v(String str) {
        c cVar;
        if (str == null) {
            cVar = null;
        } else {
            cVar = c.valueOf(str.toUpperCase(Locale.US));
        }
        if (this.d != cVar) {
            this.d = cVar;
            this.s = true;
            invalidateSelf();
        }
    }

    public void w(int i2, float f2) {
        if (this.a == null) {
            this.a = new i0();
        }
        if (!com.facebook.react.uimanager.d.a(this.a.b(i2), f2)) {
            this.a.d(i2, f2);
            if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8) {
                this.s = true;
            }
            invalidateSelf();
        }
    }

    public void x(int i2) {
        this.v = i2;
        invalidateSelf();
    }

    public void y(float f2) {
        if (!com.facebook.react.uimanager.d.a(this.t, f2)) {
            this.t = f2;
            this.s = true;
            invalidateSelf();
        }
    }

    public void z(float f2, int i2) {
        if (this.x == null) {
            float[] fArr = new float[8];
            this.x = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (!com.facebook.react.uimanager.d.a(this.x[i2], f2)) {
            this.x[i2] = f2;
            this.s = true;
            invalidateSelf();
        }
    }
}
