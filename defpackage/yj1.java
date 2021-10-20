package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: yj1  reason: default package */
public final class yj1 extends wj1 {
    private final boolean a = true;
    private final byte[] b;
    private int c;
    private int d;
    private int e;
    private int f;

    public yj1(ByteBuffer byteBuffer, boolean z) {
        super(null);
        this.b = byteBuffer.array();
        this.c = byteBuffer.arrayOffset() + byteBuffer.position();
        this.d = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final byte Q() throws IOException {
        int i = this.c;
        if (i != this.d) {
            byte[] bArr = this.b;
            this.c = i + 1;
            return bArr[i];
        }
        throw sl1.a();
    }

    private final Object R(ro1 ro1, Class<?> cls, wk1 wk1) throws IOException {
        switch (xj1.a[ro1.ordinal()]) {
            case 1:
                return Boolean.valueOf(B());
            case 2:
                return u();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(P());
            case 5:
                return Integer.valueOf(x());
            case 6:
                return Long.valueOf(F());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(C());
            case 9:
                return Long.valueOf(M());
            case 10:
                return w(cls, wk1);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(t());
            case 13:
                return Integer.valueOf(J());
            case 14:
                return Long.valueOf(N());
            case 15:
                return i0(true);
            case 16:
                return Integer.valueOf(K());
            case 17:
                return Long.valueOf(I());
            default:
                throw new RuntimeException(C0201.m82(7528));
        }
    }

    private final void S(List<String> list, boolean z) throws IOException {
        int i;
        int i2;
        if ((this.e & 7) != 2) {
            throw sl1.f();
        } else if (!(list instanceof bm1) || z) {
            do {
                list.add(i0(z));
                if (!Z()) {
                    i = this.c;
                } else {
                    return;
                }
            } while (b0() == this.e);
            this.c = i;
        } else {
            bm1 bm1 = (bm1) list;
            do {
                bm1.d1(u());
                if (!Z()) {
                    i2 = this.c;
                } else {
                    return;
                }
            } while (b0() == this.e);
            this.c = i2;
        }
    }

    private final void T(int i) throws IOException {
        if (i < 0 || i > this.d - this.c) {
            throw sl1.a();
        }
    }

    private final void U(int i) throws IOException {
        if ((this.e & 7) != i) {
            throw sl1.f();
        }
    }

    private final void V(int i) throws IOException {
        T(i);
        if ((i & 7) != 0) {
            throw sl1.h();
        }
    }

    private final void W(int i) throws IOException {
        T(i);
        if ((i & 3) != 0) {
            throw sl1.h();
        }
    }

    private final void X(int i) throws IOException {
        if (this.c != i) {
            throw sl1.a();
        }
    }

    private final <T> T Y(in1<T> in1, wk1 wk1) throws IOException {
        int b0 = b0();
        T(b0);
        int i = this.d;
        int i2 = this.c + b0;
        this.d = i2;
        try {
            T e2 = in1.e();
            in1.f(e2, this, wk1);
            in1.b(e2);
            if (this.c == i2) {
                return e2;
            }
            throw sl1.h();
        } finally {
            this.d = i;
        }
    }

    private final boolean Z() {
        return this.c == this.d;
    }

    private final <T> T a0(in1<T> in1, wk1 wk1) throws IOException {
        int i = this.f;
        this.f = ((this.e >>> 3) << 3) | 4;
        try {
            T e2 = in1.e();
            in1.f(e2, this, wk1);
            in1.b(e2);
            if (this.e == this.f) {
                return e2;
            }
            throw sl1.h();
        } finally {
            this.f = i;
        }
    }

    private final int b0() throws IOException {
        int i;
        int i2 = this.c;
        int i3 = this.d;
        if (i3 != i2) {
            byte[] bArr = this.b;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.c = i4;
                return b2;
            } else if (i3 - i4 < 9) {
                return (int) d0();
            } else {
                int i5 = i4 + 1;
                int i6 = b2 ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ -128;
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ -2080896;
                        } else {
                            i7 = i5 + 1;
                            byte b3 = bArr[i5];
                            i = (i9 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                                if (bArr[i7] < 0) {
                                                    throw sl1.c();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.c = i5;
                return i;
            }
        } else {
            throw sl1.a();
        }
    }

    private final long c0() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.c;
        int i3 = this.d;
        if (i3 != i2) {
            byte[] bArr = this.b;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.c = i4;
                return (long) b2;
            } else if (i3 - i4 < 9) {
                return d0();
            } else {
                int i5 = i4 + 1;
                int i6 = b2 ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ -128;
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i5 = i7;
                        j = (long) (i8 ^ 16256);
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ -2080896;
                        } else {
                            long j5 = (long) i9;
                            int i10 = i5 + 1;
                            long j6 = j5 ^ (((long) bArr[i5]) << 28);
                            if (j6 >= 0) {
                                j4 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j7 = j6 ^ (((long) bArr[i10]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j6 = j7 ^ (((long) bArr[i5]) << 42);
                                    if (j6 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j7 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            j2 = (j7 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i5 = i11 + 1;
                                                if (((long) bArr[i11]) < 0) {
                                                    throw sl1.c();
                                                }
                                            } else {
                                                i5 = i11;
                                            }
                                            j = j2;
                                        }
                                    }
                                }
                                j2 = j7 ^ j3;
                                j = j2;
                            }
                            j = j4 ^ j6;
                            i5 = i10;
                        }
                    }
                    this.c = i5;
                    return j;
                }
                j = (long) i;
                this.c = i5;
                return j;
            }
        } else {
            throw sl1.a();
        }
    }

    private final long d0() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte Q = Q();
            j |= ((long) (Q & Byte.MAX_VALUE)) << i;
            if ((Q & 128) == 0) {
                return j;
            }
        }
        throw sl1.c();
    }

    private final int e0() throws IOException {
        T(4);
        return g0();
    }

    private final long f0() throws IOException {
        T(8);
        return h0();
    }

    private final int g0() {
        int i = this.c;
        byte[] bArr = this.b;
        this.c = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long h0() {
        int i = this.c;
        byte[] bArr = this.b;
        this.c = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final String i0(boolean z) throws IOException {
        U(2);
        int b0 = b0();
        if (b0 == 0) {
            return C0201.m82(7529);
        }
        T(b0);
        if (z) {
            byte[] bArr = this.b;
            int i = this.c;
            if (!jo1.h(bArr, i, i + b0)) {
                throw sl1.i();
            }
        }
        String str = new String(this.b, this.c, b0, nl1.a);
        this.c += b0;
        return str;
    }

    private final void j0(int i) throws IOException {
        T(i);
        this.c += i;
    }

    @Override // defpackage.hn1
    public final void A(List<Double> list) throws IOException {
        int i;
        int i2;
        if (list instanceof tk1) {
            tk1 tk1 = (tk1) list;
            int i3 = this.e & 7;
            if (i3 == 1) {
                do {
                    tk1.d(readDouble());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = b0();
                V(b0);
                int i4 = this.c + b0;
                while (this.c < i4) {
                    tk1.d(Double.longBitsToDouble(h0()));
                }
            } else {
                throw sl1.f();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i5 == 2) {
                int b02 = b0();
                V(b02);
                int i6 = this.c + b02;
                while (this.c < i6) {
                    list.add(Double.valueOf(Double.longBitsToDouble(h0())));
                }
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final boolean B() throws IOException {
        U(0);
        if (b0() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hn1
    public final int C() throws IOException {
        U(0);
        return b0();
    }

    @Override // defpackage.hn1
    public final void D(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    gm1.e(I());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    gm1.e(c0());
                }
                X(b0);
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(I()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Long.valueOf(c0()));
                }
                X(b02);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final int E() throws IOException {
        U(5);
        return e0();
    }

    @Override // defpackage.hn1
    public final long F() throws IOException {
        U(1);
        return f0();
    }

    @Override // defpackage.hn1
    public final <T> T G(Class<T> cls, wk1 wk1) throws IOException {
        U(3);
        return (T) a0(fn1.b().a(cls), wk1);
    }

    @Override // defpackage.hn1
    public final void H(List<Float> list) throws IOException {
        int i;
        int i2;
        if (list instanceof hl1) {
            hl1 hl1 = (hl1) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int b0 = b0();
                W(b0);
                int i4 = this.c + b0;
                while (this.c < i4) {
                    hl1.e(Float.intBitsToFloat(g0()));
                }
            } else if (i3 == 5) {
                do {
                    hl1.e(readFloat());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else {
                throw sl1.f();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 2) {
                int b02 = b0();
                W(b02);
                int i6 = this.c + b02;
                while (this.c < i6) {
                    list.add(Float.valueOf(Float.intBitsToFloat(g0())));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final long I() throws IOException {
        U(0);
        return c0();
    }

    @Override // defpackage.hn1
    public final int J() throws IOException {
        U(0);
        return kk1.l(b0());
    }

    @Override // defpackage.hn1
    public final int K() throws IOException {
        U(0);
        return b0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final <T> void L(List<T> list, in1<T> in1, wk1 wk1) throws IOException {
        int i;
        int i2 = this.e;
        if ((i2 & 7) == 3) {
            do {
                list.add(a0(in1, wk1));
                if (!Z()) {
                    i = this.c;
                } else {
                    return;
                }
            } while (b0() == i2);
            this.c = i;
            return;
        }
        throw sl1.f();
    }

    @Override // defpackage.hn1
    public final long M() throws IOException {
        U(0);
        return c0();
    }

    @Override // defpackage.hn1
    public final long N() throws IOException {
        U(0);
        return kk1.y(c0());
    }

    @Override // defpackage.hn1
    public final void O(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    gm1.e(M());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    gm1.e(c0());
                }
                X(b0);
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(M()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Long.valueOf(c0()));
                }
                X(b02);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final int P() throws IOException {
        U(0);
        return b0();
    }

    @Override // defpackage.hn1
    public final int a() {
        return this.e;
    }

    @Override // defpackage.hn1
    public final void b(List<Boolean> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zj1) {
            zj1 zj1 = (zj1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    zj1.b(B());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    zj1.b(b0() != 0);
                }
                X(b0);
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Boolean.valueOf(B()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Boolean.valueOf(b0() != 0));
                }
                X(b02);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void c(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int b0 = b0();
                W(b0);
                int i4 = this.c + b0;
                while (this.c < i4) {
                    ll1.e(g0());
                }
            } else if (i3 == 5) {
                do {
                    ll1.e(x());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else {
                throw sl1.f();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 2) {
                int b02 = b0();
                W(b02);
                int i6 = this.c + b02;
                while (this.c < i6) {
                    list.add(Integer.valueOf(g0()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(x()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void d(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    gm1.e(N());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    gm1.e(kk1.y(c0()));
                }
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(N()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Long.valueOf(kk1.y(c0())));
                }
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void e(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    ll1.e(J());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    ll1.e(kk1.l(b0()));
                }
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(J()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Integer.valueOf(kk1.l(b0())));
                }
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void f(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i3 = this.e & 7;
            if (i3 == 1) {
                do {
                    gm1.e(F());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = b0();
                V(b0);
                int i4 = this.c + b0;
                while (this.c < i4) {
                    gm1.e(h0());
                }
            } else {
                throw sl1.f();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(F()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i5 == 2) {
                int b02 = b0();
                V(b02);
                int i6 = this.c + b02;
                while (this.c < i6) {
                    list.add(Long.valueOf(h0()));
                }
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void g(List<bk1> list) throws IOException {
        int i;
        if ((this.e & 7) == 2) {
            do {
                list.add(u());
                if (!Z()) {
                    i = this.c;
                } else {
                    return;
                }
            } while (b0() == this.e);
            this.c = i;
            return;
        }
        throw sl1.f();
    }

    @Override // defpackage.hn1
    public final void h(List<String> list) throws IOException {
        S(list, true);
    }

    @Override // defpackage.hn1
    public final void i(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    ll1.e(P());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    ll1.e(b0());
                }
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(P()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Integer.valueOf(b0()));
                }
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void j(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    ll1.e(K());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    ll1.e(b0());
                }
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(K()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Integer.valueOf(b0()));
                }
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final String k() throws IOException {
        return i0(false);
    }

    @Override // defpackage.hn1
    public final void l(List<String> list) throws IOException {
        S(list, false);
    }

    @Override // defpackage.hn1
    public final void m(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof gm1) {
            gm1 gm1 = (gm1) list;
            int i3 = this.e & 7;
            if (i3 == 1) {
                do {
                    gm1.e(t());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = b0();
                V(b0);
                int i4 = this.c + b0;
                while (this.c < i4) {
                    gm1.e(h0());
                }
            } else {
                throw sl1.f();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(t()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i5 == 2) {
                int b02 = b0();
                V(b02);
                int i6 = this.c + b02;
                while (this.c < i6) {
                    list.add(Long.valueOf(h0()));
                }
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void n(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i3 = this.e & 7;
            if (i3 == 0) {
                do {
                    ll1.e(C());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else if (i3 == 2) {
                int b0 = this.c + b0();
                while (this.c < b0) {
                    ll1.e(b0());
                }
                X(b0);
            } else {
                throw sl1.f();
            }
        } else {
            int i4 = this.e & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(C()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else if (i4 == 2) {
                int b02 = this.c + b0();
                while (this.c < b02) {
                    list.add(Integer.valueOf(b0()));
                }
                X(b02);
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final void o(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof ll1) {
            ll1 ll1 = (ll1) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int b0 = b0();
                W(b0);
                int i4 = this.c + b0;
                while (this.c < i4) {
                    ll1.e(g0());
                }
            } else if (i3 == 5) {
                do {
                    ll1.e(E());
                    if (!Z()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i2;
            } else {
                throw sl1.f();
            }
        } else {
            int i5 = this.e & 7;
            if (i5 == 2) {
                int b02 = b0();
                W(b02);
                int i6 = this.c + b02;
                while (this.c < i6) {
                    list.add(Integer.valueOf(g0()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(E()));
                    if (!Z()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (b0() == this.e);
                this.c = i;
            } else {
                throw sl1.f();
            }
        }
    }

    @Override // defpackage.hn1
    public final int p() throws IOException {
        if (Z()) {
            return C0188.f24;
        }
        int b0 = b0();
        this.e = b0;
        if (b0 == this.f) {
            return C0188.f24;
        }
        return b0 >>> 3;
    }

    @Override // defpackage.hn1
    public final <T> T q(in1<T> in1, wk1 wk1) throws IOException {
        U(2);
        return (T) Y(in1, wk1);
    }

    @Override // defpackage.hn1
    public final String r() throws IOException {
        return i0(true);
    }

    @Override // defpackage.hn1
    public final double readDouble() throws IOException {
        U(1);
        return Double.longBitsToDouble(f0());
    }

    @Override // defpackage.hn1
    public final float readFloat() throws IOException {
        U(5);
        return Float.intBitsToFloat(e0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
    @Override // defpackage.hn1
    public final boolean s() throws IOException {
        int i;
        int i2;
        if (Z() || (i = this.e) == (i2 = this.f)) {
            return false;
        }
        int i3 = i & 7;
        if (i3 == 0) {
            int i4 = this.d;
            int i5 = this.c;
            if (i4 - i5 >= 10) {
                byte[] bArr = this.b;
                int i6 = 0;
                while (true) {
                    if (i6 >= 10) {
                        break;
                    }
                    int i7 = i5 + 1;
                    if (bArr[i5] >= 0) {
                        this.c = i7;
                        break;
                    }
                    i6++;
                    i5 = i7;
                }
                return true;
            }
            for (int i8 = 0; i8 < 10; i8++) {
                if (Q() >= 0) {
                    return true;
                }
            }
            throw sl1.c();
        } else if (i3 == 1) {
            j0(8);
            return true;
        } else if (i3 == 2) {
            j0(b0());
            return true;
        } else if (i3 == 3) {
            this.f = ((i >>> 3) << 3) | 4;
            while (p() != Integer.MAX_VALUE && s()) {
                while (p() != Integer.MAX_VALUE) {
                    while (p() != Integer.MAX_VALUE) {
                    }
                }
            }
            if (this.e == this.f) {
                this.f = i2;
                return true;
            }
            throw sl1.h();
        } else if (i3 == 5) {
            j0(4);
            return true;
        } else {
            throw sl1.f();
        }
    }

    @Override // defpackage.hn1
    public final long t() throws IOException {
        U(1);
        return f0();
    }

    @Override // defpackage.hn1
    public final bk1 u() throws IOException {
        bk1 bk1;
        U(2);
        int b0 = b0();
        if (b0 == 0) {
            return bk1.b;
        }
        T(b0);
        if (this.a) {
            bk1 = bk1.k(this.b, this.c, b0);
        } else {
            bk1 = bk1.i(this.b, this.c, b0);
        }
        this.c += b0;
        return bk1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final <T> void v(List<T> list, in1<T> in1, wk1 wk1) throws IOException {
        int i;
        int i2 = this.e;
        if ((i2 & 7) == 2) {
            do {
                list.add(Y(in1, wk1));
                if (!Z()) {
                    i = this.c;
                } else {
                    return;
                }
            } while (b0() == i2);
            this.c = i;
            return;
        }
        throw sl1.f();
    }

    @Override // defpackage.hn1
    public final <T> T w(Class<T> cls, wk1 wk1) throws IOException {
        U(2);
        return (T) Y(fn1.b().a(cls), wk1);
    }

    @Override // defpackage.hn1
    public final int x() throws IOException {
        U(5);
        return e0();
    }

    @Override // defpackage.hn1
    public final <T> T y(in1<T> in1, wk1 wk1) throws IOException {
        U(3);
        return (T) a0(in1, wk1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hn1
    public final <K, V> void z(Map<K, V> map, lm1<K, V> lm1, wk1 wk1) throws IOException {
        U(2);
        int b0 = b0();
        T(b0);
        int i = this.d;
        this.d = this.c + b0;
        try {
            Object obj = lm1.b;
            Object obj2 = lm1.d;
            while (true) {
                int p = p();
                if (p != Integer.MAX_VALUE) {
                    String r6 = C0201.m82(7530);
                    if (p == 1) {
                        obj = R(lm1.a, null, null);
                    } else if (p != 2) {
                        try {
                            if (!s()) {
                                throw new sl1(r6);
                            }
                        } catch (tl1 unused) {
                            if (!s()) {
                                throw new sl1(r6);
                            }
                        }
                    } else {
                        obj2 = R(lm1.c, lm1.d.getClass(), wk1);
                    }
                } else {
                    map.put(obj, obj2);
                    return;
                }
            }
        } finally {
            this.d = i;
        }
    }
}
