package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "PlatformConstants")
@SuppressLint({"HardwareIds"})
public class AndroidInfoModule extends NativePlatformConstantsAndroidSpec implements a {
    private static final String IS_TESTING = null;
    public static final String NAME = null;

    static {
        C0201.m83(AndroidInfoModule.class, 307);
    }

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String getServerHost() {
        return a.c(Integer.valueOf(getReactApplicationContext().getApplicationContext().getResources().getInteger(ji0.react_native_dev_server_port)));
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName(C0201.m82(28831));
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService(C0201.m82(28832))).getCurrentModeType();
        if (currentModeType == 1) {
            return C0201.m82(28838);
        }
        if (currentModeType == 2) {
            return C0201.m82(28837);
        }
        if (currentModeType == 3) {
            return C0201.m82(28836);
        }
        if (currentModeType != 4) {
            return currentModeType != 6 ? C0201.m82(28833) : C0201.m82(28834);
        }
        return C0201.m82(28835);
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), C0201.m82(28839));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(28840);
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(28841), Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put(C0201.m82(28842), Build.VERSION.RELEASE);
        hashMap.put(C0201.m82(28843), Build.SERIAL);
        hashMap.put(C0201.m82(28844), Build.FINGERPRINT);
        hashMap.put(C0201.m82(28845), Build.MODEL);
        hashMap.put(C0201.m82(28848), Boolean.valueOf(C0201.m82(28847).equals(System.getProperty(C0201.m82(28846))) || isRunningScreenshotTest().booleanValue()));
        hashMap.put(C0201.m82(28849), b.a);
        hashMap.put(C0201.m82(28850), uiMode());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }
}
