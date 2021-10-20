package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.memory.b;
import com.facebook.imagepipeline.memory.c;
import com.facebook.imagepipeline.platform.f;
import com.facebook.imageutils.a;
import com.facebook.soloader.d;
import java.util.Locale;
import vigqyno.C0201;

@u50
public abstract class DalvikPurgeableDecoder implements f {
    public static final byte[] b = {-1, -39};
    private final b a = c.a();

    /* access modifiers changed from: private */
    @d
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        public static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
    }

    public static boolean f(v60<q60> v60, int i) {
        q60 w = v60.w();
        if (i >= 2 && w.e(i - 2) == -1 && w.e(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public static BitmapFactory.Options g(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @u50
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.f
    public v60<Bitmap> a(af0 af0, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options g = g(af0.y(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(g, colorSpace);
        }
        v60<q60> m = af0.m();
        z50.g(m);
        try {
            return h(d(m, g));
        } finally {
            v60.s(m);
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public v60<Bitmap> b(af0 af0, Bitmap.Config config, Rect rect, int i) {
        return c(af0, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.f
    public v60<Bitmap> c(af0 af0, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options g = g(af0.y(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(g, colorSpace);
        }
        v60<q60> m = af0.m();
        z50.g(m);
        try {
            return h(e(m, i, g));
        } finally {
            v60.s(m);
        }
    }

    public abstract Bitmap d(v60<q60> v60, BitmapFactory.Options options);

    public abstract Bitmap e(v60<q60> v60, int i, BitmapFactory.Options options);

    public v60<Bitmap> h(Bitmap bitmap) {
        z50.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.a.g(bitmap)) {
                return v60.F(bitmap, this.a.e());
            }
            int e = a.e(bitmap);
            bitmap.recycle();
            throw new td0(String.format(Locale.US, C0201.m82(7393), Integer.valueOf(e), Integer.valueOf(this.a.b()), Long.valueOf(this.a.f()), Integer.valueOf(this.a.c()), Integer.valueOf(this.a.d())));
        } catch (Exception e2) {
            bitmap.recycle();
            e60.a(e2);
            throw null;
        }
    }
}
