package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class MultiTouchViewPager extends ViewPager {
    private boolean m0;
    private boolean n0 = true;

    /* access modifiers changed from: package-private */
    public class a extends ViewPager.n {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.n, androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            MultiTouchViewPager.this.n0 = i == 0;
        }
    }

    public MultiTouchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        W();
    }

    private void W() {
        e(new a());
    }

    public boolean V() {
        return this.n0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1 || !this.m0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(false);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(true);
        return dispatchTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.m0 = z;
        super.requestDisallowInterceptTouchEvent(z);
    }
}
