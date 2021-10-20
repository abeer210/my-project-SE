package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.c;
import com.reactnativenavigation.views.e;
import com.reactnativenavigation.views.k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nl2  reason: default package */
/* compiled from: ViewController */
public abstract class nl2<T extends ViewGroup> implements ViewTreeObserver.OnGlobalLayoutListener, ViewGroup.OnHierarchyChangeListener, c {
    private final List<Runnable> a = new ArrayList();
    private boolean b;
    private boolean c = true;
    private sf2 d = new zf2();
    public bf2 e;
    public bf2 f;
    private final Activity g;
    private final String h;
    private pl2 i;
    public T j;
    private jl2<T> k;
    private boolean l;
    private boolean m;
    private a n = new ol2();
    public fi2 o;
    private io2 p;

    /* renamed from: nl2$a */
    /* compiled from: ViewController */
    public interface a {
        boolean a(View view);

        boolean b(View view);
    }

    public nl2(Activity activity, String str, pl2 pl2, bf2 bf2, io2 io2) {
        this.g = activity;
        this.h = str;
        this.i = pl2;
        this.o = new fi2();
        this.e = bf2;
        this.p = io2;
        this.f = bf2.i();
    }

    public int A() {
        return 0;
    }

    public T B() {
        if (this.j == null) {
            T p2 = p();
            this.j = p2;
            p2.setOnHierarchyChangeListener(this);
            this.j.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
        return this.j;
    }

    public boolean C(aj2 aj2) {
        return false;
    }

    public boolean D() {
        return this.m;
    }

    public boolean E() {
        if (this.j != null) {
            if (!this.d.h()) {
                T t = this.j;
                if (!(t instanceof k) || ((k) t).b()) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public boolean F(String str) {
        return tj2.b(this.h, str);
    }

    public boolean G() {
        T t;
        return !this.m && (t = this.j) != null && t.isShown() && E();
    }

    public /* synthetic */ void H(View view, ViewGroup viewGroup) {
        this.p.a(viewGroup, view);
    }

    public /* synthetic */ Integer I(jl2 jl2) {
        return Integer.valueOf(jl2.r0(this));
    }

    public /* synthetic */ void J(jl2 jl2) {
        jl2.p0();
        if (B() instanceof e) {
            jl2.o0(this.f, this);
        }
    }

    public /* synthetic */ void K() {
        yi2.i(this.a, gk2.a);
        this.a.clear();
    }

    public void M(bf2 bf2) {
        this.e = this.e.j(bf2);
        this.f = this.f.j(bf2);
        if (y() != null) {
            this.f.e();
            this.e.e();
        }
    }

    public void N() {
    }

    public void O() {
        this.l = true;
        m(this.f);
        S(new sk2(this));
        if (!this.a.isEmpty() && !this.b) {
            this.b = true;
            wj2.a(new uk2(this));
        }
    }

    public void P() {
        this.l = false;
    }

    public void Q() {
    }

    public void R() {
    }

    public void S(fj2<jl2> fj2) {
        jl2<T> jl2 = this.k;
        if (jl2 != null) {
            fj2.a(jl2);
        }
    }

    public void T(fj2<qn2> fj2) {
        jl2<T> jl2 = this.k;
        if (jl2 instanceof qn2) {
            fj2.a((qn2) jl2);
        } else if (this instanceof qn2) {
            fj2.a((qn2) this);
        } else {
            S(new wk2(fj2));
        }
    }

    public void U(fj2<View> fj2) {
        T t = this.j;
        if (t != null) {
            fj2.a(t);
        }
    }

    public void V(Runnable runnable) {
        this.a.remove(runnable);
    }

    public void W(View view) {
        this.p.c(view);
    }

    public jl2 X() {
        return this.k;
    }

    public bf2 Y() {
        return this.f;
    }

    public bf2 Z(bf2 bf2) {
        bf2 i2 = this.f.i();
        i2.m(bf2);
        return i2;
    }

    public void a0(fj2<T> fj2) {
        if (!this.m) {
            xj2.j(B(), fj2);
        }
    }

    @Override // com.reactnativenavigation.views.c
    public boolean b(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, int i2, int i3, int i4, int i5) {
        qj2.d(s(viewGroup), zk2.a);
        return false;
    }

    public abstract void b0(String str);

    @Override // com.reactnativenavigation.views.c
    public boolean c(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        return false;
    }

    public void c0(bf2 bf2) {
    }

    public void d0(jl2 jl2) {
        this.k = jl2;
    }

    public void e0(a aVar) {
        this.n = aVar;
    }

    public void f0(sf2 sf2) {
        this.d = sf2;
    }

    public void i(Runnable runnable) {
        if (this.l) {
            runnable.run();
        } else {
            this.a.add(runnable);
        }
    }

    public void j(View view) {
        qj2.d(this.j, new tk2(this, view));
    }

    public void k() {
    }

    public void l(nl2 nl2, fj2<nl2> fj2) {
        if (nl2 != null) {
            fj2.a(nl2);
        }
    }

    public void m(bf2 bf2) {
    }

    public void n() {
    }

    public void o(ViewGroup viewGroup, int i2) {
        T t = this.j;
        if (t != null && t.getParent() == null) {
            viewGroup.addView(this.j, i2);
        }
    }

    public void onChildViewAdded(View view, View view2) {
        this.i.c(view, view2);
    }

    public void onChildViewRemoved(View view, View view2) {
    }

    public void onGlobalLayout() {
        if (this.c) {
            N();
            this.c = false;
        }
        if (this.l || !G()) {
            if (this.l && !G() && !this.n.a(this.j)) {
                this.l = false;
                P();
            }
        } else if (!this.n.b(this.j)) {
            this.l = true;
            O();
        }
    }

    public abstract T p();

    public void q() {
        if (this.l) {
            this.l = false;
            P();
        }
        this.i.b();
        T t = this.j;
        if (t instanceof fl2) {
            ((fl2) t).destroy();
        }
        T t2 = this.j;
        if (t2 != null) {
            t2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.j.setOnHierarchyChangeListener(null);
            if (this.j.getParent() instanceof ViewGroup) {
                ((ViewManager) this.j.getParent()).removeView(this.j);
            }
            this.j = null;
            this.m = true;
        }
    }

    public void r() {
        T t = this.j;
        if (t != null && t.getParent() != null) {
            ((ViewManager) this.j.getParent()).removeView(this.j);
        }
    }

    public nl2 s(View view) {
        if (this.j == view) {
            return this;
        }
        return null;
    }

    public nl2 t(String str) {
        if (F(str)) {
            return this;
        }
        return null;
    }

    public Activity u() {
        return this.g;
    }

    public int v() {
        return ((Integer) qj2.c(this.k, 0, new vk2(this))).intValue();
    }

    public abstract String w();

    public String x() {
        return this.h;
    }

    public jl2 y() {
        return this.k;
    }

    public fe2 z() {
        return null;
    }
}
