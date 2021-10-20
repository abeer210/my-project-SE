package com.reactnativenavigation.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* compiled from: NavigationPackage */
public class w implements wi0 {
    private vi0 a;

    public w(vi0 vi0) {
        this.a = vi0;
    }

    @Override // defpackage.wi0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new NavigationModule(reactApplicationContext, this.a.j(), new ue2(this.a.j())));
    }

    @Override // defpackage.wi0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
