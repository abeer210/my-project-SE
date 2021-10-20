package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

public class AirMapWMSTileManager extends ViewGroupManager<m> {
    private DisplayMetrics metrics;

    public AirMapWMSTileManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(35231))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(35232);
    }

    @xj0(defaultFloat = 100.0f, name = "maximumZ")
    public void setMaximumZ(m mVar, float f) {
        mVar.setMaximumZ(f);
    }

    @xj0(defaultFloat = 0.0f, name = "minimumZ")
    public void setMinimumZ(m mVar, float f) {
        mVar.setMinimumZ(f);
    }

    @xj0(defaultInt = 512, name = "tileSize")
    public void setTileSize(m mVar, int i) {
        mVar.setTileSize(i);
    }

    @xj0(name = "urlTemplate")
    public void setUrlTemplate(m mVar, String str) {
        mVar.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(k0 k0Var) {
        return new m(k0Var);
    }

    @xj0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(m mVar, float f) {
        mVar.setOpacity(f);
    }

    @xj0(defaultFloat = -1.0f, name = "zIndex")
    public void setZIndex(m mVar, float f) {
        mVar.setZIndex(f);
    }
}
