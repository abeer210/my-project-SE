package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.scroll.f;
import com.facebook.yoga.g;
import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager<e> implements f.a<e> {
    public static final String REACT_CLASS = null;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private a mFpsListener;

    static {
        C0201.m83(ReactScrollViewManager.class, 446);
    }

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        e.b a = e.a();
        String b = i.b(i.SCROLL);
        String r2 = C0201.m82(2177);
        a.b(b, e.d(r2, C0201.m82(2178)));
        a.b(i.b(i.BEGIN_DRAG), e.d(r2, C0201.m82(2179)));
        a.b(i.b(i.END_DRAG), e.d(r2, C0201.m82(2180)));
        a.b(i.b(i.MOMENTUM_BEGIN), e.d(r2, C0201.m82(2181)));
        a.b(i.b(i.MOMENTUM_END), e.d(r2, C0201.m82(2182)));
        return a.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(2183);
    }

    @yj0(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(e eVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        eVar.s(SPACING_TYPES[i], intValue, f);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(e eVar, int i, float f) {
        if (!g.a(f)) {
            f = q.c(f);
        }
        if (i == 0) {
            eVar.setBorderRadius(f);
        } else {
            eVar.t(f, i - 1);
        }
    }

    @xj0(name = "borderStyle")
    public void setBorderStyle(e eVar, String str) {
        eVar.setBorderStyle(str);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(e eVar, int i, float f) {
        if (!g.a(f)) {
            f = q.c(f);
        }
        eVar.u(SPACING_TYPES[i], f);
    }

    @xj0(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(e eVar, int i) {
        eVar.setEndFillColor(i);
    }

    @xj0(name = "decelerationRate")
    public void setDecelerationRate(e eVar, float f) {
        eVar.setDecelerationRate(f);
    }

    @xj0(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(e eVar, boolean z) {
        eVar.setDisableIntervalMomentum(z);
    }

    @xj0(name = "fadingEdgeLength")
    public void setFadingEdgeLength(e eVar, int i) {
        if (i > 0) {
            eVar.setVerticalFadingEdgeEnabled(true);
            eVar.setFadingEdgeLength(i);
            return;
        }
        eVar.setVerticalFadingEdgeEnabled(false);
        eVar.setFadingEdgeLength(0);
    }

    @xj0(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(e eVar, boolean z) {
        k3.s0(eVar, z);
    }

    @xj0(name = "overScrollMode")
    public void setOverScrollMode(e eVar, String str) {
        eVar.setOverScrollMode(g.h(str));
    }

    @xj0(name = "overflow")
    public void setOverflow(e eVar, String str) {
        eVar.setOverflow(str);
    }

    @xj0(name = "pagingEnabled")
    public void setPagingEnabled(e eVar, boolean z) {
        eVar.setPagingEnabled(z);
    }

    @xj0(name = "persistentScrollbar")
    public void setPersistentScrollbar(e eVar, boolean z) {
        eVar.setScrollbarFadingEnabled(!z);
    }

    @xj0(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z) {
        eVar.setRemoveClippedSubviews(z);
    }

    @xj0(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(e eVar, boolean z) {
        eVar.setScrollEnabled(z);
        eVar.setFocusable(z);
    }

    @xj0(name = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @xj0(name = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z) {
        eVar.setSendMomentumEvents(z);
    }

    @xj0(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(e eVar, boolean z) {
        eVar.setVerticalScrollBarEnabled(z);
    }

    @xj0(name = "snapToEnd")
    public void setSnapToEnd(e eVar, boolean z) {
        eVar.setSnapToEnd(z);
    }

    @xj0(name = "snapToInterval")
    public void setSnapToInterval(e eVar, float f) {
        eVar.setSnapInterval((int) (f * c.e().density));
    }

    @xj0(name = "snapToOffsets")
    public void setSnapToOffsets(e eVar, ReadableArray readableArray) {
        DisplayMetrics e = c.e();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d = readableArray.getDouble(i);
            double d2 = (double) e.density;
            Double.isNaN(d2);
            arrayList.add(Integer.valueOf((int) (d * d2)));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @xj0(name = "snapToStart")
    public void setSnapToStart(e eVar, boolean z) {
        eVar.setSnapToStart(z);
    }

    public ReactScrollViewManager(a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(k0 k0Var) {
        return new e(k0Var, this.mFpsListener);
    }

    public void flashScrollIndicators(e eVar) {
        eVar.k();
    }

    public void scrollTo(e eVar, f.b bVar) {
        if (bVar.c) {
            eVar.q(bVar.a, bVar.b);
        } else {
            eVar.p(bVar.a, bVar.b);
        }
    }

    public void scrollToEnd(e eVar, f.c cVar) {
        View childAt = eVar.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight() + eVar.getPaddingBottom();
            if (cVar.a) {
                eVar.q(eVar.getScrollX(), height);
            } else {
                eVar.p(eVar.getScrollX(), height);
            }
        } else {
            throw new RetryableMountingLayerException(C0201.m82(2184));
        }
    }

    public Object updateState(e eVar, c0 c0Var, j0 j0Var) {
        eVar.w(j0Var);
        return null;
    }

    public void receiveCommand(e eVar, int i, ReadableArray readableArray) {
        f.b(this, eVar, i, readableArray);
    }

    public void receiveCommand(e eVar, String str, ReadableArray readableArray) {
        f.c(this, eVar, str, readableArray);
    }
}
