package com.reactnativecommunity.webview;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import vigqyno.C0201;

/* compiled from: RNCWebViewPackage.kt */
public final class a implements wi0 {
    @Override // defpackage.wi0
    public List<RNCWebViewModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ow2.c(reactApplicationContext, C0201.m82(17230));
        return nv2.a(new RNCWebViewModule(reactApplicationContext));
    }

    @Override // defpackage.wi0
    public List<RNCWebViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ow2.c(reactApplicationContext, C0201.m82(17231));
        return nv2.a(new RNCWebViewManager());
    }
}
