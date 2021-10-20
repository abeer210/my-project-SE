package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.c;
import com.facebook.react.modules.network.g;
import com.facebook.react.turbomodule.core.interfaces.a;
import defpackage.ce0;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import vigqyno.C0201;

@pj0(name = "FrescoModule", needsEagerInit = true)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, a {
    public static final String NAME = null;
    private static boolean sHasBeenInitialized;
    private final boolean mClearOnDestroy;
    private ce0 mConfig;

    static {
        C0201.m83(FrescoModule.class, 296);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, null);
    }

    private static ce0 getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).E();
    }

    public static ce0.b getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new c());
        OkHttpClient a = g.a();
        ((com.facebook.react.modules.network.a) a.cookieJar()).b(new JavaNetCookieJar(new c(reactContext)));
        ce0.b a2 = hc0.a(reactContext.getApplicationContext(), a);
        a2.G(new b(a));
        a2.F(false);
        a2.H(hashSet);
        return a2;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        c80.a().a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(22556);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            c80.c(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            f60.A(C0201.m82(22557), C0201.m82(22558));
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            c80.a().c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, ce0 ce0) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = ce0;
    }
}
