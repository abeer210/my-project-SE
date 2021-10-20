package com.alrajhiretailapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import net.alhazmy13.hijridatepicker.date.hijri.c;
import net.alhazmy13.hijridatepicker.h;
import vigqyno.C0201;

@pj0(name = "RNHijriDatePickerAndroid")
public class AndroidHijriDateWrapper extends ReactContextBaseJavaModule {
    public static final String FRAGMENT_TAG = null;

    private class a implements c.d, DialogInterface.OnDismissListener {
        private final Promise a;
        private boolean b = false;

        public a(Promise promise) {
            this.a = promise;
        }

        @Override // net.alhazmy13.hijridatepicker.date.hijri.c.d
        public void a(c cVar, int i, int i2, int i3) {
            if (!this.b && AndroidHijriDateWrapper.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(13585), C0201.m82(13586));
                writableNativeMap.putInt(C0201.m82(13587), i);
                writableNativeMap.putInt(C0201.m82(13588), i2);
                writableNativeMap.putInt(C0201.m82(13589), i3);
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.b && AndroidHijriDateWrapper.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(13590), C0201.m82(13591));
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }
    }

    static {
        C0201.m83(AndroidHijriDateWrapper.class, 535);
    }

    public AndroidHijriDateWrapper(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        String r1 = C0201.m82(16056);
        if (readableMap.hasKey(r1) && !readableMap.isNull(r1)) {
            bundle.putLong(r1, (long) readableMap.getDouble(r1));
        }
        String r12 = C0201.m82(16057);
        if (readableMap.hasKey(r12) && !readableMap.isNull(r12)) {
            bundle.putLong(r12, (long) readableMap.getDouble(r12));
        }
        String r13 = C0201.m82(16058);
        if (readableMap.hasKey(r13) && !readableMap.isNull(r13)) {
            bundle.putLong(r13, (long) readableMap.getDouble(r13));
        }
        String r14 = C0201.m82(16059);
        if (readableMap.hasKey(r14) && !readableMap.isNull(r14)) {
            bundle.putString(r14, readableMap.getString(r14));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(16060);
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        d dVar = (d) getCurrentActivity();
        if (dVar == null) {
            promise.reject(C0201.m82(16061), C0201.m82(16062));
            return;
        }
        i p = dVar.p();
        String r1 = C0201.m82(16063);
        if (((c) p.c(r1)) == null || readableMap == null) {
            Log.d(C0201.m82(16066), C0201.m82(16067));
            h hVar = new h(createFragmentArguments(readableMap));
            a aVar = new a(promise);
            c K = c.K(aVar, hVar);
            K.T(aVar);
            K.C(p, r1);
            return;
        }
        Log.d(C0201.m82(16064), C0201.m82(16065));
    }
}
