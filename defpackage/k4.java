package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: k4  reason: default package */
/* compiled from: ExifInterface */
public class k4 {
    private static final byte[] A = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static SimpleDateFormat B;
    public static final String[] C = {C0201.m82(22584), C0201.m82(22585), C0201.m82(22586), C0201.m82(22587), C0201.m82(22588), C0201.m82(22589), C0201.m82(22590), C0201.m82(22591), C0201.m82(22592), C0201.m82(22593), C0201.m82(22594), C0201.m82(22595), C0201.m82(22596)};
    public static final int[] D = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] E = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final e[] F = {new e(C0201.m82(22597), 254, 4), new e(C0201.m82(22598), 255, 4), new e(C0201.m82(22599), 256, 3, 4), new e(C0201.m82(22600), 257, 3, 4), new e(C0201.m82(22601), 258, 3), new e(C0201.m82(22602), 259, 3), new e(C0201.m82(22603), 262, 3), new e(C0201.m82(22604), 270, 2), new e(C0201.m82(22605), 271, 2), new e(C0201.m82(22606), 272, 2), new e(C0201.m82(22607), 273, 3, 4), new e(C0201.m82(22608), 274, 3), new e(C0201.m82(22609), 277, 3), new e(C0201.m82(22610), 278, 3, 4), new e(C0201.m82(22611), 279, 3, 4), new e(C0201.m82(22612), 282, 5), new e(C0201.m82(22613), 283, 5), new e(C0201.m82(22614), 284, 3), new e(C0201.m82(22615), 296, 3), new e(C0201.m82(22616), 301, 3), new e(C0201.m82(22617), 305, 2), new e(C0201.m82(22618), 306, 2), new e(C0201.m82(22619), 315, 2), new e(C0201.m82(22620), 318, 5), new e(C0201.m82(22621), 319, 5), new e(C0201.m82(22622), 330, 4), new e(C0201.m82(22623), 513, 4), new e(C0201.m82(22624), 514, 4), new e(C0201.m82(22625), 529, 5), new e(C0201.m82(22626), 530, 3), new e(C0201.m82(22627), 531, 3), new e(C0201.m82(22628), 532, 5), new e(C0201.m82(22629), 33432, 2), new e(C0201.m82(22630), 34665, 4), new e(C0201.m82(22631), 34853, 4), new e(C0201.m82(22632), 4, 4), new e(C0201.m82(22633), 5, 4), new e(C0201.m82(22634), 6, 4), new e(C0201.m82(22635), 7, 4), new e(C0201.m82(22636), 23, 3), new e(C0201.m82(22637), 46, 7), new e(C0201.m82(22638), C0188.f17, 1)};
    private static final e[] G = {new e(C0201.m82(22639), 33434, 5), new e(C0201.m82(22640), 33437, 5), new e(C0201.m82(22641), 34850, 3), new e(C0201.m82(22642), 34852, 2), new e(C0201.m82(22643), 34855, 3), new e(C0201.m82(22644), 34856, 7), new e(C0201.m82(22645), 36864, 2), new e(C0201.m82(22646), 36867, 2), new e(C0201.m82(22647), 36868, 2), new e(C0201.m82(22648), 37121, 7), new e(C0201.m82(22649), 37122, 5), new e(C0201.m82(22650), 37377, 10), new e(C0201.m82(22651), 37378, 5), new e(C0201.m82(22652), 37379, 10), new e(C0201.m82(22653), 37380, 10), new e(C0201.m82(22654), 37381, 5), new e(C0201.m82(22655), 37382, 5), new e(C0201.m82(22656), 37383, 3), new e(C0201.m82(22657), 37384, 3), new e(C0201.m82(22658), 37385, 3), new e(C0201.m82(22659), 37386, 5), new e(C0201.m82(22660), 37396, 3), new e(C0201.m82(22661), 37500, 7), new e(C0201.m82(22662), 37510, 7), new e(C0201.m82(22663), 37520, 2), new e(C0201.m82(22664), 37521, 2), new e(C0201.m82(22665), 37522, 2), new e(C0201.m82(22666), 40960, 7), new e(C0201.m82(22667), 40961, 3), new e(C0201.m82(22668), 40962, 3, 4), new e(C0201.m82(22669), 40963, 3, 4), new e(C0201.m82(22670), 40964, 2), new e(C0201.m82(22671), 40965, 4), new e(C0201.m82(22672), 41483, 5), new e(C0201.m82(22673), 41484, 7), new e(C0201.m82(22674), 41486, 5), new e(C0201.m82(22675), 41487, 5), new e(C0201.m82(22676), 41488, 3), new e(C0201.m82(22677), 41492, 3), new e(C0201.m82(22678), 41493, 5), new e(C0201.m82(22679), 41495, 3), new e(C0201.m82(22680), 41728, 7), new e(C0201.m82(22681), 41729, 7), new e(C0201.m82(22682), 41730, 7), new e(C0201.m82(22683), 41985, 3), new e(C0201.m82(22684), 41986, 3), new e(C0201.m82(22685), 41987, 3), new e(C0201.m82(22686), 41988, 5), new e(C0201.m82(22687), 41989, 3), new e(C0201.m82(22688), 41990, 3), new e(C0201.m82(22689), 41991, 3), new e(C0201.m82(22690), 41992, 3), new e(C0201.m82(22691), 41993, 3), new e(C0201.m82(22692), 41994, 3), new e(C0201.m82(22693), 41995, 7), new e(C0201.m82(22694), 41996, 3), new e(C0201.m82(22695), 42016, 2), new e(C0201.m82(22696), 50706, 1), new e(C0201.m82(22697), 50720, 3, 4)};
    private static final e[] H = {new e(C0201.m82(22698), 0, 1), new e(C0201.m82(22699), 1, 2), new e(C0201.m82(22700), 2, 5), new e(C0201.m82(22701), 3, 2), new e(C0201.m82(22702), 4, 5), new e(C0201.m82(22703), 5, 1), new e(C0201.m82(22704), 6, 5), new e(C0201.m82(22705), 7, 5), new e(C0201.m82(22706), 8, 2), new e(C0201.m82(22707), 9, 2), new e(C0201.m82(22708), 10, 2), new e(C0201.m82(22709), 11, 5), new e(C0201.m82(22710), 12, 2), new e(C0201.m82(22711), 13, 5), new e(C0201.m82(22712), 14, 2), new e(C0201.m82(22713), 15, 5), new e(C0201.m82(22714), 16, 2), new e(C0201.m82(22715), 17, 5), new e(C0201.m82(22716), 18, 2), new e(C0201.m82(22717), 19, 2), new e(C0201.m82(22718), 20, 5), new e(C0201.m82(22719), 21, 2), new e(C0201.m82(22720), 22, 5), new e(C0201.m82(22721), 23, 2), new e(C0201.m82(22722), 24, 5), new e(C0201.m82(22723), 25, 2), new e(C0201.m82(22724), 26, 5), new e(C0201.m82(22725), 27, 7), new e(C0201.m82(22726), 28, 7), new e(C0201.m82(22727), 29, 2), new e(C0201.m82(22728), 30, 3)};
    private static final e[] I = {new e(C0201.m82(22729), 1, 2)};
    private static final e[] J = {new e(C0201.m82(22730), 254, 4), new e(C0201.m82(22731), 255, 4), new e(C0201.m82(22732), 256, 3, 4), new e(C0201.m82(22733), 257, 3, 4), new e(C0201.m82(22734), 258, 3), new e(C0201.m82(22735), 259, 3), new e(C0201.m82(22736), 262, 3), new e(C0201.m82(22737), 270, 2), new e(C0201.m82(22738), 271, 2), new e(C0201.m82(22739), 272, 2), new e(C0201.m82(22740), 273, 3, 4), new e(C0201.m82(22741), 274, 3), new e(C0201.m82(22742), 277, 3), new e(C0201.m82(22743), 278, 3, 4), new e(C0201.m82(22744), 279, 3, 4), new e(C0201.m82(22745), 282, 5), new e(C0201.m82(22746), 283, 5), new e(C0201.m82(22747), 284, 3), new e(C0201.m82(22748), 296, 3), new e(C0201.m82(22749), 301, 3), new e(C0201.m82(22750), 305, 2), new e(C0201.m82(22751), 306, 2), new e(C0201.m82(22752), 315, 2), new e(C0201.m82(22753), 318, 5), new e(C0201.m82(22754), 319, 5), new e(C0201.m82(22755), 330, 4), new e(C0201.m82(22756), 513, 4), new e(C0201.m82(22757), 514, 4), new e(C0201.m82(22758), 529, 5), new e(C0201.m82(22759), 530, 3), new e(C0201.m82(22760), 531, 3), new e(C0201.m82(22761), 532, 5), new e(C0201.m82(22762), 33432, 2), new e(C0201.m82(22763), 34665, 4), new e(C0201.m82(22764), 34853, 4), new e(C0201.m82(22765), 50706, 1), new e(C0201.m82(22766), 50720, 3, 4)};
    private static final e K = new e(C0201.m82(22767), 273, 3);
    private static final e[] L = {new e(C0201.m82(22768), 256, 7), new e(C0201.m82(22769), 8224, 4), new e(C0201.m82(22770), 8256, 4)};
    private static final e[] M = {new e(C0201.m82(22771), 257, 4), new e(C0201.m82(22772), 258, 4)};
    private static final e[] N = {new e(C0201.m82(22773), 4371, 3)};
    private static final e[] O;
    public static final e[][] P;
    private static final e[] Q = {new e(C0201.m82(22775), 330, 4), new e(C0201.m82(22776), 34665, 4), new e(C0201.m82(22777), 34853, 4), new e(C0201.m82(22778), 40965, 4), new e(C0201.m82(22779), 8224, 1), new e(C0201.m82(22780), 8256, 1)};
    private static final e R = new e(C0201.m82(22781), 513, 4);
    private static final e S = new e(C0201.m82(22782), 514, 4);
    private static final HashMap<Integer, e>[] T;
    private static final HashMap<String, e>[] U;
    private static final HashSet<String> V = new HashSet<>(Arrays.asList(C0201.m82(22783), C0201.m82(22784), C0201.m82(22785), C0201.m82(22786), C0201.m82(22787)));
    private static final HashMap<Integer, Integer> W = new HashMap<>();
    public static final Charset X;
    public static final byte[] Y;
    private static final byte[] Z = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(X);
    private static final Pattern a0 = Pattern.compile(C0201.m82(22792));
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    public static final String ae = null;
    public static final String af = null;
    public static final String ag = null;
    public static final String ah = null;
    public static final String ai = null;
    public static final String aj = null;
    public static final String ak = null;
    public static final String al = null;
    public static final String am = null;
    public static final String an = null;
    public static final String ao = null;
    public static final String ap = null;
    public static final String aq = null;
    public static final String ar = null;
    public static final String as = null;
    public static final String at = null;
    public static final String au = null;
    private static final boolean s = Log.isLoggable(C0201.m82(22583), 3);
    public static final int[] t = {8, 8, 8};
    public static final int[] u = {8};
    public static final byte[] v = {-1, -40, -1};
    private static final byte[] w = {102, 116, 121, 112};
    private static final byte[] x = {109, 105, 102, 49};
    private static final byte[] y = {104, 101, 105, 99};
    private static final byte[] z = {79, 76, 89, 77, 80, 0};
    private String a;
    private FileDescriptor b;
    private AssetManager.AssetInputStream c;
    private int d;
    private final HashMap<String, d>[] e;
    private Set<Integer> f;
    private ByteOrder g;
    private boolean h;
    private int i;
    private int j;
    private byte[] k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    /* access modifiers changed from: package-private */
    /* renamed from: k4$a */
    /* compiled from: ExifInterface */
    public class a extends MediaDataSource {
        public long a;
        public final /* synthetic */ b b;

        public a(k4 k4Var, b bVar) {
            this.b = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                if (this.a != j) {
                    if (this.a >= 0 && j >= this.a + ((long) this.b.available())) {
                        return -1;
                    }
                    this.b.seek(j);
                    this.a = j;
                }
                if (i2 > this.b.available()) {
                    i2 = this.b.available();
                }
                int read = this.b.read(bArr, i, i2);
                if (read >= 0) {
                    this.a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.a = -1;
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k4$c */
    /* compiled from: ExifInterface */
    public static class c extends FilterOutputStream {
        private final OutputStream a;
        private ByteOrder b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.a = outputStream;
            this.b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public void c(int i) throws IOException {
            this.a.write(i);
        }

        public void h(int i) throws IOException {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.a.write((i >>> 0) & 255);
                this.a.write((i >>> 8) & 255);
                this.a.write((i >>> 16) & 255);
                this.a.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.a.write((i >>> 24) & 255);
                this.a.write((i >>> 16) & 255);
                this.a.write((i >>> 8) & 255);
                this.a.write((i >>> 0) & 255);
            }
        }

        public void k(short s) throws IOException {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.a.write((s >>> 0) & 255);
                this.a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.a.write((s >>> 8) & 255);
                this.a.write((s >>> 0) & 255);
            }
        }

        public void m(long j) throws IOException {
            h((int) j);
        }

        public void n(int i) throws IOException {
            k((short) i);
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(byte[] bArr) throws IOException {
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream, java.io.FilterOutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.a.write(bArr, i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k4$d */
    /* compiled from: ExifInterface */
    public static class d {
        public final int a;
        public final int b;
        public final byte[] c;

        public d(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        public static d a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(k4.X);
                return new d(1, bytes.length, bytes);
            }
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(k4.D[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(k4.D[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(k4.D[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(k4.X);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j, ByteOrder byteOrder) {
            return g(new long[]{j}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(k4.D[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(k4.D[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i, ByteOrder byteOrder) {
            return k(new int[]{i}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(k4.D[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o = o(byteOrder);
            if (o == null) {
                throw new NumberFormatException(C0201.m82(19858));
            } else if (o instanceof String) {
                return Double.parseDouble((String) o);
            } else {
                boolean z = o instanceof long[];
                String r2 = C0201.m82(19856);
                if (z) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException(r2);
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException(r2);
                } else if (o instanceof double[]) {
                    double[] dArr = (double[]) o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException(r2);
                } else if (o instanceof f[]) {
                    f[] fVarArr = (f[]) o;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException(r2);
                } else {
                    throw new NumberFormatException(C0201.m82(19857));
                }
            }
        }

        public int m(ByteOrder byteOrder) {
            Object o = o(byteOrder);
            if (o == null) {
                throw new NumberFormatException(C0201.m82(19861));
            } else if (o instanceof String) {
                return Integer.parseInt((String) o);
            } else {
                boolean z = o instanceof long[];
                String r2 = C0201.m82(19859);
                if (z) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(r2);
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(r2);
                } else {
                    throw new NumberFormatException(C0201.m82(19860));
                }
            }
        }

        public String n(ByteOrder byteOrder) {
            Object o = o(byteOrder);
            if (o == null) {
                return null;
            }
            if (o instanceof String) {
                return (String) o;
            }
            StringBuilder sb = new StringBuilder();
            boolean z = o instanceof long[];
            String r3 = C0201.m82(19862);
            int i = 0;
            if (z) {
                long[] jArr = (long[]) o;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(r3);
                    }
                }
                return sb.toString();
            } else if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(r3);
                    }
                }
                return sb.toString();
            } else if (o instanceof double[]) {
                double[] dArr = (double[]) o;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(r3);
                    }
                }
                return sb.toString();
            } else if (!(o instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) o;
                while (i < fVarArr.length) {
                    sb.append(fVarArr[i].a);
                    sb.append('/');
                    sb.append(fVarArr[i].b);
                    i++;
                    if (i != fVarArr.length) {
                        sb.append(r3);
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:138:0x01ad A[SYNTHETIC, Splitter:B:138:0x01ad] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01ba A[SYNTHETIC, Splitter:B:146:0x01ba] */
        public Object o(ByteOrder byteOrder) {
            Throwable th;
            IOException e;
            b bVar;
            byte b2;
            String r0 = C0201.m82(19863);
            String r1 = C0201.m82(19864);
            b bVar2 = null;
            try {
                bVar = new b(this.c);
                try {
                    bVar.h(byteOrder);
                    boolean z = true;
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            if (this.c.length != 1 || this.c[0] < 0 || this.c[0] > 1) {
                                String str = new String(this.c, k4.X);
                                try {
                                    bVar.close();
                                } catch (IOException e2) {
                                    Log.e(r1, r0, e2);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (this.c[0] + 48)});
                            try {
                                bVar.close();
                            } catch (IOException e3) {
                                Log.e(r1, r0, e3);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.b >= k4.E.length) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < k4.E.length) {
                                        if (this.c[i2] != k4.E[i2]) {
                                            z = false;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                if (z) {
                                    i = k4.E.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < this.b && (b2 = this.c[i]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            String sb2 = sb.toString();
                            try {
                                bVar.close();
                            } catch (IOException e4) {
                                Log.e(r1, r0, e4);
                            }
                            return sb2;
                        case 3:
                            int[] iArr = new int[this.b];
                            while (i < this.b) {
                                iArr[i] = bVar.readUnsignedShort();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e5) {
                                Log.e(r1, r0, e5);
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.b];
                            while (i < this.b) {
                                jArr[i] = bVar.c();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e6) {
                                Log.e(r1, r0, e6);
                            }
                            return jArr;
                        case 5:
                            f[] fVarArr = new f[this.b];
                            while (i < this.b) {
                                fVarArr[i] = new f(bVar.c(), bVar.c());
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e7) {
                                Log.e(r1, r0, e7);
                            }
                            return fVarArr;
                        case 8:
                            int[] iArr2 = new int[this.b];
                            while (i < this.b) {
                                iArr2[i] = bVar.readShort();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e8) {
                                Log.e(r1, r0, e8);
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.b];
                            while (i < this.b) {
                                iArr3[i] = bVar.readInt();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e9) {
                                Log.e(r1, r0, e9);
                            }
                            return iArr3;
                        case 10:
                            f[] fVarArr2 = new f[this.b];
                            while (i < this.b) {
                                fVarArr2[i] = new f((long) bVar.readInt(), (long) bVar.readInt());
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e10) {
                                Log.e(r1, r0, e10);
                            }
                            return fVarArr2;
                        case 11:
                            double[] dArr = new double[this.b];
                            while (i < this.b) {
                                dArr[i] = (double) bVar.readFloat();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e11) {
                                Log.e(r1, r0, e11);
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.b];
                            while (i < this.b) {
                                dArr2[i] = bVar.readDouble();
                                i++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException e12) {
                                Log.e(r1, r0, e12);
                            }
                            return dArr2;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException e13) {
                                Log.e(r1, r0, e13);
                            }
                            return null;
                    }
                } catch (IOException e14) {
                    e = e14;
                    try {
                        Log.w(r1, C0201.m82(19865), e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e15) {
                                Log.e(r1, r0, e15);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar2 = bVar;
                        if (bVar2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (IOException e16) {
                e = e16;
                bVar = null;
                Log.w(r1, C0201.m82(19865), e);
                if (bVar != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                if (bVar2 != null) {
                    try {
                        bVar2.close();
                    } catch (IOException e17) {
                        Log.e(r1, r0, e17);
                    }
                }
                throw th;
            }
        }

        public int p() {
            return k4.D[this.a] * this.b;
        }

        public String toString() {
            return C0201.m82(19866) + k4.C[this.a] + C0201.m82(19867) + this.c.length + C0201.m82(19868);
        }

        public d(int i, int i2, long j, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k4$f */
    /* compiled from: ExifInterface */
    public static class f {
        public final long a;
        public final long b;

        public f(double d) {
            this((long) (d * 10000.0d), 10000);
        }

        public double a() {
            double d = (double) this.a;
            double d2 = (double) this.b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.a + C0201.m82(19454) + this.b;
        }

        public f(long j, long j2) {
            if (j2 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j;
            this.b = j2;
        }
    }

    static {
        C0201.m83(k4.class, 70);
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        e[] eVarArr = {new e(C0201.m82(22774), 55, 3)};
        O = eVarArr;
        e[] eVarArr2 = F;
        P = new e[][]{eVarArr2, G, H, I, J, eVarArr2, L, M, N, eVarArr};
        e[][] eVarArr3 = P;
        T = new HashMap[eVarArr3.length];
        U = new HashMap[eVarArr3.length];
        Charset forName = Charset.forName(C0201.m82(22788));
        X = forName;
        Y = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(22789));
        B = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(C0201.m82(22790)));
        for (int i2 = 0; i2 < P.length; i2++) {
            T[i2] = new HashMap<>();
            U[i2] = new HashMap<>();
            e[] eVarArr4 = P[i2];
            for (e eVar : eVarArr4) {
                T[i2].put(Integer.valueOf(eVar.a), eVar);
                U[i2].put(eVar.b, eVar);
            }
        }
        W.put(Integer.valueOf(Q[0].a), 5);
        W.put(Integer.valueOf(Q[1].a), 1);
        W.put(Integer.valueOf(Q[2].a), 2);
        W.put(Integer.valueOf(Q[3].a), 3);
        W.put(Integer.valueOf(Q[4].a), 7);
        W.put(Integer.valueOf(Q[5].a), 8);
        Pattern.compile(C0201.m82(22791));
    }

    public k4(String str) throws IOException {
        this.e = new HashMap[P.length];
        this.f = new HashSet(P.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            z(str);
            return;
        }
        throw new NullPointerException(C0201.m82(22794));
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0097 A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    private boolean A(byte[] bArr) throws IOException {
        Throwable th;
        Exception e2;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                bVar2.h(ByteOrder.BIG_ENDIAN);
                long readInt = (long) bVar2.readInt();
                byte[] bArr2 = new byte[4];
                bVar2.read(bArr2);
                if (!Arrays.equals(bArr2, w)) {
                    bVar2.close();
                    return false;
                }
                long j2 = 16;
                if (readInt == 1) {
                    readInt = bVar2.readLong();
                    if (readInt < 16) {
                        bVar2.close();
                        return false;
                    }
                } else {
                    j2 = 8;
                }
                if (readInt > ((long) bArr.length)) {
                    readInt = (long) bArr.length;
                }
                long j3 = readInt - j2;
                if (j3 < 8) {
                    bVar2.close();
                    return false;
                }
                byte[] bArr3 = new byte[4];
                boolean z2 = false;
                boolean z3 = false;
                for (long j4 = 0; j4 < j3 / 4; j4++) {
                    if (bVar2.read(bArr3) != 4) {
                        bVar2.close();
                        return false;
                    }
                    if (j4 != 1) {
                        if (Arrays.equals(bArr3, x)) {
                            z2 = true;
                        } else if (Arrays.equals(bArr3, y)) {
                            z3 = true;
                        }
                        if (z2 && z3) {
                            bVar2.close();
                            return true;
                        }
                    }
                }
                bVar2.close();
                return false;
            } catch (Exception e3) {
                e2 = e3;
                bVar = bVar2;
                try {
                    if (s) {
                    }
                    if (bVar != null) {
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                if (bVar != null) {
                }
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            if (s) {
                Log.d(ai, aq, e2);
            }
            if (bVar != null) {
                bVar.close();
            }
            return false;
        }
    }

    private static boolean B(byte[] bArr) throws IOException {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = v;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean C(byte[] bArr) throws IOException {
        b bVar = new b(bArr);
        ByteOrder L2 = L(bVar);
        this.g = L2;
        bVar.h(L2);
        short readShort = bVar.readShort();
        bVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean D(byte[] bArr) throws IOException {
        byte[] bytes = C0201.m82(22795).getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean E(byte[] bArr) throws IOException {
        b bVar = new b(bArr);
        ByteOrder L2 = L(bVar);
        this.g = L2;
        bVar.h(L2);
        short readShort = bVar.readShort();
        bVar.close();
        return readShort == 85;
    }

    private static boolean F(FileDescriptor fileDescriptor) throws IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean G(HashMap hashMap) throws IOException {
        d dVar;
        int m2;
        d dVar2 = (d) hashMap.get(C0201.m82(22796));
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.g);
            if (Arrays.equals(t, iArr)) {
                return true;
            }
            if (this.d == 3 && (dVar = (d) hashMap.get(C0201.m82(22797))) != null && (((m2 = dVar.m(this.g)) == 1 && Arrays.equals(iArr, u)) || (m2 == 6 && Arrays.equals(iArr, t)))) {
                return true;
            }
        }
        if (!s) {
            return false;
        }
        Log.d(C0201.m82(22798), C0201.m82(22799));
        return false;
    }

    private boolean H(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(C0201.m82(22800));
        d dVar2 = (d) hashMap.get(C0201.m82(22801));
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.g) <= 512 && dVar2.m(this.g) <= 512;
    }

    private void I(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            for (int i2 = 0; i2 < P.length; i2++) {
                try {
                    this.e[i2] = new HashMap<>();
                } catch (IOException e2) {
                    this.r = false;
                    if (s) {
                        Log.w(C0201.m82(22802), C0201.m82(22803), e2);
                    }
                    a();
                    if (!s) {
                        return;
                    }
                } catch (Throwable th) {
                    a();
                    if (s) {
                        K();
                    }
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = p(bufferedInputStream);
            b bVar = new b(bufferedInputStream);
            switch (this.d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    s(bVar);
                    break;
                case 4:
                    n(bVar, 0, 0);
                    break;
                case 7:
                    q(bVar);
                    break;
                case 9:
                    r(bVar);
                    break;
                case 10:
                    t(bVar);
                    break;
                case 12:
                    m(bVar);
                    break;
            }
            V(bVar);
            this.r = true;
            a();
            if (!s) {
                return;
            }
            K();
            return;
        }
        throw new NullPointerException(C0201.m82(22804));
    }

    private void J(b bVar, int i2) throws IOException {
        ByteOrder L2 = L(bVar);
        this.g = L2;
        bVar.h(L2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i3 = this.d;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(C0201.m82(22807) + readInt);
            }
            int i4 = readInt - 8;
            if (i4 > 0 && bVar.skipBytes(i4) != i4) {
                throw new IOException(C0201.m82(22806) + i4);
            }
            return;
        }
        throw new IOException(C0201.m82(22805) + Integer.toHexString(readUnsignedShort));
    }

    private void K() {
        for (int i2 = 0; i2 < this.e.length; i2++) {
            String r2 = C0201.m82(22810);
            Log.d(r2, C0201.m82(22808) + i2 + C0201.m82(22809) + this.e[i2].size());
            for (Map.Entry<String, d> entry : this.e[i2].entrySet()) {
                d value = entry.getValue();
                Log.d(r2, C0201.m82(22811) + entry.getKey() + C0201.m82(22812) + value.toString() + C0201.m82(22813) + value.n(this.g) + C0201.m82(22814));
            }
        }
    }

    private ByteOrder L(b bVar) throws IOException {
        short readShort = bVar.readShort();
        String r1 = C0201.m82(22815);
        if (readShort == 18761) {
            if (s) {
                Log.d(r1, C0201.m82(22818));
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (s) {
                Log.d(r1, C0201.m82(22816));
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException(C0201.m82(22817) + Integer.toHexString(readShort));
        }
    }

    private void M(byte[] bArr, int i2) throws IOException {
        b bVar = new b(bArr);
        J(bVar, bArr.length);
        N(bVar, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03e3, code lost:
        if (vigqyno.C0201.m82(22844).equals(r25.b) != false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03f6, code lost:
        if (r9.n(r27.g).contains(vigqyno.C0201.m82(22845)) == false) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03fe, code lost:
        if (r26.equals(r25.b) == false) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0409, code lost:
        if (r9.m(r27.g) != 65535) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x040b, code lost:
        r27.d = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0414, code lost:
        if (((long) r28.peek()) == r24) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0416, code lost:
        r28.seek(r24);
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0183  */
    private void N(b bVar, int i2) throws IOException {
        String str;
        long j2;
        long j3;
        boolean z2;
        short s2;
        short s3;
        String str2;
        String str3;
        e eVar;
        int i3;
        int i4;
        int i5;
        int i6 = i2;
        this.f.add(Integer.valueOf(bVar.d));
        if (bVar.d + 2 <= bVar.c) {
            short readShort = bVar.readShort();
            boolean z3 = s;
            String r6 = C0201.m82(22819);
            if (z3) {
                Log.d(r6, C0201.m82(22820) + ((int) readShort));
            }
            if (bVar.d + (readShort * 12) <= bVar.c && readShort > 0) {
                char c2 = 0;
                short s4 = 0;
                while (s4 < readShort) {
                    int readUnsignedShort = bVar.readUnsignedShort();
                    int readUnsignedShort2 = bVar.readUnsignedShort();
                    int readInt = bVar.readInt();
                    long peek = ((long) bVar.peek()) + 4;
                    e eVar2 = T[i6].get(Integer.valueOf(readUnsignedShort));
                    if (s) {
                        Object[] objArr = new Object[5];
                        objArr[c2] = Integer.valueOf(i2);
                        objArr[1] = Integer.valueOf(readUnsignedShort);
                        objArr[2] = eVar2 != null ? eVar2.b : null;
                        objArr[3] = Integer.valueOf(readUnsignedShort2);
                        objArr[4] = Integer.valueOf(readInt);
                        Log.d(r6, String.format(C0201.m82(22821), objArr));
                    }
                    if (eVar2 == null) {
                        if (s) {
                            Log.d(r6, C0201.m82(22822) + readUnsignedShort);
                        }
                    } else if (readUnsignedShort2 <= 0 || readUnsignedShort2 >= D.length) {
                        j2 = peek;
                        if (s) {
                            Log.d(r6, C0201.m82(22826) + readUnsignedShort2);
                        }
                        z2 = false;
                        j3 = 0;
                        if (z2) {
                            bVar.seek(j2);
                            s3 = readShort;
                            str2 = r6;
                            s2 = s4;
                        } else {
                            String r5 = C0201.m82(22827);
                            if (j3 > 4) {
                                int readInt2 = bVar.readInt();
                                s3 = readShort;
                                if (s) {
                                    StringBuilder sb = new StringBuilder();
                                    s2 = s4;
                                    sb.append(C0201.m82(22828));
                                    sb.append(readInt2);
                                    Log.d(r6, sb.toString());
                                } else {
                                    s2 = s4;
                                }
                                int i7 = this.d;
                                if (i7 == 7) {
                                    if (C0201.m82(22829).equals(eVar2.b)) {
                                        this.n = readInt2;
                                    } else if (i6 == 6) {
                                        if (C0201.m82(22830).equals(eVar2.b)) {
                                            this.o = readInt2;
                                            this.p = readInt;
                                            d j4 = d.j(6, this.g);
                                            i3 = readUnsignedShort2;
                                            i4 = readInt;
                                            d f2 = d.f((long) this.o, this.g);
                                            d f3 = d.f((long) this.p, this.g);
                                            this.e[4].put(r5, j4);
                                            this.e[4].put(C0201.m82(22831), f2);
                                            this.e[4].put(C0201.m82(22832), f3);
                                        }
                                    }
                                    i3 = readUnsignedShort2;
                                    i4 = readInt;
                                } else {
                                    i3 = readUnsignedShort2;
                                    i4 = readInt;
                                    if (i7 == 10) {
                                        if (C0201.m82(22833).equals(eVar2.b)) {
                                            this.q = readInt2;
                                        }
                                    }
                                }
                                long j5 = (long) readInt2;
                                eVar = eVar2;
                                str3 = r5;
                                if (j5 + j3 <= ((long) bVar.c)) {
                                    bVar.seek(j5);
                                } else {
                                    if (s) {
                                        Log.d(r6, C0201.m82(22834) + readInt2);
                                    }
                                    bVar.seek(j2);
                                    str2 = r6;
                                }
                            } else {
                                s3 = readShort;
                                eVar = eVar2;
                                str3 = r5;
                                s2 = s4;
                                i3 = readUnsignedShort2;
                                i4 = readInt;
                            }
                            Integer num = W.get(Integer.valueOf(readUnsignedShort));
                            if (s) {
                                Log.d(r6, C0201.m82(22835) + num + C0201.m82(22836) + j3);
                            }
                            if (num != null) {
                                long j6 = -1;
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        j6 = bVar.c();
                                    } else if (i3 == 8) {
                                        i5 = bVar.readShort();
                                    } else if (i3 == 9 || i3 == 13) {
                                        i5 = bVar.readInt();
                                    }
                                    if (s) {
                                        Log.d(r6, String.format(C0201.m82(22837), Long.valueOf(j6), eVar.b));
                                    }
                                    if (j6 > 0 || j6 >= ((long) bVar.c)) {
                                        if (s) {
                                            Log.d(r6, C0201.m82(22841) + j6);
                                        }
                                    } else if (!this.f.contains(Integer.valueOf((int) j6))) {
                                        bVar.seek(j6);
                                        N(bVar, num.intValue());
                                    } else if (s) {
                                        Log.d(r6, C0201.m82(22838) + num + C0201.m82(22839) + j6 + C0201.m82(22840));
                                    }
                                    bVar.seek(j2);
                                    str2 = r6;
                                } else {
                                    i5 = bVar.readUnsignedShort();
                                }
                                j6 = (long) i5;
                                if (s) {
                                }
                                if (j6 > 0) {
                                }
                                if (s) {
                                }
                                bVar.seek(j2);
                                str2 = r6;
                            } else {
                                int peek2 = bVar.peek();
                                byte[] bArr = new byte[((int) j3)];
                                bVar.readFully(bArr);
                                str2 = r6;
                                d dVar = new d(i3, i4, (long) peek2, bArr);
                                this.e[i2].put(eVar.b, dVar);
                                if (C0201.m82(22842).equals(eVar.b)) {
                                    this.d = 3;
                                }
                                if (!C0201.m82(22843).equals(eVar.b)) {
                                }
                            }
                            s4 = (short) (s2 + 1);
                            r6 = str2;
                            readShort = s3;
                            c2 = 0;
                            i6 = i2;
                        }
                        s4 = (short) (s2 + 1);
                        r6 = str2;
                        readShort = s3;
                        c2 = 0;
                        i6 = i2;
                    } else if (eVar2.a(readUnsignedShort2)) {
                        if (readUnsignedShort2 == 7) {
                            readUnsignedShort2 = eVar2.c;
                        }
                        j2 = peek;
                        j3 = ((long) D[readUnsignedShort2]) * ((long) readInt);
                        if (j3 < 0 || j3 > 2147483647L) {
                            if (s) {
                                Log.d(r6, C0201.m82(22825) + readInt);
                            }
                            z2 = false;
                            if (z2) {
                            }
                            s4 = (short) (s2 + 1);
                            r6 = str2;
                            readShort = s3;
                            c2 = 0;
                            i6 = i2;
                        } else {
                            z2 = true;
                            if (z2) {
                            }
                            s4 = (short) (s2 + 1);
                            r6 = str2;
                            readShort = s3;
                            c2 = 0;
                            i6 = i2;
                        }
                    } else if (s) {
                        Log.d(r6, C0201.m82(22823) + C[readUnsignedShort2] + C0201.m82(22824) + eVar2.b);
                    }
                    j2 = peek;
                    z2 = false;
                    j3 = 0;
                    if (z2) {
                    }
                    s4 = (short) (s2 + 1);
                    r6 = str2;
                    readShort = s3;
                    c2 = 0;
                    i6 = i2;
                }
                if (bVar.peek() + 4 <= bVar.c) {
                    int readInt3 = bVar.readInt();
                    if (s) {
                        str = r6;
                        Log.d(str, String.format(C0201.m82(22846), Integer.valueOf(readInt3)));
                    } else {
                        str = r6;
                    }
                    long j7 = (long) readInt3;
                    if (j7 <= 0 || readInt3 >= bVar.c) {
                        if (s) {
                            Log.d(str, C0201.m82(22848) + readInt3);
                        }
                    } else if (!this.f.contains(Integer.valueOf(readInt3))) {
                        bVar.seek(j7);
                        if (this.e[4].isEmpty()) {
                            N(bVar, 4);
                        } else if (this.e[5].isEmpty()) {
                            N(bVar, 5);
                        }
                    } else if (s) {
                        Log.d(str, C0201.m82(22847) + readInt3);
                    }
                }
            }
        }
    }

    private void O(String str) {
        for (int i2 = 0; i2 < P.length; i2++) {
            this.e[i2].remove(str);
        }
    }

    private void P(b bVar, int i2) throws IOException {
        d dVar;
        d dVar2 = this.e[i2].get(C0201.m82(22849));
        d dVar3 = this.e[i2].get(C0201.m82(22850));
        if ((dVar2 == null || dVar3 == null) && (dVar = this.e[i2].get(C0201.m82(22851))) != null) {
            n(bVar, dVar.m(this.g), i2);
        }
    }

    private void R(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (s) {
            Log.d(C0201.m82(22855), C0201.m82(22852) + inputStream + C0201.m82(22853) + outputStream + C0201.m82(22854));
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        byte readByte = dataInputStream.readByte();
        String r1 = C0201.m82(22856);
        if (readByte == -1) {
            cVar.c(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.c(-40);
                cVar.c(-1);
                cVar.c(-31);
                a0(cVar, 6);
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte2 = dataInputStream.readByte();
                    if (readByte2 == -39 || readByte2 == -38) {
                        cVar.c(-1);
                        cVar.c(readByte2);
                        g(dataInputStream, cVar);
                        return;
                    }
                    String r7 = C0201.m82(22857);
                    if (readByte2 != -31) {
                        cVar.c(-1);
                        cVar.c(readByte2);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        cVar.n(readUnsignedShort);
                        int i2 = readUnsignedShort - 2;
                        if (i2 >= 0) {
                            while (i2 > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i2, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i2 -= read;
                            }
                        } else {
                            throw new IOException(r7);
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException(C0201.m82(22858));
                                } else if (Arrays.equals(bArr2, Y)) {
                                    int i3 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i3) != i3) {
                                        throw new IOException(r7);
                                    }
                                }
                            }
                            cVar.c(-1);
                            cVar.c(readByte2);
                            cVar.n(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException(r7);
                        }
                    }
                }
                throw new IOException(r1);
            }
            throw new IOException(r1);
        }
        throw new IOException(r1);
    }

    private void V(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.e[4];
        d dVar = hashMap.get(C0201.m82(22859));
        if (dVar != null) {
            int m2 = dVar.m(this.g);
            this.l = m2;
            if (m2 != 1) {
                if (m2 == 6) {
                    x(bVar, hashMap);
                    return;
                } else if (m2 != 7) {
                    return;
                }
            }
            if (G(hashMap)) {
                y(bVar, hashMap);
                return;
            }
            return;
        }
        this.l = 6;
        x(bVar, hashMap);
    }

    private static boolean W(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private void X(int i2, int i3) throws IOException {
        boolean isEmpty = this.e[i2].isEmpty();
        String r1 = C0201.m82(22860);
        if (!isEmpty && !this.e[i3].isEmpty()) {
            HashMap<String, d> hashMap = this.e[i2];
            String r2 = C0201.m82(22861);
            d dVar = hashMap.get(r2);
            HashMap<String, d> hashMap2 = this.e[i2];
            String r4 = C0201.m82(22862);
            d dVar2 = hashMap2.get(r4);
            d dVar3 = this.e[i3].get(r2);
            d dVar4 = this.e[i3].get(r4);
            if (dVar == null || dVar2 == null) {
                if (s) {
                    Log.d(r1, C0201.m82(22864));
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m2 = dVar.m(this.g);
                int m3 = dVar2.m(this.g);
                int m4 = dVar3.m(this.g);
                int m5 = dVar4.m(this.g);
                if (m2 < m4 && m3 < m5) {
                    HashMap<String, d>[] hashMapArr = this.e;
                    HashMap<String, d> hashMap3 = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap3;
                }
            } else if (s) {
                Log.d(r1, C0201.m82(22863));
            }
        } else if (s) {
            Log.d(r1, C0201.m82(22865));
        }
    }

    private void Y(b bVar, int i2) throws IOException {
        d dVar;
        d dVar2;
        d dVar3 = this.e[i2].get(C0201.m82(22866));
        d dVar4 = this.e[i2].get(C0201.m82(22867));
        d dVar5 = this.e[i2].get(C0201.m82(22868));
        d dVar6 = this.e[i2].get(C0201.m82(22869));
        d dVar7 = this.e[i2].get(C0201.m82(22870));
        String r5 = C0201.m82(22871);
        String r6 = C0201.m82(22872);
        if (dVar3 != null) {
            int i3 = dVar3.a;
            String r7 = C0201.m82(22873);
            String r8 = C0201.m82(22874);
            if (i3 == 5) {
                f[] fVarArr = (f[]) dVar3.o(this.g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w(r8, r7 + Arrays.toString(fVarArr));
                    return;
                }
                dVar2 = d.h(fVarArr[0], this.g);
                dVar = d.h(fVarArr[1], this.g);
            } else {
                int[] iArr = (int[]) dVar3.o(this.g);
                if (iArr == null || iArr.length != 2) {
                    Log.w(r8, r7 + Arrays.toString(iArr));
                    return;
                }
                dVar2 = d.j(iArr[0], this.g);
                dVar = d.j(iArr[1], this.g);
            }
            this.e[i2].put(r6, dVar2);
            this.e[i2].put(r5, dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            P(bVar, i2);
        } else {
            int m2 = dVar4.m(this.g);
            int m3 = dVar6.m(this.g);
            int m4 = dVar7.m(this.g);
            int m5 = dVar5.m(this.g);
            if (m3 > m2 && m4 > m5) {
                d j2 = d.j(m3 - m2, this.g);
                d j3 = d.j(m4 - m5, this.g);
                this.e[i2].put(r5, j2);
                this.e[i2].put(r6, j3);
            }
        }
    }

    private void Z(InputStream inputStream) throws IOException {
        X(0, 5);
        X(0, 4);
        X(5, 4);
        d dVar = this.e[1].get(C0201.m82(22875));
        d dVar2 = this.e[1].get(C0201.m82(22876));
        if (!(dVar == null || dVar2 == null)) {
            this.e[0].put(C0201.m82(22877), dVar);
            this.e[0].put(C0201.m82(22878), dVar2);
        }
        if (this.e[4].isEmpty() && H(this.e[5])) {
            HashMap<String, d>[] hashMapArr = this.e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!H(this.e[4])) {
            Log.d(C0201.m82(22879), C0201.m82(22880));
        }
    }

    private void a() {
        String i2 = i(C0201.m82(22881));
        if (i2 != null) {
            String r2 = C0201.m82(22882);
            if (i(r2) == null) {
                this.e[0].put(r2, d.e(i2));
            }
        }
        String r0 = C0201.m82(22883);
        if (i(r0) == null) {
            this.e[0].put(r0, d.f(0, this.g));
        }
        String r02 = C0201.m82(22884);
        if (i(r02) == null) {
            this.e[0].put(r02, d.f(0, this.g));
        }
        String r03 = C0201.m82(22885);
        if (i(r03) == null) {
            this.e[0].put(r03, d.f(0, this.g));
        }
        String r04 = C0201.m82(22886);
        if (i(r04) == null) {
            this.e[1].put(r04, d.f(0, this.g));
        }
    }

    private int a0(c cVar, int i2) throws IOException {
        e[][] eVarArr = P;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : Q) {
            O(eVar.b);
        }
        O(R.b);
        O(S.b);
        for (int i3 = 0; i3 < P.length; i3++) {
            for (Object obj : this.e[i3].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.e[i3].remove(entry.getKey());
                }
            }
        }
        if (!this.e[1].isEmpty()) {
            this.e[0].put(Q[1].b, d.f(0, this.g));
        }
        if (!this.e[2].isEmpty()) {
            this.e[0].put(Q[2].b, d.f(0, this.g));
        }
        if (!this.e[3].isEmpty()) {
            this.e[1].put(Q[3].b, d.f(0, this.g));
        }
        if (this.h) {
            this.e[4].put(R.b, d.f(0, this.g));
            this.e[4].put(S.b, d.f((long) this.j, this.g));
        }
        for (int i4 = 0; i4 < P.length; i4++) {
            int i5 = 0;
            for (Map.Entry<String, d> entry2 : this.e[i4].entrySet()) {
                int p2 = entry2.getValue().p();
                if (p2 > 4) {
                    i5 += p2;
                }
            }
            iArr2[i4] = iArr2[i4] + i5;
        }
        int i6 = 8;
        for (int i7 = 0; i7 < P.length; i7++) {
            if (!this.e[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 += (this.e[i7].size() * 12) + 2 + 4 + iArr2[i7];
            }
        }
        if (this.h) {
            this.e[4].put(R.b, d.f((long) i6, this.g));
            this.i = i2 + i6;
            i6 += this.j;
        }
        int i8 = i6 + 8;
        if (s) {
            String r7 = C0201.m82(22888);
            Log.d(r7, C0201.m82(22887) + i8);
            for (int i9 = 0; i9 < P.length; i9++) {
                Log.d(r7, String.format(C0201.m82(22889), Integer.valueOf(i9), Integer.valueOf(iArr[i9]), Integer.valueOf(this.e[i9].size()), Integer.valueOf(iArr2[i9])));
            }
        }
        if (!this.e[1].isEmpty()) {
            this.e[0].put(Q[1].b, d.f((long) iArr[1], this.g));
        }
        if (!this.e[2].isEmpty()) {
            this.e[0].put(Q[2].b, d.f((long) iArr[2], this.g));
        }
        if (!this.e[3].isEmpty()) {
            this.e[1].put(Q[3].b, d.f((long) iArr[3], this.g));
        }
        cVar.n(i8);
        cVar.write(Y);
        cVar.k(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        cVar.a(this.g);
        cVar.n(42);
        cVar.m(8);
        for (int i10 = 0; i10 < P.length; i10++) {
            if (!this.e[i10].isEmpty()) {
                cVar.n(this.e[i10].size());
                int size = iArr[i10] + 2 + (this.e[i10].size() * 12) + 4;
                for (Map.Entry<String, d> entry3 : this.e[i10].entrySet()) {
                    int i11 = U[i10].get(entry3.getKey()).a;
                    d value = entry3.getValue();
                    int p3 = value.p();
                    cVar.n(i11);
                    cVar.n(value.a);
                    cVar.h(value.b);
                    if (p3 > 4) {
                        cVar.m((long) size);
                        size += p3;
                    } else {
                        cVar.write(value.c);
                        if (p3 < 4) {
                            while (p3 < 4) {
                                cVar.c(0);
                                p3++;
                            }
                        }
                    }
                }
                if (i10 != 0 || this.e[4].isEmpty()) {
                    cVar.m(0);
                } else {
                    cVar.m((long) iArr[4]);
                }
                for (Map.Entry<String, d> entry4 : this.e[i10].entrySet()) {
                    byte[] bArr = entry4.getValue().c;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            cVar.write(v());
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i8;
    }

    private static void b(FileDescriptor fileDescriptor) {
        int i2 = Build.VERSION.SDK_INT;
        String r1 = C0201.m82(22890);
        if (i2 >= 21) {
            try {
                Os.close(fileDescriptor);
            } catch (Exception unused) {
                Log.e(r1, C0201.m82(22891));
            }
        } else {
            Log.e(r1, C0201.m82(22892));
        }
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private String d(double d2) {
        long j2 = (long) d2;
        double d3 = (double) j2;
        Double.isNaN(d3);
        double d4 = d2 - d3;
        long j3 = (long) (d4 * 60.0d);
        double d5 = (double) j3;
        Double.isNaN(d5);
        long round = Math.round((d4 - (d5 / 60.0d)) * 3600.0d * 1.0E7d);
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        String r0 = C0201.m82(22893);
        sb.append(r0);
        sb.append(j3);
        sb.append(r0);
        sb.append(round);
        sb.append(C0201.m82(22894));
        return sb.toString();
    }

    private static double e(String str, String str2) {
        String r0 = C0201.m82(22895);
        try {
            String[] split = str.split(C0201.m82(22896), -1);
            String[] split2 = split[0].split(r0, -1);
            String[] split3 = split[1].split(r0, -1);
            String[] split4 = split[2].split(r0, -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(C0201.m82(22897))) {
                if (!str2.equals(C0201.m82(22898))) {
                    if (!str2.equals(C0201.m82(22899))) {
                        if (!str2.equals(C0201.m82(22900))) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private static long[] f(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private static int g(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i2;
            }
            i2 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    private d l(String str) {
        if (str != null) {
            if (C0201.m82(22901).equals(str)) {
                if (s) {
                    Log.d(C0201.m82(22902), C0201.m82(22903));
                }
                str = C0201.m82(22904);
            }
            for (int i2 = 0; i2 < P.length; i2++) {
                d dVar = this.e[i2].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException(C0201.m82(22905));
    }

    private void m(b bVar) throws IOException {
        String str;
        String str2;
        String r0 = C0201.m82(22906);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new a(this, bVar));
            } else if (this.b != null) {
                mediaMetadataRetriever.setDataSource(this.b);
            } else if (this.a != null) {
                mediaMetadataRetriever.setDataSource(this.a);
            } else {
                mediaMetadataRetriever.release();
                return;
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if (r0.equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if (r0.equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.e[0].put(C0201.m82(22907), d.j(Integer.parseInt(str3), this.g));
            }
            if (str2 != null) {
                this.e[0].put(C0201.m82(22908), d.j(Integer.parseInt(str2), this.g));
            }
            if (str != null) {
                int i2 = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i2 = 6;
                } else if (parseInt == 180) {
                    i2 = 3;
                } else if (parseInt == 270) {
                    i2 = 8;
                }
                this.e[0].put(C0201.m82(22909), d.j(i2, this.g));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.seek((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, Y)) {
                            byte[] bArr2 = new byte[i3];
                            if (bVar.read(bArr2) == i3) {
                                M(bArr2, 0);
                            } else {
                                throw new IOException(C0201.m82(22910));
                            }
                        } else {
                            throw new IOException(C0201.m82(22911));
                        }
                    } else {
                        throw new IOException(C0201.m82(22912));
                    }
                } else {
                    throw new IOException(C0201.m82(22913));
                }
            }
            if (s) {
                Log.d(C0201.m82(22914), C0201.m82(22915) + str3 + C0201.m82(22916) + str2 + C0201.m82(22917) + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ea A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d0 A[SYNTHETIC] */
    private void n(b bVar, int i2, int i3) throws IOException {
        boolean z2 = s;
        String r5 = C0201.m82(22918);
        if (z2) {
            Log.d(r5, C0201.m82(22919) + bVar);
        }
        bVar.h(ByteOrder.BIG_ENDIAN);
        bVar.seek((long) i2);
        byte readByte = bVar.readByte();
        String r6 = C0201.m82(22920);
        if (readByte == -1) {
            int i4 = i2 + 1;
            if (bVar.readByte() == -40) {
                int i5 = i4 + 1;
                while (true) {
                    byte readByte2 = bVar.readByte();
                    if (readByte2 == -1) {
                        int i6 = i5 + 1;
                        byte readByte3 = bVar.readByte();
                        if (s) {
                            Log.d(r5, C0201.m82(22921) + Integer.toHexString(readByte3 & 255));
                        }
                        int i7 = i6 + 1;
                        if (readByte3 == -39 || readByte3 == -38) {
                            bVar.h(this.g);
                        } else {
                            int readUnsignedShort = bVar.readUnsignedShort() - 2;
                            int i8 = i7 + 2;
                            if (s) {
                                Log.d(r5, C0201.m82(22922) + Integer.toHexString(readByte3 & 255) + C0201.m82(22923) + (readUnsignedShort + 2) + C0201.m82(22924));
                            }
                            String r9 = C0201.m82(22925);
                            if (readUnsignedShort >= 0) {
                                if (readByte3 == -31) {
                                    byte[] bArr = new byte[readUnsignedShort];
                                    bVar.readFully(bArr);
                                    int i9 = i8 + readUnsignedShort;
                                    if (W(bArr, Y)) {
                                        byte[] bArr2 = Y;
                                        long length = (long) (i8 + bArr2.length);
                                        M(Arrays.copyOfRange(bArr, bArr2.length, readUnsignedShort), i3);
                                        this.m = (int) length;
                                    } else if (W(bArr, Z)) {
                                        byte[] bArr3 = Z;
                                        long length2 = (long) (i8 + bArr3.length);
                                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, readUnsignedShort);
                                        String r4 = C0201.m82(22929);
                                        if (i(r4) == null) {
                                            this.e[0].put(r4, new d(1, copyOfRange.length, length2, copyOfRange));
                                        }
                                    }
                                    i8 = i9;
                                    readUnsignedShort = 0;
                                } else if (readByte3 != -2) {
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                                default:
                                                    switch (readByte3) {
                                                        default:
                                                            switch (readByte3) {
                                                            }
                                                        case -55:
                                                        case -54:
                                                        case -53:
                                                            if (bVar.skipBytes(1) == 1) {
                                                                this.e[i3].put(C0201.m82(22926), d.f((long) bVar.readUnsignedShort(), this.g));
                                                                this.e[i3].put(C0201.m82(22927), d.f((long) bVar.readUnsignedShort(), this.g));
                                                                readUnsignedShort -= 5;
                                                                break;
                                                            } else {
                                                                throw new IOException(C0201.m82(22928));
                                                            }
                                                    }
                                                case -59:
                                                case -58:
                                                case -57:
                                                    break;
                                            }
                                        case -64:
                                        case -63:
                                        case -62:
                                        case -61:
                                            break;
                                    }
                                    if (readUnsignedShort >= 0) {
                                        throw new IOException(r9);
                                    } else if (bVar.skipBytes(readUnsignedShort) == readUnsignedShort) {
                                        i5 = i8 + readUnsignedShort;
                                    } else {
                                        throw new IOException(C0201.m82(22931));
                                    }
                                }
                                byte[] bArr4 = new byte[readUnsignedShort];
                                if (bVar.read(bArr4) == readUnsignedShort) {
                                    String r62 = C0201.m82(22930);
                                    if (i(r62) == null) {
                                        this.e[1].put(r62, d.e(new String(bArr4, X)));
                                    }
                                    readUnsignedShort = 0;
                                    if (readUnsignedShort >= 0) {
                                    }
                                } else {
                                    throw new IOException(C0201.m82(22932));
                                }
                            } else {
                                throw new IOException(r9);
                            }
                        }
                    } else {
                        throw new IOException(C0201.m82(22933) + Integer.toHexString(readByte2 & 255));
                    }
                }
                bVar.h(this.g);
                return;
            }
            throw new IOException(r6 + Integer.toHexString(readByte & 255));
        }
        throw new IOException(r6 + Integer.toHexString(readByte & 255));
    }

    private int p(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (B(bArr)) {
            return 4;
        }
        if (D(bArr)) {
            return 9;
        }
        if (A(bArr)) {
            return 12;
        }
        if (C(bArr)) {
            return 7;
        }
        return E(bArr) ? 10 : 0;
    }

    private void q(b bVar) throws IOException {
        s(bVar);
        d dVar = this.e[1].get(C0201.m82(22934));
        if (dVar != null) {
            b bVar2 = new b(dVar.c);
            bVar2.h(this.g);
            byte[] bArr = new byte[z.length];
            bVar2.readFully(bArr);
            bVar2.seek(0);
            byte[] bArr2 = new byte[A.length];
            bVar2.readFully(bArr2);
            if (Arrays.equals(bArr, z)) {
                bVar2.seek(8);
            } else if (Arrays.equals(bArr2, A)) {
                bVar2.seek(12);
            }
            N(bVar2, 6);
            d dVar2 = this.e[7].get(C0201.m82(22935));
            d dVar3 = this.e[7].get(C0201.m82(22936));
            if (!(dVar2 == null || dVar3 == null)) {
                this.e[5].put(C0201.m82(22937), dVar2);
                this.e[5].put(C0201.m82(22938), dVar3);
            }
            d dVar4 = this.e[8].get(C0201.m82(22939));
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w(C0201.m82(22943), C0201.m82(22942) + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    d j2 = d.j(i2, this.g);
                    d j3 = d.j(i3, this.g);
                    this.e[0].put(C0201.m82(22940), j2);
                    this.e[0].put(C0201.m82(22941), j3);
                }
            }
        }
    }

    private void r(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        n(bVar, i2, 5);
        bVar.seek((long) i3);
        bVar.h(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        boolean z2 = s;
        String r2 = C0201.m82(22944);
        if (z2) {
            Log.d(r2, C0201.m82(22945) + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == K.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j2 = d.j(readShort, this.g);
                d j3 = d.j(readShort2, this.g);
                this.e[0].put(C0201.m82(22946), j2);
                this.e[0].put(C0201.m82(22947), j3);
                if (s) {
                    Log.d(r2, C0201.m82(22948) + ((int) readShort) + C0201.m82(22949) + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private void s(b bVar) throws IOException {
        d dVar;
        J(bVar, bVar.available());
        N(bVar, 0);
        Y(bVar, 0);
        Y(bVar, 5);
        Y(bVar, 4);
        Z(bVar);
        if (this.d == 8 && (dVar = this.e[1].get(C0201.m82(22950))) != null) {
            b bVar2 = new b(dVar.c);
            bVar2.h(this.g);
            bVar2.seek(6);
            N(bVar2, 9);
            HashMap<String, d> hashMap = this.e[9];
            String r1 = C0201.m82(22951);
            d dVar2 = hashMap.get(r1);
            if (dVar2 != null) {
                this.e[1].put(r1, dVar2);
            }
        }
    }

    private void t(b bVar) throws IOException {
        s(bVar);
        if (this.e[0].get(C0201.m82(22952)) != null) {
            n(bVar, this.q, 5);
        }
        d dVar = this.e[0].get(C0201.m82(22953));
        HashMap<String, d> hashMap = this.e[1];
        String r2 = C0201.m82(22954);
        d dVar2 = hashMap.get(r2);
        if (dVar != null && dVar2 == null) {
            this.e[1].put(r2, dVar);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0166, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016c, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0158 */
    private static Pair<Integer, Integer> w(String str) {
        int i2;
        String r0 = C0201.m82(22955);
        if (str.contains(r0)) {
            String[] split = str.split(r0, -1);
            Pair<Integer, Integer> w2 = w(split[0]);
            if (((Integer) w2.first).intValue() == 2) {
                return w2;
            }
            for (int i3 = 1; i3 < split.length; i3++) {
                Pair<Integer, Integer> w3 = w(split[i3]);
                if (((Integer) w3.first).equals(w2.first) || ((Integer) w3.second).equals(w2.first)) {
                    i2 = ((Integer) w2.first).intValue();
                } else {
                    i2 = -1;
                }
                int intValue = (((Integer) w2.second).intValue() == -1 || (!((Integer) w3.first).equals(w2.second) && !((Integer) w3.second).equals(w2.second))) ? -1 : ((Integer) w2.second).intValue();
                if (i2 == -1 && intValue == -1) {
                    return new Pair<>(2, -1);
                }
                if (i2 == -1) {
                    w2 = new Pair<>(Integer.valueOf(intValue), -1);
                } else if (intValue == -1) {
                    w2 = new Pair<>(Integer.valueOf(i2), -1);
                }
            }
            return w2;
        }
        String r02 = C0201.m82(22956);
        if (str.contains(r02)) {
            String[] split2 = str.split(r02, -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0) {
                        if (parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L) {
                                if (parseDouble2 <= 2147483647L) {
                                    return new Pair<>(10, 5);
                                }
                            }
                            return new Pair<>(5, -1);
                        }
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        }
        Long valueOf = Long.valueOf(Long.parseLong(str));
        if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
            return new Pair<>(3, 4);
        }
        if (valueOf.longValue() < 0) {
            return new Pair<>(9, -1);
        }
        return new Pair<>(4, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    private void x(b bVar, HashMap hashMap) throws IOException {
        int i2;
        d dVar = (d) hashMap.get(C0201.m82(22957));
        d dVar2 = (d) hashMap.get(C0201.m82(22958));
        if (dVar != null && dVar2 != null) {
            int m2 = dVar.m(this.g);
            int min = Math.min(dVar2.m(this.g), bVar.a() - m2);
            int i3 = this.d;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.m;
            } else {
                if (i3 == 7) {
                    i2 = this.n;
                }
                if (s) {
                    Log.d(C0201.m82(22961), C0201.m82(22959) + m2 + C0201.m82(22960) + min);
                }
                if (m2 > 0 && min > 0) {
                    this.h = true;
                    this.i = m2;
                    this.j = min;
                    if (this.a == null && this.c == null && this.b == null) {
                        byte[] bArr = new byte[min];
                        bVar.seek((long) m2);
                        bVar.readFully(bArr);
                        this.k = bArr;
                        return;
                    }
                    return;
                }
            }
            m2 += i2;
            if (s) {
            }
            if (m2 > 0) {
            }
        }
    }

    private void y(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(C0201.m82(22962));
        d dVar2 = (d) hashMap.get(C0201.m82(22963));
        if (dVar != null && dVar2 != null) {
            long[] f2 = f(dVar.o(this.g));
            long[] f3 = f(dVar2.o(this.g));
            String r1 = C0201.m82(22964);
            if (f2 == null) {
                Log.w(r1, C0201.m82(22965));
            } else if (f3 == null) {
                Log.w(r1, C0201.m82(22966));
            } else {
                long j2 = 0;
                for (long j3 : f3) {
                    j2 += j3;
                }
                int i2 = (int) j2;
                byte[] bArr = new byte[i2];
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < f2.length; i5++) {
                    int i6 = (int) f2[i5];
                    int i7 = (int) f3[i5];
                    int i8 = i6 - i3;
                    if (i8 < 0) {
                        Log.d(r1, C0201.m82(22967));
                    }
                    bVar.seek((long) i8);
                    int i9 = i3 + i8;
                    byte[] bArr2 = new byte[i7];
                    bVar.read(bArr2);
                    i3 = i9 + i7;
                    System.arraycopy(bArr2, 0, bArr, i4, i7);
                    i4 += i7;
                }
                this.h = true;
                this.k = bArr;
                this.j = i2;
            }
        }
    }

    private void z(String str) throws IOException {
        Throwable th;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (F(fileInputStream2.getFD())) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    I(fileInputStream2);
                    c(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException(C0201.m82(22968));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf A[Catch:{ Exception -> 0x0104, all -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7 A[Catch:{ Exception -> 0x0104, all -> 0x0100 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public void Q() throws IOException {
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        File file;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileInputStream fileInputStream3;
        ?? r7;
        Closeable closeable3;
        String r0 = C0201.m82(22969);
        if (!this.r || this.d != 4) {
            throw new IOException(C0201.m82(22975));
        } else if (this.b == null && this.a == null) {
            throw new IOException(C0201.m82(22970));
        } else {
            this.k = u();
            FileInputStream fileInputStream4 = null;
            try {
                if (this.a != null) {
                    file = new File(this.a + C0201.m82(22971));
                    if (new File(this.a).renameTo(file)) {
                        fileInputStream2 = null;
                    } else {
                        throw new IOException(C0201.m82(22972) + file.getAbsolutePath());
                    }
                } else if (Build.VERSION.SDK_INT < 21 || this.b == null) {
                    file = null;
                    fileInputStream2 = null;
                } else {
                    file = File.createTempFile(C0201.m82(22973), C0201.m82(22974));
                    Os.lseek(this.b, 0, OsConstants.SEEK_SET);
                    fileInputStream2 = new FileInputStream(this.b);
                    try {
                        r7 = new FileOutputStream(file);
                        try {
                            g(fileInputStream2, r7);
                            fileInputStream = r7;
                            c(fileInputStream2);
                            c(fileInputStream);
                            fileInputStream3 = new FileInputStream(file);
                            try {
                                if (this.a == null) {
                                    fileOutputStream = new FileOutputStream(this.a);
                                } else if (Build.VERSION.SDK_INT < 21 || this.b == null) {
                                    fileOutputStream = null;
                                } else {
                                    Os.lseek(this.b, 0, OsConstants.SEEK_SET);
                                    fileOutputStream = new FileOutputStream(this.b);
                                }
                                try {
                                    R(fileInputStream3, fileOutputStream);
                                    c(fileInputStream3);
                                    c(fileOutputStream);
                                    file.delete();
                                    this.k = null;
                                } catch (Exception unused) {
                                    fileInputStream4 = fileInputStream3;
                                    try {
                                        throw new IOException(r0);
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        c(fileInputStream4);
                                        c(fileOutputStream);
                                        file.delete();
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    fileInputStream4 = fileInputStream3;
                                    c(fileInputStream4);
                                    c(fileOutputStream);
                                    file.delete();
                                    throw th2;
                                }
                            } catch (Exception unused2) {
                                fileOutputStream = null;
                                fileInputStream4 = fileInputStream3;
                                throw new IOException(r0);
                            } catch (Throwable th5) {
                                th2 = th5;
                                fileOutputStream = null;
                                fileInputStream4 = fileInputStream3;
                                c(fileInputStream4);
                                c(fileOutputStream);
                                file.delete();
                                throw th2;
                            }
                        } catch (Exception unused3) {
                        } catch (Throwable th6) {
                            th = th6;
                            closeable3 = r7;
                            fileInputStream4 = fileInputStream2;
                            closeable = closeable3;
                            c(fileInputStream4);
                            c(closeable);
                            throw th;
                        }
                    } catch (Exception unused4) {
                        r7 = 0;
                        fileInputStream4 = fileInputStream2;
                        closeable2 = r7;
                        try {
                            throw new IOException(r0);
                        } catch (Throwable th7) {
                            th = th7;
                            closeable = closeable2;
                            c(fileInputStream4);
                            c(closeable);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        closeable3 = null;
                        fileInputStream4 = fileInputStream2;
                        closeable = closeable3;
                        c(fileInputStream4);
                        c(closeable);
                        throw th;
                    }
                }
                fileInputStream = fileInputStream2;
                c(fileInputStream2);
                c(fileInputStream);
                try {
                    fileInputStream3 = new FileInputStream(file);
                    if (this.a == null) {
                    }
                    R(fileInputStream3, fileOutputStream);
                    c(fileInputStream3);
                    c(fileOutputStream);
                    file.delete();
                    this.k = null;
                } catch (Exception unused5) {
                    fileOutputStream = null;
                    throw new IOException(r0);
                } catch (Throwable th9) {
                    th2 = th9;
                    fileOutputStream = null;
                    c(fileInputStream4);
                    c(fileOutputStream);
                    file.delete();
                    throw th2;
                }
            } catch (Exception unused6) {
                closeable2 = null;
                throw new IOException(r0);
            } catch (Throwable th10) {
                th = th10;
                closeable = null;
                c(fileInputStream4);
                c(closeable);
                throw th;
            }
        }
    }

    public void S(double d2) {
        String r0 = d2 >= 0.0d ? C0201.m82(22976) : C0201.m82(22977);
        T(C0201.m82(22978), new f(Math.abs(d2)).toString());
        T(C0201.m82(22979), r0);
    }

    public void T(String str, String str2) {
        e eVar;
        int i2;
        String str3;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (str5 != null) {
            boolean equals = ae.equals(str5);
            String str7 = at;
            if (equals) {
                if (s) {
                    Log.d(str7, ac);
                }
                str5 = ar;
            }
            int i3 = 2;
            int i4 = 1;
            if (str6 != null && V.contains(str5)) {
                boolean equals2 = str5.equals(ab);
                String str8 = am;
                String str9 = af;
                if (equals2) {
                    Matcher matcher = a0.matcher(str6);
                    if (!matcher.find()) {
                        Log.w(str7, str9 + str5 + str8 + str6);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Integer.parseInt(matcher.group(1)));
                    String str10 = ag;
                    sb.append(str10);
                    sb.append(Integer.parseInt(matcher.group(2)));
                    sb.append(str10);
                    sb.append(Integer.parseInt(matcher.group(3)));
                    sb.append(aj);
                    str6 = sb.toString();
                } else {
                    try {
                        str6 = new f(Double.parseDouble(str2)).toString();
                    } catch (NumberFormatException unused) {
                        Log.w(str7, str9 + str5 + str8 + str6);
                        return;
                    }
                }
            }
            char c2 = 0;
            int i5 = 0;
            while (i5 < P.length) {
                if ((i5 != 4 || this.h) && (eVar = U[i5].get(str5)) != null) {
                    if (str6 == null) {
                        this.e[i5].remove(str5);
                    } else {
                        Pair<Integer, Integer> w2 = w(str6);
                        int i6 = -1;
                        if (eVar.c == ((Integer) w2.first).intValue() || eVar.c == ((Integer) w2.second).intValue()) {
                            i2 = eVar.c;
                        } else {
                            int i7 = eVar.d;
                            if (i7 == -1 || !(i7 == ((Integer) w2.first).intValue() || eVar.d == ((Integer) w2.second).intValue())) {
                                int i8 = eVar.c;
                                if (i8 == i4 || i8 == 7 || i8 == i3) {
                                    i2 = eVar.c;
                                } else if (s) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(ap);
                                    sb2.append(str5);
                                    sb2.append(au);
                                    sb2.append(C[eVar.c]);
                                    int i9 = eVar.d;
                                    String str11 = an;
                                    String str12 = ao;
                                    sb2.append(i9 == -1 ? str11 : str12 + C[eVar.d]);
                                    sb2.append(ak);
                                    sb2.append(C[((Integer) w2.first).intValue()]);
                                    if (((Integer) w2.second).intValue() != -1) {
                                        str11 = str12 + C[((Integer) w2.second).intValue()];
                                    }
                                    sb2.append(str11);
                                    sb2.append(al);
                                    Log.d(str7, sb2.toString());
                                }
                            } else {
                                i2 = eVar.d;
                            }
                        }
                        String str13 = ad;
                        String str14 = ah;
                        switch (i2) {
                            case 1:
                                str3 = str7;
                                this.e[i5].put(str5, d.a(str6));
                                str7 = str3;
                                break;
                            case 2:
                            case 7:
                                str3 = str7;
                                this.e[i5].put(str5, d.e(str6));
                                str7 = str3;
                                break;
                            case 3:
                                str3 = str7;
                                String[] split = str6.split(str14, -1);
                                int[] iArr = new int[split.length];
                                for (int i10 = 0; i10 < split.length; i10++) {
                                    iArr[i10] = Integer.parseInt(split[i10]);
                                }
                                this.e[i5].put(str5, d.k(iArr, this.g));
                                str7 = str3;
                                break;
                            case 4:
                                str3 = str7;
                                String[] split2 = str6.split(str14, -1);
                                long[] jArr = new long[split2.length];
                                for (int i11 = 0; i11 < split2.length; i11++) {
                                    jArr[i11] = Long.parseLong(split2[i11]);
                                }
                                this.e[i5].put(str5, d.g(jArr, this.g));
                                str7 = str3;
                                break;
                            case 5:
                                str3 = str7;
                                String[] split3 = str6.split(str14, -1);
                                f[] fVarArr = new f[split3.length];
                                int i12 = 0;
                                while (i12 < split3.length) {
                                    String[] split4 = split3[i12].split(str13, i6);
                                    fVarArr[i12] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                    i12++;
                                    i6 = -1;
                                }
                                this.e[i5].put(str5, d.i(fVarArr, this.g));
                                str7 = str3;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                str3 = str7;
                                if (s) {
                                    str7 = str3;
                                    Log.d(str7, aa + i2);
                                    break;
                                }
                                str7 = str3;
                                break;
                            case 9:
                                str4 = str7;
                                String[] split5 = str6.split(str14, -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i13 = 0; i13 < split5.length; i13++) {
                                    iArr2[i13] = Integer.parseInt(split5[i13]);
                                }
                                this.e[i5].put(str5, d.c(iArr2, this.g));
                                str7 = str4;
                                break;
                            case 10:
                                String[] split6 = str6.split(str14, -1);
                                f[] fVarArr2 = new f[split6.length];
                                int i14 = 0;
                                while (i14 < split6.length) {
                                    String[] split7 = split6[i14].split(str13, -1);
                                    fVarArr2[i14] = new f((long) Double.parseDouble(split7[c2]), (long) Double.parseDouble(split7[i4]));
                                    i14++;
                                    str7 = str7;
                                    i4 = 1;
                                    c2 = 0;
                                }
                                str4 = str7;
                                this.e[i5].put(str5, d.d(fVarArr2, this.g));
                                str7 = str4;
                                break;
                            case 12:
                                String[] split8 = str6.split(str14, -1);
                                double[] dArr = new double[split8.length];
                                for (int i15 = 0; i15 < split8.length; i15++) {
                                    dArr[i15] = Double.parseDouble(split8[i15]);
                                }
                                this.e[i5].put(str5, d.b(dArr, this.g));
                                break;
                        }
                        i5++;
                        i3 = 2;
                        i4 = 1;
                        c2 = 0;
                    }
                }
                i5++;
                i3 = 2;
                i4 = 1;
                c2 = 0;
            }
            return;
        }
        throw new NullPointerException(as);
    }

    public void U(double d2, double d3) {
        String r0 = C0201.m82(22980);
        if (d2 < -90.0d || d2 > 90.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException(C0201.m82(22990) + d2 + r0);
        } else if (d3 < -180.0d || d3 > 180.0d || Double.isNaN(d3)) {
            throw new IllegalArgumentException(C0201.m82(22989) + d3 + r0);
        } else {
            T(C0201.m82(22983), d2 >= 0.0d ? C0201.m82(22981) : C0201.m82(22982));
            T(C0201.m82(22984), d(Math.abs(d2)));
            T(C0201.m82(22987), d3 >= 0.0d ? C0201.m82(22985) : C0201.m82(22986));
            T(C0201.m82(22988), d(Math.abs(d3)));
        }
    }

    public double h(double d2) {
        double j2 = j(C0201.m82(22991), -1.0d);
        int i2 = -1;
        int k2 = k(C0201.m82(22992), -1);
        if (j2 < 0.0d || k2 < 0) {
            return d2;
        }
        if (k2 != 1) {
            i2 = 1;
        }
        double d3 = (double) i2;
        Double.isNaN(d3);
        return j2 * d3;
    }

    public String i(String str) {
        if (str != null) {
            d l2 = l(str);
            if (l2 != null) {
                if (!V.contains(str)) {
                    return l2.n(this.g);
                }
                if (str.equals(C0201.m82(22993))) {
                    int i2 = l2.a;
                    String r3 = C0201.m82(22994);
                    if (i2 == 5 || i2 == 10) {
                        f[] fVarArr = (f[]) l2.o(this.g);
                        if (fVarArr == null || fVarArr.length != 3) {
                            Log.w(r3, C0201.m82(22997) + Arrays.toString(fVarArr));
                            return null;
                        }
                        return String.format(C0201.m82(22996), Integer.valueOf((int) (((float) fVarArr[0].a) / ((float) fVarArr[0].b))), Integer.valueOf((int) (((float) fVarArr[1].a) / ((float) fVarArr[1].b))), Integer.valueOf((int) (((float) fVarArr[2].a) / ((float) fVarArr[2].b))));
                    }
                    Log.w(r3, C0201.m82(22995) + l2.a);
                    return null;
                }
                try {
                    return Double.toString(l2.l(this.g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException(C0201.m82(22998));
    }

    public double j(String str, double d2) {
        if (str != null) {
            d l2 = l(str);
            if (l2 == null) {
                return d2;
            }
            try {
                return l2.l(this.g);
            } catch (NumberFormatException unused) {
                return d2;
            }
        } else {
            throw new NullPointerException(C0201.m82(22999));
        }
    }

    public int k(String str, int i2) {
        if (str != null) {
            d l2 = l(str);
            if (l2 == null) {
                return i2;
            }
            try {
                return l2.m(this.g);
            } catch (NumberFormatException unused) {
                return i2;
            }
        } else {
            throw new NullPointerException(C0201.m82(23000));
        }
    }

    public double[] o() {
        String i2 = i(C0201.m82(23001));
        String i3 = i(C0201.m82(23002));
        String i4 = i(C0201.m82(23003));
        String i5 = i(C0201.m82(23004));
        if (i2 == null || i3 == null || i4 == null || i5 == null) {
            return null;
        }
        try {
            return new double[]{e(i2, i3), e(i4, i5)};
        } catch (IllegalArgumentException unused) {
            Log.w(C0201.m82(23007), C0201.m82(23005) + String.format(C0201.m82(23006), i2, i3, i4, i5));
            return null;
        }
    }

    public byte[] u() {
        int i2 = this.l;
        if (i2 == 6 || i2 == 7) {
            return v();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072 A[SYNTHETIC, Splitter:B:39:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d3  */
    public byte[] v() {
        FileDescriptor fileDescriptor;
        Throwable th;
        InputStream inputStream;
        Exception e2;
        String r0 = C0201.m82(23008);
        InputStream inputStream2 = null;
        if (!this.h) {
            return null;
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        try {
            if (this.c != null) {
                inputStream = this.c;
                try {
                    if (inputStream.markSupported()) {
                        inputStream.reset();
                    } else {
                        Log.d(r0, C0201.m82(23009));
                        c(inputStream);
                        return null;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    fileDescriptor = null;
                    try {
                        Log.d(r0, C0201.m82(23011), e2);
                        c(inputStream);
                        if (fileDescriptor != null) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        c(inputStream2);
                        if (fileDescriptor != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = null;
                    inputStream2 = inputStream;
                    c(inputStream2);
                    if (fileDescriptor != null) {
                    }
                    throw th;
                }
            } else if (this.a != null) {
                inputStream = new FileInputStream(this.a);
            } else if (Build.VERSION.SDK_INT < 21 || this.b == null) {
                inputStream = null;
                fileDescriptor = null;
                if (inputStream != null) {
                    try {
                        long skip = inputStream.skip((long) this.i);
                        long j2 = (long) this.i;
                        String r8 = C0201.m82(23010);
                        if (skip == j2) {
                            byte[] bArr2 = new byte[this.j];
                            if (inputStream.read(bArr2) == this.j) {
                                this.k = bArr2;
                                c(inputStream);
                                if (fileDescriptor != null) {
                                    b(fileDescriptor);
                                }
                                return bArr2;
                            }
                            throw new IOException(r8);
                        }
                        throw new IOException(r8);
                    } catch (Exception e4) {
                        e2 = e4;
                        Log.d(r0, C0201.m82(23011), e2);
                        c(inputStream);
                        if (fileDescriptor != null) {
                        }
                        return null;
                    }
                } else {
                    throw new FileNotFoundException();
                }
            } else {
                FileDescriptor dup = Os.dup(this.b);
                try {
                    Os.lseek(dup, 0, OsConstants.SEEK_SET);
                    fileDescriptor = dup;
                    inputStream = new FileInputStream(dup);
                    if (inputStream != null) {
                    }
                } catch (Exception e5) {
                    e2 = e5;
                    fileDescriptor = dup;
                    inputStream = null;
                    Log.d(r0, C0201.m82(23011), e2);
                    c(inputStream);
                    if (fileDescriptor != null) {
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    fileDescriptor = dup;
                    c(inputStream2);
                    if (fileDescriptor != null) {
                    }
                    throw th;
                }
            }
            fileDescriptor = null;
            if (inputStream != null) {
            }
        } catch (Exception e6) {
            inputStream = null;
            e2 = e6;
            fileDescriptor = null;
            Log.d(r0, C0201.m82(23011), e2);
            c(inputStream);
            if (fileDescriptor != null) {
                b(fileDescriptor);
            }
            return null;
        } catch (Throwable th5) {
            th = th5;
            fileDescriptor = null;
            c(inputStream2);
            if (fileDescriptor != null) {
                b(fileDescriptor);
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k4$b */
    /* compiled from: ExifInterface */
    public static class b extends InputStream implements DataInput {
        private static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder f = ByteOrder.BIG_ENDIAN;
        private DataInputStream a;
        private ByteOrder b;
        public final int c;
        public int d;

        public b(InputStream inputStream) throws IOException {
            this.b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.a = dataInputStream;
            int available = dataInputStream.available();
            this.c = available;
            this.d = 0;
            this.a.mark(available);
        }

        public int a() {
            return this.c;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.a.available();
        }

        public long c() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public void h(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public int peek() {
            return this.d;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.d++;
            return this.a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.d++;
            return this.a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i = this.d + 1;
            this.d = i;
            if (i <= this.c) {
                int read = this.a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.d += 2;
            return this.a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.d + i2;
            this.d = i3;
            if (i3 > this.c) {
                throw new EOFException();
            } else if (this.a.read(bArr, i, i2) != i2) {
                throw new IOException(C0201.m82(19763));
            }
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.d + 4;
            this.d = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                int read3 = this.a.read();
                int read4 = this.a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException(C0201.m82(19764) + this.b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(C0201.m82(19765), C0201.m82(19766));
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.d + 8;
            this.d = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                int read3 = this.a.read();
                int read4 = this.a.read();
                int read5 = this.a.read();
                int read6 = this.a.read();
                int read7 = this.a.read();
                int read8 = this.a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == e) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException(C0201.m82(19767) + this.b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.d + 2;
            this.d = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException(C0201.m82(19768) + this.b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.d += 2;
            return this.a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.d++;
            return this.a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.d + 2;
            this.d = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f) {
                        return (read << 8) + read2;
                    }
                    throw new IOException(C0201.m82(19769) + this.b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public void seek(long j) throws IOException {
            int i = this.d;
            if (((long) i) > j) {
                this.d = 0;
                this.a.reset();
                this.a.mark(this.c);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException(C0201.m82(19770));
            }
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.c - this.d);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.a.skipBytes(min - i2);
            }
            this.d += i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.a.read(bArr, i, i2);
            this.d += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.d + bArr.length;
            this.d = length;
            if (length > this.c) {
                throw new EOFException();
            } else if (this.a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException(C0201.m82(19762));
            }
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k4$e */
    /* compiled from: ExifInterface */
    public static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public e(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.c == 9 || this.d == 9) && i == 8) {
                return true;
            }
            if ((this.c == 12 || this.d == 12) && i == 11) {
                return true;
            }
            return false;
        }

        public e(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public k4(InputStream inputStream) throws IOException {
        this.e = new HashMap[P.length];
        this.f = new HashSet(P.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (F(fileInputStream.getFD())) {
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    }
                }
                this.c = null;
                this.b = null;
            }
            I(inputStream);
            return;
        }
        throw new NullPointerException(C0201.m82(22793));
    }
}
