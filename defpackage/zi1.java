package defpackage;

import defpackage.kl1;
import vigqyno.C0201;

/* renamed from: zi1  reason: default package */
public final class zi1 extends kl1<zi1, a> implements vm1 {
    private static volatile dn1<zi1> zzbf;
    private static final zi1 zznu;
    private int zzbg;
    private long zzmv;
    private long zzmw;

    /* renamed from: zi1$a */
    public static final class a extends kl1.a<zi1, a> implements vm1 {
        private a() {
            super(zi1.zznu);
        }

        public /* synthetic */ a(aj1 aj1) {
            this();
        }
    }

    static {
        zi1 zi1 = new zi1();
        zznu = zi1;
        kl1.n(zi1.class, zi1);
    }

    private zi1() {
    }

    public static dn1<zi1> s() {
        return (dn1) zznu.k(kl1.f.g, null, null);
    }

    @Override // defpackage.kl1
    public final Object k(int i, Object obj, Object obj2) {
        switch (aj1.a[i - 1]) {
            case 1:
                return new zi1();
            case 2:
                return new a(null);
            case 3:
                return kl1.l(zznu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001", new Object[]{C0201.m82(36111), C0201.m82(36112), C0201.m82(36113)});
            case 4:
                return zznu;
            case 5:
                dn1<zi1> dn1 = zzbf;
                if (dn1 == null) {
                    synchronized (zi1.class) {
                        dn1 = zzbf;
                        if (dn1 == null) {
                            dn1 = new kl1.b<>(zznu);
                            zzbf = dn1;
                        }
                    }
                }
                return dn1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
