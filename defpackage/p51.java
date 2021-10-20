package defpackage;

import defpackage.l91;
import java.util.List;
import vigqyno.C0201;

/* renamed from: p51  reason: default package */
public final class p51 extends l91<p51, b> implements ya1 {
    private static volatile fb1<p51> zzuo;
    private static final p51 zzvp;
    private int zzue;
    private int zzvl;
    private String zzvm = C0201.m82(32744);
    private boolean zzvn;
    private s91<String> zzvo = l91.B();

    /* renamed from: p51$a */
    public enum a implements p91 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        private final int a;

        private a(int i2) {
            this.a = i2;
        }

        public static a b(int i2) {
            switch (i2) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static r91 d() {
            return r51.a;
        }

        @Override // defpackage.p91
        public final int c() {
            return this.a;
        }
    }

    /* renamed from: p51$b */
    public static final class b extends l91.a<p51, b> implements ya1 {
        private b() {
            super(p51.zzvp);
        }

        public /* synthetic */ b(k51 k51) {
            this();
        }
    }

    static {
        p51 p51 = new p51();
        zzvp = p51;
        l91.t(p51.class, p51);
    }

    private p51() {
    }

    public static p51 L() {
        return zzvp;
    }

    public final boolean C() {
        return (this.zzue & 1) != 0;
    }

    public final a D() {
        a b2 = a.b(this.zzvl);
        return b2 == null ? a.UNKNOWN_MATCH_TYPE : b2;
    }

    public final boolean F() {
        return (this.zzue & 2) != 0;
    }

    public final String G() {
        return this.zzvm;
    }

    public final boolean H() {
        return (this.zzue & 4) != 0;
    }

    public final boolean I() {
        return this.zzvn;
    }

    public final List<String> J() {
        return this.zzvo;
    }

    public final int K() {
        return this.zzvo.size();
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (k51.a[i - 1]) {
            case 1:
                return new p51();
            case 2:
                return new b(null);
            case 3:
                return l91.r(zzvp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{C0201.m82(32745), C0201.m82(32746), a.d(), C0201.m82(32747), C0201.m82(32748), C0201.m82(32749)});
            case 4:
                return zzvp;
            case 5:
                fb1<p51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (p51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzvp);
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
