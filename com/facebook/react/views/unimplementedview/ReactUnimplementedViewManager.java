package com.facebook.react.views.unimplementedview;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

@pj0(name = "UnimplementedNativeView")
public class ReactUnimplementedViewManager extends ViewGroupManager<a> {
    public static final String REACT_CLASS = null;

    static {
        C0201.m83(ReactUnimplementedViewManager.class, 670);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(9078);
    }

    @xj0(name = "name")
    public void setName(a aVar, String str) {
        aVar.setName(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }
}
