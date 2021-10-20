package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: cl  reason: default package */
/* compiled from: CenterInside */
public class cl extends yk {
    private static final byte[] b = C0201.m82(8133).getBytes(g.a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.yk
    public Bitmap c(qi qiVar, Bitmap bitmap, int i, int i2) {
        return sl.c(qiVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof cl;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -670243078;
    }
}
