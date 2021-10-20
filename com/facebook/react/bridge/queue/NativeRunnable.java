package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;

@zh0
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    @zh0
    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void run();
}
