package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: ng  reason: default package */
/* compiled from: GifDecoder */
public interface ng {

    /* renamed from: ng$a */
    /* compiled from: GifDecoder */
    public interface a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        int[] b(int i);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i);

        void f(int[] iArr);
    }

    int b();

    Bitmap c();

    void clear();

    void d();

    int e();

    void f(Bitmap.Config config);

    ByteBuffer g();

    void h();

    int i();

    int j();
}
