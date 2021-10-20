package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.z0;
import androidx.core.widget.j;

public class NavigationMenuItemView extends d implements n.a {
    private static final int[] I = {16842912};
    public boolean A;
    private final CheckedTextView B;
    private FrameLayout C;
    private i D;
    private ColorStateList E;
    private boolean F;
    private Drawable G;
    private final r2 H;
    private int y;
    private boolean z;

    class a extends r2 {
        public a() {
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            w3Var.X(NavigationMenuItemView.this.A);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.B.setVisibility(8);
            FrameLayout frameLayout = this.C;
            if (frameLayout != null) {
                i0.a aVar = (i0.a) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) aVar).width = -1;
                this.C.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.B.setVisibility(0);
        FrameLayout frameLayout2 = this.C;
        if (frameLayout2 != null) {
            i0.a aVar2 = (i0.a) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) aVar2).width = -2;
            this.C.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(d.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(I, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.D.getTitle() == null && this.D.getIcon() == null && this.D.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.C == null) {
                this.C = (FrameLayout) ((ViewStub) findViewById(rv1.design_menu_item_action_area_stub)).inflate();
            }
            this.C.removeAllViews();
            this.C.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(i iVar, int i) {
        this.D = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            k3.k0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        z0.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.D;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.D;
        if (iVar != null && iVar.isCheckable() && this.D.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, I);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.A != z2) {
            this.A = z2;
            this.H.l(this.B, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.B.setChecked(z2);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.F) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.E);
            }
            int i = this.y;
            drawable.setBounds(0, 0, i, i);
        } else if (this.z) {
            if (this.G == null) {
                Drawable b = l1.b(getResources(), qv1.navigation_empty_icon, getContext().getTheme());
                this.G = b;
                if (b != null) {
                    int i2 = this.y;
                    b.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.G;
        }
        j.l(this.B, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.B.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.y = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.E = colorStateList;
        this.F = colorStateList != null;
        i iVar = this.D;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.B.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.z = z2;
    }

    public void setTextAppearance(int i) {
        j.q(this.B, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.B.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(tv1.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(pv1.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(rv1.design_menu_item_text);
        this.B = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        k3.h0(this.B, this.H);
    }
}
