package com.huawei.hms.rn.map;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.model.BitmapDescriptor;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.animation.Animation;
import com.huawei.hms.maps.model.animation.AnimationSet;
import com.huawei.hms.rn.map.HMSInfoWindowView;
import com.huawei.hms.rn.map.HMSMapView;
import com.huawei.hms.rn.map.logger.HMSLogger;
import com.huawei.hms.rn.map.utils.ReactUtils;
import java.util.Map;
import vigqyno.C0201;

public class HMSMarkerView extends HMSMapView.MapLayerView {
    private static final String REACT_CLASS = HMSMarkerView.class.getSimpleName();
    private static final String TAG = HMSMarkerView.class.getSimpleName();
    private LinearLayout almostWrappedInfoWindowView;
    private AnimationSet animationSet;
    public boolean defaultActionOnClick = true;
    public HMSLogger logger;
    private HMSInfoWindowView mInfoWindowView;
    private Marker mMarker;
    private MarkerOptions mMarkerOptions = new MarkerOptions();
    private LinearLayout wrappedInfoWindowView;

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.rn.map.HMSMarkerView$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$huawei$hms$rn$map$HMSMarkerView$Manager$Command;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[Manager.Command.values().length];
            $SwitchMap$com$huawei$hms$rn$map$HMSMarkerView$Manager$Command = iArr;
            iArr[Manager.Command.SHOW_INFO_WINDOW.ordinal()] = 1;
            $SwitchMap$com$huawei$hms$rn$map$HMSMarkerView$Manager$Command[Manager.Command.HIDE_INFO_WINDOW.ordinal()] = 2;
            $SwitchMap$com$huawei$hms$rn$map$HMSMarkerView$Manager$Command[Manager.Command.START_ANIMATION.ordinal()] = 3;
            $SwitchMap$com$huawei$hms$rn$map$HMSMarkerView$Manager$Command[Manager.Command.SET_ANIMATION.ordinal()] = 4;
            $SwitchMap$com$huawei$hms$rn$map$HMSMarkerView$Manager$Command[Manager.Command.CLEAN_ANIMATION.ordinal()] = 5;
        }
    }

    public static class Manager extends HMSMapView.MapLayerViewManager<HMSMarkerView> {
        private HMSLogger logger;

        public enum Command implements ReactUtils.NamedCommand {
            SHOW_INFO_WINDOW("showInfoWindow"),
            HIDE_INFO_WINDOW("hideInfoWindow"),
            START_ANIMATION("startAnimation"),
            SET_ANIMATION("setAnimation"),
            CLEAN_ANIMATION("cleanAnimation");
            
            private String markerCommandName;

            private Command(String str) {
                this.markerCommandName = str;
            }

            @Override // com.huawei.hms.rn.map.utils.ReactUtils.NamedCommand
            public String getName() {
                return this.markerCommandName;
            }
        }

        public enum Event implements ReactUtils.NamedEvent {
            CLICK("onClick"),
            DRAG_START("onDragStart"),
            DRAG("onDrag"),
            DRAG_END("onDragEnd"),
            INFO_WINDOW_CLICK("onInfoWindowClick"),
            INFO_WINDOW_CLOSE("onInfoWindowClose"),
            INFO_WINDOW_LONG_CLICK("onInfoWindowLongClick"),
            ANIMATION_START("onAnimationStart"),
            ANIMATION_END("onAnimationEnd");
            
            private String markerEventName;

            private Event(String str) {
                this.markerEventName = str;
            }

            @Override // com.huawei.hms.rn.map.utils.ReactUtils.NamedEvent
            public String getName() {
                return this.markerEventName;
            }
        }

        public Manager(Context context) {
            this.logger = HMSLogger.getInstance(context);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public Map<String, Integer> getCommandsMap() {
            return ReactUtils.getCommandsMap(Command.values());
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.huawei.hms.rn.map.HMSMapView.MapLayerViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            return ReactUtils.getExportedCustomDirectEventTypeConstantsFromEvents(Event.values());
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(10256);
        }

        @xj0(defaultFloat = 1.0f, name = "alpha")
        public void setAlpha(HMSMarkerView hMSMarkerView, float f) {
            hMSMarkerView.setAlpha(f);
        }

        @xj0(name = "clusterable")
        public void setClusterable(HMSMarkerView hMSMarkerView, boolean z) {
            hMSMarkerView.setClusterable(z);
        }

        @xj0(defaultBoolean = true, name = "defaultActionOnClick")
        public void setDefaultActionOnClick(HMSMarkerView hMSMarkerView, boolean z) {
            hMSMarkerView.setDefaultActionOnClick(z);
        }

        @xj0(name = "draggable")
        public void setDraggable(HMSMarkerView hMSMarkerView, boolean z) {
            hMSMarkerView.setDraggable(z);
        }

        @xj0(name = "flat")
        public void setFlat(HMSMarkerView hMSMarkerView, boolean z) {
            hMSMarkerView.setFlat(z);
        }

        @xj0(name = "icon")
        public void setIcon(HMSMarkerView hMSMarkerView, ReadableMap readableMap) {
            hMSMarkerView.setIcon(readableMap);
        }

        @xj0(name = "infoWindowAnchor")
        public void setInfoWindowAnchor(HMSMarkerView hMSMarkerView, ReadableArray readableArray) {
            hMSMarkerView.setInfoWindowAnchor(readableArray);
        }

        @xj0(name = "markerAnchor")
        public void setMarkerAnchor(HMSMarkerView hMSMarkerView, ReadableArray readableArray) {
            hMSMarkerView.setMarkerAnchor(readableArray);
        }

        @xj0(name = "coordinate")
        public void setPosition(HMSMarkerView hMSMarkerView, ReadableMap readableMap) {
            hMSMarkerView.setPosition(readableMap);
        }

        @xj0(name = "snippet")
        public void setSnippet(HMSMarkerView hMSMarkerView, String str) {
            hMSMarkerView.setSnippet(str);
        }

        @xj0(name = "title")
        public void setTitle(HMSMarkerView hMSMarkerView, String str) {
            hMSMarkerView.setTitle(str);
        }

        @xj0(defaultBoolean = true, name = "visible")
        public void setVisible(HMSMarkerView hMSMarkerView, boolean z) {
            hMSMarkerView.setVisible(z);
        }

        public void addView(HMSMarkerView hMSMarkerView, View view, int i) {
            if (view instanceof HMSInfoWindowView) {
                hMSMarkerView.setInfoWindowView((HMSInfoWindowView) view);
            }
        }

        @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public i createShadowNodeInstance() {
            return new HMSInfoWindowView.SizeLayoutShadowNode();
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSMarkerView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(10255);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSMarkerView hMSMarkerView = new HMSMarkerView(k0Var);
            this.logger.sendSingleEvent(r1);
            return hMSMarkerView;
        }

        public void receiveCommand(HMSMarkerView hMSMarkerView, int i, ReadableArray readableArray) {
            if (i < Command.values().length) {
                int i2 = AnonymousClass2.$SwitchMap$com$huawei$hms$rn$map$HMSMarkerView$Manager$Command[Command.values()[i].ordinal()];
                if (i2 == 1) {
                    HMSLogger hMSLogger = this.logger;
                    String r5 = C0201.m82(10261);
                    hMSLogger.startMethodExecutionTimer(r5);
                    hMSMarkerView.showInfoWindow();
                    this.logger.sendSingleEvent(r5);
                } else if (i2 == 2) {
                    HMSLogger hMSLogger2 = this.logger;
                    String r52 = C0201.m82(10260);
                    hMSLogger2.startMethodExecutionTimer(r52);
                    hMSMarkerView.hideInfoWindow();
                    this.logger.sendSingleEvent(r52);
                } else if (i2 == 3) {
                    HMSLogger hMSLogger3 = this.logger;
                    String r53 = C0201.m82(10259);
                    hMSLogger3.startMethodExecutionTimer(r53);
                    hMSMarkerView.startAnimation();
                    this.logger.sendSingleEvent(r53);
                } else if (i2 == 4) {
                    HMSLogger hMSLogger4 = this.logger;
                    String r0 = C0201.m82(10258);
                    hMSLogger4.startMethodExecutionTimer(r0);
                    hMSMarkerView.setAnimation(readableArray);
                    this.logger.sendSingleEvent(r0);
                } else if (i2 == 5) {
                    HMSLogger hMSLogger5 = this.logger;
                    String r54 = C0201.m82(10257);
                    hMSLogger5.startMethodExecutionTimer(r54);
                    hMSMarkerView.cleanAnimation();
                    this.logger.sendSingleEvent(r54);
                }
            }
        }

        @xj0(name = "rotation")
        public void setRotation(HMSMarkerView hMSMarkerView, float f) {
            hMSMarkerView.setRotation(f);
        }

        @xj0(name = "zIndex")
        public void setZIndex(HMSMarkerView hMSMarkerView, float f) {
            hMSMarkerView.setZIndex(f);
        }

        public void updateExtraData(HMSMarkerView hMSMarkerView, Object obj) {
            if (hMSMarkerView.getInfoWindowView() != null) {
                hMSMarkerView.wrapInfoWindowView();
            }
        }
    }

    public HMSMarkerView(Context context) {
        super(context);
        this.logger = HMSLogger.getInstance(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void cleanAnimation() {
        this.animationSet.cleanAnimation();
        this.mMarker.setAnimation(this.animationSet);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void hideInfoWindow() {
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.hideInfoWindow();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setAnimation(ReadableArray readableArray) {
        if (readableArray != null) {
            this.animationSet = new AnimationSet(false);
            ReadableMap map = readableArray.getMap(0);
            ReadableMap map2 = readableArray.getMap(1);
            if (map != null) {
                ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    final String nextKey = keySetIterator.nextKey();
                    final Animation animationFromCommandArgs = ReactUtils.getAnimationFromCommandArgs(map.getMap(nextKey), map2, nextKey);
                    if (animationFromCommandArgs != null) {
                        animationFromCommandArgs.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.huawei.hms.rn.map.HMSMarkerView.AnonymousClass1 */

                            @Override // com.huawei.hms.maps.model.animation.Animation.AnimationListener
                            public void onAnimationEnd() {
                                WritableMap writableMapFromAnimation = ReactUtils.getWritableMapFromAnimation(animationFromCommandArgs);
                                writableMapFromAnimation.putString(C0201.m82(9689), nextKey);
                                HMSMarkerView.this.logger.sendSingleEvent(C0201.m82(9690));
                                HMSMarkerView.this.sendEvent(Manager.Event.ANIMATION_END, writableMapFromAnimation);
                            }

                            @Override // com.huawei.hms.maps.model.animation.Animation.AnimationListener
                            public void onAnimationStart() {
                                WritableMap writableMapFromAnimation = ReactUtils.getWritableMapFromAnimation(animationFromCommandArgs);
                                writableMapFromAnimation.putString(C0201.m82(9691), nextKey);
                                HMSMarkerView.this.logger.sendSingleEvent(C0201.m82(9692));
                                HMSMarkerView.this.sendEvent(Manager.Event.ANIMATION_START, writableMapFromAnimation);
                            }
                        });
                        this.animationSet.addAnimation(animationFromCommandArgs);
                    }
                }
                Marker marker = this.mMarker;
                if (marker != null) {
                    marker.setAnimation(this.animationSet);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setClusterable(boolean z) {
        this.mMarkerOptions.clusterable(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDefaultActionOnClick(boolean z) {
        this.defaultActionOnClick = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDraggable(boolean z) {
        this.mMarkerOptions.draggable(z);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setDraggable(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setFlat(boolean z) {
        this.mMarkerOptions.flat(z);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setFlat(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setIcon(ReadableMap readableMap) {
        BitmapDescriptor bitmapDescriptorFromReadableMap = ReactUtils.getBitmapDescriptorFromReadableMap(readableMap);
        this.mMarkerOptions.icon(bitmapDescriptorFromReadableMap);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setIcon(bitmapDescriptorFromReadableMap);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setInfoWindowAnchor(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Number) && ReactUtils.hasValidElement(readableArray, 1, ReadableType.Number)) {
            float f = (float) readableArray.getDouble(0);
            float f2 = (float) readableArray.getDouble(1);
            this.mMarkerOptions.infoWindowAnchor(f, f2);
            Marker marker = this.mMarker;
            if (marker != null) {
                marker.setInfoWindowAnchor(f, f2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setMarkerAnchor(ReadableArray readableArray) {
        if (ReactUtils.hasValidElement(readableArray, 0, ReadableType.Number) && ReactUtils.hasValidElement(readableArray, 1, ReadableType.Number)) {
            float f = (float) readableArray.getDouble(0);
            float f2 = (float) readableArray.getDouble(1);
            this.mMarkerOptions.anchorMarker(f, f2);
            Marker marker = this.mMarker;
            if (marker != null) {
                marker.setMarkerAnchor(f, f2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPosition(ReadableMap readableMap) {
        LatLng latLngFromReadableMap = ReactUtils.getLatLngFromReadableMap(readableMap);
        if (latLngFromReadableMap != null) {
            this.mMarkerOptions.position(latLngFromReadableMap);
            Marker marker = this.mMarker;
            if (marker != null) {
                marker.setPosition(latLngFromReadableMap);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSnippet(String str) {
        this.mMarkerOptions.snippet(str);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setSnippet(str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTitle(String str) {
        this.mMarkerOptions.title(str);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setTitle(str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setVisible(boolean z) {
        this.mMarkerOptions.visible(z);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZIndex(float f) {
        this.mMarkerOptions.zIndex(f);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setZIndex(f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void showInfoWindow() {
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.showInfoWindow();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startAnimation() {
        this.mMarker.startAnimation();
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getInfo() {
        Marker marker = this.mMarker;
        if (marker == null) {
            return null;
        }
        try {
            return ReactUtils.getWritableMapFromMarker(marker);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public HMSInfoWindowView getInfoWindowView() {
        return this.mInfoWindowView;
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getOptionsInfo() {
        MarkerOptions markerOptions = this.mMarkerOptions;
        if (markerOptions == null) {
            return null;
        }
        return ReactUtils.getWritableMapFromMarkerOptions(markerOptions);
    }

    public LinearLayout getWrappedInfoWindowView() {
        return this.wrappedInfoWindowView;
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public void removeFrom(HuaweiMap huaweiMap) {
        Marker marker = this.mMarker;
        if (marker != null) {
            try {
                marker.getPosition();
                this.mMarker.remove();
            } catch (NullPointerException unused) {
                this.mMarker = null;
                this.mMarkerOptions = null;
            }
        }
    }

    public void setAlpha(float f) {
        this.mMarkerOptions.alpha(f);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setAlpha(f);
        }
    }

    public void setInfoWindowView(HMSInfoWindowView hMSInfoWindowView) {
        this.mInfoWindowView = hMSInfoWindowView;
    }

    public void setRotation(float f) {
        this.mMarkerOptions.rotation(f);
        Marker marker = this.mMarker;
        if (marker != null) {
            marker.setRotation(f);
        }
    }

    public void wrapInfoWindowView() {
        HMSInfoWindowView infoWindowView = getInfoWindowView();
        if (infoWindowView != null) {
            LinearLayout linearLayout = this.wrappedInfoWindowView;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                this.almostWrappedInfoWindowView.removeAllViews();
            } else {
                this.wrappedInfoWindowView = new LinearLayout(infoWindowView.getContext());
                this.almostWrappedInfoWindowView = new LinearLayout(infoWindowView.getContext());
                this.wrappedInfoWindowView.setOrientation(1);
                this.wrappedInfoWindowView.setLayoutParams(new LinearLayout.LayoutParams(infoWindowView.width, infoWindowView.height, 0.0f));
                this.almostWrappedInfoWindowView.setOrientation(0);
                this.almostWrappedInfoWindowView.setLayoutParams(new LinearLayout.LayoutParams(infoWindowView.width, infoWindowView.height, 0.0f));
            }
            this.wrappedInfoWindowView.addView(this.almostWrappedInfoWindowView);
            this.almostWrappedInfoWindowView.addView(infoWindowView);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public Marker addTo(HuaweiMap huaweiMap) {
        Marker addMarker = huaweiMap.addMarker(this.mMarkerOptions);
        this.mMarker = addMarker;
        return addMarker;
    }
}
