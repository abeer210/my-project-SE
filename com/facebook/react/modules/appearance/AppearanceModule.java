package com.facebook.react.modules.appearance;

import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import vigqyno.C0201;

@pj0(name = "Appearance")
public class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = null;
    public static final String NAME = null;
    private String mColorScheme;
    private final a mOverrideColorScheme;

    public interface a {
        String a();
    }

    static {
        C0201.m83(AppearanceModule.class, 458);
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null);
    }

    private String colorSchemeForCurrentConfiguration(Context context) {
        a aVar = this.mOverrideColorScheme;
        if (aVar != null) {
            return aVar.a();
        }
        return (context.getResources().getConfiguration().uiMode & 48) != 32 ? C0201.m82(32712) : C0201.m82(32713);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String str) {
    }

    public void emitAppearanceChanged(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(32714), str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(32715), createMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(getReactApplicationContext());
        this.mColorScheme = colorSchemeForCurrentConfiguration;
        return colorSchemeForCurrentConfiguration;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(32716);
    }

    public void onConfigurationChanged(Context context) {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (!this.mColorScheme.equals(colorSchemeForCurrentConfiguration)) {
            this.mColorScheme = colorSchemeForCurrentConfiguration;
            emitAppearanceChanged(colorSchemeForCurrentConfiguration);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double d) {
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext, a aVar) {
        super(reactApplicationContext);
        this.mColorScheme = C0201.m82(32711);
        this.mOverrideColorScheme = aVar;
        this.mColorScheme = colorSchemeForCurrentConfiguration(reactApplicationContext);
    }
}
