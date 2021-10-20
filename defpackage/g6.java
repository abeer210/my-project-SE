package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g6  reason: default package */
/* compiled from: TransitionManager */
public class g6 {
    private static e6 a = new i5();
    private static ThreadLocal<WeakReference<r0<ViewGroup, ArrayList<e6>>>> b = new ThreadLocal<>();
    public static ArrayList<ViewGroup> c = new ArrayList<>();

    /* access modifiers changed from: private */
    /* renamed from: g6$a */
    /* compiled from: TransitionManager */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public e6 a;
        public ViewGroup b;

        /* renamed from: g6$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        class C0137a extends f6 {
            public final /* synthetic */ r0 a;

            public C0137a(r0 r0Var) {
                this.a = r0Var;
            }

            @Override // defpackage.e6.f
            public void c(e6 e6Var) {
                ((ArrayList) this.a.get(a.this.b)).remove(e6Var);
                e6Var.W(this);
            }
        }

        public a(e6 e6Var, ViewGroup viewGroup) {
            this.a = e6Var;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!g6.c.remove(this.b)) {
                return true;
            }
            r0<ViewGroup, ArrayList<e6>> b2 = g6.b();
            ArrayList<e6> arrayList = b2.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b2.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.a);
            this.a.a(new C0137a(b2));
            this.a.l(this.b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e6) it.next()).Y(this.b);
                }
            }
            this.a.V(this.b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            g6.c.remove(this.b);
            ArrayList<e6> arrayList = g6.b().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<e6> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Y(this.b);
                }
            }
            this.a.m(true);
        }
    }

    public static void a(ViewGroup viewGroup, e6 e6Var) {
        if (!c.contains(viewGroup) && k3.O(viewGroup)) {
            c.add(viewGroup);
            if (e6Var == null) {
                e6Var = a;
            }
            e6 n = e6Var.clone();
            d(viewGroup, n);
            b6.c(viewGroup, null);
            c(viewGroup, n);
        }
    }

    public static r0<ViewGroup, ArrayList<e6>> b() {
        r0<ViewGroup, ArrayList<e6>> r0Var;
        WeakReference<r0<ViewGroup, ArrayList<e6>>> weakReference = b.get();
        if (weakReference != null && (r0Var = weakReference.get()) != null) {
            return r0Var;
        }
        r0<ViewGroup, ArrayList<e6>> r0Var2 = new r0<>();
        b.set(new WeakReference<>(r0Var2));
        return r0Var2;
    }

    private static void c(ViewGroup viewGroup, e6 e6Var) {
        if (e6Var != null && viewGroup != null) {
            a aVar = new a(e6Var, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, e6 e6Var) {
        ArrayList<e6> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<e6> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().U(viewGroup);
            }
        }
        if (e6Var != null) {
            e6Var.l(viewGroup, true);
        }
        b6 b2 = b6.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
