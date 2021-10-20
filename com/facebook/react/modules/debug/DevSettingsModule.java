package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import vigqyno.C0201;

@pj0(name = "DevSettings")
public class DevSettingsModule extends NativeDevSettingsSpec {
    public static final String NAME = null;
    private final gj0 mDevSupportManager;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            DevSettingsModule.this.mDevSupportManager.f();
        }
    }

    class b implements fj0 {
        public b(DevSettingsModule devSettingsModule, String str) {
        }
    }

    static {
        C0201.m83(DevSettingsModule.class, 534);
    }

    public DevSettingsModule(ReactApplicationContext reactApplicationContext, gj0 gj0) {
        super(reactApplicationContext);
        this.mDevSupportManager = gj0;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(String str) {
        this.mDevSupportManager.i(str, new b(this, str));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(15659);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        if (this.mDevSupportManager.b()) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String str) {
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean z) {
        this.mDevSupportManager.c(z);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean z) {
        this.mDevSupportManager.l(z);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean z) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean z) {
        this.mDevSupportManager.k(z);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.mDevSupportManager.n();
    }
}
