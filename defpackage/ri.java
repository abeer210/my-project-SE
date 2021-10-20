package defpackage;

import android.graphics.Bitmap;

/* renamed from: ri  reason: default package */
/* compiled from: BitmapPoolAdapter */
public class ri implements qi {
    @Override // defpackage.qi
    public void a(int i) {
    }

    @Override // defpackage.qi
    public void b() {
    }

    @Override // defpackage.qi
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.qi
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.qi
    public Bitmap e(int i, int i2, Bitmap.Config config) {
        return d(i, i2, config);
    }
}
