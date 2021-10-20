package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: t51  reason: default package */
public final class t51 extends l91<t51, a> implements ya1 {
    private static volatile fb1<t51> zzuo;
    private static final t51 zzwa;
    private int zzue;
    private String zzvy;
    private String zzvz;

    /* renamed from: t51$a */
    public static final class a extends l91.a<t51, a> implements ya1 {
        private a() {
            super(t51.zzwa);
        }

        public /* synthetic */ a(s51 s51) {
            this();
        }
    }

    static {
        t51 t51 = new t51();
        zzwa = t51;
        l91.t(t51.class, t51);
    }

    private t51() {
        String r0 = C0201.m82(3766);
        this.zzvy = r0;
        this.zzvz = r0;
    }

    public static fb1<t51> F() {
        return (fb1) zzwa.q(l91.d.g, null, null);
    }

    public final String C() {
        return this.zzvy;
    }

    public final String D() {
        return this.zzvz;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (s51.a[i - 1]) {
            case 1:
                return new t51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzwa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{C0201.m82(3767), C0201.m82(3768), C0201.m82(3769)});
            case 4:
                return zzwa;
            case 5:
                fb1<t51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (t51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzwa);
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
