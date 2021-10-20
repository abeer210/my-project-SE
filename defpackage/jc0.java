package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imageutils.a;

@TargetApi(21)
/* renamed from: jc0  reason: default package */
/* compiled from: ArtBitmapFactory */
public class jc0 extends oc0 {
    private final d a;
    private final ud0 b;

    public jc0(d dVar, ud0 ud0) {
        this.a = dVar;
        this.b = ud0;
    }

    @Override // defpackage.oc0
    public v60<Bitmap> d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmap = (Bitmap) this.a.get(a.d(i, i2, config));
        z50.b(bitmap.getAllocationByteCount() >= (i * i2) * a.c(config));
        bitmap.reconfigure(i, i2, config);
        return this.b.c(bitmap, this.a);
    }
}
