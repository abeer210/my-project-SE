package com.huawei.hms.rn.map;

import android.content.Context;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.model.BitmapDescriptor;
import com.huawei.hms.maps.model.GroundOverlay;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.rn.map.HMSMapView;
import com.huawei.hms.rn.map.logger.HMSLogger;
import com.huawei.hms.rn.map.utils.ReactUtils;
import vigqyno.C0201;

public class HMSGroundOverlayView extends HMSMapView.MapLayerView {
    private static final String REACT_CLASS = HMSGroundOverlayView.class.getSimpleName();
    private static final String TAG = HMSGroundOverlayView.class.getSimpleName();
    private GroundOverlay mGroundOverlay;
    private GroundOverlayOptions mGroundOverlayOptions = new GroundOverlayOptions();
    private boolean mOptionPositionSet = false;

    public static class Manager extends HMSMapView.MapLayerViewManager<HMSGroundOverlayView> {
        private HMSLogger logger;

        public Manager(Context context) {
            this.logger = HMSLogger.getInstance(context);
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(7982);
        }

        @xj0(name = "anchor")
        public void setAnchor(HMSGroundOverlayView hMSGroundOverlayView, ReadableArray readableArray) {
            hMSGroundOverlayView.setAnchor(readableArray);
        }

        @xj0(name = "bearing")
        public void setBearing(HMSGroundOverlayView hMSGroundOverlayView, float f) {
            hMSGroundOverlayView.setBearing(f);
        }

        @xj0(defaultBoolean = true, name = "clickable")
        public void setClickable(HMSGroundOverlayView hMSGroundOverlayView, boolean z) {
            hMSGroundOverlayView.setClickable(z);
        }

        @xj0(name = "image")
        public void setImage(HMSGroundOverlayView hMSGroundOverlayView, ReadableMap readableMap) {
            hMSGroundOverlayView.setImage(readableMap);
        }

        @xj0(name = "coordinate")
        public void setPosition(HMSGroundOverlayView hMSGroundOverlayView, Dynamic dynamic) {
            hMSGroundOverlayView.setPosition(dynamic);
        }

        @xj0(name = "transparency")
        public void setTransparency(HMSGroundOverlayView hMSGroundOverlayView, float f) {
            hMSGroundOverlayView.setTransparency(f);
        }

        @xj0(defaultBoolean = true, name = "visible")
        public void setVisible(HMSGroundOverlayView hMSGroundOverlayView, boolean z) {
            hMSGroundOverlayView.setVisible(z);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSGroundOverlayView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(7981);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSGroundOverlayView hMSGroundOverlayView = new HMSGroundOverlayView(k0Var);
            this.logger.sendSingleEvent(r1);
            return hMSGroundOverlayView;
        }

        @xj0(defaultFloat = 1.0f, name = "zIndex")
        public void setZIndex(HMSGroundOverlayView hMSGroundOverlayView, float f) {
            hMSGroundOverlayView.setZIndex(f);
        }
    }

    public HMSGroundOverlayView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setImage(ReadableMap readableMap) {
        BitmapDescriptor bitmapDescriptorFromReadableMap = ReactUtils.getBitmapDescriptorFromReadableMap(readableMap);
        this.mGroundOverlayOptions.image(bitmapDescriptorFromReadableMap);
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setImage(bitmapDescriptorFromReadableMap);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPosition(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            ReadableMap asMap = dynamic.asMap();
            LatLng latLngFromReadableMap = ReactUtils.getLatLngFromReadableMap(asMap);
            if (latLngFromReadableMap != null) {
                ReadableType readableType = ReadableType.Number;
                String r2 = C0201.m82(8029);
                if (ReactUtils.hasValidKey(asMap, r2, readableType)) {
                    ReadableType readableType2 = ReadableType.Number;
                    String r3 = C0201.m82(8030);
                    if (ReactUtils.hasValidKey(asMap, r3, readableType2)) {
                        float f = (float) asMap.getDouble(r2);
                        float f2 = (float) asMap.getDouble(r3);
                        if (!this.mOptionPositionSet) {
                            this.mOptionPositionSet = true;
                            this.mGroundOverlayOptions.position(latLngFromReadableMap, f, f2);
                        } else {
                            GroundOverlay groundOverlay = this.mGroundOverlay;
                            if (groundOverlay != null) {
                                groundOverlay.setDimensions(f, f2);
                            }
                        }
                    }
                }
                GroundOverlay groundOverlay2 = this.mGroundOverlay;
                if (groundOverlay2 != null) {
                    groundOverlay2.setPosition(latLngFromReadableMap);
                }
            }
        } else if (dynamic.getType() == ReadableType.Array) {
            LatLngBounds latLngBoundsFromReadableArray = ReactUtils.getLatLngBoundsFromReadableArray(dynamic.asArray());
            this.mGroundOverlayOptions.positionFromBounds(latLngBoundsFromReadableArray);
            GroundOverlay groundOverlay3 = this.mGroundOverlay;
            if (groundOverlay3 != null) {
                groundOverlay3.setPositionFromBounds(latLngBoundsFromReadableArray);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTransparency(float f) {
        this.mGroundOverlayOptions.transparency(f);
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setTransparency(f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setVisible(boolean z) {
        this.mGroundOverlayOptions.visible(z);
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZIndex(float f) {
        this.mGroundOverlayOptions.zIndex(f);
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setZIndex(f);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getInfo() {
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay == null) {
            return null;
        }
        try {
            return ReactUtils.getWritableMapFromGroundOverlay(groundOverlay);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getOptionsInfo() {
        GroundOverlayOptions groundOverlayOptions = this.mGroundOverlayOptions;
        if (groundOverlayOptions == null) {
            return null;
        }
        return ReactUtils.getWritableMapFromGroundOverlayOptions(groundOverlayOptions);
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public void removeFrom(HuaweiMap huaweiMap) {
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay != null) {
            groundOverlay.remove();
            this.mGroundOverlay = null;
            this.mGroundOverlayOptions = null;
        }
    }

    public void setAnchor(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Number) && ReactUtils.hasValidElement(readableArray, 1, ReadableType.Number)) {
            float f = (float) readableArray.getDouble(1);
            this.mGroundOverlayOptions.anchor((float) readableArray.getDouble(0), f);
        }
    }

    public void setBearing(float f) {
        this.mGroundOverlayOptions.bearing(f);
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setBearing(f);
        }
    }

    public void setClickable(boolean z) {
        this.mGroundOverlayOptions.clickable(z);
        GroundOverlay groundOverlay = this.mGroundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setClickable(z);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public GroundOverlay addTo(HuaweiMap huaweiMap) {
        GroundOverlay addGroundOverlay = huaweiMap.addGroundOverlay(this.mGroundOverlayOptions);
        this.mGroundOverlay = addGroundOverlay;
        return addGroundOverlay;
    }
}
