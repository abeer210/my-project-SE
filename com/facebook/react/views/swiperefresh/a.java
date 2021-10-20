package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.q;

/* compiled from: ReactSwipeRefreshLayout */
public class a extends g5 {
    private boolean V = false;
    private boolean W = false;
    private float a0 = 0.0f;
    private int b0;
    private float c0;
    private boolean d0;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.b0 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c0 = motionEvent.getX();
            this.d0 = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.c0);
            if (this.d0 || abs > ((float) this.b0)) {
                this.d0 = true;
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.g5
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!B(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        f.a(this, motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // defpackage.g5
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.V) {
            this.V = true;
            setProgressViewOffset(this.a0);
            setRefreshing(this.W);
        }
    }

    @Override // defpackage.g5
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.a0 = f;
        if (this.V) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(q.c(f)) - progressCircleDiameter, Math.round(q.c(f + 64.0f) - ((float) progressCircleDiameter)));
        }
    }

    @Override // defpackage.g5
    public void setRefreshing(boolean z) {
        this.W = z;
        if (this.V) {
            super.setRefreshing(z);
        }
    }
}
