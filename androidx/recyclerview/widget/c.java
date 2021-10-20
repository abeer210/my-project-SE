package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* compiled from: DefaultItemAnimator */
public class c extends m {
    private static TimeInterpolator s;
    private ArrayList<RecyclerView.d0> h = new ArrayList<>();
    private ArrayList<RecyclerView.d0> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private ArrayList<i> k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    public ArrayList<ArrayList<j>> m = new ArrayList<>();
    public ArrayList<ArrayList<i>> n = new ArrayList<>();
    public ArrayList<RecyclerView.d0> o = new ArrayList<>();
    public ArrayList<RecyclerView.d0> p = new ArrayList<>();
    public ArrayList<RecyclerView.d0> q = new ArrayList<>();
    public ArrayList<RecyclerView.d0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    class a implements Runnable {
        public final /* synthetic */ ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.a.clear();
            c.this.m.remove(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    class b implements Runnable {
        public final /* synthetic */ ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.a.clear();
            c.this.n.remove(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    class RunnableC0022c implements Runnable {
        public final /* synthetic */ ArrayList a;

        public RunnableC0022c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.d0) it.next());
            }
            this.a.clear();
            c.this.l.remove(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.d0 a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = d0Var;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            c.this.G(this.a);
            c.this.q.remove(this.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.d0 a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = d0Var;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.c.setListener(null);
            c.this.A(this.a);
            c.this.o.remove(this.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.d0 a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public f(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = d0Var;
            this.b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.e.setListener(null);
            c.this.E(this.a);
            c.this.p.remove(this.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            c.this.C(this.a.a, true);
            c.this.r.remove(this.a.a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.a.a, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            c.this.C(this.a.b, false);
            c.this.r.remove(this.a.b);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.a.b, false);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator */
    public static class j {
        public RecyclerView.d0 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public j(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.a = d0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void T(RecyclerView.d0 d0Var) {
        View view = d0Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(d0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, d0Var) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.a;
        if (d0Var != null) {
            Y(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.b;
        if (d0Var2 != null) {
            Y(iVar, d0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (iVar.b == d0Var) {
            iVar.b = null;
        } else if (iVar.a != d0Var) {
            return false;
        } else {
            iVar.a = null;
            z = true;
        }
        d0Var.a.setAlpha(1.0f);
        d0Var.a.setTranslationX(0.0f);
        d0Var.a.setTranslationY(0.0f);
        C(d0Var, z);
        return true;
    }

    private void Z(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.a.animate().setInterpolator(s);
        j(d0Var);
    }

    public void Q(RecyclerView.d0 d0Var) {
        View view = d0Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(d0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, animate)).start();
    }

    public void R(i iVar) {
        View view;
        RecyclerView.d0 d0Var = iVar.a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.a;
        }
        RecyclerView.d0 d0Var2 = iVar.b;
        if (d0Var2 != null) {
            view2 = d0Var2.a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.r.add(iVar.a);
            duration.translationX((float) (iVar.e - iVar.c));
            duration.translationY((float) (iVar.f - iVar.d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.r.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public void S(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(d0Var);
        animate.setDuration(n()).setListener(new f(d0Var, i6, view, i7, animate)).start();
    }

    public void U(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).a.animate().cancel();
        }
    }

    public void V() {
        if (!p()) {
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d0Var);
                this.j.remove(size);
            }
        }
        W(this.k, d0Var);
        if (this.h.remove(d0Var)) {
            view.setAlpha(1.0f);
            G(d0Var);
        }
        if (this.i.remove(d0Var)) {
            view.setAlpha(1.0f);
            A(d0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.n.get(size2);
            W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(d0Var);
        this.o.remove(d0Var);
        this.r.remove(d0Var);
        this.p.remove(d0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.j.get(size);
            View view = jVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            G(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.i.get(size3);
            d0Var.a.setAlpha(1.0f);
            A(d0Var);
            this.i.remove(size3);
        }
        for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
            X(this.k.get(size4));
        }
        this.k.clear();
        if (p()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList2 = this.l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.a.setAlpha(1.0f);
                    A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            U(this.q);
            U(this.p);
            U(this.o);
            U(this.r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean z = !this.h.isEmpty();
        boolean z2 = !this.j.isEmpty();
        boolean z3 = !this.k.isEmpty();
        boolean z4 = !this.i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.d0> it = this.h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.h.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.j);
                this.m.add(arrayList);
                this.j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    k3.b0(arrayList.get(0).a.a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.k);
                this.n.add(arrayList2);
                this.k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    k3.b0(arrayList2.get(0).a.a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.i);
                this.l.add(arrayList3);
                this.i.clear();
                RunnableC0022c cVar = new RunnableC0022c(arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long o2 = z ? o() : 0;
                    long n2 = z2 ? n() : 0;
                    if (z3) {
                        j2 = m();
                    }
                    k3.b0(arrayList3.get(0).a, cVar, o2 + Math.max(n2, j2));
                    return;
                }
                cVar.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.d0 d0Var) {
        Z(d0Var);
        d0Var.a.setAlpha(0.0f);
        this.i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return y(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.a.getTranslationX();
        float translationY = d0Var.a.getTranslationY();
        float alpha = d0Var.a.getAlpha();
        Z(d0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        d0Var.a.setTranslationX(translationX);
        d0Var.a.setTranslationY(translationY);
        d0Var.a.setAlpha(alpha);
        if (d0Var2 != null) {
            Z(d0Var2);
            d0Var2.a.setTranslationX((float) (-i6));
            d0Var2.a.setTranslationY((float) (-i7));
            d0Var2.a.setAlpha(0.0f);
        }
        this.k.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.a.getTranslationY());
        Z(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            E(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.j.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.d0 d0Var) {
        Z(d0Var);
        this.h.add(d0Var);
        return true;
    }

    /* access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator */
    public static class i {
        public RecyclerView.d0 a;
        public RecyclerView.d0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.a = d0Var;
            this.b = d0Var2;
        }

        public String toString() {
            return C0201.m82(21874) + this.a + C0201.m82(21875) + this.b + C0201.m82(21876) + this.c + C0201.m82(21877) + this.d + C0201.m82(21878) + this.e + C0201.m82(21879) + this.f + '}';
        }

        public i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}
