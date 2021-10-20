package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.widget.j;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import vigqyno.C0201;

public class MaterialButton extends f implements Checkable, yx1 {
    private static final int[] o = {16842911};
    private static final int[] p = {16842912};
    private static final int q = wv1.Widget_MaterialComponents_Button;
    private final a c;
    private final LinkedHashSet<a> d;
    private b e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.materialButtonStyle);
    }

    private boolean b() {
        return k3.w(this) == 1;
    }

    private boolean c() {
        a aVar = this.c;
        return aVar != null && !aVar.m();
    }

    private void d(boolean z) {
        if (z) {
            j.l(this, this.h, null, null, null);
        } else {
            j.l(this, null, null, this.h, null);
        }
    }

    private void e(boolean z) {
        Drawable drawable = this.h;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.h = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.g);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.h, mode);
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = this.h.getIntrinsicWidth();
            }
            int i3 = this.i;
            if (i3 == 0) {
                i3 = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i4 = this.j;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.n;
        boolean z3 = i5 == 1 || i5 == 2;
        if (z) {
            d(z3);
            return;
        }
        Drawable[] a2 = j.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[2];
        if ((z3 && drawable3 != this.h) || (!z3 && drawable4 != this.h)) {
            z2 = true;
        }
        if (z2) {
            d(z3);
        }
    }

    private void f() {
        if (this.h != null && getLayout() != null) {
            int i2 = this.n;
            boolean z = true;
            if (i2 == 1 || i2 == 3) {
                this.j = 0;
                e(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i3 = this.i;
            if (i3 == 0) {
                i3 = this.h.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - k3.A(this)) - i3) - this.k) - k3.B(this)) / 2;
            boolean b2 = b();
            if (this.n != 4) {
                z = false;
            }
            if (b2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.j != measuredWidth) {
                this.j = measuredWidth;
                e(false);
            }
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        a aVar = this.c;
        return aVar != null && aVar.n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.c.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.h;
    }

    public int getIconGravity() {
        return this.n;
    }

    public int getIconPadding() {
        return this.k;
    }

    public int getIconSize() {
        return this.i;
    }

    public ColorStateList getIconTint() {
        return this.g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.c.f();
        }
        return null;
    }

    public vx1 getShapeAppearanceModel() {
        if (c()) {
            return this.c.g();
        }
        throw new IllegalStateException(C0201.m82(35221));
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.c.h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.c.i();
        }
        return 0;
    }

    @Override // defpackage.j3, androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        if (c()) {
            return this.c.j();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // defpackage.j3, androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (c()) {
            return this.c.k();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.l;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sx1.f(this, this.c.d());
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, o);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, p);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.c) != null) {
            aVar.B(i5 - i3, i4 - i2);
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        f();
    }

    @Override // androidx.appcompat.widget.f
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        f();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (c()) {
            this.c.p(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setBackgroundDrawable(Drawable drawable) {
        if (!c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w(C0201.m82(35222), C0201.m82(35223));
            this.c.q();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (c()) {
            this.c.r(z);
        }
    }

    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.l != z) {
            this.l = z;
            refreshDrawableState();
            if (!this.m) {
                this.m = true;
                Iterator<a> it = this.d.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.l);
                }
                this.m = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (c()) {
            this.c.s(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (c()) {
            this.c.d().U(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.h != drawable) {
            this.h = drawable;
            e(true);
        }
    }

    public void setIconGravity(int i2) {
        if (this.n != i2) {
            this.n = i2;
            f();
        }
    }

    public void setIconPadding(int i2) {
        if (this.k != i2) {
            this.k = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? n.d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C0201.m82(35224));
        } else if (this.i != i2) {
            this.i = i2;
            e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(n.c(getContext(), i2));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.e = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.c.t(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (c()) {
            setRippleColor(n.c(getContext(), i2));
        }
    }

    @Override // defpackage.yx1
    public void setShapeAppearanceModel(vx1 vx1) {
        if (c()) {
            this.c.u(vx1);
            return;
        }
        throw new IllegalStateException(C0201.m82(35225));
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            this.c.v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.c.w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (c()) {
            setStrokeColor(n.c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (c()) {
            this.c.x(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // defpackage.j3, androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.c.y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // defpackage.j3, androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.c.z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.l);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(ay1.c(context, attributeSet, i2, q), attributeSet, i2);
        this.d = new LinkedHashSet<>();
        boolean z = false;
        this.l = false;
        this.m = false;
        Context context2 = getContext();
        TypedArray h2 = g.h(context2, attributeSet, xv1.MaterialButton, i2, q, new int[0]);
        this.k = h2.getDimensionPixelSize(xv1.MaterialButton_iconPadding, 0);
        this.f = h.d(h2.getInt(xv1.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.g = dx1.a(getContext(), h2, xv1.MaterialButton_iconTint);
        this.h = dx1.d(getContext(), h2, xv1.MaterialButton_icon);
        this.n = h2.getInteger(xv1.MaterialButton_iconGravity, 1);
        this.i = h2.getDimensionPixelSize(xv1.MaterialButton_iconSize, 0);
        a aVar = new a(this, vx1.e(context2, attributeSet, i2, q).m());
        this.c = aVar;
        aVar.o(h2);
        h2.recycle();
        setCompoundDrawablePadding(this.k);
        e(this.h != null ? true : z);
    }
}
