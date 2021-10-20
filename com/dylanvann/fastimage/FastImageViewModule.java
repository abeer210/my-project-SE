package com.dylanvann.fastimage;

import android.app.Activity;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

public class FastImageViewModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = null;

    class a implements Runnable {
        public final /* synthetic */ ReadableArray a;
        public final /* synthetic */ Activity b;

        public a(FastImageViewModule fastImageViewModule, ReadableArray readableArray, Activity activity) {
            this.a = readableArray;
            this.b = activity;
        }

        public void run() {
            Object obj;
            for (int i = 0; i < this.a.size(); i++) {
                ReadableMap map = this.a.getMap(i);
                e c = f.c(this.b, map);
                k t = c.t(this.b.getApplicationContext());
                if (c.j()) {
                    obj = c.d();
                } else {
                    obj = c.f() ? c.e() : c.g();
                }
                t.q(obj).a(f.d(this.b, c, map)).K0();
            }
        }
    }

    static {
        C0201.m83(FastImageViewModule.class, 478);
    }

    public FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(23126);
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new a(this, readableArray, currentActivity));
        }
    }
}
