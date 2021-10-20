package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.b;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper {
    @zh0
    private final HybridData mHybridData = initHybrid();

    static {
        b.a();
    }

    private EventEmitterWrapper() {
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap);
}
