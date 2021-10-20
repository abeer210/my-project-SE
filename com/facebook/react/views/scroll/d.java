package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.views.view.e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ReactHorizontalScrollView */
public class d extends HorizontalScrollView implements t {
    private static Field E;
    private static boolean F;
    private e A = new e(this);
    private boolean B = false;
    private j0 C;
    private final Rect D = new Rect();
    private final b a = new b();
    private final OverScroller b;
    private final j c = new j();
    private final Rect d = new Rect();
    private boolean e;
    private Rect f;
    private String g = C0201.m82(21470);
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
    /* compiled from: ReactHorizontalScrollView */
    public class a implements Runnable {
        private boolean a = false;

        public a() {
        }

        public void run() {
            if (d.this.e) {
                d.this.e = false;
                k3.b0(d.this, this, 20);
                return;
            }
            d dVar = d.this;
            dVar.C(dVar.getScrollX(), d.this.getScrollY());
            if (!d.this.i || this.a) {
                if (d.this.m) {
                    g.g(d.this);
                }
                d.this.j = null;
                d.this.i();
                return;
            }
            this.a = true;
            d.this.l(0);
            k3.b0(d.this, this, 20);
        }
    }

    static {
        C0201.m83(d.class, 481);
    }

    public d(Context context, a aVar) {
        super(context);
        this.n = aVar;
        this.b = getOverScrollerFromParent();
    }

