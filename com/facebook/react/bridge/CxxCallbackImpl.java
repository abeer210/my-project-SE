package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

@zh0
public class CxxCallbackImpl implements Callback {
    @zh0
    private final HybridData mHybridData;

    @zh0
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
