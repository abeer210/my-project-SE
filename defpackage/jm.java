package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;

/* renamed from: jm  reason: default package */
/* compiled from: GifDrawableTransformation */
public class jm implements m<gm> {
    private final m<Bitmap> b;

    public jm(m<Bitmap> mVar) {
        ep.d(mVar);
        this.b = mVar;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    public hi<gm> b(Context context, hi<gm> hiVar, int i, int i2) {
        gm gmVar = hiVar.get();
        hi<Bitmap> xkVar = new xk(gmVar.e(), c.c(context).f());
        hi<Bitmap> b2 = this.b.b(context, xkVar, i, i2);
        if (!xkVar.equals(b2)) {
            xkVar.recycle();
        }
        gmVar.m(this.b, b2.get());
        return hiVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof jm) {
            return this.b.equals(((jm) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }
}
