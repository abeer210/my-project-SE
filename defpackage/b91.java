package defpackage;

import defpackage.d91;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: b91  reason: default package */
public final class b91<FieldDescriptorType extends d91<FieldDescriptorType>> {
    private static final b91 d = new b91(true);
    public final rb1<FieldDescriptorType, Object> a = rb1.h(16);
    private boolean b;
    private boolean c = false;

    private b91() {
    }

    public static int e(wc1 wc1, int i, Object obj) {
        int H = r81.H(i);
        if (wc1 == wc1.GROUP) {
            m91.g((wa1) obj);
            H <<= 1;
        }
        return H + l(wc1, obj);
    }

    private final Object f(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        if (!(obj instanceof w91)) {
            return obj;
        }
        w91.e();
        throw null;
    }

    public static void g(r81 r81, wc1 wc1, int i, Object obj) throws IOException {
        if (wc1 == wc1.GROUP) {
            wa1 wa1 = (wa1) obj;
            m91.g(wa1);
            r81.w(i, 3);
            wa1.g(r81);
            r81.w(i, 4);
            return;
        }
        r81.w(i, wc1.d());
        switch (e91.b[wc1.ordinal()]) {
            case 1:
                r81.m0(((Double) obj).doubleValue());
                return;
            case 2:
                r81.g(((Float) obj).floatValue());
                return;
            case 3:
                r81.N(((Long) obj).longValue());
                return;
            case 4:
                r81.N(((Long) obj).longValue());
                return;
            case 5:
                r81.D(((Integer) obj).intValue());
                return;
            case 6:
                r81.R(((Long) obj).longValue());
                return;
            case 7:
                r81.G(((Integer) obj).intValue());
                return;
            case 8:
                r81.G0(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((wa1) obj).g(r81);
                return;
            case 10:
                r81.C((wa1) obj);
                return;
            case 11:
                if (obj instanceof c81) {
                    r81.n((c81) obj);
                    return;
                } else {
                    r81.o0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof c81) {
                    r81.n((c81) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                r81.t0(bArr, 0, bArr.length);
                return;
            case 13:
                r81.E(((Integer) obj).intValue());
                return;
            case 14:
                r81.G(((Integer) obj).intValue());
                return;
            case 15:
                r81.R(((Long) obj).longValue());
                return;
            case 16:
                r81.F(((Integer) obj).intValue());
                return;
            case 17:
                r81.P(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof p91) {
                    r81.D(((p91) obj).c());
                    return;
                } else {
                    r81.D(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private final void i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.w()) {
            j(fielddescriptortype.f0(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                j(fielddescriptortype.f0(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException(C0201.m82(24332));
        }
        if (obj instanceof w91) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof defpackage.p91) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof defpackage.w91) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    private static void j(wc1 wc1, Object obj) {
        m91.a(obj);
        boolean z = true;
        boolean z2 = false;
        switch (e91.a[wc1.b().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                if (z2) {
                    throw new IllegalArgumentException(C0201.m82(24333));
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
                if (!(obj instanceof c81)) {
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
                if (!(obj instanceof wa1)) {
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

    public static int k(d91<?> d91, Object obj) {
        wc1 f0 = d91.f0();
        int c2 = d91.c();
        if (!d91.w()) {
            return e(f0, c2, obj);
        }
        int i = 0;
        if (d91.g1()) {
            for (Object obj2 : (List) obj) {
                i += l(f0, obj2);
            }
            return r81.H(c2) + i + r81.S(i);
        }
        for (Object obj3 : (List) obj) {
            i += e(f0, c2, obj3);
        }
        return i;
    }

    private static int l(wc1 wc1, Object obj) {
        switch (e91.b[wc1.ordinal()]) {
            case 1:
                return r81.q0(((Double) obj).doubleValue());
            case 2:
                return r81.p(((Float) obj).floatValue());
            case 3:
                return r81.T(((Long) obj).longValue());
            case 4:
                return r81.U(((Long) obj).longValue());
            case 5:
                return r81.I(((Integer) obj).intValue());
            case 6:
                return r81.W(((Long) obj).longValue());
            case 7:
                return r81.L(((Integer) obj).intValue());
            case 8:
                return r81.H0(((Boolean) obj).booleanValue());
            case 9:
                return r81.l0((wa1) obj);
            case 10:
                if (obj instanceof w91) {
                    return r81.e((w91) obj);
                }
                return r81.e0((wa1) obj);
            case 11:
                if (obj instanceof c81) {
                    return r81.u((c81) obj);
                }
                return r81.p0((String) obj);
            case 12:
                if (obj instanceof c81) {
                    return r81.u((c81) obj);
                }
                return r81.z0((byte[]) obj);
            case 13:
                return r81.J(((Integer) obj).intValue());
            case 14:
                return r81.M(((Integer) obj).intValue());
            case 15:
                return r81.X(((Long) obj).longValue());
            case 16:
                return r81.K(((Integer) obj).intValue());
            case 17:
                return r81.V(((Long) obj).longValue());
            case 18:
                if (obj instanceof p91) {
                    return r81.O(((p91) obj).c());
                }
                return r81.O(((Integer) obj).intValue());
            default:
                throw new RuntimeException(C0201.m82(24334));
        }
    }

    private static boolean m(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.R() == zc1.MESSAGE) {
            if (key.w()) {
                for (wa1 wa1 : (List) entry.getValue()) {
                    if (!wa1.b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof wa1) {
                    if (!((wa1) value).b()) {
                        return false;
                    }
                } else if (value instanceof w91) {
                    return true;
                } else {
                    throw new IllegalArgumentException(C0201.m82(24335));
                }
            }
        }
        return true;
    }

    private final void n(Map.Entry<FieldDescriptorType, Object> entry) {
        wa1 wa1;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof w91) {
            w91.e();
            throw null;
        } else if (key.w()) {
            Object f = f(key);
            if (f == null) {
                f = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) f).add(p(obj));
            }
            this.a.put(key, f);
        } else if (key.R() == zc1.MESSAGE) {
            Object f2 = f(key);
            if (f2 == null) {
                this.a.put(key, p(value));
                return;
            }
            if (f2 instanceof bb1) {
                wa1 = key.B((bb1) f2, (bb1) value);
            } else {
                wa1 = key.w0(((wa1) f2).f(), (wa1) value).G0();
            }
            this.a.put(key, wa1);
        } else {
            this.a.put(key, p(value));
        }
    }

    private static int o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.R() != zc1.MESSAGE || key.w() || key.g1()) {
            return k(key, value);
        }
        if (value instanceof w91) {
            return r81.s(entry.getKey().c(), (w91) value);
        }
        return r81.k0(entry.getKey().c(), (wa1) value);
    }

    private static Object p(Object obj) {
        if (obj instanceof bb1) {
            return ((bb1) obj).E();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends d91<T>> b91<T> r() {
        return d;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        if (this.c) {
            return new ba1(this.a.o().iterator());
        }
        return this.a.o().iterator();
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        for (int i = 0; i < this.a.m(); i++) {
            if (!m(this.a.i(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.n()) {
            if (!m(entry)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        b91 b91 = new b91();
        for (int i = 0; i < this.a.m(); i++) {
            Map.Entry<FieldDescriptorType, Object> i2 = this.a.i(i);
            b91.i(i2.getKey(), i2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.n()) {
            b91.i(entry.getKey(), entry.getValue());
        }
        b91.c = this.c;
        return b91;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> d() {
        if (this.c) {
            return new ba1(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b91)) {
            return false;
        }
        return this.a.equals(((b91) obj).a);
    }

    public final void h(b91<FieldDescriptorType> b91) {
        for (int i = 0; i < b91.a.m(); i++) {
            n(b91.a.i(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : b91.a.n()) {
            n(entry);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void q() {
        if (!this.b) {
            this.a.l();
            this.b = true;
        }
    }

    public final int s() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.m(); i2++) {
            i += o(this.a.i(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.n()) {
            i += o(entry);
        }
        return i;
    }

    private b91(boolean z) {
        q();
    }
}
