package net.alhazmy13.hijridatepicker.date.hijri;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.text.SimpleDateFormat;
import java.util.Locale;
import net.alhazmy13.hijridatepicker.date.hijri.c;
import net.alhazmy13.hijridatepicker.date.hijri.d;
import net.alhazmy13.hijridatepicker.j;
import vigqyno.C0201;

/* compiled from: DayPickerView */
public abstract class b extends ListView implements AbsListView.OnScrollListener, c.AbstractC0158c {
    public static int k;
    private static SimpleDateFormat l = new SimpleDateFormat(C0201.m82(20546), Locale.getDefault());
    public float a = 1.0f;
    public Handler b;
    public d.a c;
    public d d;
    public d.a e;
    public int f = 0;
    public int g = 0;
    private a h;
    private boolean i;
    public RunnableC0157b j = new RunnableC0157b();

    /* access modifiers changed from: package-private */
    /* compiled from: DayPickerView */
    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public void run() {
            b.this.setSelection(this.a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: net.alhazmy13.hijridatepicker.date.hijri.b$b  reason: collision with other inner class name */
    /* compiled from: DayPickerView */
    public class RunnableC0157b implements Runnable {
        private int a;

        public RunnableC0157b() {
        }

        public void a(AbsListView absListView, int i) {
            b.this.b.removeCallbacks(this);
            this.a = i;
            b.this.b.postDelayed(this, 40);
        }

        public void run() {
            b bVar;
            int i;
            b.this.g = this.a;
            String r0 = C0201.m82(21745);
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(21746) + this.a + C0201.m82(21747) + b.this.f);
            }
            int i2 = this.a;
            if (i2 == 0 && (i = (bVar = b.this).f) != 0) {
                boolean z = true;
                if (i != 1) {
                    bVar.f = i2;
                    View childAt = bVar.getChildAt(0);
                    int i3 = 0;
                    while (childAt != null && childAt.getBottom() <= 0) {
                        i3++;
                        childAt = b.this.getChildAt(i3);
                    }
                    if (childAt != null) {
                        int firstVisiblePosition = b.this.getFirstVisiblePosition();
                        int lastVisiblePosition = b.this.getLastVisiblePosition();
                        if (firstVisiblePosition == 0 || lastVisiblePosition == b.this.getCount() - 1) {
                            z = false;
                        }
                        int top = childAt.getTop();
                        int bottom = childAt.getBottom();
                        int height = b.this.getHeight() / 2;
                        if (z && top < b.k) {
                            if (bottom > height) {
                                b.this.smoothScrollBy(top, 250);
                                return;
                            } else {
                                b.this.smoothScrollBy(bottom, 250);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            b.this.f = this.a;
        }
    }

    static {
        C0201.m83(b.class, 127);
    }

    public b(Context context, a aVar) {
        super(context);
        f(context);
        setController(aVar);
    }

    private d.a c() {
        e eVar;
        d.a accessibilityFocus;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof e) && (accessibilityFocus = (eVar = (e) childAt).getAccessibilityFocus()) != null) {
                if (Build.VERSION.SDK_INT == 17) {
                    eVar.c();
                }
                return accessibilityFocus;
            }
        }
        return null;
    }

    private static String d(d.a aVar, Locale locale) {
        in0 in0 = new in0();
        in0.set(aVar.b, aVar.c, aVar.d);
        return ((C0201.m82(20547) + in0.getDisplayName(2, 1, locale)) + C0201.m82(20548)) + l.format(in0.getTime());
    }

    private boolean j(d.a aVar) {
        if (aVar == null) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof e) && ((e) childAt).o(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.c.AbstractC0158c
    public void a() {
        e(this.h.q(), false, true, true);
    }

    public abstract d b(Context context, a aVar);

    public boolean e(d.a aVar, boolean z, boolean z2, boolean z3) {
        View childAt;
        String r5;
        if (z2) {
            this.c.a(aVar);
        }
        this.e.a(aVar);
        int p = (((aVar.b - this.h.p()) * 12) + aVar.c) - this.h.s().get(2);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            childAt = getChildAt(i2);
            r5 = C0201.m82(20549);
            if (childAt == null) {
                break;
            }
            int top = childAt.getTop();
            if (Log.isLoggable(r5, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0201.m82(20550));
                sb.append(i3 - 1);
                sb.append(C0201.m82(20551));
                sb.append(top);
                Log.d(r5, sb.toString());
            }
            if (top >= 0) {
                break;
            }
            i2 = i3;
        }
        int positionForView = childAt != null ? getPositionForView(childAt) : 0;
        if (z2) {
            this.d.f(this.c);
        }
        if (Log.isLoggable(r5, 3)) {
            Log.d(r5, C0201.m82(20552) + p);
        }
        if (p != positionForView || z3) {
            setMonthDisplayed(this.e);
            this.f = 2;
            if (z) {
                smoothScrollToPositionFromTop(p, k, 250);
                return true;
            }
            h(p);
        } else if (z2) {
            setMonthDisplayed(this.c);
        }
        return false;
    }

    public void f(Context context) {
        this.b = new Handler();
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setDrawSelectorOnTop(false);
        k();
    }

    public void g() {
        i();
    }

    public int getMostVisiblePosition() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int height = getHeight();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < height) {
            View childAt = getChildAt(i3);
            if (childAt == null) {
                break;
            }
            int bottom = childAt.getBottom();
            int min = Math.min(bottom, height) - Math.max(0, childAt.getTop());
            if (min > i4) {
                i5 = i3;
                i4 = min;
            }
            i3++;
            i2 = bottom;
        }
        return firstVisiblePosition + i5;
    }

