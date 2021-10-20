package defpackage;

import defpackage.b61;
import defpackage.l91;
import java.util.List;
import vigqyno.C0201;

/* renamed from: a61  reason: default package */
public final class a61 extends l91<a61, a> implements ya1 {
    private static volatile fb1<a61> zzuo;
    private static final a61 zzww;
    private s91<b61> zzwv = l91.B();

    /* renamed from: a61$a */
    public static final class a extends l91.a<a61, a> implements ya1 {
        private a() {
            super(a61.zzww);
        }

        public final a u(b61.a aVar) {
            q();
            ((a61) this.b).D(aVar);
            return this;
        }

        public final b61 v(int i) {
            return ((a61) this.b).I(0);
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        a61 a61 = new a61();
        zzww = a61;
        l91.t(a61.class, a61);
    }

    private a61() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void D(b61.a aVar) {
        if (!this.zzwv.n0()) {
            this.zzwv = l91.o(this.zzwv);
        }
        this.zzwv.add((b61) ((l91) aVar.G0()));
    }

    public static a G() {
        return (a) zzww.x();
    }

    public final List<b61> F() {
        return this.zzwv;
    }

    public final b61 I(int i) {
        return this.zzwv.get(0);
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new a61();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzww, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{C0201.m82(24937), b61.class});
            case 4:
                return zzww;
            case 5:
                fb1<a61> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (a61.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzww);
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
