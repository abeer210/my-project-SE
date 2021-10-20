package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: FloatingActionButtonImplLollipop */
public class c extends b {
    public c(FloatingActionButton floatingActionButton, kx1 kx1) {
        super(floatingActionButton, kx1);
    }

    private Animator e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, C0201.m82(1725), f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(b.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void A() {
        b0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void C(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.y.isEnabled()) {
            this.y.setElevation(this.h);
            if (this.y.isPressed()) {
                this.y.setTranslationZ(this.j);
            } else if (this.y.isFocused() || this.y.isHovered()) {
                this.y.setTranslationZ(this.i);
            } else {
                this.y.setTranslationZ(0.0f);
            }
        } else {
            this.y.setElevation(0.0f);
            this.y.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void D(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.G, e0(f, f3));
            stateListAnimator.addState(b.H, e0(f, f2));
            stateListAnimator.addState(b.I, e0(f, f2));
            stateListAnimator.addState(b.J, e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, C0201.m82(1726), f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.F);
            stateListAnimator.addState(b.K, animatorSet);
            stateListAnimator.addState(b.L, e0(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (V()) {
            b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public boolean I() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ix1.d(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public boolean V() {
        return this.z.b() || !X();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void Z() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float m() {
        return this.y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void r(Rect rect) {
        if (this.z.b()) {
            super.r(rect);
        } else if (!X()) {
            int sizeDimension = (this.k - this.y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void y() {
    }
}
