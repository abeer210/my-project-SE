package com.facebook.react.views.scroll;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import java.lang.reflect.Field;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ReactScrollView */
public class e extends ScrollView implements t, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener {
    private static Field D;
    private static boolean E;
    private View A;
    private com.facebook.react.views.view.e B;
    private j0 C;
    private final b a = new b();
    private final OverScroller b;
    private final j c = new j();
    private final Rect d = new Rect();
    private boolean e;
    private Rect f;
    private String g = C0201.m82(22208);
    private boolean h;
    private boolean i = false;
    private Runnable j;
    private boolean k;
    private boolean l = true;
    private boolean m;
    private a n = null;
    private String o;
    private Drawable p;
    private int q = 0;
    private boolean u = false;
    private int v = 0;
    private float w = 0.985f;
    private List<Integer> x;
    private boolean y = true;
    private boolean z = true;

    /* access modifiers changed from: package-private */
    /* compiled from: ReactScrollView */
    public class a implements Runnable {
        private boolean a = false;

        public a() {
        }

        public void run() {
            if (e.this.e) {
                e.this.e = false;
                k3.b0(e.this, this, 20);
                return;
            }
            e eVar = e.this;
            eVar.x(eVar.getScrollX(), e.this.getScrollY());
            if (!e.this.i || this.a) {
                if (e.this.m) {
                    g.g(e.this);
                }
                e.this.j = null;
                e.this.i();
                return;
            }
            this.a = true;
            e.this.l(0);
            k3.b0(e.this, this, 20);
        }
    }

    static {
        C0201.m83(e.class, 656);
    }

    public e(ReactContext reactContext, a aVar) {
        super(reactContext);
        this.n = aVar;
        this.B = new com.facebook.react.views.view.e(this);
        this.b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    private int getMaxScrollY() {
        return Math.max(0, this.A.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        boolean z2 = E;
        String r1 = C0201.m82(22209);
        if (!z2) {
            E = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField(C0201.m82(22210));
                D = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                f60.A(r1, C0201.m82(22211));
            }
        }
        Field field = D;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            f60.A(r1, C0201.m82(22212));
            return null;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(C0201.m82(22213), e2);
        }
    }

