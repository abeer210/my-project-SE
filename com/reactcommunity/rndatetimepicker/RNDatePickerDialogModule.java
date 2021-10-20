package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
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

@pj0(name = "RNDatePickerAndroid")
public class RNDatePickerDialogModule extends ReactContextBaseJavaModule {
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
            String r1 = C0201.m82(33476);
            d dVar = (d) iVar.c(r1);
            if (dVar == null || (readableMap = this.b) == null) {
                d dVar2 = new d();
                ReadableMap readableMap2 = this.b;
                if (readableMap2 != null) {
                    dVar2.setArguments(RNDatePickerDialogModule.this.createFragmentArguments(readableMap2));
                }
                b bVar = new b(this.c);
                dVar2.G(bVar);
                dVar2.F(bVar);
                dVar2.H(bVar);
                dVar2.C(this.a, r1);
                return;
            }
            dVar.I(RNDatePickerDialogModule.this.createFragmentArguments(readableMap));
        }
    }

    private class b implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        private final Promise a;
        private boolean b = false;

        public b(Promise promise) {
            this.a = promise;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.b && RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(33600), C0201.m82(33601));
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (!this.b && RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(33602), C0201.m82(33603));
                writableNativeMap.putInt(C0201.m82(33604), i);
                writableNativeMap.putInt(C0201.m82(33605), i2);
                writableNativeMap.putInt(C0201.m82(33606), i3);
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.b && RNDatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(C0201.m82(33607), C0201.m82(33608));
                this.a.resolve(writableNativeMap);
                this.b = true;
            }
        }
    }

    static {
        C0201.m83(RNDatePickerDialogModule.class, 635);
    }

    public RNDatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        String r1 = C0201.m82(28820);
        if (readableMap.hasKey(r1) && !readableMap.isNull(r1)) {
            bundle.putLong(r1, (long) readableMap.getDouble(r1));
        }
        String r12 = C0201.m82(28821);
        if (readableMap.hasKey(r12) && !readableMap.isNull(r12)) {
            bundle.putLong(r12, (long) readableMap.getDouble(r12));
        }
        String r13 = C0201.m82(28822);
        if (readableMap.hasKey(r13) && !readableMap.isNull(r13)) {
            bundle.putLong(r13, (long) readableMap.getDouble(r13));
        }
        String r14 = C0201.m82(28823);
        if (readableMap.hasKey(r14) && !readableMap.isNull(r14)) {
            bundle.putString(r14, readableMap.getString(r14));
        }
        String r15 = C0201.m82(28824);
        if (readableMap.hasKey(r15) && !readableMap.isNull(r15)) {
            bundle.putString(r15, readableMap.getString(r15));
        }
        return bundle;
    }

    @ReactMethod
    public void dismiss(Promise promise) {
        a.a((d) getCurrentActivity(), C0201.m82(28825), promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(28826);
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        d dVar = (d) getCurrentActivity();
        if (dVar == null) {
            promise.reject(C0201.m82(28827), C0201.m82(28828));
        } else {
            UiThreadUtil.runOnUiThread(new a(dVar.p(), readableMap, promise));
        }
    }
}
