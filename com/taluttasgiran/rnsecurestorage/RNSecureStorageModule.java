package com.taluttasgiran.rnsecurestorage;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.g;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import vigqyno.C0201;

public class RNSecureStorageModule extends ReactContextBaseJavaModule {
    private SharedPreferences prefs;
    private a rnKeyStore;

    public RNSecureStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (useKeystore()) {
            this.rnKeyStore = new a();
        } else {
            this.prefs = new qp2(getReactApplicationContext(), null, C0201.m82(37619));
        }
    }

    public static boolean isRTL(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
        return directionality == 1 || directionality == 2;
    }

    private boolean useKeystore() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        if (useKeystore()) {
            try {
                promise.resolve(Boolean.valueOf(this.rnKeyStore.h(getReactApplicationContext(), str)));
            } catch (Exception e) {
                promise.reject(e);
            }
        } else {
            try {
                promise.resolve(Boolean.valueOf(this.prefs.contains(str)));
            } catch (g e2) {
                promise.reject(e2);
            }
        }
    }

    @ReactMethod
    public void get(String str, Promise promise) {
        if (useKeystore()) {
            try {
                promise.resolve(this.rnKeyStore.l(getReactApplicationContext(), str));
            } catch (FileNotFoundException e) {
                promise.reject(e);
            } catch (Exception e2) {
                promise.reject(e2);
            }
        } else {
            try {
                promise.resolve(this.prefs.getString(str, null));
            } catch (g e3) {
                promise.reject(e3);
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(37620);
    }

    @ReactMethod
    public void remove(String str, Promise promise) {
        ArrayList arrayList = new ArrayList();
        boolean useKeystore = useKeystore();
        String r2 = C0201.m82(37621);
        String r3 = C0201.m82(37622);
        String r4 = C0201.m82(37623);
        if (useKeystore) {
            try {
                String[] strArr = {C0201.m82(37624) + str, C0201.m82(37625) + str};
                for (int i = 0; i < 2; i++) {
                    arrayList.add(Boolean.valueOf(getReactApplicationContext().deleteFile(strArr[i])));
                }
                if (((Boolean) arrayList.get(0)).booleanValue()) {
                    if (((Boolean) arrayList.get(1)).booleanValue()) {
                        promise.resolve(r2);
                        return;
                    }
                }
                promise.reject(r4, r3);
            } catch (Exception e) {
                promise.reject(e);
            }
        } else {
            try {
                if (this.prefs.getString(str, null) == null) {
                    promise.reject(r4, r3);
                    return;
                }
                this.prefs.edit().remove(str).apply();
                promise.resolve(r2);
            } catch (Exception e2) {
                promise.reject(e2);
            }
        }
    }

    @ReactMethod
    public void set(String str, String str2, ReadableMap readableMap, Promise promise) {
        boolean useKeystore = useKeystore();
        String r0 = C0201.m82(37626);
        if (useKeystore) {
            try {
                Locale locale = Locale.getDefault();
                if (isRTL(locale)) {
                    Locale.setDefault(Locale.ENGLISH);
                    this.rnKeyStore.o(getReactApplicationContext(), str, str2);
                    Locale.setDefault(locale);
                    promise.resolve(r0);
                    return;
                }
                this.rnKeyStore.o(getReactApplicationContext(), str, str2);
                promise.resolve(r0);
            } catch (Exception e) {
                promise.reject(e);
            }
        } else {
            try {
                SharedPreferences.Editor edit = this.prefs.edit();
                edit.putString(str, str2);
                edit.apply();
                promise.resolve(r0);
            } catch (Exception e2) {
                promise.reject(e2);
            }
        }
    }
}
