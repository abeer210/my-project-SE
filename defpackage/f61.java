package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: f61  reason: default package */
public final class f61 extends l91<f61, a> implements ya1 {
    private static volatile fb1<f61> zzuo;
    private static final f61 zzzd;
    private int zzue;
    private String zzwk;
    private long zzwp;
    private String zzwr;
    private float zzws;
    private double zzwt;
    private long zzzc;

    /* renamed from: f61$a */
    public static final class a extends l91.a<f61, a> implements ya1 {
        private a() {
            super(f61.zzzd);
        }

        public final a B() {
            q();
            ((f61) this.b).W();
            return this;
        }

        public final a C() {
            q();
            ((f61) this.b).Z();
            return this;
        }

        public final a u(long j) {
            q();
            ((f61) this.b).M(j);
            return this;
        }

        public final a v(long j) {
            q();
            ((f61) this.b).I(j);
            return this;
        }

        public final a w(double d) {
            q();
            ((f61) this.b).J(d);
            return this;
        }

        public final a x(String str) {
            q();
            ((f61) this.b).D(str);
            return this;
        }

        public final a y(String str) {
            q();
            ((f61) this.b).O(str);
            return this;
        }

        public final a z() {
            q();
            ((f61) this.b).T();
            return this;
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        f61 f61 = new f61();
        zzzd = f61;
        l91.t(f61.class, f61);
    }

    private f61() {
        String r0 = C0201.m82(28591);
        this.zzwk = r0;
        this.zzwr = r0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void D(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzwk = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void I(long j) {
        this.zzue |= 8;
        this.zzwp = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void J(double d) {
        this.zzue |= 32;
        this.zzwt = d;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void M(long j) {
        this.zzue |= 1;
        this.zzzc = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void O(String str) {
        if (str != null) {
            this.zzue |= 4;
            this.zzwr = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void T() {
        this.zzue &= -5;
        this.zzwr = zzzd.zzwr;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void W() {
        this.zzue &= -9;
        this.zzwp = 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void Z() {
        this.zzue &= -33;
        this.zzwt = 0.0d;
    }

    public static a c0() {
        return (a) zzzd.x();
    }

    public final String C() {
        return this.zzwk;
    }

    public final boolean R() {
        return (this.zzue & 4) != 0;
    }

    public final String S() {
        return this.zzwr;
    }

    public final boolean U() {
        return (this.zzue & 8) != 0;
    }

    public final long V() {
        return this.zzwp;
    }

    public final boolean X() {
        return (this.zzue & 32) != 0;
    }

    public final double Y() {
        return this.zzwt;
    }

    public final boolean a0() {
        return (this.zzue & 1) != 0;
    }

    public final long b0() {
        return this.zzzc;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new f61();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{C0201.m82(28592), C0201.m82(28593), C0201.m82(28594), C0201.m82(28595), C0201.m82(28596), C0201.m82(28597), C0201.m82(28598)});
            case 4:
                return zzzd;
            case 5:
                fb1<f61> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (f61.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzzd);
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
