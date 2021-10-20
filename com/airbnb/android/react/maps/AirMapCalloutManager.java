package com.airbnb.android.react.maps;

import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import java.util.Map;
import vigqyno.C0201;

public class AirMapCalloutManager extends ViewGroupManager<a> {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(11621);
        String r1 = C0201.m82(11622);
        return e.d(r1, e.d(r0, r1));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(11623);
    }

    @xj0(defaultBoolean = false, name = "tooltip")
    public void setTooltip(a aVar, boolean z) {
        aVar.setTooltip(z);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new u();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    public void updateExtraData(a aVar, Object obj) {
        Map map = (Map) obj;
        float floatValue = ((Float) map.get(C0201.m82(11624))).floatValue();
        float floatValue2 = ((Float) map.get(C0201.m82(11625))).floatValue();
        aVar.b = (int) floatValue;
        aVar.c = (int) floatValue2;
    }
}
