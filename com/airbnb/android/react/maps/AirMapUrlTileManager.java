package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

public class AirMapUrlTileManager extends ViewGroupManager<k> {
    private DisplayMetrics metrics;

    public AirMapUrlTileManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(13082))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(13083);
    }

    @xj0(defaultBoolean = false, name = "flipY")
    public void setFlipY(k kVar, boolean z) {
        kVar.setFlipY(z);
    }

    @xj0(defaultFloat = 100.0f, name = "maximumZ")
    public void setMaximumZ(k kVar, float f) {
        kVar.setMaximumZ(f);
    }

    @xj0(defaultFloat = 0.0f, name = "minimumZ")
    public void setMinimumZ(k kVar, float f) {
        kVar.setMinimumZ(f);
    }

    @xj0(name = "urlTemplate")
    public void setUrlTemplate(k kVar, String str) {
        kVar.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(k0 k0Var) {
        return new k(k0Var);
    }

    @xj0(defaultFloat = -1.0f, name = "zIndex")
    public void setZIndex(k kVar, float f) {
        kVar.setZIndex(f);
    }
}
