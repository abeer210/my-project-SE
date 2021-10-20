package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: jl  reason: default package */
/* compiled from: FitCenter */
public class jl extends yk {
    private static final byte[] b = C0201.m82(24796).getBytes(g.a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.yk
    public Bitmap c(qi qiVar, Bitmap bitmap, int i, int i2) {
        return sl.e(qiVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof jl;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return 1572326941;
    }
}
