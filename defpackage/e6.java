package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: e6  reason: default package */
/* compiled from: Transition */
public abstract class e6 implements Cloneable {
    private static final int[] J = {2, 1, 3, 4};
    private static final w5 K = new a();
    private static ThreadLocal<r0<Animator, d>> L = new ThreadLocal<>();
    private int A = 0;
    private boolean B = false;
    private boolean C = false;
    private ArrayList<f> D = null;
    private ArrayList<Animator> E = new ArrayList<>();
    public h6 F;
    private e G;
    private r0<String, String> H;
    private w5 I = K;
    private String a = getClass().getName();
    private long b = -1;
    public long c = -1;
    private TimeInterpolator d = null;
    public ArrayList<Integer> e = new ArrayList<>();
    public ArrayList<View> f = new ArrayList<>();
    private ArrayList<String> g = null;
    private ArrayList<Class<?>> h = null;
    private ArrayList<Integer> i = null;
    private ArrayList<View> j = null;
    private ArrayList<Class<?>> k = null;
    private ArrayList<String> l = null;
    private ArrayList<Integer> m = null;
    private ArrayList<View> n = null;
    private ArrayList<Class<?>> o = null;
    private l6 p = new l6();
    private l6 q = new l6();
    public i6 u = null;
    private int[] v = J;
    private ArrayList<k6> w;
    private ArrayList<k6> x;
    public boolean y = false;
    public ArrayList<Animator> z = new ArrayList<>();

    /* renamed from: e6$a */
    /* compiled from: Transition */
    static class a extends w5 {
        @Override // defpackage.w5
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e6$b */
    /* compiled from: Transition */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ r0 a;

        public b(r0 r0Var) {
            this.a = r0Var;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            e6.this.z.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            e6.this.z.add(animator);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e6$c */
    /* compiled from: Transition */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public void onAnimationEnd(Animator animator) {
            e6.this.s();
            animator.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e6$d */
    /* compiled from: Transition */
    public static class d {
        public View a;
        public String b;
        public k6 c;
        public g7 d;
        public e6 e;

        public d(View view, String str, e6 e6Var, g7 g7Var, k6 k6Var) {
            this.a = view;
            this.b = str;
            this.c = k6Var;
            this.d = g7Var;
            this.e = e6Var;
        }
    }

    /* renamed from: e6$e */
    /* compiled from: Transition */
    public static abstract class e {
        public abstract Rect a(e6 e6Var);
    }

    /* renamed from: e6$f */
    /* compiled from: Transition */
    public interface f {
        void a(e6 e6Var);

        void b(e6 e6Var);

        void c(e6 e6Var);

        void d(e6 e6Var);

        void e(e6 e6Var);
    }

    private static r0<Animator, d> C() {
        r0<Animator, d> r0Var = L.get();
        if (r0Var != null) {
            return r0Var;
        }
        r0<Animator, d> r0Var2 = new r0<>();
        L.set(r0Var2);
        return r0Var2;
    }

    private static boolean O(k6 k6Var, k6 k6Var2, String str) {
        Object obj = k6Var.a.get(str);
        Object obj2 = k6Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void P(r0<View, k6> r0Var, r0<View, k6> r0Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && N(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && N(view)) {
                k6 k6Var = r0Var.get(valueAt);
                k6 k6Var2 = r0Var2.get(view);
                if (!(k6Var == null || k6Var2 == null)) {
                    this.w.add(k6Var);
                    this.x.add(k6Var2);
                    r0Var.remove(valueAt);
                    r0Var2.remove(view);
                }
            }
        }
    }

    private void Q(r0<View, k6> r0Var, r0<View, k6> r0Var2) {
        k6 remove;
        for (int size = r0Var.size() - 1; size >= 0; size--) {
            View i2 = r0Var.i(size);
            if (i2 != null && N(i2) && (remove = r0Var2.remove(i2)) != null && N(remove.b)) {
                this.w.add(r0Var.k(size));
                this.x.add(remove);
            }
        }
    }

    private void R(r0<View, k6> r0Var, r0<View, k6> r0Var2, u0<View> u0Var, u0<View> u0Var2) {
        View g2;
        int q2 = u0Var.q();
        for (int i2 = 0; i2 < q2; i2++) {
            View s = u0Var.s(i2);
            if (s != null && N(s) && (g2 = u0Var2.g(u0Var.l(i2))) != null && N(g2)) {
                k6 k6Var = r0Var.get(s);
                k6 k6Var2 = r0Var2.get(g2);
                if (!(k6Var == null || k6Var2 == null)) {
                    this.w.add(k6Var);
                    this.x.add(k6Var2);
                    r0Var.remove(s);
                    r0Var2.remove(g2);
                }
            }
        }
    }

    private void S(r0<View, k6> r0Var, r0<View, k6> r0Var2, r0<String, View> r0Var3, r0<String, View> r0Var4) {
        View view;
        int size = r0Var3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View m2 = r0Var3.m(i2);
            if (m2 != null && N(m2) && (view = r0Var4.get(r0Var3.i(i2))) != null && N(view)) {
                k6 k6Var = r0Var.get(m2);
                k6 k6Var2 = r0Var2.get(view);
                if (!(k6Var == null || k6Var2 == null)) {
                    this.w.add(k6Var);
                    this.x.add(k6Var2);
                    r0Var.remove(m2);
                    r0Var2.remove(view);
                }
            }
        }
    }

    private void T(l6 l6Var, l6 l6Var2) {
        r0<View, k6> r0Var = new r0<>(l6Var.a);
        r0<View, k6> r0Var2 = new r0<>(l6Var2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.v;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    Q(r0Var, r0Var2);
                } else if (i3 == 2) {
                    S(r0Var, r0Var2, l6Var.d, l6Var2.d);
                } else if (i3 == 3) {
                    P(r0Var, r0Var2, l6Var.b, l6Var2.b);
                } else if (i3 == 4) {
                    R(r0Var, r0Var2, l6Var.c, l6Var2.c);
                }
                i2++;
            } else {
                c(r0Var, r0Var2);
                return;
            }
        }
    }

