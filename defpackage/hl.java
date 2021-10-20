package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: hl  reason: default package */
/* compiled from: DrawableTransformation */
public class hl implements m<Drawable> {
    private final m<Bitmap> b;
    private final boolean c;

    public hl(m<Bitmap> mVar, boolean z) {
        this.b = mVar;
        this.c = z;
    }

    private hi<Drawable> d(Context context, hi<Bitmap> hiVar) {
        return nl.d(context.getResources(), hiVar);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    public hi<Drawable> b(Context context, hi<Drawable> hiVar, int i, int i2) {
        qi f = c.c(context).f();
        Drawable drawable = hiVar.get();
        hi<Bitmap> a = gl.a(f, drawable, i, i2);
        if (a != null) {
            hi<Bitmap> b2 = this.b.b(context, a, i, i2);
            if (!b2.equals(a)) {
                return d(context, b2);
            }
            b2.recycle();
            return hiVar;
        } else if (!this.c) {
            return hiVar;
        } else {
            throw new IllegalArgumentException(C0201.m82(20116) + drawable + C0201.m82(20117));
        }
    }

    public m<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof hl) {
            return this.b.equals(((hl) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }
}
