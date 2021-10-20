package com.facebook.react.uimanager;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import vigqyno.C0201;

public class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final String REACT_CLASS = null;

    static {
        C0201.m83(RootViewManager.class, 676);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(35597);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(k0 k0Var) {
        return new FrameLayout(k0Var);
    }
}
