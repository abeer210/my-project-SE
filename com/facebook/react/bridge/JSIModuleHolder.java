package com.facebook.react.bridge;

public class JSIModuleHolder {
    private JSIModule mModule;
    private final JSIModuleSpec mSpec;

    public JSIModuleHolder(JSIModuleSpec jSIModuleSpec) {
        this.mSpec = jSIModuleSpec;
    }

    public JSIModule getJSIModule() {
        if (this.mModule == null) {
            synchronized (this) {
                if (this.mModule != null) {
                    return this.mModule;
                }
                JSIModule jSIModule = this.mSpec.getJSIModuleProvider().get();
                this.mModule = jSIModule;
                jSIModule.initialize();
            }
        }
        return this.mModule;
    }

    public void notifyJSInstanceDestroy() {
        JSIModule jSIModule = this.mModule;
        if (jSIModule != null) {
            jSIModule.onCatalystInstanceDestroy();
        }
    }
}
