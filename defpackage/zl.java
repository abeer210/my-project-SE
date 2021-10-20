package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: zl  reason: default package */
/* compiled from: NonOwnedDrawableResource */
public final class zl extends yl<Drawable> {
    private zl(Drawable drawable) {
        super(drawable);
    }

    public static hi<Drawable> d(Drawable drawable) {
        if (drawable != null) {
            return new zl(drawable);
        }
        return null;
    }

    @Override // defpackage.hi
    public int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<android.graphics.drawable.Drawable> */
    @Override // defpackage.hi
    public Class<Drawable> b() {
        return this.a.getClass();
    }

    @Override // defpackage.hi
    public void recycle() {
    }
}
