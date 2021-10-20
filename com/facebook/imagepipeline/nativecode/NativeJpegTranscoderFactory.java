package com.facebook.imagepipeline.nativecode;

@u50
public class NativeJpegTranscoderFactory implements sh0 {
    private final int a;
    private final boolean b;

    @u50
    public NativeJpegTranscoderFactory(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.sh0
    @u50
    public rh0 createImageTranscoder(ob0 ob0, boolean z) {
        if (ob0 != nb0.a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.a, this.b);
    }
}
