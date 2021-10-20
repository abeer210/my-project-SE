package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.Pair;
import androidx.core.util.f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* compiled from: BitmapUtil */
public final class a {
    private static final f<ByteBuffer> a = new f<>(12);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imageutils.a$a  reason: collision with other inner class name */
    /* compiled from: BitmapUtil */
    public static /* synthetic */ class C0038a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            a[Bitmap.Config.RGB_565.ordinal()] = 4;
            a[Bitmap.Config.RGBA_F16.ordinal()] = 5;
        }
    }

    public static Pair<Integer, Integer> a(InputStream inputStream) {
        z50.g(inputStream);
        ByteBuffer b = a.b();
        if (b == null) {
            b = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = b.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
            }
            return pair;
        } finally {
            a.a(b);
        }
    }

    public static b b(InputStream inputStream) {
        z50.g(inputStream);
        ByteBuffer b = a.b();
        if (b == null) {
            b = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = b.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            return new b(options.outWidth, options.outHeight, colorSpace);
        } finally {
            a.a(b);
        }
    }

    public static int c(Bitmap.Config config) {
        int i = C0038a.a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 8;
        }
        throw new UnsupportedOperationException(C0201.m82(10352));
    }

    public static int d(int i, int i2, Bitmap.Config config) {
        return i * i2 * c(config);
    }

    @SuppressLint({"NewApi"})
    public static int e(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
