package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.h;

/* compiled from: BaseTransientBottomBar */
public class d extends FrameLayout {
    private static final View.OnTouchListener h = new a();
    private c a;
    private b b;
    private int c;
    private final float d;
    private final float e;
    private ColorStateList f;
    private PorterDuff.Mode g;

    /* compiled from: BaseTransientBottomBar */
    static class a implements View.OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(ay1.c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, xv1.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(xv1.SnackbarLayout_elevation)) {
            k3.o0(this, (float) obtainStyledAttributes.getDimensionPixelSize(xv1.SnackbarLayout_elevation, 0));
        }
        this.c = obtainStyledAttributes.getInt(xv1.SnackbarLayout_animationMode, 0);
        this.d = obtainStyledAttributes.getFloat(xv1.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(dx1.a(context2, obtainStyledAttributes, xv1.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(h.d(obtainStyledAttributes.getInt(xv1.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.e = obtainStyledAttributes.getFloat(xv1.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(h);
        setFocusable(true);
        if (getBackground() == null) {
            k3.k0(this, a());
        }
    }

    private Drawable a() {
        float dimension = getResources().getDimension(pv1.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(uw1.g(this, nv1.colorSurface, nv1.colorOnSurface, getBackgroundOverlayColorAlpha()));
        if (this.f == null) {
            return androidx.core.graphics.drawable.a.r(gradientDrawable);
        }
        Drawable r = androidx.core.graphics.drawable.a.r(gradientDrawable);
        androidx.core.graphics.drawable.a.o(r, this.f);
        return r;
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.b;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        k3.f0(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.b;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.c = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f == null)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
            androidx.core.graphics.drawable.a.o(drawable, this.f);
            androidx.core.graphics.drawable.a.p(drawable, this.g);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f = colorStateList;
        if (getBackground() != null) {
            Drawable r = androidx.core.graphics.drawable.a.r(getBackground().mutate());
            androidx.core.graphics.drawable.a.o(r, colorStateList);
            androidx.core.graphics.drawable.a.p(r, this.g);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.g = mode;
        if (getBackground() != null) {
            Drawable r = androidx.core.graphics.drawable.a.r(getBackground().mutate());
            androidx.core.graphics.drawable.a.p(r, mode);
            if (r != getBackground()) {
                super.setBackgroundDrawable(r);
            }
        }
    }

    public void setOnAttachStateChangeListener(b bVar) {
        this.b = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : h);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.a = cVar;
    }
}
