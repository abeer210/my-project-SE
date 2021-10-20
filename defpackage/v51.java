package defpackage;

import defpackage.d61;
import defpackage.l91;
import vigqyno.C0201;

/* renamed from: v51  reason: default package */
public final class v51 extends l91<v51, a> implements ya1 {
    private static volatile fb1<v51> zzuo;
    private static final v51 zzwf;
    private int zzue;
    private int zzwb;
    private d61 zzwc;
    private d61 zzwd;
    private boolean zzwe;

    /* renamed from: v51$a */
    public static final class a extends l91.a<v51, a> implements ya1 {
        private a() {
            super(v51.zzwf);
        }

        public final d61 B() {
            return ((v51) this.b).N();
        }

        public final a u(d61.a aVar) {
            q();
            ((v51) this.b).H(aVar);
            return this;
        }

        public final a v(d61 d61) {
            q();
            ((v51) this.b).I(d61);
            return this;
        }

        public final a w(int i) {
            q();
            ((v51) this.b).J(i);
            return this;
        }

        public final a x(boolean z) {
            q();
            ((v51) this.b).K(z);
            return this;
        }

        public final d61 y() {
            return ((v51) this.b).L();
        }

        public final boolean z() {
            return ((v51) this.b).M();
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        v51 v51 = new v51();
        zzwf = v51;
        l91.t(v51.class, v51);
    }

    private v51() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void H(d61.a aVar) {
        this.zzwc = (d61) ((l91) aVar.G0());
        this.zzue |= 2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void I(d61 d61) {
        if (d61 != null) {
            this.zzwd = d61;
            this.zzue |= 4;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void J(int i) {
        this.zzue |= 1;
        this.zzwb = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void K(boolean z) {
        this.zzue |= 8;
        this.zzwe = z;
    }

    public static a S() {
        return (a) zzwf.x();
    }

    public final d61 L() {
        d61 d61 = this.zzwc;
        return d61 == null ? d61.h0() : d61;
    }

    public final boolean M() {
        return (this.zzue & 4) != 0;
    }

    public final d61 N() {
        d61 d61 = this.zzwd;
        return d61 == null ? d61.h0() : d61;
    }

    public final boolean O() {
        return (this.zzue & 1) != 0;
    }

    public final int P() {
        return this.zzwb;
    }

    public final boolean Q() {
        return (this.zzue & 8) != 0;
    }

    public final boolean R() {
        return this.zzwe;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new v51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzwf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{C0201.m82(29381), C0201.m82(29382), C0201.m82(29383), C0201.m82(29384), C0201.m82(29385)});
            case 4:
                return zzwf;
            case 5:
                fb1<v51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (v51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzwf);
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
