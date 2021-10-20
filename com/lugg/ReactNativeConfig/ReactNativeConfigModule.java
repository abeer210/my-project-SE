package com.lugg.ReactNativeConfig;

import android.content.res.Resources;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class ReactNativeConfigModule extends ReactContextBaseJavaModule {
    public ReactNativeConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String str;
        String r0 = C0201.m82(9855);
        HashMap hashMap = new HashMap();
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            try {
                str = reactApplicationContext.getString(reactApplicationContext.getResources().getIdentifier(C0201.m82(9856), C0201.m82(9857), reactApplicationContext.getPackageName()));
            } catch (Resources.NotFoundException unused) {
                str = getReactApplicationContext().getApplicationContext().getPackageName();
            }
            Field[] declaredFields = Class.forName(str + C0201.m82(9858)).getDeclaredFields();
            for (Field field : declaredFields) {
                try {
                    hashMap.put(field.getName(), field.get(null));
                } catch (IllegalAccessException unused2) {
                    Log.d(r0, C0201.m82(9859) + field.getName());
                }
            }
        } catch (ClassNotFoundException unused3) {
            Log.d(r0, C0201.m82(9860));
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(9861);
    }
}
