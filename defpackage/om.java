package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import java.io.ByteArrayOutputStream;

/* renamed from: om  reason: default package */
/* compiled from: BitmapBytesTranscoder */
public class om implements sm<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public om() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // defpackage.sm
    public hi<byte[]> a(hi<Bitmap> hiVar, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        hiVar.get().compress(this.a, this.b, byteArrayOutputStream);
        hiVar.recycle();
        return new wl(byteArrayOutputStream.toByteArray());
    }

    public om(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}
