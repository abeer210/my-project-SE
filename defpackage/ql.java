package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import vigqyno.C0201;

/* renamed from: ql  reason: default package */
/* compiled from: ResourceBitmapDecoder */
public class ql implements k<Uri, Bitmap> {
    private final am a;
    private final qi b;

    public ql(am amVar, qi qiVar) {
        this.a = amVar;
        this.b = qiVar;
    }

    /* renamed from: c */
    public hi<Bitmap> b(Uri uri, int i, int i2, i iVar) {
        hi<Drawable> c = this.a.b(uri, i, i2, iVar);
        if (c == null) {
            return null;
        }
        return gl.a(this.b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean a(Uri uri, i iVar) {
        return C0201.m82(1337).equals(uri.getScheme());
    }
}
