package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.google.android.gms.maps.model.LatLng;
import vigqyno.C0201;

public class AirMapCircleManager extends ViewGroupManager<b> {
    private final DisplayMetrics metrics;

    public AirMapCircleManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(8901))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(8902);
    }

    @xj0(name = "center")
    public void setCenter(b bVar, ReadableMap readableMap) {
        bVar.setCenter(new LatLng(readableMap.getDouble(C0201.m82(8903)), readableMap.getDouble(C0201.m82(8904))));
    }

    @xj0(customType = "Color", defaultInt = -65536, name = "fillColor")
    public void setFillColor(b bVar, int i) {
        bVar.setFillColor(i);
    }

    @xj0(defaultDouble = 0.0d, name = "radius")
    public void setRadius(b bVar, double d) {
        bVar.setRadius(d);
    }

    @xj0(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(b bVar, int i) {
        bVar.setStrokeColor(i);
    }

    @xj0(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(b bVar, float f) {
        bVar.setStrokeWidth(this.metrics.density * f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(k0 k0Var) {
        return new b(k0Var);
    }

    @xj0(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(b bVar, float f) {
        bVar.setZIndex(f);
    }
}
