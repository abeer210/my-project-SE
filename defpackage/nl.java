package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: nl  reason: default package */
/* compiled from: LazyBitmapDrawableResource */
public final class nl implements hi<BitmapDrawable>, di {
    private final Resources a;
    private final hi<Bitmap> b;

    private nl(Resources resources, hi<Bitmap> hiVar) {
        ep.d(resources);
        this.a = resources;
        ep.d(hiVar);
        this.b = hiVar;
    }

    public static hi<BitmapDrawable> d(Resources resources, hi<Bitmap> hiVar) {
        if (hiVar == null) {
            return null;
        }
        return new nl(resources, hiVar);
    }

    @Override // defpackage.hi
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.hi
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    /* renamed from: c */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.a, this.b.get());
    }

    @Override // defpackage.di
    public void initialize() {
        hi<Bitmap> hiVar = this.b;
        if (hiVar instanceof di) {
            ((di) hiVar).initialize();
        }
    }

    @Override // defpackage.hi
    public void recycle() {
        this.b.recycle();
    }
}
