package com.reactnativenavigation.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.react.b0;
import defpackage.ll2;

@SuppressLint({"ViewConstructor"})
/* compiled from: ComponentLayout */
public class f extends CoordinatorLayout implements e, gl2, ll2.b {
    private b0 C;
    private final op2 D;

    public f(Context context, b0 b0Var) {
        super(context);
        this.C = b0Var;
        b0Var.v();
        addView(b0Var, ej2.a());
        this.D = new op2(b0Var);
    }

    @Override // defpackage.gl2
    public View a() {
        return this;
    }

    @Override // com.reactnativenavigation.views.k
    public boolean b() {
        return this.C.b();
    }

    @Override // defpackage.ll2.b
    public void c(String str) {
        this.C.d(str);
    }

    @Override // defpackage.gl2
    public void d(String str) {
        this.C.d(str);
    }

    public void d0(bf2 bf2) {
        this.D.e(bf2.f.a);
    }

    @Override // defpackage.fl2
    public void destroy() {
        this.C.destroy();
    }

    public boolean e0() {
        return this.C.w();
    }

    @Override // defpackage.gl2
    public void f(MotionEvent motionEvent) {
        this.C.f(motionEvent);
    }

    public void f0() {
        this.C.x(ni2.Component);
    }

    public void g0() {
        this.C.y(ni2.Component);
    }

    @Override // defpackage.gl2
    public fe2 getScrollEventListener() {
        return this.C.getScrollEventListener();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.D.d(motionEvent);
    }

    public void setInterceptTouchOutside(sf2 sf2) {
        this.D.e(sf2);
    }
}
