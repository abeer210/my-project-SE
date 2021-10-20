package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeLinkingSpec;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import vigqyno.C0201;

@pj0(name = "IntentAndroid")
public class IntentModule extends NativeLinkingSpec {
    public static final String NAME = null;

    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            iArr[ReadableType.String.ordinal()] = 1;
            a[ReadableType.Number.ordinal()] = 2;
            try {
                a[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        C0201.m83(IntentModule.class, 487);
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeLinkingSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeLinkingSpec
    public void canOpenURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7119) + str));
            return;
        }
        try {
            Intent intent = new Intent(C0201.m82(7116), Uri.parse(str));
            intent.addFlags(268435456);
            promise.resolve(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7117) + str + C0201.m82(7118) + e.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeLinkingSpec
    public void getInitialURL(Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            String str = null;
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                String action = intent.getAction();
                Uri data = intent.getData();
                if (data != null && (C0201.m82(7120).equals(action) || C0201.m82(7121).equals(action))) {
                    str = data.toString();
                }
            }
            promise.resolve(str);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7122) + e.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(7123);
    }

    @Override // com.facebook.fbreact.specs.NativeLinkingSpec
    public void openSettings(Promise promise) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction(C0201.m82(7124));
            intent.addCategory(C0201.m82(7125));
            intent.setData(Uri.parse(C0201.m82(7126) + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7127) + e.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeLinkingSpec
    public void openURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7132) + str));
            return;
        }
        try {
            Activity currentActivity = getCurrentActivity();
            Intent intent = new Intent(C0201.m82(7128), Uri.parse(str).normalizeScheme());
            String packageName = getReactApplicationContext().getPackageName();
            ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
            String packageName2 = resolveActivity != null ? resolveActivity.getPackageName() : C0201.m82(7129);
            if (currentActivity == null || !packageName.equals(packageName2)) {
                intent.addFlags(268435456);
            }
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            } else {
                getReactApplicationContext().startActivity(intent);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7130) + str + C0201.m82(7131) + e.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeLinkingSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeLinkingSpec
    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        String r0 = C0201.m82(7133);
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7137) + str + r0));
            return;
        }
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
            promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7134) + str + r0));
            return;
        }
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                String nextKey = map.keySetIterator().nextKey();
                int i2 = a.a[map.getType(nextKey).ordinal()];
                if (i2 == 1) {
                    intent.putExtra(nextKey, map.getString(nextKey));
                } else if (i2 == 2) {
                    intent.putExtra(nextKey, Double.valueOf(map.getDouble(nextKey)));
                } else if (i2 != 3) {
                    promise.reject(new JSApplicationIllegalArgumentException(C0201.m82(7135) + nextKey + C0201.m82(7136)));
                    return;
                } else {
                    intent.putExtra(nextKey, map.getBoolean(nextKey));
                }
            }
        }
        getReactApplicationContext().startActivity(intent);
    }
}
