package io.invertase.firebase.admob;

import android.app.Activity;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.ads.MobileAds;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class RNFirebaseAdMob extends ReactContextBaseJavaModule {
    private static final String TAG = null;
    private HashMap<String, c> interstitials = new HashMap<>();
    private HashMap<String, a> rewardedVideos = new HashMap<>();

    static {
        C0201.m83(RNFirebaseAdMob.class, 683);
    }

    public RNFirebaseAdMob(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(C0201.m82(10038), C0201.m82(10039));
    }

    private c getOrCreateInterstitial(String str) {
        if (this.interstitials.containsKey(str)) {
            return this.interstitials.get(str);
        }
        c cVar = new c(str, this);
        this.interstitials.put(str, cVar);
        return cVar;
    }

    private a getOrCreateRewardedVideo(String str) {
        if (this.rewardedVideos.containsKey(str)) {
            return this.rewardedVideos.get(str);
        }
        a aVar = new a(str, this);
        this.rewardedVideos.put(str, aVar);
        return aVar;
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(10040), C0201.m82(10041));
        return hashMap;
    }

    public ReactApplicationContext getContext() {
        return getReactApplicationContext();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(10042);
    }

    @ReactMethod
    public void initialize(String str) {
        MobileAds.initialize(getContext(), str);
    }

    @ReactMethod
    public void interstitialLoadAd(String str, ReadableMap readableMap) {
        getOrCreateInterstitial(str).b(b.a(readableMap).build());
    }

    @ReactMethod
    public void interstitialShowAd(String str) {
        getOrCreateInterstitial(str).c();
    }

    @ReactMethod
    public void openDebugMenu(String str) {
        MobileAds.openDebugMenu(getActivity(), str);
    }

    @ReactMethod
    public void rewardedVideoLoadAd(String str, ReadableMap readableMap) {
        getOrCreateRewardedVideo(str).c(b.a(readableMap).build());
    }

    @ReactMethod
    public void rewardedVideoSetCustomData(String str, String str2) {
        getOrCreateRewardedVideo(str).d(str2);
    }

    @ReactMethod
    public void rewardedVideoShowAd(String str) {
        getOrCreateRewardedVideo(str).e();
    }
}
