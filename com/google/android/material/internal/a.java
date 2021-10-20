package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import defpackage.bx1;

/* compiled from: CollapsingTextHelper */
public final class a {
    private static final boolean V = (Build.VERSION.SDK_INT < 18);
    private static final Paint W = null;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private final TextPaint J;
    private final TextPaint K;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;
    private final View a;
    private boolean b;
    private float c;
    private final Rect d;
    private final Rect e;
    private final RectF f;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private bx1 v;
    private bx1 w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* compiled from: CollapsingTextHelper */
    class C0070a implements bx1.a {
        public C0070a() {
        }

        @Override // defpackage.bx1.a
        public void a(Typeface typeface) {
            a.this.I(typeface);
        }
    }

    static {
        Paint paint = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            W.setColor(-65281);
        }
    }

    public a(View view) {
        this.a = view;
        this.J = new TextPaint(129);
        this.K = new TextPaint(this.J);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    private static boolean C(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private boolean J(Typeface typeface) {
        bx1 bx1 = this.w;
        if (bx1 != null) {
            bx1.c();
        }
        if (this.s == typeface) {
            return false;
        }
        this.s = typeface;
        return true;
    }

    private boolean P(Typeface typeface) {
        bx1 bx1 = this.v;
        if (bx1 != null) {
            bx1.c();
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        return true;
    }

    private void R(float f2) {
        g(f2);
        boolean z2 = V && this.F != 1.0f;
        this.A = z2;
        if (z2) {
            j();
        }
        k3.Z(this.a);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private void b() {
        float f2 = this.G;
        g(this.j);
        CharSequence charSequence = this.y;
        float f3 = 0.0f;
        float measureText = charSequence != null ? this.J.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int b2 = u2.b(this.h, this.z ? 1 : 0);
        int i2 = b2 & 112;
        if (i2 == 48) {
            this.n = ((float) this.e.top) - this.J.ascent();
        } else if (i2 != 80) {
            this.n = ((float) this.e.centerY()) + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.n = (float) this.e.bottom;
        }
        int i3 = b2 & 8388615;
        if (i3 == 1) {
            this.p = ((float) this.e.centerX()) - (measureText / 2.0f);
        } else if (i3 != 5) {
            this.p = (float) this.e.left;
        } else {
            this.p = ((float) this.e.right) - measureText;
        }
        g(this.i);
        CharSequence charSequence2 = this.y;
        if (charSequence2 != null) {
            f3 = this.J.measureText(charSequence2, 0, charSequence2.length());
        }
        int b3 = u2.b(this.g, this.z ? 1 : 0);
        int i4 = b3 & 112;
        if (i4 == 48) {
            this.m = ((float) this.d.top) - this.J.ascent();
        } else if (i4 != 80) {
            this.m = ((float) this.d.centerY()) + (((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent());
        } else {
            this.m = (float) this.d.bottom;
        }
        int i5 = b3 & 8388615;
        if (i5 == 1) {
            this.o = ((float) this.d.centerX()) - (f3 / 2.0f);
        } else if (i5 != 5) {
            this.o = (float) this.d.left;
        } else {
            this.o = ((float) this.d.right) - f3;
        }
        h();
        R(f2);
    }

    private void d() {
        f(this.c);
    }

    private boolean e(CharSequence charSequence) {
        boolean z2 = true;
        if (k3.w(this.a) != 1) {
            z2 = false;
        }
        return (z2 ? p2.d : p2.c).a(charSequence, 0, charSequence.length());
    }

    private void f(float f2) {
        w(f2);
        this.q = z(this.o, this.p, f2, this.L);
        this.r = z(this.m, this.n, f2, this.L);
        R(z(this.i, this.j, f2, this.M));
        if (this.l != this.k) {
            this.J.setColor(a(r(), p(), f2));
        } else {
            this.J.setColor(p());
        }
        this.J.setShadowLayer(z(this.R, this.N, f2, null), z(this.S, this.O, f2, null), z(this.T, this.P, f2, null), a(q(this.U), q(this.Q), f2));
        k3.Z(this.a);
    }

    private void g(float f2) {
        float f3;
        boolean z2;
        boolean z3;
        if (this.x != null) {
            float width = (float) this.e.width();
            float width2 = (float) this.d.width();
            boolean z4 = true;
            if (x(f2, this.j)) {
                f3 = this.j;
                this.F = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x(f2, this.i)) {
                    this.F = 1.0f;
                } else {
                    this.F = f2 / this.i;
                }
                float f5 = this.j / this.i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
                z2 = z3;
            }
            if (width > 0.0f) {
                z2 = this.G != f3 || this.I || z2;
                this.G = f3;
                this.I = false;
            }
            if (this.y == null || z2) {
                this.J.setTextSize(this.G);
                this.J.setTypeface(this.u);
                TextPaint textPaint = this.J;
                if (this.F == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.x, this.J, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.y)) {
                    this.y = ellipsize;
                    this.z = e(ellipsize);
                }
            }
        }
    }

    private void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private void j() {
        if (this.B == null && !this.d.isEmpty() && !TextUtils.isEmpty(this.y)) {
            f(0.0f);
            this.D = this.J.ascent();
            this.E = this.J.descent();
            TextPaint textPaint = this.J;
            CharSequence charSequence = this.y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.E - this.D);
            if (round > 0 && round2 > 0) {
                this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.B);
                CharSequence charSequence2 = this.y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.J.descent(), this.J);
                if (this.C == null) {
                    this.C = new Paint(3);
                }
            }
        }
    }

    private float n(int i2, int i3) {
        if (i3 == 17 || (i3 & 7) == 1) {
            return (((float) i2) / 2.0f) - (c() / 2.0f);
        }
        return ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.z ? (float) this.e.left : ((float) this.e.right) - c() : this.z ? ((float) this.e.right) - c() : (float) this.e.left;
    }

    private float o(RectF rectF, int i2, int i3) {
        if (i3 == 17 || (i3 & 7) == 1) {
            return (((float) i2) / 2.0f) + (c() / 2.0f);
        }
        return ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.z ? rectF.left + c() : (float) this.e.right : this.z ? (float) this.e.right : rectF.left + c();
    }

    private int q(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int r() {
        return q(this.k);
    }

    private void u(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private void v(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    private void w(float f2) {
        this.f.left = z((float) this.d.left, (float) this.e.left, f2, this.L);
        this.f.top = z(this.m, this.n, f2, this.L);
        this.f.right = z((float) this.d.right, (float) this.e.right, f2, this.L);
        this.f.bottom = z((float) this.d.bottom, (float) this.e.bottom, f2, this.L);
    }

    private static boolean x(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static float z(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return yv1.a(f2, f3, f4);
    }

    public void A() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void B() {
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            b();
            d();
        }
    }

    public void D(int i2, int i3, int i4, int i5) {
        if (!C(this.e, i2, i3, i4, i5)) {
            this.e.set(i2, i3, i4, i5);
            this.I = true;
            A();
        }
    }

    public void E(Rect rect) {
        D(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void F(int i2) {
        ex1 ex1 = new ex1(this.a.getContext(), i2);
        ColorStateList colorStateList = ex1.b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f2 = ex1.a;
        if (f2 != 0.0f) {
            this.j = f2;
        }
        ColorStateList colorStateList2 = ex1.h;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = ex1.i;
        this.P = ex1.j;
        this.N = ex1.k;
        bx1 bx1 = this.w;
        if (bx1 != null) {
            bx1.c();
        }
        this.w = new bx1(new C0070a(), ex1.e());
        ex1.h(this.a.getContext(), this.w);
        B();
    }

    public void G(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            B();
        }
    }

    public void H(int i2) {
        if ((8388615 & i2) == 0) {
            i2 |= 8388611;
        }
        if (this.h != i2) {
            this.h = i2;
            B();
        }
    }

    public void I(Typeface typeface) {
        if (J(typeface)) {
            B();
        }
    }

    public void K(int i2, int i3, int i4, int i5) {
        if (!C(this.d, i2, i3, i4, i5)) {
            this.d.set(i2, i3, i4, i5);
            this.I = true;
            A();
        }
    }

    public void L(Rect rect) {
        K(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void M(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            B();
        }
    }

    public void N(int i2) {
        if ((8388615 & i2) == 0) {
            i2 |= 8388611;
        }
        if (this.g != i2) {
            this.g = i2;
            B();
        }
    }

    public void O(float f2) {
        if (this.i != f2) {
            this.i = f2;
            B();
        }
    }

    public void Q(float f2) {
        float a2 = a2.a(f2, 0.0f, 1.0f);
        if (a2 != this.c) {
            this.c = a2;
            d();
        }
    }

    public void S(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        B();
    }

    public final boolean T(int[] iArr) {
        this.H = iArr;
        if (!y()) {
            return false;
        }
        B();
        return true;
    }

    public void U(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            h();
            B();
        }
    }

    public void V(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        B();
    }

    public void W(Typeface typeface) {
        boolean J2 = J(typeface);
        boolean P2 = P(typeface);
        if (J2 || P2) {
            B();
        }
    }

    public float c() {
        if (this.x == null) {
            return 0.0f;
        }
        u(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void i(Canvas canvas) {
        float f2;
        int save = canvas.save();
        if (this.y != null && this.b) {
            float f3 = this.q;
            float f4 = this.r;
            boolean z2 = this.A && this.B != null;
            if (z2) {
                f2 = this.D * this.F;
            } else {
                f2 = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z2) {
                f4 += f2;
            }
            float f5 = this.F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f3, f4);
            }
            if (z2) {
                canvas.drawBitmap(this.B, f3, f4, this.C);
            } else {
                CharSequence charSequence = this.y;
                canvas.drawText(charSequence, 0, charSequence.length(), f3, f4, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    public void k(RectF rectF, int i2, int i3) {
        this.z = e(this.x);
        rectF.left = n(i2, i3);
        rectF.top = (float) this.e.top;
        rectF.right = o(rectF, i2, i3);
        rectF.bottom = ((float) this.e.top) + m();
    }

    public ColorStateList l() {
        return this.l;
    }

    public float m() {
        u(this.K);
        return -this.K.ascent();
    }

    public int p() {
        return q(this.l);
    }

    public float s() {
        v(this.K);
        return -this.K.ascent();
    }

    public float t() {
        return this.c;
    }

    public final boolean y() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }
}
