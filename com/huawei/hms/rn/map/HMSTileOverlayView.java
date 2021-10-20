package com.huawei.hms.rn.map;

import android.content.Context;
import android.util.ArrayMap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.k0;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.model.TileOverlay;
import com.huawei.hms.maps.model.TileOverlayOptions;
import com.huawei.hms.rn.map.HMSMapView;
import com.huawei.hms.rn.map.logger.HMSLogger;
import com.huawei.hms.rn.map.utils.ReactUtils;
import java.util.Map;
import vigqyno.C0201;

public class HMSTileOverlayView extends HMSMapView.MapLayerView {
    private static final String REACT_CLASS = HMSTileOverlayView.class.getSimpleName();
    private static final String TAG = HMSTileOverlayView.class.getSimpleName();
    private TileOverlay mTileOverlay;
    private TileOverlayOptions mTileOverlayOptions = new TileOverlayOptions();

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.rn.map.HMSTileOverlayView$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$huawei$hms$rn$map$HMSTileOverlayView$Manager$Command;

        static {
            int[] iArr = new int[Manager.Command.values().length];
            $SwitchMap$com$huawei$hms$rn$map$HMSTileOverlayView$Manager$Command = iArr;
            try {
                iArr[Manager.Command.CLEAR_TILE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class Manager extends HMSMapView.MapLayerViewManager<HMSTileOverlayView> {
        private HMSLogger logger;

        public enum Command implements ReactUtils.NamedCommand {
            CLEAR_TILE_CACHE("clearTileCache");
            
            private String tileOverlayCommandName;

            private Command(String str) {
                this.tileOverlayCommandName = str;
            }

            @Override // com.huawei.hms.rn.map.utils.ReactUtils.NamedCommand
            public String getName() {
                return this.tileOverlayCommandName;
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
            return new ArrayMap();
        }

        @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
        public String getName() {
            return C0201.m82(29446);
        }

        @xj0(name = "fadeIn")
        public void setFadeIn(HMSTileOverlayView hMSTileOverlayView, boolean z) {
            hMSTileOverlayView.setFadeIn(z);
        }

        @xj0(name = "tileProvider")
        public void setTileOverlay(HMSTileOverlayView hMSTileOverlayView, Dynamic dynamic) {
            if (dynamic.getType() == ReadableType.Map) {
                hMSTileOverlayView.setTileProvider((HMSTileOverlayView) dynamic.asMap());
            } else if (dynamic.getType() == ReadableType.Array) {
                hMSTileOverlayView.setTileProvider((HMSTileOverlayView) dynamic.asArray());
            }
        }

        @xj0(name = "transparency")
        public void setTransparency(HMSTileOverlayView hMSTileOverlayView, float f) {
            hMSTileOverlayView.setTransparency(f);
        }

        @xj0(defaultBoolean = true, name = "visible")
        public void setVisible(HMSTileOverlayView hMSTileOverlayView, boolean z) {
            hMSTileOverlayView.setVisible(z);
        }

        @Override // com.facebook.react.uimanager.ViewManager
        public HMSTileOverlayView createViewInstance(k0 k0Var) {
            HMSLogger hMSLogger = this.logger;
            String r1 = C0201.m82(29445);
            hMSLogger.startMethodExecutionTimer(r1);
            HMSTileOverlayView hMSTileOverlayView = new HMSTileOverlayView(k0Var);
            this.logger.sendSingleEvent(r1);
            return hMSTileOverlayView;
        }

        public void receiveCommand(HMSTileOverlayView hMSTileOverlayView, int i, ReadableArray readableArray) {
            if (i < Command.values().length && AnonymousClass1.$SwitchMap$com$huawei$hms$rn$map$HMSTileOverlayView$Manager$Command[Command.values()[i].ordinal()] == 1) {
                HMSLogger hMSLogger = this.logger;
                String r4 = C0201.m82(29447);
                hMSLogger.startMethodExecutionTimer(r4);
                hMSTileOverlayView.clearTileCache();
                this.logger.sendSingleEvent(r4);
            }
        }

        @xj0(defaultFloat = 1.0f, name = "zIndex")
        public void setZIndex(HMSTileOverlayView hMSTileOverlayView, float f) {
            hMSTileOverlayView.setZIndex(f);
        }
    }

    public HMSTileOverlayView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearTileCache() {
        TileOverlay tileOverlay = this.mTileOverlay;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setFadeIn(boolean z) {
        this.mTileOverlayOptions.fadeIn(z);
        TileOverlay tileOverlay = this.mTileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setFadeIn(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTileProvider(ReadableMap readableMap) {
        this.mTileOverlayOptions.tileProvider(ReactUtils.getTileProviderFromReadableMap(readableMap));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTransparency(float f) {
        this.mTileOverlayOptions.transparency(f);
        TileOverlay tileOverlay = this.mTileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setTransparency(f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setVisible(boolean z) {
        this.mTileOverlayOptions.visible(z);
        TileOverlay tileOverlay = this.mTileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setZIndex(float f) {
        this.mTileOverlayOptions.zIndex(f);
        TileOverlay tileOverlay = this.mTileOverlay;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f);
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getInfo() {
        TileOverlay tileOverlay = this.mTileOverlay;
        if (tileOverlay == null) {
            return null;
        }
        try {
            return ReactUtils.getWritableMapFromTileOverlay(tileOverlay);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public WritableMap getOptionsInfo() {
        TileOverlayOptions tileOverlayOptions = this.mTileOverlayOptions;
        if (tileOverlayOptions == null) {
            return null;
        }
        return ReactUtils.getWritableMapFromTileOverlayOptions(tileOverlayOptions);
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public void removeFrom(HuaweiMap huaweiMap) {
        TileOverlay tileOverlay = this.mTileOverlay;
        if (tileOverlay != null) {
            tileOverlay.remove();
            this.mTileOverlay = null;
            this.mTileOverlayOptions = null;
        }
    }

    @Override // com.huawei.hms.rn.map.HMSMapView.MapLayer
    public TileOverlay addTo(HuaweiMap huaweiMap) {
        TileOverlay addTileOverlay = huaweiMap.addTileOverlay(this.mTileOverlayOptions);
        this.mTileOverlay = addTileOverlay;
        return addTileOverlay;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTileProvider(ReadableArray readableArray) {
        this.mTileOverlayOptions.tileProvider(ReactUtils.getTileProviderFromReadableArray(readableArray, getContext()));
    }
}
