package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

@pj0(name = "RCTRawText")
public class ReactRawTextManager extends ViewManager<View, k> {
    public static final String REACT_CLASS = null;

    static {
        C0201.m83(ReactRawTextManager.class, 654);
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(35408);
    }

    /* Return type fixed from 'java.lang.Class<com.facebook.react.views.text.k>' to match base method */
    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends k> getShadowNodeClass() {
        return k.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public k createShadowNodeInstance() {
        return new k();
    }

    /* Return type fixed from 'com.facebook.react.views.text.r' to match base method */
    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(k0 k0Var) {
        throw new IllegalStateException(C0201.m82(35407));
    }
}
