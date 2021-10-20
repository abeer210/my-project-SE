package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;

/* renamed from: tl  reason: default package */
/* compiled from: UnitBitmapDecoder */
public final class tl implements k<Bitmap, Bitmap> {

    /* access modifiers changed from: private */
    /* renamed from: tl$a */
    /* compiled from: UnitBitmapDecoder */
    public static final class a implements hi<Bitmap> {
        private final Bitmap a;

        public a(Bitmap bitmap) {
            this.a = bitmap;
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

        @Override // defpackage.hi
        public void recycle() {
        }
    }

    /* renamed from: c */
    public hi<Bitmap> b(Bitmap bitmap, int i, int i2, i iVar) {
        return new a(bitmap);
    }

    /* renamed from: d */
    public boolean a(Bitmap bitmap, i iVar) {
        return true;
    }
}
