package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;

/* renamed from: ol  reason: default package */
/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class ol implements k<ParcelFileDescriptor, Bitmap> {
    private final fl a;

    public ol(fl flVar) {
        this.a = flVar;
    }

    /* renamed from: c */
    public hi<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, i iVar) throws IOException {
        return this.a.d(parcelFileDescriptor, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, i iVar) {
        return this.a.o(parcelFileDescriptor);
    }
}
