package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.e;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "I18nManager")
public class I18nManagerModule extends ContextBaseJavaModule {
    public static final String NAME = null;
    private final a sharedI18nUtilInstance = a.d();

    static {
        C0201.m83(I18nManagerModule.class, 682);
    }

    public I18nManagerModule(Context context) {
        super(context);
    }

    @ReactMethod
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.a(getContext(), z);
    }

    @ReactMethod
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.c(getContext(), z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Context context = getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap b = e.b();
        b.put(C0201.m82(9830), Boolean.valueOf(this.sharedI18nUtilInstance.g(context)));
        b.put(C0201.m82(9831), Boolean.valueOf(this.sharedI18nUtilInstance.b(context)));
        b.put(C0201.m82(9832), locale.toString());
        return b;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(9833);
    }

    @ReactMethod
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.k(getContext(), z);
    }
}
