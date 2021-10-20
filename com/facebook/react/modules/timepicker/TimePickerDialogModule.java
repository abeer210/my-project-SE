package com.facebook.react.modules.timepicker;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import com.facebook.fbreact.specs.NativeTimePickerAndroidSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import vigqyno.C0201;

@pj0(name = "TimePickerAndroid")
public class TimePickerDialogModule extends NativeTimePickerAndroidSpec {
    public static final String ACTION_DISMISSED = null;
    public static final String ACTION_TIME_SET = null;
    public static final String ARG_HOUR = null;
    public static final String ARG_IS24HOUR = null;
    public static final String ARG_MINUTE = null;
    public static final String ARG_MODE = null;
    private static final String ERROR_NO_ACTIVITY = null;
    public static final String FRAGMENT_TAG = null;

    private class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener {
        private final Promise a;
        private boolean b = false;

        public a(Promise promise) {
            this.a = promise;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.b && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(36319), C0201.m82(36320));
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (!this.b && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(36321), C0201.m82(36322));
                writableNativeMap.putInt(C0201.m82(36323), i);
                writableNativeMap.putInt(C0201.m82(36324), i2);
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }
    }

    static {
        C0201.m83(TimePickerDialogModule.class, 433);
    }

    public TimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        String r1 = C0201.m82(17471);
        if (readableMap.hasKey(r1) && !readableMap.isNull(r1)) {
            bundle.putInt(r1, readableMap.getInt(r1));
        }
        String r12 = C0201.m82(17472);
        if (readableMap.hasKey(r12) && !readableMap.isNull(r12)) {
            bundle.putInt(r12, readableMap.getInt(r12));
        }
        String r13 = C0201.m82(17473);
        if (readableMap.hasKey(r13) && !readableMap.isNull(r13)) {
            bundle.putBoolean(r13, readableMap.getBoolean(r13));
        }
        String r14 = C0201.m82(17474);
        if (readableMap.hasKey(r14) && !readableMap.isNull(r14)) {
            bundle.putString(r14, readableMap.getString(r14));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(17475);
    }

    @Override // com.facebook.fbreact.specs.NativeTimePickerAndroidSpec
    public void open(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof d)) {
            promise.reject(C0201.m82(17477), C0201.m82(17478));
            return;
        }
        i p = ((d) currentActivity).p();
        String r1 = C0201.m82(17476);
        c cVar = (c) p.c(r1);
        if (cVar != null) {
            cVar.t();
        }
        b bVar = new b();
        if (readableMap != null) {
            bVar.setArguments(createFragmentArguments(readableMap));
        }
        a aVar = new a(promise);
        bVar.E(aVar);
        bVar.F(aVar);
        bVar.C(p, r1);
    }
}