    public void h(int i2) {
        clearFocus();
        post(new a(i2));
        onScrollStateChanged(this, 0);
    }

    public void i() {
        d dVar = this.d;
        if (dVar == null) {
            this.d = b(getContext(), this.h);
        } else {
            dVar.f(this.c);
        }
        setAdapter((ListAdapter) this.d);
    }

    public void k() {
        setCacheColorHint(0);
        setDivider(null);
        setItemsCanFocus(true);
        setFastScrollEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnScrollListener(this);
        setFadingEdgeLength(0);
        setFriction(ViewConfiguration.getScrollFriction() * this.a);
    }

    public void layoutChildren() {
        d.a c2 = c();
        super.layoutChildren();
        if (this.i) {
            this.i = false;
        } else {
            j(c2);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(-1);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        e eVar = (e) absListView.getChildAt(0);
        if (eVar != null) {
            absListView.getFirstVisiblePosition();
            eVar.getHeight();
            eVar.getBottom();
            this.f = this.g;
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        this.j.a(absListView, i2);
    }

    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        View childAt;
        if (i2 != 4096 && i2 != 8192) {
            return super.performAccessibilityAction(i2, bundle);
        }
        int firstVisiblePosition = getFirstVisiblePosition() + this.h.s().get(2);
        d.a aVar = new d.a((firstVisiblePosition / 12) + this.h.p(), firstVisiblePosition % 12, 1);
        if (i2 == 4096) {
            int i3 = aVar.c + 1;
            aVar.c = i3;
            if (i3 == 12) {
                aVar.c = 0;
                aVar.b++;
            }
        } else if (i2 == 8192 && (childAt = getChildAt(0)) != null && childAt.getTop() >= -1) {
            int i4 = aVar.c - 1;
            aVar.c = i4;
            if (i4 == -1) {
                aVar.c = 11;
                aVar.b--;
            }
        }
        j.g(this, d(aVar, this.h.r()));
        e(aVar, true, false, true);
        this.i = true;
        return true;
    }

    public void setController(a aVar) {
        this.h = aVar;
        aVar.n(this);
        this.c = new d.a(this.h.getTimeZone());
        this.e = new d.a(this.h.getTimeZone());
        l = new SimpleDateFormat(C0201.m82(20553), this.h.r());
        i();
        a();
    }

    public void setMonthDisplayed(d.a aVar) {
        int i2 = aVar.c;
        invalidateViews();
    }
}
