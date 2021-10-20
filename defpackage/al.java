package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: al  reason: default package */
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class al implements k<ByteBuffer, Bitmap> {
    private final wk a = new wk();

    /* renamed from: c */
    public hi<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, i iVar) throws IOException {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) throws IOException {
        return true;
    }
}
