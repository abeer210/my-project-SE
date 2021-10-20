package com.mkuczera;

import android.os.Vibrator;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

public class RNReactNativeHapticFeedbackModule extends ReactContextBaseJavaModule {
    public ReactApplicationContext reactContext;

    public RNReactNativeHapticFeedbackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(2130);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactMethod
    public void trigger(String str, ReadableMap readableMap) {
        Vibrator vibrator;
        char c;
        boolean z = readableMap.getBoolean(C0201.m82(2131));
        int i = 0;
        int i2 = Settings.System.getInt(this.reactContext.getContentResolver(), C0201.m82(2132), 0);
        if ((z || i2 != 0) && (vibrator = (Vibrator) this.reactContext.getSystemService(C0201.m82(2133))) != null) {
            long[] jArr = {0, 20};
            switch (str.hashCode()) {
                case -2129727439:
                    if (str.equals(C0201.m82(2148))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -2116708196:
                    if (str.equals(C0201.m82(2147))) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1904861407:
                    if (str.equals(C0201.m82(2146))) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1901042832:
                    if (str.equals(C0201.m82(2145))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1708264941:
                    if (str.equals(C0201.m82(2144))) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1595984931:
                    if (str.equals(C0201.m82(2143))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1228183008:
                    if (str.equals(C0201.m82(2142))) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -935007541:
                    if (str.equals(C0201.m82(2141))) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -826376040:
                    if (str.equals(C0201.m82(2140))) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 114203431:
                    if (str.equals(C0201.m82(2139))) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 283833916:
                    if (str.equals(C0201.m82(2138))) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1090835737:
                    if (str.equals(C0201.m82(2137))) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1222061147:
                    if (str.equals(C0201.m82(2136))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1907664724:
                    if (str.equals(C0201.m82(2135))) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1918703398:
                    if (str.equals(C0201.m82(2134))) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jArr = new long[]{0, 20};
                    break;
                case 1:
                    jArr = new long[]{0, 40};
                    break;
                case 2:
                    jArr = new long[]{0, 60};
                    break;
                case 3:
                    jArr = new long[]{0, 40, 60, 20};
                    break;
                case 4:
                    jArr = new long[]{0, 20, 60, 40};
                    break;
                case 5:
                    jArr = new long[]{0, 20, 40, 30, 40, 40};
                    break;
                case 6:
                    i = 4;
                    break;
                case 7:
                    i = 6;
                    break;
                case '\b':
                case '\n':
                    i = 3;
                    break;
                case '\t':
                    i = 7;
                    break;
                case '\f':
                    i = 9;
                    break;
                case '\r':
                    i = 1;
                    break;
                case 14:
                    i = 8;
                    break;
            }
            if (i != 0) {
                vibrator.vibrate((long) i);
            } else {
                vibrator.vibrate(jArr, -1);
            }
        }
    }
}
