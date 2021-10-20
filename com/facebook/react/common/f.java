package com.facebook.react.common;

/* compiled from: SingleThreadAsserter */
public class f {
    private Thread a = null;

    public void a() {
        Thread currentThread = Thread.currentThread();
        if (this.a == null) {
            this.a = currentThread;
        }
        yh0.a(this.a == currentThread);
    }
}
