package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import vigqyno.C0201;

public final class l2 {
    private static final gy1 h = new gy1(C0201.m82(16642));
    private final byte[] a = new byte[8192];
    private final b0 b;
    private final String c;
    private final int d;
    private final long e;
    private final String f;
    private int g;

    public l2(b0 b0Var, String str, int i, long j, String str2) {
        this.b = b0Var;
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = str2;
        this.g = -1;
    }

    private final File n() {
        File y = this.b.y(this.c, this.d, this.e, this.f);
        if (!y.exists()) {
            y.mkdirs();
        }
        return y;
    }

    private final File o() throws IOException {
        File n = this.b.n(this.c, this.d, this.e, this.f);
        n.getParentFile().mkdirs();
        n.createNewFile();
        return n;
    }

    public final k2 a() throws IOException {
        String r0 = C0201.m82(16643);
        File n = this.b.n(this.c, this.d, this.e, this.f);
        if (n.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(n);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                String r1 = C0201.m82(16644);
                String property = properties.getProperty(r1);
                String r4 = C0201.m82(16645);
                if (property != null) {
                    String r3 = C0201.m82(16646);
                    if (properties.getProperty(r3) != null) {
                        try {
                            int parseInt = Integer.parseInt(properties.getProperty(r1));
                            String property2 = properties.getProperty(C0201.m82(16647));
                            long parseLong = Long.parseLong(properties.getProperty(C0201.m82(16648), r0));
                            long parseLong2 = Long.parseLong(properties.getProperty(C0201.m82(16649), r0));
                            int parseInt2 = Integer.parseInt(properties.getProperty(r3));
                            this.g = Integer.parseInt(properties.getProperty(C0201.m82(16650), C0201.m82(16651)));
                            return new k2(parseInt, property2, parseLong, parseLong2, parseInt2);
                        } catch (NumberFormatException e2) {
                            throw new t0(r4, e2);
                        }
                    }
                }
                throw new t0(r4);
            } catch (Throwable th) {
                ez1.a(th, th);
            }
        } else {
            throw new t0(C0201.m82(16652));
        }
        throw th;
    }

    public final void b(int i) throws IOException {
        Properties properties = new Properties();
        properties.put(C0201.m82(16653), C0201.m82(16654));
        properties.put(C0201.m82(16655), String.valueOf(i().length()));
        properties.put(C0201.m82(16656), String.valueOf(i));
        properties.put(C0201.m82(16657), String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final void c(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), C0201.m82(16658));
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final void d(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), C0201.m82(16659));
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.a);
                if (read > 0) {
                    randomAccessFile.write(this.a, 0, read);
                }
            } while (read == this.a.length);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final void e(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put(C0201.m82(16660), C0201.m82(16661));
        properties.put(C0201.m82(16662), str);
        properties.put(C0201.m82(16663), String.valueOf(j));
        properties.put(C0201.m82(16664), String.valueOf(j2));
        properties.put(C0201.m82(16665), String.valueOf(i));
        properties.put(C0201.m82(16666), String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final void f(byte[] bArr) throws IOException {
        this.g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format(C0201.m82(16667), Integer.valueOf(this.g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                ez1.a(th, th);
            }
            throw th;
        } catch (IOException e2) {
            throw new t0(C0201.m82(16668), e2);
        }
    }

    public final void g(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put(C0201.m82(16669), C0201.m82(16670));
        properties.put(C0201.m82(16671), String.valueOf(i));
        properties.put(C0201.m82(16672), String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File s = this.b.s(this.c, this.d, this.e, this.f);
            if (s.exists()) {
                s.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(s);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                ez1.a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            ez1.a(th, th2);
        }
    }

    public final void h(byte[] bArr, InputStream inputStream) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.a);
            while (read > 0) {
                fileOutputStream.write(this.a, 0, read);
                read = inputStream.read(this.a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final File i() {
        return new File(n(), String.format(C0201.m82(16673), Integer.valueOf(this.g)));
    }

    public final void j(int i) throws IOException {
        Properties properties = new Properties();
        properties.put(C0201.m82(16674), C0201.m82(16675));
        properties.put(C0201.m82(16676), String.valueOf(i));
        properties.put(C0201.m82(16677), String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final void k(byte[] bArr, int i) throws IOException {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final int l() throws IOException {
        File n = this.b.n(this.c, this.d, this.e, this.f);
        if (!n.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(n);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty(C0201.m82(16678), C0201.m82(16679))) == 4) {
                return -1;
            }
            String r1 = C0201.m82(16680);
            if (properties.getProperty(r1) != null) {
                return Integer.parseInt(properties.getProperty(r1)) + 1;
            }
            throw new t0(C0201.m82(16681));
        } catch (Throwable th) {
            ez1.a(th, th);
        }
        throw th;
    }

    public final boolean m() {
        File n = this.b.n(this.c, this.d, this.e, this.f);
        if (!n.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(n);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String r3 = C0201.m82(16682);
                if (properties.getProperty(r3) != null) {
                    return Integer.parseInt(properties.getProperty(r3)) == 4;
                }
                h.e(C0201.m82(16683), new Object[0]);
                return false;
            } catch (Throwable th) {
                ez1.a(th, th);
            }
        } catch (IOException e2) {
            h.e(C0201.m82(16684), e2);
            return false;
        }
        throw th;
    }
}
