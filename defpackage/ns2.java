package defpackage;

import android.util.Log;
import defpackage.vs2;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import vigqyno.C0201;

/* renamed from: ns2  reason: default package */
/* compiled from: COSParser */
public class ns2 extends ms2 {
    public static final String A = null;
    private static final char[] p = {'x', 'r', 'e', 'f'};
    private static final char[] q = {'/', 'X', 'R', 'e', 'f'};
    private static final char[] r = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};
    public static final byte[] s = {101, 110, 100, 115, 116, 114, 101, 97, 109};
    public static final byte[] t = {101, 110, 100, 111, 98, 106};
    public static final char[] u = {'%', '%', 'E', 'O', 'F'};
    public static final char[] v = {'o', 'b', 'j'};
    private final byte[] c = new byte[2048];
    public final is2 d;
    private long e;
    public long f;
    private boolean g = true;
    public boolean h = false;
    private Map<er2, Long> i = null;
    private List<Long> j = null;
    private List<Long> k = null;
    public pt2 l = null;
    private int m = 2048;
    public vs2 n;
    private final byte[] o;

    static {
        C0201.m83(ns2.class, 101);
    }

    public ns2(is2 is2) {
        super(new ts2(is2));
        C0201.m82(33184).equals(System.getProperty(C0201.m82(33183)));
        this.n = new vs2();
        this.o = new byte[8192];
        this.d = is2;
    }

    private void I(ar2[] ar2Arr, vq2 vq2, Set<Long> set) {
        if (ar2Arr != null) {
            for (ar2 ar2 : ar2Arr) {
                tq2 G0 = vq2.G0(ar2);
                if (G0 instanceof dr2) {
                    set.add(Long.valueOf(X((dr2) G0)));
                }
            }
        }
    }

    private void J(Queue<tq2> queue, tq2 tq2, Set<Long> set) {
        if (!(tq2 instanceof dr2) || set.add(Long.valueOf(X((dr2) tq2)))) {
            queue.add(tq2);
        }
    }

    private void K(Queue<tq2> queue, Collection<tq2> collection, Set<Long> set) {
        for (tq2 tq2 : collection) {
            J(queue, tq2, set);
        }
    }

    private void L() throws IOException {
        Long l2;
        if (this.i == null) {
            this.i = new HashMap();
            long position = this.d.getPosition();
            char[] charArray = A.toCharArray();
            long j2 = 6;
            long j3 = 6;
            while (true) {
                this.d.seek(j3);
                if (b0(charArray)) {
                    long j4 = j3 - 1;
                    this.d.seek(j4);
                    int peek = this.d.peek();
                    if (d()) {
                        int i2 = peek - 48;
                        long j5 = j4 - 1;
                        this.d.seek(j5);
                        if (j()) {
                            while (j5 > j2 && j()) {
                                j5--;
                                this.d.seek(j5);
                            }
                            int i3 = 0;
                            while (j5 > j2 && d()) {
                                j5--;
                                this.d.seek(j5);
                                i3++;
                            }
                            if (i3 > 0) {
                                this.d.read();
                                byte[] i4 = this.d.i(i3);
                                try {
                                    l2 = Long.valueOf(new String(i4, 0, i4.length, ut2.c));
                                } catch (NumberFormatException unused) {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                    this.i.put(new er2(l2.longValue(), i2), Long.valueOf(j5 + 1));
                                }
                            }
                        }
                    }
                }
                j3++;
                if (this.d.j()) {
                    this.d.seek(position);
                    return;
                }
                j2 = 6;
            }
        }
    }

    private long M(long j2, boolean z) throws IOException {
        List<Long> list;
        if (!z) {
            O();
        }
        N();
        long w0 = (z || (list = this.j) == null) ? -1 : w0(list, j2);
        List<Long> list2 = this.k;
        long w02 = list2 != null ? w0(list2, j2) : -1;
        if (w0 > -1 && w02 > -1) {
            long j3 = j2 - w0;
            long j4 = j2 - w02;
            if (Math.abs(j3) > Math.abs(j4)) {
                this.k.remove(Long.valueOf(w02));
                return j4;
            }
            this.j.remove(Long.valueOf(w0));
            return j3;
        } else if (w0 > -1) {
            this.j.remove(Long.valueOf(w0));
            return w0;
        } else if (w02 <= -1) {
            return -1;
        } else {
            this.k.remove(Long.valueOf(w02));
            return w02;
        }
    }

    private void N() throws IOException {
        if (this.k == null) {
            this.k = new Vector();
            long position = this.d.getPosition();
            this.d.seek(6);
            char[] charArray = C0201.m82(33185).toCharArray();
            while (!this.d.j()) {
                if (b0(q)) {
                    long position2 = this.d.getPosition();
                    boolean z = false;
                    long j2 = -1;
                    for (int i2 = 1; i2 < 30 && !z; i2++) {
                        long j3 = position2 - ((long) (i2 * 10));
                        if (j3 > 0) {
                            this.d.seek(j3);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 10) {
                                    break;
                                } else if (b0(charArray)) {
                                    long j4 = j3 - 1;
                                    this.d.seek(j4);
                                    if (ms2.e(this.d.peek())) {
                                        long j5 = j4 - 1;
                                        this.d.seek(j5);
                                        if (j()) {
                                            long j6 = j5 - 1;
                                            this.d.seek(j6);
                                            int i4 = 0;
                                            while (j6 > 6 && d()) {
                                                j6--;
                                                this.d.seek(j6);
                                                i4++;
                                            }
                                            if (i4 > 0) {
                                                this.d.read();
                                                j2 = this.d.getPosition();
                                            }
                                        }
                                    }
                                    Log.d(C0201.m82(33188), C0201.m82(33186) + position2 + C0201.m82(33187) + j2);
                                    z = true;
                                } else {
                                    j3++;
                                    this.d.read();
                                    i3++;
                                }
                            }
                        }
                    }
                    if (j2 > -1) {
                        this.k.add(Long.valueOf(j2));
                    }
                    this.d.seek(position2 + 5);
                }
                this.d.read();
            }
            this.d.seek(position);
        }
    }

    private void O() throws IOException {
        if (this.j == null) {
            this.j = new Vector();
            long position = this.d.getPosition();
            this.d.seek(6);
            while (!this.d.j()) {
                if (b0(p)) {
                    long position2 = this.d.getPosition();
                    this.d.seek(position2 - 1);
                    if (l()) {
                        this.j.add(Long.valueOf(position2));
                    }
                    this.d.seek(position2 + 4);
                }
                this.d.read();
            }
            this.d.seek(position);
        }
    }

    private long P(long j2, boolean z) throws IOException {
        String r0 = C0201.m82(33189);
        if (j2 < 0) {
            Log.e(r0, C0201.m82(33190) + j2 + C0201.m82(33191));
            return 0;
        }
        long M = M(j2, z);
        if (M > -1) {
            Log.d(r0, C0201.m82(33192) + j2 + C0201.m82(33193) + M);
            return M;
        }
        Log.e(r0, C0201.m82(33194) + j2);
        return 0;
    }

    private boolean Q(er2 er2, long j2) throws IOException {
        if (j2 < 6) {
            return false;
        }
        long e2 = er2.e();
        int d2 = er2.d();
        long position = this.d.getPosition();
        this.d.seek(j2);
        try {
            if (a0(U(e2, d2).getBytes(ut2.c))) {
                this.d.seek(position);
                this.d.seek(position);
                return true;
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.d.seek(position);
            throw th;
        }
        this.d.seek(position);
        return false;
    }

    private long R(long j2) throws IOException {
        if (!this.g) {
            return j2;
        }
        this.d.seek(j2);
        if (this.d.peek() == 120 && b0(p)) {
            return j2;
        }
        if (j2 > 0) {
            long S = S(j2, true);
            if (S > -1) {
                return S;
            }
        }
        return P(j2, false);
    }

    private long S(long j2, boolean z) throws IOException {
        if (!this.g || j2 == 0) {
            return j2;
        }
        this.d.seek(j2 - 1);
        if (m(this.d.read()) && d()) {
            try {
                C();
                y();
                x(v, true);
                this.d.seek(j2);
                return j2;
            } catch (IOException unused) {
                this.d.seek(j2);
            }
        }
        if (z) {
            return -1;
        }
        return P(j2, true);
    }

    private void T() throws IOException {
        Map<er2, Long> d2;
        String r4;
        if (this.g && (d2 = this.n.d()) != null) {
            boolean z = false;
            Iterator<Map.Entry<er2, Long>> it = d2.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                r4 = C0201.m82(33195);
                if (!hasNext) {
                    break;
                }
                Map.Entry<er2, Long> next = it.next();
                er2 key = next.getKey();
                Long value = next.getValue();
                if (value != null && value.longValue() >= 0 && !Q(key, value.longValue())) {
                    Log.d(r4, C0201.m82(33196));
                    z = true;
                    break;
                }
            }
            if (z) {
                L();
                Map<er2, Long> map = this.i;
                if (map != null && !map.isEmpty()) {
                    Log.d(r4, C0201.m82(33197));
                    d2.putAll(this.i);
                }
            }
        }
    }

    private String U(long j2, int i2) {
        return Long.toString(j2) + C0201.m82(33198) + Integer.toString(i2) + C0201.m82(33199);
    }

    private cr2 W(tq2 tq2, ar2 ar2) throws IOException {
        if (tq2 == null) {
            return null;
        }
        if (tq2 instanceof cr2) {
            return (cr2) tq2;
        }
        if (tq2 instanceof dr2) {
            dr2 dr2 = (dr2) tq2;
            if (dr2.x() == null) {
                long position = this.d.getPosition();
                j0(dr2, ar2.d0.equals(ar2));
                this.d.seek(position);
                if (dr2.x() == null) {
                    throw new IOException(C0201.m82(33200));
                }
            }
            if (dr2.x() instanceof cr2) {
                return (cr2) dr2.x();
            }
            throw new IOException(C0201.m82(33201) + dr2 + C0201.m82(33202) + dr2.x().getClass().getSimpleName());
        }
        throw new IOException(C0201.m82(33203) + tq2.getClass().getSimpleName());
    }

    private long X(dr2 dr2) {
        return (dr2.A() << 32) | ((long) dr2.r());
    }

    private boolean a0(byte[] bArr) throws IOException {
        if (this.d.peek() != bArr[0]) {
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int read = this.d.read(bArr2, 0, length);
        while (read < length) {
            int read2 = this.d.read(bArr2, read, length - read);
            if (read2 < 0) {
                break;
            }
            read += read2;
        }
        boolean equals = Arrays.equals(bArr, bArr2);
        this.d.h0(read);
        return equals;
    }

    private boolean b0(char[] cArr) throws IOException {
        long position = this.d.getPosition();
        boolean z = true;
        for (char c2 : cArr) {
            if (this.d.read() != c2) {
                z = false;
            }
        }
        this.d.seek(position);
        return z;
    }

    private void g0(Long l2, er2 er2, dr2 dr2) throws IOException {
        tq2 tq2;
        this.d.seek(l2.longValue());
        long C = (long) C();
        int y = y();
        x(v, true);
        long e2 = er2.e();
        String r7 = C0201.m82(33204);
        if (C == e2 && y == er2.d()) {
            G();
            tq2 u2 = u();
            String D = D();
            boolean equals = D.equals(C0201.m82(33205));
            String r14 = C0201.m82(33206);
            if (equals) {
                this.d.h0(D.getBytes(ut2.c).length);
                if (u2 instanceof vq2) {
                    fr2 d0 = d0((vq2) u2);
                    pt2 pt2 = this.l;
                    if (pt2 != null) {
                        pt2.e(d0, er2.e(), (long) er2.d());
                    }
                    G();
                    D = A();
                    tq2 = d0;
                    if (!D.startsWith(r14)) {
                        tq2 = d0;
                        if (D.startsWith(C0201.m82(33207))) {
                            D = D.substring(9).trim();
                            tq2 = d0;
                            if (D.length() == 0) {
                                D = A();
                                tq2 = d0;
                            }
                        }
                    }
                } else {
                    throw new IOException(C0201.m82(33208) + l2 + C0201.m82(33209));
                }
            } else {
                pt2 pt22 = this.l;
                tq2 = u2;
                if (pt22 != null) {
                    pt22.b(u2, er2.e(), (long) er2.d());
                    tq2 = u2;
                }
            }
            dr2.H(tq2);
            if (!D.startsWith(r14)) {
                boolean z = this.g;
                String r8 = C0201.m82(33210);
                String r9 = C0201.m82(33211);
                String r10 = C0201.m82(33212);
                String r11 = C0201.m82(33213);
                if (z) {
                    Log.w(C0201.m82(33214), r11 + C + r7 + y + r10 + l2 + r9 + D + r8);
                    return;
                }
                throw new IOException(r11 + C + r7 + y + r10 + l2 + r9 + D + r8);
            }
            return;
        }
        throw new IOException(C0201.m82(33215) + er2.e() + r7 + er2.d() + C0201.m82(33216) + C + r7 + y);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fb A[Catch:{ NumberFormatException -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011d  */
    private boolean h0(String str, String str2) throws IOException {
        float f2;
        String[] split;
        String A2 = A();
        if (!A2.contains(str)) {
            A2 = A();
            while (!A2.contains(str) && (A2.length() <= 0 || !Character.isDigit(A2.charAt(0)))) {
                A2 = A();
            }
        }
        if (!A2.contains(str)) {
            this.d.seek(0);
            return false;
        }
        int indexOf = A2.indexOf(str);
        if (indexOf > 0) {
            A2 = A2.substring(indexOf, A2.length());
        }
        boolean startsWith = A2.startsWith(str);
        String r5 = C0201.m82(33217);
        if (startsWith) {
            if (!A2.matches(str + C0201.m82(33218))) {
                if (A2.length() < str.length() + 3) {
                    A2 = str + str2;
                    Log.d(r5, C0201.m82(33219) + str2 + C0201.m82(33220));
                }
                f2 = -1.0f;
                split = A2.split(C0201.m82(33222));
                if (split.length == 2) {
                    f2 = Float.parseFloat(split[1]);
                }
                if (f2 < 0.0f) {
                    this.b.H0(f2);
                    this.d.seek(0);
                    return true;
                }
                throw new IOException(C0201.m82(33224) + A2);
            }
        }
        String str3 = A2.substring(str.length() + 3, A2.length()) + C0201.m82(33221);
        A2 = A2.substring(0, str.length() + 3);
        this.d.h0(str3.getBytes(ut2.c).length);
        f2 = -1.0f;
        try {
            split = A2.split(C0201.m82(33222));
            if (split.length == 2) {
            }
        } catch (NumberFormatException e2) {
            Log.d(r5, C0201.m82(33223), e2);
        }
        if (f2 < 0.0f) {
        }
    }

    private void k0(int i2) throws IOException {
        tq2 i0 = i0((long) i2, 0, true);
        if (i0 instanceof fr2) {
            qs2 qs2 = new qs2((fr2) i0, this.b);
            qs2.J();
            Set<Long> a = this.n.a(i2);
            for (dr2 dr2 : qs2.I()) {
                er2 er2 = new er2(dr2);
                if (a.contains(Long.valueOf(er2.e()))) {
                    this.b.k0(er2).H(dr2.x());
                }
            }
        }
    }

    private long q0(long j2, boolean z) throws IOException {
        C();
        y();
        x(v, true);
        vq2 o2 = o();
        fr2 d0 = d0(o2);
        r0(d0, (long) ((int) j2), z);
        d0.close();
        return o2.H0(ar2.k0);
    }

    private void t0(OutputStream outputStream) throws IOException {
        byte b;
        byte[] bArr = s;
        int i2 = 0;
        while (true) {
            int read = this.d.read(this.c, i2, 2048 - i2);
            if (read <= 0) {
                break;
            }
            int i3 = read + i2;
            int i4 = i3 - 5;
            int i5 = i2;
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int i6 = i2 + 5;
                if (i5 != 0 || i6 >= i4 || ((b = this.c[i6]) <= 116 && b >= 97)) {
                    byte b2 = this.c[i2];
                    if (b2 == bArr[i5]) {
                        i5++;
                        if (i5 == bArr.length) {
                            i2++;
                            break;
                        }
                    } else {
                        if (i5 == 3) {
                            bArr = t;
                            if (b2 == bArr[i5]) {
                                i5++;
                            }
                        }
                        i5 = b2 == 101 ? 1 : (b2 == 110 && i5 == 7) ? 2 : 0;
                        bArr = s;
                    }
                } else {
                    i2 = i6;
                }
                i2++;
            }
            int max = Math.max(0, i2 - i5);
            if (max > 0) {
                outputStream.write(this.c, 0, max);
            }
            if (i5 == bArr.length) {
                this.d.h0(i3 - max);
                break;
            } else {
                System.arraycopy(bArr, 0, this.c, 0, i5);
                i2 = i5;
            }
        }
        outputStream.flush();
    }

    private void u0(OutputStream outputStream, cr2 cr2) throws IOException {
        long E = cr2.E();
        while (E > 0) {
            int i2 = E > 8192 ? 8192 : (int) E;
            int read = this.d.read(this.o, 0, i2);
            if (read > 0) {
                outputStream.write(this.o, 0, read);
                E -= (long) read;
            } else {
                throw new IOException(C0201.m82(33225) + this.d.getPosition() + C0201.m82(33226) + i2 + C0201.m82(33227) + read);
            }
        }
    }

    private long w0(List<Long> list, long j2) {
        int size = list.size();
        long j3 = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = j2 - list.get(i3).longValue();
            if (j3 == -1 || Math.abs(j3) > Math.abs(longValue)) {
                i2 = i3;
                j3 = longValue;
            }
        }
        if (i2 > -1) {
            return list.get(i2).longValue();
        }
        return -1;
    }

    private boolean y0(long j2) throws IOException {
        long position = this.d.getPosition();
        long j3 = position + j2;
        long j4 = this.f;
        String r6 = C0201.m82(33228);
        String r7 = C0201.m82(33229);
        String r8 = C0201.m82(33230);
        boolean z = false;
        if (j3 > j4) {
            Log.w(r8, C0201.m82(33231) + position + r7 + j2 + r6 + j3);
        } else {
            this.d.seek(j3);
            G();
            if (!a0(s)) {
                Log.w(r8, C0201.m82(33232) + position + r7 + j2 + r6 + j3);
            } else {
                z = true;
            }
            this.d.seek(position);
        }
        return z;
    }

    public wq2 V() throws IOException {
        wq2 wq2 = this.b;
        if (wq2 != null) {
            return wq2;
        }
        throw new IOException(C0201.m82(33233));
    }

    /* JADX INFO: finally extract failed */
    public final long Y() throws IOException {
        try {
            int i2 = this.f < ((long) this.m) ? (int) this.f : this.m;
            byte[] bArr = new byte[i2];
            long j2 = this.f - ((long) i2);
            this.d.seek(j2);
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2 - i3;
                int read = this.d.read(bArr, i3, i4);
                if (read >= 1) {
                    i3 += read;
                } else {
                    throw new IOException(C0201.m82(33234) + i4);
                }
            }
            this.d.seek(0);
            int c0 = c0(u, bArr, i2);
            String r1 = C0201.m82(33235);
            if (c0 < 0) {
                boolean z = this.g;
                String r6 = C0201.m82(33236);
                String r7 = C0201.m82(33237);
                if (z) {
                    Log.d(r1, r7 + new String(u) + r6);
                } else {
                    throw new IOException(r7 + new String(u) + r6);
                }
            } else {
                i2 = c0;
            }
            int c02 = c0(r, bArr, i2);
            long j3 = j2 + ((long) c02);
            if (c02 >= 0) {
                return j3;
            }
            if (this.g) {
                Log.d(r1, C0201.m82(33238));
                return -1;
            }
            throw new IOException(C0201.m82(33239));
        } catch (Throwable th) {
            this.d.seek(0);
            throw th;
        }
    }

    public boolean Z() {
        return this.g;
    }

    public int c0(char[] cArr, byte[] bArr, int i2) {
        int length = cArr.length - 1;
        char c2 = cArr[length];
        while (true) {
            int i3 = length;
            while (true) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
                if (bArr[i2] == c2) {
                    i3--;
                    if (i3 < 0) {
                        return i2;
                    }
                    c2 = cArr[i3];
                } else if (i3 < length) {
                    break;
                }
            }
            c2 = cArr[length];
        }
    }

    public fr2 d0(vq2 vq2) throws IOException {
        fr2 x = this.b.x(vq2);
        D();
        H();
        cr2 W = W(vq2.G0(ar2.W), vq2.g0(ar2.x0));
        String r1 = C0201.m82(33240);
        if (W == null) {
            if (this.g) {
                Log.w(r1, C0201.m82(33241) + this.d.getPosition());
            } else {
                throw new IOException(C0201.m82(33242));
            }
        }
        if (W == null || !y0(W.E())) {
            OutputStream x1 = x.x1();
            try {
                t0(new os2(x1));
                if (W == null) {
                    x.l1(ar2.W);
                }
            } finally {
                x1.close();
                if (W != null) {
                    x.n1(ar2.W, W);
                } else {
                    x.l1(ar2.W);
                }
            }
        } else {
            OutputStream x12 = x.x1();
            try {
                u0(x12, W);
            } finally {
                x12.close();
                x.n1(ar2.W, W);
            }
        }
        String D = D();
        if (!D.equals(C0201.m82(33243)) || !this.g) {
            int length = D.length();
            String r3 = C0201.m82(33245);
            if (length > 9 && this.g && D.substring(0, 9).equals(r3)) {
                Log.w(r1, C0201.m82(33246) + D + C0201.m82(33247) + this.d.getPosition());
                this.d.h0(D.substring(9).getBytes(ut2.c).length);
            } else if (!D.equals(r3)) {
                throw new IOException(C0201.m82(33248) + D + C0201.m82(33249) + this.d.getPosition());
            }
        } else {
            Log.w(r1, C0201.m82(33244) + this.d.getPosition());
            this.d.h0(t.length);
        }
        return x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0115, code lost:
        if (r1.isEmpty() == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0118, code lost:
        r14 = ((java.util.List) r1.remove(r1.firstKey())).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012a, code lost:
        if (r14.hasNext() == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012c, code lost:
        r4 = (defpackage.dr2) r14.next();
        r5 = j0(r4, false);
        r4.H(r5);
        J(r0, r5, r3);
        r2.add(java.lang.Long.valueOf(X(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    public void e0(vq2 vq2, ar2... ar2Arr) throws IOException {
        er2 er2;
        Long l2;
        LinkedList linkedList = new LinkedList();
        TreeMap treeMap = new TreeMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        I(ar2Arr, vq2, hashSet);
        K(linkedList, vq2.a1(), hashSet2);
        loop0:
        while (true) {
            if (!linkedList.isEmpty() || !treeMap.isEmpty()) {
                while (true) {
                    tq2 poll = linkedList.poll();
                    if (poll == null) {
                        break;
                    } else if (poll instanceof vq2) {
                        K(linkedList, ((vq2) poll).a1(), hashSet2);
                    } else if (poll instanceof sq2) {
                        Iterator<tq2> it = ((sq2) poll).iterator();
                        while (it.hasNext()) {
                            J(linkedList, it.next(), hashSet2);
                        }
                    } else if (poll instanceof dr2) {
                        dr2 dr2 = (dr2) poll;
                        long X = X(dr2);
                        er2 = new er2(dr2.A(), dr2.r());
                        if (hashSet.contains(Long.valueOf(X))) {
                            continue;
                        } else {
                            Long l3 = this.n.d().get(er2);
                            if (l3 == null || l3.longValue() == 0) {
                                this.b.k0(er2).H(br2.a);
                            } else if (l3.longValue() > 0) {
                                treeMap.put(l3, Collections.singletonList(dr2));
                            } else {
                                l2 = this.n.d().get(new er2((long) ((int) (-l3.longValue())), 0));
                                if (l2 == null || l2.longValue() <= 0) {
                                } else {
                                    List list = (List) treeMap.get(l2);
                                    if (list == null) {
                                        list = new ArrayList();
                                        treeMap.put(l2, list);
                                    }
                                    list.add(dr2);
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                return;
            }
        }
        throw new IOException(C0201.m82(33250) + er2 + C0201.m82(33251) + l2);
    }

    public boolean f0() throws IOException {
        return h0(C0201.m82(33252), C0201.m82(33253));
    }

    public tq2 i0(long j2, int i2, boolean z) throws IOException {
        er2 er2 = new er2(j2, i2);
        dr2 k0 = this.b.k0(er2);
        if (k0.x() == null) {
            Long l2 = this.n.d().get(er2);
            if (!z || (l2 != null && l2.longValue() > 0)) {
                if (l2 == null && this.g && this.i == null) {
                    L();
                    Map<er2, Long> map = this.i;
                    if (map != null && !map.isEmpty()) {
                        Log.d(C0201.m82(33256), C0201.m82(33257));
                        Map<er2, Long> d2 = this.n.d();
                        for (Map.Entry<er2, Long> entry : this.i.entrySet()) {
                            er2 key = entry.getKey();
                            if (!d2.containsKey(key)) {
                                d2.put(key, entry.getValue());
                            }
                        }
                        l2 = d2.get(er2);
                    }
                }
                if (l2 == null) {
                    k0.H(br2.a);
                } else if (l2.longValue() > 0) {
                    g0(l2, er2, k0);
                } else {
                    k0((int) (-l2.longValue()));
                }
            } else {
                throw new IOException(C0201.m82(33254) + er2.e() + C0201.m82(33255) + er2.d());
            }
        }
        return k0.x();
    }

    public final tq2 j0(dr2 dr2, boolean z) throws IOException {
        return i0(dr2.A(), dr2.r(), z);
    }

    public boolean l0() throws IOException {
        return h0(C0201.m82(33258), C0201.m82(33259));
    }

    public long m0() throws IOException {
        if (!b0(r)) {
            return -1;
        }
        D();
        G();
        return B();
    }

    public boolean n0() throws IOException {
        if (this.d.peek() != 116) {
            return false;
        }
        long position = this.d.getPosition();
        String A2 = A();
        String trim = A2.trim();
        String r5 = C0201.m82(33260);
        if (!trim.equals(r5)) {
            if (!A2.startsWith(r5)) {
                return false;
            }
            this.d.seek(position + ((long) 7));
        }
        G();
        this.n.h(o());
        G();
        return true;
    }

    public tq2 o0(vq2 vq2) throws IOException {
        for (tq2 tq2 : vq2.a1()) {
            if (tq2 instanceof dr2) {
                j0((dr2) tq2, false);
            }
        }
        dr2 dr2 = (dr2) vq2.G0(ar2.o0);
        if (dr2 != null) {
            return j0(dr2, false);
        }
        throw new IOException(C0201.m82(33261));
    }

    public vq2 p0(long j2) throws IOException {
        String r11;
        this.d.seek(j2);
        long j3 = 0;
        long max = Math.max(0L, m0());
        long R = R(max);
        if (R > -1) {
            max = R;
        }
        this.b.F0(max);
        long j4 = max;
        while (true) {
            boolean z = true;
            if (j4 > j3) {
                this.d.seek(j4);
                G();
                if (this.d.peek() == 120) {
                    s0(j4);
                    this.e = this.d.getPosition();
                    while (true) {
                        boolean z2 = this.g;
                        r11 = C0201.m82(33262);
                        if (z2 && this.d.peek() != 116) {
                            if (this.d.getPosition() == this.e) {
                                Log.w(r11, C0201.m82(33263) + this.e + C0201.m82(33264));
                            }
                            A();
                        }
                    }
                    if (n0()) {
                        vq2 b = this.n.b();
                        if (b.x(ar2.D0)) {
                            int s0 = b.s0(ar2.D0);
                            long j5 = (long) s0;
                            long S = S(j5, false);
                            if (S > -1 && S != j5) {
                                s0 = (int) S;
                                b.m1(ar2.D0, s0);
                            }
                            if (s0 > 0) {
                                this.d.seek((long) s0);
                                G();
                                q0(j4, false);
                            } else {
                                boolean z3 = this.g;
                                String r4 = C0201.m82(33265);
                                if (z3) {
                                    Log.e(r11, r4 + s0);
                                } else {
                                    throw new IOException(r4 + s0);
                                }
                            }
                        }
                        long s02 = (long) b.s0(ar2.k0);
                        if (s02 > 0) {
                            j4 = R(s02);
                            if (j4 > -1 && j4 != s02) {
                                b.p1(ar2.k0, j4);
                                j3 = 0;
                            }
                        }
                        j4 = s02;
                        j3 = 0;
                    } else {
                        throw new IOException(C0201.m82(33266) + this.d.getPosition());
                    }
                } else {
                    j4 = q0(j4, true);
                    j3 = 0;
                    if (j4 > 0) {
                        long R2 = R(j4);
                        if (R2 > -1 && R2 != j4) {
                            this.n.b().p1(ar2.k0, R2);
                            j4 = R2;
                        }
                    }
                }
            } else {
                this.n.g(max);
                vq2 c2 = this.n.c();
                this.b.G0(c2);
                wq2 wq2 = this.b;
                if (vs2.b.STREAM != this.n.e()) {
                    z = false;
                }
                wq2.u0(z);
                T();
                this.b.r(this.n.d());
                return c2;
            }
        }
    }

    public void r0(fr2 fr2, long j2, boolean z) throws IOException {
        if (z) {
            this.n.f(j2, vs2.b.STREAM);
            this.n.h(fr2);
        }
        new ss2(fr2, this.b, this.n).I();
    }

    public boolean s0(long j2) throws IOException {
        if (this.d.peek() != 120 || !D().trim().equals(C0201.m82(33267))) {
            return false;
        }
        String D = D();
        this.d.h0(D.getBytes(ut2.c).length);
        this.n.f(j2, vs2.b.TABLE);
        boolean startsWith = D.startsWith(C0201.m82(33268));
        String r13 = C0201.m82(33269);
        if (startsWith) {
            Log.w(r13, C0201.m82(33270));
            return false;
        }
        do {
            long C = (long) C();
            long B = B();
            G();
            int i2 = 0;
            while (true) {
                if (((long) i2) >= B || this.d.j() || g((char) this.d.peek()) || this.d.peek() == 116) {
                    break;
                }
                String A2 = A();
                String[] split = A2.split(C0201.m82(33271));
                if (split.length < 3) {
                    Log.w(r13, C0201.m82(33272) + A2);
                    break;
                }
                if (split[split.length - 1].equals(C0201.m82(33273))) {
                    try {
                        int parseInt = Integer.parseInt(split[0]);
                        this.n.i(new er2(C, Integer.parseInt(split[1])), (long) parseInt);
                    } catch (NumberFormatException e2) {
                        throw new IOException(e2);
                    }
                } else if (!split[2].equals(C0201.m82(33274))) {
                    throw new IOException(C0201.m82(33275) + C);
                }
                C++;
                G();
                i2++;
            }
            G();
        } while (d());
        return true;
    }

    public final vq2 v0() throws IOException {
        L();
        if (this.i == null) {
            return null;
        }
        this.n.f(0, vs2.b.TABLE);
        for (Map.Entry<er2, Long> entry : this.i.entrySet()) {
            this.n.i(entry.getKey(), entry.getValue().longValue());
        }
        this.n.g(0);
        vq2 c2 = this.n.c();
        V().G0(c2);
        for (Map.Entry<er2, Long> entry2 : this.i.entrySet()) {
            this.d.seek(entry2.getValue().longValue());
            C();
            y();
            x(v, true);
            try {
                vq2 o2 = o();
                if (o2 != null) {
                    if (ar2.l.equals(o2.g0(ar2.x0))) {
                        c2.n1(ar2.o0, this.b.k0(entry2.getKey()));
                    } else if (o2.x(ar2.w0) || o2.x(ar2.i) || o2.x(ar2.v0) || o2.x(ar2.U) || o2.x(ar2.y) || o2.x(ar2.l0) || o2.x(ar2.x)) {
                        c2.n1(ar2.S, this.b.k0(entry2.getKey()));
                    }
                }
            } catch (IOException unused) {
                Log.d(C0201.m82(33278), C0201.m82(33276) + entry2.getKey() + C0201.m82(33277));
            }
        }
        return c2;
    }

    public void x0(int i2) {
        if (i2 > 15) {
            this.m = i2;
        }
    }
}
