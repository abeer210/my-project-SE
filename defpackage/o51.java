package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: o51  reason: default package */
public final class o51 extends l91<o51, a> implements ya1 {
    private static volatile fb1<o51> zzuo;
    private static final o51 zzvj;
    private int zzue;
    private int zzuf;
    private boolean zzuk;
    private boolean zzul;
    private boolean zzum;
    private String zzvh = C0201.m82(35199);
    private m51 zzvi;

    /* renamed from: o51$a */
    public static final class a extends l91.a<o51, a> implements ya1 {
        private a() {
            super(o51.zzvj);
        }

        public final a u(String str) {
            q();
            ((o51) this.b).F(str);
            return this;
        }

        public /* synthetic */ a(k51 k51) {
            this();
        }
    }

    static {
        o51 o51 = new o51();
        zzvj = o51;
        l91.t(o51.class, o51);
    }

    private o51() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void F(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzvh = str;
            return;
        }
        throw null;
    }

    public static o51 H(byte[] bArr, y81 y81) throws v91 {
        return (o51) l91.n(zzvj, bArr, y81);
    }

    public static fb1<o51> N() {
        return (fb1) zzvj.q(l91.d.g, null, null);
    }

    public final int C() {
        return this.zzuf;
    }

    public final String D() {
        return this.zzvh;
    }

    public final boolean I() {
        return (this.zzue & 1) != 0;
    }

    public final boolean J() {
        return this.zzuk;
    }

    public final boolean K() {
        return this.zzul;
    }

    public final boolean L() {
        return (this.zzue & 32) != 0;
    }

    public final boolean M() {
        return this.zzum;
    }

    public final m51 O() {
        m51 m51 = this.zzvi;
        return m51 == null ? m51.M() : m51;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (k51.a[i - 1]) {
            case 1:
                return new o51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzvj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{C0201.m82(35200), C0201.m82(35201), C0201.m82(35202), C0201.m82(35203), C0201.m82(35204), C0201.m82(35205), C0201.m82(35206)});
            case 4:
                return zzvj;
            case 5:
                fb1<o51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (o51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzvj);
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
