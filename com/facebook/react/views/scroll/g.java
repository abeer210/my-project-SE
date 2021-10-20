package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.q0;
import vigqyno.C0201;

/* compiled from: ReactScrollViewHelper */
public class g {
    public static void a(ViewGroup viewGroup) {
        d(viewGroup, i.BEGIN_DRAG);
    }

    public static void b(ViewGroup viewGroup, float f, float f2) {
        e(viewGroup, i.END_DRAG, f, f2);
    }

    public static void c(ViewGroup viewGroup, float f, float f2) {
        e(viewGroup, i.SCROLL, f, f2);
    }

    private static void d(ViewGroup viewGroup, i iVar) {
        e(viewGroup, iVar, 0.0f, 0.0f);
    }

    private static void e(ViewGroup viewGroup, i iVar, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            q0.b((ReactContext) viewGroup.getContext(), viewGroup.getId()).v(h.n(viewGroup.getId(), iVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    public static void f(ViewGroup viewGroup, int i, int i2) {
        e(viewGroup, i.MOMENTUM_BEGIN, (float) i, (float) i2);
    }

    public static void g(ViewGroup viewGroup) {
        d(viewGroup, i.MOMENTUM_END);
    }

    public static int h(String str) {
        if (str == null || str.equals(C0201.m82(22306))) {
            return 1;
        }
        if (str.equals(C0201.m82(22307))) {
            return 0;
        }
        if (str.equals(C0201.m82(22308))) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(22309) + str);
    }
}
