package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: UnpackingSoSource */
public abstract class n extends c {
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public final Context c;
    public String d;
    private final Map<String, Object> e = new HashMap();

    /* access modifiers changed from: package-private */
    /* compiled from: UnpackingSoSource */
    public class a implements Runnable {
        public final /* synthetic */ File a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ c c;
        public final /* synthetic */ File d;
        public final /* synthetic */ g e;

        public a(File file, byte[] bArr, c cVar, File file2, g gVar) {
            this.a = file;
            this.b = bArr;
            this.c = cVar;
            this.d = file2;
            this.e = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
            r2.addSuppressed(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
            r2.addSuppressed(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
            throw r5;
         */
        public void run() {
            String r0 = C0201.m82(13037);
            String r1 = C0201.m82(13038);
            String r2 = C0201.m82(13039);
            String r3 = C0201.m82(13040);
            try {
                Log.v(r3, C0201.m82(13041));
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, r2);
                randomAccessFile.write(this.b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(n.this.a, C0201.m82(13042)), r2);
                this.c.b(randomAccessFile2);
                randomAccessFile2.close();
                SysUtil.e(n.this.a);
                n.r(this.d, (byte) 1);
                try {
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } finally {
                Log.v(r3, r1 + n.this.a + r0);
                this.e.close();
            }
        }
    }

    /* compiled from: UnpackingSoSource */
    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: UnpackingSoSource */
    public static final class c {
        public final b[] a;

        public c(b[] bVarArr) {
            this.a = bVarArr;
        }

        public static final c a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    b[] bVarArr = new b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new c(bVarArr);
                }
                throw new RuntimeException(C0201.m82(12995));
            }
            throw new RuntimeException(C0201.m82(12996));
        }

        public final void b(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.a.length);
            int i = 0;
            while (true) {
                b[] bVarArr = this.a;
                if (i < bVarArr.length) {
                    dataOutput.writeUTF(bVarArr[i].a);
                    dataOutput.writeUTF(this.a[i].b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource */
    public static final class d implements Closeable {
        public final b a;
        public final InputStream b;

        public d(b bVar, InputStream inputStream) {
            this.a = bVar;
            this.b = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }
    }

    /* access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource */
    public static abstract class e implements Closeable {
        public abstract boolean a();

        public abstract d c() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource */
    public static abstract class f implements Closeable {
        public abstract c a() throws IOException;

        public abstract e c() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    static {
        C0201.m83(n.class, 63);
    }

    public n(Context context, String str) {
        super(l(context, str), 1);
        this.c = context;
    }

    private void h(b[] bVarArr) throws IOException {
        String[] list = this.a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(C0201.m82(20365)) && !str.equals(C0201.m82(20366)) && !str.equals(C0201.m82(20367)) && !str.equals(C0201.m82(20368))) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z && i2 < bVarArr.length) {
                        if (bVarArr[i2].a.equals(str)) {
                            z = true;
                        }
                        i2++;
                    }
                    if (!z) {
                        File file = new File(this.a, str);
                        Log.v(C0201.m82(20370), C0201.m82(20369) + file);
                        SysUtil.b(file);
                    }
                }
            }
            return;
        }
        throw new IOException(C0201.m82(20371) + this.a);
    }

