package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;

/* compiled from: GuardedFrameCallback */
public abstract class e extends a.AbstractC0040a {
    private final ReactContext b;

    public e(ReactContext reactContext) {
        this.b = reactContext;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0040a
    public final void a(long j) {
        try {
            c(j);
        } catch (RuntimeException e) {
            this.b.handleException(e);
        }
    }

    public abstract void c(long j);
}
