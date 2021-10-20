package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: vq2  reason: default package */
/* compiled from: COSDictionary */
public class vq2 extends tq2 {
    public Map<ar2, tq2> a = new LinkedHashMap();

    public Set<Map.Entry<ar2, tq2>> A() {
        return this.a.entrySet();
    }

    public boolean E(ar2 ar2, ar2 ar22, boolean z) {
        tq2 q0 = q0(ar2, ar22);
        return q0 instanceof uq2 ? ((uq2) q0).r() : z;
    }

    public int F0(String str) {
        return t0(ar2.A(str), -1);
    }

    public tq2 G0(ar2 ar2) {
        return this.a.get(ar2);
    }

    public boolean H(ar2 ar2, boolean z) {
        return E(ar2, null, z);
    }

    public long H0(ar2 ar2) {
        return P0(ar2, -1);
    }

    public long P0(ar2 ar2, long j) {
        tq2 k0 = k0(ar2);
        return k0 instanceof cr2 ? ((cr2) k0).E() : j;
    }

    public String S0(ar2 ar2) {
        tq2 k0 = k0(ar2);
        if (k0 instanceof ar2) {
            return ((ar2) k0).x();
        }
        if (k0 instanceof gr2) {
            return ((gr2) k0).x();
        }
        return null;
    }

    public Collection<tq2> a1() {
        return this.a.values();
    }

    public ar2 g0(ar2 ar2) {
        tq2 k0 = k0(ar2);
        if (k0 instanceof ar2) {
            return (ar2) k0;
        }
        return null;
    }

    public tq2 k0(ar2 ar2) {
        tq2 tq2 = this.a.get(ar2);
        if (tq2 instanceof dr2) {
            tq2 = ((dr2) tq2).x();
        }
        if (tq2 instanceof br2) {
            return null;
        }
        return tq2;
    }

    public void l1(ar2 ar2) {
        this.a.remove(ar2);
    }

    public void m1(ar2 ar2, int i) {
        n1(ar2, zq2.H((long) i));
    }

    public void n1(ar2 ar2, tq2 tq2) {
        if (tq2 == null) {
            l1(ar2);
        } else {
            this.a.put(ar2, tq2);
        }
    }

    public void o1(ar2 ar2, ct2 ct2) {
        n1(ar2, ct2 != null ? ct2.k() : null);
    }

    public void p1(ar2 ar2, long j) {
        n1(ar2, zq2.H(j));
    }

    public tq2 q0(ar2 ar2, ar2 ar22) {
        tq2 k0 = k0(ar2);
        return (k0 != null || ar22 == null) ? k0 : k0(ar22);
    }

    public void q1(ar2 ar2, String str) {
        n1(ar2, str != null ? ar2.A(str) : null);
    }

    public void r(vq2 vq2) {
        for (Map.Entry<ar2, tq2> entry : vq2.A()) {
            String x = entry.getKey().x();
            String r2 = C0201.m82(5515);
            if (!x.equals(r2) || !this.a.containsKey(ar2.A(r2))) {
                n1(entry.getKey(), entry.getValue());
            }
        }
    }

    public int s0(ar2 ar2) {
        return t0(ar2, -1);
    }

    public int t0(ar2 ar2, int i) {
        return u0(ar2, null, i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0201.m82(5516));
        for (ar2 ar2 : this.a.keySet()) {
            sb.append(C0201.m82(5517));
            sb.append(ar2);
            sb.append(C0201.m82(5518));
            if (k0(ar2) != null) {
                sb.append(k0(ar2).toString());
            } else {
                sb.append(C0201.m82(5519));
            }
            sb.append(C0201.m82(5520));
        }
        sb.append(C0201.m82(5521));
        return sb.toString();
    }

    public int u0(ar2 ar2, ar2 ar22, int i) {
        tq2 q0 = q0(ar2, ar22);
        return q0 instanceof cr2 ? ((cr2) q0).A() : i;
    }

    public boolean x(ar2 ar2) {
        return this.a.containsKey(ar2);
    }
}
