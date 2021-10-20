package defpackage;

import defpackage.kv0;
import java.util.List;
import vigqyno.C0201;

/* renamed from: nz0  reason: default package */
public final class nz0 extends kv0<nz0, a> implements sw0 {
    private static volatile bx0<nz0> zzbg;
    private static final nz0 zzbir;
    private pv0<b> zzbiq = kv0.r();

    /* renamed from: nz0$a */
    public static final class a extends kv0.a<nz0, a> implements sw0 {
        private a() {
            super(nz0.zzbir);
        }

        public /* synthetic */ a(oz0 oz0) {
            this();
        }
    }

    /* renamed from: nz0$b */
    public static final class b extends kv0<b, a> implements sw0 {
        private static volatile bx0<b> zzbg;
        private static final b zzbiv;
        private int zzbb;
        private String zzbis = C0201.m82(31568);
        private long zzbit;
        private long zzbiu;
        private int zzya;

        /* renamed from: nz0$b$a */
        public static final class a extends kv0.a<b, a> implements sw0 {
            private a() {
                super(b.zzbiv);
            }

            public /* synthetic */ a(oz0 oz0) {
                this();
            }

            public final a q(String str) {
                m();
                ((b) this.b).E(str);
                return this;
            }

            public final a s(long j) {
                m();
                ((b) this.b).F(j);
                return this;
            }

            public final a t(long j) {
                m();
                ((b) this.b).G(j);
                return this;
            }
        }

        static {
            b bVar = new b();
            zzbiv = bVar;
            kv0.o(b.class, bVar);
        }

        private b() {
        }

        public static a C() {
            return (a) ((kv0.a) zzbiv.l(kv0.e.e, null, null));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void E(String str) {
            if (str != null) {
                this.zzbb |= 2;
                this.zzbis = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void F(long j) {
            this.zzbb |= 4;
            this.zzbit = j;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void G(long j) {
            this.zzbb |= 8;
            this.zzbiu = j;
        }

        public final long B() {
            return this.zzbiu;
        }

        /* JADX WARN: Type inference failed for: r3v14, types: [kv0$b, bx0<nz0$b>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // defpackage.kv0
        public final Object l(int i, Object obj, Object obj2) {
            bx0<b> bx0;
            switch (oz0.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return kv0.m(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{C0201.m82(31569), C0201.m82(31570), C0201.m82(31571), C0201.m82(31572), C0201.m82(31573)});
                case 4:
                    return zzbiv;
                case 5:
                    bx0<b> bx02 = zzbg;
                    bx0<b> bx03 = bx02;
                    if (bx02 == null) {
                        synchronized (b.class) {
                            bx0<b> bx04 = zzbg;
                            bx0 = bx04;
                            if (bx04 == null) {
                                ?? bVar = new kv0.b(zzbiv);
                                zzbg = bVar;
                                bx0 = bVar;
                            }
                        }
                        bx03 = bx0;
                    }
                    return bx03;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int t() {
            return this.zzya;
        }

        public final boolean x() {
            return (this.zzbb & 1) == 1;
        }

        public final String y() {
            return this.zzbis;
        }

        public final long z() {
            return this.zzbit;
        }
    }

    static {
        nz0 nz0 = new nz0();
        zzbir = nz0;
        kv0.o(nz0.class, nz0);
    }

    private nz0() {
    }

    public static nz0 u() {
        return zzbir;
    }

    public static nz0 w(byte[] bArr) throws qv0 {
        return (nz0) kv0.q(zzbir, bArr);
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [bx0<nz0>, kv0$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.kv0
    public final Object l(int i, Object obj, Object obj2) {
        bx0<nz0> bx0;
        switch (oz0.a[i - 1]) {
            case 1:
                return new nz0();
            case 2:
                return new a(null);
            case 3:
                return kv0.m(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{C0201.m82(9748), b.class});
            case 4:
                return zzbir;
            case 5:
                bx0<nz0> bx02 = zzbg;
                bx0<nz0> bx03 = bx02;
                if (bx02 == null) {
                    synchronized (nz0.class) {
                        bx0<nz0> bx04 = zzbg;
                        bx0 = bx04;
                        if (bx04 == null) {
                            ?? bVar = new kv0.b(zzbir);
                            zzbg = bVar;
                            bx0 = bVar;
                        }
                    }
                    bx03 = bx0;
                }
                return bx03;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final List<b> t() {
        return this.zzbiq;
    }
}
