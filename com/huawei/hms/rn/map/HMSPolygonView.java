package com.huawei.hms.rn.map;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import com.huawei.hms.maps.model.Polygon;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.rn.map.HMSMapView;
import com.huawei.hms.rn.map.logger.HMSLogger;
import com.huawei.hms.rn.map.utils.ReactUtils;
import java.util.List;
import vigqyno.C0201;

public class HMSPolygonView extends HMSMapView.MapLayerView {
    private static final String REACT_CLASS = HMSPolygonView.class.getSimpleName();
    private static final String TAG = HMSPolygonView.class.getSimpleName();
    public Polygon mPolygon;
    public PolygonOptions mPolygonOptions = new PolygonOptions();

    public static class Manager extends HMSMapView.MapLayerViewManager<HMSPolygonView> {
        private HMSLogger logger;

        public Manager(Context context) {
            this.logger = HMSLogger.getInstance(context);
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(5297);
        }

        @xj0(name = "clickable")
        public void setClickable(HMSPolygonView hMSPolygonView, boolean z) {
            hMSPolygonView.setClickable(z);
        }

        @xj0(name = "fillColor")
        public void setFillColor(HMSPolygonView hMSPolygonView, int i) {
            hMSPolygonView.setFillColor(i);
        }

        @xj0(name = "geodesic")
        public void setGeodesic(HMSPolygonView hMSPolygonView, boolean z) {
            hMSPolygonView.setGeodesic(z);
        }

        @xj0(name = "holes")
        public void setHoles(HMSPolygonView hMSPolygonView, ReadableArray readableArray) {
            hMSPolygonView.setHoles(readableArray);
        }

        @xj0(name = "points")
        public void setPoints(HMSPolygonView hMSPolygonView, ReadableArray readableArray) {
            hMSPolygonView.setPoints(readableArray);
        }

        @xj0(defaultInt = -16777216, name = "strokeColor")
        public void setStrokeColor(HMSPolygonView hMSPolygonView, int i) {
            hMSPolygonView.setStrokeColor(i);
        }

        @xj0(name = "strokeJointType")
        public void setStrokeJointType(HMSPolygonView hMSPolygonView, int i) {
            hMSPolygonView.setStrokeJointType(i);
        }

        @xj0(name = "strokePattern")
        public void setStrokePattern(HMSPolygonView hMSPolygonView, ReadableArray readableArray) {
            hMSPolygonView.setStrokePattern(readableArray);
        }

        @xj0(defaultFloat = 10.0f, name = "strokeWidth")
        public void setStrokeWidth(HMSPolygonView hMSPolygonView, float f) {
            hMSPolygonView.setStrokeWidth(f);
        }

        @xj0(defaultBoolean = true, name = "visible")
        public void setVisible(HMSPolygonView hMSPolygonView, boolean z) {
            hMSPolygonView.setVisible(z);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSPolygonView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(5296);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSPolygonView hMSPolygonView = new HMSPolygonView(k0Var);
            this.logger.sendSingleEvent(r1);
            return hMSPolygonView;
        }

        @xj0(name = "zIndex")
        public void setZIndex(HMSPolygonView hMSPolygonView, float f) {
            hMSPolygonView.setZIndex(f);
        }
    }

    public HMSPolygonView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setFillColor(int i) {
        this.mPolygonOptions.fillColor(i);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setFillColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setGeodesic(boolean z) {
        this.mPolygonOptions.geodesic(z);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setGeodesic(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setHoles(ReadableArray readableArray) {
        List<List<LatLng>> listOfLatLngListFromReadableArray = ReactUtils.getListOfLatLngListFromReadableArray(readableArray);
        for (List<LatLng> list : listOfLatLngListFromReadableArray) {
            this.mPolygonOptions.addHole(list);
        }
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setHoles(listOfLatLngListFromReadableArray);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPoints(ReadableArray readableArray) {
        List<LatLng> latLngListFromReadableArray = ReactUtils.getLatLngListFromReadableArray(readableArray);
        for (LatLng latLng : latLngListFromReadableArray) {
            this.mPolygonOptions.add(latLng);
        }
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setPoints(latLngListFromReadableArray);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStrokeColor(int i) {
        this.mPolygonOptions.strokeColor(i);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setStrokeColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStrokeJointType(int i) {
        this.mPolygonOptions.strokeJointType(i);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setStrokeJointType(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStrokePattern(ReadableArray readableArray) {
        List<PatternItem> patternItemListFromReadableArray = ReactUtils.getPatternItemListFromReadableArray(readableArray);
        this.mPolygonOptions.strokePattern(patternItemListFromReadableArray);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setStrokePattern(patternItemListFromReadableArray);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStrokeWidth(float f) {
        this.mPolygonOptions.strokeWidth(f);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setStrokeWidth(f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setVisible(boolean z) {
        this.mPolygonOptions.visible(z);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZIndex(float f) {
        this.mPolygonOptions.zIndex(f);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setZIndex(f);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getInfo() {
        Polygon polygon = this.mPolygon;
        if (polygon == null) {
            return null;
        }
        try {
            return ReactUtils.getWritableMapFromPolygon(polygon);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getOptionsInfo() {
        PolygonOptions polygonOptions = this.mPolygonOptions;
        if (polygonOptions == null) {
            return null;
        }
        return ReactUtils.getWritableMapFromPolygonOptions(polygonOptions);
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public void removeFrom(HuaweiMap huaweiMap) {
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.remove();
            this.mPolygon = null;
            this.mPolygonOptions = null;
        }
    }

    public void setClickable(boolean z) {
        this.mPolygonOptions.clickable(z);
        Polygon polygon = this.mPolygon;
        if (polygon != null) {
            polygon.setClickable(z);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public Polygon addTo(HuaweiMap huaweiMap) {
        Polygon addPolygon = huaweiMap.addPolygon(this.mPolygonOptions);
        this.mPolygon = addPolygon;
        return addPolygon;
    }
}
