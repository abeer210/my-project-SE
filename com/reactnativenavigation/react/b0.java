package com.reactnativenavigation.react;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.h;
import com.reactnativenavigation.views.k;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: ReactView */
public class b0 extends zi0 implements gl2, k {
    private final si0 v;
    private final String w;
    private final String x;
    private boolean y = false;
    private final h z;

    public b0(Context context, si0 si0, String str, String str2) {
        super(context);
        this.v = si0;
        this.w = str;
        this.x = str2;
        this.z = new h(this);
    }

    private void z() {
        if (!this.y) {
            this.y = true;
            Bundle bundle = new Bundle();
            bundle.putString(C0201.m82(21861), this.w);
            r(this.v, this.x, bundle);
        }
    }

    @Override // defpackage.gl2
    public /* bridge */ /* synthetic */ View a() {
        v();
        return this;
    }

    @Override // com.reactnativenavigation.views.k
    public boolean b() {
        return getChildCount() >= 1;
    }

    @Override // defpackage.gl2
    public void d(String str) {
        ReactContext v2 = this.v.v();
        if (v2 != null) {
            new oi2(v2).i(this.w, str);
        }
    }

    @Override // defpackage.fl2
    public void destroy() {
        t();
    }

    @Override // defpackage.gl2
    public void f(MotionEvent motionEvent) {
        this.z.c(motionEvent, getEventDispatcher());
    }

    public String getComponentName() {
        return this.x;
    }

    public d getEventDispatcher() {
        ReactContext v2 = this.v.v();
        if (v2 == null) {
            return null;
        }
        return ((UIManagerModule) v2.getNativeModule(UIManagerModule.class)).getEventDispatcher();
    }

    @Override // defpackage.gl2
    public fe2 getScrollEventListener() {
        return new fe2(getEventDispatcher());
    }

    @Override // defpackage.zi0
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z();
    }

    public b0 v() {
        return this;
    }

    public boolean w() {
        return this.y;
    }

    public void x(ni2 ni2) {
        ReactContext v2 = this.v.v();
        if (v2 != null) {
            new oi2(v2).f(this.w, this.x, ni2);
        }
    }

    public void y(ni2 ni2) {
        ReactContext v2 = this.v.v();
        if (v2 != null) {
            new oi2(v2).g(this.w, this.x, ni2);
        }
    }
}
