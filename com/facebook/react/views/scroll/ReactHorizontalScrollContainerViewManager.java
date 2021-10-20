package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.k0;
import com.facebook.react.views.view.ReactClippingViewManager;
import vigqyno.C0201;

@pj0(name = "AndroidHorizontalScrollContentView")
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<c> {
    public static final String REACT_CLASS = null;

    static {
        C0201.m83(ReactHorizontalScrollContainerViewManager.class, 224);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(31054);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(k0 k0Var) {
        return new c(k0Var);
    }
}
