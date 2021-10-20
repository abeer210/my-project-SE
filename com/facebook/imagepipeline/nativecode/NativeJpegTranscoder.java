package com.facebook.imagepipeline.nativecode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

@u50
public class NativeJpegTranscoder implements rh0 {
    private boolean a;
    private int b;
    private boolean c;

    static {
        d.a();
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        d.a();
        boolean z = false;
        z50.b(i2 >= 1);
        z50.b(i2 <= 16);
        z50.b(i3 >= 0);
        z50.b(i3 <= 100);
        z50.b(th0.j(i));
        if (!(i2 == 8 && i == 0)) {
            z = true;
        }
        z50.c(z, C0201.m82(33462));
        z50.g(inputStream);
        z50.g(outputStream);
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        d.a();
        boolean z = false;
        z50.b(i2 >= 1);
        z50.b(i2 <= 16);
        z50.b(i3 >= 0);
        z50.b(i3 <= 100);
        z50.b(th0.i(i));
        if (!(i2 == 8 && i == 1)) {
            z = true;
        }
        z50.c(z, C0201.m82(33463));
        z50.g(inputStream);
        z50.g(outputStream);
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    @u50
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @u50
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // defpackage.rh0
    public String a() {
        return C0201.m82(33464);
    }

    @Override // defpackage.rh0
    public boolean b(af0 af0, sd0 sd0, rd0 rd0) {
        if (sd0 == null) {
            sd0 = sd0.a();
        }
        return th0.f(sd0, rd0, af0, this.a) < 8;
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.rh0
    public qh0 c(af0 af0, OutputStream outputStream, sd0 sd0, rd0 rd0, ob0 ob0, Integer num) throws IOException {
        if (num == null) {
            num = 85;
        }
        if (sd0 == null) {
            sd0 = sd0.a();
        }
        int b2 = ph0.b(sd0, rd0, af0, this.b);
        try {
            int f = th0.f(sd0, rd0, af0, this.a);
            int a2 = th0.a(b2);
            if (this.c) {
                f = a2;
            }
            InputStream w = af0.w();
            if (th0.a.contains(Integer.valueOf(af0.p()))) {
                f(w, outputStream, th0.d(sd0, af0), f, num.intValue());
            } else {
                e(w, outputStream, th0.e(sd0, af0), f, num.intValue());
            }
            s50.b(w);
            int i = 1;
            if (b2 != 1) {
                i = 0;
            }
            return new qh0(i);
        } catch (Throwable th) {
            s50.b(null);
            throw th;
        }
    }

    @Override // defpackage.rh0
    public boolean d(ob0 ob0) {
        return ob0 == nb0.a;
    }
}
