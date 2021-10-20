package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.google.android.gms.maps.model.c;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.w;
import com.google.android.gms.maps.model.y;
import java.util.Map;
import vigqyno.C0201;

public class AirMapPolylineManager extends ViewGroupManager<j> {
    private final DisplayMetrics metrics;

    public AirMapPolylineManager(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) reactApplicationContext.getSystemService(C0201.m82(11552))).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = reactApplicationContext.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(11553);
        String r1 = C0201.m82(11554);
        return e.d(r1, e.d(r0, r1));
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(11555);
    }

    @xj0(name = "coordinates")
    public void setCoordinate(j jVar, ReadableArray readableArray) {
        jVar.setCoordinates(readableArray);
    }

    @xj0(defaultBoolean = false, name = "geodesic")
    public void setGeodesic(j jVar, boolean z) {
        jVar.setGeodesic(z);
    }

    @xj0(name = "lineDashPattern")
    public void setLineDashPattern(j jVar, ReadableArray readableArray) {
        jVar.setLineDashPattern(readableArray);
    }

    @xj0(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(j jVar, int i) {
        jVar.setColor(i);
    }

    @xj0(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(j jVar, float f) {
        jVar.setWidth(this.metrics.density * f);
    }

    @xj0(defaultBoolean = false, name = "tappable")
    public void setTappable(j jVar, boolean z) {
        jVar.setTappable(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    @xj0(name = "lineCap")
    public void setlineCap(j jVar, String str) {
        char c;
        d dVar;
        int hashCode = str.hashCode();
        if (hashCode != -894674659) {
            if (hashCode != 3035667) {
                if (hashCode == 108704142 && str.equals(C0201.m82(11556))) {
                    c = 1;
                    if (c != 0) {
                        dVar = new c();
                    } else if (c == 1) {
                        dVar = new w();
                    } else if (c != 2) {
                        dVar = new w();
                    } else {
                        dVar = new y();
                    }
                    jVar.setLineCap(dVar);
                }
            } else if (str.equals(C0201.m82(11557))) {
                c = 0;
                if (c != 0) {
                }
                jVar.setLineCap(dVar);
            }
        } else if (str.equals(C0201.m82(11558))) {
            c = 2;
            if (c != 0) {
            }
            jVar.setLineCap(dVar);
        }
        c = 65535;
        if (c != 0) {
        }
        jVar.setLineCap(dVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public j createViewInstance(k0 k0Var) {
        return new j(k0Var);
    }

    @xj0(defaultFloat = 1.0f, name = "zIndex")
    public void setZIndex(j jVar, float f) {
        jVar.setZIndex(f);
    }
}
