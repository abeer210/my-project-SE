package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import vigqyno.C0201;

@DoNotStrip
public class ThreadScopeSupport {
    static {
        rl0.c(C0201.m82(10420));
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
