package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import vigqyno.C0201;

@pj0(name = "RNTimePickerAndroid")
public class RNTimePickerDialogModule extends ReactContextBaseJavaModule {
    public static final String FRAGMENT_TAG = null;

    class a implements Runnable {
        public final /* synthetic */ i a;
        public final /* synthetic */ ReadableMap b;
        public final /* synthetic */ Promise c;

        public a(i iVar, ReadableMap readableMap, Promise promise) {
            this.a = iVar;
            this.b = readableMap;
            this.c = promise;
        }

        public void run() {
            ReadableMap readableMap;
            i iVar = this.a;
            String r1 = C0201.m82(13008);
            i iVar2 = (i) iVar.c(r1);
            if (iVar2 == null || (readableMap = this.b) == null) {
                i iVar3 = new i();
                ReadableMap readableMap2 = this.b;
                if (readableMap2 != null) {
                    iVar3.setArguments(RNTimePickerDialogModule.this.createFragmentArguments(readableMap2));
                }
                b bVar = new b(this.c);
                iVar3.F(bVar);
                iVar3.H(bVar);
                iVar3.G(bVar);
                iVar3.C(this.a, r1);
                return;
            }
            iVar2.I(RNTimePickerDialogModule.this.createFragmentArguments(readableMap));
        }
    }

    private class b implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        private final Promise a;
        private boolean b = false;

        public b(Promise promise) {
            this.a = promise;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.b && RNTimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(12063), C0201.m82(12064));
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.b && RNTimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(12065), C0201.m82(12066));
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (!this.b && RNTimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(12067), C0201.m82(12068));
                writableNativeMap.putInt(C0201.m82(12069), i);
                writableNativeMap.putInt(C0201.m82(12070), i2);
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }
    }

    static {
        C0201.m83(RNTimePickerDialogModule.class, 655);
    }

    public RNTimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        String r1 = C0201.m82(19282);
        if (readableMap.hasKey(r1) && !readableMap.isNull(r1)) {
            bundle.putLong(r1, (long) readableMap.getDouble(r1));
        }
        String r12 = C0201.m82(19283);
        if (readableMap.hasKey(r12) && !readableMap.isNull(r12)) {
            bundle.putBoolean(r12, readableMap.getBoolean(r12));
        }
        String r13 = C0201.m82(19284);
        if (readableMap.hasKey(r13) && !readableMap.isNull(r13)) {
            bundle.putString(r13, readableMap.getString(r13));
        }
        String r14 = C0201.m82(19285);
        if (readableMap.hasKey(r14) && !readableMap.isNull(r14)) {
            bundle.putString(r14, readableMap.getString(r14));
        }
        String r15 = C0201.m82(19286);
        if (readableMap.hasKey(r15) && !readableMap.isNull(r15)) {
            bundle.putInt(r15, readableMap.getInt(r15));
        }
        return bundle;
    }

    @ReactMethod
    public void dismiss(Promise promise) {
        a.a((d) getCurrentActivity(), C0201.m82(19287), promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(19288);
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        d dVar = (d) getCurrentActivity();
        if (dVar == null) {
            promise.reject(C0201.m82(19289), C0201.m82(19290));
        } else {
            UiThreadUtil.runOnUiThread(new a(dVar.p(), readableMap, promise));
        }
    }
}
