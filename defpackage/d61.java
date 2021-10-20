package defpackage;

import defpackage.l91;
import java.util.List;
import vigqyno.C0201;

/* renamed from: d61  reason: default package */
public final class d61 extends l91<d61, a> implements ya1 {
    private static volatile fb1<d61> zzuo;
    private static final d61 zzyz;
    private t91 zzyv = l91.A();
    private t91 zzyw = l91.A();
    private s91<w51> zzyx = l91.B();
    private s91<e61> zzyy = l91.B();

    /* renamed from: d61$a */
    public static final class a extends l91.a<d61, a> implements ya1 {
        private a() {
            super(d61.zzyz);
        }

        public final a B() {
            q();
            ((d61) this.b).W();
            return this;
        }

        public final a C() {
            q();
            ((d61) this.b).Z();
            return this;
        }

        public final a u(int i) {
            q();
            ((d61) this.b).G(i);
            return this;
        }

        public final a v(int i) {
            q();
            ((d61) this.b).I(i);
            return this;
        }

        public final a w(Iterable<? extends Long> iterable) {
            q();
            ((d61) this.b).Q(iterable);
            return this;
        }

        public final a x(Iterable<? extends Long> iterable) {
            q();
            ((d61) this.b).R(iterable);
            return this;
        }

        public final a y(Iterable<? extends w51> iterable) {
            q();
            ((d61) this.b).S(iterable);
            return this;
        }

        public final a z(Iterable<? extends e61> iterable) {
            q();
            ((d61) this.b).T(iterable);
            return this;
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        d61 d61 = new d61();
        zzyz = d61;
        l91.t(d61.class, d61);
    }

    private d61() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void G(int i) {
        c0();
        this.zzyx.remove(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void I(int i) {
        f0();
        this.zzyy.remove(i);
    }

    public static d61 P(byte[] bArr, y81 y81) throws v91 {
        return (d61) l91.n(zzyz, bArr, y81);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void Q(Iterable<? extends Long> iterable) {
        if (!this.zzyv.n0()) {
            this.zzyv = l91.p(this.zzyv);
        }
        s71.i(iterable, this.zzyv);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void R(Iterable<? extends Long> iterable) {
        if (!this.zzyw.n0()) {
            this.zzyw = l91.p(this.zzyw);
        }
        s71.i(iterable, this.zzyw);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void S(Iterable<? extends w51> iterable) {
        c0();
        s71.i(iterable, this.zzyx);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void T(Iterable<? extends e61> iterable) {
        f0();
        s71.i(iterable, this.zzyy);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void W() {
        this.zzyv = l91.A();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void Z() {
        this.zzyw = l91.A();
    }

    private final void c0() {
        if (!this.zzyx.n0()) {
            this.zzyx = l91.o(this.zzyx);
        }
    }

    private final void f0() {
        if (!this.zzyy.n0()) {
            this.zzyy = l91.o(this.zzyy);
        }
    }

    public static a g0() {
        return (a) zzyz.x();
    }

    public static d61 h0() {
        return zzyz;
    }

    public final w51 F(int i) {
        return this.zzyx.get(i);
    }

    public final e61 H(int i) {
        return this.zzyy.get(i);
    }

    public final List<Long> U() {
        return this.zzyv;
    }

    public final int V() {
        return this.zzyv.size();
    }

    public final List<Long> X() {
        return this.zzyw;
    }

    public final int Y() {
        return this.zzyw.size();
    }

    public final List<w51> a0() {
        return this.zzyx;
    }

    public final int b0() {
        return this.zzyx.size();
    }

    public final List<e61> d0() {
        return this.zzyy;
    }

    public final int e0() {
        return this.zzyy.size();
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new d61();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzyz, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{C0201.m82(2485), C0201.m82(2486), C0201.m82(2487), w51.class, C0201.m82(2488), e61.class});
            case 4:
                return zzyz;
            case 5:
                fb1<d61> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (d61.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzyz);
                            zzuo = fb1;
                        }
                    }
                }
                return fb1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