    private void Z(Animator animator, r0<Animator, d> r0Var) {
        if (animator != null) {
            animator.addListener(new b(r0Var));
            e(animator);
        }
    }

    private void c(r0<View, k6> r0Var, r0<View, k6> r0Var2) {
        for (int i2 = 0; i2 < r0Var.size(); i2++) {
            k6 m2 = r0Var.m(i2);
            if (N(m2.b)) {
                this.w.add(m2);
                this.x.add(null);
            }
        }
        for (int i3 = 0; i3 < r0Var2.size(); i3++) {
            k6 m3 = r0Var2.m(i3);
            if (N(m3.b)) {
                this.x.add(m3);
                this.w.add(null);
            }
        }
    }

    private static void d(l6 l6Var, View view, k6 k6Var) {
        l6Var.a.put(view, k6Var);
        int id = view.getId();
        if (id >= 0) {
            if (l6Var.b.indexOfKey(id) >= 0) {
                l6Var.b.put(id, null);
            } else {
                l6Var.b.put(id, view);
            }
        }
        String D2 = k3.D(view);
        if (D2 != null) {
            if (l6Var.d.containsKey(D2)) {
                l6Var.d.put(D2, null);
            } else {
                l6Var.d.put(D2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (l6Var.c.j(itemIdAtPosition) >= 0) {
                    View g2 = l6Var.c.g(itemIdAtPosition);
                    if (g2 != null) {
                        k3.p0(g2, false);
                        l6Var.c.m(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                k3.p0(view, true);
                l6Var.c.m(itemIdAtPosition, view);
            }
        }
    }

    private void g(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.i;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.j;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.k;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (this.k.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        k6 k6Var = new k6(view);
                        if (z2) {
                            j(k6Var);
                        } else {
                            f(k6Var);
                        }
                        k6Var.c.add(this);
                        i(k6Var);
                        if (z2) {
                            d(this.p, view, k6Var);
                        } else {
                            d(this.q, view, k6Var);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.m;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.n;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.o;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        if (this.o.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    g(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public h6 B() {
        return this.F;
    }

    public long D() {
        return this.b;
    }

    public List<Integer> F() {
        return this.e;
    }

    public List<String> G() {
        return this.g;
    }

    public List<Class<?>> I() {
        return this.h;
    }

    public List<View> J() {
        return this.f;
    }

    public String[] K() {
        return null;
    }

    public k6 L(View view, boolean z2) {
        i6 i6Var = this.u;
        if (i6Var != null) {
            return i6Var.L(view, z2);
        }
        return (z2 ? this.p : this.q).a.get(view);
    }

    public boolean M(k6 k6Var, k6 k6Var2) {
        if (k6Var == null || k6Var2 == null) {
            return false;
        }
        String[] K2 = K();
        if (K2 != null) {
            for (String str : K2) {
                if (!O(k6Var, k6Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : k6Var.a.keySet()) {
            if (O(k6Var, k6Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean N(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.k.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.l == null || k3.D(view) == null || !this.l.contains(k3.D(view)))) {
            return false;
        }
        if ((this.e.size() == 0 && this.f.size() == 0 && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.g) == null || arrayList2.isEmpty()))) || this.e.contains(Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.g;
        if (arrayList6 != null && arrayList6.contains(k3.D(view))) {
            return true;
        }
        if (this.h != null) {
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                if (this.h.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void U(View view) {
        if (!this.C) {
            r0<Animator, d> C2 = C();
            int size = C2.size();
            g7 d2 = v6.d(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d m2 = C2.m(i2);
                if (m2.a != null && d2.equals(m2.d)) {
                    h5.b(C2.i(i2));
                }
            }
            ArrayList<f> arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.D.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((f) arrayList2.get(i3)).b(this);
                }
            }
            this.B = true;
        }
    }

    public void V(ViewGroup viewGroup) {
        d dVar;
        this.w = new ArrayList<>();
        this.x = new ArrayList<>();
        T(this.p, this.q);
        r0<Animator, d> C2 = C();
        int size = C2.size();
        g7 d2 = v6.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator i3 = C2.i(i2);
            if (!(i3 == null || (dVar = C2.get(i3)) == null || dVar.a == null || !d2.equals(dVar.d))) {
                k6 k6Var = dVar.c;
                View view = dVar.a;
                k6 L2 = L(view, true);
                k6 x2 = x(view, true);
                if (L2 == null && x2 == null) {
                    x2 = this.q.a.get(view);
                }
                if (!(L2 == null && x2 == null) && dVar.e.M(k6Var, x2)) {
                    if (i3.isRunning() || i3.isStarted()) {
                        i3.cancel();
                    } else {
                        C2.remove(i3);
                    }
                }
            }
        }
        q(viewGroup, this.p, this.q, this.w, this.x);
        a0();
    }

    public e6 W(f fVar) {
        ArrayList<f> arrayList = this.D;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.D.size() == 0) {
            this.D = null;
        }
        return this;
    }

    public e6 X(View view) {
        this.f.remove(view);
        return this;
    }

    public void Y(View view) {
        if (this.B) {
            if (!this.C) {
                r0<Animator, d> C2 = C();
                int size = C2.size();
                g7 d2 = v6.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d m2 = C2.m(i2);
                    if (m2.a != null && d2.equals(m2.d)) {
                        h5.c(C2.i(i2));
                    }
                }
                ArrayList<f> arrayList = this.D;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.D.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).e(this);
                    }
                }
            }
            this.B = false;
        }
    }

    public e6 a(f fVar) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(fVar);
        return this;
    }

    public void a0() {
        i0();
        r0<Animator, d> C2 = C();
        Iterator<Animator> it = this.E.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (C2.containsKey(next)) {
                i0();
                Z(next, C2);
            }
        }
        this.E.clear();
        s();
    }

    public e6 b(View view) {
        this.f.add(view);
        return this;
    }

    public e6 b0(long j2) {
        this.c = j2;
        return this;
    }

    public void c0(e eVar) {
        this.G = eVar;
    }

    public void cancel() {
        for (int size = this.z.size() - 1; size >= 0; size--) {
            this.z.get(size).cancel();
        }
        ArrayList<f> arrayList = this.D;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.D.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).d(this);
            }
        }
    }

    public e6 d0(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    public void e(Animator animator) {
        if (animator == null) {
            s();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (D() >= 0) {
            animator.setStartDelay(D() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void e0(w5 w5Var) {
        if (w5Var == null) {
            this.I = K;
        } else {
            this.I = w5Var;
        }
    }

    public abstract void f(k6 k6Var);

    public void f0(h6 h6Var) {
        this.F = h6Var;
    }

    public e6 h0(long j2) {
        this.b = j2;
        return this;
    }

    public void i(k6 k6Var) {
        String[] b2;
        if (this.F != null && !k6Var.a.isEmpty() && (b2 = this.F.b()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= b2.length) {
                    z2 = true;
                    break;
                } else if (!k6Var.a.containsKey(b2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.F.a(k6Var);
            }
        }
    }

    public void i0() {
        if (this.A == 0) {
            ArrayList<f> arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.C = false;
        }
        this.A++;
    }

    public abstract void j(k6 k6Var);

    public String j0(String str) {
        String str2 = str + getClass().getSimpleName() + C0201.m82(8747) + Integer.toHexString(hashCode()) + C0201.m82(8748);
        long j2 = this.c;
        String r4 = C0201.m82(8749);
        if (j2 != -1) {
            str2 = str2 + C0201.m82(8750) + this.c + r4;
        }
        if (this.b != -1) {
            str2 = str2 + C0201.m82(8751) + this.b + r4;
        }
        if (this.d != null) {
            str2 = str2 + C0201.m82(8752) + this.d + r4;
        }
        if (this.e.size() <= 0 && this.f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + C0201.m82(8753);
        int size = this.e.size();
        String r1 = C0201.m82(8754);
        if (size > 0) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + r1;
                }
                str3 = str3 + this.e.get(i2);
            }
        }
        if (this.f.size() > 0) {
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + r1;
                }
                str3 = str3 + this.f.get(i3);
            }
        }
        return str3 + C0201.m82(8755);
    }

    public void l(ViewGroup viewGroup, boolean z2) {
        r0<String, String> r0Var;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        m(z2);
        if ((this.e.size() > 0 || this.f.size() > 0) && (((arrayList = this.g) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.e.get(i2).intValue());
                if (findViewById != null) {
                    k6 k6Var = new k6(findViewById);
                    if (z2) {
                        j(k6Var);
                    } else {
                        f(k6Var);
                    }
                    k6Var.c.add(this);
                    i(k6Var);
                    if (z2) {
                        d(this.p, findViewById, k6Var);
                    } else {
                        d(this.q, findViewById, k6Var);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                View view = this.f.get(i3);
                k6 k6Var2 = new k6(view);
                if (z2) {
                    j(k6Var2);
                } else {
                    f(k6Var2);
                }
                k6Var2.c.add(this);
                i(k6Var2);
                if (z2) {
                    d(this.p, view, k6Var2);
                } else {
                    d(this.q, view, k6Var2);
                }
            }
        } else {
            g(viewGroup, z2);
        }
        if (!(z2 || (r0Var = this.H) == null)) {
            int size = r0Var.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.p.d.remove(this.H.i(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.p.d.put(this.H.m(i5), view2);
                }
            }
        }
    }

    public void m(boolean z2) {
        if (z2) {
            this.p.a.clear();
            this.p.b.clear();
            this.p.c.b();
            return;
        }
        this.q.a.clear();
        this.q.b.clear();
        this.q.c.b();
    }

    /* renamed from: n */
    public e6 clone() {
        try {
            e6 e6Var = (e6) super.clone();
            e6Var.E = new ArrayList<>();
            e6Var.p = new l6();
            e6Var.q = new l6();
            e6Var.w = null;
            e6Var.x = null;
            return e6Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, k6 k6Var, k6 k6Var2) {
        return null;
    }

    public void q(ViewGroup viewGroup, l6 l6Var, l6 l6Var2, ArrayList<k6> arrayList, ArrayList<k6> arrayList2) {
        int i2;
        int i3;
        Animator o2;
        View view;
        Animator animator;
        k6 k6Var;
        k6 k6Var2;
        Animator animator2;
        r0<Animator, d> C2 = C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            k6 k6Var3 = arrayList.get(i4);
            k6 k6Var4 = arrayList2.get(i4);
            if (k6Var3 != null && !k6Var3.c.contains(this)) {
                k6Var3 = null;
            }
            if (k6Var4 != null && !k6Var4.c.contains(this)) {
                k6Var4 = null;
            }
            if (!(k6Var3 == null && k6Var4 == null)) {
                if ((k6Var3 == null || k6Var4 == null || M(k6Var3, k6Var4)) && (o2 = o(viewGroup, k6Var3, k6Var4)) != null) {
                    if (k6Var4 != null) {
                        view = k6Var4.b;
                        String[] K2 = K();
                        if (K2 != null && K2.length > 0) {
                            k6Var2 = new k6(view);
                            i3 = size;
                            k6 k6Var5 = l6Var2.a.get(view);
                            if (k6Var5 != null) {
                                int i5 = 0;
                                while (i5 < K2.length) {
                                    k6Var2.a.put(K2[i5], k6Var5.a.get(K2[i5]));
                                    i5++;
                                    i4 = i4;
                                    k6Var5 = k6Var5;
                                }
                            }
                            i2 = i4;
                            int size2 = C2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = o2;
                                    break;
                                }
                                d dVar = C2.get(C2.i(i6));
                                if (dVar.c != null && dVar.a == view && dVar.b.equals(y()) && dVar.c.equals(k6Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i3 = size;
                            i2 = i4;
                            animator2 = o2;
                            k6Var2 = null;
                        }
                        animator = animator2;
                        k6Var = k6Var2;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = k6Var3.b;
                        animator = o2;
                        k6Var = null;
                    }
                    if (animator != null) {
                        h6 h6Var = this.F;
                        if (h6Var != null) {
                            long c2 = h6Var.c(viewGroup, this, k6Var3, k6Var4);
                            sparseIntArray.put(this.E.size(), (int) c2);
                            j2 = Math.min(c2, j2);
                        }
                        C2.put(animator, new d(view, y(), this, v6.d(viewGroup), k6Var));
                        this.E.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.E.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j2) + animator3.getStartDelay());
            }
        }
    }

    public void s() {
        int i2 = this.A - 1;
        this.A = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.D;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.D.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.p.c.q(); i4++) {
                View s = this.p.c.s(i4);
                if (s != null) {
                    k3.p0(s, false);
                }
            }
            for (int i5 = 0; i5 < this.q.c.q(); i5++) {
                View s2 = this.q.c.s(i5);
                if (s2 != null) {
                    k3.p0(s2, false);
                }
            }
            this.C = true;
        }
    }

    public long t() {
        return this.c;
    }

    public String toString() {
        return j0(C0201.m82(8756));
    }

    public Rect u() {
        e eVar = this.G;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public e v() {
        return this.G;
    }

    public TimeInterpolator w() {
        return this.d;
    }

    public k6 x(View view, boolean z2) {
        i6 i6Var = this.u;
        if (i6Var != null) {
            return i6Var.x(view, z2);
        }
        ArrayList<k6> arrayList = z2 ? this.w : this.x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            k6 k6Var = arrayList.get(i3);
            if (k6Var == null) {
                return null;
            }
            if (k6Var.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.x : this.w).get(i2);
    }

    public String y() {
        return this.a;
    }

    public w5 z() {
        return this.I;
    }
}
