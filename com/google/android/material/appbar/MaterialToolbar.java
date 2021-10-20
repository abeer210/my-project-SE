package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;

public class MaterialToolbar extends Toolbar {
    private static final int S = wv1.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.toolbarStyle);
    }

    private void P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            rx1 rx1 = new rx1();
            rx1.V(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            rx1.L(context);
            rx1.U(k3.r(this));
            k3.k0(this, rx1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sx1.e(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        sx1.d(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(ay1.c(context, attributeSet, i, S), attributeSet, i);
        P(getContext());
    }
}
