package defpackage;

import defpackage.kv0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: tu0  reason: default package */
public final class tu0 implements vy0 {
    private final ru0 a;

    private tu0(ru0 ru0) {
        mv0.e(ru0, C0201.m82(33726));
        ru0 ru02 = ru0;
        this.a = ru02;
        ru02.a = this;
    }

    public static tu0 P(ru0 ru0) {
        tu0 tu0 = ru0.a;
        return tu0 != null ? tu0 : new tu0(ru0);
    }

    @Override // defpackage.vy0
    public final void A(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zv0) {
            zv0 zv0 = (zv0) list;
            while (i2 < list.size()) {
                Object m = zv0.m(i2);
                if (m instanceof String) {
                    this.a.p(i, (String) m);
                } else {
                    this.a.m(i, (fu0) m);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.p(i, list.get(i2));
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void B(int i, int i2) throws IOException {
        this.a.S(i, i2);
    }

    @Override // defpackage.vy0
    public final void C(int i, String str) throws IOException {
        this.a.p(i, str);
    }

    @Override // defpackage.vy0
    public final void D(int i, int i2) throws IOException {
        this.a.S(i, i2);
    }

    @Override // defpackage.vy0
    public final void E(int i, int i2) throws IOException {
        this.a.a0(i, i2);
    }

    @Override // defpackage.vy0
    public final void F(int i, int i2) throws IOException {
        this.a.i0(i, i2);
    }

    @Override // defpackage.vy0
    public final void G(int i, List<?> list, ix0 ix0) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            M(i, list.get(i2), ix0);
        }
    }

    @Override // defpackage.vy0
    public final void H(int i, List<?> list, ix0 ix0) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), ix0);
        }
    }

    @Override // defpackage.vy0
    public final void I(int i) throws IOException {
        this.a.F(i, 4);
    }

    @Override // defpackage.vy0
    public final void J(int i, fu0 fu0) throws IOException {
        this.a.m(i, fu0);
    }

    @Override // defpackage.vy0
    public final void K(int i, Object obj, ix0 ix0) throws IOException {
        this.a.o(i, (qw0) obj, ix0);
    }

    @Override // defpackage.vy0
    public final void L(int i) throws IOException {
        this.a.F(i, 3);
    }

    @Override // defpackage.vy0
    public final void M(int i, Object obj, ix0 ix0) throws IOException {
        ru0 ru0 = this.a;
        ru0.F(i, 3);
        ix0.h((qw0) obj, ru0.a);
        ru0.F(i, 4);
    }

    @Override // defpackage.vy0
    public final int N() {
        return kv0.e.k;
    }

    @Override // defpackage.vy0
    public final <K, V> void O(int i, jw0<K, V> jw0, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.F(i, 2);
            this.a.y0(iw0.a(jw0, entry.getKey(), entry.getValue()));
            iw0.b(this.a, jw0, entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.vy0
    public final void a(int i, long j) throws IOException {
        this.a.T(i, j);
    }

    @Override // defpackage.vy0
    public final void b(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.E(list.get(i4).booleanValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.s(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.J(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void c(int i, long j) throws IOException {
        this.a.G(i, j);
    }

    @Override // defpackage.vy0
    public final void d(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.C0(list.get(i4).intValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.S(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void e(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.H0(list.get(i4).intValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.S(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void f(int i, boolean z) throws IOException {
        this.a.J(i, z);
    }

    @Override // defpackage.vy0
    public final void g(int i, long j) throws IOException {
        this.a.T(i, j);
    }

    @Override // defpackage.vy0
    public final void h(int i, Object obj) throws IOException {
        if (obj instanceof fu0) {
            this.a.H(i, (fu0) obj);
        } else {
            this.a.I(i, (qw0) obj);
        }
    }

    @Override // defpackage.vy0
    public final void i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.e0(list.get(i4).longValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.K(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.l(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.s0(list.get(i4).longValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.b0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.T(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.F0(list.get(i4).intValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.i0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void l(int i, long j) throws IOException {
        this.a.l(i, j);
    }

    @Override // defpackage.vy0
    public final void m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.D0(list.get(i4).intValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.y0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.G0(list.get(i4).intValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.i0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void o(int i, long j) throws IOException {
        this.a.l(i, j);
    }

    @Override // defpackage.vy0
    public final void p(int i, double d) throws IOException {
        this.a.j(i, d);
    }

    @Override // defpackage.vy0
    public final void q(int i, float f) throws IOException {
        this.a.k(i, f);
    }

    @Override // defpackage.vy0
    public final void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.p0(list.get(i4).longValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.b0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.T(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void s(int i, int i2) throws IOException {
        this.a.i0(i, i2);
    }

    @Override // defpackage.vy0
    public final void t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.l0(list.get(i4).longValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.U(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.G(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void u(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.h0(list.get(i4).longValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.K(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.l(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.E0(list.get(i4).intValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.z0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.f0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void w(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.v(list.get(i4).doubleValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.j(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void x(int i, List<fu0> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.m(i, list.get(i2));
        }
    }

    @Override // defpackage.vy0
    public final void y(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.a.F(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ru0.w(list.get(i4).floatValue());
            }
            this.a.y0(i3);
            while (i2 < list.size()) {
                this.a.i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.k(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // defpackage.vy0
    public final void z(int i, int i2) throws IOException {
        this.a.f0(i, i2);
    }
}
