package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: qu2  reason: default package */
/* compiled from: ImageHeaderParser */
public class qu2 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    private static final byte[] b = "Exif\u0000\u0000".getBytes(Charset.forName(C0201.m82(10847)));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
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
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final b a;

    /* access modifiers changed from: private */
    /* renamed from: qu2$a */
    /* compiled from: ImageHeaderParser */
    public static class a {
        private final ByteBuffer a;

        public a(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public short a(int i) {
            return this.a.getShort(i);
        }

        public int b(int i) {
            return this.a.getInt(i);
        }

        public int c() {
            return this.a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: qu2$b */
    /* compiled from: ImageHeaderParser */
    public interface b {
        long b(long j) throws IOException;

        int c() throws IOException;

        int d(byte[] bArr, int i) throws IOException;

        short e() throws IOException;
    }

    /* renamed from: qu2$c */
    /* compiled from: ImageHeaderParser */
    private static class c implements b {
        private final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // defpackage.qu2.b
        public long b(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // defpackage.qu2.b
        public int c() throws IOException {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }

        @Override // defpackage.qu2.b
        public int d(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        @Override // defpackage.qu2.b
        public short e() throws IOException {
            return (short) (this.a.read() & 255);
        }
    }

    static {
        C0201.m83(qu2.class, 33);
    }

    public qu2(InputStream inputStream) {
        this.a = new c(inputStream);
    }

    private static int a(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    public static void b(k4 k4Var, int i2, int i3, String str) {
        String[] strArr = {C, v, d, r, y, B, j, h, u, A, g, w, l, s, q, o, z, t, i, e, m, k};
        try {
            k4 k4Var2 = new k4(str);
            for (int i4 = 0; i4 < 22; i4++) {
                String str2 = strArr[i4];
                String i5 = k4Var.i(str2);
                if (!TextUtils.isEmpty(i5)) {
                    k4Var2.T(str2, i5);
                }
            }
            k4Var2.T(f, String.valueOf(i2));
            k4Var2.T(x, String.valueOf(i3));
            k4Var2.T(n, D);
            k4Var2.Q();
        } catch (IOException e2) {
            Log.d(p, e2.getMessage());
        }
    }

    private static boolean d(int i2) {
        return (i2 & 65496) == 65496 || i2 == 19789 || i2 == 18761;
    }

    private boolean e(byte[] bArr, int i2) {
        boolean z2 = bArr != null && i2 > b.length;
        if (z2) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = b;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    return false;
                } else {
                    i3++;
                }
            }
        }
        return z2;
    }

    private int f() throws IOException {
        String r4;
        short e2;
        int c2;
        long j2;
        long b2;
        do {
            short e3 = this.a.e();
            r4 = C0201.m82(10848);
            if (e3 != 255) {
                if (Log.isLoggable(r4, 3)) {
                    Log.d(r4, C0201.m82(10849) + ((int) e3));
                }
                return -1;
            }
            e2 = this.a.e();
            if (e2 == 218) {
                return -1;
            }
            if (e2 == 217) {
                if (Log.isLoggable(r4, 3)) {
                    Log.d(r4, C0201.m82(10850));
                }
                return -1;
            }
            c2 = this.a.c() - 2;
            if (e2 == 225) {
                return c2;
            }
            j2 = (long) c2;
            b2 = this.a.b(j2);
        } while (b2 == j2);
        if (Log.isLoggable(r4, 3)) {
            Log.d(r4, C0201.m82(10851) + ((int) e2) + C0201.m82(10852) + c2 + C0201.m82(10853) + b2);
        }
        return -1;
    }

    private static int g(a aVar) {
        ByteOrder byteOrder;
        short a2 = aVar.a(6);
        String r3 = C0201.m82(10854);
        if (a2 == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable(r3, 3)) {
                Log.d(r3, C0201.m82(10855) + ((int) a2));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.d(byteOrder);
        int b2 = aVar.b(10) + 6;
        short a3 = aVar.a(b2);
        for (int i2 = 0; i2 < a3; i2++) {
            int a4 = a(b2, i2);
            short a5 = aVar.a(a4);
            if (a5 == 274) {
                short a6 = aVar.a(a4 + 2);
                if (a6 >= 1 && a6 <= 12) {
                    int b3 = aVar.b(a4 + 4);
                    if (b3 >= 0) {
                        boolean isLoggable = Log.isLoggable(r3, 3);
                        String r10 = C0201.m82(10857);
                        if (isLoggable) {
                            Log.d(r3, C0201.m82(10858) + i2 + r10 + ((int) a5) + C0201.m82(10859) + ((int) a6) + C0201.m82(10860) + b3);
                        }
                        int i3 = b3 + c[a6];
                        if (i3 <= 4) {
                            int i4 = a4 + 8;
                            if (i4 < 0 || i4 > aVar.c()) {
                                if (Log.isLoggable(r3, 3)) {
                                    Log.d(r3, C0201.m82(10863) + i4 + r10 + ((int) a5));
                                }
                            } else if (i3 >= 0 && i3 + i4 <= aVar.c()) {
                                return aVar.a(i4);
                            } else {
                                if (Log.isLoggable(r3, 3)) {
                                    Log.d(r3, C0201.m82(10862) + ((int) a5));
                                }
                            }
                        } else if (Log.isLoggable(r3, 3)) {
                            Log.d(r3, C0201.m82(10861) + ((int) a6));
                        }
                    } else if (Log.isLoggable(r3, 3)) {
                        Log.d(r3, C0201.m82(10856));
                    }
                } else if (Log.isLoggable(r3, 3)) {
                    Log.d(r3, C0201.m82(10864) + ((int) a6));
                }
            }
        }
        return -1;
    }

    private int h(byte[] bArr, int i2) throws IOException {
        int d2 = this.a.d(bArr, i2);
        String r3 = C0201.m82(10865);
        if (d2 != i2) {
            if (Log.isLoggable(r3, 3)) {
                Log.d(r3, C0201.m82(10866) + i2 + C0201.m82(10867) + d2);
            }
            return -1;
        } else if (e(bArr, i2)) {
            return g(new a(bArr, i2));
        } else {
            if (Log.isLoggable(r3, 3)) {
                Log.d(r3, C0201.m82(10868));
            }
            return -1;
        }
    }

    public int c() throws IOException {
        int c2 = this.a.c();
        boolean d2 = d(c2);
        String r4 = C0201.m82(10869);
        if (!d2) {
            if (Log.isLoggable(r4, 3)) {
                Log.d(r4, C0201.m82(10870) + c2);
            }
            return -1;
        }
        int f2 = f();
        if (f2 != -1) {
            return h(new byte[f2], f2);
        }
        if (Log.isLoggable(r4, 3)) {
            Log.d(r4, C0201.m82(10871));
        }
        return -1;
    }
}
