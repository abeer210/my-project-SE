package com.facebook.animated.gif;

import android.graphics.Bitmap;

public class GifFrame implements ub0 {
    @u50
    private long mNativeContext;

    @u50
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @u50
    private native void nativeDispose();

    @u50
    private native void nativeFinalize();

    @u50
    private native int nativeGetDisposalMode();

    @u50
    private native int nativeGetDurationMs();

    @u50
    private native int nativeGetHeight();

    @u50
    private native int nativeGetTransparentPixelColor();

    @u50
    private native int nativeGetWidth();

    @u50
    private native int nativeGetXOffset();

    @u50
    private native int nativeGetYOffset();

    @u50
    private native boolean nativeHasTransparency();

    @u50
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // defpackage.ub0
    public int a() {
        return nativeGetHeight();
    }

    @Override // defpackage.ub0
    public void b(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    @Override // defpackage.ub0
    public int c() {
        return nativeGetWidth();
    }

    @Override // defpackage.ub0
    public int d() {
        return nativeGetXOffset();
    }

    @Override // defpackage.ub0
    public void dispose() {
        nativeDispose();
    }

    @Override // defpackage.ub0
    public int e() {
        return nativeGetYOffset();
    }

    public int f() {
        return nativeGetDisposalMode();
    }

    public void finalize() {
        nativeFinalize();
    }
}
