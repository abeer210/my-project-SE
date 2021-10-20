package com.huawei.hms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mae;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.man;
import com.huawei.hms.maps.mao;
import com.huawei.hms.maps.map;
import com.huawei.hms.maps.maq;
import com.huawei.hms.maps.mar;
import com.huawei.hms.maps.mas;
import com.huawei.hms.maps.mat;
import com.huawei.hms.maps.mau;
import com.huawei.hms.maps.mav;
import com.huawei.hms.maps.maw;
import com.huawei.hms.maps.may;
import com.huawei.hms.maps.maz;
import com.huawei.hms.maps.mba;
import com.huawei.hms.maps.mbc;
import com.huawei.hms.maps.mbd;
import com.huawei.hms.maps.mbe;
import com.huawei.hms.maps.mbf;
import com.huawei.hms.maps.mbg;
import com.huawei.hms.maps.mbh;
import com.huawei.hms.maps.mbi;
import com.huawei.hms.maps.mbo;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.Circle;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.GroundOverlay;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.IndoorBuilding;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.MapStyleOptions;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.PointOfInterest;
import com.huawei.hms.maps.model.Polygon;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.maps.model.Polyline;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hms.maps.model.TileOverlay;
import com.huawei.hms.maps.model.TileOverlayOptions;
import vigqyno.C0188;
import vigqyno.C0201;

public class HuaweiMap {
    public static final int MAP_TYPE_HYBRID = 0;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 0;
    public static final int MAP_TYPE_TERRAIN = 0;
    private mah a;
    private UiSettings b;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 0;
        public static final int REASON_DEVELOPER_ANIMATION = 0;
        public static final int REASON_GESTURE = 0;

        static {
            C0201.m83(OnCameraMoveStartedListener.class, 202);
        }

