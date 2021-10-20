package defpackage;

import defpackage.l91;
import java.util.List;
import vigqyno.C0201;

/* renamed from: l51  reason: default package */
public final class l51 extends l91<l51, a> implements ya1 {
    private static final l51 zzun;
    private static volatile fb1<l51> zzuo;
    private int zzue;
    private int zzuf;
    private String zzug = C0201.m82(17187);
    private s91<m51> zzuh = l91.B();
    private boolean zzui;
    private n51 zzuj;
    private boolean zzuk;
    private boolean zzul;
    private boolean zzum;

    /* renamed from: l51$a */
    public static final class a extends l91.a<l51, a> implements ya1 {
        private a() {
            super(l51.zzun);
        }

        public final a u(int i, m51 m51) {
            q();
            ((l51) this.b).H(i, m51);
            return this;
        }

        public final a v(String str) {
            q();
            ((l51) this.b).I(str);
            return this;
        }

        public final m51 w(int i) {
            return ((l51) this.b).J(i);
        }

        public final String x() {
            return ((l51) this.b).K();
        }

        public final int y() {
            return ((l51) this.b).L();
        }

        public /* synthetic */ a(k51 k51) {
            this();
        }
    }

    static {
        l51 l51 = new l51();
        zzun = l51;
        l91.t(l51.class, l51);
    }

    private l51() {
    }

    public static l51 D(byte[] bArr, y81 y81) throws v91 {
        return (l51) l91.n(zzun, bArr, y81);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void H(int i, m51 m51) {
        if (m51 != null) {
            if (!this.zzuh.n0()) {
                this.zzuh = l91.o(this.zzuh);
            }
            this.zzuh.set(i, m51);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void I(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzug = str;
            return;
        }
        throw null;
    }

    public static fb1<l51> U() {
        return (fb1) zzun.q(l91.d.g, null, null);
    }

    public final int C() {
        return this.zzuf;
    }

    public final m51 J(int i) {
        return this.zzuh.get(i);
    }

    public final String K() {
        return this.zzug;
    }

    public final int L() {
        return this.zzuh.size();
    }

    public final boolean M() {
        return (this.zzue & 1) != 0;
    }

    public final List<m51> N() {
        return this.zzuh;
    }

    public final boolean O() {
        return (this.zzue & 8) != 0;
    }

    public final n51 P() {
        n51 n51 = this.zzuj;
        return n51 == null ? n51.N() : n51;
    }

    public final boolean Q() {
        return this.zzuk;
    }

    public final boolean R() {
        return this.zzul;
    }

    public final boolean S() {
        return (this.zzue & 64) != 0;
    }

    public final boolean T() {
        return this.zzum;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (k51.a[i - 1]) {
            case 1:
                return new l51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzun, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{C0201.m82(17188), C0201.m82(17189), C0201.m82(17190), C0201.m82(17191), m51.class, C0201.m82(17192), C0201.m82(17193), C0201.m82(17194), C0201.m82(17195), C0201.m82(17196)});
            case 4:
                return zzun;
            case 5:
                fb1<l51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (l51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzun);
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
