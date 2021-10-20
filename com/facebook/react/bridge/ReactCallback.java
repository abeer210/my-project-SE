package com.facebook.react.bridge;

@zh0
public interface ReactCallback {
    @zh0
    void decrementPendingJSCalls();

    @zh0
    void incrementPendingJSCalls();

    @zh0
    void onBatchComplete();
}
