package com.facebook.react.views.art;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

public class ARTRenderableViewManager extends ViewManager<View, a0> {
    public static final String CLASS_GROUP = null;
    public static final String CLASS_SHAPE = null;
    public static final String CLASS_TEXT = null;
    private final String mClassName;

    static {
        C0201.m83(ARTRenderableViewManager.class, 546);
    }

    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a0 createShadowNodeInstance() {
        if (C0201.m82(2411).equals(this.mClassName)) {
            return new a();
        }
        if (C0201.m82(2412).equals(this.mClassName)) {
            return new b();
        }
        if (C0201.m82(2413).equals(this.mClassName)) {
            return new e();
        }
        throw new IllegalStateException(C0201.m82(2414) + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(k0 k0Var) {
        throw new IllegalStateException(C0201.m82(2415));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends a0> getShadowNodeClass() {
        if (C0201.m82(2416).equals(this.mClassName)) {
            return a.class;
        }
        if (C0201.m82(2417).equals(this.mClassName)) {
            return b.class;
        }
        if (C0201.m82(2418).equals(this.mClassName)) {
            return e.class;
        }
        throw new IllegalStateException(C0201.m82(2419) + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException(C0201.m82(2420));
    }
}
