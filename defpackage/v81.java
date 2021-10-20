package defpackage;

import defpackage.l91;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: v81  reason: default package */
public final class v81 implements cd1 {
    private final r81 a;

    private v81(r81 r81) {
        m91.e(r81, C0201.m82(31074));
        r81 r812 = r81;
        this.a = r812;
        r812.a = this;
    }

    public static v81 P(r81 r81) {
        v81 v81 = r81.a;
        if (v81 != null) {
            return v81;
        }
        return new v81(r81);
    }

    @Override // defpackage.cd1
    public final void A(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof ca1) {
            ca1 ca1 = (ca1) list;
            while (i2 < list.size()) {
                Object m0 = ca1.m0(i2);
                if (m0 instanceof String) {
                    this.a.A(i, (String) m0);
                } else {
                    this.a.k(i, (c81) m0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.A(i, list.get(i2));
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void B(int i, int i2) throws IOException {
        this.a.g0(i, i2);
    }

    @Override // defpackage.cd1
    public final void C(int i, Object obj, lb1 lb1) throws IOException {
        this.a.m(i, (wa1) obj, lb1);
    }

    @Override // defpackage.cd1
    public final void D(int i, int i2) throws IOException {
        this.a.g0(i, i2);
    }

    @Override // defpackage.cd1
    public final void E(int i, int i2) throws IOException {
        this.a.n0(i, i2);
    }

    @Override // defpackage.cd1
    public final void F(int i, int i2) throws IOException {
        this.a.w0(i, i2);
    }

    @Override // defpackage.cd1
    public final void G(int i, List<?> list, lb1 lb1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            C(i, list.get(i2), lb1);
        }
    }

    @Override // defpackage.cd1
    public final void H(int i, Object obj, lb1 lb1) throws IOException {
        r81 r81 = this.a;
        r81.w(i, 3);
        lb1.f((wa1) obj, r81.a);
        r81.w(i, 4);
    }

    @Override // defpackage.cd1
    public final void I(int i, String str) throws IOException {
        this.a.A(i, str);
    }

    @Override // defpackage.cd1
    public final void J(int i, List<?> list, lb1 lb1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            H(i, list.get(i2), lb1);
        }
    }

    @Override // defpackage.cd1
    public final int K() {
        return l91.d.k;
    }

    @Override // defpackage.cd1
    public final void L(int i, c81 c81) throws IOException {
        this.a.k(i, c81);
    }

    @Override // defpackage.cd1
    public final void M(int i) throws IOException {
        this.a.w(i, 3);
    }

    @Override // defpackage.cd1
    public final void N(int i) throws IOException {
        this.a.w(i, 4);
    }

    @Override // defpackage.cd1
    public final <K, V> void O(int i, ma1<K, V> ma1, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.w(i, 2);
            this.a.E(oa1.a(ma1, entry.getKey(), entry.getValue()));
            oa1.b(this.a, ma1, entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.cd1
    public final void a(int i, long j) throws IOException {
        this.a.h0(i, j);
    }

    @Override // defpackage.cd1
    public final void b(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.H0(list.get(i4).booleanValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.G0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.B(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void c(int i, long j) throws IOException {
        this.a.x(i, j);
    }

    @Override // defpackage.cd1
    public final void d(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.I(list.get(i4).intValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.D(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.g0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void e(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.O(list.get(i4).intValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.D(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.g0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void f(int i, boolean z) throws IOException {
        this.a.B(i, z);
    }

    @Override // defpackage.cd1
    public final void g(int i, long j) throws IOException {
        this.a.h0(i, j);
    }

    @Override // defpackage.cd1
    public final void h(int i, Object obj) throws IOException {
        if (obj instanceof c81) {
            this.a.y(i, (c81) obj);
        } else {
            this.a.z(i, (wa1) obj);
        }
    }

    @Override // defpackage.cd1
    public final void i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.T(list.get(i4).longValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.N(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.X(list.get(i4).longValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.L(list.get(i4).intValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.G(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.w0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void l(int i, long j) throws IOException {
        this.a.j(i, j);
    }

    @Override // defpackage.cd1
    public final void m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.J(list.get(i4).intValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.E(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.M(list.get(i4).intValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.G(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.w0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void o(int i, long j) throws IOException {
        this.a.j(i, j);
    }

    @Override // defpackage.cd1
    public final void p(int i, double d) throws IOException {
        this.a.h(i, d);
    }

    @Override // defpackage.cd1
    public final void q(int i, float f) throws IOException {
        this.a.i(i, f);
    }

    @Override // defpackage.cd1
    public final void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.W(list.get(i4).longValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void s(int i, int i2) throws IOException {
        this.a.w0(i, i2);
    }

    @Override // defpackage.cd1
    public final void t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.V(list.get(i4).longValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.P(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.x(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void u(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.U(list.get(i4).longValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.N(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.K(list.get(i4).intValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.F(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.s0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.q0(list.get(i4).doubleValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.m0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void x(int i, List<c81> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.k(i, list.get(i2));
        }
    }

    @Override // defpackage.cd1
    public final void y(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.w(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += r81.p(list.get(i4).floatValue());
            }
            this.a.E(i3);
            while (i2 < list.size()) {
                this.a.g(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.i(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // defpackage.cd1
    public final void z(int i, int i2) throws IOException {
        this.a.s0(i, i2);
    }
}
