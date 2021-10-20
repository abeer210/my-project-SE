package com.huawei.hms.update.a;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.a.a.a;
import com.huawei.hms.update.a.a.c;
import com.huawei.hms.update.b.b;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import vigqyno.C0201;

/* compiled from: UpdateDownload */
public class d implements a {
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    private final Context a;
    private final com.huawei.hms.update.b.d b = new b();
    private final a c = new a();
    private com.huawei.hms.update.a.a.b d;
    private File e;

    static {
        C0201.m83(d.class, 47);
    }

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public Context b() {
        return this.a;
    }

    private synchronized void a(com.huawei.hms.update.a.a.b bVar) {
        this.d = bVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void a(int i2, int i3, int i4) {
        if (this.d != null) {
            this.d.a(i2, i3, i4, this.e);
        }
    }

    @Override // com.huawei.hms.update.a.a.a
    public void a() {
        HMSLog.i(C0201.m82(14138), C0201.m82(14139));
        a((com.huawei.hms.update.a.a.b) null);
        this.b.b();
    }

    @Override // com.huawei.hms.update.a.a.a
    public void a(com.huawei.hms.update.a.a.b bVar, c cVar) {
        Checker.checkNonNull(bVar, C0201.m82(14140));
        String r0 = C0201.m82(14141);
        HMSLog.i(r0, C0201.m82(14142));
        a(bVar);
        if (cVar == null || !cVar.a()) {
            HMSLog.e(r0, C0201.m82(14151));
            a(2201, 0, 0);
            return;
        }
        if (!C0201.m82(14143).equals(Environment.getExternalStorageState())) {
            HMSLog.e(r0, C0201.m82(14144));
            a(2204, 0, 0);
            return;
        }
        String str = cVar.b;
        if (TextUtils.isEmpty(str)) {
            HMSLog.e(r0, C0201.m82(14145));
            a(2201, 0, 0);
            return;
        }
        Context context = this.a;
        File localFile = UpdateProvider.getLocalFile(context, str + C0201.m82(14146));
        this.e = localFile;
        if (localFile == null) {
            HMSLog.e(r0, C0201.m82(14147));
            a(2204, 0, 0);
            return;
        }
        File parentFile = localFile.getParentFile();
        if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
            HMSLog.e(r0, C0201.m82(14150));
            a(2201, 0, 0);
        } else if (parentFile.getUsableSpace() < ((long) (cVar.d * 3))) {
            HMSLog.e(r0, C0201.m82(14148));
            a(2203, 0, 0);
        } else {
            try {
                a(cVar);
            } catch (com.huawei.hms.update.b.a unused) {
                HMSLog.w(r0, C0201.m82(14149));
                a(2101, 0, 0);
            }
        }
    }

    public void a(c cVar) throws com.huawei.hms.update.b.a {
        String str = h;
        HMSLog.i(str, i);
        b bVar = null;
        try {
            String str2 = cVar.b;
            if (TextUtils.isEmpty(str2)) {
                HMSLog.e(str, f);
                a(2201, 0, 0);
            } else {
                this.c.a(b(), str2);
                if (!this.c.b(cVar.c, cVar.d, cVar.e)) {
                    this.c.a(cVar.c, cVar.d, cVar.e);
                    bVar = a(this.e, cVar.d, str2);
                } else if (this.c.b() != this.c.a()) {
                    bVar = a(this.e, cVar.d, str2);
                    bVar.a((long) this.c.b());
                } else if (FileUtil.verifyHash(cVar.e, this.e)) {
                    a(2000, 0, 0);
                } else {
                    this.c.a(cVar.c, cVar.d, cVar.e);
                    bVar = a(this.e, cVar.d, str2);
                }
                int a2 = this.b.a(cVar.c, bVar, this.c.b(), this.c.a(), this.a);
                if (a2 != 200 && a2 != 206) {
                    HMSLog.e(str, j + a2);
                    a(2201, 0, 0);
                } else if (!FileUtil.verifyHash(cVar.e, this.e)) {
                    a(2202, 0, 0);
                } else {
                    a(2000, 0, 0);
                    this.b.a();
                    IOUtils.closeQuietly((OutputStream) bVar);
                    return;
                }
            }
            this.b.a();
            IOUtils.closeQuietly((OutputStream) bVar);
        } catch (IOException e2) {
            HMSLog.e(str, g + e2.getMessage());
            a(2201, 0, 0);
        } catch (Throwable th) {
            this.b.a();
            IOUtils.closeQuietly((OutputStream) null);
            throw th;
        }
    }

    private b a(File file, final int i2, final String str) throws IOException {
        return new b(file, i2) {
            /* class com.huawei.hms.update.a.d.AnonymousClass1 */
            private long d = 0;
            private int e = d.this.c.b();

            private void a(int i) {
                d.this.c.a(d.this.b(), i, str);
                d.this.a((d) 2100, i, i2);
            }

            @Override // java.io.OutputStream, com.huawei.hms.update.a.b
            public void write(byte[] bArr, int i, int i2) throws IOException {
                super.write(bArr, i, i2);
                int i3 = this.e + i2;
                this.e = i3;
                if (i3 <= 209715200) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (Math.abs(currentTimeMillis - this.d) > 1000) {
                        this.d = currentTimeMillis;
                        a(this.e);
                    }
                    int i4 = this.e;
                    if (i4 == i2) {
                        a(i4);
                    }
                }
            }
        };
    }
}
