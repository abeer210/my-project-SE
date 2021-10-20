package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import vigqyno.C0201;

/* renamed from: hh0  reason: default package */
/* compiled from: BasePostprocessor */
public abstract class hh0 implements kh0 {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;

    private static void d(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.a(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // defpackage.kh0
    public v60<Bitmap> b(Bitmap bitmap, oc0 oc0) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        v60<Bitmap> d = oc0.d(width, height, config);
        try {
            f(d.w(), bitmap);
            return v60.n(d);
        } finally {
            v60.s(d);
        }
    }

    @Override // defpackage.kh0
    public m40 c() {
        return null;
    }

    public void e(Bitmap bitmap) {
    }

    public void f(Bitmap bitmap, Bitmap bitmap2) {
        d(bitmap, bitmap2);
        e(bitmap);
    }

    @Override // defpackage.kh0
    public String getName() {
        return C0201.m82(5588);
    }
}
