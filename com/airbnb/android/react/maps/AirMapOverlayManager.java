package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import java.util.Map;
import vigqyno.C0201;

public class AirMapOverlayManager extends ViewGroupManager<h> {
    private final DisplayMetrics metrics;

    public AirMapOverlayManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(29577))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(29578);
        String r1 = C0201.m82(29579);
        return e.d(r1, e.d(r0, r1));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(29580);
    }

    @xj0(name = "bounds")
    public void setBounds(h hVar, ReadableArray readableArray) {
        hVar.setBounds(readableArray);
    }

    @xj0(name = "image")
    public void setImage(h hVar, String str) {
        hVar.setImage(str);
    }

    @xj0(defaultBoolean = false, name = "tappable")
    public void setTappable(h hVar, boolean z) {
        hVar.setTappable(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(k0 k0Var) {
        return new h(k0Var);
    }

    @xj0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(h hVar, float f) {
        hVar.setTransparency(1.0f - f);
    }

    @xj0(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(h hVar, float f) {
        hVar.setZIndex(f);
    }
}
