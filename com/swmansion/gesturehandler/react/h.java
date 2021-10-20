package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.view.f;
import vigqyno.C0201;

/* compiled from: RNGestureHandlerRootView */
public class h extends f {
    private boolean a;
    private g b;

    public h(Context context) {
        super(context);
    }

    private static boolean e(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof a) || (parent instanceof h)) {
                return true;
            }
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            g gVar = this.b;
            yh0.c(gVar);
            if (gVar.d(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void f() {
        g gVar = this.b;
        if (gVar != null) {
            gVar.i();
        }
    }

    @Override // com.facebook.react.views.view.f
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = !e(this);
        this.a = z;
        if (!z) {
            Log.i(C0201.m82(16988), C0201.m82(16989));
        }
        if (this.a && this.b == null) {
            this.b = new g((ReactContext) getContext(), this);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.a) {
            g gVar = this.b;
            yh0.c(gVar);
            gVar.h(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
