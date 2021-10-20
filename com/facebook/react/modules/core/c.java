package com.facebook.react.modules.core;

import com.facebook.react.bridge.WritableArray;

/* compiled from: JavaScriptTimerManager */
public interface c {
    void callIdleCallbacks(double d);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
