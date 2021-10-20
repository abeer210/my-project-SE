package com.dynatrace.android.agent;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: DynatraceReactPackage */
public class r implements wi0 {
    @Override // defpackage.wi0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        PrivateDTBridge privateDTBridge = new PrivateDTBridge(reactApplicationContext);
        return Arrays.asList(new DynatraceRNBridge(reactApplicationContext, privateDTBridge), privateDTBridge);
    }

    @Override // defpackage.wi0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
