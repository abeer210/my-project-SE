package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public class JSIModuleRegistry {
    private final Map<JSIModuleType, JSIModuleHolder> mModules = new HashMap();

    public JSIModule getModule(JSIModuleType jSIModuleType) {
        JSIModuleHolder jSIModuleHolder = this.mModules.get(jSIModuleType);
        if (jSIModuleHolder != null) {
            JSIModule jSIModule = jSIModuleHolder.getJSIModule();
            yh0.c(jSIModule);
            return jSIModule;
        }
        throw new IllegalArgumentException(C0201.m82(15350) + jSIModuleType);
    }

    public void notifyJSInstanceDestroy() {
        for (Map.Entry<JSIModuleType, JSIModuleHolder> entry : this.mModules.entrySet()) {
            if (entry.getKey() != JSIModuleType.TurboModuleManager) {
                entry.getValue().notifyJSInstanceDestroy();
            }
        }
    }

    public void registerModules(List<JSIModuleSpec> list) {
        for (JSIModuleSpec jSIModuleSpec : list) {
            this.mModules.put(jSIModuleSpec.getJSIModuleType(), new JSIModuleHolder(jSIModuleSpec));
        }
    }
}
