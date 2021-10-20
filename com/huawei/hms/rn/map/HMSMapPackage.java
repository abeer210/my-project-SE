package com.huawei.hms.rn.map;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.huawei.hms.rn.map.HMSCircleView;
import com.huawei.hms.rn.map.HMSGroundOverlayView;
import com.huawei.hms.rn.map.HMSInfoWindowView;
import com.huawei.hms.rn.map.HMSMapView;
import com.huawei.hms.rn.map.HMSMarkerView;
import com.huawei.hms.rn.map.HMSPolygonView;
import com.huawei.hms.rn.map.HMSPolylineView;
import com.huawei.hms.rn.map.HMSTileOverlayView;
import java.util.Arrays;
import java.util.List;

public class HMSMapPackage implements wi0 {
    @Override // defpackage.wi0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new HMSMapView.Module(reactApplicationContext));
    }

    @Override // defpackage.wi0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new HMSMapView.Manager(reactApplicationContext), new HMSCircleView.Manager(reactApplicationContext), new HMSMarkerView.Manager(reactApplicationContext), new HMSInfoWindowView.Manager(reactApplicationContext), new HMSPolygonView.Manager(reactApplicationContext), new HMSPolylineView.Manager(reactApplicationContext), new HMSGroundOverlayView.Manager(reactApplicationContext), new HMSTileOverlayView.Manager(reactApplicationContext));
    }
}
