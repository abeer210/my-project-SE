package defpackage;

import defpackage.kv0;
import vigqyno.C0201;

/* renamed from: hz0  reason: default package */
public final class hz0 extends kv0<hz0, a> implements sw0 {
    private static volatile bx0<hz0> zzbg;
    private static final hz0 zztx;
    private int zzbb;
    private int zztu;
    private String zztv;
    private String zztw;

    /* renamed from: hz0$a */
    public static final class a extends kv0.a<hz0, a> implements sw0 {
        private a() {
            super(hz0.zztx);
        }

        public /* synthetic */ a(kz0 kz0) {
            this();
        }
    }

    static {
        hz0 hz0 = new hz0();
        zztx = hz0;
        kv0.o(hz0.class, hz0);
    }

    private hz0() {
        String r0 = C0201.m82(12983);
        this.zztv = r0;
        this.zztw = r0;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [kv0$b, bx0<hz0>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.kv0
    public final Object l(int i, Object obj, Object obj2) {
        bx0<hz0> bx0;
        switch (kz0.a[i - 1]) {
            case 1:
                return new hz0();
            case 2:
                return new a(null);
            case 3:
                return kv0.m(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{C0201.m82(12984), C0201.m82(12985), C0201.m82(12986), C0201.m82(12987)});
            case 4:
                return zztx;
            case 5:
                bx0<hz0> bx02 = zzbg;
                bx0<hz0> bx03 = bx02;
                if (bx02 == null) {
                    synchronized (hz0.class) {
                        bx0<hz0> bx04 = zzbg;
                        bx0 = bx04;
                        if (bx04 == null) {
                            ?? bVar = new kv0.b(zztx);
                            zzbg = bVar;
                            bx0 = bVar;
                        }
                    }
                    bx03 = bx0;
                }
                return bx03;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
