package defpackage;

import defpackage.l91;
import java.util.List;
import vigqyno.C0201;

/* renamed from: e61  reason: default package */
public final class e61 extends l91<e61, a> implements ya1 {
    private static volatile fb1<e61> zzuo;
    private static final e61 zzzb;
    private int zzue;
    private int zzwg;
    private t91 zzza = l91.A();

    /* renamed from: e61$a */
    public static final class a extends l91.a<e61, a> implements ya1 {
        private a() {
            super(e61.zzzb);
        }

        public final a u(int i) {
            q();
            ((e61) this.b).D(i);
            return this;
        }

        public final a v(long j) {
            q();
            ((e61) this.b).K(j);
            return this;
        }

        public final a w() {
            q();
            ((e61) this.b).Q();
            return this;
        }

        public final a x(Iterable<? extends Long> iterable) {
            q();
            ((e61) this.b).L(iterable);
            return this;
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        e61 e61 = new e61();
        zzzb = e61;
        l91.t(e61.class, e61);
    }

    private e61() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void D(int i) {
        this.zzue |= 1;
        this.zzwg = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void K(long j) {
        P();
        this.zzza.N(j);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void L(Iterable<? extends Long> iterable) {
        P();
        s71.i(iterable, this.zzza);
    }

    private final void P() {
        if (!this.zzza.n0()) {
            this.zzza = l91.p(this.zzza);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void Q() {
        this.zzza = l91.A();
    }

    public static a R() {
        return (a) zzzb.x();
    }

    public final int C() {
        return this.zzwg;
    }

    public final long J(int i) {
        return this.zzza.getLong(i);
    }

    public final boolean M() {
        return (this.zzue & 1) != 0;
    }

    public final List<Long> N() {
        return this.zzza;
    }

    public final int O() {
        return this.zzza.size();
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new e61();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{C0201.m82(30542), C0201.m82(30543), C0201.m82(30544)});
            case 4:
                return zzzb;
            case 5:
                fb1<e61> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (e61.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzzb);
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
