package com.facebook.react.modules.datepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import com.facebook.fbreact.specs.NativeDatePickerAndroidSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import vigqyno.C0201;

@pj0(name = "DatePickerAndroid")
public class DatePickerDialogModule extends NativeDatePickerAndroidSpec {
    public static final String ACTION_DATE_SET = null;
    public static final String ACTION_DISMISSED = null;
    public static final String ARG_DATE = null;
    public static final String ARG_MAXDATE = null;
    public static final String ARG_MINDATE = null;
    public static final String ARG_MODE = null;
    private static final String ERROR_NO_ACTIVITY = null;
    public static final String FRAGMENT_TAG = null;

    private class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {
        private final Promise a;
        private boolean b = false;

        public a(Promise promise) {
            this.a = promise;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (!this.b && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(7648), C0201.m82(7649));
                writableNativeMap.putInt(C0201.m82(7650), i);
                writableNativeMap.putInt(C0201.m82(7651), i2);
                writableNativeMap.putInt(C0201.m82(7652), i3);
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.b && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(7653), C0201.m82(7654));
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }
    }

    static {
        C0201.m83(DatePickerDialogModule.class, 277);
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        String r1 = C0201.m82(39000);
        if (readableMap.hasKey(r1) && !readableMap.isNull(r1)) {
            bundle.putLong(r1, (long) readableMap.getDouble(r1));
        }
        String r12 = C0201.m82(39001);
        if (readableMap.hasKey(r12) && !readableMap.isNull(r12)) {
            bundle.putLong(r12, (long) readableMap.getDouble(r12));
        }
        String r13 = C0201.m82(39002);
        if (readableMap.hasKey(r13) && !readableMap.isNull(r13)) {
            bundle.putLong(r13, (long) readableMap.getDouble(r13));
        }
        String r14 = C0201.m82(39003);
        if (readableMap.hasKey(r14) && !readableMap.isNull(r14)) {
            bundle.putString(r14, readableMap.getString(r14));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(39004);
    }

    @Override // com.facebook.fbreact.specs.NativeDatePickerAndroidSpec
    public void open(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof d)) {
            promise.reject(C0201.m82(39006), C0201.m82(39007));
            return;
        }
        i p = ((d) currentActivity).p();
        String r1 = C0201.m82(39005);
        c cVar = (c) p.c(r1);
        if (cVar != null) {
            cVar.t();
        }
        a aVar = new a();
        if (readableMap != null) {
            aVar.setArguments(createFragmentArguments(readableMap));
        }
        a aVar2 = new a(promise);
        aVar.F(aVar2);
        aVar.E(aVar2);
        aVar.C(p, r1);
    }
}
