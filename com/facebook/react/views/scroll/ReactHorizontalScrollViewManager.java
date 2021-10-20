package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.scroll.f;
import com.facebook.yoga.g;
import java.util.ArrayList;
import vigqyno.C0201;

@pj0(name = "AndroidHorizontalScrollView")
public class ReactHorizontalScrollViewManager extends ViewGroupManager<d> implements f.a<d> {
    public static final String REACT_CLASS = null;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    static {
        C0201.m83(ReactHorizontalScrollViewManager.class, 340);
    }

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(21343);
    }

    @yj0(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(d dVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        dVar.w(SPACING_TYPES[i], intValue, f);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(d dVar, int i, float f) {
        if (!g.a(f)) {
            f = q.c(f);
        }
        if (i == 0) {
            dVar.setBorderRadius(f);
        } else {
            dVar.x(f, i - 1);
        }
    }

    @xj0(name = "borderStyle")
    public void setBorderStyle(d dVar, String str) {
        dVar.setBorderStyle(str);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(d dVar, int i, float f) {
        if (!g.a(f)) {
            f = q.c(f);
        }
        dVar.y(SPACING_TYPES[i], f);
    }

    @xj0(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(d dVar, int i) {
        dVar.setEndFillColor(i);
    }

    @xj0(name = "decelerationRate")
    public void setDecelerationRate(d dVar, float f) {
        dVar.setDecelerationRate(f);
    }

    @xj0(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(d dVar, boolean z) {
        dVar.setDisableIntervalMomentum(z);
    }

    @xj0(name = "fadingEdgeLength")
    public void setFadingEdgeLength(d dVar, int i) {
        if (i > 0) {
            dVar.setHorizontalFadingEdgeEnabled(true);
            dVar.setFadingEdgeLength(i);
            return;
        }
        dVar.setHorizontalFadingEdgeEnabled(false);
        dVar.setFadingEdgeLength(0);
    }

    @xj0(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(d dVar, boolean z) {
        k3.s0(dVar, z);
    }

    @xj0(name = "overScrollMode")
    public void setOverScrollMode(d dVar, String str) {
        dVar.setOverScrollMode(g.h(str));
    }

    @xj0(name = "overflow")
    public void setOverflow(d dVar, String str) {
        dVar.setOverflow(str);
    }

    @xj0(name = "pagingEnabled")
    public void setPagingEnabled(d dVar, boolean z) {
        dVar.setPagingEnabled(z);
    }

    @xj0(name = "persistentScrollbar")
    public void setPersistentScrollbar(d dVar, boolean z) {
        dVar.setScrollbarFadingEnabled(!z);
    }

    @xj0(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(d dVar, boolean z) {
        dVar.setRemoveClippedSubviews(z);
    }

    @xj0(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.setScrollEnabled(z);
    }

    @xj0(name = "scrollPerfTag")
    public void setScrollPerfTag(d dVar, String str) {
        dVar.setScrollPerfTag(str);
    }

    @xj0(name = "sendMomentumEvents")
    public void setSendMomentumEvents(d dVar, boolean z) {
        dVar.setSendMomentumEvents(z);
    }

    @xj0(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(d dVar, boolean z) {
        dVar.setHorizontalScrollBarEnabled(z);
    }

    @xj0(name = "snapToEnd")
    public void setSnapToEnd(d dVar, boolean z) {
        dVar.setSnapToEnd(z);
    }

    @xj0(name = "snapToInterval")
    public void setSnapToInterval(d dVar, float f) {
        dVar.setSnapInterval((int) (f * c.e().density));
    }

    @xj0(name = "snapToOffsets")
    public void setSnapToOffsets(d dVar, ReadableArray readableArray) {
        DisplayMetrics e = c.e();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d = readableArray.getDouble(i);
            double d2 = (double) e.density;
            Double.isNaN(d2);
            arrayList.add(Integer.valueOf((int) (d * d2)));
        }
        dVar.setSnapOffsets(arrayList);
    }

    @xj0(name = "snapToStart")
    public void setSnapToStart(d dVar, boolean z) {
        dVar.setSnapToStart(z);
    }

    public ReactHorizontalScrollViewManager(a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(k0 k0Var) {
        return new d(k0Var, this.mFpsListener);
    }

    public void flashScrollIndicators(d dVar) {
        dVar.k();
    }

    public void scrollTo(d dVar, f.b bVar) {
        if (bVar.c) {
            dVar.u(bVar.a, bVar.b);
        } else {
            dVar.t(bVar.a, bVar.b);
        }
    }

    public void scrollToEnd(d dVar, f.c cVar) {
        int width = dVar.getChildAt(0).getWidth() + dVar.getPaddingRight();
        if (cVar.a) {
            dVar.u(width, dVar.getScrollY());
        } else {
            dVar.t(width, dVar.getScrollY());
        }
    }

    public Object updateState(d dVar, c0 c0Var, j0 j0Var) {
        dVar.B(j0Var);
        return null;
    }

    public void receiveCommand(d dVar, int i, ReadableArray readableArray) {
        f.b(this, dVar, i, readableArray);
    }

    public void receiveCommand(d dVar, String str, ReadableArray readableArray) {
        f.c(this, dVar, str, readableArray);
    }
}
