package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import vigqyno.C0201;

/* compiled from: JSCExecutorFactory */
public class a implements JavaScriptExecutorFactory {
    private final String a;
    private final String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(C0201.m82(10451), C0201.m82(10452));
        writableNativeMap.putString(C0201.m82(10453), this.a);
        writableNativeMap.putString(C0201.m82(10454), this.b);
        return new JSCExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException(C0201.m82(10455) + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException(C0201.m82(10456) + toString());
    }

    public String toString() {
        return C0201.m82(10457);
    }
}
