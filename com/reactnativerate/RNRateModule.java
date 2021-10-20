package com.reactnativerate;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

public class RNRateModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    class a implements o02<a02> {
        public final /* synthetic */ b02 a;
        public final /* synthetic */ Callback b;

        /* renamed from: com.reactnativerate.RNRateModule$a$a  reason: collision with other inner class name */
        class C0123a implements o02<Void> {
            public final /* synthetic */ s02 a;

            public C0123a(s02 s02) {
                this.a = s02;
            }

            @Override // defpackage.o02
            public void a(s02<Void> s02) {
                if (this.a.g()) {
                    a.this.b.invoke(Boolean.TRUE);
                    return;
                }
                a.this.b.invoke(Boolean.FALSE);
            }
        }

        public a(b02 b02, Callback callback) {
            this.a = b02;
            this.b = callback;
        }

        @Override // defpackage.o02
        public void a(s02<a02> s02) {
            if (s02.g()) {
                a02 e = s02.e();
                Activity currentActivity = RNRateModule.this.getCurrentActivity();
                if (currentActivity != null) {
                    this.a.a(currentActivity, e).a(new C0123a(s02));
                    return;
                }
                return;
            }
            this.b.invoke(Boolean.FALSE);
        }
    }

    public RNRateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(33614);
    }

    @ReactMethod
    public void rate(ReadableMap readableMap, Callback callback) {
        b02 a2 = c02.a(this.reactContext);
        a2.b().a(new a(a2, callback));
    }
}
