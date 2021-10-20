package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ChipDrawable */
public class a extends rx1 implements b, Drawable.Callback, f.b {
    private static final int[] J0 = {16842910};
    private static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private PorterDuff.Mode A0 = PorterDuff.Mode.SRC_IN;
    private ColorStateList B;
    private int[] B0;
    private float C;
    private boolean C0;
    private float D;
    private ColorStateList D0;
    private ColorStateList E;
    private WeakReference<AbstractC0066a> E0;
    private float F;
    private TextUtils.TruncateAt F0;
    private ColorStateList G;
    private boolean G0;
    private CharSequence H;
    private int H0;
    private boolean I;
    private boolean I0;
    private Drawable J;
    private ColorStateList K;
    private float L;
    private boolean M;
    private boolean N;
    private Drawable O;
    private Drawable P;
    private ColorStateList Q;
    private float R;
    private CharSequence S;
    private boolean T;
    private boolean U;
    private Drawable V;
    private fw1 W;
    private fw1 X;
    private float Y;
    private float Z;
    private float a0;
    private float b0;
    private float c0;
    private float d0;
    private float e0;
    private float f0;
    private final Context g0;
    private final Paint h0 = new Paint(1);
    private final Paint i0;
    private final Paint.FontMetrics j0 = new Paint.FontMetrics();
    private final RectF k0 = new RectF();
    private final PointF l0 = new PointF();
    private final Path m0 = new Path();
    private final f n0;
    private int o0;
    private int p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private boolean u0;
    private int v0;
    private int w0 = 255;
    private ColorFilter x0;
    private PorterDuffColorFilter y0;
    private ColorStateList z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* compiled from: ChipDrawable */
    public interface AbstractC0066a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = null;
        this.E0 = new WeakReference<>(null);
        L(context);
        this.g0 = context;
        f fVar = new f(this);
        this.n0 = fVar;
        this.H = C0201.m82(5866);
        fVar.e().density = context.getResources().getDisplayMetrics().density;
        this.i0 = null;
        if (0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(J0);
        d2(J0);
        this.G0 = true;
        if (ix1.a) {
            K0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        Paint paint = this.i0;
        if (paint != null) {
            paint.setColor(n1.o(-16777216, 127));
            canvas.drawRect(rect, this.i0);
            if (F2() || E2()) {
                i0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            if (this.H != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.i0);
            }
            if (G2()) {
                l0(rect, this.k0);
                canvas.drawRect(this.k0, this.i0);
            }
            this.i0.setColor(n1.o(-65536, 127));
            k0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
            this.i0.setColor(n1.o(-16711936, 127));
            m0(rect, this.k0);
            canvas.drawRect(this.k0, this.i0);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        if (this.H != null) {
            Paint.Align q02 = q0(rect, this.l0);
            o0(rect, this.k0);
            if (this.n0.d() != null) {
                this.n0.e().drawableState = getState();
                this.n0.j(this.g0);
            }
            this.n0.e().setTextAlign(q02);
            int i = 0;
            boolean z = Math.round(this.n0.f(b1().toString())) > Math.round(this.k0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.k0);
            }
            CharSequence charSequence = this.H;
            if (z && this.F0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.n0.e(), this.k0.width(), this.F0);
            }
            int length = charSequence.length();
            PointF pointF = this.l0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.n0.e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    private boolean E2() {
        return this.U && this.V != null && this.u0;
    }

    private boolean F2() {
        return this.I && this.J != null;
    }

    private boolean G2() {
        return this.N && this.O != null;
    }

    private void H2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void I2() {
        this.D0 = this.C0 ? ix1.d(this.G) : null;
    }

    @TargetApi(21)
    private void J2() {
        this.P = new RippleDrawable(ix1.d(Z0()), this.O, K0);
    }

    private void T1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    private ColorFilter f1() {
        ColorFilter colorFilter = this.x0;
        return colorFilter != null ? colorFilter : this.y0;
    }

    private void h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.O) {
                if (drawable.isStateful()) {
                    drawable.setState(S0());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.Q);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.J;
            if (drawable == drawable2 && this.M) {
                androidx.core.graphics.drawable.a.o(drawable2, this.K);
            }
        }
    }

