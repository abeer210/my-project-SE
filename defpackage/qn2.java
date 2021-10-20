package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.reactnativenavigation.views.e;
import com.reactnativenavigation.views.i;
import com.reactnativenavigation.views.j;
import com.reactnativenavigation.views.n;
import com.reactnativenavigation.views.stack.StackBehaviour;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: qn2  reason: default package */
/* compiled from: StackController */
public class qn2 extends jl2<n> {
    private final mi2 A;
    private hl2<nl2> v = new hl2<>();
    private final be2 w;
    private final oi2 x;
    private yn2 y;
    private pn2 z;

    /* renamed from: qn2$a */
    /* compiled from: StackController */
    class a extends bj2 {
        public final /* synthetic */ hl2 b;
        public final /* synthetic */ List c;
        public final /* synthetic */ aj2 d;

        public a(hl2 hl2, List list, aj2 aj2) {
            this.b = hl2;
            this.c = list;
            this.d = aj2;
        }

        @Override // defpackage.aj2, defpackage.bj2
        public void a(String str) {
            qn2.this.L0(this.b);
            if (this.c.size() > 1) {
                for (int i = 0; i < this.c.size() - 1; i++) {
                    qn2.this.v.i(((nl2) this.c.get(i)).x(), this.c.get(i), i);
                    ((nl2) this.c.get(i)).d0(qn2.this);
                    if (i == 0) {
                        qn2.this.z.b((nl2) this.c.get(i));
                    } else {
                        qn2.this.z.a((nl2) this.c.get(i));
                    }
                }
            }
            this.d.a(str);
        }
    }

    public qn2(Activity activity, List<nl2> list, dl2 dl2, oi2 oi2, yn2 yn2, be2 be2, String str, bf2 bf2, pn2 pn2, mi2 mi2, ii2 ii2) {
        super(activity, dl2, str, ii2, bf2);
        this.x = oi2;
        this.y = yn2;
        this.w = be2;
        this.z = pn2;
        this.A = mi2;
        mi2.N(new gn2(this));
        for (nl2 nl2 : list) {
            nl2.d0(this);
            this.v.e(nl2.x(), nl2);
            if (f1() > 1) {
                pn2.a(nl2);
            }
        }
    }

    private void H0(nl2 nl2, bf2 bf2) {
        nl2.f0(bf2.h.a.b);
        if (f1() == 1) {
            this.A.c(bf2);
        }
        ((n) B()).addView(nl2.B(), ((n) B()).getChildCount() - 1, ej2.b(new StackBehaviour(this)));
    }

