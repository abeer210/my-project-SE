package defpackage;

import android.graphics.Bitmap;

/* renamed from: oc0  reason: default package */
/* compiled from: PlatformBitmapFactory */
public abstract class oc0 {
    public v60<Bitmap> a(int i, int i2) {
        return b(i, i2, Bitmap.Config.ARGB_8888);
    }

    public v60<Bitmap> b(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config, null);
    }

    public v60<Bitmap> c(int i, int i2, Bitmap.Config config, Object obj) {
        return d(i, i2, config);
    }

    public abstract v60<Bitmap> d(int i, int i2, Bitmap.Config config);
}
