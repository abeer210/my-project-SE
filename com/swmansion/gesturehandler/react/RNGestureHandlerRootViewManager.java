package com.swmansion.gesturehandler.react;

import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "GestureHandlerRootView")
public class RNGestureHandlerRootViewManager extends ViewGroupManager<h> {
    public static final String REACT_CLASS = null;

    static {
        C0201.m83(RNGestureHandlerRootViewManager.class, 677);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(7761);
        String r1 = C0201.m82(7762);
        Map d = e.d(r0, r1);
        String r3 = C0201.m82(7763);
        return e.e(r1, d, r3, e.d(r0, r3));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(7764);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(k0 k0Var) {
        return new h(k0Var);
    }

    public void onDropViewInstance(h hVar) {
        hVar.f();
    }
}
