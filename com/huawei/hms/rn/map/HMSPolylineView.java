package com.huawei.hms.rn.map;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.model.Cap;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import com.huawei.hms.maps.model.Polyline;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hms.rn.map.HMSMapView;
import com.huawei.hms.rn.map.logger.HMSLogger;
import com.huawei.hms.rn.map.utils.ReactUtils;
import java.util.List;
import vigqyno.C0201;

public class HMSPolylineView extends HMSMapView.MapLayerView {
    private static final String REACT_CLASS = HMSPolylineView.class.getSimpleName();
    private static final String TAG = HMSPolylineView.class.getSimpleName();
    public Polyline mPolyline;
    public PolylineOptions mPolylineOptions = new PolylineOptions();

    public static class Manager extends HMSMapView.MapLayerViewManager<HMSPolylineView> {
        private HMSLogger logger;

        public Manager(Context context) {
            this.logger = HMSLogger.getInstance(context);
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(13998);
        }

        @xj0(name = "clickable")
        public void setClickable(HMSPolylineView hMSPolylineView, boolean z) {
            hMSPolylineView.setClickable(z);
        }

        @xj0(defaultInt = -16777216, name = "color")
        public void setColor(HMSPolylineView hMSPolylineView, int i) {
            hMSPolylineView.setColor(i);
        }

        @xj0(name = "endCap")
        public void setEndCap(HMSPolylineView hMSPolylineView, ReadableMap readableMap) {
            hMSPolylineView.setEndCap(readableMap);
        }

        @xj0(name = "geodesic")
        public void setGeodesic(HMSPolylineView hMSPolylineView, boolean z) {
            hMSPolylineView.setGeodesic(z);
        }

        @xj0(name = "jointType")
        public void setJointType(HMSPolylineView hMSPolylineView, int i) {
            hMSPolylineView.setJointType(i);
        }

        @xj0(name = "pattern")
        public void setPattern(HMSPolylineView hMSPolylineView, ReadableArray readableArray) {
            hMSPolylineView.setPattern(readableArray);
        }

        @xj0(name = "points")
        public void setPoints(HMSPolylineView hMSPolylineView, ReadableArray readableArray) {
            hMSPolylineView.setPoints(readableArray);
        }

        @xj0(name = "startCap")
        public void setStartCap(HMSPolylineView hMSPolylineView, ReadableMap readableMap) {
            hMSPolylineView.setStartCap(readableMap);
        }

        @xj0(defaultBoolean = true, name = "visible")
        public void setVisible(HMSPolylineView hMSPolylineView, boolean z) {
            hMSPolylineView.setVisible(z);
        }

        @xj0(defaultFloat = 10.0f, name = "width")
        public void setWidth(HMSPolylineView hMSPolylineView, float f) {
            hMSPolylineView.setWidth(f);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSPolylineView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(13997);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSPolylineView hMSPolylineView = new HMSPolylineView(k0Var);
            this.logger.sendSingleEvent(r1);
            return hMSPolylineView;
        }

        @xj0(name = "zIndex")
        public void setZIndex(HMSPolylineView hMSPolylineView, float f) {
            hMSPolylineView.setZIndex(f);
        }
    }

    public HMSPolylineView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setColor(int i) {
        this.mPolylineOptions.color(i);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setEndCap(ReadableMap readableMap) {
        Cap capFromReadableMap = ReactUtils.getCapFromReadableMap(readableMap);
        this.mPolylineOptions.endCap(capFromReadableMap);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setEndCap(capFromReadableMap);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setGeodesic(boolean z) {
        this.mPolylineOptions.geodesic(z);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setGeodesic(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setJointType(int i) {
        this.mPolylineOptions.jointType(i);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setJointType(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPattern(ReadableArray readableArray) {
        List<PatternItem> patternItemListFromReadableArray = ReactUtils.getPatternItemListFromReadableArray(readableArray);
        this.mPolylineOptions.pattern(patternItemListFromReadableArray);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setPattern(patternItemListFromReadableArray);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPoints(ReadableArray readableArray) {
        List<LatLng> latLngListFromReadableArray = ReactUtils.getLatLngListFromReadableArray(readableArray);
        for (LatLng latLng : latLngListFromReadableArray) {
            this.mPolylineOptions.add(latLng);
        }
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setPoints(latLngListFromReadableArray);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStartCap(ReadableMap readableMap) {
        Cap capFromReadableMap = ReactUtils.getCapFromReadableMap(readableMap);
        this.mPolylineOptions.startCap(capFromReadableMap);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setStartCap(capFromReadableMap);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setVisible(boolean z) {
        this.mPolylineOptions.visible(z);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setWidth(float f) {
        this.mPolylineOptions.width(f);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setWidth(f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZIndex(float f) {
        this.mPolylineOptions.zIndex(f);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setZIndex(f);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getInfo() {
        Polyline polyline = this.mPolyline;
        if (polyline == null) {
            return null;
        }
        try {
            return ReactUtils.getWritableMapFromPolyline(polyline);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getOptionsInfo() {
        PolylineOptions polylineOptions = this.mPolylineOptions;
        if (polylineOptions == null) {
            return null;
        }
        return ReactUtils.getWritableMapFromPolylineOptions(polylineOptions);
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public void removeFrom(HuaweiMap huaweiMap) {
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.remove();
            this.mPolyline = null;
            this.mPolylineOptions = null;
        }
    }

    public void setClickable(boolean z) {
        this.mPolylineOptions.clickable(z);
        Polyline polyline = this.mPolyline;
        if (polyline != null) {
            polyline.setClickable(z);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public Polyline addTo(HuaweiMap huaweiMap) {
        Polyline addPolyline = huaweiMap.addPolyline(this.mPolylineOptions);
        this.mPolyline = addPolyline;
        return addPolyline;
    }
}
