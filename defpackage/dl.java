package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: dl  reason: default package */
/* compiled from: DefaultImageHeaderParser */
public final class dl implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName(C0201.m82(10357)));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: dl$a */
    /* compiled from: DefaultImageHeaderParser */
    private static final class a implements c {
        private final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // defpackage.dl.c
        public long b(long j) {
            int min = (int) Math.min((long) this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        @Override // defpackage.dl.c
        public int c() throws c.a {
            return (e() << 8) | e();
        }

        @Override // defpackage.dl.c
        public int d(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // defpackage.dl.c
        public short e() throws c.a {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: dl$b */
    /* compiled from: DefaultImageHeaderParser */
    public static final class b {
        private final ByteBuffer a;

        public b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean c(int i, int i2) {
            return this.a.remaining() - i >= i2;
        }

        public short a(int i) {
            if (c(i, 2)) {
                return this.a.getShort(i);
            }
            return -1;
        }

        public int b(int i) {
            if (c(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }

        public int d() {
            return this.a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: dl$c */
    /* compiled from: DefaultImageHeaderParser */
    public interface c {

        /* renamed from: dl$c$a */
        /* compiled from: DefaultImageHeaderParser */
        public static final class a extends IOException {
            public a() {
                super(C0201.m82(4702));
            }
        }

        long b(long j) throws IOException;

        int c() throws IOException;

        int d(byte[] bArr, int i) throws IOException;

        short e() throws IOException;
    }

    /* renamed from: dl$d */
    /* compiled from: DefaultImageHeaderParser */
    private static final class d implements c {
        private final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // defpackage.dl.c
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

        @Override // defpackage.dl.c
        public int c() throws IOException {
            return (e() << 8) | e();
        }

        @Override // defpackage.dl.c
        public int d(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new c.a();
        }

        @Override // defpackage.dl.c
        public short e() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }
    }

    private static int d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private int e(c cVar, ni niVar) throws IOException {
        try {
            int c2 = cVar.c();
            boolean g = g(c2);
            String r4 = C0201.m82(10358);
            if (!g) {
                if (Log.isLoggable(r4, 3)) {
                    Log.d(r4, C0201.m82(10359) + c2);
                }
                return -1;
            }
            int i = i(cVar);
            if (i == -1) {
                if (Log.isLoggable(r4, 3)) {
                    Log.d(r4, C0201.m82(10360));
                }
                return -1;
            }
            byte[] bArr = (byte[]) niVar.e(i, byte[].class);
            try {
                return k(cVar, bArr, i);
            } finally {
                niVar.c(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType f(c cVar) throws IOException {
        try {
            int c2 = cVar.c();
            if (c2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int e = (c2 << 8) | cVar.e();
            if (e == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int e2 = (e << 8) | cVar.e();
            if (e2 == -1991225785) {
                cVar.b(21);
                try {
                    return cVar.e() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (e2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.b(4);
                if (((cVar.c() << 16) | cVar.c()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int c3 = (cVar.c() << 16) | cVar.c();
                if ((c3 & -256) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = c3 & 255;
                if (i == 88) {
                    cVar.b(4);
                    return (cVar.e() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    cVar.b(4);
                    return (cVar.e() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    private boolean h(byte[] bArr, int i) {
        boolean z = bArr != null && i > a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    private int i(c cVar) throws IOException {
        String r4;
        short e;
        int c2;
        long j;
        long b2;
        do {
            short e2 = cVar.e();
            r4 = C0201.m82(10361);
            if (e2 != 255) {
                if (Log.isLoggable(r4, 3)) {
                    Log.d(r4, C0201.m82(10362) + ((int) e2));
                }
                return -1;
            }
            e = cVar.e();
            if (e == 218) {
                return -1;
            }
            if (e == 217) {
                if (Log.isLoggable(r4, 3)) {
                    Log.d(r4, C0201.m82(10363));
                }
                return -1;
            }
            c2 = cVar.c() - 2;
            if (e == 225) {
                return c2;
            }
            j = (long) c2;
            b2 = cVar.b(j);
        } while (b2 == j);
        if (Log.isLoggable(r4, 3)) {
            Log.d(r4, C0201.m82(10364) + ((int) e) + C0201.m82(10365) + c2 + C0201.m82(10366) + b2);
        }
        return -1;
    }

    private static int j(b bVar) {
        ByteOrder byteOrder;
        short a2 = bVar.a(6);
        String r4 = C0201.m82(10367);
        if (a2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a2 != 19789) {
            if (Log.isLoggable(r4, 3)) {
                Log.d(r4, C0201.m82(10368) + ((int) a2));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i = 0; i < a3; i++) {
            int d2 = d(b2, i);
            short a4 = bVar.a(d2);
            if (a4 == 274) {
                short a5 = bVar.a(d2 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b3 = bVar.b(d2 + 4);
                    if (b3 >= 0) {
                        boolean isLoggable = Log.isLoggable(r4, 3);
                        String r10 = C0201.m82(10370);
                        if (isLoggable) {
                            Log.d(r4, C0201.m82(10371) + i + r10 + ((int) a4) + C0201.m82(10372) + ((int) a5) + C0201.m82(10373) + b3);
                        }
                        int i2 = b3 + b[a5];
                        if (i2 <= 4) {
                            int i3 = d2 + 8;
                            if (i3 < 0 || i3 > bVar.d()) {
                                if (Log.isLoggable(r4, 3)) {
                                    Log.d(r4, C0201.m82(10376) + i3 + r10 + ((int) a4));
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.d()) {
                                return bVar.a(i3);
                            } else {
                                if (Log.isLoggable(r4, 3)) {
                                    Log.d(r4, C0201.m82(10375) + ((int) a4));
                                }
                            }
                        } else if (Log.isLoggable(r4, 3)) {
                            Log.d(r4, C0201.m82(10374) + ((int) a5));
                        }
                    } else if (Log.isLoggable(r4, 3)) {
                        Log.d(r4, C0201.m82(10369));
                    }
                } else if (Log.isLoggable(r4, 3)) {
                    Log.d(r4, C0201.m82(10377) + ((int) a5));
                }
            }
        }
        return -1;
    }

    private int k(c cVar, byte[] bArr, int i) throws IOException {
        int d2 = cVar.d(bArr, i);
        String r2 = C0201.m82(10378);
        if (d2 != i) {
            if (Log.isLoggable(r2, 3)) {
                Log.d(r2, C0201.m82(10379) + i + C0201.m82(10380) + d2);
            }
            return -1;
        } else if (h(bArr, i)) {
            return j(new b(bArr, i));
        } else {
            if (Log.isLoggable(r2, 3)) {
                Log.d(r2, C0201.m82(10381));
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        ep.d(byteBuffer);
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        ep.d(inputStream);
        return f(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, ni niVar) throws IOException {
        ep.d(inputStream);
        d dVar = new d(inputStream);
        ep.d(niVar);
        return e(dVar, niVar);
    }
}
