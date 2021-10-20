package com.reactnativedetector;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* compiled from: DetectorPackage.kt */
public final class a implements wi0 {
    @Override // defpackage.wi0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ow2.c(reactApplicationContext, C0201.m82(22460));
        List<NativeModule> asList = Arrays.asList(new DetectorModule(reactApplicationContext));
        ow2.b(asList, C0201.m82(22461));
        return asList;
    }

    @Override // defpackage.wi0
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ow2.c(reactApplicationContext, C0201.m82(22462));
        return ov2.b();
    }
}
