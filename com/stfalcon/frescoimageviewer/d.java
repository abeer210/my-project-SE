package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.stfalcon.frescoimageviewer.b;
import com.stfalcon.frescoimageviewer.f;
import com.stfalcon.frescoimageviewer.g;

/* compiled from: ImageViewerView */
public class d extends RelativeLayout implements e, g.c {
    private View a;
    private MultiTouchViewPager b;
    private c c;
    private f d;
    private ScaleGestureDetector e;
    private ViewPager.j f;
    private t2 g;
    private ViewGroup h;
    private g i;
    private View j;
    private f.a k;
    private jh0 l;
    private ca0 m;
    private boolean n;
    private e o;
    private boolean p;
    private boolean q = true;
    private boolean u = true;

    /* access modifiers changed from: package-private */
    /* compiled from: ImageViewerView */
    public class a extends f {
        public a(Context context) {
            super(context);
        }

        @Override // com.stfalcon.frescoimageviewer.f
        public void d(f.a aVar) {
            d.this.k = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ImageViewerView */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!d.this.b.V()) {
                return false;
            }
            d dVar = d.this;
            dVar.m(motionEvent, dVar.p);
            return false;
        }
    }

    /* compiled from: ImageViewerView */
    static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[f.a.values().length];
            a = iArr;
            iArr[f.a.UP.ordinal()] = 1;
            a[f.a.DOWN.ordinal()] = 2;
            a[f.a.LEFT.ordinal()] = 3;
            try {
                a[f.a.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public d(Context context) {
        super(context);
        i();
    }

    private boolean h(MotionEvent motionEvent) {
        View view = this.j;
        return view != null && view.getVisibility() == 0 && this.j.dispatchTouchEvent(motionEvent);
    }

    private void i() {
        RelativeLayout.inflate(getContext(), com.merryjs.PhotoViewer.g.image_viewer, this);
        this.a = findViewById(com.merryjs.PhotoViewer.f.backgroundView);
        this.b = (MultiTouchViewPager) findViewById(com.merryjs.PhotoViewer.f.pager);
        this.h = (ViewGroup) findViewById(com.merryjs.PhotoViewer.f.container);
        g gVar = new g(findViewById(com.merryjs.PhotoViewer.f.dismissView), this, this);
        this.i = gVar;
        this.h.setOnTouchListener(gVar);
        this.d = new a(getContext());
        this.e = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener());
        this.g = new t2(getContext(), new b());
    }

    private void k(MotionEvent motionEvent) {
        this.k = null;
        this.n = false;
        this.b.dispatchTouchEvent(motionEvent);
        this.i.onTouch(this.h, motionEvent);
        this.p = h(motionEvent);
    }

    private void l(MotionEvent motionEvent) {
        this.i.onTouch(this.h, motionEvent);
        this.b.dispatchTouchEvent(motionEvent);
        this.p = h(motionEvent);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m(MotionEvent motionEvent, boolean z) {
        View view = this.j;
        if (view != null && !z) {
            a.a(view);
            super.dispatchTouchEvent(motionEvent);
        }
    }

    private void n(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            l(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            k(motionEvent);
        }
        this.e.onTouchEvent(motionEvent);
        this.g.a(motionEvent);
    }

    private void w(int i2) {
        this.b.setCurrentItem(i2);
    }

    @Override // com.stfalcon.frescoimageviewer.g.c
    public void a(float f2, int i2) {
        float abs = 1.0f - (((1.0f / ((float) i2)) / 4.0f) * Math.abs(f2));
        this.a.setAlpha(abs);
        View view = this.j;
        if (view != null) {
            view.setAlpha(abs);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n(motionEvent);
        if (this.k == null && (this.e.isInProgress() || motionEvent.getPointerCount() > 1)) {
            this.n = true;
            return this.b.dispatchTouchEvent(motionEvent);
        } else if (this.c.K(this.b.getCurrentItem())) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            this.d.e(motionEvent);
            f.a aVar = this.k;
            if (aVar != null) {
                int i2 = c.a[aVar.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    if (this.u && !this.n && this.b.V()) {
                        return this.i.onTouch(this.h, motionEvent);
                    }
                } else if (i2 == 3 || i2 == 4) {
                    return this.b.dispatchTouchEvent(motionEvent);
                }
            }
            return true;
        }
    }

    public void f(boolean z) {
        this.u = z;
    }

    public void g(boolean z) {
        this.q = z;
    }

    public boolean j() {
        return this.c.K(this.b.getCurrentItem());
    }

    public void o() {
        this.c.N(this.b.getCurrentItem());
    }

    @Override // com.stfalcon.frescoimageviewer.e
    public void onDismiss() {
        e eVar = this.o;
        if (eVar != null) {
            eVar.onDismiss();
        }
    }

    public void p(int[] iArr) {
        this.b.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public void q(ca0 ca0) {
        this.m = ca0;
    }

    public void r(jh0 jh0) {
        this.l = jh0;
    }

    public void s(int i2) {
        this.b.setPageMargin(i2);
    }

    public void setBackgroundColor(int i2) {
        findViewById(com.merryjs.PhotoViewer.f.backgroundView).setBackgroundColor(i2);
    }

    public void t(e eVar) {
        this.o = eVar;
    }

    public void u(View view) {
        this.j = view;
        if (view != null) {
            this.h.addView(view);
        }
    }

    public void v(ViewPager.j jVar) {
        this.b.L(this.f);
        this.f = jVar;
        this.b.e(jVar);
        jVar.c(this.b.getCurrentItem());
    }

    public void x(b.d<?> dVar, int i2) {
        c cVar = new c(getContext(), dVar, this.l, this.m, this.q);
        this.c = cVar;
        this.b.setAdapter(cVar);
        w(i2);
    }
}
