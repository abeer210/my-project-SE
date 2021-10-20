package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: zk  reason: default package */
/* compiled from: ByteBufferBitmapDecoder */
public class zk implements k<ByteBuffer, Bitmap> {
    private final fl a;

    public zk(fl flVar) {
        this.a = flVar;
    }

    /* renamed from: c */
    public hi<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, i iVar) throws IOException {
        return this.a.f(vo.f(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return this.a.q(byteBuffer);
    }
}
