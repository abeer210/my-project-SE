package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.i4;
import defpackage.w3;
import defpackage.z3;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public i4 a;
    public c b;
    private boolean c;
    private float d = 0.0f;
    private boolean e;
    public int f = 2;
    public float g = 0.5f;
    public float h = 0.0f;
    public float i = 0.5f;
    private final i4.c j = new a();

    class a extends i4.c {
        private int a;
        private int b = -1;

        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        private boolean n(View view, float f) {
            if (f != 0.0f) {
                boolean z = k3.w(view) == 1;
                int i = SwipeDismissBehavior.this.f;
                if (i == 2) {
                    return true;
                }
                if (i == 0) {
                    if (z) {
                        if (f < 0.0f) {
                            return true;
                        }
                        return false;
                    } else if (f <= 0.0f) {
                        return false;
                    }
                    return true;
                } else if (i != 1) {
                    return false;
                } else {
                    if (z) {
                        if (f > 0.0f) {
                            return true;
                        }
                        return false;
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g)) {
                    return true;
                }
                return false;
            }
        }

        @Override // defpackage.i4.c
        public int a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = k3.w(view) == 1;
            int i5 = SwipeDismissBehavior.this.f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.a - view.getWidth();
                    i4 = view.getWidth() + this.a;
                } else if (z) {
                    i3 = this.a;
                    width = view.getWidth();
                } else {
                    i3 = this.a - view.getWidth();
                    i4 = this.a;
                }
                return SwipeDismissBehavior.G(i3, i, i4);
            } else if (z) {
                i3 = this.a - view.getWidth();
                i4 = this.a;
                return SwipeDismissBehavior.G(i3, i, i4);
            } else {
                i3 = this.a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.G(i3, i, i4);
        }

        @Override // defpackage.i4.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.i4.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // defpackage.i4.c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // defpackage.i4.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // defpackage.i4.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.h);
            float width2 = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f), 1.0f));
            }
        }

        @Override // defpackage.i4.c
        public void l(View view, float f, float f2) {
            boolean z;
            int i;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.M(i, view.getTop())) {
                k3.a0(view, new d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.b) != null) {
                cVar.a(view);
            }
        }

        @Override // defpackage.i4.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.E(view);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements z3 {
        public b() {
        }

        @Override // defpackage.z3
        public boolean a(View view, z3.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z2 = k3.w(view) == 1;
            if ((SwipeDismissBehavior.this.f == 0 && z2) || (SwipeDismissBehavior.this.f == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            k3.T(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i);
    }

    private class d implements Runnable {
        private final View a;
        private final boolean b;

        public d(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        public void run() {
            c cVar;
            i4 i4Var = SwipeDismissBehavior.this.a;
            if (i4Var != null && i4Var.m(true)) {
                k3.a0(this.a, this);
            } else if (this.b && (cVar = SwipeDismissBehavior.this.b) != null) {
                cVar.a(this.a);
            }
        }
    }

    public static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    public static int G(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void H(ViewGroup viewGroup) {
        i4 i4Var;
        if (this.a == null) {
            if (this.e) {
                i4Var = i4.n(viewGroup, this.d, this.j);
            } else {
                i4Var = i4.o(viewGroup, this.j);
            }
            this.a = i4Var;
        }
    }

    public static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    private void M(View view) {
        k3.c0(view, 1048576);
        if (E(view)) {
            k3.e0(view, w3.a.m, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        i4 i4Var = this.a;
        if (i4Var == null) {
            return false;
        }
        i4Var.E(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f2) {
        this.i = F(0.0f, f2, 1.0f);
    }

    public void K(float f2) {
        this.h = F(0.0f, f2, 1.0f);
    }

    public void L(int i2) {
        this.f = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.G(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        H(coordinatorLayout);
        return this.a.N(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean l = super.l(coordinatorLayout, v, i2);
        if (k3.u(v) == 0) {
            k3.q0(v, 1);
            M(v);
        }
        return l;
    }
}
