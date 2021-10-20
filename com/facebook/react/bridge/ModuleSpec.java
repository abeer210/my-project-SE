package com.facebook.react.bridge;

import javax.inject.Provider;
import vigqyno.C0201;

public class ModuleSpec {
    private static final String TAG = null;
    private final String mName;
    private final Provider<? extends NativeModule> mProvider;
    private final Class<? extends NativeModule> mType = null;

    static {
        C0201.m83(ModuleSpec.class, 729);
    }

    private ModuleSpec(Provider<? extends NativeModule> provider) {
        this.mProvider = provider;
        this.mName = null;
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider<? extends NativeModule> provider) {
        pj0 pj0 = (pj0) cls.getAnnotation(pj0.class);
        if (pj0 != null) {
            return new ModuleSpec(provider, pj0.name());
        }
        f60.A(C0201.m82(9747), C0201.m82(9745) + cls.getName() + C0201.m82(9746));
        return new ModuleSpec(provider, ((NativeModule) provider.get()).getName());
    }

    public static ModuleSpec viewManagerSpec(Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider);
    }

    public String getName() {
        return this.mName;
    }

    public Provider<? extends NativeModule> getProvider() {
        return this.mProvider;
    }

    public Class<? extends NativeModule> getType() {
        return this.mType;
    }

    private ModuleSpec(Provider<? extends NativeModule> provider, String str) {
        this.mProvider = provider;
        this.mName = str;
    }

    public static ModuleSpec nativeModuleSpec(String str, Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider, str);
    }
}
