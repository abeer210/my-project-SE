package com.facebook.react.modules.share;

import android.app.Activity;
import android.content.Intent;
import com.facebook.fbreact.specs.NativeShareModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

@pj0(name = "ShareModule")
public class ShareModule extends NativeShareModuleSpec {
    public static final String ACTION_SHARED = null;
    public static final String ERROR_INVALID_CONTENT = null;
    public static final String ERROR_UNABLE_TO_OPEN_DIALOG = null;
    public static final String NAME = null;

    static {
        C0201.m83(ShareModule.class, 357);
    }

    public ShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(29035);
    }

    @Override // com.facebook.fbreact.specs.NativeShareModuleSpec
    public void share(ReadableMap readableMap, String str, Promise promise) {
        String r0 = C0201.m82(29036);
        String r1 = C0201.m82(29037);
        if (readableMap == null) {
            promise.reject(C0201.m82(29038), C0201.m82(29039));
            return;
        }
        try {
            Intent intent = new Intent(C0201.m82(29040));
            intent.setTypeAndNormalize(C0201.m82(29041));
            if (readableMap.hasKey(r1)) {
                intent.putExtra(C0201.m82(29042), readableMap.getString(r1));
            }
            if (readableMap.hasKey(r0)) {
                intent.putExtra(C0201.m82(29043), readableMap.getString(r0));
            }
            Intent createChooser = Intent.createChooser(intent, str);
            createChooser.addCategory(C0201.m82(29044));
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(createChooser);
            } else {
                getReactApplicationContext().startActivity(createChooser);
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(29045), C0201.m82(29046));
            promise.resolve(createMap);
        } catch (Exception unused) {
            promise.reject(C0201.m82(29047), C0201.m82(29048));
        }
    }
}
