package com.alrajhiretailapp.rasp;

import android.os.Build;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import vigqyno.AbstractC0182;
import vigqyno.C0171;
import vigqyno.C0173;
import vigqyno.C0177;
import vigqyno.C0190;
import vigqyno.C0191;
import vigqyno.C0196;
import vigqyno.C0197;
import vigqyno.C0199;
import vigqyno.C0200;
import vigqyno.C0201;
import vigqyno.C0203;
import vigqyno.C0204;
import vigqyno.C0210;
import vigqyno.C0213;
import vigqyno.C0217;
import vigqyno.EnumC0219;

public class RaspSDKCallback extends ReactContextBaseJavaModule implements AbstractC0182 {

    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

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
            int[] iArr = new int[EnumC0219.values().length];
            a = iArr;
            iArr[EnumC0219.f45.ordinal()] = 1;
            a[EnumC0219.f48.ordinal()] = 2;
            a[EnumC0219.f39.ordinal()] = 3;
            a[EnumC0219.f38.ordinal()] = 4;
            a[EnumC0219.f43.ordinal()] = 5;
            a[EnumC0219.f41.ordinal()] = 6;
            a[EnumC0219.f42.ordinal()] = 7;
            a[EnumC0219.f40.ordinal()] = 8;
            a[EnumC0219.f44.ordinal()] = 9;
            a[EnumC0219.f35.ordinal()] = 10;
            a[EnumC0219.f37.ordinal()] = 11;
            a[EnumC0219.f47.ordinal()] = 12;
        }
    }

    public RaspSDKCallback(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void handleDebuggerCallback(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2877), 3);
        createMap.putBoolean(C0201.m82(2878), z);
        sendEvent(getReactApplicationContext(), C0201.m82(2879), createMap);
    }

    private void handleEmulatorCallback(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2880), 2);
        createMap.putBoolean(C0201.m82(2881), z);
        sendEvent(getReactApplicationContext(), C0201.m82(2882), createMap);
    }

    private void handleFilesystemScanningCallback(boolean z, boolean z2, boolean z3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2883), 9);
        createMap.putBoolean(C0201.m82(2884), z);
        createMap.putBoolean(C0201.m82(2885), z2);
        createMap.putBoolean(C0201.m82(2886), z3);
        sendEvent(getReactApplicationContext(), C0201.m82(2887), createMap);
    }

    private void handleFilesystemWatchingCallback(boolean z, boolean z2, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2888), 10);
        createMap.putBoolean(C0201.m82(2889), z);
        createMap.putBoolean(C0201.m82(2890), z2);
        sendEvent(getReactApplicationContext(), C0201.m82(2891), createMap);
    }

    private void handleForegroundOverrideCallback(int i, String str, String str2, int i2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2892), 8);
        createMap.putInt(C0201.m82(2893), i);
        createMap.putString(C0201.m82(2894), str);
        createMap.putString(C0201.m82(2895), str2);
        createMap.putInt(C0201.m82(2896), i2);
        sendEvent(getReactApplicationContext(), C0201.m82(2897), createMap);
    }

    private void handleHookingFrameworksCallback(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2898), 7);
        createMap.putBoolean(C0201.m82(2899), z);
        sendEvent(getReactApplicationContext(), C0201.m82(2900), createMap);
    }

    private void handleKeyboardCallback(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2901), 4);
        createMap.putBoolean(C0201.m82(2902), z);
        sendEvent(getReactApplicationContext(), C0201.m82(2903), createMap);
    }

    private void handleNativeCodeHooksCallback(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2904), 6);
        createMap.putBoolean(C0201.m82(2905), z);
        sendEvent(getReactApplicationContext(), C0201.m82(2906), createMap);
    }

    private void handleRepackagingCallback(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2907), 1);
        createMap.putBoolean(C0201.m82(2908), z);
        sendEvent(getReactApplicationContext(), C0201.m82(2909), createMap);
    }

    private void handleRootingCallback(boolean z, int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2910), 0);
        createMap.putBoolean(C0201.m82(2911), z);
        createMap.putInt(C0201.m82(2912), i);
        sendEvent(getReactApplicationContext(), C0201.m82(2913), createMap);
    }

    private void handleScreenMirroringCallback(boolean z, boolean z2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2914), 11);
        createMap.putBoolean(C0201.m82(2915), z);
        createMap.putBoolean(C0201.m82(2916), z2);
        sendEvent(getReactApplicationContext(), C0201.m82(2917), createMap);
    }

    private void handleScreenReaderCallback(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(2918), 5);
        createMap.putBoolean(C0201.m82(2919), z);
        sendEvent(getReactApplicationContext(), C0201.m82(2920), createMap);
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(2921);
    }

    @ReactMethod
    public void goToSettings() {
        if (Build.VERSION.SDK_INT >= 3) {
            ((InputMethodManager) getReactApplicationContext().getSystemService(C0201.m82(2922))).showInputMethodPicker();
        }
    }

    @ReactMethod
    public void startObserving() {
        Log.d(C0201.m82(2925), C0201.m82(2926));
        C0173.m11(getReactApplicationContext(), this);
    }

    @Override // vigqyno.AbstractC0182
    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    public void m0(C0177 r4) {
        EnumC0219 r0 = r4.m17();
        Log.d(C0201.m82(2924), C0201.m82(2923) + r0.toString());
        switch (a.a[r0.ordinal()]) {
            case 1:
                C0197 r42 = (C0197) r4;
                handleRootingCallback(r42.m66(), r42.m69());
                return;
            case 2:
                handleRepackagingCallback(((C0196) r4).m65());
                return;
            case 3:
                handleEmulatorCallback(((C0171) r4).m3());
                return;
            case 4:
                handleDebuggerCallback(((C0210) r4).m99());
                return;
            case 5:
                handleKeyboardCallback(((C0217) r4).m131());
                return;
            case 6:
                handleScreenReaderCallback(((C0204) r4).m90());
                return;
            case 7:
                handleNativeCodeHooksCallback(((C0200) r4).m81());
                return;
            case 8:
                handleHookingFrameworksCallback(((C0213) r4).m126());
                return;
            case 9:
                C0191 r43 = (C0191) r4;
                handleForegroundOverrideCallback(r43.m44(), r43.m45(), r43.m46(), r43.m43());
                return;
            case 10:
                C0199 r44 = (C0199) r4;
                handleFilesystemScanningCallback(r44.m80(), r44.m79(), r44.m78());
                return;
            case 11:
                C0190 r45 = (C0190) r4;
                handleFilesystemWatchingCallback(r45.m42(), r45.m40(), r45.m41());
                return;
            case 12:
                C0203 r46 = (C0203) r4;
                handleScreenMirroringCallback(r46.m85(), r46.m84());
                return;
            default:
                return;
        }
    }
}
