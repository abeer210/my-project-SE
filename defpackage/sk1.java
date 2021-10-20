package defpackage;

import defpackage.kl1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: sk1  reason: default package */
public final class sk1 implements xo1 {
    private final qk1 a;

    private sk1(qk1 qk1) {
        nl1.e(qk1, C0201.m82(18002));
        qk1 qk12 = qk1;
        this.a = qk12;
        qk12.a = this;
    }

    public static sk1 P(qk1 qk1) {
        sk1 sk1 = qk1.a;
        if (sk1 != null) {
            return sk1;
        }
        return new sk1(qk1);
    }

    @Override // defpackage.xo1
    public final void A(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof bm1) {
            bm1 bm1 = (bm1) list;
            while (i2 < list.size()) {
                Object m = bm1.m(i2);
                if (m instanceof String) {
                    this.a.n(i, (String) m);
                } else {
                    this.a.k(i, (bk1) m);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.n(i, list.get(i2));
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void B(int i, Object obj, in1 in1) throws IOException {
        this.a.m(i, (tm1) obj, in1);
    }

    @Override // defpackage.xo1
    public final void C(int i, String str) throws IOException {
        this.a.n(i, str);
    }

    @Override // defpackage.xo1
    public final <K, V> void D(int i, lm1<K, V> lm1, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.b0(i, 2);
            this.a.r(km1.a(lm1, entry.getKey(), entry.getValue()));
            km1.b(this.a, lm1, entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.xo1
    public final void E(int i, Object obj, in1 in1) throws IOException {
        qk1 qk1 = this.a;
        qk1.b0(i, 3);
        in1.i((tm1) obj, qk1.a);
        qk1.b0(i, 4);
    }

    @Override // defpackage.xo1
    public final int F() {
        return kl1.f.k;
    }

    @Override // defpackage.xo1
    public final void G(int i, int i2) throws IOException {
        this.a.v0(i, i2);
    }

    @Override // defpackage.xo1
    public final void H(int i) throws IOException {
        this.a.b0(i, 3);
    }

    @Override // defpackage.xo1
    public final void I(int i) throws IOException {
        this.a.b0(i, 4);
    }

    @Override // defpackage.xo1
    public final void J(int i, List<?> list, in1 in1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            E(i, list.get(i2), in1);
        }
    }

    @Override // defpackage.xo1
    public final void K(int i, bk1 bk1) throws IOException {
        this.a.k(i, bk1);
    }

    @Override // defpackage.xo1
    public final void L(int i, List<?> list, in1 in1) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            B(i, list.get(i2), in1);
        }
    }

    @Override // defpackage.xo1
    public final void M(int i, int i2) throws IOException {
        this.a.v0(i, i2);
    }

    @Override // defpackage.xo1
    public final void N(int i, int i2) throws IOException {
        this.a.q0(i, i2);
    }

    @Override // defpackage.xo1
    public final void O(int i, int i2) throws IOException {
        this.a.e0(i, i2);
    }

    @Override // defpackage.xo1
    public final void a(int i, long j) throws IOException {
        this.a.W(i, j);
    }

    @Override // defpackage.xo1
    public final void b(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.z0(list.get(i4).booleanValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.w0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.K(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void c(int i, long j) throws IOException {
        this.a.H(i, j);
    }

    @Override // defpackage.xo1
    public final void d(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.v(list.get(i4).intValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void e(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.N(list.get(i4).intValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void f(int i, boolean z) throws IOException {
        this.a.K(i, z);
    }

    @Override // defpackage.xo1
    public final void g(int i, long j) throws IOException {
        this.a.W(i, j);
    }

    @Override // defpackage.xo1
    public final void h(int i, Object obj) throws IOException {
        if (obj instanceof bk1) {
            this.a.I(i, (bk1) obj);
        } else {
            this.a.J(i, (tm1) obj);
        }
    }

    @Override // defpackage.xo1
    public final void i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.t0(list.get(i4).longValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.f0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.F0(list.get(i4).longValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.r0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.W(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.y(list.get(i4).intValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.t(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.v0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void l(int i, long j) throws IOException {
        this.a.j(i, j);
    }

    @Override // defpackage.xo1
    public final void m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.w(list.get(i4).intValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.M(list.get(i4).intValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.t(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.v0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void o(int i, long j) throws IOException {
        this.a.j(i, j);
    }

    @Override // defpackage.xo1
    public final void p(int i, double d) throws IOException {
        this.a.h(i, d);
    }

    @Override // defpackage.xo1
    public final void q(int i, float f) throws IOException {
        this.a.i(i, f);
    }

    @Override // defpackage.xo1
    public final void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.D0(list.get(i4).longValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.r0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.W(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void s(int i, int i2) throws IOException {
        this.a.k0(i, i2);
    }

    @Override // defpackage.xo1
    public final void t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.B0(list.get(i4).longValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.l0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.H(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void u(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.y0(list.get(i4).longValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.f0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.x(list.get(i4).intValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.q0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.z(list.get(i4).doubleValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.g(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.h(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void x(int i, List<bk1> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.k(i, list.get(i2));
        }
    }

    @Override // defpackage.xo1
    public final void y(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += qk1.n0(list.get(i4).floatValue());
            }
            this.a.r(i3);
            while (i2 < list.size()) {
                this.a.j0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.i(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // defpackage.xo1
    public final void z(int i, int i2) throws IOException {
        this.a.e0(i, i2);
    }
}
