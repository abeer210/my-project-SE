package com.facebook.react.bridge;

public class JavaScriptContextHolder {
    private long mContext;

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }

    public synchronized void clear() {
        this.mContext = 0;
    }

    public long get() {
        return this.mContext;
    }
}
