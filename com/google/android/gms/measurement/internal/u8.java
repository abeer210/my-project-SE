package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import defpackage.f61;
import defpackage.x51;
import defpackage.z51;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import vigqyno.C0201;

public final class u8 extends n8 {
    public u8(m8 m8Var) {
        super(m8Var);
    }

    private static String B(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(C0201.m82(8334));
        }
        if (z2) {
            sb.append(C0201.m82(8335));
        }
        if (z3) {
            sb.append(C0201.m82(8336));
        }
        return sb.toString();
    }

    public static List<Long> C(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static void E(x51.a aVar, String str, Object obj) {
        List<z51> I = aVar.I();
        int i = 0;
        while (true) {
            if (i >= I.size()) {
                i = -1;
                break;
            } else if (str.equals(I.get(i).C())) {
                break;
            } else {
                i++;
            }
        }
        z51.a Y = z51.Y();
        Y.w(str);
        if (obj instanceof Long) {
            Y.v(((Long) obj).longValue());
        } else if (obj instanceof String) {
            Y.x((String) obj);
        } else if (obj instanceof Double) {
            Y.u(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.w(i, Y);
        } else {
            aVar.y(Y);
        }
    }

    private static void H(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(C0201.m82(8337));
        }
    }

    private final void I(StringBuilder sb, int i, m51 m51) {
        if (m51 != null) {
            H(sb, i);
            sb.append(C0201.m82(8338));
            if (m51.J()) {
                L(sb, i, C0201.m82(8339), Boolean.valueOf(m51.K()));
            }
            L(sb, i, C0201.m82(8340), l().w(m51.L()));
            int i2 = i + 1;
            p51 G = m51.G();
            String r2 = C0201.m82(8341);
            if (G != null) {
                H(sb, i2);
                sb.append(C0201.m82(8342));
                sb.append(C0201.m82(8343));
                if (G.C()) {
                    L(sb, i2, C0201.m82(8344), G.D().name());
                }
                L(sb, i2, C0201.m82(8345), G.G());
                if (G.H()) {
                    L(sb, i2, C0201.m82(8346), Boolean.valueOf(G.I()));
                }
                if (G.K() > 0) {
                    H(sb, i2 + 1);
                    sb.append(C0201.m82(8347));
                    for (String str : G.J()) {
                        H(sb, i2 + 2);
                        sb.append(str);
                        sb.append(C0201.m82(8348));
                    }
                    sb.append(r2);
                }
                H(sb, i2);
                sb.append(r2);
            }
            J(sb, i2, C0201.m82(8349), m51.I());
            H(sb, i);
            sb.append(r2);
        }
    }

    private final void J(StringBuilder sb, int i, String str, n51 n51) {
        if (n51 != null) {
            H(sb, i);
            sb.append(str);
            sb.append(C0201.m82(8350));
            if (n51.C()) {
                L(sb, i, C0201.m82(8351), n51.D().name());
            }
            if (n51.F()) {
                L(sb, i, C0201.m82(8352), Boolean.valueOf(n51.G()));
            }
            L(sb, i, C0201.m82(8353), n51.I());
            L(sb, i, C0201.m82(8354), n51.K());
            L(sb, i, C0201.m82(8355), n51.M());
            H(sb, i);
            sb.append(C0201.m82(8356));
        }
    }

    private final void K(StringBuilder sb, int i, String str, d61 d61, String str2) {
        if (d61 != null) {
            H(sb, 3);
            sb.append(str);
            sb.append(C0201.m82(8357));
            int Y = d61.Y();
            String r2 = C0201.m82(8358);
            if (Y != 0) {
                H(sb, 4);
                sb.append(C0201.m82(8359));
                int i2 = 0;
                for (Long l : d61.X()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(r2);
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append('\n');
            }
            if (d61.V() != 0) {
                H(sb, 4);
                sb.append(C0201.m82(8360));
                int i4 = 0;
                for (Long l2 : d61.U()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(r2);
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append('\n');
            }
            boolean P = g().P(str2);
            String r13 = C0201.m82(8361);
            if (P) {
                if (d61.b0() != 0) {
                    H(sb, 4);
                    sb.append(C0201.m82(8362));
                    int i6 = 0;
                    for (w51 w51 : d61.a0()) {
                        int i7 = i6 + 1;
                        if (i6 != 0) {
                            sb.append(r2);
                        }
                        sb.append(w51.I() ? Integer.valueOf(w51.C()) : null);
                        sb.append(C0201.m82(8363));
                        sb.append(w51.J() ? Long.valueOf(w51.K()) : null);
                        i6 = i7;
                    }
                    sb.append(r13);
                }
                if (d61.e0() != 0) {
                    H(sb, 4);
                    sb.append(C0201.m82(8364));
                    int i8 = 0;
                    for (e61 e61 : d61.d0()) {
                        int i9 = i8 + 1;
                        if (i8 != 0) {
                            sb.append(r2);
                        }
                        sb.append(e61.M() ? Integer.valueOf(e61.C()) : null);
                        sb.append(C0201.m82(8365));
                        int i10 = 0;
                        for (Long l3 : e61.N()) {
                            long longValue = l3.longValue();
                            int i11 = i10 + 1;
                            if (i10 != 0) {
                                sb.append(r2);
                            }
                            sb.append(longValue);
                            i10 = i11;
                        }
                        sb.append(C0201.m82(8366));
                        i8 = i9;
                    }
                    sb.append(r13);
                }
            }
            H(sb, 3);
            sb.append(r13);
        }
    }

    private static void L(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            H(sb, i + 1);
            sb.append(str);
            sb.append(C0201.m82(8367));
            sb.append(obj);
            sb.append('\n');
        }
    }

    public static boolean M(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    public static Object N(x51 x51, String str) {
        z51 x = x(x51, str);
        if (x == null) {
            return null;
        }
        if (x.P()) {
            return x.Q();
        }
        if (x.S()) {
            return Long.valueOf(x.T());
        }
        if (x.V()) {
            return Double.valueOf(x.W());
        }
        return null;
    }

    public static boolean Q(String str) {
        return str != null && str.matches(C0201.m82(8368)) && str.length() <= 310;
    }

    public static z51 x(x51 x51, String str) {
        for (z51 z51 : x51.X()) {
            if (z51.C().equals(str)) {
                return z51;
            }
        }
        return null;
    }

    public final String A(a61 a61) {
        List<z51> X;
        if (a61 == null) {
            return C0201.m82(8369);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(8370));
        Iterator<b61> it = a61.F().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String r8 = C0201.m82(8371);
            if (hasNext) {
                b61 next = it.next();
                if (next != null) {
                    H(sb, 1);
                    sb.append(C0201.m82(8372));
                    if (next.G1()) {
                        L(sb, 1, C0201.m82(8373), Integer.valueOf(next.H1()));
                    }
                    L(sb, 1, C0201.m82(8374), next.X1());
                    if (next.b2()) {
                        L(sb, 1, C0201.m82(8375), Long.valueOf(next.X()));
                    }
                    if (next.c2()) {
                        L(sb, 1, C0201.m82(8376), Long.valueOf(next.d2()));
                    }
                    if (next.C2()) {
                        L(sb, 1, C0201.m82(8377), Long.valueOf(next.Z()));
                    }
                    if (next.u2()) {
                        L(sb, 1, C0201.m82(8378), Long.valueOf(next.v2()));
                    }
                    L(sb, 1, C0201.m82(8379), next.F());
                    L(sb, 1, C0201.m82(8380), next.B2());
                    L(sb, 1, C0201.m82(8381), next.U());
                    L(sb, 1, C0201.m82(8382), next.V());
                    if (next.r2()) {
                        L(sb, 1, C0201.m82(8383), Integer.valueOf(next.s2()));
                    }
                    L(sb, 1, C0201.m82(8384), next.D());
                    if (next.h2()) {
                        L(sb, 1, C0201.m82(8385), Long.valueOf(next.Y()));
                    }
                    L(sb, 1, C0201.m82(8386), next.W());
                    if (next.N1()) {
                        L(sb, 1, C0201.m82(8387), Long.valueOf(next.O1()));
                    }
                    if (next.P1()) {
                        L(sb, 1, C0201.m82(8388), Long.valueOf(next.E1()));
                    }
                    if (next.Q1()) {
                        L(sb, 1, C0201.m82(8389), Long.valueOf(next.F1()));
                    }
                    if (next.R1()) {
                        L(sb, 1, C0201.m82(8390), Long.valueOf(next.S1()));
                    }
                    if (next.U1()) {
                        L(sb, 1, C0201.m82(8391), Long.valueOf(next.V1()));
                    }
                    L(sb, 1, C0201.m82(8392), next.C());
                    L(sb, 1, C0201.m82(8393), next.e2());
                    L(sb, 1, C0201.m82(8394), next.t2());
                    L(sb, 1, C0201.m82(8395), next.x2());
                    if (next.f2()) {
                        L(sb, 1, C0201.m82(8396), Boolean.valueOf(next.g2()));
                    }
                    L(sb, 1, C0201.m82(8397), next.G());
                    L(sb, 1, C0201.m82(8398), next.Y1());
                    L(sb, 1, C0201.m82(8399), next.B0());
                    if (next.Z1()) {
                        L(sb, 1, C0201.m82(8400), Integer.valueOf(next.a2()));
                    }
                    if (next.i2()) {
                        L(sb, 1, C0201.m82(8401), Integer.valueOf(next.j2()));
                    }
                    if (next.n2()) {
                        L(sb, 1, C0201.m82(8402), Boolean.valueOf(next.o2()));
                    }
                    L(sb, 1, C0201.m82(8403), next.k2());
                    if (next.w2() && next.o0() != 0) {
                        L(sb, 1, C0201.m82(8404), Long.valueOf(next.o0()));
                    }
                    if (next.z2()) {
                        L(sb, 1, C0201.m82(8405), Integer.valueOf(next.A2()));
                    }
                    List<f61> C1 = next.C1();
                    String r11 = C0201.m82(8406);
                    String r12 = C0201.m82(8407);
                    String r13 = C0201.m82(8408);
                    String r14 = C0201.m82(8409);
                    int i = 2;
                    if (C1 != null) {
                        for (f61 f61 : C1) {
                            if (f61 != null) {
                                H(sb, 2);
                                sb.append(C0201.m82(8410));
                                L(sb, 2, C0201.m82(8411), f61.a0() ? Long.valueOf(f61.b0()) : null);
                                L(sb, 2, r14, l().x(f61.C()));
                                L(sb, 2, r13, f61.S());
                                L(sb, 2, r12, f61.U() ? Long.valueOf(f61.V()) : null);
                                L(sb, 2, r11, f61.X() ? Double.valueOf(f61.Y()) : null);
                                H(sb, 2);
                                sb.append(r8);
                            }
                        }
                    }
                    List<v51> p2 = next.p2();
                    String U = next.U();
                    if (p2 != null) {
                        for (v51 v51 : p2) {
                            if (v51 != null) {
                                H(sb, i);
                                sb.append(C0201.m82(8412));
                                if (v51.O()) {
                                    L(sb, i, C0201.m82(8413), Integer.valueOf(v51.P()));
                                }
                                if (v51.Q()) {
                                    L(sb, i, C0201.m82(8414), Boolean.valueOf(v51.R()));
                                }
                                K(sb, 2, C0201.m82(8415), v51.L(), U);
                                K(sb, 2, C0201.m82(8416), v51.N(), U);
                                H(sb, 2);
                                sb.append(r8);
                                i = 2;
                            }
                        }
                    }
                    List<x51> A1 = next.A1();
                    if (A1 != null) {
                        for (x51 x51 : A1) {
                            if (x51 != null) {
                                H(sb, 2);
                                sb.append(C0201.m82(8417));
                                L(sb, 2, r14, l().v(x51.D()));
                                if (x51.Z()) {
                                    L(sb, 2, C0201.m82(8418), Long.valueOf(x51.F()));
                                }
                                if (x51.c0()) {
                                    L(sb, 2, C0201.m82(8419), Long.valueOf(x51.a0()));
                                }
                                if (x51.d0()) {
                                    L(sb, 2, C0201.m82(8420), Integer.valueOf(x51.C()));
                                }
                                if (!(x51.Y() == 0 || (X = x51.X()) == null)) {
                                    for (z51 z51 : X) {
                                        if (z51 != null) {
                                            H(sb, 3);
                                            sb.append(C0201.m82(8421));
                                            L(sb, 3, r14, l().w(z51.C()));
                                            L(sb, 3, r13, z51.Q());
                                            L(sb, 3, r12, z51.S() ? Long.valueOf(z51.T()) : null);
                                            L(sb, 3, r11, z51.V() ? Double.valueOf(z51.W()) : null);
                                            H(sb, 3);
                                            sb.append(r8);
                                        }
                                    }
                                }
                                H(sb, 2);
                                sb.append(r8);
                            }
                        }
                    }
                    H(sb, 1);
                    sb.append(r8);
                }
            } else {
                sb.append(r8);
                return sb.toString();
            }
        }
    }

    public final List<Long> D(List<Long> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                e().H().a(C0201.m82(8422), num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    e().H().b(C0201.m82(8423), num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            size = size2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, size);
    }

    public final void F(z51.a aVar, Object obj) {
        u.k(obj);
        aVar.y();
        aVar.z();
        aVar.B();
        if (obj instanceof String) {
            aVar.x((String) obj);
        } else if (obj instanceof Long) {
            aVar.v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.u(((Double) obj).doubleValue());
        } else {
            e().E().a(C0201.m82(8424), obj);
        }
    }

    public final void G(f61.a aVar, Object obj) {
        u.k(obj);
        aVar.z();
        aVar.B();
        aVar.C();
        if (obj instanceof String) {
            aVar.y((String) obj);
        } else if (obj instanceof Long) {
            aVar.v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.w(((Double) obj).doubleValue());
        } else {
            e().E().a(C0201.m82(8425), obj);
        }
    }

    public final boolean O(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(b().a() - j) > j2;
    }

    public final byte[] P(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            e().E().a(C0201.m82(8426), e);
            throw e;
        }
    }

    public final byte[] R(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e().E().a(C0201.m82(8427), e);
            throw e;
        }
    }

    public final boolean S(j jVar, d9 d9Var) {
        u.k(jVar);
        u.k(d9Var);
        if (!TextUtils.isEmpty(d9Var.b) || !TextUtils.isEmpty(d9Var.u)) {
            return true;
        }
        a();
        return false;
    }

    public final List<Integer> T() {
        Map<String, String> N0 = l.N0(this.b.getContext());
        if (N0 == null || N0.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = l.R.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = N0.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            if (next.getKey().startsWith(C0201.m82(8428))) {
                try {
                    int parseInt = Integer.parseInt(next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            e().H().a(C0201.m82(8429), Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    e().H().a(C0201.m82(8430), e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.n8
    public final boolean u() {
        return false;
    }

    public final long v(byte[] bArr) {
        u.k(bArr);
        m().j();
        MessageDigest t = y8.t();
        if (t != null) {
            return y8.m0(t.digest(bArr));
        }
        e().E().d(C0201.m82(8431));
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        e().E().d(vigqyno.C0201.m82(8432));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    public final <T extends Parcelable> T w(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public final String y(l51 l51) {
        if (l51 == null) {
            return C0201.m82(8433);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(8434));
        if (l51.M()) {
            L(sb, 0, C0201.m82(8435), Integer.valueOf(l51.C()));
        }
        L(sb, 0, C0201.m82(8436), l().v(l51.K()));
        String B = B(l51.Q(), l51.R(), l51.T());
        if (!B.isEmpty()) {
            L(sb, 0, C0201.m82(8437), B);
        }
        J(sb, 1, C0201.m82(8438), l51.P());
        sb.append(C0201.m82(8439));
        for (m51 m51 : l51.N()) {
            I(sb, 2, m51);
        }
        H(sb, 1);
        sb.append(C0201.m82(8440));
        return sb.toString();
    }

    public final String z(o51 o51) {
        if (o51 == null) {
            return C0201.m82(8441);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(8442));
        if (o51.I()) {
            L(sb, 0, C0201.m82(8443), Integer.valueOf(o51.C()));
        }
        L(sb, 0, C0201.m82(8444), l().x(o51.D()));
        String B = B(o51.J(), o51.K(), o51.M());
        if (!B.isEmpty()) {
            L(sb, 0, C0201.m82(8445), B);
        }
        I(sb, 1, o51.O());
        sb.append(C0201.m82(8446));
        return sb.toString();
    }
}
