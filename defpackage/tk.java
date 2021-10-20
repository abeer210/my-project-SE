package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;

/* renamed from: tk  reason: default package */
/* compiled from: BitmapDrawableDecoder */
public class tk<DataType> implements k<DataType, BitmapDrawable> {
    private final k<DataType, Bitmap> a;
    private final Resources b;

    public tk(Resources resources, k<DataType, Bitmap> kVar) {
        ep.d(resources);
        this.b = resources;
        ep.d(kVar);
        this.a = kVar;
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(DataType datatype, i iVar) throws IOException {
        return this.a.a(datatype, iVar);
    }

    @Override // com.bumptech.glide.load.k
    public hi<BitmapDrawable> b(DataType datatype, int i, int i2, i iVar) throws IOException {
        return nl.d(this.b, this.a.b(datatype, i, i2, iVar));
    }
}
