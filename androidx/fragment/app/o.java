package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import vigqyno.C0201;

/* compiled from: FragmentTransition */
public class o {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    private static final q b = (Build.VERSION.SDK_INT >= 21 ? new p() : null);
    private static final q c = x();

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentTransition */
    public static class a implements Runnable {
        public final /* synthetic */ ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public void run() {
            o.B(this.a, 4);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentTransition */
    public static class b implements Runnable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ q b;
        public final /* synthetic */ View c;
        public final /* synthetic */ Fragment d;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ ArrayList g;
        public final /* synthetic */ Object h;

        public b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.a = obj;
            this.b = qVar;
            this.c = view;
            this.d = fragment;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = arrayList3;
            this.h = obj2;
        }

        public void run() {
            Object obj = this.a;
            if (obj != null) {
                this.b.p(obj, this.c);
                this.f.addAll(o.k(this.b, this.a, this.d, this.e, this.c));
            }
            if (this.g != null) {
                if (this.h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.c);
                    this.b.q(this.h, this.g, arrayList);
                }
                this.g.clear();
                this.g.add(this.c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentTransition */
    public static class c implements Runnable {
        public final /* synthetic */ Fragment a;
        public final /* synthetic */ Fragment b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ r0 d;
        public final /* synthetic */ View e;
        public final /* synthetic */ q f;
        public final /* synthetic */ Rect g;

        public c(Fragment fragment, Fragment fragment2, boolean z, r0 r0Var, View view, q qVar, Rect rect) {
            this.a = fragment;
            this.b = fragment2;
            this.c = z;
            this.d = r0Var;
            this.e = view;
            this.f = qVar;
            this.g = rect;
        }

        public void run() {
            o.f(this.a, this.b, this.c, this.d, false);
            View view = this.e;
            if (view != null) {
                this.f.k(view, this.g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentTransition */
    public static class d implements Runnable {
        public final /* synthetic */ q a;
        public final /* synthetic */ r0 b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ e d;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ View f;
        public final /* synthetic */ Fragment g;
        public final /* synthetic */ Fragment h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ ArrayList j;
        public final /* synthetic */ Object k;
        public final /* synthetic */ Rect l;

        public d(q qVar, r0 r0Var, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.a = qVar;
            this.b = r0Var;
            this.c = obj;
            this.d = eVar;
            this.e = arrayList;
            this.f = view;
            this.g = fragment;
            this.h = fragment2;
            this.i = z;
            this.j = arrayList2;
            this.k = obj2;
            this.l = rect;
        }

        public void run() {
            r0<String, View> h2 = o.h(this.a, this.b, this.c, this.d);
            if (h2 != null) {
                this.e.addAll(h2.values());
                this.e.add(this.f);
            }
            o.f(this.g, this.h, this.i, h2, false);
            Object obj = this.c;
            if (obj != null) {
                this.a.z(obj, this.j, this.e);
                View t = o.t(h2, this.d, this.k, this.i);
                if (t != null) {
                    this.a.k(t, this.l);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentTransition */
    public static class e {
        public Fragment a;
        public boolean b;
        public a c;
        public Fragment d;
        public boolean e;
        public a f;
    }

    private static void A(q qVar, Object obj, Object obj2, r0<String, View> r0Var, boolean z, a aVar) {
        String str;
        ArrayList<String> arrayList = aVar.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar.o.get(0);
            } else {
                str = aVar.n.get(0);
            }
            View view = r0Var.get(str);
            qVar.v(obj, view);
            if (obj2 != null) {
                qVar.v(obj2, view);
            }
        }
    }

    public static void B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    public static void C(j jVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (jVar.p >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    e(aVar, sparseArray, z);
                } else {
                    c(aVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(jVar.q.f());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    r0<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
                    e eVar = (e) sparseArray.valueAt(i4);
                    if (z) {
                        o(jVar, keyAt, eVar, view, d2);
                    } else {
                        n(jVar, keyAt, eVar, view, d2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, r0<String, View> r0Var, Collection<String> collection) {
        for (int size = r0Var.size() - 1; size >= 0; size--) {
            View m = r0Var.m(size);
            if (collection.contains(k3.D(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.mAdded != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.mHidden == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    private static void b(a aVar, n.a aVar2, SparseArray<e> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        e eVar;
        j jVar;
        boolean z6;
        Fragment fragment = aVar2.b;
        if (fragment != null && (i = fragment.mContainerId) != 0) {
            int i2 = z ? a[aVar2.a] : aVar2.a;
            boolean z7 = false;
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    z5 = false;
                                    z4 = false;
                                    z3 = false;
                                    e eVar2 = sparseArray.get(i);
                                    if (z7) {
                                        eVar2 = p(eVar2, sparseArray, i);
                                        eVar2.a = fragment;
                                        eVar2.b = z;
                                        eVar2.c = aVar;
                                    }
                                    eVar = eVar2;
                                    if (!z2 && z5) {
                                        if (eVar != null && eVar.d == fragment) {
                                            eVar.d = null;
                                        }
                                        jVar = aVar.r;
                                        if (fragment.mState < 1 && jVar.p >= 1 && !aVar.p) {
                                            jVar.I0(fragment);
                                            jVar.Q0(fragment, 1, 0, 0, false);
                                        }
                                    }
                                    if (z3 && (eVar == null || eVar.d == null)) {
                                        eVar = p(eVar, sparseArray, i);
                                        eVar.d = fragment;
                                        eVar.e = z;
                                        eVar.f = aVar;
                                    }
                                    if (z2 && z4 && eVar != null && eVar.a == fragment) {
                                        eVar.a = null;
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else if (z2) {
                            if (fragment.mHiddenChanged) {
                                if (!fragment.mHidden) {
                                }
                            }
                            z6 = false;
                            z7 = z6;
                            z5 = true;
                            z4 = false;
                            z3 = false;
                            e eVar22 = sparseArray.get(i);
                            if (z7) {
                            }
                            eVar = eVar22;
                            eVar.d = null;
                            jVar = aVar.r;
                            jVar.I0(fragment);
                            jVar.Q0(fragment, 1, 0, 0, false);
                            eVar = p(eVar, sparseArray, i);
                            eVar.d = fragment;
                            eVar.e = z;
                            eVar.f = aVar;
                            if (z2) {
                                return;
                            }
                            return;
                        } else {
                            z6 = fragment.mHidden;
                            z7 = z6;
                            z5 = true;
                            z4 = false;
                            z3 = false;
                            e eVar222 = sparseArray.get(i);
                            if (z7) {
                            }
                            eVar = eVar222;
                            eVar.d = null;
                            jVar = aVar.r;
                            jVar.I0(fragment);
                            jVar.Q0(fragment, 1, 0, 0, false);
                            eVar = p(eVar, sparseArray, i);
                            eVar.d = fragment;
                            eVar.e = z;
                            eVar.f = aVar;
                            if (z2) {
                            }
                        }
                    } else if (!z2) {
                        boolean z8 = false;
                        z3 = z8;
                        z5 = false;
                        z4 = true;
                        e eVar2222 = sparseArray.get(i);
                        if (z7) {
                        }
                        eVar = eVar2222;
                        eVar.d = null;
                        jVar = aVar.r;
                        jVar.I0(fragment);
                        jVar.Q0(fragment, 1, 0, 0, false);
                        eVar = p(eVar, sparseArray, i);
                        eVar.d = fragment;
                        eVar.e = z;
                        eVar.f = aVar;
                        if (z2) {
                        }
                    } else {
                        boolean z82 = false;
                        z3 = z82;
                        z5 = false;
                        z4 = true;
                        e eVar22222 = sparseArray.get(i);
                        if (z7) {
                        }
                        eVar = eVar22222;
                        eVar.d = null;
                        jVar = aVar.r;
                        jVar.I0(fragment);
                        jVar.Q0(fragment, 1, 0, 0, false);
                        eVar = p(eVar, sparseArray, i);
                        eVar.d = fragment;
                        eVar.e = z;
                        eVar.f = aVar;
                        if (z2) {
                        }
                    }
                }
                if (!z2) {
                    boolean z822 = false;
                    z3 = z822;
                    z5 = false;
                    z4 = true;
                    e eVar222222 = sparseArray.get(i);
                    if (z7) {
                    }
                    eVar = eVar222222;
                    eVar.d = null;
                    jVar = aVar.r;
                    jVar.I0(fragment);
                    jVar.Q0(fragment, 1, 0, 0, false);
                    eVar = p(eVar, sparseArray, i);
                    eVar.d = fragment;
                    eVar.e = z;
                    eVar.f = aVar;
                    if (z2) {
                    }
                } else {
                    boolean z8222 = false;
                    z3 = z8222;
                    z5 = false;
                    z4 = true;
                    e eVar2222222 = sparseArray.get(i);
                    if (z7) {
                    }
                    eVar = eVar2222222;
                    eVar.d = null;
                    jVar = aVar.r;
                    jVar.I0(fragment);
                    jVar.Q0(fragment, 1, 0, 0, false);
                    eVar = p(eVar, sparseArray, i);
                    eVar.d = fragment;
                    eVar.e = z;
                    eVar.f = aVar;
                    if (z2) {
                    }
                }
            }
            if (z2) {
                z6 = fragment.mIsNewlyAdded;
                z7 = z6;
                z5 = true;
                z4 = false;
                z3 = false;
                e eVar22222222 = sparseArray.get(i);
                if (z7) {
                }
                eVar = eVar22222222;
                eVar.d = null;
                jVar = aVar.r;
                jVar.I0(fragment);
                jVar.Q0(fragment, 1, 0, 0, false);
                eVar = p(eVar, sparseArray, i);
                eVar.d = fragment;
                eVar.e = z;
                eVar.f = aVar;
                if (z2) {
                }
            } else {
                if (!fragment.mAdded) {
                }
                z6 = false;
                z7 = z6;
                z5 = true;
                z4 = false;
                z3 = false;
                e eVar222222222 = sparseArray.get(i);
                if (z7) {
                }
                eVar = eVar222222222;
                eVar.d = null;
                jVar = aVar.r;
                jVar.I0(fragment);
                jVar.Q0(fragment, 1, 0, 0, false);
                eVar = p(eVar, sparseArray, i);
                eVar.d = fragment;
                eVar.e = z;
                eVar.f = aVar;
                if (z2) {
                }
            }
        }
    }

    public static void c(a aVar, SparseArray<e> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.a.get(i), sparseArray, false, z);
        }
    }

    private static r0<String, String> d(int i, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        r0<String, String> r0Var = new r0<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            a aVar = arrayList.get(i4);
            if (aVar.p(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.n;
                        arrayList4 = aVar.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar.n;
                        arrayList3 = aVar.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = r0Var.remove(str2);
                        if (remove != null) {
                            r0Var.put(str, remove);
                        } else {
                            r0Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return r0Var;
    }

    public static void e(a aVar, SparseArray<e> sparseArray, boolean z) {
        if (aVar.r.u.d()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z, r0<String, View> r0Var, boolean z2) {
        androidx.core.app.n nVar;
        int i;
        if (z) {
            nVar = fragment2.getEnterTransitionCallback();
        } else {
            nVar = fragment.getEnterTransitionCallback();
        }
        if (nVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (r0Var == null) {
                i = 0;
            } else {
                i = r0Var.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(r0Var.i(i2));
                arrayList.add(r0Var.m(i2));
            }
            if (z2) {
                nVar.c(arrayList2, arrayList, null);
            } else {
                nVar.b(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!qVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static r0<String, View> h(q qVar, r0<String, String> r0Var, Object obj, e eVar) {
        androidx.core.app.n nVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = eVar.a;
        View view = fragment.getView();
        if (r0Var.isEmpty() || obj == null || view == null) {
            r0Var.clear();
            return null;
        }
        r0<String, View> r0Var2 = new r0<>();
        qVar.j(r0Var2, view);
        a aVar = eVar.c;
        if (eVar.b) {
            nVar = fragment.getExitTransitionCallback();
            arrayList = aVar.n;
        } else {
            nVar = fragment.getEnterTransitionCallback();
            arrayList = aVar.o;
        }
        if (arrayList != null) {
            r0Var2.o(arrayList);
            r0Var2.o(r0Var.values());
        }
        if (nVar != null) {
            nVar.a(arrayList, r0Var2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = r0Var2.get(str);
                if (view2 == null) {
                    String q2 = q(r0Var, str);
                    if (q2 != null) {
                        r0Var.remove(q2);
                    }
                } else if (!str.equals(k3.D(view2)) && (q = q(r0Var, str)) != null) {
                    r0Var.put(q, k3.D(view2));
                }
            }
        } else {
            y(r0Var, r0Var2);
        }
        return r0Var2;
    }

    private static r0<String, View> i(q qVar, r0<String, String> r0Var, Object obj, e eVar) {
        androidx.core.app.n nVar;
        ArrayList<String> arrayList;
        if (r0Var.isEmpty() || obj == null) {
            r0Var.clear();
            return null;
        }
        Fragment fragment = eVar.d;
        r0<String, View> r0Var2 = new r0<>();
        qVar.j(r0Var2, fragment.requireView());
        a aVar = eVar.f;
        if (eVar.e) {
            nVar = fragment.getEnterTransitionCallback();
            arrayList = aVar.o;
        } else {
            nVar = fragment.getExitTransitionCallback();
            arrayList = aVar.n;
        }
        r0Var2.o(arrayList);
        if (nVar != null) {
            nVar.a(arrayList, r0Var2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = r0Var2.get(str);
                if (view == null) {
                    r0Var.remove(str);
                } else if (!str.equals(k3.D(view))) {
                    r0Var.put(k3.D(view), r0Var.remove(str));
                }
            }
        } else {
            r0Var.o(r0Var2.keySet());
        }
        return r0Var2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = b;
        if (qVar != null && g(qVar, arrayList)) {
            return b;
        }
        q qVar2 = c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException(C0201.m82(17810));
    }

    public static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            qVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, r0<String, String> r0Var, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        r0<String, String> r0Var2;
        Object obj3;
        Object obj4;
        Rect rect;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.b;
        if (r0Var.isEmpty()) {
            r0Var2 = r0Var;
            obj3 = null;
        } else {
            obj3 = u(qVar, fragment, fragment2, z);
            r0Var2 = r0Var;
        }
        r0<String, View> i = i(qVar, r0Var2, obj3, eVar);
        if (r0Var.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(i.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            qVar.y(obj4, view, arrayList);
            A(qVar, obj4, obj2, i, eVar.e, eVar.f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        h3.a(viewGroup, new d(qVar, r0Var, obj4, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj4;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, r0<String, String> r0Var, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.b;
        if (r0Var.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = u(qVar, fragment, fragment2, z);
        }
        r0<String, View> i = i(qVar, r0Var, obj3, eVar);
        r0<String, View> h = h(qVar, r0Var, obj3, eVar);
        if (r0Var.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj4 = null;
        } else {
            a(arrayList, i, r0Var.keySet());
            a(arrayList2, h, r0Var.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList2.add(view);
            qVar.y(obj4, view, arrayList);
            A(qVar, obj4, obj2, i, eVar.e, eVar.f);
            Rect rect2 = new Rect();
            View t = t(h, eVar, obj, z);
            if (t != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        h3.a(viewGroup, new c(fragment, fragment2, z, h, view2, qVar, rect));
        return obj4;
    }

    private static void n(j jVar, int i, e eVar, View view, r0<String, String> r0Var) {
        Fragment fragment;
        Fragment fragment2;
        q j;
        Object obj;
        ViewGroup viewGroup = jVar.u.d() ? (ViewGroup) jVar.u.c(i) : null;
        if (viewGroup != null && (j = j((fragment2 = eVar.d), (fragment = eVar.a))) != null) {
            boolean z = eVar.b;
            boolean z2 = eVar.e;
            Object r = r(j, fragment, z);
            Object s = s(j, fragment2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object l = l(j, viewGroup, view, r0Var, eVar, arrayList, arrayList2, r, s);
            if (r == null && l == null) {
                obj = s;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s;
            }
            ArrayList<View> k = k(j, obj, fragment2, arrayList, view);
            Object obj2 = (k == null || k.isEmpty()) ? null : obj;
            j.a(r, view);
            Object v = v(j, r, obj2, l, fragment, eVar.b);
            if (v != null) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                j.t(v, r, arrayList3, obj2, k, l, arrayList2);
                z(j, viewGroup, fragment, view, arrayList2, r, arrayList3, obj2, k);
                j.w(viewGroup, arrayList2, r0Var);
                j.c(viewGroup, v);
                j.s(viewGroup, arrayList2, r0Var);
            }
        }
    }

    private static void o(j jVar, int i, e eVar, View view, r0<String, String> r0Var) {
        Fragment fragment;
        Fragment fragment2;
        q j;
        Object obj;
        ViewGroup viewGroup = jVar.u.d() ? (ViewGroup) jVar.u.c(i) : null;
        if (viewGroup != null && (j = j((fragment2 = eVar.d), (fragment = eVar.a))) != null) {
            boolean z = eVar.b;
            boolean z2 = eVar.e;
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            Object r = r(j, fragment, z);
            Object s = s(j, fragment2, z2);
            Object m = m(j, viewGroup, view, r0Var, eVar, arrayList2, arrayList, r, s);
            if (r == null && m == null) {
                obj = s;
                if (obj == null) {
                    return;
                }
            } else {
                obj = s;
            }
            ArrayList<View> k = k(j, obj, fragment2, arrayList2, view);
            ArrayList<View> k2 = k(j, r, fragment, arrayList, view);
            B(k2, 4);
            Object v = v(j, r, obj, m, fragment, z);
            if (v != null) {
                w(j, obj, fragment2, k);
                ArrayList<String> o = j.o(arrayList);
                j.t(v, r, k2, obj, k, m, arrayList);
                j.c(viewGroup, v);
                j.x(viewGroup, arrayList2, arrayList, o, r0Var);
                B(k2, 0);
                j.z(m, arrayList2, arrayList);
            }
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }

    private static String q(r0<String, String> r0Var, String str) {
        int size = r0Var.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(r0Var.m(i))) {
                return r0Var.i(i);
            }
        }
        return null;
    }

    private static Object r(q qVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return qVar.g(obj);
    }

    private static Object s(q qVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return qVar.g(obj);
    }

    public static View t(r0<String, View> r0Var, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a aVar = eVar.c;
        if (obj == null || r0Var == null || (arrayList = aVar.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar.n.get(0);
        } else {
            str = aVar.o.get(0);
        }
        return r0Var.get(str);
    }

    private static Object u(q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return qVar.A(qVar.g(obj));
    }

    private static Object v(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return qVar.n(obj2, obj, obj3);
        }
        return qVar.m(obj2, obj, obj3);
    }

    private static void w(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            qVar.r(obj, fragment.getView(), arrayList);
            h3.a(fragment.mContainer, new a(arrayList));
        }
    }

    private static q x() {
        try {
            return (q) Class.forName(C0201.m82(17811)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void y(r0<String, String> r0Var, r0<String, View> r0Var2) {
        for (int size = r0Var.size() - 1; size >= 0; size--) {
            if (!r0Var2.containsKey(r0Var.m(size))) {
                r0Var.k(size);
            }
        }
    }

    private static void z(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        h3.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
