package com.airbnb.android.react.maps;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.e;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.n;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class AirMapManager extends ViewGroupManager<l> {
    private static final int ANIMATE_CAMERA = 0;
    private static final int ANIMATE_TO_BEARING = 0;
    private static final int ANIMATE_TO_COORDINATE = 0;
    private static final int ANIMATE_TO_NAVIGATION = 0;
    private static final int ANIMATE_TO_REGION = 0;
    private static final int ANIMATE_TO_VIEWING_ANGLE = 0;
    private static final int FIT_TO_COORDINATES = 0;
    private static final int FIT_TO_ELEMENTS = 0;
    private static final int FIT_TO_SUPPLIED_MARKERS = 0;
    private static final String REACT_CLASS = null;
    private static final int SET_CAMERA = 0;
    private static final int SET_INDOOR_ACTIVE_LEVEL_INDEX = 0;
    private static final int SET_MAP_BOUNDARIES = 0;
    private final Map<String, Integer> MAP_TYPES = e.h(C0201.m82(25955), 1, C0201.m82(25956), 2, C0201.m82(25957), 4, C0201.m82(25958), 3, C0201.m82(25959), 0);
    private final Map<String, Integer> MY_LOCATION_PRIORITY = e.g(C0201.m82(25960), 102, C0201.m82(25961), 100, C0201.m82(25962), 104, C0201.m82(25963), 105);
    private final ReactApplicationContext appContext;
    public GoogleMapOptions googleMapOptions;
    private AirMapMarkerManager markerManager;

    static {
        C0201.m83(AirMapManager.class, 459);
    }

    public AirMapManager(ReactApplicationContext reactApplicationContext) {
        this.appContext = reactApplicationContext;
        this.googleMapOptions = new GoogleMapOptions();
    }

    public static <K, V> Map<K, V> CreateMap(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        hashMap.put(k5, v5);
        hashMap.put(k6, v6);
        hashMap.put(k7, v7);
        hashMap.put(k8, v8);
        hashMap.put(k9, v9);
        hashMap.put(k10, v10);
        return hashMap;
    }

    private void emitMapError(k0 k0Var, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(25964), str);
        createMap.putString(C0201.m82(25965), str2);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) k0Var.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(25966), createMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Map<String, Integer> CreateMap = CreateMap(C0201.m82(25967), 11, C0201.m82(25968), 12, C0201.m82(25969), 1, C0201.m82(25970), 2, C0201.m82(25971), 3, C0201.m82(25972), 4, C0201.m82(25973), 5, C0201.m82(25974), 6, C0201.m82(25975), 7, C0201.m82(25976), 9);
        CreateMap.putAll(e.e(C0201.m82(25977), 8, C0201.m82(25978), 10));
        return CreateMap;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        String r0 = C0201.m82(25979);
        Map j = e.j(C0201.m82(25987), e.d(r0, C0201.m82(25980)), C0201.m82(25988), e.d(r0, C0201.m82(25981)), C0201.m82(25989), e.d(r0, C0201.m82(25982)), C0201.m82(25990), e.d(r0, C0201.m82(25983)), C0201.m82(25991), e.d(r0, C0201.m82(25984)), C0201.m82(25992), e.d(r0, C0201.m82(25985)), C0201.m82(25993), e.d(r0, C0201.m82(25986)));
        j.putAll(e.j(C0201.m82(26001), e.d(r0, C0201.m82(25994)), C0201.m82(26002), e.d(r0, C0201.m82(25995)), C0201.m82(26003), e.d(r0, C0201.m82(25996)), C0201.m82(26004), e.d(r0, C0201.m82(25997)), C0201.m82(26005), e.d(r0, C0201.m82(25998)), C0201.m82(26006), e.d(r0, C0201.m82(25999)), C0201.m82(26007), e.d(r0, C0201.m82(26000))));
        j.putAll(e.g(C0201.m82(26012), e.d(r0, C0201.m82(26008)), C0201.m82(26013), e.d(r0, C0201.m82(26009)), C0201.m82(26014), e.d(r0, C0201.m82(26010)), C0201.m82(26015), e.d(r0, C0201.m82(26011))));
        return j;
    }

    public AirMapMarkerManager getMarkerManager() {
        return this.markerManager;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(26016);
    }

    public void pushEvent(k0 k0Var, View view, String str, WritableMap writableMap) {
        ((RCTEventEmitter) k0Var.getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), str, writableMap);
    }

    @xj0(defaultBoolean = false, name = "cacheEnabled")
    public void setCacheEnabled(l lVar, boolean z) {
        lVar.setCacheEnabled(z);
    }

    @xj0(name = "camera")
    public void setCamera(l lVar, ReadableMap readableMap) {
        lVar.setCamera(readableMap);
    }

    @xj0(defaultBoolean = false, name = "handlePanDrag")
    public void setHandlePanDrag(l lVar, boolean z) {
        lVar.setHandlePanDrag(z);
    }

    @xj0(name = "initialCamera")
    public void setInitialCamera(l lVar, ReadableMap readableMap) {
        lVar.setInitialCamera(readableMap);
    }

    @xj0(name = "initialRegion")
    public void setInitialRegion(l lVar, ReadableMap readableMap) {
        lVar.setInitialRegion(readableMap);
    }

    @xj0(name = "kmlSrc")
    public void setKmlSrc(l lVar, String str) {
        if (str != null) {
            lVar.setKmlSrc(str);
        }
    }

    @xj0(customType = "Color", name = "loadingBackgroundColor")
    public void setLoadingBackgroundColor(l lVar, Integer num) {
        lVar.setLoadingBackgroundColor(num);
    }

    @xj0(defaultBoolean = false, name = "loadingEnabled")
    public void setLoadingEnabled(l lVar, boolean z) {
        lVar.S(z);
    }

    @xj0(customType = "Color", name = "loadingIndicatorColor")
    public void setLoadingIndicatorColor(l lVar, Integer num) {
        lVar.setLoadingIndicatorColor(num);
    }

    @xj0(name = "mapPadding")
    public void setMapPadding(l lVar, ReadableMap readableMap) {
        int i;
        int i2;
        int i3;
        int i4;
        double d = (double) lVar.getResources().getDisplayMetrics().density;
        int i5 = 0;
        if (readableMap != null) {
            String r3 = C0201.m82(26021);
            if (readableMap.hasKey(r3)) {
                double d2 = readableMap.getDouble(r3);
                Double.isNaN(d);
                i4 = (int) (d2 * d);
            } else {
                i4 = 0;
            }
            String r4 = C0201.m82(26022);
            if (readableMap.hasKey(r4)) {
                double d3 = readableMap.getDouble(r4);
                Double.isNaN(d);
                i3 = (int) (d3 * d);
            } else {
                i3 = 0;
            }
            String r5 = C0201.m82(26023);
            if (readableMap.hasKey(r5)) {
                double d4 = readableMap.getDouble(r5);
                Double.isNaN(d);
                i2 = (int) (d4 * d);
            } else {
                i2 = 0;
            }
            String r6 = C0201.m82(26024);
            if (readableMap.hasKey(r6)) {
                double d5 = readableMap.getDouble(r6);
                Double.isNaN(d);
                i = (int) (d5 * d);
                i5 = i4;
            } else {
                i5 = i4;
                i = 0;
            }
        } else {
            i = 0;
            i3 = 0;
            i2 = 0;
        }
        lVar.b.M(i5, i3, i2, i);
    }

    @xj0(name = "customMapStyleString")
    public void setMapStyle(l lVar, String str) {
        lVar.b.s(new n(str));
    }

    @xj0(name = "mapType")
    public void setMapType(l lVar, String str) {
        lVar.b.t(this.MAP_TYPES.get(str).intValue());
    }

    public void setMarkerManager(AirMapMarkerManager airMapMarkerManager) {
        this.markerManager = airMapMarkerManager;
    }

    @xj0(name = "maxZoomLevel")
    public void setMaxZoomLevel(l lVar, float f) {
        lVar.b.u(f);
    }

    @xj0(name = "minZoomLevel")
    public void setMinZoomLevel(l lVar, float f) {
        lVar.b.v(f);
    }

    @xj0(defaultBoolean = true, name = "moveOnMarkerPress")
    public void setMoveOnMarkerPress(l lVar, boolean z) {
        lVar.setMoveOnMarkerPress(z);
    }

    @xj0(defaultBoolean = false, name = "pitchEnabled")
    public void setPitchEnabled(l lVar, boolean z) {
        lVar.b.l().h(z);
    }

    @xj0(name = "region")
    public void setRegion(l lVar, ReadableMap readableMap) {
        lVar.setRegion(readableMap);
    }

    @xj0(defaultBoolean = false, name = "rotateEnabled")
    public void setRotateEnabled(l lVar, boolean z) {
        lVar.b.l().f(z);
    }

    @xj0(defaultBoolean = false, name = "scrollEnabled")
    public void setScrollEnabled(l lVar, boolean z) {
        lVar.b.l().g(z);
    }

    @xj0(defaultBoolean = false, name = "showsBuildings")
    public void setShowBuildings(l lVar, boolean z) {
        lVar.b.n(z);
    }

    @xj0(defaultBoolean = false, name = "showsIndoors")
    public void setShowIndoors(l lVar, boolean z) {
        lVar.b.o(z);
    }

    @xj0(defaultBoolean = false, name = "showsTraffic")
    public void setShowTraffic(l lVar, boolean z) {
        lVar.b.N(z);
    }

    @xj0(defaultBoolean = false, name = "showsCompass")
    public void setShowsCompass(l lVar, boolean z) {
        lVar.b.l().b(z);
    }

    @xj0(defaultBoolean = false, name = "showsIndoorLevelPicker")
    public void setShowsIndoorLevelPicker(l lVar, boolean z) {
        lVar.b.l().c(z);
    }

    @xj0(defaultBoolean = true, name = "showsMyLocationButton")
    public void setShowsMyLocationButton(l lVar, boolean z) {
        lVar.setShowsMyLocationButton(z);
    }

    @xj0(defaultBoolean = false, name = "showsUserLocation")
    public void setShowsUserLocation(l lVar, boolean z) {
        lVar.setShowsUserLocation(z);
    }

    @xj0(defaultBoolean = true, name = "toolbarEnabled")
    public void setToolbarEnabled(l lVar, boolean z) {
        lVar.setToolbarEnabled(z);
    }

    @xj0(defaultInt = 5000, name = "userLocationFastestInterval")
    public void setUserLocationFastestInterval(l lVar, int i) {
        lVar.setUserLocationFastestInterval(i);
    }

    @xj0(name = "userLocationPriority")
    public void setUserLocationPriority(l lVar, String str) {
        lVar.setUserLocationPriority(this.MY_LOCATION_PRIORITY.get(str).intValue());
    }

    @xj0(defaultInt = 5000, name = "userLocationUpdateInterval")
    public void setUserLocationUpdateInterval(l lVar, int i) {
        lVar.setUserLocationUpdateInterval(i);
    }

    @xj0(defaultBoolean = true, name = "zoomControlEnabled")
    public void setZoomControlEnabled(l lVar, boolean z) {
        lVar.b.l().i(z);
    }

    @xj0(defaultBoolean = false, name = "zoomEnabled")
    public void setZoomEnabled(l lVar, boolean z) {
        lVar.b.l().j(z);
    }

    public void addView(l lVar, View view, int i) {
        lVar.I(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new u();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public l createViewInstance(k0 k0Var) {
        return new l(k0Var, this.appContext, this, this.googleMapOptions);
    }

    public View getChildAt(l lVar, int i) {
        return lVar.W(i);
    }

    public int getChildCount(l lVar) {
        return lVar.getFeatureCount();
    }

    public void onDropViewInstance(l lVar) {
        lVar.R();
        super.onDropViewInstance((View) lVar);
    }

    public void receiveCommand(l lVar, int i, ReadableArray readableArray) {
        String r3 = C0201.m82(26017);
        String r4 = C0201.m82(26018);
        switch (i) {
            case 1:
                ReadableMap map = readableArray.getMap(0);
                Integer valueOf = Integer.valueOf(readableArray.getInt(1));
                Double valueOf2 = Double.valueOf(map.getDouble(r4));
                Double valueOf3 = Double.valueOf(map.getDouble(r3));
                Double valueOf4 = Double.valueOf(map.getDouble(C0201.m82(26019)));
                Double valueOf5 = Double.valueOf(map.getDouble(C0201.m82(26020)));
                lVar.N(new LatLngBounds(new LatLng(valueOf3.doubleValue() - (valueOf5.doubleValue() / 2.0d), valueOf2.doubleValue() - (valueOf4.doubleValue() / 2.0d)), new LatLng(valueOf3.doubleValue() + (valueOf5.doubleValue() / 2.0d), valueOf2.doubleValue() + (valueOf4.doubleValue() / 2.0d))), valueOf.intValue());
                return;
            case 2:
                ReadableMap map2 = readableArray.getMap(0);
                Integer valueOf6 = Integer.valueOf(readableArray.getInt(1));
                lVar.L(new LatLng(Double.valueOf(map2.getDouble(r3)).doubleValue(), Double.valueOf(map2.getDouble(r4)).doubleValue()), valueOf6.intValue());
                return;
            case 3:
                lVar.O((float) readableArray.getDouble(0), Integer.valueOf(readableArray.getInt(1)).intValue());
                return;
            case 4:
                lVar.J((float) readableArray.getDouble(0), Integer.valueOf(readableArray.getInt(1)).intValue());
                return;
            case 5:
                lVar.U(readableArray.getBoolean(0));
                return;
            case 6:
                lVar.V(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                return;
            case 7:
                lVar.T(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                return;
            case 8:
                lVar.h0(readableArray.getMap(0), readableArray.getMap(1));
                return;
            case 9:
                ReadableMap map3 = readableArray.getMap(0);
                lVar.M(new LatLng(Double.valueOf(map3.getDouble(r3)).doubleValue(), Double.valueOf(map3.getDouble(r4)).doubleValue()), (float) readableArray.getDouble(1), (float) readableArray.getDouble(2), Integer.valueOf(readableArray.getInt(3)).intValue());
                return;
            case 10:
                lVar.setIndoorActiveLevelIndex(readableArray.getInt(0));
                return;
            case 11:
                lVar.K(readableArray.getMap(0), 0);
                return;
            case 12:
                lVar.K(readableArray.getMap(0), Integer.valueOf(readableArray.getInt(1)).intValue());
                return;
            default:
                return;
        }
    }

    public void removeViewAt(l lVar, int i) {
        lVar.e0(i);
    }

    public void updateExtraData(l lVar, Object obj) {
        lVar.i0(obj);
    }
}