    private int getSnapInterval() {
        int i2 = this.v;
        if (i2 != 0) {
            return i2;
        }
        return getHeight();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i() {
        if (n()) {
            yh0.c(this.n);
            yh0.c(this.o);
            this.n.b(this.o);
        }
    }

    private void j() {
        if (n()) {
            yh0.c(this.n);
            yh0.c(this.o);
            this.n.a(this.o);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        if (getScrollY() <= r4) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    private void l(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        OverScroller overScroller;
        if (getChildCount() > 0) {
            if (this.v == 0 && this.x == null) {
                v(i2);
                return;
            }
            int maxScrollY = getMaxScrollY();
            int o2 = o(i2);
            if (this.u) {
                o2 = getScrollY();
            }
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            List<Integer> list = this.x;
            if (list != null) {
                i6 = list.get(0).intValue();
                List<Integer> list2 = this.x;
                i5 = list2.get(list2.size() - 1).intValue();
                i3 = maxScrollY;
                i4 = 0;
                for (int i8 = 0; i8 < this.x.size(); i8++) {
                    int intValue = this.x.get(i8).intValue();
                    if (intValue <= o2 && o2 - intValue < o2 - i4) {
                        i4 = intValue;
                    }
                    if (intValue >= o2 && intValue - o2 < i3 - o2) {
                        i3 = intValue;
                    }
                }
            } else {
                double snapInterval = (double) getSnapInterval();
                double d2 = (double) o2;
                Double.isNaN(d2);
                Double.isNaN(snapInterval);
                double d3 = d2 / snapInterval;
                double floor = Math.floor(d3);
                Double.isNaN(snapInterval);
                double ceil = Math.ceil(d3);
                Double.isNaN(snapInterval);
                i3 = Math.min((int) (ceil * snapInterval), maxScrollY);
                i5 = maxScrollY;
                i4 = (int) (floor * snapInterval);
                i6 = 0;
            }
            int i9 = o2 - i4;
            int i10 = i3 - o2;
            int i11 = i9 < i10 ? i4 : i3;
            if (this.z || o2 < i5) {
                if (this.y || o2 > i6) {
                    if (i2 > 0) {
                        double d4 = (double) i10;
                        Double.isNaN(d4);
                        i7 = i2 + ((int) (d4 * 10.0d));
                        i6 = i3;
                    } else if (i2 < 0) {
                        double d5 = (double) i9;
                        Double.isNaN(d5);
                        i7 = i2 - ((int) (d5 * 10.0d));
                        i6 = i4;
                    } else {
                        i7 = i2;
                        i6 = i11;
                    }
                    int min = Math.min(Math.max(0, i6), maxScrollY);
                    overScroller = this.b;
                    if (overScroller != null) {
                        this.e = true;
                        int scrollX = getScrollX();
                        int scrollY = getScrollY();
                        if (i7 == 0) {
                            i7 = min - getScrollY();
                        }
                        overScroller.fling(scrollX, scrollY, 0, i7, 0, 0, min, min, 0, (min == 0 || min == maxScrollY) ? height / 2 : 0);
                        postInvalidateOnAnimation();
                        return;
                    }
                    q(getScrollX(), min);
                    return;
                }
            } else if (getScrollY() < i5) {
                i7 = i2;
                i6 = i5;
                int min2 = Math.min(Math.max(0, i6), maxScrollY);
                overScroller = this.b;
                if (overScroller != null) {
                }
            }
            i6 = o2;
            i7 = i2;
            int min22 = Math.min(Math.max(0, i6), maxScrollY);
            overScroller = this.b;
            if (overScroller != null) {
            }
        }
    }

    private void m(int i2, int i3) {
        if ((this.m || this.i || n()) && this.j == null) {
            if (this.m) {
                j();
                g.f(this, i2, i3);
            }
            this.e = false;
            a aVar = new a();
            this.j = aVar;
            k3.b0(this, aVar, 20);
        }
    }

    private boolean n() {
        String str;
        return (this.n == null || (str = this.o) == null || str.isEmpty()) ? false : true;
    }

    private int o(int i2) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.w);
        overScroller.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    private void r(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void v(int i2) {
        double snapInterval = (double) getSnapInterval();
        double scrollY = (double) getScrollY();
        double o2 = (double) o(i2);
        Double.isNaN(scrollY);
        Double.isNaN(snapInterval);
        double d2 = scrollY / snapInterval;
        int floor = (int) Math.floor(d2);
        int ceil = (int) Math.ceil(d2);
        int round = (int) Math.round(d2);
        Double.isNaN(o2);
        Double.isNaN(snapInterval);
        int round2 = (int) Math.round(o2 / snapInterval);
        if (i2 > 0 && ceil == floor) {
            ceil++;
        } else if (i2 < 0 && floor == ceil) {
            floor--;
        }
        if (i2 > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i2 < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d3 = (double) round;
        Double.isNaN(d3);
        Double.isNaN(snapInterval);
        double d4 = d3 * snapInterval;
        if (d4 != scrollY) {
            this.e = true;
            q(getScrollX(), (int) d4);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x(int i2, int i3) {
        if (this.C != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(C0201.m82(22214), (double) q.a((float) i2));
            writableNativeMap.putDouble(C0201.m82(22215), (double) q.a((float) i3));
            this.C.a(writableNativeMap);
        }
    }

    public void draw(Canvas canvas) {
        char c2 = 0;
        if (this.q != 0) {
            View childAt = getChildAt(0);
            if (!(this.p == null || childAt == null || childAt.getBottom() >= getHeight())) {
                this.p.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.p.draw(canvas);
            }
        }
        getDrawingRect(this.d);
        String str = this.g;
        if (str.hashCode() != 466743410 || !str.equals(C0201.m82(22216))) {
            c2 = 65535;
        }
        if (c2 != 0) {
            canvas.clipRect(this.d);
        }
        super.draw(canvas);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.l || (keyCode != 19 && keyCode != 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void fling(int i2) {
        float signum = Math.signum(this.a.b());
        if (signum == 0.0f) {
            signum = Math.signum((float) i2);
        }
        int abs = (int) (((float) Math.abs(i2)) * signum);
        if (this.i) {
            l(abs);
        } else if (this.b != null) {
            this.b.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, C0188.f24, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            k3.Z(this);
        } else {
            super.fling(abs);
        }
        m(0, abs);
    }

    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        if (dj0.g) {
            return u.b(view, rect, point, this, this.g);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        Rect rect2 = this.f;
        yh0.c(rect2);
        rect.set(rect2);
    }

    @Override // com.facebook.react.uimanager.t
    public boolean getRemoveClippedSubviews() {
        return this.k;
    }

    public void k() {
        awakenScrollBars();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k) {
            updateClippingRect();
        }
    }

    public void onChildViewAdded(View view, View view2) {
        this.A = view2;
        view2.addOnLayoutChangeListener(this);
    }

    public void onChildViewRemoved(View view, View view2) {
        this.A.removeOnLayoutChangeListener(this);
        this.A = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.l) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                f.a(this, motionEvent);
                g.a(this);
                this.h = true;
                j();
                return true;
            }
        } catch (IllegalArgumentException e2) {
            f60.B(C0201.m82(22217), C0201.m82(22218), e2);
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        p(getScrollX(), getScrollY());
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int maxScrollY;
        if (this.A != null && getScrollY() > (maxScrollY = getMaxScrollY())) {
            p(getScrollX(), maxScrollY);
        }
    }

    public void onMeasure(int i2, int i3) {
        k.a(i2, i3);
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        int maxScrollY;
        OverScroller overScroller = this.b;
        if (!(overScroller == null || this.A == null || overScroller.isFinished() || this.b.getCurrY() == this.b.getFinalY() || i3 < (maxScrollY = getMaxScrollY()))) {
            this.b.abortAnimation();
            i3 = maxScrollY;
        }
        super.onOverScrolled(i2, i3, z2, z3);
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.e = true;
        if (this.a.c(i2, i3)) {
            if (this.k) {
                updateClippingRect();
            }
            g.c(this, this.a.a(), this.a.b());
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.k) {
            updateClippingRect();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l) {
            return false;
        }
        this.c.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.h) {
            x(getScrollX(), getScrollY());
            float b2 = this.c.b();
            float c2 = this.c.c();
            g.b(this, b2, c2);
            this.h = false;
            m(Math.round(b2), Math.round(c2));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p(int i2, int i3) {
        scrollTo(i2, i3);
        x(i2, i3);
    }

    public void q(int i2, int i3) {
        smoothScrollTo(i2, i3);
        x(i2, i3);
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            r(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void s(int i2, float f2, float f3) {
        this.B.c(i2, f2, f3);
    }

    public void setBackgroundColor(int i2) {
        this.B.b(i2);
    }

    public void setBorderRadius(float f2) {
        this.B.d(f2);
    }

    public void setBorderStyle(String str) {
        this.B.f(str);
    }

    public void setDecelerationRate(float f2) {
        this.w = f2;
        OverScroller overScroller = this.b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f2);
        }
    }

    public void setDisableIntervalMomentum(boolean z2) {
        this.u = z2;
    }

    public void setEndFillColor(int i2) {
        if (i2 != this.q) {
            this.q = i2;
            this.p = new ColorDrawable(this.q);
        }
    }

    public void setOverflow(String str) {
        this.g = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z2) {
        this.i = z2;
    }

    public void setRemoveClippedSubviews(boolean z2) {
        if (z2 && this.f == null) {
            this.f = new Rect();
        }
        this.k = z2;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z2) {
        this.l = z2;
    }

    public void setScrollPerfTag(String str) {
        this.o = str;
    }

    public void setSendMomentumEvents(boolean z2) {
        this.m = z2;
    }

    public void setSnapInterval(int i2) {
        this.v = i2;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.x = list;
    }

    public void setSnapToEnd(boolean z2) {
        this.z = z2;
    }

    public void setSnapToStart(boolean z2) {
        this.y = z2;
    }

    public void t(float f2, int i2) {
        this.B.e(f2, i2);
    }

    public void u(int i2, float f2) {
        this.B.g(i2, f2);
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (this.k) {
            yh0.c(this.f);
            u.a(this, this.f);
            View childAt = getChildAt(0);
            if (childAt instanceof t) {
                ((t) childAt).updateClippingRect();
            }
        }
    }

    public void w(j0 j0Var) {
        this.C = j0Var;
    }
}
