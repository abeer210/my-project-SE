package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public int A;
    public int B;
    private boolean C;
    public d D;
    public final a E;
    private final b F;
    private int G;
    private int[] H;
    public int s;
    private c t;
    public j u;
    private boolean v;
    private boolean w;
    public boolean x;
    private boolean y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public static class a {
        public j a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            int i;
            if (this.d) {
                i = this.a.i();
            } else {
                i = this.a.m();
            }
            this.c = i;
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e2 = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e2 - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        public void e() {
            this.b = -1;
            this.c = C0188.f23;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return C0201.m82(24612) + this.b + C0201.m82(24613) + this.c + C0201.m82(24614) + this.d + C0201.m82(24615) + this.e + '}';
        }
    }

    /* access modifiers changed from: protected */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        public boolean a = true;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h = 0;
        public int i = 0;
        public boolean j;
        public int k;
        public List<RecyclerView.d0> l = null;
        public boolean m;

        private View e() {
            int size = this.l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.l.get(i2).a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f2 = f(view);
            if (f2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.p) f2.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.a0 a0Var) {
            int i2 = this.d;
            return i2 >= 0 && i2 < a0Var.b();
        }

        public View d(RecyclerView.v vVar) {
            if (this.l != null) {
                return e();
            }
            View o = vVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public View f(View view) {
            int a2;
            int size = this.l.size();
            View view2 = null;
            int i2 = C0188.f24;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.l.get(i3).a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a2 = (pVar.a() - this.d) * this.e) >= 0 && a2 < i2) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i2 = a2;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int a;
        public int b;
        public boolean c;

        static class a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.a >= 0;
        }

        public void b() {
            this.a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = C0188.f23;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        C2(i);
        D2(z2);
    }

    private void A2() {
        if (this.s == 1 || !q2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    private boolean F2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View view;
        int i;
        boolean z2 = false;
        if (J() == 0) {
            return false;
        }
        View V = V();
        if (V != null && aVar.d(V, a0Var)) {
            aVar.c(V, h0(V));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            if (aVar.d) {
                view = i2(vVar, a0Var);
            } else {
                view = j2(vVar, a0Var);
            }
            if (view == null) {
                return false;
            }
            aVar.b(view, h0(view));
            if (!a0Var.e() && L1()) {
                if (this.u.g(view) >= this.u.i() || this.u.d(view) < this.u.m()) {
                    z2 = true;
                }
                if (z2) {
                    if (aVar.d) {
                        i = this.u.i();
                    } else {
                        i = this.u.m();
                    }
                    aVar.c = i;
                }
            }
            return true;
        }
    }

    private boolean G2(RecyclerView.a0 a0Var, a aVar) {
        int i;
        int i2;
        boolean z2 = false;
        if (!a0Var.e() && (i = this.A) != -1) {
            if (i < 0 || i >= a0Var.b()) {
                this.A = -1;
                this.B = C0188.f23;
            } else {
                aVar.b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z3 = this.D.c;
                    aVar.d = z3;
                    if (z3) {
                        aVar.c = this.u.i() - this.D.b;
                    } else {
                        aVar.c = this.u.m() + this.D.b;
                    }
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View C2 = C(this.A);
                    if (C2 == null) {
                        if (J() > 0) {
                            if ((this.A < h0(I(0))) == this.x) {
                                z2 = true;
                            }
                            aVar.d = z2;
                        }
                        aVar.a();
                    } else if (this.u.e(C2) > this.u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.u.g(C2) - this.u.m() < 0) {
                        aVar.c = this.u.m();
                        aVar.d = false;
                        return true;
                    } else if (this.u.i() - this.u.d(C2) < 0) {
                        aVar.c = this.u.i();
                        aVar.d = true;
                        return true;
                    } else {
                        if (aVar.d) {
                            i2 = this.u.d(C2) + this.u.o();
                        } else {
                            i2 = this.u.g(C2);
                        }
                        aVar.c = i2;
                    }
                    return true;
                } else {
                    boolean z4 = this.x;
                    aVar.d = z4;
                    if (z4) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!G2(a0Var, aVar) && !F2(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.b = this.y ? a0Var.b() - 1 : 0;
        }
    }

    private void I2(int i, int i2, boolean z2, RecyclerView.a0 a0Var) {
        int i3;
        this.t.m = z2();
        this.t.f = i;
        int[] iArr = this.H;
        boolean z3 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i == 1) {
            z3 = true;
        }
        this.t.h = z3 ? max2 : max;
        c cVar = this.t;
        if (!z3) {
            max = max2;
        }
        cVar.i = max;
        if (z3) {
            this.t.h += this.u.j();
            View m2 = m2();
            c cVar2 = this.t;
            if (this.x) {
                i4 = -1;
            }
            cVar2.e = i4;
            c cVar3 = this.t;
            int h0 = h0(m2);
            c cVar4 = this.t;
            cVar3.d = h0 + cVar4.e;
            cVar4.b = this.u.d(m2);
            i3 = this.u.d(m2) - this.u.i();
        } else {
            View n2 = n2();
            this.t.h += this.u.m();
            c cVar5 = this.t;
            if (!this.x) {
                i4 = -1;
            }
            cVar5.e = i4;
            c cVar6 = this.t;
            int h02 = h0(n2);
            c cVar7 = this.t;
            cVar6.d = h02 + cVar7.e;
            cVar7.b = this.u.g(n2);
            i3 = (-this.u.g(n2)) + this.u.m();
        }
        c cVar8 = this.t;
        cVar8.c = i2;
        if (z2) {
            cVar8.c = i2 - i3;
        }
        this.t.g = i3;
    }

    private void J2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        this.t.e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = C0188.f23;
    }

    private void K2(a aVar) {
        J2(aVar.b, aVar.c);
    }

    private void L2(int i, int i2) {
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f = -1;
        cVar2.b = i2;
        cVar2.g = C0188.f23;
    }

    private void M2(a aVar) {
        L2(aVar.b, aVar.c);
    }

    private int O1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.a(a0Var, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z);
    }

    private int P1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.b(a0Var, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z, this.x);
    }

    private int Q1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.c(a0Var, this.u, Y1(!this.z, true), X1(!this.z, true), this, this.z);
    }

    private View V1() {
        return d2(0, J());
    }

    private View W1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, 0, J(), a0Var.b());
    }

    private View a2() {
        return d2(J() - 1, -1);
    }

    private View b2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, J() - 1, -1, a0Var.b());
    }

    private View f2() {
        if (this.x) {
            return V1();
        }
        return a2();
    }

    private View g2() {
        if (this.x) {
            return a2();
        }
        return V1();
    }

    private View i2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.x) {
            return W1(vVar, a0Var);
        }
        return b2(vVar, a0Var);
    }

    private View j2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.x) {
            return b2(vVar, a0Var);
        }
        return W1(vVar, a0Var);
    }

    private int k2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -B2(-i3, vVar, a0Var);
        int i5 = i + i4;
        if (!z2 || (i2 = this.u.i() - i5) <= 0) {
            return i4;
        }
        this.u.r(i2);
        return i2 + i4;
    }

    private int l2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int m;
        int m2 = i - this.u.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -B2(m2, vVar, a0Var);
        int i3 = i + i2;
        if (!z2 || (m = i3 - this.u.m()) <= 0) {
            return i2;
        }
        this.u.r(-m);
        return i2 - m;
    }

    private View m2() {
        return I(this.x ? 0 : J() - 1);
    }

    private View n2() {
        return I(this.x ? J() - 1 : 0);
    }

    private void t2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        if (a0Var.g() && J() != 0 && !a0Var.e() && L1()) {
            List<RecyclerView.d0> k = vVar.k();
            int size = k.size();
            int h0 = h0(I(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.d0 d0Var = k.get(i5);
                if (!d0Var.v()) {
                    char c2 = 1;
                    if ((d0Var.m() < h0) != this.x) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.u.e(d0Var.a);
                    } else {
                        i4 += this.u.e(d0Var.a);
                    }
                }
            }
            this.t.l = k;
            if (i3 > 0) {
                L2(h0(n2()), i);
                c cVar = this.t;
                cVar.h = i3;
                cVar.c = 0;
                cVar.a();
                U1(vVar, this.t, a0Var, false);
            }
            if (i4 > 0) {
                J2(h0(m2()), i2);
                c cVar2 = this.t;
                cVar2.h = i4;
                cVar2.c = 0;
                cVar2.a();
                U1(vVar, this.t, a0Var, false);
            }
            this.t.l = null;
        }
    }

    private void v2(RecyclerView.v vVar, c cVar) {
        if (cVar.a && !cVar.m) {
            int i = cVar.g;
            int i2 = cVar.i;
            if (cVar.f == -1) {
                x2(vVar, i, i2);
            } else {
                y2(vVar, i, i2);
            }
        }
    }

    private void w2(RecyclerView.v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    n1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                n1(i, vVar);
                i--;
            }
        }
    }

    private void x2(RecyclerView.v vVar, int i, int i2) {
        int J = J();
        if (i >= 0) {
            int h = (this.u.h() - i) + i2;
            if (this.x) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I = I(i3);
                    if (this.u.g(I) < h || this.u.q(I) < h) {
                        w2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = J - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View I2 = I(i5);
                if (this.u.g(I2) < h || this.u.q(I2) < h) {
                    w2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void y2(RecyclerView.v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int J = J();
            if (this.x) {
                int i4 = J - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View I = I(i5);
                    if (this.u.d(I) > i3 || this.u.p(I) > i3) {
                        w2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < J; i6++) {
                View I2 = I(i6);
                if (this.u.d(I2) > i3 || this.u.p(I2) > i3) {
                    w2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    public int B2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i == 0) {
            return 0;
        }
        T1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        I2(i2, abs, true, a0Var);
        c cVar = this.t;
        int U1 = cVar.g + U1(vVar, cVar, a0Var, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i = i2 * U1;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View C(int i) {
        int J = J();
        if (J == 0) {
            return null;
        }
        int h0 = i - h0(I(0));
        if (h0 >= 0 && h0 < J) {
            View I = I(h0);
            if (h0(I) == i) {
                return I;
            }
        }
        return super.C(i);
    }

    public void C2(int i) {
        if (i == 0 || i == 1) {
            g(null);
            if (i != this.s || this.u == null) {
                j b2 = j.b(this, i);
                this.u = b2;
                this.E.a = b2;
                this.s = i;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(26772) + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z2) {
        g(null);
        if (z2 != this.w) {
            this.w = z2;
            t1();
        }
    }

    public void E2(boolean z2) {
        g(null);
        if (this.y != z2) {
            this.y = z2;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        if (this.C) {
            k1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        J1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int R1;
        View view2;
        View view3;
        A2();
        if (J() == 0 || (R1 = R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(R1, (int) (((float) this.u.n()) * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.g = C0188.f23;
        cVar.a = false;
        U1(vVar, cVar, a0Var, true);
        if (R1 == -1) {
            view2 = g2();
        } else {
            view2 = f2();
        }
        if (R1 == -1) {
            view3 = n2();
        } else {
            view3 = m2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && this.v == this.y;
    }

    public void M1(RecyclerView.a0 a0Var, int[] iArr) {
        int i;
        int o2 = o2(a0Var);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = o2;
            o2 = 0;
        }
        iArr[0] = o2;
        iArr[1] = i;
    }

    public void N1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i >= 0 && i < a0Var.b()) {
            cVar2.a(i, Math.max(0, cVar.g));
        }
    }

    public int R1(int i) {
        if (i == 1) {
            return (this.s != 1 && q2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.s != 1 && q2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.s == 1) {
                        return 1;
                    }
                    return C0188.f23;
                } else if (this.s == 0) {
                    return 1;
                } else {
                    return C0188.f23;
                }
            } else if (this.s == 1) {
                return -1;
            } else {
                return C0188.f23;
            }
        } else if (this.s == 0) {
            return -1;
        } else {
            return C0188.f23;
        }
    }

    public c S1() {
        return new c();
    }

    public void T1() {
        if (this.t == null) {
            this.t = S1();
        }
    }

    public int U1(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z2) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            v2(vVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            s2(vVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !a0Var.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    v2(vVar, cVar);
                }
                if (z2 && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View C2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            k1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.a;
        }
        T1();
        this.t.a = false;
        A2();
        View V = V();
        if (!this.E.e || this.A != -1 || this.D != null) {
            this.E.e();
            a aVar = this.E;
            aVar.d = this.x ^ this.y;
            H2(vVar, a0Var, aVar);
            this.E.e = true;
        } else if (V != null && (this.u.g(V) >= this.u.i() || this.u.d(V) <= this.u.m())) {
            this.E.c(V, h0(V));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (!(!a0Var.e() || (i6 = this.A) == -1 || this.B == Integer.MIN_VALUE || (C2 = C(i6)) == null)) {
            if (this.x) {
                i7 = this.u.i() - this.u.d(C2);
                i8 = this.B;
            } else {
                i8 = this.u.g(C2) - this.u.m();
                i7 = this.B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        if (!this.E.d ? !this.x : this.x) {
            i9 = 1;
        }
        u2(vVar, a0Var, this.E, i9);
        w(vVar);
        this.t.m = z2();
        this.t.j = a0Var.e();
        this.t.i = 0;
        a aVar2 = this.E;
        if (aVar2.d) {
            M2(aVar2);
            c cVar2 = this.t;
            cVar2.h = max;
            U1(vVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i11 = cVar3.d;
            int i12 = cVar3.c;
            if (i12 > 0) {
                max2 += i12;
            }
            K2(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            U1(vVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i13 = cVar5.c;
            if (i13 > 0) {
                L2(i11, i2);
                c cVar6 = this.t;
                cVar6.h = i13;
                U1(vVar, cVar6, a0Var, false);
                i2 = this.t.b;
            }
        } else {
            K2(aVar2);
            c cVar7 = this.t;
            cVar7.h = max2;
            U1(vVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i14 = cVar8.d;
            int i15 = cVar8.c;
            if (i15 > 0) {
                max += i15;
            }
            M2(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            U1(vVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i16 = cVar10.c;
            if (i16 > 0) {
                J2(i14, i);
                c cVar11 = this.t;
                cVar11.h = i16;
                U1(vVar, cVar11, a0Var, false);
                i = this.t.b;
            }
        }
        if (J() > 0) {
            if (this.x ^ this.y) {
                int k2 = k2(i, vVar, a0Var, true);
                i4 = i2 + k2;
                i3 = i + k2;
                i5 = l2(i4, vVar, a0Var, false);
            } else {
                int l2 = l2(i2, vVar, a0Var, true);
                i4 = i2 + l2;
                i3 = i + l2;
                i5 = k2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        t2(vVar, a0Var, i2, i);
        if (!a0Var.e()) {
            this.u.s();
        } else {
            this.E.e();
        }
        this.v = this.y;
    }

    public View X1(boolean z2, boolean z3) {
        if (this.x) {
            return e2(0, J(), z2, z3);
        }
        return e2(J() - 1, -1, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = C0188.f23;
        this.E.e();
    }

    public View Y1(boolean z2, boolean z3) {
        if (this.x) {
            return e2(J() - 1, -1, z2, z3);
        }
        return e2(0, J(), z2, z3);
    }

    public int Z1() {
        View e2 = e2(0, J(), false, true);
        if (e2 == null) {
            return -1;
        }
        return h0(e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        if (J() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < h0(I(0))) {
            z2 = true;
        }
        if (z2 != this.x) {
            i2 = -1;
        }
        if (this.s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            t1();
        }
    }

    public int c2() {
        View e2 = e2(J() - 1, -1, false, true);
        if (e2 == null) {
            return -1;
        }
        return h0(e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z2 = this.v ^ this.x;
            dVar.c = z2;
            if (z2) {
                View m2 = m2();
                dVar.b = this.u.i() - this.u.d(m2);
                dVar.a = h0(m2);
            } else {
                View n2 = n2();
                dVar.a = h0(n2);
                dVar.b = this.u.g(n2) - this.u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    public View d2(int i, int i2) {
        int i3;
        int i4;
        T1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return I(i);
        }
        if (this.u.g(I(i)) < this.u.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.s == 0) {
            return this.e.a(i, i2, i4, i3);
        }
        return this.f.a(i, i2, i4, i3);
    }

    public View e2(int i, int i2, boolean z2, boolean z3) {
        T1();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        if (this.s == 0) {
            return this.e.a(i, i2, i4, i3);
        }
        return this.f.a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    public View h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        T1();
        int m = this.u.m();
        int i4 = this.u.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = I(i);
            int h0 = h0(I);
            if (h0 >= 0 && h0 < i3) {
                if (((RecyclerView.p) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.u.g(I) < i4 && this.u.d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (J() != 0 && i != 0) {
            T1();
            I2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            N1(a0Var, this.t, cVar);
        }
    }

    @Deprecated
    public int o2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i, RecyclerView.o.c cVar) {
        boolean z2;
        int i2;
        d dVar = this.D;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            A2();
            z2 = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z2 = dVar2.c;
            i2 = dVar2.a;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int p2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    public boolean q2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public boolean r2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return true;
    }

    public void s2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d2 = cVar.d(vVar);
        if (d2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d2.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                d(d2);
            } else {
                e(d2, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                b(d2);
            } else {
                c(d2, 0);
            }
        }
        A0(d2, 0, 0);
        bVar.a = this.u.e(d2);
        if (this.s == 1) {
            if (q2()) {
                i5 = o0() - f0();
                i4 = i5 - this.u.f(d2);
            } else {
                i4 = e0();
                i5 = this.u.f(d2) + i4;
            }
            if (cVar.f == -1) {
                int i6 = cVar.b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.a;
            } else {
                int i7 = cVar.b;
                i3 = i7;
                i2 = i5;
                i = bVar.a + i7;
            }
        } else {
            int g0 = g0();
            int f = this.u.f(d2) + g0;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i2 = i8;
                i3 = g0;
                i = f;
                i4 = i8 - bVar.a;
            } else {
                int i9 = cVar.b;
                i3 = g0;
                i2 = bVar.a + i9;
                i = f;
                i4 = i9;
            }
        }
        z0(d2, i4, i3, i2, i);
        if (pVar.c() || pVar.b()) {
            bVar.c = true;
        }
        bVar.d = d2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return B2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i) {
        this.A = i;
        this.B = C0188.f23;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return B2(i, vVar, a0Var);
    }

    public boolean z2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = C0188.f23;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d i0 = RecyclerView.o.i0(context, attributeSet, i, i2);
        C2(i0.a);
        D2(i0.c);
        E2(i0.d);
    }
}
