package com.facebook.react.views.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.f;
import defpackage.j4;
import vigqyno.C0201;

/* compiled from: ReactDrawerLayout */
public class a extends j4 {
    private int R = 8388611;
    private int S = -1;

    public a(ReactContext reactContext) {
        super(reactContext);
    }

    public void W() {
        d(this.R);
    }

    public void X() {
        J(this.R);
    }

    public void Y(int i) {
        this.R = i;
        Z();
    }

    public void Z() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            j4.e eVar = (j4.e) childAt.getLayoutParams();
            eVar.a = this.R;
            ((ViewGroup.MarginLayoutParams) eVar).width = this.S;
            childAt.setLayoutParams(eVar);
            childAt.setClickable(true);
        }
    }

    public void a0(int i) {
        this.S = i;
        Z();
    }

    @Override // defpackage.j4
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            f.a(this, motionEvent);
            return true;
        } catch (IllegalArgumentException e) {
            f60.B(C0201.m82(35229), C0201.m82(35230), e);
            return false;
        }
    }
}
