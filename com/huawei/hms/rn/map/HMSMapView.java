package com.huawei.hms.rn.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.core.content.b;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.m;
import com.facebook.react.views.view.f;
import com.huawei.hms.maps.CameraUpdate;
import com.huawei.hms.maps.CameraUpdateFactory;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.HuaweiMapOptions;
import com.huawei.hms.maps.OnMapReadyCallback;
import com.huawei.hms.maps.TextureMapView;
import com.huawei.hms.maps.UiSettings;
import com.huawei.hms.maps.common.util.DistanceCalculator;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.Circle;
import com.huawei.hms.maps.model.GroundOverlay;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.MapStyleOptions;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.PointOfInterest;
import com.huawei.hms.maps.model.Polygon;
import com.huawei.hms.maps.model.Polyline;
import com.huawei.hms.maps.model.TileOverlay;
import com.huawei.hms.rn.map.HMSMarkerView;
import com.huawei.hms.rn.map.logger.HMSLogger;
import com.huawei.hms.rn.map.utils.ReactUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public class HMSMapView extends TextureMapView implements OnMapReadyCallback, LifecycleEventListener, HuaweiMap.CancelableCallback, HuaweiMap.OnMapLoadedCallback, HuaweiMap.SnapshotReadyCallback, HuaweiMap.InfoWindowAdapter, HuaweiMap.OnCameraIdleListener, HuaweiMap.OnCameraMoveCanceledListener, HuaweiMap.OnCameraMoveListener, HuaweiMap.OnCameraMoveStartedListener, HuaweiMap.OnCircleClickListener, HuaweiMap.OnGroundOverlayClickListener, HuaweiMap.OnInfoWindowClickListener, HuaweiMap.OnInfoWindowCloseListener, HuaweiMap.OnInfoWindowLongClickListener, HuaweiMap.OnMapClickListener, HuaweiMap.OnMapLongClickListener, HuaweiMap.OnMarkerClickListener, HuaweiMap.OnMarkerDragListener, HuaweiMap.OnMyLocationButtonClickListener, HuaweiMap.OnMyLocationClickListener, HuaweiMap.OnPoiClickListener, HuaweiMap.OnPolygonClickListener, HuaweiMap.OnPolylineClickListener {
    private static final String TAG = HMSMapView.class.getSimpleName();
    private List<MapLayerView> allMapLayerViews = new ArrayList();
    private Map<Circle, HMSCircleView> circleMap = new HashMap();
    private Map<GroundOverlay, HMSGroundOverlayView> groundOverlayMap = new HashMap();
    private boolean initialBuildingsEnabled;
    private CameraPosition initialCameraPosition;
    private boolean initialCompassEnabled;
    private String initialDescription;
    private int[] initialMapPadding;
    private String initialMapStyle;
    private int initialMapType;
    private boolean initialMarkerClustering;
    private boolean initialMyLocationButtonEnabled;
    private boolean initialMyLocationEnabled;
    private boolean initialZoomControlsEnabled;
    private HMSLogger logger;
    private int mAnimationDuration = 250;
    private boolean mCompassEnabled = true;
    private HuaweiMap mHuaweiMap;
    private LocationManager mLocationManager;
    private boolean mMyLocationButtonEnabled = true;
    private boolean mMyLocationEnabled = false;
    private ReactContext mReactContext;
    private UiSettings mUiSettings;
    private boolean mUseAnimation = false;
    private boolean mZoomControlsEnabled = true;
    private Map<Marker, HMSMarkerView> markerMap = new HashMap();
    private final Runnable measureAndLayout = new f(this);
    private Map<Polygon, HMSPolygonView> polygonMap = new HashMap();
    private Map<Polyline, HMSPolylineView> polylineMap = new HashMap();
    private Map<TileOverlay, HMSTileOverlayView> tileOverlayMap = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.rn.map.HMSMapView$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[Manager.Command.values().length];
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command = iArr;
            iArr[Manager.Command.CLEAR.ordinal()] = 1;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.TAKE_SNAPSHOT.ordinal()] = 2;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.RESET_ZOOM_PREFERENCE.ordinal()] = 3;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.STOP_ANIMATION.ordinal()] = 4;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.SET_CAMERA_POSITION.ordinal()] = 5;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.SET_COORDINATES.ordinal()] = 6;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.SET_BOUNDS.ordinal()] = 7;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.SCROLL_BY.ordinal()] = 8;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.ZOOM_BY.ordinal()] = 9;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.ZOOM_TO.ordinal()] = 10;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.ZOOM_IN.ordinal()] = 11;
            $SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Manager.Command.ZOOM_OUT.ordinal()] = 12;
        }
    }

    public static class Manager extends ViewGroupManager<HMSMapView> {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private HMSLogger logger;

        public enum Command implements ReactUtils.NamedCommand {
            CLEAR("clear"),
            TAKE_SNAPSHOT("takeSnapshot"),
            RESET_ZOOM_PREFERENCE("resetMinMaxZoomPreference"),
            STOP_ANIMATION("stopAnimation"),
            SET_CAMERA_POSITION("setCameraPosition"),
            SET_COORDINATES("setCoordinates"),
            SET_BOUNDS("setBounds"),
            SCROLL_BY("scrollBy"),
            ZOOM_BY("zoomBy"),
            ZOOM_IN("zoomIn"),
            ZOOM_OUT("zoomOut"),
            ZOOM_TO("zoomTo");
            
            private String mapCommandName;

            private Command(String str) {
                this.mapCommandName = str;
            }

            @Override // com.huawei.hms.rn.map.utils.ReactUtils.NamedCommand
            public String getName() {
                return this.mapCommandName;
            }
        }

        public enum Event implements ReactUtils.NamedEvent {
            MAP_READY("onMapReady"),
            CAMERA_UPDATE_FINISHED("onCameraUpdateFinished"),
            CAMERA_UPDATE_CANCELED("onCameraUpdateCanceled"),
            CAMERA_IDLE("onCameraIdle"),
            CAMERA_MOVE_CANCELED("onCameraMoveCanceled"),
            CAMERA_MOVE("onCameraMove"),
            CAMERA_MOVE_STARTED("onCameraMoveStarted"),
            MAP_CLICK("onMapClick"),
            MAP_LOADED("onMapLoaded"),
            MAP_LONG_CLICK("onMapLongClick"),
            MY_LOCATION_BUTTON_CLICK("onMyLocationButtonClick"),
            MY_LOCATION_CLICK("onMyLocationClick"),
            POI_CLICK("onPoiClick"),
            SNAPSHOT_READY("onSnapshotReady");
            
            private String mapEventName;

            private Event(String str) {
                this.mapEventName = str;
            }

            @Override // com.huawei.hms.rn.map.utils.ReactUtils.NamedEvent
            public String getName() {
                return this.mapEventName;
            }
        }

        public Manager(Context context) {
            this.logger = HMSLogger.getInstance(context);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public Map<String, Integer> getCommandsMap() {
            return ReactUtils.getCommandsMap(Command.values());
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            return ReactUtils.getExportedCustomDirectEventTypeConstantsFromEvents(Event.values());
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(30724);
        }

        @xj0(name = "animationDuration")
        public void setAnimationDuration(HMSMapView hMSMapView, int i) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30737);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setAnimationDuration(i);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "buildingsEnabled")
        public void setBuildingsEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30738);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setBuildingsEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "camera")
        public void setCamera(HMSMapView hMSMapView, ReadableMap readableMap) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30739);
            hMSLogger.startMethodExecutionTimer(r1);
            if (readableMap != null) {
                hMSMapView.setCamera(ReactUtils.getCameraPositionFromReadableMap(readableMap));
            }
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "compassEnabled")
        public void setCompassEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30740);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.mCompassEnabled = z;
            hMSMapView.setCompassEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "description")
        public void setDescription(HMSMapView hMSMapView, String str) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30741);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setDescription(str);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "latLngBoundsForCameraTarget")
        public void setLatLngBoundsForCameraTarget(HMSMapView hMSMapView, ReadableArray readableArray) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30742);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setLatLngBoundsForCameraTarget(readableArray);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "mapPadding")
        public void setMapPadding(HMSMapView hMSMapView, ReadableMap readableMap) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30743);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setMapPadding(readableMap);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "mapStyle")
        public void setMapStyle(HMSMapView hMSMapView, String str) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30744);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setMapStyle(str);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "mapType")
        public void setMapType(HMSMapView hMSMapView, int i) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30745);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setMapType(i);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "markerClustering")
        public void setMarkerClustering(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30746);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setMarkerClustering(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "maxZoomPreference")
        public void setMaxZoomPreference(HMSMapView hMSMapView, int i) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30747);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setMaxZoomPreference(i);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "minZoomPreference")
        public void setMinZoomPreference(HMSMapView hMSMapView, int i) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30748);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setMinZoomPreference(i);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "myLocationButtonEnabled")
        public void setMyLocationButtonEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30749);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.mMyLocationButtonEnabled = z;
            hMSMapView.setMyLocationButtonEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "myLocationEnabled")
        public void setMyLocationEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30750);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.mMyLocationEnabled = z;
            hMSMapView.setMyLocationEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "rotateGesturesEnabled")
        public void setRotateGesturesEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30751);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setRotateGesturesEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "scrollGesturesEnabled")
        public void setScrollGesturesEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30752);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setScrollGesturesEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "scrollGesturesEnabledDuringRotateOrZoom")
        public void setScrollGesturesEnabledDuringRotateOrZoom(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30753);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setScrollGesturesEnabledDuringRotateOrZoom(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "tiltGesturesEnabled")
        public void setTiltGesturesEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30754);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setTiltGesturesEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "useAnimation")
        public void setUseAnimation(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30755);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setUseAnimation(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "zoomControlsEnabled")
        public void setZoomControlsEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30756);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.mZoomControlsEnabled = z;
            hMSMapView.setZoomControlsEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        @xj0(name = "zoomGesturesEnabled")
        public void setZoomGesturesEnabled(HMSMapView hMSMapView, boolean z) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30757);
            hMSLogger.startMethodExecutionTimer(r1);
            hMSMapView.setZoomGesturesEnabled(z);
            this.logger.sendSingleEvent(r1);
        }

        public void addView(HMSMapView hMSMapView, View view, int i) {
            hMSMapView.addMapLayer(view, i);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSMapView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(30723);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSMapView hMSMapView = new HMSMapView(k0Var, new HuaweiMapOptions());
            this.logger.sendSingleEvent(r1);
            return hMSMapView;
        }

        public View getChildAt(HMSMapView hMSMapView, int i) {
            return hMSMapView.getMapLayer(i);
        }

        public int getChildCount(HMSMapView hMSMapView) {
            return hMSMapView.getMapLayerSize();
        }

        public void receiveCommand(HMSMapView hMSMapView, int i, ReadableArray readableArray) {
            if (i < Command.values().length) {
                switch (AnonymousClass1.$SwitchMap$com$huawei$hms$rn$map$HMSMapView$Manager$Command[Command.values()[i].ordinal()]) {
                    case 1:
                        HMSLogger hMSLogger = this.logger;
                        String r5 = C0201.m82(30736);
                        hMSLogger.startMethodExecutionTimer(r5);
                        hMSMapView.clear();
                        this.logger.sendSingleEvent(r5);
                        return;
                    case 2:
                        this.logger.startMethodExecutionTimer(C0201.m82(30735));
                        hMSMapView.takeSnapshot();
                        return;
                    case 3:
                        HMSLogger hMSLogger2 = this.logger;
                        String r52 = C0201.m82(30734);
                        hMSLogger2.startMethodExecutionTimer(r52);
                        hMSMapView.resetZoomPreference();
                        this.logger.sendSingleEvent(r52);
                        return;
                    case 4:
                        HMSLogger hMSLogger3 = this.logger;
                        String r53 = C0201.m82(30733);
                        hMSLogger3.startMethodExecutionTimer(r53);
                        hMSMapView.stopAnimation();
                        this.logger.sendSingleEvent(r53);
                        return;
                    case 5:
                        HMSLogger hMSLogger4 = this.logger;
                        String r0 = C0201.m82(30732);
                        hMSLogger4.startMethodExecutionTimer(r0);
                        hMSMapView.setCameraPosition(readableArray);
                        this.logger.sendSingleEvent(r0);
                        return;
                    case 6:
                        HMSLogger hMSLogger5 = this.logger;
                        String r02 = C0201.m82(30731);
                        hMSLogger5.startMethodExecutionTimer(r02);
                        hMSMapView.setCoordinates(readableArray);
                        this.logger.sendSingleEvent(r02);
                        return;
                    case 7:
                        HMSLogger hMSLogger6 = this.logger;
                        String r03 = C0201.m82(30730);
                        hMSLogger6.startMethodExecutionTimer(r03);
                        hMSMapView.setBounds(readableArray);
                        this.logger.sendSingleEvent(r03);
                        return;
                    case 8:
                        HMSLogger hMSLogger7 = this.logger;
                        String r04 = C0201.m82(30729);
                        hMSLogger7.startMethodExecutionTimer(r04);
                        hMSMapView.scrollBy(readableArray);
                        this.logger.sendSingleEvent(r04);
                        return;
                    case 9:
                        HMSLogger hMSLogger8 = this.logger;
                        String r05 = C0201.m82(30728);
                        hMSLogger8.startMethodExecutionTimer(r05);
                        hMSMapView.zoomBy(readableArray);
                        this.logger.sendSingleEvent(r05);
                        return;
                    case 10:
                        HMSLogger hMSLogger9 = this.logger;
                        String r06 = C0201.m82(30727);
                        hMSLogger9.startMethodExecutionTimer(r06);
                        hMSMapView.zoomTo(readableArray);
                        this.logger.sendSingleEvent(r06);
                        return;
                    case 11:
                        HMSLogger hMSLogger10 = this.logger;
                        String r54 = C0201.m82(30726);
                        hMSLogger10.startMethodExecutionTimer(r54);
                        hMSMapView.zoomIn();
                        this.logger.sendSingleEvent(r54);
                        return;
                    case 12:
                        HMSLogger hMSLogger11 = this.logger;
                        String r55 = C0201.m82(30725);
                        hMSLogger11.startMethodExecutionTimer(r55);
                        hMSMapView.zoomOut();
                        this.logger.sendSingleEvent(r55);
                        return;
                    default:
                        return;
                }
            }
        }

        public void removeViewAt(HMSMapView hMSMapView, int i) {
            hMSMapView.removeMapLayer(i);
        }
    }

    public interface MapLayer {
        Object addTo(HuaweiMap huaweiMap);

        WritableMap getInfo();

        WritableMap getOptionsInfo();

        void removeFrom(HuaweiMap huaweiMap);
    }

    public static abstract class MapLayerView extends f implements MapLayer {
        private ReactContext mReactContext;

        public MapLayerView(Context context) {
            super(context);
            this.mReactContext = (ReactContext) context;
        }

        public void sendEvent(ReactUtils.NamedEvent namedEvent, WritableMap writableMap) {
            String str = HMSMapView.TAG;
            Log.i(str, C0201.m82(10209) + namedEvent.getName());
            ((RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), namedEvent.getName(), writableMap);
        }
    }

    public static abstract class MapLayerViewManager<T extends MapLayerView> extends ViewGroupManager<T> {

        public enum Event implements ReactUtils.NamedEvent {
            CLICK("onClick");
            
            private String name;

            private Event(String str) {
                this.name = str;
            }

            @Override // com.huawei.hms.rn.map.utils.ReactUtils.NamedEvent
            public String getName() {
                return this.name;
            }
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            return ReactUtils.getExportedCustomDirectEventTypeConstantsFromEvents(Event.values());
        }
    }

    public static class Module extends ReactContextBaseJavaModule {
        private HMSLogger logger;

        public Module(ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.logger = HMSLogger.getInstance(reactApplicationContext);
        }

        public static /* synthetic */ void a(int i, Promise promise, ReadableMap readableMap, m mVar) {
            View w = mVar.w(i);
            if (w instanceof HMSMapView) {
                HMSMapView hMSMapView = (HMSMapView) w;
                if (hMSMapView.mHuaweiMap != null) {
                    promise.resolve(ReactUtils.getWritableMapFromLatLng(hMSMapView.mHuaweiMap.getProjection().fromScreenLocation(ReactUtils.getPointFromReadableMap(readableMap))));
                } else {
                    promise.reject(C0201.m82(6263), C0201.m82(6264));
                }
            } else {
                String str = HMSMapView.TAG;
                Log.e(str, C0201.m82(6265) + w);
                promise.reject(C0201.m82(6266), C0201.m82(6267));
            }
        }

        public static /* synthetic */ void b(int i, Promise promise, m mVar) {
            View w = mVar.w(i);
            if (w instanceof HMSMapView) {
                HMSMapView hMSMapView = (HMSMapView) w;
                if (hMSMapView.mHuaweiMap != null) {
                    promise.resolve(ReactUtils.getWritableMapFromHuaweiMap(hMSMapView.mHuaweiMap));
                } else {
                    promise.reject(C0201.m82(6268), C0201.m82(6269));
                }
            } else {
                String str = HMSMapView.TAG;
                Log.e(str, C0201.m82(6270) + w);
                promise.reject(C0201.m82(6271), C0201.m82(6272));
            }
        }

        public static /* synthetic */ void c(int i, Promise promise, m mVar) {
            View w = mVar.w(i);
            if (w instanceof MapLayerView) {
                WritableMap info = ((MapLayerView) w).getInfo();
                if (info != null) {
                    promise.resolve(info);
                } else {
                    promise.reject(C0201.m82(6273), C0201.m82(6274));
                }
            } else {
                promise.reject(C0201.m82(6275), C0201.m82(6276));
            }
        }

        public static /* synthetic */ void d(int i, Promise promise, m mVar) {
            View w = mVar.w(i);
            if (w instanceof MapLayerView) {
                WritableMap optionsInfo = ((MapLayerView) w).getOptionsInfo();
                if (optionsInfo != null) {
                    promise.resolve(optionsInfo);
                } else {
                    promise.reject(C0201.m82(6277), C0201.m82(6278));
                }
            } else {
                promise.reject(C0201.m82(6279), C0201.m82(6280));
            }
        }

        public static /* synthetic */ void e(int i, Promise promise, ReadableMap readableMap, m mVar) {
            View w = mVar.w(i);
            if (w instanceof HMSMapView) {
                HMSMapView hMSMapView = (HMSMapView) w;
                if (hMSMapView.mHuaweiMap != null) {
                    promise.resolve(ReactUtils.getWritableMapFromPoint(hMSMapView.mHuaweiMap.getProjection().toScreenLocation(ReactUtils.getLatLngFromReadableMap(readableMap))));
                } else {
                    promise.reject(C0201.m82(6281), C0201.m82(6282));
                }
            } else {
                String str = HMSMapView.TAG;
                Log.e(str, C0201.m82(6283) + w);
                promise.reject(C0201.m82(6284), C0201.m82(6285));
            }
        }

        @ReactMethod
        public void disableLogger(Promise promise) {
            this.logger.disableLogger();
            promise.resolve(null);
        }

        @ReactMethod
        public void enableLogger(Promise promise) {
            this.logger.enableLogger();
            promise.resolve(null);
        }

        @ReactMethod
        public void getCoordinateFromPoint(int i, ReadableMap readableMap, Promise promise) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(6286);
            hMSLogger.startMethodExecutionTimer(r1);
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new d(i, promise, readableMap));
            Log.i(HMSMapView.TAG, C0201.m82(6287));
            this.logger.sendSingleEvent(r1);
        }

        @ReactMethod
        public void getDistance(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(6288);
            hMSLogger.startMethodExecutionTimer(r1);
            LatLng latLngFromReadableMap = ReactUtils.getLatLngFromReadableMap(readableMap);
            LatLng latLngFromReadableMap2 = ReactUtils.getLatLngFromReadableMap(readableMap2);
            if (latLngFromReadableMap == null || latLngFromReadableMap2 == null) {
                promise.reject(C0201.m82(6289), C0201.m82(6290));
            } else {
                promise.resolve(Double.valueOf(DistanceCalculator.computeDistanceBetween(latLngFromReadableMap, latLngFromReadableMap2)));
            }
            this.logger.sendSingleEvent(r1);
        }

        @ReactMethod
        public void getHuaweiMapInfo(int i, Promise promise) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(6291);
            hMSLogger.startMethodExecutionTimer(r1);
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new c(i, promise));
            Log.i(HMSMapView.TAG, C0201.m82(6292));
            this.logger.sendSingleEvent(r1);
        }

        @ReactMethod
        public void getLayerInfo(int i, Promise promise) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(6293);
            hMSLogger.startMethodExecutionTimer(r1);
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new e(i, promise));
            this.logger.sendSingleEvent(r1);
        }

        @ReactMethod
        public void getLayerOptionsInfo(int i, Promise promise) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(6294);
            hMSLogger.startMethodExecutionTimer(r1);
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(i, promise));
            this.logger.sendSingleEvent(r1);
        }

        @Override // com.facebook.react.bridge.NativeModule
        public String getName() {
            return C0201.m82(6295);
        }

        @ReactMethod
        public void getPointFromCoordinate(int i, ReadableMap readableMap, Promise promise) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(6296);
            hMSLogger.startMethodExecutionTimer(r1);
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new a(i, promise, readableMap));
            Log.i(HMSMapView.TAG, C0201.m82(6297));
            this.logger.sendSingleEvent(r1);
        }
    }

    public HMSMapView(Context context, HuaweiMapOptions huaweiMapOptions) {
        super(context, huaweiMapOptions);
        this.logger = HMSLogger.getInstance(context);
        if (context instanceof ReactContext) {
            this.mReactContext = (ReactContext) context;
        }
        Object systemService = context.getSystemService(C0201.m82(13936));
        if (systemService instanceof LocationManager) {
            this.mLocationManager = (LocationManager) systemService;
        }
        onCreate(null);
        getMapAsync(this);
        requestLayout();
    }

    private void applyCameraUpdate(CameraUpdate cameraUpdate) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null && cameraUpdate != null) {
            if (this.mUseAnimation) {
                huaweiMap.animateCamera(cameraUpdate, this.mAnimationDuration, this);
            } else {
                huaweiMap.moveCamera(cameraUpdate);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clear() {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.clear();
        }
    }

    private void initializeMap() {
        setCamera(this.initialCameraPosition);
        setMapType(this.initialMapType);
        setBuildingsEnabled(this.initialBuildingsEnabled);
        setDescription(this.initialDescription);
        setMapStyle(this.initialMapStyle);
        setMyLocationEnabled(this.initialMyLocationEnabled);
        setMyLocationButtonEnabled(this.initialMyLocationButtonEnabled);
        setMarkerClustering(this.initialMarkerClustering);
        setCompassEnabled(this.initialCompassEnabled);
        setZoomControlsEnabled(this.initialZoomControlsEnabled);
        int[] iArr = this.initialMapPadding;
        if (iArr != null) {
            this.mHuaweiMap.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void resetZoomPreference() {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.resetMinMaxZoomPreference();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void scrollBy(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Number) && ReactUtils.hasValidElement(readableArray, 0, ReadableType.Number)) {
            applyCameraUpdate(CameraUpdateFactory.scrollBy((float) readableArray.getDouble(0), (float) readableArray.getDouble(1)));
        }
    }

    private void sendEvent(Manager.Event event, WritableMap writableMap) {
        String str = TAG;
        Log.i(str, C0201.m82(13937) + event.getName());
        ((RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), event.getName(), writableMap);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setAnimationDuration(int i) {
        this.mAnimationDuration = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setBounds(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Array) && ReactUtils.hasValidElement(readableArray, 1, ReadableType.Number)) {
            LatLngBounds latLngBoundsFromReadableArray = ReactUtils.getLatLngBoundsFromReadableArray(readableArray.getArray(0));
            int i = readableArray.getInt(1);
            if (!ReactUtils.hasValidElement(readableArray, 2, ReadableType.Number) || !ReactUtils.hasValidElement(readableArray, 3, ReadableType.Number)) {
                applyCameraUpdate(CameraUpdateFactory.newLatLngBounds(latLngBoundsFromReadableArray, i));
            } else {
                applyCameraUpdate(CameraUpdateFactory.newLatLngBounds(latLngBoundsFromReadableArray, readableArray.getInt(2), readableArray.getInt(3), i));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setBuildingsEnabled(boolean z) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.setBuildingsEnabled(z);
        } else {
            this.initialBuildingsEnabled = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCamera(CameraPosition cameraPosition) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap == null || cameraPosition == null) {
            this.initialCameraPosition = cameraPosition;
        } else {
            huaweiMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCameraPosition(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Map)) {
            applyCameraUpdate(CameraUpdateFactory.newCameraPosition(ReactUtils.getCameraPositionFromReadableMap(readableArray.getMap(0))));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCompassEnabled(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setCompassEnabled(z);
        } else {
            this.initialCompassEnabled = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCoordinates(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Map)) {
            LatLng latLngFromReadableMap = ReactUtils.getLatLngFromReadableMap(readableArray.getMap(0));
            if (ReactUtils.hasValidElement(readableArray, 1, ReadableType.Number)) {
                applyCameraUpdate(CameraUpdateFactory.newLatLngZoom(latLngFromReadableMap, (float) readableArray.getDouble(1)));
            } else {
                applyCameraUpdate(CameraUpdateFactory.newLatLng(latLngFromReadableMap));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDescription(String str) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap == null || str == null) {
            this.initialDescription = str;
        } else {
            huaweiMap.setContentDescription(str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setLatLngBoundsForCameraTarget(ReadableArray readableArray) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null && readableArray != null) {
            huaweiMap.setLatLngBoundsForCameraTarget(ReactUtils.getLatLngBoundsFromReadableArray(readableArray));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMapPadding(ReadableMap readableMap) {
        if (readableMap != null) {
            ReadableType readableType = ReadableType.Number;
            String r1 = C0201.m82(13938);
            int i = ReactUtils.hasValidKey(readableMap, r1, readableType) ? readableMap.getInt(r1) : 0;
            ReadableType readableType2 = ReadableType.Number;
            String r3 = C0201.m82(13939);
            int i2 = ReactUtils.hasValidKey(readableMap, r3, readableType2) ? readableMap.getInt(r3) : 0;
            ReadableType readableType3 = ReadableType.Number;
            String r4 = C0201.m82(13940);
            int i3 = ReactUtils.hasValidKey(readableMap, r4, readableType3) ? readableMap.getInt(r4) : 0;
            ReadableType readableType4 = ReadableType.Number;
            String r5 = C0201.m82(13941);
            int i4 = ReactUtils.hasValidKey(readableMap, r5, readableType4) ? readableMap.getInt(r5) : 0;
            HuaweiMap huaweiMap = this.mHuaweiMap;
            if (huaweiMap != null) {
                huaweiMap.setPadding(i, i2, i3, i4);
            } else {
                this.initialMapPadding = new int[]{i, i2, i3, i4};
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMapStyle(String str) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap == null || str == null) {
            this.initialMapStyle = str;
            return;
        }
        huaweiMap.setMapStyle(new MapStyleOptions(str));
        setCompassEnabled(this.mCompassEnabled);
        setMyLocationButtonEnabled(this.mMyLocationButtonEnabled);
        setZoomControlsEnabled(this.mZoomControlsEnabled);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMapType(int i) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.setMapType(i);
        } else {
            this.initialMapType = i;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMarkerClustering(boolean z) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.setMarkersClustering(z);
        } else {
            this.initialMarkerClustering = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMaxZoomPreference(int i) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.setMaxZoomPreference((float) i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMinZoomPreference(int i) {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.setMinZoomPreference((float) i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMyLocationButtonEnabled(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setMyLocationButtonEnabled(z);
        } else {
            this.initialMyLocationButtonEnabled = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMyLocationEnabled(boolean z) {
        if (this.mHuaweiMap == null || !this.mLocationManager.isProviderEnabled(C0201.m82(13942)) || !this.mLocationManager.isProviderEnabled(C0201.m82(13943))) {
            this.initialMyLocationEnabled = z;
            return;
        }
        this.mHuaweiMap.setMyLocationEnabled(hasLocationPermission() && z);
        setMyLocationButtonEnabled(this.mMyLocationButtonEnabled);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setRotateGesturesEnabled(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setRotateGesturesEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setScrollGesturesEnabled(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setScrollGesturesEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setScrollGesturesEnabledDuringRotateOrZoom(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTiltGesturesEnabled(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setTiltGesturesEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setUseAnimation(boolean z) {
        this.mUseAnimation = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZoomControlsEnabled(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setZoomControlsEnabled(z);
        } else {
            this.initialZoomControlsEnabled = z;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZoomGesturesEnabled(boolean z) {
        UiSettings uiSettings = this.mUiSettings;
        if (uiSettings != null) {
            uiSettings.setZoomGesturesEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void stopAnimation() {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.stopAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void takeSnapshot() {
        HuaweiMap huaweiMap = this.mHuaweiMap;
        if (huaweiMap != null) {
            huaweiMap.snapshot(this);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zoomBy(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Number)) {
            float f = (float) readableArray.getDouble(0);
            if (ReactUtils.hasValidElement(readableArray, 1, ReadableType.Map)) {
                applyCameraUpdate(CameraUpdateFactory.zoomBy(f, ReactUtils.getPointFromReadableMap(readableArray.getMap(1))));
            } else {
                applyCameraUpdate(CameraUpdateFactory.zoomBy(f));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zoomIn() {
        applyCameraUpdate(CameraUpdateFactory.zoomIn());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zoomOut() {
        applyCameraUpdate(CameraUpdateFactory.zoomOut());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void zoomTo(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Number)) {
            applyCameraUpdate(CameraUpdateFactory.zoomTo((float) readableArray.getDouble(0)));
        }
    }

    public /* synthetic */ void a() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    public void addMapLayer(View view, int i) {
        if (view instanceof MapLayerView) {
            this.allMapLayerViews.add(i, (MapLayerView) view);
            if (view instanceof HMSCircleView) {
                HMSCircleView hMSCircleView = (HMSCircleView) view;
                this.circleMap.put(hMSCircleView.addTo(this.mHuaweiMap), hMSCircleView);
            }
            if (view instanceof HMSMarkerView) {
                HMSMarkerView hMSMarkerView = (HMSMarkerView) view;
                this.markerMap.put(hMSMarkerView.addTo(this.mHuaweiMap), hMSMarkerView);
            }
            if (view instanceof HMSPolygonView) {
                HMSPolygonView hMSPolygonView = (HMSPolygonView) view;
                this.polygonMap.put(hMSPolygonView.addTo(this.mHuaweiMap), hMSPolygonView);
            }
            if (view instanceof HMSPolylineView) {
                HMSPolylineView hMSPolylineView = (HMSPolylineView) view;
                this.polylineMap.put(hMSPolylineView.addTo(this.mHuaweiMap), hMSPolylineView);
            }
            if (view instanceof HMSGroundOverlayView) {
                HMSGroundOverlayView hMSGroundOverlayView = (HMSGroundOverlayView) view;
                this.groundOverlayMap.put(hMSGroundOverlayView.addTo(this.mHuaweiMap), hMSGroundOverlayView);
            }
            if (view instanceof HMSTileOverlayView) {
                HMSTileOverlayView hMSTileOverlayView = (HMSTileOverlayView) view;
                this.tileOverlayMap.put(hMSTileOverlayView.addTo(this.mHuaweiMap), hMSTileOverlayView);
            }
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        return null;
    }

    @Override // com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView != null) {
            return hMSMarkerView.getWrappedInfoWindowView();
        }
        return null;
    }

    public View getMapLayer(int i) {
        return this.allMapLayerViews.get(i);
    }

    public int getMapLayerSize() {
        return this.allMapLayerViews.size();
    }

    public boolean hasLocationPermission() {
        return b.a(this.mReactContext, C0201.m82(13944)) == 0 || b.a(this.mReactContext, C0201.m82(13945)) == 0;
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener
    public void onCameraIdle() {
        this.logger.sendSingleEvent(C0201.m82(13946));
        sendEvent(Manager.Event.CAMERA_IDLE, ReactUtils.getWritableMapFromCameraPosition(this.mHuaweiMap.getCameraPosition()));
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener
    public void onCameraMove() {
        this.logger.sendSingleEvent(C0201.m82(13947));
        sendEvent(Manager.Event.CAMERA_MOVE, ReactUtils.getWritableMapFromCameraPosition(this.mHuaweiMap.getCameraPosition()));
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener
    public void onCameraMoveCanceled() {
        this.logger.sendSingleEvent(C0201.m82(13948));
        sendEvent(Manager.Event.CAMERA_MOVE_CANCELED, null);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(C0201.m82(13949), i);
        this.logger.sendSingleEvent(C0201.m82(13950));
        sendEvent(Manager.Event.CAMERA_MOVE_STARTED, writableNativeMap);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
    public void onCancel() {
        this.logger.sendSingleEvent(C0201.m82(13951));
        sendEvent(Manager.Event.CAMERA_UPDATE_CANCELED, null);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnCircleClickListener
    public void onCircleClick(Circle circle) {
        HMSCircleView hMSCircleView = this.circleMap.get(circle);
        if (hMSCircleView != null) {
            this.logger.sendSingleEvent(C0201.m82(13952));
            hMSCircleView.sendEvent(MapLayerViewManager.Event.CLICK, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.CancelableCallback
    public void onFinish() {
        this.logger.sendSingleEvent(C0201.m82(13953));
        sendEvent(Manager.Event.CAMERA_UPDATE_FINISHED, null);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener
    public void onGroundOverlayClick(GroundOverlay groundOverlay) {
        HMSGroundOverlayView hMSGroundOverlayView = this.groundOverlayMap.get(groundOverlay);
        if (hMSGroundOverlayView != null) {
            this.logger.sendSingleEvent(C0201.m82(13954));
            hMSGroundOverlayView.sendEvent(MapLayerViewManager.Event.CLICK, null);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mReactContext.removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        setMyLocationEnabled(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        setMyLocationEnabled(hasLocationPermission() && this.mMyLocationEnabled);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView != null) {
            this.logger.sendSingleEvent(C0201.m82(13955));
            hMSMarkerView.sendEvent(HMSMarkerView.Manager.Event.INFO_WINDOW_CLICK, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener
    public void onInfoWindowClose(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView != null) {
            this.logger.sendSingleEvent(C0201.m82(13956));
            hMSMarkerView.sendEvent(HMSMarkerView.Manager.Event.INFO_WINDOW_CLOSE, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView != null) {
            this.logger.sendSingleEvent(C0201.m82(13957));
            hMSMarkerView.sendEvent(HMSMarkerView.Manager.Event.INFO_WINDOW_LONG_CLICK, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMapClickListener
    public void onMapClick(LatLng latLng) {
        WritableMap writableMapFromProjectionOnLatLng = ReactUtils.getWritableMapFromProjectionOnLatLng(this.mHuaweiMap.getProjection(), latLng);
        this.logger.sendSingleEvent(C0201.m82(13958));
        sendEvent(Manager.Event.MAP_CLICK, writableMapFromProjectionOnLatLng);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback
    public void onMapLoaded() {
        this.logger.sendSingleEvent(C0201.m82(13959));
        sendEvent(Manager.Event.MAP_LOADED, null);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener
    public void onMapLongClick(LatLng latLng) {
        WritableMap writableMapFromProjectionOnLatLng = ReactUtils.getWritableMapFromProjectionOnLatLng(this.mHuaweiMap.getProjection(), latLng);
        this.logger.sendSingleEvent(C0201.m82(13960));
        sendEvent(Manager.Event.MAP_LONG_CLICK, writableMapFromProjectionOnLatLng);
    }

    @Override // com.huawei.hms.maps.OnMapReadyCallback
    public void onMapReady(HuaweiMap huaweiMap) {
        this.mHuaweiMap = huaweiMap;
        this.mUiSettings = huaweiMap.getUiSettings();
        this.mHuaweiMap.setInfoWindowAdapter(this);
        this.mHuaweiMap.setOnCameraIdleListener(this);
        this.mHuaweiMap.setOnCameraMoveCanceledListener(this);
        this.mHuaweiMap.setOnCameraMoveListener(this);
        this.mHuaweiMap.setOnCameraMoveStartedListener(this);
        this.mHuaweiMap.setOnCircleClickListener(this);
        this.mHuaweiMap.setOnGroundOverlayClickListener(this);
        this.mHuaweiMap.setOnInfoWindowClickListener(this);
        this.mHuaweiMap.setOnInfoWindowCloseListener(this);
        this.mHuaweiMap.setOnInfoWindowLongClickListener(this);
        this.mHuaweiMap.setOnMapClickListener(this);
        this.mHuaweiMap.setOnMapLoadedCallback(this);
        this.mHuaweiMap.setOnMapLongClickListener(this);
        this.mHuaweiMap.setOnMarkerClickListener(this);
        this.mHuaweiMap.setOnMarkerDragListener(this);
        this.mHuaweiMap.setOnMyLocationButtonClickListener(this);
        this.mHuaweiMap.setOnMyLocationClickListener(this);
        this.mHuaweiMap.setOnPoiClickListener(this);
        this.mHuaweiMap.setOnPolygonClickListener(this);
        this.mHuaweiMap.setOnPolylineClickListener(this);
        this.mReactContext.addLifecycleEventListener(this);
        initializeMap();
        this.logger.sendSingleEvent(C0201.m82(13961));
        sendEvent(Manager.Event.MAP_READY, null);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView == null) {
            return false;
        }
        this.logger.sendSingleEvent(C0201.m82(13962));
        hMSMarkerView.sendEvent(HMSMarkerView.Manager.Event.CLICK, null);
        return !hMSMarkerView.defaultActionOnClick;
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener
    public void onMarkerDrag(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView != null) {
            this.logger.sendSingleEvent(C0201.m82(13963));
            hMSMarkerView.sendEvent(HMSMarkerView.Manager.Event.DRAG, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener
    public void onMarkerDragEnd(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView != null) {
            this.logger.sendSingleEvent(C0201.m82(13964));
            hMSMarkerView.sendEvent(HMSMarkerView.Manager.Event.DRAG_END, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener
    public void onMarkerDragStart(Marker marker) {
        HMSMarkerView hMSMarkerView = this.markerMap.get(marker);
        if (hMSMarkerView != null) {
            this.logger.sendSingleEvent(C0201.m82(13965));
            hMSMarkerView.sendEvent(HMSMarkerView.Manager.Event.DRAG_START, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener
    public boolean onMyLocationButtonClick() {
        this.logger.sendSingleEvent(C0201.m82(13966));
        sendEvent(Manager.Event.MY_LOCATION_BUTTON_CLICK, null);
        return false;
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener
    public void onMyLocationClick(Location location) {
        this.logger.sendSingleEvent(C0201.m82(13967));
        sendEvent(Manager.Event.MY_LOCATION_CLICK, null);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnPoiClickListener
    public void onPoiClick(PointOfInterest pointOfInterest) {
        WritableMap writableMapPointOfInterest = ReactUtils.getWritableMapPointOfInterest(pointOfInterest);
        this.logger.sendSingleEvent(C0201.m82(13968));
        sendEvent(Manager.Event.POI_CLICK, writableMapPointOfInterest);
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        HMSPolygonView hMSPolygonView = this.polygonMap.get(polygon);
        if (hMSPolygonView != null) {
            this.logger.sendSingleEvent(C0201.m82(13969));
            hMSPolygonView.sendEvent(MapLayerViewManager.Event.CLICK, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        HMSPolylineView hMSPolylineView = this.polylineMap.get(polyline);
        if (hMSPolylineView != null) {
            this.logger.sendSingleEvent(C0201.m82(13970));
            hMSPolylineView.sendEvent(MapLayerViewManager.Event.CLICK, null);
        }
    }

    @Override // com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback
    public void onSnapshotReady(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(C0201.m82(13971), encodeToString);
        this.logger.sendSingleEvent(C0201.m82(13972));
        sendEvent(Manager.Event.SNAPSHOT_READY, writableNativeMap);
    }

    public void removeMapLayer(int i) {
        this.allMapLayerViews.remove(i).removeFrom(this.mHuaweiMap);
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.measureAndLayout);
    }
}
