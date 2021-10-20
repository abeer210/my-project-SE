package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

@pj0(name = "RCTVirtualText")
public class ReactVirtualTextViewManager extends BaseViewManager<View, v> {
    public static final String REACT_CLASS = null;

    static {
        C0201.m83(ReactVirtualTextViewManager.class, 633);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(k0 k0Var) {
        throw new IllegalStateException(C0201.m82(1318));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(1319);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<v> getShadowNodeClass() {
        return v.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public v createShadowNodeInstance() {
        return new v();
    }
}
