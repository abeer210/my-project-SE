package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import vigqyno.C0201;

@pj0(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public static final String NAME = null;

    static {
        C0201.m83(HeadlessJsTaskSupportModule.class, 545);
    }

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(18439);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d) {
        int i = (int) d;
        lj0 d2 = lj0.d(getReactApplicationContext());
        if (d2.f(i)) {
            d2.c(i);
            return;
        }
        f60.y(HeadlessJsTaskSupportModule.class, C0201.m82(18440), Integer.valueOf(i));
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d, Promise promise) {
        int i = (int) d;
        lj0 d2 = lj0.d(getReactApplicationContext());
        if (d2.f(i)) {
            d2.i(i);
            promise.resolve(Boolean.FALSE);
            return;
        }
        f60.y(HeadlessJsTaskSupportModule.class, C0201.m82(18441), Integer.valueOf(i));
        promise.resolve(Boolean.FALSE);
    }
}
