package com.reactnativenavigation.views.topbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.fe2;
import java.util.Collections;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* compiled from: TopBar */
public class a extends AppBarLayout implements fe2.c {
    private float A = -1.0f;
    private dp2 u;
    private final de2 v;
    private kp2 w;
    private FrameLayout x;
    private View y;
    private View z;

    public a(Context context) {
        super(context);
        context.setTheme(rd2.TopBar);
        setId(cj2.a());
        this.v = new de2(this);
        this.w = new kp2(getContext());
        E();
    }

    private View C() {
        View view = new View(getContext());
        view.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 80;
        view.setLayoutParams(layoutParams);
        return view;
    }

    private LinearLayout D() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    private void E() {
        setId(cj2.a());
        setFitsSystemWindows(true);
        this.u = F(getContext());
        this.w = G();
        this.y = C();
        LinearLayout D = D();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.x = frameLayout;
        frameLayout.setId(cj2.a());
        D.addView(this.u, -1, xj2.e(getContext()));
        D.addView(this.w);
        this.x.addView(D);
        this.x.addView(this.y);
        addView(this.x, -1, -2);
    }

    private kp2 G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.u.getId());
        kp2 kp2 = new kp2(getContext());
        kp2.setLayoutParams(layoutParams);
        kp2.setVisibility(8);
        return kp2;
    }

    public void A() {
        this.u.S();
    }

    public void B() {
        this.w.Q();
    }

    public dp2 F(Context context) {
        dp2 dp2 = new dp2(context);
        dp2.setId(cj2.a());
        return dp2;
    }

    public void H() {
        this.v.e();
        ((AppBarLayout.d) this.x.getLayoutParams()).d(0);
    }

    public void I(fe2 fe2) {
        this.v.f(fe2);
        ((AppBarLayout.d) this.x.getLayoutParams()).d(1);
    }

    public void J(ViewPager viewPager) {
        this.w.setVisibility(0);
        this.w.R(viewPager);
    }

    public void K(int i) {
        this.u.e0(i);
    }

    public void L(ll2 ll2) {
        K(ll2.p0());
    }

    public void M(int i, Typeface typeface) {
        this.w.S(i, typeface);
    }

    public List<MenuItem> getRightButtons() {
        return this.u.getRightButtons();
    }

    public int getRightButtonsCount() {
        return this.u.getRightButtonsCount();
    }

    public String getTitle() {
        return this.u.getTitle();
    }

    public dp2 getTitleBar() {
        return this.u;
    }

    public kp2 getTopTabs() {
        return this.w;
    }

    public void setBackButton(ll2 ll2) {
        this.u.setBackButton(ll2);
    }

    public void setBackgroundComponent(View view) {
        if (this.z != view && view.getParent() == null) {
            this.z = view;
            this.x.addView(view, 0);
        }
    }

    public void setBorderColor(int i) {
        this.y.setBackgroundColor(i);
    }

    public void setBorderHeight(double d) {
        this.y.getLayoutParams().height = (int) xj2.a(getContext(), (float) d);
    }

    public void setElevation(Double d) {
        if (Build.VERSION.SDK_INT >= 21 && getElevation() != d.floatValue()) {
            float a = xj2.a(getContext(), d.floatValue());
            this.A = a;
            setElevation(a);
        }
    }

    public void setHeight(int i) {
        int b = xj2.b(getContext(), i);
        if (b != getLayoutParams().height) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = b;
            setLayoutParams(layoutParams);
        }
    }

    public void setLayoutDirection(te2 te2) {
        this.u.setLayoutDirection(te2.d());
    }

    public void setOverflowButtonColor(int i) {
        this.u.setOverflowButtonColor(i);
    }

    public void setSubtitle(String str) {
        this.u.setSubtitle(str);
    }

    public void setSubtitleAlignment(ge2 ge2) {
        this.u.setSubtitleAlignment(ge2);
    }

    public void setSubtitleColor(int i) {
        this.u.setSubtitleTextColor(i);
    }

    public void setSubtitleFontFamily(Typeface typeface) {
        this.u.setSubtitleTypeface(typeface);
    }

    public void setSubtitleFontSize(double d) {
        this.u.setSubtitleFontSize(d);
    }

    public void setTestId(String str) {
        setTag(str);
    }

    public void setTitle(String str) {
        this.u.setTitle(str);
    }

    public void setTitleAlignment(ge2 ge2) {
        this.u.setTitleAlignment(ge2);
    }

    public void setTitleComponent(View view) {
        this.u.setComponent(view);
    }

    public void setTitleFontSize(double d) {
        this.u.setTitleFontSize(d);
    }

    public void setTitleHeight(int i) {
        this.u.setHeight(i);
    }

    public void setTitleTextColor(int i) {
        this.u.setTitleTextColor(i);
    }

    public void setTitleTopMargin(int i) {
        this.u.setTopMargin(i);
    }

    public void setTitleTypeface(Typeface typeface) {
        this.u.setTitleTypeface(typeface);
    }

    public void setTopTabsHeight(int i) {
        if (this.w.getLayoutParams().height != i) {
            ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
            if (i > 0) {
                i = xj2.b(getContext(), i);
            }
            layoutParams.height = i;
            kp2 kp2 = this.w;
            kp2.setLayoutParams(kp2.getLayoutParams());
        }
    }

    public void setTopTabsVisible(boolean z2) {
        this.w.T(this, z2);
    }

    public void w(uf2 uf2, uf2 uf22) {
        this.w.O(uf2, uf22);
    }

    public void x(fg2 fg2) {
        this.w.P(fg2);
    }

    public void y() {
        View view = this.z;
        if (view != null) {
            this.x.removeView(view);
            this.z = null;
        }
    }

    public void z() {
        this.u.setLeftButtons(Collections.emptyList());
    }

    @Override // com.google.android.material.appbar.AppBarLayout
    public void setElevation(float f) {
        if (f == this.A && Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
    }
}
