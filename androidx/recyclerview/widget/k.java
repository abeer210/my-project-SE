package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class k extends r2 {
    public final RecyclerView d;
    private final a e;

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends r2 {
        public final k d;
        private Map<View, r2> e = new WeakHashMap();

        public a(k kVar) {
            this.d = kVar;
        }

        @Override // defpackage.r2
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                return r2Var.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // defpackage.r2
        public x3 b(View view) {
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                return r2Var.b(view);
            }
            return super.b(view);
        }

        @Override // defpackage.r2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                r2Var.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                super.g(view, w3Var);
                return;
            }
            this.d.d.getLayoutManager().O0(view, w3Var);
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                r2Var.g(view, w3Var);
            } else {
                super.g(view, w3Var);
            }
        }

        @Override // defpackage.r2
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                r2Var.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // defpackage.r2
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            r2 r2Var = this.e.get(viewGroup);
            if (r2Var != null) {
                return r2Var.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.r2
        public boolean j(View view, int i, Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                if (r2Var.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().i1(view, i, bundle);
        }

        @Override // defpackage.r2
        public void l(View view, int i) {
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                r2Var.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // defpackage.r2
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            r2 r2Var = this.e.get(view);
            if (r2Var != null) {
                r2Var.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public r2 n(View view) {
            return this.e.remove(view);
        }

        public void o(View view) {
            r2 i = k3.i(view);
            if (i != null && i != this) {
                this.e.put(view, i);
            }
        }
    }

    public k(RecyclerView recyclerView) {
        this.d = recyclerView;
        r2 n = n();
        if (n == null || !(n instanceof a)) {
            this.e = new a(this);
        } else {
            this.e = (a) n;
        }
    }

    @Override // defpackage.r2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().K0(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.r2
    public void g(View view, w3 w3Var) {
        super.g(view, w3Var);
        if (!o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().M0(w3Var);
        }
    }

    @Override // defpackage.r2
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().g1(i, bundle);
    }

    public r2 n() {
        return this.e;
    }

    public boolean o() {
        return this.d.hasPendingAdapterUpdates();
    }
}
