package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: y51  reason: default package */
public final class y51 extends l91<y51, a> implements ya1 {
    private static volatile fb1<y51> zzuo;
    private static final y51 zzwq;
    private int zzue;
    private String zzwk = C0201.m82(7831);
    private long zzwp;

    /* renamed from: y51$a */
    public static final class a extends l91.a<y51, a> implements ya1 {
        private a() {
            super(y51.zzwq);
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        y51 y51 = new y51();
        zzwq = y51;
        l91.t(y51.class, y51);
    }

    private y51() {
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new y51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzwq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{C0201.m82(7832), C0201.m82(7833), C0201.m82(7834)});
            case 4:
                return zzwq;
            case 5:
                fb1<y51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (y51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzwq);
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
