package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: n51  reason: default package */
public final class n51 extends l91<n51, a> implements ya1 {
    private static volatile fb1<n51> zzuo;
    private static final n51 zzuz;
    private int zzue;
    private int zzuu;
    private boolean zzuv;
    private String zzuw;
    private String zzux;
    private String zzuy;

    /* renamed from: n51$a */
    public static final class a extends l91.a<n51, a> implements ya1 {
        private a() {
            super(n51.zzuz);
        }

        public /* synthetic */ a(k51 k51) {
            this();
        }
    }

    /* renamed from: n51$b */
    public enum b implements p91 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        private final int a;

        private b(int i) {
            this.a = i;
        }

        public static b b(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static r91 d() {
            return q51.a;
        }

        @Override // defpackage.p91
        public final int c() {
            return this.a;
        }
    }

    static {
        n51 n51 = new n51();
        zzuz = n51;
        l91.t(n51.class, n51);
    }

    private n51() {
        String r0 = C0201.m82(7923);
        this.zzuw = r0;
        this.zzux = r0;
        this.zzuy = r0;
    }

    public static n51 N() {
        return zzuz;
    }

    public final boolean C() {
        return (this.zzue & 1) != 0;
    }

    public final b D() {
        b b2 = b.b(this.zzuu);
        return b2 == null ? b.UNKNOWN_COMPARISON_TYPE : b2;
    }

    public final boolean F() {
        return (this.zzue & 2) != 0;
    }

    public final boolean G() {
        return this.zzuv;
    }

    public final boolean H() {
        return (this.zzue & 4) != 0;
    }

    public final String I() {
        return this.zzuw;
    }

    public final boolean J() {
        return (this.zzue & 8) != 0;
    }

    public final String K() {
        return this.zzux;
    }

    public final boolean L() {
        return (this.zzue & 16) != 0;
    }

    public final String M() {
        return this.zzuy;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (k51.a[i - 1]) {
            case 1:
                return new n51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzuz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{C0201.m82(7924), C0201.m82(7925), b.d(), C0201.m82(7926), C0201.m82(7927), C0201.m82(7928), C0201.m82(7929)});
            case 4:
                return zzuz;
            case 5:
                fb1<n51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (n51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzuz);
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
