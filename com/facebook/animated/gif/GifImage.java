package com.facebook.animated.gif;

import com.facebook.soloader.SoLoader;
import defpackage.sb0;
import java.nio.ByteBuffer;
import vigqyno.C0201;

@u50
public class GifImage implements tb0, zb0 {
    private static volatile boolean a;
    @u50
    private long mNativeContext;

    @u50
    public GifImage() {
    }

    public static GifImage l(long j, int i) {
        n();
        z50.b(j != 0);
        return nativeCreateFromNativeMemory(j, i);
    }

    public static GifImage m(ByteBuffer byteBuffer) {
        n();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    private static synchronized void n() {
        synchronized (GifImage.class) {
            if (!a) {
                a = true;
                SoLoader.j(C0201.m82(21447));
            }
        }
    }

    @u50
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    @u50
    private static native GifImage nativeCreateFromNativeMemory(long j, int i);

    @u50
    private native void nativeDispose();

    @u50
    private native void nativeFinalize();

    @u50
    private native int nativeGetDuration();

    @u50
    private native GifFrame nativeGetFrame(int i);

    @u50
    private native int nativeGetFrameCount();

    @u50
    private native int[] nativeGetFrameDurations();

    @u50
    private native int nativeGetHeight();

    @u50
    private native int nativeGetLoopCount();

    @u50
    private native int nativeGetSizeInBytes();

    @u50
    private native int nativeGetWidth();

    private static sb0.b o(int i) {
        if (i == 0) {
            return sb0.b.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return sb0.b.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return sb0.b.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return sb0.b.DISPOSE_TO_PREVIOUS;
        }
        return sb0.b.DISPOSE_DO_NOT;
    }

    @Override // defpackage.tb0
    public int a() {
        return nativeGetHeight();
    }

    @Override // defpackage.tb0
    public int b() {
        return nativeGetFrameCount();
    }

    @Override // defpackage.tb0
    public int c() {
        return nativeGetWidth();
    }

    @Override // defpackage.tb0
    public int d() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // defpackage.tb0
    public sb0 e(int i) {
        GifFrame p = f(i);
        try {
            return new sb0(i, p.d(), p.e(), p.c(), p.a(), sb0.a.BLEND_WITH_PREVIOUS, o(p.f()));
        } finally {
            p.dispose();
        }
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // defpackage.zb0
    public tb0 g(long j, int i) {
        return l(j, i);
    }

    @Override // defpackage.tb0
    public boolean h() {
        return false;
    }

    @Override // defpackage.zb0
    public tb0 i(ByteBuffer byteBuffer) {
        return m(byteBuffer);
    }

    @Override // defpackage.tb0
    public int[] j() {
        return nativeGetFrameDurations();
    }

    @Override // defpackage.tb0
    public int k() {
        return nativeGetSizeInBytes();
    }

    /* renamed from: p */
    public GifFrame f(int i) {
        return nativeGetFrame(i);
    }

    @u50
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