    private void I0(n nVar) {
        if (!N0()) {
            ViewGroup B = Z0().B();
            B.setId(cj2.a());
            this.A.c(Y());
            nVar.addView(B, 0, ej2.b(new StackBehaviour(this)));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void L0(hl2 hl2) {
        Iterator it = hl2.iterator();
        while (it.hasNext()) {
            ((nl2) hl2.b((String) it.next())).q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public void T0(nl2 nl2, aj2 aj2) {
        nl2.q();
        aj2.a(nl2.x());
        this.x.j(nl2.x());
    }

    public static /* synthetic */ void Q0(bf2 bf2, nl2 nl2, jl2 jl2) {
        bf2 i = bf2.i();
        i.f();
        i.a();
        i.d();
        i.g();
        i.h();
        jl2.A0(i, nl2);
    }

    /* access modifiers changed from: private */
    public void X0(String str) {
        if (C0201.m82(38669).equals(str)) {
            a1(bf2.n, new bj2());
        } else {
            b0(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public void U0(nl2 nl2, nl2 nl22, aj2 aj2) {
        if (!Z0().equals(nl22)) {
            ((n) B()).removeView(nl22.B());
        }
        aj2.a(nl2.x());
    }

    @Override // defpackage.jl2
    public void A0(bf2 bf2, nl2 nl2) {
        super.A0(bf2, nl2);
        if (nl2.G() && Z0() == nl2) {
            this.A.D(bf2, Y(), this, nl2);
            if (bf2.g.a()) {
                this.o.v(bf2.g, nl2, B());
            }
        }
        S(new mn2(bf2, nl2));
    }

    @Override // defpackage.jl2
    public void B0(nl2 nl2) {
        super.B0(nl2);
        this.A.L(nl2);
    }

    @Override // defpackage.nl2
    public boolean C(aj2 aj2) {
        if (!J0()) {
            return false;
        }
        a1(bf2.n, aj2);
        return true;
    }

    @Override // defpackage.jl2
    public void D0(ViewPager viewPager) {
        this.y.j(viewPager);
    }

    @Override // defpackage.jl2, defpackage.nl2
    public boolean E() {
        if (N0() || t0().D()) {
            return false;
        }
        ViewGroup B = t0().B();
        if (!(B instanceof e)) {
            return super.E();
        }
        if (!super.E() || !this.A.w(B)) {
            return false;
        }
        return true;
    }

    public boolean J0() {
        return this.v.size() > 1;
    }

    /* renamed from: K0 */
    public n p() {
        n nVar = new n(u(), this.y, x());
        this.A.k(this.y);
        I0(nVar);
        return nVar;
    }

    @Override // defpackage.nl2, defpackage.cl2
    public void M(bf2 bf2) {
        if (G()) {
            this.A.F(bf2, this, t0());
        }
        super.M(bf2);
    }

    @Override // defpackage.nl2
    public void N() {
        if (!N0() && !t0().D() && !G()) {
            this.A.b(Y(), this, t0());
        }
    }

    public boolean N0() {
        return this.v.isEmpty();
    }

    public /* synthetic */ void P0(nl2 nl2, jl2 jl2) {
        bf2 i = this.f.i();
        i.f();
        i.a();
        i.d();
        i.g();
        i.h();
        jl2.o0(i, nl2);
    }

    public /* synthetic */ void S0(View view, nl2 nl2) {
        if (view instanceof com.reactnativenavigation.views.topbar.a) {
            this.A.h(this, nl2);
        }
        if ((view instanceof i) || (view instanceof j)) {
            ej2.c(view, v());
        }
    }

    public /* synthetic */ void V0(nl2 nl2, nl2 nl22, bf2 bf2, aj2 aj2) {
        this.w.i(nl2, nl22, bf2, new kn2(aj2, nl2));
    }

    public nl2 Z0() {
        return this.v.peek();
    }

    public void a1(bf2 bf2, aj2 aj2) {
        if (!J0()) {
            aj2.onError(C0201.m82(38670));
            return;
        }
        Z0().M(bf2);
        bf2 Z = Z(this.A.q());
        nl2 pop = this.v.pop();
        nl2 peek = this.v.peek();
        pop.R();
        peek.Q();
        ViewGroup B = peek.B();
        if (B.getLayoutParams() == null) {
            B.setLayoutParams(ej2.b(new StackBehaviour(this)));
        }
        if (B.getParent() == null) {
            ((n) B()).addView(B, 0);
        }
        this.A.M(this, peek, pop);
        if (Z.h.b.a.j()) {
            this.w.h(pop.B(), Z.h.b, new in2(this, pop, aj2));
        } else {
            T0(pop, aj2);
        }
    }

    @Override // defpackage.nl2
    public void b0(String str) {
        Z0().b0(str);
    }

    public void b1(nl2 nl2, bf2 bf2, aj2 aj2) {
        if (!this.v.a(nl2.x()) || Z0().equals(nl2)) {
            aj2.onError(C0201.m82(38671));
            return;
        }
        this.w.d();
        for (int size = this.v.size() - 2; size >= 0; size--) {
            String x2 = this.v.get(size).x();
            if (x2.equals(nl2.x())) {
                break;
            }
            nl2 b = this.v.b(x2);
            this.v.f(b.x());
            b.q();
        }
        a1(bf2, aj2);
    }

    @Override // defpackage.nl2, com.reactnativenavigation.views.c
    public boolean c(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        qj2.d(s(viewGroup), new nn2(this, view));
        return false;
    }

    @Override // defpackage.jl2, defpackage.nl2, defpackage.cl2
    public void c0(bf2 bf2) {
        super.c0(bf2);
        this.A.O(bf2);
    }

    public void c1(bf2 bf2, aj2 aj2) {
        if (!J0()) {
            aj2.onError(C0201.m82(38672));
            return;
        }
        this.w.d();
        Iterator<String> it = this.v.iterator();
        it.next();
        while (this.v.size() > 2) {
            nl2 b = this.v.b(it.next());
            if (!this.v.c(b.x())) {
                this.v.g(it, b.x());
                b.q();
            }
        }
        a1(bf2, aj2);
    }

    public void d1(nl2 nl2, aj2 aj2) {
        if (t(nl2.x()) != null) {
            aj2.onError(C0201.m82(38673));
            return;
        }
        nl2 peek = this.v.peek();
        if (f1() > 0) {
            this.z.a(nl2);
        }
        nl2.d0(this);
        this.v.e(nl2.x(), nl2);
        bf2 Z = Z(this.A.q());
        H0(nl2, Z);
        if (peek == null) {
            aj2.a(nl2.x());
        } else if (Z.h.a.a.j()) {
            this.w.i(nl2, peek, Z, new on2(this, nl2, peek, aj2));
        } else {
            ((n) B()).removeView(peek.B());
            aj2.a(nl2.x());
        }
    }

    public void e1(List<nl2> list, aj2 aj2) {
        this.w.d();
        nl2 peek = this.v.peek();
        hl2<nl2> hl2 = this.v;
        this.v = new hl2<>();
        nl2 nl2 = (nl2) yi2.p(list);
        if (list.size() == 1) {
            this.z.b(nl2);
        } else {
            this.z.a(nl2);
        }
        nl2.d0(this);
        this.v.e(nl2.x(), nl2);
        bf2 Z = Z(this.A.q());
        H0(nl2, Z);
        a aVar = new a(hl2, list, aj2);
        if (peek == null || !Z.h.c.a.j()) {
            aVar.a(nl2.x());
        } else if (Z.h.c.b.i()) {
            nl2.B().setAlpha(0.0f);
            nl2.i(new jn2(this, nl2, peek, Z, aVar));
        } else {
            this.w.i(nl2, peek, Z, new hn2(aVar, nl2));
        }
    }

    public int f1() {
        return this.v.size();
    }

    @Override // defpackage.jl2
    public void o0(bf2 bf2, nl2 nl2) {
        super.o0(bf2, nl2);
        this.A.b(Y(), this, nl2);
        this.o.c(this.f.g, nl2, B());
        S(new ln2(this, nl2));
    }

    @Override // defpackage.jl2
    public void q0() {
        this.y.b();
    }

    @Override // defpackage.jl2
    public Collection<nl2> s0() {
        return this.v.j();
    }

    @Override // defpackage.jl2
    public nl2 t0() {
        return this.v.peek();
    }

    @Override // defpackage.jl2
    public int u0(nl2 nl2) {
        return this.A.v(C0(nl2));
    }
}
