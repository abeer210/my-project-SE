package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

@zh0
public abstract class NativeArray implements NativeArrayInterface {
    @zh0
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();
}
