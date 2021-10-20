package com.facebook.react.uimanager;

import com.facebook.react.common.e;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ViewManagerRegistry */
public final class a1 {
    private final Map<String, ViewManager> a;
    private final UIManagerModule.g b;

    public a1(UIManagerModule.g gVar) {
        this.a = e.b();
        this.b = gVar;
    }

    private ViewManager b(String str) {
        ViewManager b2 = this.b.b(str);
        if (b2 != null) {
            this.a.put(str, b2);
        }
        return b2;
    }

    public ViewManager a(String str) {
        ViewManager viewManager = this.a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.b != null) {
            ViewManager b2 = b(str);
            if (b2 != null) {
                return b2;
            }
            throw new g(C0201.m82(17382) + str);
        }
        throw new g(C0201.m82(17383) + str);
    }

    public ViewManager c(String str) {
        ViewManager viewManager = this.a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.b != null) {
            return b(str);
        }
        return null;
    }

    public a1(List<ViewManager> list) {
        HashMap b2 = e.b();
        for (ViewManager viewManager : list) {
            b2.put(viewManager.getName(), viewManager);
        }
        this.a = b2;
        this.b = null;
    }
}
