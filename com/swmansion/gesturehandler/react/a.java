package com.swmansion.gesturehandler.react;

import android.os.Bundle;
import android.view.MotionEvent;
import vigqyno.C0201;

/* compiled from: RNGestureHandlerEnabledRootView */
public class a extends zi0 {
    private si0 v;
    private g w;

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g gVar = this.w;
        if (gVar == null || !gVar.d(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // defpackage.zi0
    public void r(si0 si0, String str, Bundle bundle) {
        super.r(si0, str, bundle);
        this.v = si0;
    }

    @Override // defpackage.zi0
    public void requestDisallowInterceptTouchEvent(boolean z) {
        g gVar = this.w;
        if (gVar != null) {
            gVar.h(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void v() {
        if (this.w == null) {
            this.w = new g(this.v.v(), this);
            return;
        }
        throw new IllegalStateException(C0201.m82(18915) + this);
    }

    public void w() {
        g gVar = this.w;
        if (gVar != null) {
            gVar.i();
            this.w = null;
        }
    }
}
