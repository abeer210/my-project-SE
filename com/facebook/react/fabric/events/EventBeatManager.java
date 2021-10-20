package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.b;
import com.facebook.react.uimanager.events.a;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventBeatManager implements a {
    @zh0
    private final HybridData mHybridData;

    static {
        b.a();
    }

    private static native HybridData initHybrid();

    private native void tick();

    @Override // com.facebook.react.uimanager.events.a
    public void a() {
        tick();
    }
}
