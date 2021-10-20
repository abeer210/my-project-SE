package defpackage;

import defpackage.ev0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: bv0  reason: default package */
public final class bv0<FieldDescriptorType extends ev0<FieldDescriptorType>> {
    private static final bv0 d = new bv0(true);
    private final lx0<FieldDescriptorType, Object> a = lx0.f(16);
    private boolean b;
    private boolean c = false;

    private bv0() {
    }

    private bv0(boolean z) {
        u();
    }

    public static int f(py0 py0, int i, Object obj) {
        int B0 = ru0.B0(i);
        if (py0 == py0.GROUP) {
            mv0.i((qw0) obj);
            B0 <<= 1;
        }
        return B0 + p(py0, obj);
    }

    private final Object g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        if (!(obj instanceof tv0)) {
            return obj;
        }
        tv0.e();
        throw null;
    }

    public static void h(ru0 ru0, py0 py0, int i, Object obj) throws IOException {
        if (py0 == py0.GROUP) {
            qw0 qw0 = (qw0) obj;
            mv0.i(qw0);
            ru0.F(i, 3);
            qw0.d(ru0);
            ru0.F(i, 4);
            return;
        }
        ru0.F(i, py0.d());
        switch (cv0.b[py0.ordinal()]) {
            case 1:
                ru0.h(((Double) obj).doubleValue());
                return;
            case 2:
                ru0.i(((Float) obj).floatValue());
                return;
            case 3:
                ru0.K(((Long) obj).longValue());
                return;
            case 4:
                ru0.K(((Long) obj).longValue());
                return;
            case 5:
                ru0.x0(((Integer) obj).intValue());
                return;
            case 6:
                ru0.b0(((Long) obj).longValue());
                return;
            case 7:
                ru0.A0(((Integer) obj).intValue());
                return;
            case 8:
                ru0.s(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((qw0) obj).d(ru0);
                return;
            case 10:
                ru0.L((qw0) obj);
                return;
            case 11:
                if (obj instanceof fu0) {
                    ru0.q((fu0) obj);
                    return;
                } else {
                    ru0.m0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof fu0) {
                    ru0.q((fu0) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                ru0.c0(bArr, 0, bArr.length);
                return;
            case 13:
                ru0.y0(((Integer) obj).intValue());
                return;
            case 14:
                ru0.A0(((Integer) obj).intValue());
                return;
            case 15:
                ru0.b0(((Long) obj).longValue());
                return;
            case 16:
                ru0.z0(((Integer) obj).intValue());
                return;
            case 17:
                ru0.U(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof nv0) {
                    ru0.x0(((nv0) obj).u());
                    return;
                } else {
                    ru0.x0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private final void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.r0()) {
            k(fielddescriptortype.M0(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                k(fielddescriptortype.M0(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException(C0201.m82(2421));
        }
        if (obj instanceof tv0) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof defpackage.nv0) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof defpackage.tv0) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    private static void k(py0 py0, Object obj) {
        mv0.a(obj);
        boolean z = true;
        boolean z2 = false;
        switch (cv0.a[py0.b().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                if (z2) {
                    throw new IllegalArgumentException(C0201.m82(2422));
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
                if (!(obj instanceof fu0)) {
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
                if (!(obj instanceof qw0)) {
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

    public static <T extends ev0<T>> bv0<T> l() {
        return d;
    }

    private static int o(ev0<?> ev0, Object obj) {
        py0 M0 = ev0.M0();
        int u = ev0.u();
        if (!ev0.r0()) {
            return f(M0, u, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (ev0.y()) {
            for (Object obj2 : list) {
                i += p(M0, obj2);
            }
            return ru0.B0(u) + i + ru0.J0(i);
        }
        for (Object obj3 : list) {
            i += f(M0, u, obj3);
        }
        return i;
    }

    private static int p(py0 py0, Object obj) {
        switch (cv0.b[py0.ordinal()]) {
            case 1:
                return ru0.v(((Double) obj).doubleValue());
            case 2:
                return ru0.w(((Float) obj).floatValue());
            case 3:
                return ru0.e0(((Long) obj).longValue());
            case 4:
                return ru0.h0(((Long) obj).longValue());
            case 5:
                return ru0.C0(((Integer) obj).intValue());
            case 6:
                return ru0.p0(((Long) obj).longValue());
            case 7:
                return ru0.F0(((Integer) obj).intValue());
            case 8:
                return ru0.E(((Boolean) obj).booleanValue());
            case 9:
                return ru0.Y((qw0) obj);
            case 10:
                return obj instanceof tv0 ? ru0.e((tv0) obj) : ru0.Q((qw0) obj);
            case 11:
                return obj instanceof fu0 ? ru0.C((fu0) obj) : ru0.q0((String) obj);
            case 12:
                return obj instanceof fu0 ? ru0.C((fu0) obj) : ru0.Z((byte[]) obj);
            case 13:
                return ru0.D0(((Integer) obj).intValue());
            case 14:
                return ru0.G0(((Integer) obj).intValue());
            case 15:
                return ru0.s0(((Long) obj).longValue());
            case 16:
                return ru0.E0(((Integer) obj).intValue());
            case 17:
                return ru0.l0(((Long) obj).longValue());
            case 18:
                return obj instanceof nv0 ? ru0.H0(((nv0) obj).u()) : ru0.H0(((Integer) obj).intValue());
            default:
                throw new RuntimeException(C0201.m82(2423));
        }
    }

    private static boolean q(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.e0() == uy0.MESSAGE) {
            boolean r0 = key.r0();
            Object value = entry.getValue();
            if (r0) {
                for (qw0 qw0 : (List) value) {
                    if (!qw0.b()) {
                        return false;
                    }
                }
            } else if (value instanceof qw0) {
                if (!((qw0) value).b()) {
                    return false;
                }
            } else if (value instanceof tv0) {
                return true;
            } else {
                throw new IllegalArgumentException(C0201.m82(2424));
            }
        }
        return true;
    }

    private final void r(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof tv0) {
            tv0.e();
            throw null;
        } else if (key.r0()) {
            Object g = g(key);
            if (g == null) {
                g = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) g).add(t(obj));
            }
            this.a.put(key, g);
        } else if (key.e0() == uy0.MESSAGE) {
            Object g2 = g(key);
            if (g2 == null) {
                this.a.put(key, t(value));
            } else {
                this.a.put(key, g2 instanceof xw0 ? key.N0((xw0) g2, (xw0) value) : key.s(((qw0) g2).c(), (qw0) value).A());
            }
        } else {
            this.a.put(key, t(value));
        }
    }

    private static int s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.e0() != uy0.MESSAGE || key.r0() || key.y()) {
            return o(key, value);
        }
        boolean z = value instanceof tv0;
        int u = entry.getKey().u();
        return z ? ru0.z(u, (tv0) value) : ru0.X(u, (qw0) value);
    }

    private static Object t(Object obj) {
        if (obj instanceof xw0) {
            return ((xw0) obj).h();
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
        return this.c ? new wv0(this.a.n().iterator()) : this.a.n().iterator();
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean c() {
        return this.b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        bv0 bv0 = new bv0();
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry<FieldDescriptorType, Object> g = this.a.g(i);
            bv0.j(g.getKey(), g.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.m()) {
            bv0.j(entry.getKey(), entry.getValue());
        }
        bv0.c = this.c;
        return bv0;
    }

    public final boolean d() {
        for (int i = 0; i < this.a.l(); i++) {
            if (!q(this.a.g(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.m()) {
            if (!q(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        return this.c ? new wv0(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv0)) {
            return false;
        }
        return this.a.equals(((bv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(bv0<FieldDescriptorType> bv0) {
        for (int i = 0; i < bv0.a.l(); i++) {
            r(bv0.a.g(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : bv0.a.m()) {
            r(entry);
        }
    }

    public final int m() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.l(); i2++) {
            Map.Entry<FieldDescriptorType, Object> g = this.a.g(i2);
            i += o(g.getKey(), g.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.m()) {
            i += o(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int n() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.l(); i2++) {
            i += s(this.a.g(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.m()) {
            i += s(entry);
        }
        return i;
    }

    public final void u() {
        if (!this.b) {
            this.a.q();
            this.b = true;
        }
    }
}
