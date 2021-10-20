package defpackage;

import defpackage.kl1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: yk1  reason: default package */
public final class yk1 extends xk1<kl1.d> {
    @Override // defpackage.xk1
    public final int a(Map.Entry<?, ?> entry) {
        return ((kl1.d) entry.getKey()).b;
    }

    @Override // defpackage.xk1
    public final Object b(wk1 wk1, tm1 tm1, int i) {
        return wk1.a(tm1, i);
    }

    @Override // defpackage.xk1
    public final <UT, UB> UB c(hn1 hn1, Object obj, wk1 wk1, bl1<kl1.d> bl1, UB ub, bo1<UT, UB> bo1) throws IOException {
        Object g;
        ArrayList arrayList;
        kl1.e eVar = (kl1.e) obj;
        kl1.d dVar = eVar.b;
        int i = dVar.b;
        if (!dVar.d || !dVar.e) {
            Object obj2 = null;
            ro1 ro1 = eVar.b.c;
            if (ro1 != ro1.ENUM) {
                switch (zk1.a[ro1.ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(hn1.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(hn1.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(hn1.M());
                        break;
                    case 4:
                        obj2 = Long.valueOf(hn1.I());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(hn1.C());
                        break;
                    case 6:
                        obj2 = Long.valueOf(hn1.F());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(hn1.x());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(hn1.B());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(hn1.K());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(hn1.E());
                        break;
                    case 11:
                        obj2 = Long.valueOf(hn1.t());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(hn1.J());
                        break;
                    case 13:
                        obj2 = Long.valueOf(hn1.N());
                        break;
                    case 14:
                        throw new IllegalStateException(C0201.m82(14551));
                    case 15:
                        obj2 = hn1.u();
                        break;
                    case 16:
                        obj2 = hn1.k();
                        break;
                    case 17:
                        obj2 = hn1.G(eVar.a.getClass(), wk1);
                        break;
                    case 18:
                        obj2 = hn1.w(eVar.a.getClass(), wk1);
                        break;
                }
            } else {
                int C = hn1.C();
                if (eVar.b.a.a(C) == null) {
                    return (UB) kn1.a(i, C, ub, bo1);
                }
                obj2 = Integer.valueOf(C);
            }
            kl1.d dVar2 = eVar.b;
            if (dVar2.d) {
                bl1.m(dVar2, obj2);
            } else {
                int i2 = zk1.a[dVar2.c.ordinal()];
                if ((i2 == 17 || i2 == 18) && (g = bl1.g(eVar.b)) != null) {
                    obj2 = nl1.d(g, obj2);
                }
                bl1.j(eVar.b, obj2);
            }
        } else {
            switch (zk1.a[dVar.c.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    hn1.A(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    hn1.H(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    hn1.O(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    hn1.D(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    hn1.n(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    hn1.f(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    hn1.c(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    hn1.b(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    hn1.j(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    hn1.o(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    hn1.m(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    hn1.e(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    hn1.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    hn1.i(arrayList);
                    ub = (UB) kn1.b(i, arrayList, eVar.b.a, ub, bo1);
                    break;
                default:
                    String valueOf = String.valueOf(eVar.b.c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append(C0201.m82(14550));
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
            }
            bl1.j(eVar.b, arrayList);
        }
        return ub;
    }

    @Override // defpackage.xk1
    public final void d(bk1 bk1, Object obj, wk1 wk1, bl1<kl1.d> bl1) throws IOException {
        byte[] bArr;
        kl1.e eVar = (kl1.e) obj;
        tm1 p = eVar.a.g().p();
        int size = bk1.size();
        if (size == 0) {
            bArr = nl1.b;
        } else {
            byte[] bArr2 = new byte[size];
            bk1.d(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            yj1 yj1 = new yj1(wrap, true);
            fn1.b().d(p).f(p, yj1, wk1);
            bl1.j(eVar.b, p);
            if (yj1.p() != Integer.MAX_VALUE) {
                throw sl1.e();
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(14552));
    }

    @Override // defpackage.xk1
    public final void e(hn1 hn1, Object obj, wk1 wk1, bl1<kl1.d> bl1) throws IOException {
        kl1.e eVar = (kl1.e) obj;
        bl1.j(eVar.b, hn1.w(eVar.a.getClass(), wk1));
    }

    @Override // defpackage.xk1
    public final void f(xo1 xo1, Map.Entry<?, ?> entry) throws IOException {
        kl1.d dVar = (kl1.d) entry.getKey();
        if (dVar.d) {
            switch (zk1.a[dVar.c.ordinal()]) {
                case 1:
                    kn1.f(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 2:
                    kn1.l(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 3:
                    kn1.p(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 4:
                    kn1.s(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 5:
                    kn1.D(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 6:
                    kn1.v(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 7:
                    kn1.H(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 8:
                    kn1.K(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 9:
                    kn1.E(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 10:
                    kn1.I(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 11:
                    kn1.w(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 12:
                    kn1.F(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 13:
                    kn1.u(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 14:
                    kn1.D(dVar.b, (List) entry.getValue(), xo1, dVar.e);
                    return;
                case 15:
                    kn1.j(dVar.b, (List) entry.getValue(), xo1);
                    return;
                case 16:
                    kn1.d(dVar.b, (List) entry.getValue(), xo1);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        kn1.k(dVar.b, (List) entry.getValue(), xo1, fn1.b().a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        kn1.e(dVar.b, (List) entry.getValue(), xo1, fn1.b().a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (zk1.a[dVar.c.ordinal()]) {
                case 1:
                    xo1.p(dVar.b, ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    xo1.q(dVar.b, ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    xo1.l(dVar.b, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    xo1.o(dVar.b, ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    xo1.z(dVar.b, ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    xo1.g(dVar.b, ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    xo1.G(dVar.b, ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    xo1.f(dVar.b, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    xo1.s(dVar.b, ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    xo1.M(dVar.b, ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    xo1.a(dVar.b, ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    xo1.N(dVar.b, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    xo1.c(dVar.b, ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    xo1.z(dVar.b, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    xo1.K(dVar.b, (bk1) entry.getValue());
                    return;
                case 16:
                    xo1.C(dVar.b, (String) entry.getValue());
                    return;
                case 17:
                    xo1.E(dVar.b, entry.getValue(), fn1.b().a(entry.getValue().getClass()));
                    return;
                case 18:
                    xo1.B(dVar.b, entry.getValue(), fn1.b().a(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    @Override // defpackage.xk1
    public final bl1<kl1.d> g(Object obj) {
        return ((kl1.c) obj).zzwp;
    }

    @Override // defpackage.xk1
    public final bl1<kl1.d> h(Object obj) {
        bl1<kl1.d> g = g(obj);
        if (!g.c()) {
            return g;
        }
        bl1<kl1.d> bl1 = (bl1) g.clone();
        k(obj, bl1);
        return bl1;
    }

    @Override // defpackage.xk1
    public final void i(Object obj) {
        g(obj).q();
    }

    @Override // defpackage.xk1
    public final boolean j(tm1 tm1) {
        return tm1 instanceof kl1.c;
    }

    public final void k(Object obj, bl1<kl1.d> bl1) {
        ((kl1.c) obj).zzwp = bl1;
    }
}
