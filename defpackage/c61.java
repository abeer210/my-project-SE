package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: c61  reason: default package */
public final class c61 extends l91<c61, a> implements ya1 {
    private static volatile fb1<c61> zzuo;
    private static final c61 zzyr;
    private int zzue;
    private int zzyp = 1;
    private s91<y51> zzyq = l91.B();

    /* renamed from: c61$a */
    public static final class a extends l91.a<c61, a> implements ya1 {
        private a() {
            super(c61.zzyr);
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    /* renamed from: c61$b */
    public enum b implements p91 {
        RADS(1),
        PROVISIONING(2);
        
        private final int a;

        private b(int i) {
            this.a = i;
        }

        public static b b(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static r91 d() {
            return g61.a;
        }

        @Override // defpackage.p91
        public final int c() {
            return this.a;
        }
    }

    static {
        c61 c61 = new c61();
        zzyr = c61;
        l91.t(c61.class, c61);
    }

    private c61() {
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new c61();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzyr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{C0201.m82(9896), C0201.m82(9897), b.d(), C0201.m82(9898), y51.class});
            case 4:
                return zzyr;
            case 5:
                fb1<c61> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (c61.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzyr);
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
