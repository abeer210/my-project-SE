package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: bl  reason: default package */
/* compiled from: CenterCrop */
public class bl extends yk {
    private static final byte[] b = C0201.m82(5731).getBytes(g.a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.yk
    public Bitmap c(qi qiVar, Bitmap bitmap, int i, int i2) {
        return sl.b(qiVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof bl;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -599754482;
    }
}
