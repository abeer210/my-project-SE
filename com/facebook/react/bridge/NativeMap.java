package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

@zh0
public abstract class NativeMap {
    @zh0
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
