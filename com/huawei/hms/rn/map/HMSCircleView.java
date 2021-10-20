package com.huawei.hms.rn.map;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.model.Circle;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.PatternItem;
import com.huawei.hms.rn.map.HMSMapView;
import com.huawei.hms.rn.map.logger.HMSLogger;
import com.huawei.hms.rn.map.utils.ReactUtils;
import java.util.List;
import vigqyno.C0201;

public class HMSCircleView extends HMSMapView.MapLayerView {
    private static final String REACT_CLASS = HMSCircleView.class.getSimpleName();
    private static final String TAG = HMSCircleView.class.getSimpleName();
    public Circle mCircle;
    public CircleOptions mCircleOptions = new CircleOptions();

    public static class Manager extends HMSMapView.MapLayerViewManager<HMSCircleView> {
        private HMSLogger logger;

        public Manager(Context context) {
            this.logger = HMSLogger.getInstance(context);
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(20596);
        }

        @xj0(name = "center")
        public void setCenter(HMSCircleView hMSCircleView, ReadableMap readableMap) {
            hMSCircleView.setCenter(readableMap);
        }

        @xj0(name = "clickable")
        public void setClickable(HMSCircleView hMSCircleView, boolean z) {
            hMSCircleView.setClickable(z);
        }

        @xj0(defaultInt = -16777216, name = "fillColor")
        public void setFillColor(HMSCircleView hMSCircleView, int i) {
            hMSCircleView.setFillColor(i);
        }

        @xj0(defaultDouble = 0.0d, name = "radius")
        public void setRadius(HMSCircleView hMSCircleView, double d) {
            hMSCircleView.setRadius(d);
        }

        @xj0(name = "strokeColor")
        public void setStrokeColor(HMSCircleView hMSCircleView, int i) {
            hMSCircleView.setStrokeColor(i);
        }

        @xj0(name = "strokePattern")
        public void setStrokePattern(HMSCircleView hMSCircleView, ReadableArray readableArray) {
            hMSCircleView.setStrokePattern(readableArray);
        }

        @xj0(defaultFloat = 1.0f, name = "strokeWidth")
        public void setStrokeWidth(HMSCircleView hMSCircleView, float f) {
            hMSCircleView.setStrokeWidth(f);
        }

        @xj0(defaultBoolean = true, name = "visible")
        public void setVisible(HMSCircleView hMSCircleView, boolean z) {
            hMSCircleView.setVisible(z);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSCircleView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(20595);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSCircleView hMSCircleView = new HMSCircleView(k0Var);
            this.logger.sendSingleEvent(r1);
            return hMSCircleView;
        }

        @xj0(defaultFloat = 1.0f, name = "zIndex")
        public void setZIndex(HMSCircleView hMSCircleView, float f) {
            hMSCircleView.setZIndex(f);
        }
    }

    public HMSCircleView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCenter(ReadableMap readableMap) {
        LatLng latLngFromReadableMap = ReactUtils.getLatLngFromReadableMap(readableMap);
        if (latLngFromReadableMap != null) {
            this.mCircleOptions.center(latLngFromReadableMap);
            Circle circle = this.mCircle;
            if (circle != null) {
                circle.setCenter(latLngFromReadableMap);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setFillColor(int i) {
        this.mCircleOptions.fillColor(i);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setFillColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setRadius(double d) {
        this.mCircleOptions.radius(d);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setRadius(d);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStrokeColor(int i) {
        this.mCircleOptions.strokeColor(i);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setStrokeColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStrokePattern(ReadableArray readableArray) {
        List<PatternItem> patternItemListFromReadableArray = ReactUtils.getPatternItemListFromReadableArray(readableArray);
        this.mCircleOptions.strokePattern(patternItemListFromReadableArray);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setStrokePattern(patternItemListFromReadableArray);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setStrokeWidth(float f) {
        this.mCircleOptions.strokeWidth(f);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setStrokeWidth(f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setVisible(boolean z) {
        this.mCircleOptions.visible(z);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZIndex(float f) {
        this.mCircleOptions.zIndex(f);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setZIndex(f);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getInfo() {
        Circle circle = this.mCircle;
        if (circle == null) {
            return null;
        }
        try {
            return ReactUtils.getWritableMapFromCircle(circle);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getOptionsInfo() {
        CircleOptions circleOptions = this.mCircleOptions;
        if (circleOptions == null) {
            return null;
        }
        return ReactUtils.getWritableMapFromCircleOptions(circleOptions);
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public void removeFrom(HuaweiMap huaweiMap) {
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.remove();
            this.mCircle = null;
            this.mCircleOptions = null;
        }
    }

    public void setClickable(boolean z) {
        this.mCircleOptions.clickable(z);
        Circle circle = this.mCircle;
        if (circle != null) {
            circle.setClickable(z);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public Circle addTo(HuaweiMap huaweiMap) {
        Circle addCircle = huaweiMap.addCircle(this.mCircleOptions);
        this.mCircle = addCircle;
        return addCircle;
    }
}
