package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q;
import defpackage.e6;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: o5  reason: default package */
/* compiled from: FragmentTransitionSupport */
public class o5 extends q {

    /* renamed from: o5$a */
    /* compiled from: FragmentTransitionSupport */
    class a extends e6.e {
        public final /* synthetic */ Rect a;

        public a(o5 o5Var, Rect rect) {
            this.a = rect;
        }

        @Override // defpackage.e6.e
        public Rect a(e6 e6Var) {
            return this.a;
        }
    }

    /* renamed from: o5$b */
    /* compiled from: FragmentTransitionSupport */
    class b implements e6.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(o5 o5Var, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // defpackage.e6.f
        public void a(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void b(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            e6Var.W(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // defpackage.e6.f
        public void d(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void e(e6 e6Var) {
        }
    }

    /* renamed from: o5$c */
    /* compiled from: FragmentTransitionSupport */
    class c extends f6 {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void a(e6 e6Var) {
            Object obj = this.a;
            if (obj != null) {
                o5.this.q(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                o5.this.q(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                o5.this.q(obj3, this.f, null);
            }
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            e6Var.W(this);
        }
    }

    /* renamed from: o5$d */
    /* compiled from: FragmentTransitionSupport */
    class d extends e6.e {
        public final /* synthetic */ Rect a;

        public d(o5 o5Var, Rect rect) {
            this.a = rect;
        }

        @Override // defpackage.e6.e
        public Rect a(e6 e6Var) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    private static boolean B(e6 e6Var) {
        return !q.l(e6Var.F()) || !q.l(e6Var.G()) || !q.l(e6Var.I());
    }

    @Override // androidx.fragment.app.q
    public Object A(Object obj) {
        if (obj == null) {
            return null;
        }
        i6 i6Var = new i6();
        i6Var.n0((e6) obj);
        return i6Var;
    }

    @Override // androidx.fragment.app.q
    public void a(Object obj, View view) {
        if (obj != null) {
            ((e6) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.q
    public void b(Object obj, ArrayList<View> arrayList) {
        e6 e6Var = (e6) obj;
        if (e6Var != null) {
            int i = 0;
            if (e6Var instanceof i6) {
                i6 i6Var = (i6) e6Var;
                int r0 = i6Var.r0();
                while (i < r0) {
                    b(i6Var.p0(i), arrayList);
                    i++;
                }
            } else if (!B(e6Var) && q.l(e6Var.J())) {
                int size = arrayList.size();
                while (i < size) {
                    e6Var.b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.q
    public void c(ViewGroup viewGroup, Object obj) {
        g6.a(viewGroup, (e6) obj);
    }

    @Override // androidx.fragment.app.q
    public boolean e(Object obj) {
        return obj instanceof e6;
    }

    @Override // androidx.fragment.app.q
    public Object g(Object obj) {
        if (obj != null) {
            return ((e6) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.q
    public Object m(Object obj, Object obj2, Object obj3) {
        e6 e6Var = (e6) obj;
        e6 e6Var2 = (e6) obj2;
        e6 e6Var3 = (e6) obj3;
        if (e6Var != null && e6Var2 != null) {
            i6 i6Var = new i6();
            i6Var.n0(e6Var);
            i6Var.n0(e6Var2);
            i6Var.z0(1);
            e6Var = i6Var;
        } else if (e6Var == null) {
            e6Var = e6Var2 != null ? e6Var2 : null;
        }
        if (e6Var3 == null) {
            return e6Var;
        }
        i6 i6Var2 = new i6();
        if (e6Var != null) {
            i6Var2.n0(e6Var);
        }
        i6Var2.n0(e6Var3);
        return i6Var2;
    }

    @Override // androidx.fragment.app.q
    public Object n(Object obj, Object obj2, Object obj3) {
        i6 i6Var = new i6();
        if (obj != null) {
            i6Var.n0((e6) obj);
        }
        if (obj2 != null) {
            i6Var.n0((e6) obj2);
        }
        if (obj3 != null) {
            i6Var.n0((e6) obj3);
        }
        return i6Var;
    }

    @Override // androidx.fragment.app.q
    public void p(Object obj, View view) {
        if (obj != null) {
            ((e6) obj).X(view);
        }
    }

    @Override // androidx.fragment.app.q
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        e6 e6Var = (e6) obj;
        int i2 = 0;
        if (e6Var instanceof i6) {
            i6 i6Var = (i6) e6Var;
            int r0 = i6Var.r0();
            while (i2 < r0) {
                q(i6Var.p0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!B(e6Var)) {
            List<View> J = e6Var.J();
            if (J.size() == arrayList.size() && J.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    e6Var.b(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e6Var.X(arrayList.get(size));
                }
            }
        }
    }

    @Override // androidx.fragment.app.q
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((e6) obj).a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.q
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((e6) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.q
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((e6) obj).c0(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.q
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((e6) obj).c0(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.q
    public void y(Object obj, View view, ArrayList<View> arrayList) {
        i6 i6Var = (i6) obj;
        List<View> J = i6Var.J();
        J.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q.d(J, arrayList.get(i));
        }
        J.add(view);
        arrayList.add(view);
        b(i6Var, arrayList);
    }

    @Override // androidx.fragment.app.q
    public void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        i6 i6Var = (i6) obj;
        if (i6Var != null) {
            i6Var.J().clear();
            i6Var.J().addAll(arrayList2);
            q(i6Var, arrayList, arrayList2);
        }
    }
}
