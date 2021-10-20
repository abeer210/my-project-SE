package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import vigqyno.C0201;

public class AirMapLocalTileManager extends ViewGroupManager<f> {
    private DisplayMetrics metrics;

    public AirMapLocalTileManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(33612))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(33613);
    }

    @xj0(name = "pathTemplate")
    public void setPathTemplate(f fVar, String str) {
        fVar.setPathTemplate(str);
    }

    @xj0(defaultFloat = 256.0f, name = "tileSize")
    public void setTileSize(f fVar, float f) {
        fVar.setTileSize(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(k0 k0Var) {
        return new f(k0Var);
    }

    @xj0(defaultFloat = -1.0f, name = "zIndex")
    public void setZIndex(f fVar, float f) {
        fVar.setZIndex(f);
    }
}
