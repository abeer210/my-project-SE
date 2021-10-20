package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;
import vigqyno.C0201;

/* renamed from: yk  reason: default package */
/* compiled from: BitmapTransformation */
public abstract class yk implements m<Bitmap> {
    @Override // com.bumptech.glide.load.m
    public final hi<Bitmap> b(Context context, hi<Bitmap> hiVar, int i, int i2) {
        if (fp.r(i, i2)) {
            qi f = c.c(context).f();
            Bitmap bitmap = hiVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(f, bitmap, i, i2);
            return bitmap.equals(c) ? hiVar : xk.d(c, f);
        }
        throw new IllegalArgumentException(C0201.m82(20046) + i + C0201.m82(20047) + i2 + C0201.m82(20048));
    }

    public abstract Bitmap c(qi qiVar, Bitmap bitmap, int i, int i2);
}
