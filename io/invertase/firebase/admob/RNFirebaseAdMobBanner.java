package io.invertase.firebase.admob;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.view.f;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import java.util.Map;
import vigqyno.C0201;

public class RNFirebaseAdMobBanner extends SimpleViewManager<f> {
    private static final String BANNER_EVENT = null;
    private static final String REACT_CLASS = null;
    private k0 context;
    private RCTEventEmitter emitter;
    private AdRequest.Builder request;
    private Boolean requested = Boolean.FALSE;
    private AdSize size;
    private String unitId;
    private f viewGroup;

    /* access modifiers changed from: package-private */
    public class a extends AdListener {
        public a(RNFirebaseAdMobBanner rNFirebaseAdMobBanner, AdView adView) {
        }
    }

    public enum b {
        EVENT_AD_SIZE_CHANGE("onSizeChange"),
        EVENT_AD_LOADED("onAdLoaded"),
        EVENT_AD_FAILED_TO_LOAD("onAdFailedToLoad"),
        EVENT_AD_OPENED("onAdOpened"),
        EVENT_AD_CLOSED("onAdClosed"),
        EVENT_AD_LEFT_APPLICATION("onAdLeftApplication");
        
        private final String a;

        private b(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    static {
        C0201.m83(RNFirebaseAdMobBanner.class, 457);
    }

    private AdView getAdView() {
        return this.viewGroup.getChildAt(0);
    }

    private void requestAd() {
        if (this.size != null && this.unitId != null && this.request != null) {
            if (this.requested.booleanValue()) {
                resetAdView();
            }
            AdView adView = getAdView();
            adView.setAdUnitId(this.unitId);
            adView.setAdSize(this.size);
            AdRequest build = this.request.build();
            this.requested = Boolean.TRUE;
            adView.loadAd(build);
        }
    }

    private void resetAdView() {
        AdView adView = getAdView();
        View adView2 = new AdView(this.context);
        this.viewGroup.removeViewAt(0);
        if (adView != null) {
            adView.destroy();
        }
        this.viewGroup.addView(adView2);
        setAdListener();
    }

    /* access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(5438), str);
        if (writableMap != null) {
            createMap.putMap(C0201.m82(5439), writableMap);
        }
        this.emitter.receiveEvent(this.viewGroup.getId(), C0201.m82(5440), createMap);
    }

    private void setAdListener() {
        AdView adView = getAdView();
        adView.setAdListener(new a(this, adView));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        e.b a2 = e.a();
        String r1 = C0201.m82(5441);
        String r2 = C0201.m82(5442);
        a2.b(r2, e.d(r1, r2));
        return a2.a();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(5443);
    }

    @xj0(name = "request")
    public void setRequest(f fVar, ReadableMap readableMap) {
        this.request = b.a(readableMap);
        requestAd();
    }

    @xj0(name = "size")
    public void setSize(f fVar, String str) {
        int i;
        int i2;
        this.size = b.c(str);
        WritableMap createMap = Arguments.createMap();
        if (this.size == AdSize.SMART_BANNER) {
            i = (int) q.a((float) this.size.getWidthInPixels(this.context));
            i2 = (int) q.a((float) this.size.getHeightInPixels(this.context));
        } else {
            i = this.size.getWidth();
            i2 = this.size.getHeight();
        }
        createMap.putDouble(C0201.m82(5444), (double) i);
        createMap.putDouble(C0201.m82(5445), (double) i2);
        sendEvent(b.EVENT_AD_SIZE_CHANGE.toString(), createMap);
        requestAd();
    }

    @xj0(name = "unitId")
    public void setUnitId(f fVar, String str) {
        this.unitId = str;
        requestAd();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(k0 k0Var) {
        this.context = k0Var;
        this.viewGroup = new f(k0Var);
        this.emitter = (RCTEventEmitter) k0Var.getJSModule(RCTEventEmitter.class);
        this.viewGroup.addView(new AdView(this.context));
        setAdListener();
        return this.viewGroup;
    }
}
