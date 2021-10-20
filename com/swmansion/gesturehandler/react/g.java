package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.modal.c;
import vigqyno.C0201;

/* compiled from: RNGestureHandlerRootHelper */
public class g {
    private final ReactContext a;
    private final yp2 b;
    private final wp2 c;
    private final ViewGroup d;
    private boolean e = false;
    private boolean f = false;

    /* compiled from: RNGestureHandlerRootHelper */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            g.this.j();
        }
    }

    /* compiled from: RNGestureHandlerRootHelper */
    private class b extends wp2 {
        private b() {
        }

        @Override // defpackage.wp2
        public void B() {
            g.this.e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (g.this.d instanceof zi0) {
                ((zi0) g.this.d).g(obtain);
            } else {
                c.a(g.this.d, obtain);
            }
        }

        @Override // defpackage.wp2
        public void C(MotionEvent motionEvent) {
            if (p() == 0) {
                c();
                g.this.e = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                g();
            }
        }

        public /* synthetic */ b(g gVar, a aVar) {
            this();
        }
    }

    public g(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id >= 1) {
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
            f registry = rNGestureHandlerModule.getRegistry();
            this.d = e(viewGroup);
            Log.i(C0201.m82(18343), C0201.m82(18342) + this.d);
            this.a = reactContext;
            yp2 yp2 = new yp2(viewGroup, registry, new j());
            this.b = yp2;
            yp2.w(0.1f);
            b bVar = new b(this, null);
            this.c = bVar;
            bVar.M(-id);
            registry.h(this.c);
            registry.b(this.c.q(), id);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException(C0201.m82(18344) + viewGroup);
    }

    private static ViewGroup e(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        ViewParent viewParent = viewGroup;
        while (viewParent != null && !(viewParent instanceof zi0) && !c.b(viewParent)) {
            viewParent = viewParent.getParent();
        }
        if (viewParent != null) {
            return (ViewGroup) viewParent;
        }
        throw new IllegalStateException(C0201.m82(18345) + viewGroup + C0201.m82(18346));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j() {
        wp2 wp2 = this.c;
        if (wp2 != null && wp2.p() == 2) {
            this.c.a();
            this.c.g();
        }
    }

    public boolean d(MotionEvent motionEvent) {
        this.f = true;
        this.b.s(motionEvent);
        this.f = false;
        return this.e;
    }

    public ViewGroup f() {
        return this.d;
    }

    public void g(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    public void h(boolean z) {
        if (this.b != null && !this.f) {
            j();
        }
    }

    public void i() {
        Log.i(C0201.m82(18348), C0201.m82(18347) + this.d);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.a.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().e(this.c.q());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
