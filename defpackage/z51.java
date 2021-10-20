package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: z51  reason: default package */
public final class z51 extends l91<z51, a> implements ya1 {
    private static volatile fb1<z51> zzuo;
    private static final z51 zzwu;
    private int zzue;
    private String zzwk;
    private long zzwp;
    private String zzwr;
    private float zzws;
    private double zzwt;

    /* renamed from: z51$a */
    public static final class a extends l91.a<z51, a> implements ya1 {
        private a() {
            super(z51.zzwu);
        }

        public final a B() {
            q();
            ((z51) this.b).X();
            return this;
        }

        public final a u(double d) {
            q();
            ((z51) this.b).J(d);
            return this;
        }

        public final a v(long j) {
            q();
            ((z51) this.b).I(j);
            return this;
        }

        public final a w(String str) {
            q();
            ((z51) this.b).D(str);
            return this;
        }

        public final a x(String str) {
            q();
            ((z51) this.b).M(str);
            return this;
        }

        public final a y() {
            q();
            ((z51) this.b).R();
            return this;
        }

        public final a z() {
            q();
            ((z51) this.b).U();
            return this;
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        z51 z51 = new z51();
        zzwu = z51;
        l91.t(z51.class, z51);
    }

    private z51() {
        String r0 = C0201.m82(35068);
        this.zzwk = r0;
        this.zzwr = r0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void D(String str) {
        if (str != null) {
            this.zzue |= 1;
            this.zzwk = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void I(long j) {
        this.zzue |= 4;
        this.zzwp = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void J(double d) {
        this.zzue |= 16;
        this.zzwt = d;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void M(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzwr = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void R() {
        this.zzue &= -3;
        this.zzwr = zzwu.zzwr;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void U() {
        this.zzue &= -5;
        this.zzwp = 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void X() {
        this.zzue &= -17;
        this.zzwt = 0.0d;
    }

    public static a Y() {
        return (a) zzwu.x();
    }

    public final String C() {
        return this.zzwk;
    }

    public final boolean P() {
        return (this.zzue & 2) != 0;
    }

    public final String Q() {
        return this.zzwr;
    }

    public final boolean S() {
        return (this.zzue & 4) != 0;
    }

    public final long T() {
        return this.zzwp;
    }

    public final boolean V() {
        return (this.zzue & 16) != 0;
    }

    public final double W() {
        return this.zzwt;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new z51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzwu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004", new Object[]{C0201.m82(35069), C0201.m82(35070), C0201.m82(35071), C0201.m82(35072), C0201.m82(35073), C0201.m82(35074)});
            case 4:
                return zzwu;
            case 5:
                fb1<z51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (z51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzwu);
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
