package defpackage;

import defpackage.dl1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: bl1  reason: default package */
public final class bl1<FieldDescriptorType extends dl1<FieldDescriptorType>> {
    private static final bl1 d = new bl1(true);
    private final ln1<FieldDescriptorType, Object> a = ln1.g(16);
    private boolean b;
    private boolean c = false;

    private bl1() {
    }

    public static int f(ro1 ro1, int i, Object obj) {
        int u = qk1.u(i);
        if (ro1 == ro1.GROUP) {
            nl1.f((tm1) obj);
            u <<= 1;
        }
        return u + l(ro1, obj);
    }

    public static void h(qk1 qk1, ro1 ro1, int i, Object obj) throws IOException {
        if (ro1 == ro1.GROUP) {
            tm1 tm1 = (tm1) obj;
            nl1.f(tm1);
            qk1.b0(i, 3);
            tm1.d(qk1);
            qk1.b0(i, 4);
            return;
        }
        qk1.b0(i, ro1.d());
        switch (cl1.b[ro1.ordinal()]) {
            case 1:
                qk1.g(((Double) obj).doubleValue());
                return;
            case 2:
                qk1.j0(((Float) obj).floatValue());
                return;
            case 3:
                qk1.f0(((Long) obj).longValue());
                return;
            case 4:
                qk1.f0(((Long) obj).longValue());
                return;
            case 5:
                qk1.q(((Integer) obj).intValue());
                return;
            case 6:
                qk1.r0(((Long) obj).longValue());
                return;
            case 7:
                qk1.t(((Integer) obj).intValue());
                return;
            case 8:
                qk1.w0(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((tm1) obj).d(qk1);
                return;
            case 10:
                qk1.L((tm1) obj);
                return;
            case 11:
                if (obj instanceof bk1) {
                    qk1.o((bk1) obj);
                    return;
                } else {
                    qk1.I0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof bk1) {
                    qk1.o((bk1) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                qk1.m0(bArr, 0, bArr.length);
                return;
            case 13:
                qk1.r(((Integer) obj).intValue());
                return;
            case 14:
                qk1.t(((Integer) obj).intValue());
                return;
            case 15:
                qk1.r0(((Long) obj).longValue());
                return;
            case 16:
                qk1.s(((Integer) obj).intValue());
                return;
            case 17:
                qk1.l0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof ol1) {
                    qk1.q(((ol1) obj).a());
                    return;
                } else {
                    qk1.q(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof defpackage.ol1) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof defpackage.vl1) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    private static void k(ro1 ro1, Object obj) {
        nl1.a(obj);
        boolean z = true;
        boolean z2 = false;
        switch (cl1.a[ro1.b().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                if (z2) {
                    throw new IllegalArgumentException(C0201.m82(24173));
                }
                return;
            case 2:
                z = obj instanceof Long;
                z2 = z;
                if (z2) {
                }
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                if (z2) {
                }
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                if (z2) {
                }
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                if (z2) {
                }
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                if (z2) {
                }
                break;
            case 7:
                if (!(obj instanceof bk1)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            case 9:
                if (!(obj instanceof tm1)) {
                    break;
                }
                z2 = z;
                if (z2) {
                }
                break;
            default:
                if (z2) {
                }
                break;
        }
    }

    private static int l(ro1 ro1, Object obj) {
        switch (cl1.b[ro1.ordinal()]) {
            case 1:
                return qk1.z(((Double) obj).doubleValue());
            case 2:
                return qk1.n0(((Float) obj).floatValue());
            case 3:
                return qk1.t0(((Long) obj).longValue());
            case 4:
                return qk1.y0(((Long) obj).longValue());
            case 5:
                return qk1.v(((Integer) obj).intValue());
            case 6:
                return qk1.D0(((Long) obj).longValue());
            case 7:
                return qk1.y(((Integer) obj).intValue());
            case 8:
                return qk1.z0(((Boolean) obj).booleanValue());
            case 9:
                return qk1.a0((tm1) obj);
            case 10:
                if (obj instanceof vl1) {
                    return qk1.e((vl1) obj);
                }
                return qk1.U((tm1) obj);
            case 11:
                if (obj instanceof bk1) {
                    return qk1.F((bk1) obj);
                }
                return qk1.K0((String) obj);
            case 12:
                if (obj instanceof bk1) {
                    return qk1.F((bk1) obj);
                }
                return qk1.u0((byte[]) obj);
            case 13:
                return qk1.w(((Integer) obj).intValue());
            case 14:
                return qk1.M(((Integer) obj).intValue());
            case 15:
                return qk1.F0(((Long) obj).longValue());
            case 16:
                return qk1.x(((Integer) obj).intValue());
            case 17:
                return qk1.B0(((Long) obj).longValue());
            case 18:
                if (obj instanceof ol1) {
                    return qk1.N(((ol1) obj).a());
                }
                return qk1.N(((Integer) obj).intValue());
            default:
                throw new RuntimeException(C0201.m82(24174));
        }
    }

    private static boolean n(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.o() == wo1.MESSAGE) {
            if (key.F()) {
                for (tm1 tm1 : (List) entry.getValue()) {
                    if (!tm1.b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof tm1) {
                    if (!((tm1) value).b()) {
                        return false;
                    }
                } else if (value instanceof vl1) {
                    return true;
                } else {
                    throw new IllegalArgumentException(C0201.m82(24175));
                }
            }
        }
        return true;
    }

    private static int o(dl1<?> dl1, Object obj) {
        ro1 i0 = dl1.i0();
        int a2 = dl1.a();
        if (!dl1.F()) {
            return f(i0, a2, obj);
        }
        int i = 0;
        if (dl1.V0()) {
            for (Object obj2 : (List) obj) {
                i += l(i0, obj2);
            }
            return qk1.u(a2) + i + qk1.P(i);
        }
        for (Object obj3 : (List) obj) {
            i += f(i0, a2, obj3);
        }
        return i;
    }

    private final void p(Map.Entry<FieldDescriptorType, Object> entry) {
        tm1 tm1;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof vl1) {
            vl1.e();
            throw null;
        } else if (key.F()) {
            Object g = g(key);
            if (g == null) {
                g = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) g).add(v(obj));
            }
            this.a.put(key, g);
        } else if (key.o() == wo1.MESSAGE) {
            Object g2 = g(key);
            if (g2 == null) {
                this.a.put(key, v(value));
                return;
            }
            if (g2 instanceof zm1) {
                tm1 = key.j0((zm1) g2, (zm1) value);
            } else {
                tm1 = key.A0(((tm1) g2).c(), (tm1) value).H();
            }
            this.a.put(key, tm1);
        } else {
            this.a.put(key, v(value));
        }
    }

    private static int r(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.o() != wo1.MESSAGE || key.F() || key.V0()) {
            return o(key, value);
        }
        if (value instanceof vl1) {
            return qk1.C(entry.getKey().a(), (vl1) value);
        }
        return qk1.Z(entry.getKey().a(), (tm1) value);
    }

    public static <T extends dl1<T>> bl1<T> s() {
        return d;
    }

    private static Object v(Object obj) {
        if (obj instanceof zm1) {
            return ((zm1) obj).k0();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        if (this.c) {
            return new yl1(this.a.o().iterator());
        }
        return this.a.o().iterator();
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c() {
        return this.b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        bl1 bl1 = new bl1();
        for (int i = 0; i < this.a.m(); i++) {
            Map.Entry<FieldDescriptorType, Object> h = this.a.h(i);
            bl1.j(h.getKey(), h.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.n()) {
            bl1.j(entry.getKey(), entry.getValue());
        }
        bl1.c = this.c;
        return bl1;
    }

    public final boolean d() {
        for (int i = 0; i < this.a.m(); i++) {
            if (!n(this.a.h(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.n()) {
            if (!n(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        if (this.c) {
            return new yl1(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl1)) {
            return false;
        }
        return this.a.equals(((bl1) obj).a);
    }

    public final Object g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        if (!(obj instanceof vl1)) {
            return obj;
        }
        vl1.e();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(bl1<FieldDescriptorType> bl1) {
        for (int i = 0; i < bl1.a.m(); i++) {
            p(bl1.a.h(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : bl1.a.n()) {
            p(entry);
        }
    }

    public final void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.F()) {
            k(fielddescriptortype.i0(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                k(fielddescriptortype.i0(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException(C0201.m82(24176));
        }
        if (obj instanceof vl1) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }

    public final void m(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.F()) {
            k(fielddescriptortype.i0(), obj);
            Object g = g(fielddescriptortype);
            if (g == null) {
                list = new ArrayList();
                this.a.put(fielddescriptortype, list);
            } else {
                list = (List) g;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(24177));
    }

    public final void q() {
        if (!this.b) {
            this.a.k();
            this.b = true;
        }
    }

    public final int t() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.m(); i2++) {
            Map.Entry<FieldDescriptorType, Object> h = this.a.h(i2);
            i += o(h.getKey(), h.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.n()) {
            i += o(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int u() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.m(); i2++) {
            i += r(this.a.h(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.n()) {
            i += r(entry);
        }
        return i;
    }

    private bl1(boolean z) {
        q();
    }
}
