package defpackage;

import defpackage.l91;
import vigqyno.C0201;

/* renamed from: w51  reason: default package */
public final class w51 extends l91<w51, a> implements ya1 {
    private static volatile fb1<w51> zzuo;
    private static final w51 zzwi;
    private int zzue;
    private int zzwg;
    private long zzwh;

    /* renamed from: w51$a */
    public static final class a extends l91.a<w51, a> implements ya1 {
        private a() {
            super(w51.zzwi);
        }

        public final a u(long j) {
            q();
            ((w51) this.b).H(j);
            return this;
        }

        public final a v(int i) {
            q();
            ((w51) this.b).D(i);
            return this;
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        w51 w51 = new w51();
        zzwi = w51;
        l91.t(w51.class, w51);
    }

    private w51() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void D(int i) {
        this.zzue |= 1;
        this.zzwg = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void H(long j) {
        this.zzue |= 2;
        this.zzwh = j;
    }

    public static a L() {
        return (a) zzwi.x();
    }

    public final int C() {
        return this.zzwg;
    }

    public final boolean I() {
        return (this.zzue & 1) != 0;
    }

    public final boolean J() {
        return (this.zzue & 2) != 0;
    }

    public final long K() {
        return this.zzwh;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new w51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzwi, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{C0201.m82(17557), C0201.m82(17558), C0201.m82(17559)});
            case 4:
                return zzwi;
            case 5:
                fb1<w51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (w51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzwi);
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
