package com.facebook.react.uimanager;

import android.view.View;

public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, i> {
    @Override // com.facebook.react.uimanager.ViewManager
    public Class<i> getShadowNodeClass() {
        return i.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new i();
    }
}
