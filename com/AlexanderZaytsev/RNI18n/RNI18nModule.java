package com.AlexanderZaytsev.RNI18n;

import android.os.Build;
import android.os.LocaleList;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import vigqyno.C0201;

public class RNI18nModule extends ReactContextBaseJavaModule {
    public RNI18nModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private WritableArray getLocaleList() {
        WritableArray createArray = Arguments.createArray();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = getReactApplicationContext().getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                createArray.pushString(toLanguageTag(locales.get(i)));
            }
        } else {
            createArray.pushString(toLanguageTag(getReactApplicationContext().getResources().getConfiguration().locale));
        }
        return createArray;
    }

    private String toLanguageTag(Locale locale) {
        String str;
        if (Build.VERSION.SDK_INT >= 21) {
            str = locale.toLanguageTag();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            if (locale.getCountry() != null) {
                sb.append(C0201.m82(33760));
                sb.append(locale.getCountry());
            }
            str = sb.toString();
        }
        return str.matches(C0201.m82(33761)) ? str.replace(C0201.m82(33762), C0201.m82(33763)).replace(C0201.m82(33764), C0201.m82(33765)).replace(C0201.m82(33766), C0201.m82(33767)) : str;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(33768), getLocaleList());
        return hashMap;
    }

    @ReactMethod
    public void getLanguages(Promise promise) {
        try {
            promise.resolve(getLocaleList());
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(33769);
    }
}
