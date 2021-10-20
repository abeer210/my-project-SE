package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.f;
import com.facebook.imagepipeline.memory.d;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vigqyno.C0201;

@TargetApi(21)
/* compiled from: DefaultDecoder */
public abstract class b implements f {
    private static final Class<?> d = b.class;
    private static final byte[] e = {-1, -39};
    private final d a;
    private final PreverificationHelper b;
    public final f<ByteBuffer> c;

    public b(d dVar, int i, f fVar) {
        this.b = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.a = dVar;
        this.c = fVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.c.a(ByteBuffer.allocate(16384));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0080 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:41|42|(1:44)) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        defpackage.f60.g(com.facebook.imagepipeline.platform.b.d, vigqyno.C0201.m82(5457), new java.lang.Object[]{r12});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r0 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a4, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a7, code lost:
        r6.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008d */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Unknown variable types count: 1 */
    private v60<Bitmap> d(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        Bitmap bitmap2;
        BitmapRegionDecoder bitmapRegionDecoder;
        PreverificationHelper preverificationHelper;
        z50.g(inputStream);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (rect != 0) {
            i = rect.width() / options.inSampleSize;
            i2 = rect.height() / options.inSampleSize;
        }
        boolean z = Build.VERSION.SDK_INT >= 26 && (preverificationHelper = this.b) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder2 = null;
        if (rect != 0 || !z) {
            if (rect != 0 && z) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            bitmap = (Bitmap) this.a.get(e(i, i2, options));
            if (bitmap == null) {
                throw new NullPointerException(C0201.m82(5458));
            }
        } else {
            options.inMutable = false;
            bitmap = null;
        }
        options.inBitmap = bitmap;
        if (Build.VERSION.SDK_INT >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        ByteBuffer b2 = this.c.b();
        if (b2 == null) {
            b2 = ByteBuffer.allocate(16384);
        }
        try {
            options.inTempStorage = b2.array();
            if (!(rect == 0 || bitmap == null)) {
                try {
                    bitmap.reconfigure(i, i2, options.inPreferredConfig);
                    bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, true);
                    rect = bitmapRegionDecoder.decodeRegion(rect, options);
                    bitmap2 = rect;
                    if (bitmapRegionDecoder != null) {
                        bitmapRegionDecoder.recycle();
                        bitmap2 = rect;
                    }
                } catch (IOException unused) {
                    bitmapRegionDecoder = null;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (bitmapRegionDecoder2 != null) {
                    }
                    throw th2;
                }
                if (bitmap2 == null) {
                    bitmap2 = BitmapFactory.decodeStream(inputStream, null, options);
                }
                this.c.a(b2);
                if (bitmap != null || bitmap == bitmap2) {
                    return v60.F(bitmap2, this.a);
                }
                this.a.a(bitmap);
                bitmap2.recycle();
                throw new IllegalStateException();
            }
            bitmap2 = null;
            if (bitmap2 == null) {
            }
            this.c.a(b2);
            if (bitmap != null) {
            }
            return v60.F(bitmap2, this.a);
        } catch (IllegalArgumentException e2) {
            if (bitmap != null) {
                this.a.a(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (decodeStream != null) {
                    v60<Bitmap> F = v60.F(decodeStream, qc0.b());
                    this.c.a(b2);
                    return F;
                }
                throw e2;
            } catch (IOException unused2) {
                throw e2;
            }
        } catch (RuntimeException e3) {
            if (bitmap != null) {
                this.a.a(bitmap);
            }
            throw e3;
        } catch (Throwable th3) {
            this.c.a(b2);
            throw th3;
        }
    }

    private static BitmapFactory.Options f(af0 af0, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = af0.y();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(af0.w(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // com.facebook.imagepipeline.platform.f
    public v60<Bitmap> a(af0 af0, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f = f(af0, config);
        boolean z = f.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d(af0.w(), f, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return a(af0, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e2;
        }
    }

    @Override // com.facebook.imagepipeline.platform.f
    public v60<Bitmap> b(af0 af0, Bitmap.Config config, Rect rect, int i) {
        return c(af0, config, rect, i, null);
    }

    @Override // com.facebook.imagepipeline.platform.f
    public v60<Bitmap> c(af0 af0, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean B = af0.B(i);
        BitmapFactory.Options f = f(af0, config);
        b70 w = af0.w();
        z50.g(w);
        if (af0.z() > i) {
            w = new a70(w, i);
        }
        if (!B) {
            w = new b70(w, e);
        }
        boolean z = f.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d(w, f, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return c(af0, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
            }
            throw e2;
        }
    }

    public abstract int e(int i, int i2, BitmapFactory.Options options);
}
