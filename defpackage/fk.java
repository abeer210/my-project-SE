package defpackage;

import android.util.Log;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: fk  reason: default package */
/* compiled from: StreamEncoder */
public class fk implements d<InputStream> {
    private final ni a;

    public fk(ni niVar) {
        this.a = niVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054 A[SYNTHETIC, Splitter:B:28:0x0054] */
    /* renamed from: c */
    public boolean a(InputStream inputStream, File file, i iVar) {
        Throwable th;
        IOException e;
        String r8 = C0201.m82(15245);
        byte[] bArr = (byte[]) this.a.e(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        if (Log.isLoggable(r8, 3)) {
                        }
                        if (fileOutputStream != null) {
                        }
                        this.a.c(bArr);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.a.c(bArr);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                    }
                    this.a.c(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            z = true;
            try {
                fileOutputStream2.close();
            } catch (IOException unused2) {
            }
        } catch (IOException e3) {
            e = e3;
            if (Log.isLoggable(r8, 3)) {
                Log.d(r8, C0201.m82(15246), e);
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            this.a.c(bArr);
            return z;
        }
        this.a.c(bArr);
        return z;
    }
}
