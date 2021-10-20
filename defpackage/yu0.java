package defpackage;

import defpackage.kv0;
import java.io.IOException;
import java.util.Map;

/* renamed from: yu0  reason: default package */
public final class yu0 extends xu0<kv0.d> {
    @Override // defpackage.xu0
    public final int a(Map.Entry<?, ?> entry) {
        return ((kv0.d) entry.getKey()).a;
    }

    @Override // defpackage.xu0
    public final bv0<kv0.d> b(Object obj) {
        return ((kv0.c) obj).zzjv;
    }

    @Override // defpackage.xu0
    public final void c(vy0 vy0, Map.Entry<?, ?> entry) throws IOException {
        kv0.d dVar = (kv0.d) entry.getKey();
        switch (zu0.a[dVar.b.ordinal()]) {
            case 1:
                vy0.p(dVar.a, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                vy0.q(dVar.a, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                vy0.l(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                vy0.o(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                vy0.B(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                vy0.g(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                vy0.s(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                vy0.f(dVar.a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                vy0.E(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                vy0.F(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                vy0.a(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                vy0.z(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                vy0.c(dVar.a, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                vy0.B(dVar.a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                vy0.J(dVar.a, (fu0) entry.getValue());
                return;
            case 16:
                vy0.C(dVar.a, (String) entry.getValue());
                return;
            case 17:
                vy0.M(dVar.a, entry.getValue(), dx0.a().b(entry.getValue().getClass()));
                return;
            case 18:
                vy0.K(dVar.a, entry.getValue(), dx0.a().b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.xu0
    public final bv0<kv0.d> d(Object obj) {
        bv0<kv0.d> b = b(obj);
        if (!b.c()) {
            return b;
        }
        bv0<kv0.d> bv0 = (bv0) b.clone();
        g(obj, bv0);
        return bv0;
    }

    @Override // defpackage.xu0
    public final void e(Object obj) {
        b(obj).u();
    }

    @Override // defpackage.xu0
    public final boolean f(qw0 qw0) {
        return qw0 instanceof kv0.c;
    }

    public final void g(Object obj, bv0<kv0.d> bv0) {
        ((kv0.c) obj).zzjv = bv0;
    }
}
