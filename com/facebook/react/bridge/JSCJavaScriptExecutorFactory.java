package com.facebook.react.bridge;

import vigqyno.C0201;

public class JSCJavaScriptExecutorFactory implements JavaScriptExecutorFactory {
    private final String mAppName;
    private final String mDeviceName;

    public JSCJavaScriptExecutorFactory(String str, String str2) {
        this.mAppName = str;
        this.mDeviceName = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(C0201.m82(2665), C0201.m82(2666));
        writableNativeMap.putString(C0201.m82(2667), this.mAppName);
        writableNativeMap.putString(C0201.m82(2668), this.mDeviceName);
        return new JSCJavaScriptExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException(C0201.m82(2669) + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException(C0201.m82(2670) + toString());
    }

    public String toString() {
        return C0201.m82(2671);
    }
}
