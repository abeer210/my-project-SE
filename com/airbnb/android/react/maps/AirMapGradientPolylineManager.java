package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import vigqyno.C0201;

public class AirMapGradientPolylineManager extends ViewGroupManager<d> {
    private final DisplayMetrics metrics;

    public AirMapGradientPolylineManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(1125))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(1126);
    }

    @xj0(name = "coordinates")
    public void setCoordinates(d dVar, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            arrayList.add(new LatLng(map.getDouble(C0201.m82(1127)), map.getDouble(C0201.m82(1128))));
        }
        dVar.setCoordinates(arrayList);
    }

    @xj0(customType = "ColorArray", name = "strokeColors")
    public void setStrokeColors(d dVar, ReadableArray readableArray) {
        if (readableArray == null) {
            dVar.setStrokeColors(new int[]{0, 0});
        } else if (readableArray.size() == 0) {
            dVar.setStrokeColors(new int[]{0, 0});
        } else {
            if (readableArray.size() == 1) {
                dVar.setStrokeColors(new int[]{readableArray.getInt(0), readableArray.getInt(0)});
                return;
            }
            int[] iArr = new int[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                iArr[i] = readableArray.getInt(i);
            }
            dVar.setStrokeColors(iArr);
        }
    }

    @xj0(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(d dVar, float f) {
        dVar.setWidth(this.metrics.density * f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    @xj0(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(d dVar, float f) {
        dVar.setZIndex(f);
    }
}
