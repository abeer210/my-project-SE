package com.airbnb.android.react.maps;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.google.android.gms.maps.model.LatLng;
import vigqyno.C0201;

public class AirMapHeatmapManager extends ViewGroupManager<e> {
    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(38710);
    }

    @xj0(name = "gradient")
    public void setGradient(e eVar, ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray(C0201.m82(38711));
        int[] iArr = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            iArr[i] = array.getInt(i);
        }
        ReadableArray array2 = readableMap.getArray(C0201.m82(38712));
        float[] fArr = new float[array2.size()];
        for (int i2 = 0; i2 < array2.size(); i2++) {
            fArr[i2] = (float) array2.getDouble(i2);
        }
        String r0 = C0201.m82(38713);
        if (readableMap.hasKey(r0)) {
            eVar.setGradient(new z52(iArr, fArr, readableMap.getInt(r0)));
        } else {
            eVar.setGradient(new z52(iArr, fArr));
        }
    }

    @xj0(name = "opacity")
    public void setOpacity(e eVar, double d) {
        eVar.setOpacity(d);
    }

    @xj0(name = "points")
    public void setPoints(e eVar, ReadableArray readableArray) {
        b62 b62;
        b62[] b62Arr = new b62[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            LatLng latLng = new LatLng(map.getDouble(C0201.m82(38714)), map.getDouble(C0201.m82(38715)));
            String r4 = C0201.m82(38716);
            if (map.hasKey(r4)) {
                b62 = new b62(latLng, map.getDouble(r4));
            } else {
                b62 = new b62(latLng);
            }
            b62Arr[i] = b62;
        }
        eVar.setPoints(b62Arr);
    }

    @xj0(name = "radius")
    public void setRadius(e eVar, int i) {
        eVar.setRadius(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(k0 k0Var) {
        return new e(k0Var);
    }
}
