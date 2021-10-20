package defpackage;

import defpackage.qf;
import java.io.EOFException;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: sf  reason: default package */
/* compiled from: JsonUtf8Reader */
public final class sf extends qf {
    private static final dy2 n = dy2.k(C0201.m82(5141));
    private static final dy2 o = dy2.k(C0201.m82(5142));
    private static final dy2 p = dy2.k(C0201.m82(5143));
    private static final dy2 q = dy2.k(C0201.m82(5144));
    private static final dy2 u = dy2.k(C0201.m82(5145));
    private final cy2 h;
    private final ay2 i;
    private int j = 0;
    private long k;
    private int l;
    private String m;

    public sf(cy2 cy2) {
        if (cy2 != null) {
            this.h = cy2;
            this.i = cy2.L();
            z(6);
            return;
        }
        throw new NullPointerException(C0201.m82(5146));
    }

    private void G() throws IOException {
        if (!this.e) {
            F(C0201.m82(5147));
            throw null;
        }
    }

    private int H() throws IOException {
        int[] iArr = this.b;
        int i2 = this.a;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int P = P(true);
            this.i.readByte();
            if (P != 44) {
                if (P == 59) {
                    G();
                } else if (P == 93) {
                    this.j = 4;
                    return 4;
                } else {
                    F(C0201.m82(5148));
                    throw null;
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            this.b[this.a - 1] = 4;
            if (i3 == 5) {
                int P2 = P(true);
                this.i.readByte();
                if (P2 != 44) {
                    if (P2 == 59) {
                        G();
                    } else if (P2 == 125) {
                        this.j = 2;
                        return 2;
                    } else {
                        F(C0201.m82(5153));
                        throw null;
                    }
                }
            }
            int P3 = P(true);
            if (P3 == 34) {
                this.i.readByte();
                this.j = 13;
                return 13;
            } else if (P3 != 39) {
                String r4 = C0201.m82(5154);
                if (P3 != 125) {
                    G();
                    if (N((char) P3)) {
                        this.j = 14;
                        return 14;
                    }
                    F(r4);
                    throw null;
                } else if (i3 != 5) {
                    this.i.readByte();
                    this.j = 2;
                    return 2;
                } else {
                    F(r4);
                    throw null;
                }
            } else {
                this.i.readByte();
                G();
                this.j = 12;
                return 12;
            }
        } else if (i3 == 4) {
            iArr[i2 - 1] = 5;
            int P4 = P(true);
            this.i.readByte();
            if (P4 != 58) {
                if (P4 == 61) {
                    G();
                    if (this.h.D0(1) && this.i.s(0) == 62) {
                        this.i.readByte();
                    }
                } else {
                    F(C0201.m82(5149));
                    throw null;
                }
            }
        } else if (i3 == 6) {
            iArr[i2 - 1] = 7;
        } else if (i3 == 7) {
            if (P(false) == -1) {
                this.j = 18;
                return 18;
            }
            G();
        } else if (i3 == 8) {
            throw new IllegalStateException(C0201.m82(5152));
        }
        int P5 = P(true);
        if (P5 == 34) {
            this.i.readByte();
            this.j = 9;
            return 9;
        } else if (P5 != 39) {
            if (!(P5 == 44 || P5 == 59)) {
                if (P5 == 91) {
                    this.i.readByte();
                    this.j = 3;
                    return 3;
                } else if (P5 != 93) {
                    if (P5 != 123) {
                        int T = T();
                        if (T != 0) {
                            return T;
                        }
                        int U = U();
                        if (U != 0) {
                            return U;
                        }
                        if (N(this.i.s(0))) {
                            G();
                            this.j = 10;
                            return 10;
                        }
                        F(C0201.m82(5150));
                        throw null;
                    }
                    this.i.readByte();
                    this.j = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.i.readByte();
                    this.j = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                G();
                this.j = 7;
                return 7;
            }
            F(C0201.m82(5151));
            throw null;
        } else {
            G();
            this.i.readByte();
            this.j = 8;
            return 8;
        }
    }

    private int K(String str, qf.a aVar) {
        int length = aVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.a[i2])) {
                this.j = 0;
                this.c[this.a - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private boolean N(int i2) throws IOException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        G();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.i.b((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.h.D0(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        G();
        r3 = r6.i.s(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.i.readByte();
        r6.i.readByte();
        c0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.i.readByte();
        r6.i.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (a0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        F(vigqyno.C0201.m82(5155));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r1 != 35) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        G();
        c0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        return r1;
     */
    private int P(boolean z) throws IOException {
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (this.h.D0((long) i3)) {
                    byte s = this.i.s((long) i2);
                    if (s != 10 && s != 32 && s != 13 && s != 9) {
                        break;
                    }
                    i2 = i3;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException(C0201.m82(5156));
                }
            }
        }
    }

    private String Q(dy2 dy2) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long W = this.h.W(dy2);
            if (W == -1) {
                F(C0201.m82(5157));
                throw null;
            } else if (this.i.s(W) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.i.K(W));
                this.i.readByte();
                sb.append(V());
            } else if (sb == null) {
                String K = this.i.K(W);
                this.i.readByte();
                return K;
            } else {
                sb.append(this.i.K(W));
                this.i.readByte();
                return sb.toString();
            }
        }
    }

    private String R() throws IOException {
        long W = this.h.W(p);
        return W != -1 ? this.i.K(W) : this.i.G();
    }

    private int T() throws IOException {
        String str;
        String str2;
        int i2;
        byte s = this.i.s(0);
        if (s == 116 || s == 84) {
            i2 = 5;
            str2 = C0201.m82(5162);
            str = C0201.m82(5163);
        } else if (s == 102 || s == 70) {
            i2 = 6;
            str2 = C0201.m82(5160);
            str = C0201.m82(5161);
        } else if (s != 110 && s != 78) {
            return 0;
        } else {
            i2 = 7;
            str2 = C0201.m82(5158);
            str = C0201.m82(5159);
        }
        int length = str2.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.h.D0((long) i4)) {
                return 0;
            }
            byte s2 = this.i.s((long) i3);
            if (s2 != str2.charAt(i3) && s2 != str.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.h.D0((long) (length + 1)) && N(this.i.s((long) length))) {
            return 0;
        }
        this.i.b((long) length);
        this.j = i2;
        return i2;
    }

    private int U() throws IOException {
        byte s;
        char c = 1;
        int i2 = 0;
        long j2 = 0;
        int i3 = 0;
        char c2 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            int i4 = i3 + 1;
            if (!this.h.D0((long) i4)) {
                break;
            }
            s = this.i.s((long) i3);
            if (s != 43) {
                if (s != 69 && s != 101) {
                    if (s != 45) {
                        if (s != 46) {
                            if (s >= 48 && s <= 57) {
                                if (c2 == c || c2 == 0) {
                                    j2 = (long) (-(s - 48));
                                    i2 = 0;
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j2 == 0) {
                                            return i2;
                                        }
                                        long j3 = (10 * j2) - ((long) (s - 48));
                                        z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                        j2 = j3;
                                    } else if (c2 == 3) {
                                        i2 = 0;
                                        c2 = 4;
                                    } else if (c2 == 5 || c2 == 6) {
                                        i2 = 0;
                                        c2 = 7;
                                    }
                                    i2 = 0;
                                }
                            }
                        } else if (c2 != 2) {
                            return i2;
                        } else {
                            c2 = 3;
                        }
                    } else if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return i2;
                    }
                    i3 = i4;
                    c = 1;
                } else if (c2 != 2 && c2 != 4) {
                    return i2;
                } else {
                    c2 = 5;
                    i3 = i4;
                    c = 1;
                }
            } else if (c2 != 5) {
                return i2;
            }
            c2 = 6;
            i3 = i4;
            c = 1;
        }
        if (N(s)) {
            return 0;
        }
        if (c2 == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.k = j2;
            this.i.b((long) i3);
            this.j = 16;
            return 16;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.l = i3;
            this.j = 17;
            return 17;
        }
    }

    private char V() throws IOException {
        int i2;
        int i3;
        if (this.h.D0(1)) {
            byte readByte = this.i.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                if (this.e) {
                    return (char) readByte;
                }
                F(C0201.m82(5164) + ((char) readByte));
                throw null;
            } else if (this.h.D0(4)) {
                char c = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    byte s = this.i.s((long) i4);
                    char c2 = (char) (c << 4);
                    if (s < 48 || s > 57) {
                        if (s >= 97 && s <= 102) {
                            i2 = s - 97;
                        } else if (s < 65 || s > 70) {
                            F(C0201.m82(5165) + this.i.K(4));
                            throw null;
                        } else {
                            i2 = s - 65;
                        }
                        i3 = i2 + 10;
                    } else {
                        i3 = s - 48;
                    }
                    c = (char) (c2 + i3);
                }
                this.i.b(4);
                return c;
            } else {
                throw new EOFException(C0201.m82(5166) + n());
            }
        } else {
            F(C0201.m82(5167));
            throw null;
        }
    }

    private void Z(dy2 dy2) throws IOException {
        while (true) {
            long W = this.h.W(dy2);
            if (W == -1) {
                F(C0201.m82(5168));
                throw null;
            } else if (this.i.s(W) == 92) {
                this.i.b(W + 1);
                V();
            } else {
                this.i.b(W + 1);
                return;
            }
        }
    }

    private boolean a0() throws IOException {
        long J = this.h.J(u);
        boolean z = J != -1;
        ay2 ay2 = this.i;
        ay2.b(z ? J + ((long) u.A()) : ay2.Q());
        return z;
    }

    private void c0() throws IOException {
        long W = this.h.W(q);
        ay2 ay2 = this.i;
        ay2.b(W != -1 ? W + 1 : ay2.Q());
    }

    private void d0() throws IOException {
        long W = this.h.W(p);
        ay2 ay2 = this.i;
        if (W == -1) {
            W = ay2.Q();
        }
        ay2.b(W);
    }

    @Override // defpackage.qf
    public int A(qf.a aVar) throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return K(this.m, aVar);
        }
        int k1 = this.h.k1(aVar.b);
        if (k1 != -1) {
            this.j = 0;
            this.c[this.a - 1] = aVar.a[k1];
            return k1;
        }
        String str = this.c[this.a - 1];
        String u2 = u();
        int K = K(u2, aVar);
        if (K == -1) {
            this.j = 15;
            this.m = u2;
            this.c[this.a - 1] = str;
        }
        return K;
    }

    @Override // defpackage.qf
    public void B() throws IOException {
        if (!this.f) {
            int i2 = this.j;
            if (i2 == 0) {
                i2 = H();
            }
            if (i2 == 14) {
                d0();
            } else if (i2 == 13) {
                Z(o);
            } else if (i2 == 12) {
                Z(n);
            } else if (i2 != 15) {
                throw new of(C0201.m82(5170) + y() + C0201.m82(5171) + n());
            }
            this.j = 0;
            this.c[this.a - 1] = C0201.m82(5169);
            return;
        }
        throw new of(C0201.m82(5172) + y() + C0201.m82(5173) + n());
    }

    @Override // defpackage.qf
    public void D() throws IOException {
        if (!this.f) {
            int i2 = 0;
            do {
                int i3 = this.j;
                if (i3 == 0) {
                    i3 = H();
                }
                if (i3 == 3) {
                    z(1);
                } else if (i3 == 1) {
                    z(3);
                } else {
                    String r5 = C0201.m82(5174);
                    String r6 = C0201.m82(5175);
                    if (i3 == 4) {
                        i2--;
                        if (i2 >= 0) {
                            this.a--;
                        } else {
                            throw new of(r6 + y() + r5 + n());
                        }
                    } else if (i3 == 2) {
                        i2--;
                        if (i2 >= 0) {
                            this.a--;
                        } else {
                            throw new of(r6 + y() + r5 + n());
                        }
                    } else if (i3 == 14 || i3 == 10) {
                        d0();
                    } else if (i3 == 9 || i3 == 13) {
                        Z(o);
                    } else if (i3 == 8 || i3 == 12) {
                        Z(n);
                    } else if (i3 == 17) {
                        this.i.b((long) this.l);
                    } else if (i3 == 18) {
                        throw new of(r6 + y() + r5 + n());
                    }
                    this.j = 0;
                }
                i2++;
                this.j = 0;
            } while (i2 != 0);
            int[] iArr = this.d;
            int i4 = this.a;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            this.c[i4 - 1] = C0201.m82(5176);
            return;
        }
        throw new of(C0201.m82(5177) + y() + C0201.m82(5178) + n());
    }

    @Override // defpackage.qf
    public void c() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 3) {
            z(1);
            this.d[this.a - 1] = 0;
            this.j = 0;
            return;
        }
        throw new of(C0201.m82(5179) + y() + C0201.m82(5180) + n());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.j = 0;
        this.b[0] = 8;
        this.a = 1;
        this.i.a();
        this.h.close();
    }

    @Override // defpackage.qf
    public void h() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 1) {
            z(3);
            this.j = 0;
            return;
        }
        throw new of(C0201.m82(5181) + y() + C0201.m82(5182) + n());
    }

    @Override // defpackage.qf
    public void k() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 4) {
            int i3 = this.a - 1;
            this.a = i3;
            int[] iArr = this.d;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.j = 0;
            return;
        }
        throw new of(C0201.m82(5183) + y() + C0201.m82(5184) + n());
    }

    @Override // defpackage.qf
    public void m() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 2) {
            int i3 = this.a - 1;
            this.a = i3;
            this.c[i3] = null;
            int[] iArr = this.d;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.j = 0;
            return;
        }
        throw new of(C0201.m82(5185) + y() + C0201.m82(5186) + n());
    }

    @Override // defpackage.qf
    public boolean o() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // defpackage.qf
    public boolean p() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 5) {
            this.j = 0;
            int[] iArr = this.d;
            int i3 = this.a - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.j = 0;
            int[] iArr2 = this.d;
            int i4 = this.a - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new of(C0201.m82(5187) + y() + C0201.m82(5188) + n());
        }
    }

    @Override // defpackage.qf
    public double r() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 16) {
            this.j = 0;
            int[] iArr = this.d;
            int i3 = this.a - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.k;
        }
        String r3 = C0201.m82(5189);
        String r5 = C0201.m82(5190);
        if (i2 == 17) {
            this.m = this.i.K((long) this.l);
        } else if (i2 == 9) {
            this.m = Q(o);
        } else if (i2 == 8) {
            this.m = Q(n);
        } else if (i2 == 10) {
            this.m = R();
        } else if (i2 != 11) {
            throw new of(r3 + y() + r5 + n());
        }
        this.j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            if (this.e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.m = null;
                this.j = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseDouble;
            }
            throw new pf(C0201.m82(5191) + parseDouble + r5 + n());
        } catch (NumberFormatException unused) {
            throw new of(r3 + this.m + r5 + n());
        }
    }

    @Override // defpackage.qf
    public int s() throws IOException {
        String str;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        String r3 = C0201.m82(5192);
        String r4 = C0201.m82(5193);
        if (i2 == 16) {
            long j2 = this.k;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.j = 0;
                int[] iArr = this.d;
                int i4 = this.a - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new of(r4 + this.k + r3 + n());
        }
        if (i2 == 17) {
            this.m = this.i.K((long) this.l);
        } else if (i2 == 9 || i2 == 8) {
            if (i2 == 9) {
                str = Q(o);
            } else {
                str = Q(n);
            }
            this.m = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.j = 0;
                int[] iArr2 = this.d;
                int i5 = this.a - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            throw new of(r4 + y() + r3 + n());
        }
        this.j = 11;
        try {
            double parseDouble = Double.parseDouble(this.m);
            int i6 = (int) parseDouble;
            if (((double) i6) == parseDouble) {
                this.m = null;
                this.j = 0;
                int[] iArr3 = this.d;
                int i7 = this.a - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new of(r4 + this.m + r3 + n());
        } catch (NumberFormatException unused2) {
            throw new of(r4 + this.m + r3 + n());
        }
    }

    public String toString() {
        return C0201.m82(5194) + this.h + C0201.m82(5195);
    }

    @Override // defpackage.qf
    public String u() throws IOException {
        String str;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 14) {
            str = R();
        } else if (i2 == 13) {
            str = Q(o);
        } else if (i2 == 12) {
            str = Q(n);
        } else if (i2 == 15) {
            str = this.m;
        } else {
            throw new of(C0201.m82(5196) + y() + C0201.m82(5197) + n());
        }
        this.j = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // defpackage.qf
    public String w() throws IOException {
        String str;
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        if (i2 == 10) {
            str = R();
        } else if (i2 == 9) {
            str = Q(o);
        } else if (i2 == 8) {
            str = Q(n);
        } else if (i2 == 11) {
            str = this.m;
            this.m = null;
        } else if (i2 == 16) {
            str = Long.toString(this.k);
        } else if (i2 == 17) {
            str = this.i.K((long) this.l);
        } else {
            throw new of(C0201.m82(5198) + y() + C0201.m82(5199) + n());
        }
        this.j = 0;
        int[] iArr = this.d;
        int i3 = this.a - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    @Override // defpackage.qf
    public qf.b y() throws IOException {
        int i2 = this.j;
        if (i2 == 0) {
            i2 = H();
        }
        switch (i2) {
            case 1:
                return qf.b.BEGIN_OBJECT;
            case 2:
                return qf.b.END_OBJECT;
            case 3:
                return qf.b.BEGIN_ARRAY;
            case 4:
                return qf.b.END_ARRAY;
            case 5:
            case 6:
                return qf.b.BOOLEAN;
            case 7:
                return qf.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return qf.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return qf.b.NAME;
            case 16:
            case 17:
                return qf.b.NUMBER;
            case 18:
                return qf.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
