package defpackage;

import android.graphics.Bitmap;
import vigqyno.C0201;

/* renamed from: xk  reason: default package */
/* compiled from: BitmapResource */
public class xk implements hi<Bitmap>, di {
    private final Bitmap a;
    private final qi b;

    public xk(Bitmap bitmap, qi qiVar) {
        ep.e(bitmap, C0201.m82(17561));
        this.a = bitmap;
        ep.e(qiVar, C0201.m82(17562));
        this.b = qiVar;
    }

    public static xk d(Bitmap bitmap, qi qiVar) {
        if (bitmap == null) {
            return null;
        }
        return new xk(bitmap, qiVar);
    }

    @Override // defpackage.hi
    public int a() {
        return fp.g(this.a);
    }

    @Override // defpackage.hi
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    /* renamed from: c */
    public Bitmap get() {
        return this.a;
    }

    @Override // defpackage.di
    public void initialize() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.hi
    public void recycle() {
        this.b.c(this.a);
    }
}
