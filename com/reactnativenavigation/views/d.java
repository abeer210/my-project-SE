package com.reactnativenavigation.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.aurelhubert.ahbottomnavigation.q;
import com.aurelhubert.ahbottomnavigation.r;

@SuppressLint({"ViewConstructor"})
/* compiled from: BottomTabs */
public class d extends q {
    private boolean h0 = true;
    private boolean i0 = true;

    public d(Context context) {
        super(context);
        setId(qd2.bottomTabs);
        setBehaviorTranslationEnabled(false);
    }

    private boolean b0(int i, int i2, int i3, int i4) {
        return (i == 0 || i2 == 0 || (i == i3 && i2 == i4) || getItemsCount() <= 0) ? false : true;
    }

    public void Z() {
        this.h0 = false;
    }

    public void a0() {
        this.h0 = true;
        if (this.i0) {
            i();
        }
    }

    public void c0(int i, Drawable drawable) {
        r n = n(i);
        if (!n.b(getContext()).equals(drawable)) {
            n.g(drawable);
            F();
        }
    }

    public void d0(int i, Drawable drawable) {
        r n = n(i);
        if (!n.b(getContext()).equals(drawable)) {
            n.h(drawable);
            F();
        }
    }

    public void e0(int i, String str) {
        r n = n(i);
        if (!n.e(getContext()).equals(str)) {
            n.i(str);
            F();
        }
    }

    public void f0() {
        super.i();
    }

    @Override // com.aurelhubert.ahbottomnavigation.q
    public void i() {
        if (this.h0) {
            f0();
        } else {
            this.i0 = true;
        }
    }

    @Override // com.aurelhubert.ahbottomnavigation.q
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (b0(i, i2, i3, i4)) {
            i();
        }
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (getDefaultBackgroundColor() != i) {
            setDefaultBackgroundColor(i);
        }
    }

    @Override // com.aurelhubert.ahbottomnavigation.q
    public void setCurrentItem(int i) {
        super.setCurrentItem(i);
    }

    public void setLayoutDirection(te2 te2) {
        LinearLayout linearLayout = (LinearLayout) zj2.b(this, LinearLayout.class);
        if (linearLayout != null) {
            linearLayout.setLayoutDirection(te2.d());
        }
    }

    @Override // com.aurelhubert.ahbottomnavigation.q
    public void setTitleState(q.f fVar) {
        if (getTitleState() != fVar) {
            super.setTitleState(fVar);
        }
    }
}
