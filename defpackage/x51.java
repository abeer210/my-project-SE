package defpackage;

import defpackage.l91;
import defpackage.z51;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: x51  reason: default package */
public final class x51 extends l91<x51, a> implements ya1 {
    private static volatile fb1<x51> zzuo;
    private static final x51 zzwo;
    private int zzue;
    private s91<z51> zzwj = l91.B();
    private String zzwk = C0201.m82(14574);
    private long zzwl;
    private long zzwm;
    private int zzwn;

    /* renamed from: x51$a */
    public static final class a extends l91.a<x51, a> implements ya1 {
        private a() {
            super(x51.zzwo);
        }

        public final a B(long j) {
            q();
            ((x51) this.b).N(j);
            return this;
        }

        public final a C(long j) {
            q();
            ((x51) this.b).O(j);
            return this;
        }

        public final a D(String str) {
            q();
            ((x51) this.b).G(str);
            return this;
        }

        public final z51 F(int i) {
            return ((x51) this.b).W(i);
        }

        public final a G(int i) {
            q();
            ((x51) this.b).g0(i);
            return this;
        }

        public final List<z51> I() {
            return Collections.unmodifiableList(((x51) this.b).X());
        }

        public final int J() {
            return ((x51) this.b).Y();
        }

        public final long K() {
            return ((x51) this.b).a0();
        }

        public final String u() {
            return ((x51) this.b).D();
        }

        public final long v() {
            return ((x51) this.b).F();
        }

        public final a w(int i, z51.a aVar) {
            q();
            ((x51) this.b).P(i, aVar);
            return this;
        }

        public final a x(int i, z51 z51) {
            q();
            ((x51) this.b).Q(i, z51);
            return this;
        }

        public final a y(z51.a aVar) {
            q();
            ((x51) this.b).S(aVar);
            return this;
        }

        public final a z(z51 z51) {
            q();
            ((x51) this.b).T(z51);
            return this;
        }

        public /* synthetic */ a(u51 u51) {
            this();
        }
    }

    static {
        x51 x51 = new x51();
        zzwo = x51;
        l91.t(x51.class, x51);
    }

    private x51() {
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void G(String str) {
        if (str != null) {
            this.zzue |= 1;
            this.zzwk = str;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void N(long j) {
        this.zzue |= 2;
        this.zzwl = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void O(long j) {
        this.zzue |= 4;
        this.zzwm = j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void P(int i, z51.a aVar) {
        b0();
        this.zzwj.set(i, (z51) ((l91) aVar.G0()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void Q(int i, z51 z51) {
        if (z51 != null) {
            b0();
            this.zzwj.set(i, z51);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void S(z51.a aVar) {
        b0();
        this.zzwj.add((z51) ((l91) aVar.G0()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void T(z51 z51) {
        if (z51 != null) {
            b0();
            this.zzwj.add(z51);
            return;
        }
        throw null;
    }

    public static x51 U(byte[] bArr, y81 y81) throws v91 {
        return (x51) l91.n(zzwo, bArr, y81);
    }

    private final void b0() {
        if (!this.zzwj.n0()) {
            this.zzwj = l91.o(this.zzwj);
        }
    }

    public static a e0() {
        return (a) zzwo.x();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void g0(int i) {
        b0();
        this.zzwj.remove(i);
    }

    public final int C() {
        return this.zzwn;
    }

    public final String D() {
        return this.zzwk;
    }

    public final long F() {
        return this.zzwl;
    }

    public final z51 W(int i) {
        return this.zzwj.get(i);
    }

    public final List<z51> X() {
        return this.zzwj;
    }

    public final int Y() {
        return this.zzwj.size();
    }

    public final boolean Z() {
        return (this.zzue & 2) != 0;
    }

    public final long a0() {
        return this.zzwm;
    }

    public final boolean c0() {
        return (this.zzue & 4) != 0;
    }

    public final boolean d0() {
        return (this.zzue & 8) != 0;
    }

    @Override // defpackage.l91
    public final Object q(int i, Object obj, Object obj2) {
        switch (u51.a[i - 1]) {
            case 1:
                return new x51();
            case 2:
                return new a(null);
            case 3:
                return l91.r(zzwo, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{C0201.m82(14575), C0201.m82(14576), z51.class, C0201.m82(14577), C0201.m82(14578), C0201.m82(14579), C0201.m82(14580)});
            case 4:
                return zzwo;
            case 5:
                fb1<x51> fb1 = zzuo;
                if (fb1 == null) {
                    synchronized (x51.class) {
                        fb1 = zzuo;
                        if (fb1 == null) {
                            fb1 = new l91.c<>(zzwo);
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
