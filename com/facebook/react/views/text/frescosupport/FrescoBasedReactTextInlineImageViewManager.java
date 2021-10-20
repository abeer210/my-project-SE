package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

@pj0(name = "RCTTextInlineImage")
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, a> {
    public static final String REACT_CLASS = null;
    private final Object mCallerContext;
    private final x80 mDraweeControllerBuilder;

    static {
        C0201.m83(FrescoBasedReactTextInlineImageViewManager.class, 600);
    }

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(k0 k0Var) {
        throw new IllegalStateException(C0201.m82(30897));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(30898);
    }

    /* Return type fixed from 'java.lang.Class<com.facebook.react.views.text.frescosupport.a>' to match base method */
    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends a> getShadowNodeClass() {
        return a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager(x80 x80, Object obj) {
        this.mDraweeControllerBuilder = x80;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createShadowNodeInstance() {
        x80 x80 = this.mDraweeControllerBuilder;
        if (x80 == null) {
            x80 = c80.f();
        }
        return new a(x80, this.mCallerContext);
    }
}
