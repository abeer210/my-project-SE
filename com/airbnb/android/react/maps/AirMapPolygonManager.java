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

public class AirMapPolygonManager extends ViewGroupManager<i> {
    private final DisplayMetrics metrics;

    public AirMapPolygonManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(7534))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(7535);
        String r1 = C0201.m82(7536);
        return e.d(r1, e.d(r0, r1));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(7537);
    }

    @xj0(name = "coordinates")
    public void setCoordinate(i iVar, ReadableArray readableArray) {
        iVar.setCoordinates(readableArray);
    }

    @xj0(customType = "Color", defaultInt = -65536, name = "fillColor")
    public void setFillColor(i iVar, int i) {
        iVar.setFillColor(i);
    }

    @xj0(defaultBoolean = false, name = "geodesic")
    public void setGeodesic(i iVar, boolean z) {
        iVar.setGeodesic(z);
    }

    @xj0(name = "holes")
    public void setHoles(i iVar, ReadableArray readableArray) {
        iVar.setHoles(readableArray);
    }

    @xj0(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(i iVar, int i) {
        iVar.setStrokeColor(i);
    }

    @xj0(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(i iVar, float f) {
        iVar.setStrokeWidth(this.metrics.density * f);
    }

    @xj0(defaultBoolean = false, name = "tappable")
    public void setTappable(i iVar, boolean z) {
        iVar.setTappable(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(k0 k0Var) {
        return new i(k0Var);
    }

    @xj0(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(i iVar, float f) {
        iVar.setZIndex(f);
    }
}
