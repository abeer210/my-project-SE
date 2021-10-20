package com.facebook.react.views.viewpager;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.f;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: ReactViewPager */
public class d extends ViewPager {
    private final com.facebook.react.uimanager.events.d m0;
    private boolean n0;
    private boolean o0 = true;
    private final Runnable p0 = new a();

    /* compiled from: ReactViewPager */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            d dVar = d.this;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d.this.getHeight(), 1073741824));
            d dVar2 = d.this;
            dVar2.layout(dVar2.getLeft(), d.this.getTop(), d.this.getRight(), d.this.getBottom());
        }
    }

    /* compiled from: ReactViewPager */
    private class c implements ViewPager.j {
        private c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
            d.this.m0.v(new a(d.this.getId(), i, f));
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            String str;
            if (i == 0) {
                str = C0201.m82(2361);
            } else if (i == 1) {
                str = C0201.m82(2360);
            } else if (i == 2) {
                str = C0201.m82(2358);
            } else {
                throw new IllegalStateException(C0201.m82(2359));
            }
            d.this.m0.v(new b(d.this.getId(), str));
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            w30.t(i);
            try {
                if (!d.this.n0) {
                    d.this.m0.v(new c(d.this.getId(), i));
                }
            } finally {
                w30.u();
            }
        }

        public /* synthetic */ c(d dVar, a aVar) {
            this();
        }
    }

    public d(ReactContext reactContext) {
        super(reactContext);
        this.m0 = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.n0 = false;
        setOnPageChangeListener(new c(this, null));
        setAdapter(new b(this, null));
    }

    public void X(View view, int i) {
        getAdapter().x(view, i);
    }

    public View Y(int i) {
        return getAdapter().y(i);
    }

    public void Z(int i) {
        getAdapter().z(i);
    }

    public void a0(int i, boolean z) {
        this.n0 = true;
        P(i, z);
        this.n0 = false;
    }

    public int getViewCountInAdapter() {
        return getAdapter().h();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.p0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.o0) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                f.a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e) {
            f60.B(C0201.m82(17407), C0201.m82(17408), e);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o0) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            f60.B(C0201.m82(17409), C0201.m82(17410), e);
            return false;
        }
    }

    public void setScrollEnabled(boolean z) {
        this.o0 = z;
    }

    public void setViews(List<View> list) {
        getAdapter().A(list);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public b getAdapter() {
        return (b) super.getAdapter();
    }

    /* access modifiers changed from: private */
    /* compiled from: ReactViewPager */
    public class b extends androidx.viewpager.widget.a {
        private final List<View> c;
        private boolean d;

        private b() {
            this.c = new ArrayList();
            this.d = false;
        }

        public void A(List<View> list) {
            this.c.clear();
            this.c.addAll(list);
            n();
            this.d = false;
        }

        @Override // androidx.viewpager.widget.a
        public void e(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.a
        public int h() {
            return this.c.size();
        }

        @Override // androidx.viewpager.widget.a
        public int i(Object obj) {
            if (this.d || !this.c.contains(obj)) {
                return -2;
            }
            return this.c.indexOf(obj);
        }

        @Override // androidx.viewpager.widget.a
        public Object l(ViewGroup viewGroup, int i) {
            View view = this.c.get(i);
            viewGroup.addView(view, 0, d.this.generateDefaultLayoutParams());
            return view;
        }

        @Override // androidx.viewpager.widget.a
        public boolean m(View view, Object obj) {
            return view == obj;
        }

        public void x(View view, int i) {
            this.c.add(i, view);
            n();
            d.this.setOffscreenPageLimit(this.c.size());
        }

        public View y(int i) {
            return this.c.get(i);
        }

        public void z(int i) {
            this.c.remove(i);
            n();
            d.this.setOffscreenPageLimit(this.c.size());
        }

        public /* synthetic */ b(d dVar, a aVar) {
            this();
        }
    }
}
