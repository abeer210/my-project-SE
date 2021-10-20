package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: GingerbreadPurgeableDecoder */
public class c extends DalvikPurgeableDecoder {
    private static Method d;
    private final j70 c = k70.i();

    private static MemoryFile i(v60<q60> v60, int i, byte[] bArr) throws IOException {
        Closeable closeable;
        Throwable th;
        a70 a70;
        s60 s60 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            s60 s602 = new s60(v60.w());
            try {
                a70 = new a70(s602, i);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    r50.a(a70, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    v60.s(v60);
                    s50.b(s602);
                    s50.b(a70);
                    s50.a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    closeable = null;
                    s60 = s602;
                    v60.s(v60);
                    s50.b(s60);
                    s50.b(a70);
                    s50.a(closeable, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                a70 = null;
                s60 = s602;
                v60.s(v60);
                s50.b(s60);
                s50.b(a70);
                s50.a(closeable, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            a70 = null;
            v60.s(v60);
            s50.b(s60);
            s50.b(a70);
            s50.a(closeable, true);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    private Bitmap j(v60<q60> v60, int i, byte[] bArr, BitmapFactory.Options options) {
        Throwable th;
        IOException e;
        MemoryFile memoryFile;
        MemoryFile memoryFile2 = null;
        try {
            memoryFile = i(v60, i, bArr);
            try {
                FileDescriptor l = l(memoryFile);
                if (this.c != null) {
                    Bitmap c2 = this.c.c(l, null, options);
                    z50.h(c2, C0201.m82(5343));
                    Bitmap bitmap = c2;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    return bitmap;
                }
                throw new IllegalStateException(C0201.m82(5344));
            } catch (IOException e2) {
                e = e2;
                try {
                    e60.a(e);
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    memoryFile2 = memoryFile;
                    if (memoryFile2 != null) {
                        memoryFile2.close();
                    }
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            memoryFile = null;
            e60.a(e);
            throw null;
        } catch (Throwable th3) {
            th = th3;
            if (memoryFile2 != null) {
            }
            throw th;
        }
    }

    private synchronized Method k() {
        if (d == null) {
            try {
                d = MemoryFile.class.getDeclaredMethod(C0201.m82(5345), new Class[0]);
            } catch (Exception e) {
                e60.a(e);
                throw null;
            }
        }
        return d;
    }

    private FileDescriptor l(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            e60.a(e);
            throw null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap d(v60<q60> v60, BitmapFactory.Options options) {
        return j(v60, v60.w().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap e(v60<q60> v60, int i, BitmapFactory.Options options) {
        return j(v60, i, DalvikPurgeableDecoder.f(v60, i) ? null : DalvikPurgeableDecoder.b, options);
    }
}
