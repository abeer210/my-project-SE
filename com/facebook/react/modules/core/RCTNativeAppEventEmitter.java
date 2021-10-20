package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;

@zh0
public interface RCTNativeAppEventEmitter extends JavaScriptModule {
    void emit(String str, Object obj);
}
