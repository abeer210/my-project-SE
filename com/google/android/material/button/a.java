package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.internal.h;

/* compiled from: MaterialButtonHelper */
public class a {
    private static final boolean s = (Build.VERSION.SDK_INT >= 21);
    private final MaterialButton a;
    private vx1 b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    public a(MaterialButton materialButton, vx1 vx1) {
        this.a = materialButton;
        this.b = vx1;
    }

    private void A(vx1 vx1) {
        if (d() != null) {
            d().setShapeAppearanceModel(vx1);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(vx1);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(vx1);
        }
    }

    private void C() {
        rx1 d2 = d();
        rx1 l2 = l();
        if (d2 != null) {
            d2.b0((float) this.h, this.k);
            if (l2 != null) {
                l2.a0((float) this.h, this.n ? uw1.c(this.a, nv1.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    private Drawable a() {
        rx1 rx1 = new rx1(this.b);
        rx1.L(this.a.getContext());
        androidx.core.graphics.drawable.a.o(rx1, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(rx1, mode);
        }
        rx1.b0((float) this.h, this.k);
        rx1 rx12 = new rx1(this.b);
        rx12.setTint(0);
        rx12.a0((float) this.h, this.n ? uw1.c(this.a, nv1.colorSurface) : 0);
        if (s) {
            rx1 rx13 = new rx1(this.b);
            this.m = rx13;
            androidx.core.graphics.drawable.a.n(rx13, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(ix1.d(this.l), D(new LayerDrawable(new Drawable[]{rx12, rx1})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        hx1 hx1 = new hx1(this.b);
        this.m = hx1;
        androidx.core.graphics.drawable.a.o(hx1, ix1.d(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{rx12, rx1, this.m});
        this.r = layerDrawable;
        return D(layerDrawable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private rx1 e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (s) {
            return (rx1) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z);
        }
        return (rx1) this.r.getDrawable(!z ? 1 : 0);
    }

    private rx1 l() {
        return e(true);
    }

    public void B(int i2, int i3) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i3 - this.d, i2 - this.f);
        }
    }

    public int b() {
        return this.g;
    }

    public yx1 c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (yx1) this.r.getDrawable(2);
        }
        return (yx1) this.r.getDrawable(1);
    }

    public rx1 d() {
        return e(false);
    }

    public ColorStateList f() {
        return this.l;
    }

    public vx1 g() {
        return this.b;
    }

    public ColorStateList h() {
        return this.k;
    }

    public int i() {
        return this.h;
    }

    public ColorStateList j() {
        return this.j;
    }

    public PorterDuff.Mode k() {
        return this.i;
    }

    public boolean m() {
        return this.o;
    }

    public boolean n() {
        return this.q;
    }

    public void o(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(xv1.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(xv1.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(xv1.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(xv1.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(xv1.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(xv1.MaterialButton_cornerRadius, -1);
            this.g = dimensionPixelSize;
            u(this.b.w((float) dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(xv1.MaterialButton_strokeWidth, 0);
        this.i = h.d(typedArray.getInt(xv1.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = dx1.a(this.a.getContext(), typedArray, xv1.MaterialButton_backgroundTint);
        this.k = dx1.a(this.a.getContext(), typedArray, xv1.MaterialButton_strokeColor);
        this.l = dx1.a(this.a.getContext(), typedArray, xv1.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(xv1.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(xv1.MaterialButton_elevation, 0);
        int B = k3.B(this.a);
        int paddingTop = this.a.getPaddingTop();
        int A = k3.A(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        this.a.setInternalBackground(a());
        rx1 d2 = d();
        if (d2 != null) {
            d2.U((float) dimensionPixelSize2);
        }
        k3.u0(this.a, B + this.c, paddingTop + this.e, A + this.d, paddingBottom + this.f);
    }

    public void p(int i2) {
        if (d() != null) {
            d().setTint(i2);
        }
    }

    public void q() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public void r(boolean z) {
        this.q = z;
    }

    public void s(int i2) {
        if (!this.p || this.g != i2) {
            this.g = i2;
            this.p = true;
            u(this.b.w((float) i2));
        }
    }

    public void t(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (s && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(ix1.d(colorStateList));
            } else if (!s && (this.a.getBackground() instanceof hx1)) {
                ((hx1) this.a.getBackground()).setTintList(ix1.d(colorStateList));
            }
        }
    }

    public void u(vx1 vx1) {
        this.b = vx1;
        A(vx1);
    }

    public void v(boolean z) {
        this.n = z;
        C();
    }

    public void w(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            C();
        }
    }

    public void x(int i2) {
        if (this.h != i2) {
            this.h = i2;
            C();
        }
    }

    public void y(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.j);
            }
        }
    }

    public void z(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (d() != null && this.i != null) {
                androidx.core.graphics.drawable.a.p(d(), this.i);
            }
        }
    }
}
