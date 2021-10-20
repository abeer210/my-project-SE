package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import defpackage.w3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

public class Chip extends g implements a.AbstractC0066a, yx1 {
    private static final Rect w = new Rect();
    private static final int[] x = {16842913};
    private static final int[] y = {16842911};
    private a d;
    private InsetDrawable e;
    private RippleDrawable f;
    private View.OnClickListener g;
    private CompoundButton.OnCheckedChangeListener h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private final c p;
    private final Rect q;
    private final RectF u;
    private final gx1 v;

    class a extends gx1 {
        public a() {
        }

        @Override // defpackage.gx1
        public void a(int i) {
        }

        @Override // defpackage.gx1
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.d.D2() ? Chip.this.d.b1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.d != null) {
                Chip.this.d.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: private */
    public class c extends g4 {
        public c(Chip chip) {
            super(chip);
        }

        @Override // defpackage.g4
        public int C(float f, float f2) {
            return (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        @Override // defpackage.g4
        public void D(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.g != null) {
                list.add(1);
            }
        }

        @Override // defpackage.g4
        public boolean M(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // defpackage.g4
        public void P(w3 w3Var) {
            w3Var.X(Chip.this.r());
            w3Var.a0(Chip.this.isClickable());
            if (Chip.this.r() || Chip.this.isClickable()) {
                w3Var.Z(Chip.this.r() ? C0201.m82(10181) : C0201.m82(10182));
            } else {
                w3Var.Z(C0201.m82(10180));
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                w3Var.y0(text);
            } else {
                w3Var.d0(text);
            }
        }

        @Override // defpackage.g4
        public void Q(int i, w3 w3Var) {
            CharSequence r0 = C0201.m82(10183);
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    w3Var.d0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = vv1.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        r0 = text;
                    }
                    objArr[0] = r0;
                    w3Var.d0(context.getString(i2, objArr).trim());
                }
                w3Var.V(Chip.this.getCloseIconTouchBoundsInt());
                w3Var.b(w3.a.g);
                w3Var.e0(Chip.this.isEnabled());
                return;
            }
            w3Var.d0(r0);
            w3Var.V(Chip.w);
        }

        @Override // defpackage.g4
        public void R(int i, boolean z) {
            if (i == 1) {
                Chip.this.l = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.chipStyle);
    }

    private void A() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.d) != null) {
            int F0 = (int) (aVar.F0() + this.d.d1() + this.d.n0());
            int K0 = (int) (this.d.K0() + this.d.e1() + this.d.j0());
            if (this.e != null) {
                Rect rect = new Rect();
                Log.w(C0201.m82(32860), C0201.m82(32858) + rect.left + C0201.m82(32859) + rect.right);
                this.e.getPadding(rect);
                if (k3.w(this) == 1) {
                    F0 += rect.right;
                } else {
                    K0 += rect.left;
                }
            }
            k3.u0(this, K0, getPaddingTop(), F0, getPaddingBottom());
        }
    }

    private void B() {
        TextPaint paint = getPaint();
        a aVar = this.d;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        ex1 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i(getContext(), paint, this.v);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            String r0 = C0201.m82(32861);
            String attributeValue = attributeSet.getAttributeValue(r0, C0201.m82(32862));
            String r2 = C0201.m82(32863);
            if (attributeValue != null) {
                Log.w(r2, C0201.m82(32864));
            }
            if (attributeSet.getAttributeValue(r0, C0201.m82(32865)) != null) {
                throw new UnsupportedOperationException(C0201.m82(32878));
            } else if (attributeSet.getAttributeValue(r0, C0201.m82(32866)) == null) {
                String attributeValue2 = attributeSet.getAttributeValue(r0, C0201.m82(32867));
                String r3 = C0201.m82(32868);
                if (attributeValue2 != null) {
                    throw new UnsupportedOperationException(r3);
                } else if (attributeSet.getAttributeValue(r0, C0201.m82(32869)) != null) {
                    throw new UnsupportedOperationException(r3);
                } else if (!attributeSet.getAttributeBooleanValue(r0, C0201.m82(32870), true) || attributeSet.getAttributeIntValue(r0, C0201.m82(32871), 1) != 1 || attributeSet.getAttributeIntValue(r0, C0201.m82(32872), 1) != 1 || attributeSet.getAttributeIntValue(r0, C0201.m82(32873), 1) != 1) {
                    throw new UnsupportedOperationException(C0201.m82(32876));
                } else if (attributeSet.getAttributeIntValue(r0, C0201.m82(32874), 8388627) != 8388627) {
                    Log.w(r2, C0201.m82(32875));
                }
            } else {
                throw new UnsupportedOperationException(C0201.m82(32877));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private RectF getCloseIconTouchBounds() {
        this.u.setEmpty();
        if (n()) {
            this.d.U0(this.u);
        }
        return this.u;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.q.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.q;
    }

    private ex1 getTextAppearance() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    private void i(a aVar) {
        aVar.h2(this);
    }

    private int[] j() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.l) {
            i3++;
        }
        if (this.k) {
            i3++;
        }
        if (this.j) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.l) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.k) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.j) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    private void l() {
        if (getBackgroundDrawable() == this.e && this.d.getCallback() == null) {
            this.d.setCallback(this.e);
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean m(MotionEvent motionEvent) {
        String r1 = C0201.m82(32879);
        String r2 = C0201.m82(32880);
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = g4.class.getDeclaredField(C0201.m82(32881));
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.p)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = g4.class.getDeclaredMethod(C0201.m82(32882), Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.p, Integer.valueOf((int) C0188.f23));
                    return true;
                }
            } catch (NoSuchMethodException e2) {
                Log.e(r2, r1, e2);
            } catch (IllegalAccessException e3) {
                Log.e(r2, r1, e3);
            } catch (InvocationTargetException e4) {
                Log.e(r2, r1, e4);
            } catch (NoSuchFieldException e5) {
                Log.e(r2, r1, e5);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean n() {
        a aVar = this.d;
        return (aVar == null || aVar.N0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i2) {
        TypedArray h2 = com.google.android.material.internal.g.h(context, attributeSet, xv1.Chip, i2, wv1.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.m = h2.getBoolean(xv1.Chip_ensureMinTouchTargetSize, false);
        this.o = (int) Math.ceil((double) h2.getDimension(xv1.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) h.a(getContext(), 48))));
        h2.recycle();
    }

    private void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void q(int i2, int i3, int i4, int i5) {
        this.e = new InsetDrawable((Drawable) this.d, i2, i3, i4, i5);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.e != null) {
            this.e = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(a aVar) {
        if (aVar != null) {
            aVar.h2(null);
        }
    }

    private void x() {
        if (!n() || !s() || this.g == null) {
            k3.h0(this, null);
        } else {
            k3.h0(this, this.p);
        }
    }

    private void y() {
        if (ix1.a) {
            z();
            return;
        }
        this.d.C2(true);
        k3.k0(this, getBackgroundDrawable());
        A();
        l();
    }

    private void z() {
        this.f = new RippleDrawable(ix1.d(this.d.Z0()), getBackgroundDrawable(), null);
        this.d.C2(false);
        k3.k0(this, this.f);
        A();
    }

    @Override // com.google.android.material.chip.a.AbstractC0066a
    public void a() {
        k(this.o);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.p.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.p.w(keyEvent) || this.p.B() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.g
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.d;
        if ((aVar == null || !aVar.j1()) ? false : this.d.d2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.e;
        return insetDrawable == null ? this.d : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.E0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.d;
    }

    public float getChipEndPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.p.B() == 1 || this.p.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public fw1 getHideMotionSpec() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public vx1 getShapeAppearanceModel() {
        return this.d.B();
    }

    public fw1 getShowMotionSpec() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public boolean k(int i2) {
        this.o = i2;
        int i3 = 0;
        if (!v()) {
            if (this.e != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i2 - this.d.getIntrinsicHeight());
        int max2 = Math.max(0, i2 - this.d.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i4 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i3 = max / 2;
            }
            if (this.e != null) {
                Rect rect = new Rect();
                this.e.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i4 && rect.right == i4) {
                    y();
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i2) {
                    setMinHeight(i2);
                }
                if (getMinWidth() != i2) {
                    setMinWidth(i2);
                }
            } else {
                setMinHeight(i2);
                setMinWidth(i2);
            }
            q(i4, i3, i4, i3);
            y();
            return true;
        }
        if (this.e != null) {
            u();
        } else {
            y();
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sx1.f(this, this.d);
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, x);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, y);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.p.L(z, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (r() || isClickable()) {
            accessibilityNodeInfo.setClassName(r() ? C0201.m82(32884) : C0201.m82(32885));
        } else {
            accessibilityNodeInfo.setClassName(C0201.m82(32883));
        }
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.n != i2) {
            this.n = i2;
            A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.j) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                    }
                }
                z = false;
                if (!z || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            } else if (this.j) {
                t();
                z = true;
                setCloseIconPressed(false);
                if (!z) {
                }
                return true;
            }
            z = false;
            setCloseIconPressed(false);
            if (!z) {
            }
            return true;
        }
        if (contains) {
            setCloseIconPressed(true);
        }
        z = false;
        if (!z) {
        }
        return true;
        z = true;
        if (!z) {
        }
        return true;
    }

    public boolean r() {
        a aVar = this.d;
        return aVar != null && aVar.i1();
    }

    public boolean s() {
        a aVar = this.d;
        return aVar != null && aVar.k1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f) {
            super.setBackground(drawable);
        } else {
            Log.w(C0201.m82(32886), C0201.m82(32887));
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w(C0201.m82(32888), C0201.m82(32889));
    }

    @Override // androidx.appcompat.widget.g
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(C0201.m82(32890), C0201.m82(32891));
        }
    }

    @Override // androidx.appcompat.widget.g
    public void setBackgroundResource(int i2) {
        Log.w(C0201.m82(32892), C0201.m82(32893));
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w(C0201.m82(32894), C0201.m82(32895));
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w(C0201.m82(32896), C0201.m82(32897));
    }

    public void setCheckable(boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.r1(z);
        }
    }

    public void setCheckableResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.s1(i2);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.d;
        if (aVar == null) {
            this.i = z;
        } else if (aVar.i1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.h) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.t1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.u1(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.v1(i2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.x1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.y1(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.z1(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.A1(i2);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.d;
        if (aVar2 != aVar) {
            w(aVar2);
            this.d = aVar;
            aVar.s2(false);
            i(this.d);
            k(this.o);
        }
    }

    public void setChipEndPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.B1(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.C1(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.D1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.E1(i2);
        }
    }

    public void setChipIconSize(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.F1(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.G1(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.H1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.I1(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.J1(i2);
        }
    }

    public void setChipMinHeight(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.L1(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.M1(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.N1(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.O1(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.P1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.Q1(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.R1(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.S1(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.U1(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.V1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.W1(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.X1(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.Y1(i2);
        }
        x();
    }

    public void setCloseIconSize(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.Z1(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a2(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.b2(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.c2(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.e2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.f2(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(C0201.m82(32899));
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException(C0201.m82(32898));
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(C0201.m82(32901));
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException(C0201.m82(32900));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException(C0201.m82(32903));
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException(C0201.m82(32902));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException(C0201.m82(32907));
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException(C0201.m82(32906));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        a aVar = this.d;
        if (aVar != null) {
            aVar.U(f2);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.d != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.d;
                if (aVar != null) {
                    aVar.i2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException(C0201.m82(32910));
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.m = z;
        k(this.o);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w(C0201.m82(32911), C0201.m82(32912));
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(fw1 fw1) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.j2(fw1);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.k2(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.l2(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.m2(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.n2(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.o2(i2);
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.d != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException(C0201.m82(32913));
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException(C0201.m82(32914));
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        a aVar = this.d;
        if (aVar != null) {
            aVar.p2(i2);
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException(C0201.m82(32915));
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
        if (!this.d.g1()) {
            z();
        }
    }

    public void setRippleColorResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.r2(i2);
            if (!this.d.g1()) {
                z();
            }
        }
    }

    @Override // defpackage.yx1
    public void setShapeAppearanceModel(vx1 vx1) {
        this.d.setShapeAppearanceModel(vx1);
    }

    public void setShowMotionSpec(fw1 fw1) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.t2(fw1);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.u2(i2);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException(C0201.m82(32916));
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.d != null) {
            if (charSequence == null) {
                charSequence = C0201.m82(32917);
            }
            super.setText(this.d.D2() ? null : charSequence, bufferType);
            a aVar = this.d;
            if (aVar != null) {
                aVar.v2(charSequence);
            }
        }
    }

    public void setTextAppearance(ex1 ex1) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.w2(ex1);
        }
        B();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.y2(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.z2(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.A2(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.B2(i2);
        }
    }

    public boolean t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.p.X(1, 1);
        return z;
    }

    public boolean v() {
        return this.m;
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.q = new Rect();
        this.u = new RectF();
        this.v = new a();
        C(attributeSet);
        a s0 = a.s0(context, attributeSet, i2, wv1.Widget_MaterialComponents_Chip_Action);
        o(context, attributeSet, i2);
        setChipDrawable(s0);
        s0.U(k3.r(this));
        TypedArray h2 = com.google.android.material.internal.g.h(context, attributeSet, xv1.Chip, i2, wv1.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(dx1.a(context, h2, xv1.Chip_android_textColor));
        }
        boolean hasValue = h2.hasValue(xv1.Chip_shapeAppearance);
        h2.recycle();
        this.p = new c(this);
        x();
        if (!hasValue) {
            p();
        }
        setChecked(this.i);
        setText(s0.b1());
        setEllipsize(s0.V0());
        setIncludeFontPadding(false);
        B();
        if (!this.d.D2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.o);
        }
        this.n = k3.w(this);
    }

    public void setCloseIconVisible(boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.g2(z);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.w1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.K1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(C0201.m82(32905));
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException(C0201.m82(32904));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException(C0201.m82(32909));
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException(C0201.m82(32908));
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        a aVar = this.d;
        if (aVar != null) {
            aVar.x2(i2);
        }
        B();
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        a aVar = this.d;
        if (aVar != null) {
            aVar.x2(i2);
        }
        B();
    }
}
