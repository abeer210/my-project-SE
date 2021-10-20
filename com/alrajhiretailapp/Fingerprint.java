package com.alrajhiretailapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.preference.PreferenceManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import vigqyno.C0201;

public class Fingerprint extends ReactContextBaseJavaModule {
    private final String LAST_KEY_ID = C0201.m82(7520);
    private final ReactApplicationContext reactContext;
    private SharedPreferences spref;

    public Fingerprint(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.spref = PreferenceManager.getDefaultSharedPreferences(reactApplicationContext);
    }

    private int getFingerprintInfo(Context context) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Object invoke = FingerprintManager.class.getDeclaredMethod(C0201.m82(7522), new Class[0]).invoke((FingerprintManager) context.getSystemService(C0201.m82(7521)), new Object[0]);
        if (invoke == null) {
            return 0;
        }
        Method declaredMethod = Class.forName(C0201.m82(7523)).getDeclaredMethod(C0201.m82(7524), new Class[0]);
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = (List) invoke;
            if (i >= list.size()) {
                return i2;
            }
            Object obj = list.get(i);
            if (obj != null) {
                i2 += ((Integer) declaredMethod.invoke(obj, new Object[0])).intValue();
            }
            i++;
        }
    }

    private boolean hasFingerprintHardware(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(C0201.m82(7525));
            if (fingerprintManager == null) {
                return false;
            }
            return fingerprintManager.isHardwareDetected();
        }
        w1 a = w1.a(getReactApplicationContext());
        if (a == null) {
            return false;
        }
        return a.c();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(7526);
    }

    @ReactMethod
    public void hasFingerPrintChanged(Callback callback, Callback callback2) {
        String r6 = C0201.m82(7527);
        if (!hasFingerprintHardware(this.reactContext)) {
            callback2.invoke(Boolean.FALSE);
            return;
        }
        try {
            int fingerprintInfo = getFingerprintInfo(this.reactContext);
            if (this.spref.getInt(r6, 0) != fingerprintInfo) {
                this.spref.edit().putInt(r6, fingerprintInfo).apply();
                callback2.invoke(Boolean.TRUE);
                return;
            }
            callback2.invoke(Boolean.FALSE);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            callback2.invoke(Boolean.FALSE);
        }
    }
}