        void onCameraMoveStarted(int i);
    }

    public interface OnCircleClickListener {
        void onCircleClick(Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(GroundOverlay groundOverlay);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    public interface OnMyLocationClickListener {
        void onMyLocationClick(Location location);
    }

    public interface OnPoiClickListener {
        void onPoiClick(PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    static {
        C0201.m83(HuaweiMap.class, 395);
    }

    public HuaweiMap(mah mah) {
        this.a = mah;
        try {
            BitmapDescriptorFactory.sIBitmapDescriptorDelegate = mah.p();
        } catch (RemoteException unused) {
            mco.d(C0201.m82(340), C0201.m82(341));
        }
    }

    public Circle addCircle(CircleOptions circleOptions) {
        try {
            return new Circle(this.a.a(circleOptions));
        } catch (RemoteException e) {
            mco.a(C0201.m82(343), C0201.m82(342) + e.toString());
            return null;
        }
    }

    public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        try {
            mcb a2 = this.a.a(groundOverlayOptions);
            if (a2 != null) {
                return new GroundOverlay(a2);
            }
            return null;
        } catch (RemoteException e) {
            mco.a(C0201.m82(345), C0201.m82(344) + e.toString());
            return null;
        }
    }

    public Marker addMarker(MarkerOptions markerOptions) {
        try {
            return new Marker(this.a.a(markerOptions));
        } catch (RemoteException e) {
            mco.d(C0201.m82(347), C0201.m82(346) + e.toString());
            return null;
        }
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
            return new Polygon(this.a.a(polygonOptions));
        } catch (RemoteException e) {
            mco.a(C0201.m82(349), C0201.m82(348) + e.toString());
            return null;
        }
    }

    public Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
            return new Polyline(this.a.a(polylineOptions));
        } catch (RemoteException e) {
            mco.a(C0201.m82(351), C0201.m82(350) + e.toString());
            return null;
        }
    }

    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        try {
            return new TileOverlay(this.a.a(tileOverlayOptions));
        } catch (RemoteException e) {
            mco.d(C0201.m82(353), C0201.m82(352) + e.toString());
            return null;
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate) {
        String r0 = C0201.m82(354);
        try {
            mco.a(r0, C0201.m82(355));
            this.a.a(cameraUpdate.getCameraUpdate());
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(356) + e.toString());
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, int i, final CancelableCallback cancelableCallback) {
        try {
            this.a.a(cameraUpdate.getCameraUpdate(), i, cancelableCallback == null ? null : new mae.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass6 */

                @Override // com.huawei.hms.maps.mae
                public void onCancel() {
                    cancelableCallback.onCancel();
                }

                @Override // com.huawei.hms.maps.mae
                public void onFinish() {
                    cancelableCallback.onFinish();
                }
            });
        } catch (RemoteException e) {
            mco.a(C0201.m82(358), C0201.m82(357) + e.toString());
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, final CancelableCallback cancelableCallback) {
        String r0 = C0201.m82(359);
        mco.a(r0, C0201.m82(360));
        try {
            this.a.a(cameraUpdate.getCameraUpdate(), cancelableCallback == null ? null : new mae.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass5 */

                @Override // com.huawei.hms.maps.mae
                public void onCancel() {
                    cancelableCallback.onCancel();
                }

                @Override // com.huawei.hms.maps.mae
                public void onFinish() {
                    cancelableCallback.onFinish();
                }
            });
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(361) + e.toString());
        }
    }

    public void clear() {
        try {
            this.a.m();
        } catch (RemoteException e) {
            mco.a(C0201.m82(363), C0201.m82(362) + e.toString());
        }
    }

    public CameraPosition getCameraPosition() {
        String r0 = C0201.m82(364);
        try {
            mco.a(r0, C0201.m82(365));
            return this.a.n();
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(366) + e.toString());
            return null;
        }
    }

    public IndoorBuilding getFocusedBuilding() {
        try {
            mcc a2 = this.a.a();
            if (a2 == null) {
                return null;
            }
            return new IndoorBuilding(a2);
        } catch (RemoteException e) {
            mco.d(C0201.m82(368), C0201.m82(367) + e.toString());
            return null;
        }
    }

    public int getMapType() {
        try {
            return this.a.f();
        } catch (RemoteException e) {
            mco.a(C0201.m82(370), C0201.m82(369) + e.toString());
            return 0;
        }
    }

    public float getMaxZoomLevel() {
        try {
            return this.a.b();
        } catch (RemoteException e) {
            mco.a(C0201.m82(372), C0201.m82(371) + e.toString());
            return 0.0f;
        }
    }

    public float getMinZoomLevel() {
        try {
            return this.a.c();
        } catch (RemoteException e) {
            mco.a(C0201.m82(374), C0201.m82(373) + e.toString());
            return 0.0f;
        }
    }

    public Projection getProjection() {
        try {
            return new Projection(this.a.l());
        } catch (RemoteException e) {
            mco.d(C0201.m82(376), C0201.m82(375) + e.getMessage());
            return null;
        }
    }

    public UiSettings getUiSettings() {
        try {
            UiSettings uiSettings = new UiSettings(this.a.k());
            this.b = uiSettings;
            return uiSettings;
        } catch (RemoteException e) {
            mco.a(C0201.m82(378), C0201.m82(377) + e.toString());
            return null;
        }
    }

    public boolean isBuildingsEnabled() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            mco.a(C0201.m82(380), C0201.m82(379) + e.toString());
            return false;
        }
    }

    public boolean isIndoorEnabled() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            mco.d(C0201.m82(382), C0201.m82(381) + e.toString());
            return false;
        }
    }

    public boolean isMyLocationEnabled() {
        try {
            return this.a.e();
        } catch (RemoteException e) {
            mco.a(C0201.m82(384), C0201.m82(383) + e.toString());
            return false;
        }
    }

    public boolean isTrafficEnabled() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            mco.a(C0201.m82(386), C0201.m82(385) + e.toString());
            return false;
        }
    }

    public void moveCamera(CameraUpdate cameraUpdate) {
        String r0 = C0201.m82(387);
        try {
            mco.a(r0, C0201.m82(388));
            this.a.b(cameraUpdate.getCameraUpdate());
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(389) + e.toString());
        }
    }

    public void resetMinMaxZoomPreference() {
        try {
            this.a.i();
        } catch (RemoteException e) {
            mco.a(C0201.m82(391), C0201.m82(390) + e.toString());
        }
    }

    public void setBuildingsEnabled(boolean z) {
        try {
            this.a.a(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(393), C0201.m82(392) + e.toString());
        }
    }

    public void setContentDescription(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            mco.d(C0201.m82(395), C0201.m82(394) + e.toString());
        }
    }

    @Deprecated
    public void setGeoPoliticalView(String str) {
        String r0 = C0201.m82(396);
        try {
            mco.b(r0, C0201.m82(397).concat(String.valueOf(str)));
            this.a.b(str);
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(398) + e.toString());
        }
    }

    public boolean setIndoorEnabled(boolean z) {
        try {
            this.a.c(z);
            return false;
        } catch (RemoteException e) {
            mco.d(C0201.m82(C0188.f25), C0201.m82(399) + e.toString());
            return false;
        }
    }

    public void setInfoWindowAdapter(final InfoWindowAdapter infoWindowAdapter) {
        try {
            this.a.a(new mai.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass7 */

                @Override // com.huawei.hms.maps.mai
                public IObjectWrapper getInfoContents(mce mce) {
                    InfoWindowAdapter infoWindowAdapter = infoWindowAdapter;
                    if (infoWindowAdapter == null) {
                        return null;
                    }
                    return ObjectWrapper.wrap(infoWindowAdapter.getInfoContents(new Marker(mce)));
                }

                @Override // com.huawei.hms.maps.mai
                public IObjectWrapper getInfoWindow(mce mce) {
                    InfoWindowAdapter infoWindowAdapter = infoWindowAdapter;
                    if (infoWindowAdapter == null) {
                        return null;
                    }
                    return ObjectWrapper.wrap(infoWindowAdapter.getInfoWindow(new Marker(mce)));
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(402), C0201.m82(401) + e.toString());
        }
    }

    public void setLanguage(String str) {
        String r0 = C0201.m82(403);
        try {
            mco.b(r0, C0201.m82(404).concat(String.valueOf(str)));
            this.a.c(str);
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(405) + e.toString());
        }
    }

    public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        try {
            this.a.a(latLngBounds);
        } catch (RemoteException e) {
            mco.d(C0201.m82(407), C0201.m82(406) + e.toString());
        }
    }

    public void setLocationSource(LocationSource locationSource) {
        if (locationSource == null) {
            try {
                this.a.a((maj) null);
            } catch (RemoteException e) {
                mco.d(C0201.m82(409), C0201.m82(408) + e.toString());
            }
        } else {
            this.a.a(new mbt(locationSource));
        }
    }

    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) {
        try {
            return this.a.a(mapStyleOptions);
        } catch (RemoteException e) {
            mco.d(C0201.m82(411), C0201.m82(410) + e.toString());
            return false;
        }
    }

    public void setMapType(int i) {
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            mco.a(C0201.m82(413), C0201.m82(412) + e.toString());
        }
    }

    public void setMarkersClustering(boolean z) {
        try {
            this.a.f(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(415), C0201.m82(414) + e.toString());
        }
    }

    public void setMaxZoomPreference(float f) {
        try {
            this.a.a(f);
        } catch (RemoteException e) {
            mco.a(C0201.m82(417), C0201.m82(416) + e.toString());
        }
    }

    public void setMinZoomPreference(float f) {
        try {
            this.a.b(f);
        } catch (RemoteException e) {
            mco.a(C0201.m82(419), C0201.m82(418) + e.toString());
        }
    }

    public void setMyLocationEnabled(boolean z) {
        try {
            this.a.b(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(421), C0201.m82(420) + e.toString());
        }
    }

    public void setOnCameraIdleListener(final OnCameraIdleListener onCameraIdleListener) {
        String r0 = C0201.m82(422);
        mco.a(r0, C0201.m82(423));
        try {
            this.a.a(onCameraIdleListener == null ? null : new man.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass2 */

                @Override // com.huawei.hms.maps.man
                public void onCameraIdle() {
                    mco.b(C0201.m82(36440), C0201.m82(36441));
                    onCameraIdleListener.onCameraIdle();
                }
            });
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(424) + e.toString());
        }
    }

    public void setOnCameraMoveCanceledListener(final OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        String r0 = C0201.m82(425);
        mco.a(r0, C0201.m82(426));
        try {
            this.a.a(onCameraMoveCanceledListener == null ? null : new mao.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass4 */

                @Override // com.huawei.hms.maps.mao
                public void onCameraMoveCanceled() {
                    mco.a(C0201.m82(36523), C0201.m82(36524));
                    onCameraMoveCanceledListener.onCameraMoveCanceled();
                }
            });
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(427) + e.toString());
        }
    }

    public void setOnCameraMoveListener(final OnCameraMoveListener onCameraMoveListener) {
        String r0 = C0201.m82(428);
        mco.a(r0, C0201.m82(429));
        try {
            this.a.a(onCameraMoveListener == null ? null : new map.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass3 */

                @Override // com.huawei.hms.maps.map
                public void onCameraMove() {
                    mco.b(C0201.m82(36536), C0201.m82(36537));
                    onCameraMoveListener.onCameraMove();
                }
            });
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(430) + e.toString());
        }
    }

    public void setOnCameraMoveStartedListener(final OnCameraMoveStartedListener onCameraMoveStartedListener) {
        String r0 = C0201.m82(431);
        mco.a(r0, C0201.m82(432));
        try {
            this.a.a(onCameraMoveStartedListener == null ? null : new maq.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass1 */

                @Override // com.huawei.hms.maps.maq
                public void onCameraMoveStarted(int i) {
                    mco.b(C0201.m82(36373), C0201.m82(36372).concat(String.valueOf(i)));
                    onCameraMoveStartedListener.onCameraMoveStarted(i);
                }
            });
        } catch (RemoteException e) {
            mco.a(r0, C0201.m82(433) + e.toString());
        }
    }

    public void setOnCircleClickListener(final OnCircleClickListener onCircleClickListener) {
        String r0 = C0201.m82(434);
        mco.a(r0, C0201.m82(435));
        try {
            this.a.a(onCircleClickListener == null ? null : new mar.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass11 */

                @Override // com.huawei.hms.maps.mar
                public void onCircleClick(mca mca) {
                    mco.b(C0201.m82(35219), C0201.m82(35220));
                    Circle circle = new Circle(mca);
                    OnCircleClickListener onCircleClickListener = onCircleClickListener;
                    if (onCircleClickListener != null) {
                        onCircleClickListener.onCircleClick(circle);
                    }
                }
            });
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(436) + e.toString());
        }
    }

    public void setOnGroundOverlayClickListener(final OnGroundOverlayClickListener onGroundOverlayClickListener) {
        try {
            this.a.a(onGroundOverlayClickListener == null ? null : new mas.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass22 */

                @Override // com.huawei.hms.maps.mas
                public void onGroundOverlayClick(mcb mcb) {
                    onGroundOverlayClickListener.onGroundOverlayClick(new GroundOverlay(mcb));
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(438), C0201.m82(437) + e.toString());
        }
    }

    public void setOnIndoorStateChangeListener(final OnIndoorStateChangeListener onIndoorStateChangeListener) {
        try {
            this.a.a(onIndoorStateChangeListener == null ? null : new mat.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass23 */

                @Override // com.huawei.hms.maps.mat
                public void onIndoorBuildingFocused() {
                    onIndoorStateChangeListener.onIndoorBuildingFocused();
                }

                @Override // com.huawei.hms.maps.mat
                public void onIndoorLevelActivated(mcc mcc) {
                    onIndoorStateChangeListener.onIndoorLevelActivated(new IndoorBuilding(mcc));
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(440), C0201.m82(439) + e.toString());
        }
    }

    public void setOnInfoWindowClickListener(final OnInfoWindowClickListener onInfoWindowClickListener) {
        try {
            this.a.a(onInfoWindowClickListener == null ? null : new mau.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass21 */

                @Override // com.huawei.hms.maps.mau
                public void onInfoWindowClick(mce mce) {
                    mco.b(C0201.m82(33068), C0201.m82(33069));
                    onInfoWindowClickListener.onInfoWindowClick(new Marker(mce));
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(442), C0201.m82(441) + e.toString());
        }
    }

    public void setOnInfoWindowCloseListener(final OnInfoWindowCloseListener onInfoWindowCloseListener) {
        try {
            this.a.a(onInfoWindowCloseListener == null ? null : new mav.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass24 */

                @Override // com.huawei.hms.maps.mav
                public void onInfoWindowClose(mce mce) {
                    onInfoWindowCloseListener.onInfoWindowClose(new Marker(mce));
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(444), C0201.m82(443) + e.toString());
        }
    }

    public void setOnInfoWindowLongClickListener(final OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        try {
            this.a.a(onInfoWindowLongClickListener == null ? null : new maw.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass25 */

                @Override // com.huawei.hms.maps.maw
                public void onInfoWindowLongClick(mce mce) {
                    onInfoWindowLongClickListener.onInfoWindowLongClick(new Marker(mce));
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(446), C0201.m82(445) + e.toString());
        }
    }

    public void setOnMapClickListener(final OnMapClickListener onMapClickListener) {
        String r0 = C0201.m82(447);
        mco.a(r0, C0201.m82(448));
        try {
            this.a.a(onMapClickListener == null ? null : new may.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass14 */

                @Override // com.huawei.hms.maps.may
                public void onMapClick(LatLng latLng) {
                    onMapClickListener.onMapClick(latLng);
                }
            });
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(449) + e.toString());
        }
    }

    public void setOnMapLoadedCallback(final OnMapLoadedCallback onMapLoadedCallback) {
        try {
            this.a.a(new maz.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass8 */

                @Override // com.huawei.hms.maps.maz
                public void onMapLoaded() {
                    OnMapLoadedCallback onMapLoadedCallback = onMapLoadedCallback;
                    if (onMapLoadedCallback != null) {
                        onMapLoadedCallback.onMapLoaded();
                    }
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(451), C0201.m82(450) + e.getMessage());
        }
    }

    public void setOnMapLongClickListener(final OnMapLongClickListener onMapLongClickListener) {
        String r0 = C0201.m82(452);
        mco.a(r0, C0201.m82(453));
        try {
            this.a.a(onMapLongClickListener == null ? null : new mba.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass15 */

                @Override // com.huawei.hms.maps.mba
                public void onMapLongClick(LatLng latLng) {
                    mco.a(C0201.m82(35449), C0201.m82(35450));
                    onMapLongClickListener.onMapLongClick(latLng);
                }
            });
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(454) + e.toString());
        }
    }

    public void setOnMarkerClickListener(final OnMarkerClickListener onMarkerClickListener) {
        try {
            this.a.a(onMarkerClickListener == null ? null : new mbc.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass9 */

                @Override // com.huawei.hms.maps.mbc
                public boolean onMarkerClick(mce mce) {
                    Marker marker = new Marker(mce);
                    OnMarkerClickListener onMarkerClickListener = onMarkerClickListener;
                    if (onMarkerClickListener != null) {
                        return onMarkerClickListener.onMarkerClick(marker);
                    }
                    return false;
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(456), C0201.m82(455) + e.toString());
        }
    }

    public void setOnMarkerDragListener(final OnMarkerDragListener onMarkerDragListener) {
        String r0 = C0201.m82(457);
        mco.a(r0, C0201.m82(458));
        try {
            this.a.a(onMarkerDragListener == null ? null : new mbd.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass10 */

                @Override // com.huawei.hms.maps.mbd
                public void onMarkerDrag(mce mce) {
                    mco.b(C0201.m82(35274), C0201.m82(35275));
                    onMarkerDragListener.onMarkerDrag(new Marker(mce));
                }

                @Override // com.huawei.hms.maps.mbd
                public void onMarkerDragEnd(mce mce) {
                    mco.b(C0201.m82(35276), C0201.m82(35277));
                    onMarkerDragListener.onMarkerDragEnd(new Marker(mce));
                }

                @Override // com.huawei.hms.maps.mbd
                public void onMarkerDragStart(mce mce) {
                    mco.b(C0201.m82(35278), C0201.m82(35279));
                    onMarkerDragListener.onMarkerDragStart(new Marker(mce));
                }
            });
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(459) + e.toString());
        }
    }

    public void setOnMyLocationButtonClickListener(final OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        String r0 = C0201.m82(460);
        mco.a(r0, C0201.m82(461));
        try {
            this.a.a(onMyLocationButtonClickListener == null ? null : new mbe.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass16 */

                @Override // com.huawei.hms.maps.mbe
                public boolean onMyLocationButtonClick() {
                    return onMyLocationButtonClickListener.onMyLocationButtonClick();
                }
            });
        } catch (RemoteException unused) {
            mco.d(r0, C0201.m82(462));
        }
    }

    public void setOnMyLocationClickListener(final OnMyLocationClickListener onMyLocationClickListener) {
        try {
            this.a.a(onMyLocationClickListener == null ? null : new mbf.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass19 */

                @Override // com.huawei.hms.maps.mbf
                public void onMyLocationClick(Location location) {
                    onMyLocationClickListener.onMyLocationClick(location);
                }
            });
        } catch (RemoteException unused) {
            mco.d(C0201.m82(463), C0201.m82(464));
        }
    }

    public void setOnPoiClickListener(final OnPoiClickListener onPoiClickListener) {
        try {
            this.a.a(onPoiClickListener == null ? null : new mbg.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass20 */

                @Override // com.huawei.hms.maps.mbg
                public void onPoiClick(PointOfInterest pointOfInterest) {
                    onPoiClickListener.onPoiClick(pointOfInterest);
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(466), C0201.m82(465).concat(String.valueOf(e)));
        }
    }

    public void setOnPolygonClickListener(final OnPolygonClickListener onPolygonClickListener) {
        String r0 = C0201.m82(467);
        mco.a(r0, C0201.m82(468));
        try {
            this.a.a(onPolygonClickListener == null ? null : new mbh.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass13 */

                @Override // com.huawei.hms.maps.mbh
                public void onPolygonClick(mcf mcf) {
                    mco.b(C0201.m82(35430), C0201.m82(35431));
                    Polygon polygon = new Polygon(mcf);
                    OnPolygonClickListener onPolygonClickListener = onPolygonClickListener;
                    if (onPolygonClickListener != null) {
                        onPolygonClickListener.onPolygonClick(polygon);
                    }
                }
            });
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(469) + e.toString());
        }
    }

    public void setOnPolylineClickListener(final OnPolylineClickListener onPolylineClickListener) {
        String r0 = C0201.m82(470);
        mco.a(r0, C0201.m82(471));
        try {
            this.a.a(onPolylineClickListener == null ? null : new mbi.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass12 */

                @Override // com.huawei.hms.maps.mbi
                public void onPolylineClick(mcg mcg) {
                    mco.b(C0201.m82(35233), C0201.m82(35234));
                    Polyline polyline = new Polyline(mcg);
                    OnPolylineClickListener onPolylineClickListener = onPolylineClickListener;
                    if (onPolylineClickListener != null) {
                        onPolylineClickListener.onPolylineClick(polyline);
                    }
                }
            });
        } catch (RemoteException e) {
            mco.d(r0, C0201.m82(472) + e.toString());
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.a.a(i, i2, i3, i4);
        } catch (RemoteException e) {
            mco.a(C0201.m82(474), C0201.m82(473) + e.toString());
        }
    }

    public void setTrafficEnabled(boolean z) {
        try {
            this.a.d(z);
        } catch (RemoteException e) {
            mco.a(C0201.m82(476), C0201.m82(475) + e.toString());
        }
    }

    public void setWatermarkEnabled(boolean z) {
        try {
            this.a.e(z);
        } catch (RemoteException e) {
            mco.d(C0201.m82(478), C0201.m82(477) + e.toString());
        }
    }

    public void snapshot(final SnapshotReadyCallback snapshotReadyCallback) {
        try {
            this.a.a(new mbo.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass18 */

                @Override // com.huawei.hms.maps.mbo
                public void onSnapshotReady(Bitmap bitmap) {
                    SnapshotReadyCallback snapshotReadyCallback = snapshotReadyCallback;
                    if (snapshotReadyCallback != null) {
                        snapshotReadyCallback.onSnapshotReady(bitmap);
                    }
                }

                @Override // com.huawei.hms.maps.mbo
                public void onSnapshotReadyWrapper(IObjectWrapper iObjectWrapper) {
                }
            });
        } catch (RemoteException e) {
            mco.d(C0201.m82(480), C0201.m82(479).concat(String.valueOf(e)));
        }
    }

    public void snapshot(final SnapshotReadyCallback snapshotReadyCallback, Bitmap bitmap) {
        try {
            this.a.a(new mbo.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass17 */

                @Override // com.huawei.hms.maps.mbo
                public void onSnapshotReady(Bitmap bitmap) {
                    SnapshotReadyCallback snapshotReadyCallback = snapshotReadyCallback;
                    if (snapshotReadyCallback != null) {
                        snapshotReadyCallback.onSnapshotReady(bitmap);
                    }
                }

                @Override // com.huawei.hms.maps.mbo
                public void onSnapshotReadyWrapper(IObjectWrapper iObjectWrapper) {
                }
            }, ObjectWrapper.wrap(bitmap));
        } catch (RemoteException e) {
            mco.d(C0201.m82(482), C0201.m82(481).concat(String.valueOf(e)));
        }
    }

    public void stopAnimation() {
        try {
            this.a.o();
        } catch (RemoteException e) {
            mco.d(C0201.m82(484), C0201.m82(483).concat(String.valueOf(e)));
        }
    }

    public boolean useViewLifecycleWhenInFragment() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            mco.d(C0201.m82(486), C0201.m82(485) + e.toString());
            return true;
        }
    }
}
