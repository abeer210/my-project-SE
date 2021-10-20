package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: m51  reason: default package */
public final class m51 extends l91<m51, a> implements ya1 {
    private static volatile fb1<m51> zzuo;
    private static final m51 zzut;
    private int zzue;
    private p51 zzup;
    private n51 zzuq;
    private boolean zzur;
    private String zzus = C0201.m82(15009);

    /* renamed from: m51$a */
    public static final class a extends l91.a<m51, a> implements ya1 {
        private a() {
            super(m51.zzut);
        }

        public final a u(String str) {
            q();
            ((m51) this.b).D(str);
            return this;
        }

        public /* synthetic */ a(k51 k51) {
            this();
        }
    }

    static {
        m51 m51 = new m51();
        zzut = m51;
        l91.t(m51.class, m51);
    }

    private m51() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void D(String str) {
        if (str != null) {
            this.zzue |= 8;
            this.zzus = str;
            return;
        }
        throw null;
    }

    public static m51 M() {
        return zzut;
    }

    public final boolean F() {
        return (this.zzue & 1) != 0;
    }

    public final p51 G() {
        p51 p51 = this.zzup;
        return p51 == null ? p51.L() : p51;
    }

    public final boolean H() {
        return (this.zzue & 2) != 0;
    }

    public final n51 I() {
        n51 n51 = this.zzuq;
        return n51 == null ? n51.N() : n51;
    }

    public final boolean J() {
        return (this.zzue & 4) != 0;
    }

    public final boolean K() {
        return this.zzur;
    }

    public final String L() {
        return this.zzus;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (k51.a[i - 1]) {
            case 1:
                return new m51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzut, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{C0201.m82(15010), C0201.m82(15011), C0201.m82(15012), C0201.m82(15013), C0201.m82(15014)});
            case 4:
                return zzut;
            case 5:
                fb1<m51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (m51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzut);
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