    private void i(d dVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        String r0 = C0201.m82(20372);
        String r2 = C0201.m82(20374);
        Log.i(r2, C0201.m82(20373) + dVar.a.a);
        if (this.a.setWritable(true, true)) {
            File file = new File(this.a, dVar.a.a);
            try {
                randomAccessFile = new RandomAccessFile(file, r0);
            } catch (IOException e2) {
                Log.w(r2, C0201.m82(20375) + file + C0201.m82(20376), e2);
                SysUtil.b(file);
                randomAccessFile = new RandomAccessFile(file, r0);
            }
            try {
                int available = dVar.b.available();
                if (available > 1) {
                    SysUtil.c(randomAccessFile.getFD(), (long) available);
                }
                SysUtil.a(randomAccessFile, dVar.b, C0188.f24, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                throw new IOException(C0201.m82(20377) + file);
            } catch (IOException e3) {
                SysUtil.b(file);
                throw e3;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            throw new IOException(C0201.m82(20378) + this.a);
        }
    }

    private Object k(String str) {
        Object obj;
        synchronized (this.e) {
            obj = this.e.get(str);
            if (obj == null) {
                obj = new Object();
                this.e.put(str, obj);
            }
        }
        return obj;
    }

    public static File l(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + C0201.m82(20379) + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r2 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e1, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e9, code lost:
        if (r0 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ef, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f0, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f3, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f6, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fb, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fc, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0100, code lost:
        throw r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    private boolean o(g gVar, int i2, byte[] bArr) throws IOException {
        String str = m;
        File file = new File(this.a, l);
        String str2 = o;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str2);
        byte b2 = randomAccessFile.readByte();
        if (b2 != 1) {
            Log.v(str, i + this.a + k);
            b2 = 0;
        }
        randomAccessFile.close();
        File file2 = new File(this.a, p);
        c cVar = null;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, str2);
        int length = (int) randomAccessFile2.length();
        byte[] bArr2 = new byte[length];
        if (randomAccessFile2.read(bArr2) != length) {
            Log.v(str, j);
            b2 = 0;
        }
        if (!Arrays.equals(bArr2, bArr)) {
            Log.v(str, q);
            b2 = 0;
        }
        if (b2 != 0) {
            if ((i2 & 2) != 0) {
            }
            randomAccessFile2.close();
            if (cVar != null) {
                return false;
            }
            a aVar = new a(file2, bArr, cVar, file, gVar);
            if ((i2 & 1) != 0) {
                new Thread(aVar, r + this.a.getName()).start();
            } else {
                aVar.run();
            }
            return true;
        }
        Log.v(str, n);
        r(file, (byte) 0);
        f m2 = m();
        cVar = m2.a();
        e c2 = m2.c();
        p(b2, cVar, c2);
        if (c2 != null) {
            c2.close();
        }
        if (m2 != null) {
            m2.close();
        }
        randomAccessFile2.close();
        if (cVar != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e5, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        throw r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c A[Catch:{ all -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073 A[Catch:{ all -> 0x00e5 }] */
    private void p(byte b2, c cVar, e eVar) throws IOException {
        c cVar2;
        String r1 = C0201.m82(20381);
        Log.v(r1, C0201.m82(20380) + getClass().getName());
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.a, C0201.m82(20382)), C0201.m82(20383));
        if (b2 == 1) {
            try {
                cVar2 = c.a(randomAccessFile);
            } catch (Exception e2) {
                Log.i(r1, C0201.m82(20384), e2);
            }
            if (cVar2 == null) {
                cVar2 = new c(new b[0]);
            }
            h(cVar.a);
            byte[] bArr = new byte[32768];
            while (eVar.a()) {
                d c2 = eVar.c();
                boolean z = true;
                int i2 = 0;
                while (z) {
                    try {
                        if (i2 >= cVar2.a.length) {
                            break;
                        }
                        if (cVar2.a[i2].a.equals(c2.a.a) && cVar2.a[i2].b.equals(c2.a.b)) {
                            z = false;
                        }
                        i2++;
                    } catch (Throwable th) {
                        if (c2 != null) {
                            try {
                                c2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (z) {
                    i(c2, bArr);
                }
                if (c2 != null) {
                    c2.close();
                }
            }
            randomAccessFile.close();
            Log.v(r1, C0201.m82(20385) + getClass().getName());
        }
        cVar2 = null;
        if (cVar2 == null) {
        }
        h(cVar.a);
        byte[] bArr2 = new byte[32768];
        while (eVar.a()) {
        }
        randomAccessFile.close();
        Log.v(r1, C0201.m82(20385) + getClass().getName());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r5 = move-exception;
     */
    public static void r(File file, byte b2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, C0201.m82(20386));
        randomAccessFile.seek(0);
        randomAccessFile.write(b2);
        randomAccessFile.setLength(randomAccessFile.getFilePointer());
        randomAccessFile.getFD().sync();
        randomAccessFile.close();
    }

    @Override // com.facebook.soloader.l, com.facebook.soloader.c
    public int a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int f2;
        synchronized (k(str)) {
            f2 = f(str, i2, this.a, threadPolicy);
        }
        return f2;
    }

    @Override // com.facebook.soloader.l
    public void b(int i2) throws IOException {
        String r0 = C0201.m82(20387);
        String r1 = C0201.m82(20388);
        String r2 = C0201.m82(20389);
        String r3 = C0201.m82(20390);
        SysUtil.h(this.a);
        g a2 = g.a(new File(this.a, C0201.m82(20391)));
        try {
            Log.v(r3, C0201.m82(20392) + this.a);
            if (o(a2, i2, j())) {
                a2 = null;
            } else {
                Log.i(r3, C0201.m82(20393) + this.a);
            }
            if (a2 == null) {
                Log.v(r3, r2 + this.a + r1);
            }
        } finally {
            if (a2 != null) {
                Log.v(r3, r0 + this.a);
                a2.close();
            } else {
                Log.v(r3, r2 + this.a + r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        throw r2;
     */
    public byte[] j() throws IOException {
        Parcel obtain = Parcel.obtain();
        f m2 = m();
        b[] bVarArr = m2.a().a;
        obtain.writeByte((byte) 1);
        obtain.writeInt(bVarArr.length);
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            obtain.writeString(bVarArr[i2].a);
            obtain.writeString(bVarArr[i2].b);
        }
        if (m2 != null) {
            m2.close();
        }
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public abstract f m() throws IOException;

    public synchronized void n(String str) throws IOException {
        synchronized (k(str)) {
            this.d = str;
            b(2);
        }
    }

    public void q(String[] strArr) {
    }
}
