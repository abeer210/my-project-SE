package com.facebook.react.bridge;

import vigqyno.C0201;

public final class CallbackImpl implements Callback {
    private final int mCallbackId;
    private boolean mInvoked = false;
    private final JSInstance mJSInstance;

    public CallbackImpl(JSInstance jSInstance, int i) {
        this.mJSInstance = jSInstance;
        this.mCallbackId = i;
    }

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        if (!this.mInvoked) {
            this.mJSInstance.invokeCallback(this.mCallbackId, Arguments.fromJavaArgs(objArr));
            this.mInvoked = true;
            return;
        }
        throw new RuntimeException(C0201.m82(16691));
    }
}
