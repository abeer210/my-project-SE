package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ml  reason: default package */
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class ml implements k<InputStream, Bitmap> {
    private final wk a = new wk();

    /* renamed from: c */
    public hi<Bitmap> b(InputStream inputStream, int i, int i2, i iVar) throws IOException {
        return this.a.b(ImageDecoder.createSource(vo.b(inputStream)), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) throws IOException {
        return true;
    }
}