    private void A(int i2) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i3 = scrollX / width;
        if (scrollX % width != 0) {
            i3++;
        }
        int i4 = i2 == 17 ? i3 - 1 : i3 + 1;
        if (i4 < 0) {
            i4 = 0;
        }
        u(i4 * width, getScrollY());
        n(0, 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void C(int i2, int i3) {
        if (this.C != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(C0201.m82(21471), (double) q.a((float) i2));
            writableNativeMap.putDouble(C0201.m82(21472), (double) q.a((float) i3));
            this.C.a(writableNativeMap);
        }
    }

    private OverScroller getOverScrollerFromParent() {
        boolean z2 = F;
        String r1 = C0201.m82(21473);
        if (!z2) {
            F = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField(C0201.m82(21474));
                E = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                f60.A(r1, C0201.m82(21475));
            }
        }
        Field field = E;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            f60.A(r1, C0201.m82(21476));
            return null;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(C0201.m82(21477), e2);
        }
    }

    private int getSnapInterval() {
        int i2 = this.v;
        if (i2 != 0) {
            return i2;
        }
        return getWidth();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i() {
        if (q()) {
            yh0.c(this.n);
            yh0.c(this.o);
            this.n.b(this.o);
        }
    }

    private void j() {
        if (q()) {
            yh0.c(this.n);
            yh0.c(this.o);
            this.n.a(this.o);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getChildCount() > 0) {
            if (this.v == 0 && this.x == null) {
                z(i2);
                return;
            }
            int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
            int s = s(i2);
            if (this.u) {
                s = getScrollX();
            }
            int width = (getWidth() - k3.B(this)) - k3.A(this);
            boolean z2 = q2.b(Locale.getDefault()) == 1;
            if (z2) {
                s = max - s;
                i3 = -i2;
            } else {
                i3 = i2;
            }
            List<Integer> list = this.x;
            if (list != null) {
                i7 = list.get(0).intValue();
                List<Integer> list2 = this.x;
                i6 = list2.get(list2.size() - 1).intValue();
                i4 = max;
                i5 = 0;
                for (int i9 = 0; i9 < this.x.size(); i9++) {
                    int intValue = this.x.get(i9).intValue();
                    if (intValue <= s && s - intValue < s - i5) {
                        i5 = intValue;
                    }
                    if (intValue >= s && intValue - s < i4 - s) {
                        i4 = intValue;
                    }
                }
            } else {
                double snapInterval = (double) getSnapInterval();
                double d2 = (double) s;
                Double.isNaN(d2);
                Double.isNaN(snapInterval);
                double d3 = d2 / snapInterval;
                double floor = Math.floor(d3);
                Double.isNaN(snapInterval);
                double ceil = Math.ceil(d3);
                Double.isNaN(snapInterval);
                i6 = max;
                i5 = (int) (floor * snapInterval);
                i4 = Math.min((int) (ceil * snapInterval), max);
                i7 = 0;
            }
            int i10 = s - i5;
            int i11 = i4 - s;
            int i12 = i10 < i11 ? i5 : i4;
            int scrollX = getScrollX();
            if (z2) {
                scrollX = max - scrollX;
            }
            if (this.z || s < i6) {
                if (this.y || s > i7) {
                    if (i3 > 0) {
                        double d4 = (double) i11;
                        Double.isNaN(d4);
                        i3 += (int) (d4 * 10.0d);
                        s = i4;
                    } else if (i3 < 0) {
                        double d5 = (double) i10;
                        Double.isNaN(d5);
                        i3 -= (int) (d5 * 10.0d);
                        s = i5;
                    } else {
                        s = i12;
                    }
                } else if (scrollX > i7) {
                    s = i7;
                }
            } else if (scrollX < i6) {
                s = i6;
            }
            int min = Math.min(Math.max(0, s), max);
            if (z2) {
                min = max - min;
                i3 = -i3;
            }
            OverScroller overScroller = this.b;
            if (overScroller != null) {
                this.e = true;
                int scrollX2 = getScrollX();
                int scrollY = getScrollY();
                if (i3 != 0) {
                    i8 = i3;
                } else {
                    i8 = min - getScrollX();
                }
                overScroller.fling(scrollX2, scrollY, i8, 0, min, min, 0, 0, (min == 0 || min == max) ? width / 2 : 0, 0);
                postInvalidateOnAnimation();
                return;
            }
            u(min, getScrollY());
        }
    }

    private int m(View view) {
        view.getDrawingRect(this.D);
        offsetDescendantRectToMyCoords(view, this.D);
        return computeScrollDeltaToGetChildRectOnScreen(this.D);
    }

    private void n(int i2, int i3) {
        if ((this.m || this.i || q()) && this.j == null) {
            if (this.m) {
                g.f(this, i2, i3);
            }
            this.e = false;
            a aVar = new a();
            this.j = aVar;
            k3.b0(this, aVar, 20);
        }
    }

    private boolean o(View view) {
        int m2 = m(view);
        view.getDrawingRect(this.D);
        return m2 != 0 && Math.abs(m2) < this.D.width() / 2;
    }

    private boolean p(View view) {
        int m2 = m(view);
        view.getDrawingRect(this.D);
        return m2 != 0 && Math.abs(m2) < this.D.width();
    }

    private boolean q() {
        String str;
        return (this.n == null || (str = this.o) == null || str.isEmpty()) ? false : true;
    }

    private boolean r(View view) {
        return m(view) == 0;
    }

    private int s(int i2) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.w);
        overScroller.fling(getScrollX(), getScrollY(), i2, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - k3.B(this)) - k3.A(this)) / 2, 0);
        return overScroller.getFinalX();
    }

    private void v(View view) {
        int m2 = m(view);
        if (m2 != 0) {
            scrollBy(m2, 0);
        }
    }

    private void z(int i2) {
        double snapInterval = (double) getSnapInterval();
        double scrollX = (double) getScrollX();
        double s = (double) s(i2);
        Double.isNaN(scrollX);
        Double.isNaN(snapInterval);
        double d2 = scrollX / snapInterval;
        int floor = (int) Math.floor(d2);
        int ceil = (int) Math.ceil(d2);
        int round = (int) Math.round(d2);
        Double.isNaN(s);
        Double.isNaN(snapInterval);
        int round2 = (int) Math.round(s / snapInterval);
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
        if (d4 != scrollX) {
            this.e = true;
            u((int) d4, getScrollY());
        }
    }

    public void B(j0 j0Var) {
        this.C = j0Var;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (!this.i || this.B) {
            super.addFocusables(arrayList, i2, i3);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i2, i3);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (r(view) || p(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    public boolean arrowScroll(int i2) {
        if (!this.i) {
            return super.arrowScroll(i2);
        }
        boolean z2 = true;
        this.B = true;
        if (getChildCount() > 0) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i2);
            View childAt = getChildAt(0);
            if (childAt == null || findNextFocus == null || findNextFocus.getParent() != childAt) {
                A(i2);
            } else {
                if (!r(findNextFocus) && !o(findNextFocus)) {
                    A(i2);
                }
                findNextFocus.requestFocus();
            }
        } else {
            z2 = false;
        }
        this.B = false;
        return z2;
    }

    public void draw(Canvas canvas) {
        if (this.q != 0) {
            View childAt = getChildAt(0);
            if (!(this.p == null || childAt == null || childAt.getRight() >= getWidth())) {
                this.p.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.p.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.l || (keyCode != 21 && keyCode != 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void fling(int i2) {
        int abs = (int) (((float) Math.abs(i2)) * Math.signum(this.a.a()));
        if (this.i) {
            l(abs);
        } else if (this.b != null) {
            this.b.fling(getScrollX(), getScrollY(), abs, 0, 0, C0188.f24, 0, 0, ((getWidth() - k3.B(this)) - k3.A(this)) / 2, 0);
            k3.Z(this);
        } else {
            super.fling(abs);
        }
        n(abs, 0);
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

    public void onDraw(Canvas canvas) {
        getDrawingRect(this.d);
        String str = this.g;
        if (((str.hashCode() == 466743410 && str.equals(C0201.m82(21478))) ? (char) 0 : 65535) != 0) {
            canvas.clipRect(this.d);
        }
        super.onDraw(canvas);
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
            f60.B(C0201.m82(21479), C0201.m82(21480), e2);
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        t(getScrollX(), getScrollY());
    }

    public void onMeasure(int i2, int i3) {
        k.a(i2, i3);
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        int computeHorizontalScrollRange;
        OverScroller overScroller = this.b;
        if (overScroller != null && !overScroller.isFinished() && this.b.getCurrX() != this.b.getFinalX() && i2 >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.b.abortAnimation();
            i2 = computeHorizontalScrollRange;
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
            C(getScrollX(), getScrollY());
            float b2 = this.c.b();
            float c2 = this.c.c();
            g.b(this, b2, c2);
            this.h = false;
            n(Math.round(b2), Math.round(c2));
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean pageScroll(int i2) {
        boolean pageScroll = super.pageScroll(i2);
        if (this.i && pageScroll) {
            n(0, 0);
        }
        return pageScroll;
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.i) {
            v(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setBackgroundColor(int i2) {
        this.A.b(i2);
    }

    public void setBorderRadius(float f2) {
        this.A.d(f2);
    }

    public void setBorderStyle(String str) {
        this.A.f(str);
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

    public void t(int i2, int i3) {
        scrollTo(i2, i3);
        C(i2, i3);
    }

    public void u(int i2, int i3) {
        smoothScrollTo(i2, i3);
        C(i2, i3);
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

    public void w(int i2, float f2, float f3) {
        this.A.c(i2, f2, f3);
    }

    public void x(float f2, int i2) {
        this.A.e(f2, i2);
    }

    public void y(int i2, float f2) {
        this.A.g(i2, f2);
    }
}
