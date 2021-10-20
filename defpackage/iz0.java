package defpackage;

import defpackage.kv0;
import vigqyno.C0201;

/* renamed from: iz0  reason: default package */
public final class iz0 extends kv0<iz0, a> implements sw0 {
    private static final iz0 zzbfc;
    private static volatile bx0<iz0> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    /* renamed from: iz0$a */
    public static final class a extends kv0.a<iz0, a> implements sw0 {
        private a() {
            super(iz0.zzbfc);
        }

        public /* synthetic */ a(kz0 kz0) {
            this();
        }
    }

    /* renamed from: iz0$b */
    public enum b implements nv0 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final ov0<b> z = new lz0();
        private final int a;

        private b(int i) {
            this.a = i;
        }

        public static b b(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static ov0<b> d() {
            return z;
        }

        @Override // defpackage.nv0
        public final int u() {
            return this.a;
        }
    }

    /* renamed from: iz0$c */
    public enum c implements nv0 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        
        private static final ov0<c> x = new mz0();
        private final int a;

        private c(int i) {
            this.a = i;
        }

        public static c b(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static ov0<c> d() {
            return x;
        }

        @Override // defpackage.nv0
        public final int u() {
            return this.a;
        }
    }

    static {
        iz0 iz0 = new iz0();
        zzbfc = iz0;
        kv0.o(iz0.class, iz0);
    }

    private iz0() {
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [kv0$b, bx0<iz0>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.kv0
    public final Object l(int i, Object obj, Object obj2) {
        bx0<iz0> bx0;
        switch (kz0.a[i - 1]) {
            case 1:
                return new iz0();
            case 2:
                return new a(null);
            case 3:
                return kv0.m(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{C0201.m82(1121), C0201.m82(1122), c.d(), C0201.m82(1123), b.d()});
            case 4:
                return zzbfc;
            case 5:
                bx0<iz0> bx02 = zzbg;
                bx0<iz0> bx03 = bx02;
                if (bx02 == null) {
                    synchronized (iz0.class) {
                        bx0<iz0> bx04 = zzbg;
                        bx0 = bx04;
                        if (bx04 == null) {
                            ?? bVar = new kv0.b(zzbfc);
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
