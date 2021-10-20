package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: vk  reason: default package */
/* compiled from: BitmapEncoder */
public class vk implements l<Bitmap> {
    public static final h<Integer> b = h.f(C0201.m82(12972), 90);
    public static final h<Bitmap.CompressFormat> c = h.e(C0201.m82(12973));
    private final ni a;

    public vk(ni niVar) {
        this.a = niVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, i iVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.c(c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.l
    public c b(i iVar) {
        return c.TRANSFORMED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r6 == null) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e6 A[SYNTHETIC, Splitter:B:34:0x00e6] */
    /* renamed from: c */
    public boolean a(hi<Bitmap> hiVar, File file, i iVar) {
        Throwable th;
        IOException e;
        String r0 = C0201.m82(12974);
        Bitmap bitmap = hiVar.get();
        Bitmap.CompressFormat d = d(bitmap, iVar);
        hp.c(C0201.m82(12975), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), d);
        try {
            long b2 = ap.b();
            int intValue = ((Integer) iVar.c(b)).intValue();
            boolean z = false;
            ug ugVar = null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    ugVar = this.a != null ? new ug(fileOutputStream, this.a) : fileOutputStream;
                    bitmap.compress(d, intValue, ugVar);
                    ugVar.close();
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    ugVar = fileOutputStream;
                    try {
                        if (Log.isLoggable(r0, 3)) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (ugVar != null) {
                            try {
                                ugVar.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ugVar = fileOutputStream;
                    if (ugVar != null) {
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                if (Log.isLoggable(r0, 3)) {
                    Log.d(r0, C0201.m82(12976), e);
                }
            }
            try {
                ugVar.close();
            } catch (IOException unused2) {
            }
            if (Log.isLoggable(r0, 2)) {
                Log.v(r0, C0201.m82(12977) + d + C0201.m82(12978) + fp.g(bitmap) + C0201.m82(12979) + ap.a(b2) + C0201.m82(12980) + iVar.c(c) + C0201.m82(12981) + bitmap.hasAlpha());
            }
            return z;
        } finally {
            hp.d();
        }
    }
}