    private static boolean h1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (F2() || E2()) {
            float f = this.Y + this.Z;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.L;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.L;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.L;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (G2()) {
            float f = this.f0 + this.e0 + this.R + this.d0 + this.c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (G2()) {
            float f = this.f0 + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.R;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.R;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.R;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private static boolean l1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (G2()) {
            float f = this.f0 + this.e0 + this.R + this.d0 + this.c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean m1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean n1(ex1 ex1) {
        ColorStateList colorStateList;
        return (ex1 == null || (colorStateList = ex1.b) == null || !colorStateList.isStateful()) ? false : true;
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.H != null) {
            float j02 = this.Y + j0() + this.b0;
            float n02 = this.f0 + n0() + this.c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + j02;
                rectF.right = ((float) rect.right) - n02;
            } else {
                rectF.left = ((float) rect.left) + n02;
                rectF.right = ((float) rect.right) - j02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void o1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = g.h(this.g0, attributeSet, xv1.Chip, i, i2, new int[0]);
        this.I0 = h.hasValue(xv1.Chip_shapeAppearance);
        T1(dx1.a(this.g0, h, xv1.Chip_chipSurfaceColor));
        x1(dx1.a(this.g0, h, xv1.Chip_chipBackgroundColor));
        L1(h.getDimension(xv1.Chip_chipMinHeight, 0.0f));
        if (h.hasValue(xv1.Chip_chipCornerRadius)) {
            z1(h.getDimension(xv1.Chip_chipCornerRadius, 0.0f));
        }
        P1(dx1.a(this.g0, h, xv1.Chip_chipStrokeColor));
        R1(h.getDimension(xv1.Chip_chipStrokeWidth, 0.0f));
        q2(dx1.a(this.g0, h, xv1.Chip_rippleColor));
        v2(h.getText(xv1.Chip_android_text));
        w2(dx1.f(this.g0, h, xv1.Chip_android_textAppearance));
        int i3 = h.getInt(xv1.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            i2(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            i2(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            i2(TextUtils.TruncateAt.END);
        }
        K1(h.getBoolean(xv1.Chip_chipIconVisible, false));
        String r10 = C0201.m82(5867);
        if (!(attributeSet == null || attributeSet.getAttributeValue(r10, C0201.m82(5868)) == null || attributeSet.getAttributeValue(r10, C0201.m82(5869)) != null)) {
            K1(h.getBoolean(xv1.Chip_chipIconEnabled, false));
        }
        D1(dx1.d(this.g0, h, xv1.Chip_chipIcon));
        if (h.hasValue(xv1.Chip_chipIconTint)) {
            H1(dx1.a(this.g0, h, xv1.Chip_chipIconTint));
        }
        F1(h.getDimension(xv1.Chip_chipIconSize, 0.0f));
        g2(h.getBoolean(xv1.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(r10, C0201.m82(5870)) == null || attributeSet.getAttributeValue(r10, C0201.m82(5871)) != null)) {
            g2(h.getBoolean(xv1.Chip_closeIconEnabled, false));
        }
        U1(dx1.d(this.g0, h, xv1.Chip_closeIcon));
        e2(dx1.a(this.g0, h, xv1.Chip_closeIconTint));
        Z1(h.getDimension(xv1.Chip_closeIconSize, 0.0f));
        r1(h.getBoolean(xv1.Chip_android_checkable, false));
        w1(h.getBoolean(xv1.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(r10, C0201.m82(5872)) == null || attributeSet.getAttributeValue(r10, C0201.m82(5873)) != null)) {
            w1(h.getBoolean(xv1.Chip_checkedIconEnabled, false));
        }
        t1(dx1.d(this.g0, h, xv1.Chip_checkedIcon));
        t2(fw1.b(this.g0, h, xv1.Chip_showMotionSpec));
        j2(fw1.b(this.g0, h, xv1.Chip_hideMotionSpec));
        N1(h.getDimension(xv1.Chip_chipStartPadding, 0.0f));
        n2(h.getDimension(xv1.Chip_iconStartPadding, 0.0f));
        l2(h.getDimension(xv1.Chip_iconEndPadding, 0.0f));
        A2(h.getDimension(xv1.Chip_textStartPadding, 0.0f));
        y2(h.getDimension(xv1.Chip_textEndPadding, 0.0f));
        b2(h.getDimension(xv1.Chip_closeIconStartPadding, 0.0f));
        W1(h.getDimension(xv1.Chip_closeIconEndPadding, 0.0f));
        B1(h.getDimension(xv1.Chip_chipEndPadding, 0.0f));
        p2(h.getDimensionPixelSize(xv1.Chip_android_maxWidth, C0188.f24));
        h.recycle();
    }

    private float p0() {
        this.n0.e().getFontMetrics(this.j0);
        Paint.FontMetrics fontMetrics = this.j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    private boolean q1(int[] iArr, int[] iArr2) {
        boolean z;
        int colorForState;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.A;
        int colorForState2 = colorStateList != null ? colorStateList.getColorForState(iArr, this.o0) : 0;
        boolean z2 = true;
        if (this.o0 != colorForState2) {
            this.o0 = colorForState2;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.B;
        int colorForState3 = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.p0) : 0;
        if (this.p0 != colorForState3) {
            this.p0 = colorForState3;
            onStateChange = true;
        }
        int e = uw1.e(colorForState2, colorForState3);
        if ((this.q0 != e) || (w() == null)) {
            this.q0 = e;
            V(ColorStateList.valueOf(e));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.E;
        int colorForState4 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.r0) : 0;
        if (this.r0 != colorForState4) {
            this.r0 = colorForState4;
            onStateChange = true;
        }
        int colorForState5 = (this.D0 == null || !ix1.e(iArr)) ? 0 : this.D0.getColorForState(iArr, this.s0);
        if (this.s0 != colorForState5) {
            this.s0 = colorForState5;
            if (this.C0) {
                onStateChange = true;
            }
        }
        int colorForState6 = (this.n0.d() == null || this.n0.d().b == null) ? 0 : this.n0.d().b.getColorForState(iArr, this.t0);
        if (this.t0 != colorForState6) {
            this.t0 = colorForState6;
            onStateChange = true;
        }
        boolean z3 = h1(getState(), 16842912) && this.T;
        if (!(this.u0 == z3 || this.V == null)) {
            float j02 = j0();
            this.u0 = z3;
            if (j02 != j0()) {
                onStateChange = true;
                z = true;
                ColorStateList colorStateList4 = this.z0;
                colorForState = colorStateList4 == null ? colorStateList4.getColorForState(iArr, this.v0) : 0;
                if (this.v0 == colorForState) {
                    this.v0 = colorForState;
                    this.y0 = vw1.a(this, this.z0, this.A0);
                } else {
                    z2 = onStateChange;
                }
                if (m1(this.J)) {
                    z2 |= this.J.setState(iArr);
                }
                if (m1(this.V)) {
                    z2 |= this.V.setState(iArr);
                }
                if (m1(this.O)) {
                    int[] iArr3 = new int[(iArr.length + iArr2.length)];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z2 |= this.O.setState(iArr3);
                }
                if (ix1.a && m1(this.P)) {
                    z2 |= this.P.setState(iArr2);
                }
                if (z2) {
                    invalidateSelf();
                }
                if (z) {
                    p1();
                }
                return z2;
            }
            onStateChange = true;
        }
        z = false;
        ColorStateList colorStateList42 = this.z0;
        if (colorStateList42 == null) {
        }
        if (this.v0 == colorForState) {
        }
        if (m1(this.J)) {
        }
        if (m1(this.V)) {
        }
        if (m1(this.O)) {
        }
        z2 |= this.P.setState(iArr2);
        if (z2) {
        }
        if (z) {
        }
        return z2;
    }

    private boolean r0() {
        return this.U && this.V != null && this.T;
    }

    public static a s0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.o1(attributeSet, i, i2);
        return aVar;
    }

    private void t0(Canvas canvas, Rect rect) {
        if (E2()) {
            i0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.V.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.V.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        if (!this.I0) {
            this.h0.setColor(this.p0);
            this.h0.setStyle(Paint.Style.FILL);
            this.h0.setColorFilter(f1());
            this.k0.set(rect);
            canvas.drawRoundRect(this.k0, E0(), E0(), this.h0);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (F2()) {
            i0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.J.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            this.J.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.F > 0.0f && !this.I0) {
            this.h0.setColor(this.r0);
            this.h0.setStyle(Paint.Style.STROKE);
            if (!this.I0) {
                this.h0.setColorFilter(f1());
            }
            RectF rectF = this.k0;
            float f = this.F;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.D - (this.F / 2.0f);
            canvas.drawRoundRect(this.k0, f2, f2, this.h0);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        if (!this.I0) {
            this.h0.setColor(this.o0);
            this.h0.setStyle(Paint.Style.FILL);
            this.k0.set(rect);
            canvas.drawRoundRect(this.k0, E0(), E0(), this.h0);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (G2()) {
            l0(rect, this.k0);
            RectF rectF = this.k0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.O.setBounds(0, 0, (int) this.k0.width(), (int) this.k0.height());
            if (ix1.a) {
                this.P.setBounds(this.O.getBounds());
                this.P.jumpToCurrentState();
                this.P.draw(canvas);
            } else {
                this.O.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        this.h0.setColor(this.s0);
        this.h0.setStyle(Paint.Style.FILL);
        this.k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.k0, E0(), E0(), this.h0);
            return;
        }
        g(new RectF(rect), this.m0);
        super.o(canvas, this.h0, this.m0, t());
    }

    @Deprecated
    public void A1(int i) {
        z1(this.g0.getResources().getDimension(i));
    }

    public void A2(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            p1();
        }
    }

    public void B1(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            p1();
        }
    }

    public void B2(int i) {
        A2(this.g0.getResources().getDimension(i));
    }

    public Drawable C0() {
        return this.V;
    }

    public void C1(int i) {
        B1(this.g0.getResources().getDimension(i));
    }

    public void C2(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            I2();
            onStateChange(getState());
        }
    }

    public ColorStateList D0() {
        return this.B;
    }

    public void D1(Drawable drawable) {
        Drawable G02 = G0();
        if (G02 != drawable) {
            float j02 = j0();
            this.J = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float j03 = j0();
            H2(G02);
            if (F2()) {
                h0(this.J);
            }
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public boolean D2() {
        return this.G0;
    }

    public float E0() {
        return this.I0 ? E() : this.D;
    }

    public void E1(int i) {
        D1(n.d(this.g0, i));
    }

    public float F0() {
        return this.f0;
    }

    public void F1(float f) {
        if (this.L != f) {
            float j02 = j0();
            this.L = f;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public Drawable G0() {
        Drawable drawable = this.J;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void G1(int i) {
        F1(this.g0.getResources().getDimension(i));
    }

    public float H0() {
        return this.L;
    }

    public void H1(ColorStateList colorStateList) {
        this.M = true;
        if (this.K != colorStateList) {
            this.K = colorStateList;
            if (F2()) {
                androidx.core.graphics.drawable.a.o(this.J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public ColorStateList I0() {
        return this.K;
    }

    public void I1(int i) {
        H1(n.c(this.g0, i));
    }

    public float J0() {
        return this.C;
    }

    public void J1(int i) {
        K1(this.g0.getResources().getBoolean(i));
    }

    public float K0() {
        return this.Y;
    }

    public void K1(boolean z) {
        if (this.I != z) {
            boolean F2 = F2();
            this.I = z;
            boolean F22 = F2();
            if (F2 != F22) {
                if (F22) {
                    h0(this.J);
                } else {
                    H2(this.J);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public ColorStateList L0() {
        return this.E;
    }

    public void L1(float f) {
        if (this.C != f) {
            this.C = f;
            invalidateSelf();
            p1();
        }
    }

    public float M0() {
        return this.F;
    }

    public void M1(int i) {
        L1(this.g0.getResources().getDimension(i));
    }

    public Drawable N0() {
        Drawable drawable = this.O;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void N1(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            p1();
        }
    }

    public CharSequence O0() {
        return this.S;
    }

    public void O1(int i) {
        N1(this.g0.getResources().getDimension(i));
    }

    public float P0() {
        return this.e0;
    }

    public void P1(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (this.I0) {
                c0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float Q0() {
        return this.R;
    }

    public void Q1(int i) {
        P1(n.c(this.g0, i));
    }

    public float R0() {
        return this.d0;
    }

    public void R1(float f) {
        if (this.F != f) {
            this.F = f;
            this.h0.setStrokeWidth(f);
            if (this.I0) {
                super.d0(f);
            }
            invalidateSelf();
        }
    }

    public int[] S0() {
        return this.B0;
    }

    public void S1(int i) {
        R1(this.g0.getResources().getDimension(i));
    }

    public ColorStateList T0() {
        return this.Q;
    }

    public void U0(RectF rectF) {
        m0(getBounds(), rectF);
    }

    public void U1(Drawable drawable) {
        Drawable N0 = N0();
        if (N0 != drawable) {
            float n02 = n0();
            this.O = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (ix1.a) {
                J2();
            }
            float n03 = n0();
            H2(N0);
            if (G2()) {
                h0(this.O);
            }
            invalidateSelf();
            if (n02 != n03) {
                p1();
            }
        }
    }

    public TextUtils.TruncateAt V0() {
        return this.F0;
    }

    public void V1(CharSequence charSequence) {
        if (this.S != charSequence) {
            this.S = l2.c().h(charSequence);
            invalidateSelf();
        }
    }

    public fw1 W0() {
        return this.X;
    }

    public void W1(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (G2()) {
                p1();
            }
        }
    }

    public float X0() {
        return this.a0;
    }

    public void X1(int i) {
        W1(this.g0.getResources().getDimension(i));
    }

    public float Y0() {
        return this.Z;
    }

    public void Y1(int i) {
        U1(n.d(this.g0, i));
    }

    public ColorStateList Z0() {
        return this.G;
    }

    public void Z1(float f) {
        if (this.R != f) {
            this.R = f;
            invalidateSelf();
            if (G2()) {
                p1();
            }
        }
    }

    @Override // com.google.android.material.internal.f.b
    public void a() {
        p1();
        invalidateSelf();
    }

    public fw1 a1() {
        return this.W;
    }

    public void a2(int i) {
        Z1(this.g0.getResources().getDimension(i));
    }

    public CharSequence b1() {
        return this.H;
    }

    public void b2(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (G2()) {
                p1();
            }
        }
    }

    public ex1 c1() {
        return this.n0.d();
    }

    public void c2(int i) {
        b2(this.g0.getResources().getDimension(i));
    }

    public float d1() {
        return this.c0;
    }

    public boolean d2(int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (G2()) {
            return q1(getState(), iArr);
        }
        return false;
    }

    @Override // defpackage.rx1
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.w0;
            if (i2 < 255) {
                i = lw1.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            x0(canvas, bounds);
            u0(canvas, bounds);
            if (this.I0) {
                super.draw(canvas);
            }
            w0(canvas, bounds);
            z0(canvas, bounds);
            v0(canvas, bounds);
            t0(canvas, bounds);
            if (this.G0) {
                B0(canvas, bounds);
            }
            y0(canvas, bounds);
            A0(canvas, bounds);
            if (this.w0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    public float e1() {
        return this.b0;
    }

    public void e2(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (G2()) {
                androidx.core.graphics.drawable.a.o(this.O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void f2(int i) {
        e2(n.c(this.g0, i));
    }

    public boolean g1() {
        return this.C0;
    }

    public void g2(boolean z) {
        if (this.N != z) {
            boolean G2 = G2();
            this.N = z;
            boolean G22 = G2();
            if (G2 != G22) {
                if (G22) {
                    h0(this.O);
                } else {
                    H2(this.O);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public int getAlpha() {
        return this.w0;
    }

    public ColorFilter getColorFilter() {
        return this.x0;
    }

    public int getIntrinsicHeight() {
        return (int) this.C;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + j0() + this.b0 + this.n0.f(b1().toString()) + this.c0 + n0() + this.f0), this.H0);
    }

    @Override // defpackage.rx1
    public int getOpacity() {
        return -3;
    }

    @Override // defpackage.rx1
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.D);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void h2(AbstractC0066a aVar) {
        this.E0 = new WeakReference<>(aVar);
    }

    public boolean i1() {
        return this.T;
    }

    public void i2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.rx1
    public boolean isStateful() {
        return l1(this.A) || l1(this.B) || l1(this.E) || (this.C0 && l1(this.D0)) || n1(this.n0.d()) || r0() || m1(this.J) || m1(this.V) || l1(this.z0);
    }

    public float j0() {
        if (F2() || E2()) {
            return this.Z + this.L + this.a0;
        }
        return 0.0f;
    }

    public boolean j1() {
        return m1(this.O);
    }

    public void j2(fw1 fw1) {
        this.X = fw1;
    }

    public boolean k1() {
        return this.N;
    }

    public void k2(int i) {
        j2(fw1.c(this.g0, i));
    }

    public void l2(float f) {
        if (this.a0 != f) {
            float j02 = j0();
            this.a0 = f;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void m2(int i) {
        l2(this.g0.getResources().getDimension(i));
    }

    public float n0() {
        if (G2()) {
            return this.d0 + this.R + this.e0;
        }
        return 0.0f;
    }

    public void n2(float f) {
        if (this.Z != f) {
            float j02 = j0();
            this.Z = f;
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void o2(int i) {
        n2(this.g0.getResources().getDimension(i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (F2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.J, i);
        }
        if (E2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.V, i);
        }
        if (G2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.O, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (F2()) {
            onLevelChange |= this.J.setLevel(i);
        }
        if (E2()) {
            onLevelChange |= this.V.setLevel(i);
        }
        if (G2()) {
            onLevelChange |= this.O.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.internal.f.b, defpackage.rx1
    public boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return q1(iArr, S0());
    }

    public void p1() {
        AbstractC0066a aVar = this.E0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void p2(int i) {
        this.H0 = i;
    }

    public Paint.Align q0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.H != null) {
            float j02 = this.Y + j0() + this.b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + j02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - j02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - p0();
        }
        return align;
    }

    public void q2(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            I2();
            onStateChange(getState());
        }
    }

    public void r1(boolean z) {
        if (this.T != z) {
            this.T = z;
            float j02 = j0();
            if (!z && this.u0) {
                this.u0 = false;
            }
            float j03 = j0();
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void r2(int i) {
        q2(n.c(this.g0, i));
    }

    public void s1(int i) {
        r1(this.g0.getResources().getBoolean(i));
    }

    public void s2(boolean z) {
        this.G0 = z;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.rx1
    public void setAlpha(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.rx1
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.x0 != colorFilter) {
            this.x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.rx1, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.rx1, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.y0 = vw1.a(this, this.z0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (F2()) {
            visible |= this.J.setVisible(z, z2);
        }
        if (E2()) {
            visible |= this.V.setVisible(z, z2);
        }
        if (G2()) {
            visible |= this.O.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(Drawable drawable) {
        if (this.V != drawable) {
            float j02 = j0();
            this.V = drawable;
            float j03 = j0();
            H2(this.V);
            h0(this.V);
            invalidateSelf();
            if (j02 != j03) {
                p1();
            }
        }
    }

    public void t2(fw1 fw1) {
        this.W = fw1;
    }

    public void u1(int i) {
        t1(n.d(this.g0, i));
    }

    public void u2(int i) {
        t2(fw1.c(this.g0, i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(int i) {
        w1(this.g0.getResources().getBoolean(i));
    }

    public void v2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = C0201.m82(5874);
        }
        if (!TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.n0.i(true);
            invalidateSelf();
            p1();
        }
    }

    public void w1(boolean z) {
        if (this.U != z) {
            boolean E2 = E2();
            this.U = z;
            boolean E22 = E2();
            if (E2 != E22) {
                if (E22) {
                    h0(this.V);
                } else {
                    H2(this.V);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void w2(ex1 ex1) {
        this.n0.h(ex1, this.g0);
    }

    public void x1(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            onStateChange(getState());
        }
    }

    public void x2(int i) {
        w2(new ex1(this.g0, i));
    }

    public void y1(int i) {
        x1(n.c(this.g0, i));
    }

    public void y2(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            p1();
        }
    }

    @Deprecated
    public void z1(float f) {
        if (this.D != f) {
            this.D = f;
            setShapeAppearanceModel(B().w(f));
        }
    }

    public void z2(int i) {
        y2(this.g0.getResources().getDimension(i));
    }
}
