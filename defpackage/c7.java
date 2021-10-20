package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import defpackage.e6;
import defpackage.h5;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: c7  reason: default package */
/* compiled from: Visibility */
public abstract class c7 extends e6 {
    private static final String[] N = {C0201.m82(4015), C0201.m82(4016)};
    private int M = 3;

    /* access modifiers changed from: package-private */
    /* renamed from: c7$a */
    /* compiled from: Visibility */
    public class a extends f6 {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void b(e6 e6Var) {
            q6.b(this.a).d(this.b);
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            this.c.setTag(z5.save_overlay_view, null);
            q6.b(this.a).d(this.b);
            e6Var.W(this);
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void e(e6 e6Var) {
            if (this.b.getParent() == null) {
                q6.b(this.a).c(this.b);
            } else {
                c7.this.cancel();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c7$b */
    /* compiled from: Visibility */
    public static class b extends AnimatorListenerAdapter implements e6.f, h5.a {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        public boolean f = false;

        public b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        private void f() {
            if (!this.f) {
                v6.i(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.c) != null) {
                this.e = z;
                q6.d(viewGroup, z);
            }
        }

        @Override // defpackage.e6.f
        public void a(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void b(e6 e6Var) {
            g(false);
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            f();
            e6Var.W(this);
        }

        @Override // defpackage.e6.f
        public void d(e6 e6Var) {
        }

        @Override // defpackage.e6.f
        public void e(e6 e6Var) {
            g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // defpackage.h5.a
        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                v6.i(this.a, this.b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        @Override // defpackage.h5.a
        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                v6.i(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c7$c */
    /* compiled from: Visibility */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    private void l0(k6 k6Var) {
        int visibility = k6Var.b.getVisibility();
        k6Var.a.put(C0201.m82(4017), Integer.valueOf(visibility));
        k6Var.a.put(C0201.m82(4018), k6Var.b.getParent());
        int[] iArr = new int[2];
        k6Var.b.getLocationOnScreen(iArr);
        k6Var.a.put(C0201.m82(4019), iArr);
    }

    private c m0(k6 k6Var, k6 k6Var2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        String r2 = C0201.m82(4020);
        String r5 = C0201.m82(4021);
        if (k6Var == null || !k6Var.a.containsKey(r5)) {
            cVar.c = -1;
            cVar.e = null;
        } else {
            cVar.c = ((Integer) k6Var.a.get(r5)).intValue();
            cVar.e = (ViewGroup) k6Var.a.get(r2);
        }
        if (k6Var2 == null || !k6Var2.a.containsKey(r5)) {
            cVar.d = -1;
            cVar.f = null;
        } else {
            cVar.d = ((Integer) k6Var2.a.get(r5)).intValue();
            cVar.f = (ViewGroup) k6Var2.a.get(r2);
        }
        if (k6Var == null || k6Var2 == null) {
            if (k6Var == null && cVar.d == 0) {
                cVar.b = true;
                cVar.a = true;
            } else if (k6Var2 == null && cVar.c == 0) {
                cVar.b = false;
                cVar.a = true;
            }
        } else if (cVar.c == cVar.d && cVar.e == cVar.f) {
            return cVar;
        } else {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i != i2) {
                if (i == 0) {
                    cVar.b = false;
                    cVar.a = true;
                } else if (i2 == 0) {
                    cVar.b = true;
                    cVar.a = true;
                }
            } else if (cVar.f == null) {
                cVar.b = false;
                cVar.a = true;
            } else if (cVar.e == null) {
                cVar.b = true;
                cVar.a = true;
            }
        }
        return cVar;
    }

    @Override // defpackage.e6
    public String[] K() {
        return N;
    }

    @Override // defpackage.e6
    public boolean M(k6 k6Var, k6 k6Var2) {
        if (k6Var == null && k6Var2 == null) {
            return false;
        }
        if (!(k6Var == null || k6Var2 == null)) {
            Map<String, Object> map = k6Var2.a;
            String r2 = C0201.m82(4022);
            if (map.containsKey(r2) != k6Var.a.containsKey(r2)) {
                return false;
            }
        }
        c m0 = m0(k6Var, k6Var2);
        if (!m0.a) {
            return false;
        }
        if (m0.c == 0 || m0.d == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e6
    public void f(k6 k6Var) {
        l0(k6Var);
    }

    @Override // defpackage.e6
    public void j(k6 k6Var) {
        l0(k6Var);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2);

    @Override // defpackage.e6
    public Animator o(ViewGroup viewGroup, k6 k6Var, k6 k6Var2) {
        c m0 = m0(k6Var, k6Var2);
        if (!m0.a) {
            return null;
        }
        if (m0.e == null && m0.f == null) {
            return null;
        }
        if (m0.b) {
            return o0(viewGroup, k6Var, m0.c, k6Var2, m0.d);
        }
        return r0(viewGroup, k6Var, m0.c, k6Var2, m0.d);
    }

    public Animator o0(ViewGroup viewGroup, k6 k6Var, int i, k6 k6Var2, int i2) {
        if ((this.M & 1) != 1 || k6Var2 == null) {
            return null;
        }
        if (k6Var == null) {
            View view = (View) k6Var2.b.getParent();
            if (m0(x(view, false), L(view, false)).a) {
                return null;
            }
        }
        return n0(viewGroup, k6Var2.b, k6Var, k6Var2);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.y != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    public Animator r0(ViewGroup viewGroup, k6 k6Var, int i, k6 k6Var2, int i2) {
        boolean z;
        View view;
        boolean z2;
        View view2;
        if ((this.M & 2) != 2 || k6Var == null) {
            return null;
        }
        View view3 = k6Var.b;
        View view4 = k6Var2 != null ? k6Var2.b : null;
        View view5 = (View) view3.getTag(z5.save_overlay_view);
        if (view5 != null) {
            view = null;
            z = true;
        } else {
            if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view2 = null;
                    z2 = false;
                    if (z2) {
                        if (view3.getParent() != null) {
                            if (view3.getParent() instanceof View) {
                                View view6 = (View) view3.getParent();
                                if (!m0(L(view6, true), x(view6, true)).a) {
                                    view4 = j6.a(viewGroup, view3, view6);
                                } else {
                                    int id = view6.getId();
                                    if (view6.getParent() == null) {
                                        if (id != -1) {
                                            if (viewGroup.findViewById(id) != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        view = view2;
                        z = false;
                        view5 = view3;
                    }
                    z = false;
                    view5 = view4;
                    view = view2;
                }
            } else if (i2 == 4 || view3 == view4) {
                view2 = view4;
                z2 = false;
                view4 = null;
                if (z2) {
                }
                z = false;
                view5 = view4;
                view = view2;
            }
            view4 = null;
            view2 = null;
            z2 = true;
            if (z2) {
            }
            z = false;
            view5 = view4;
            view = view2;
        }
        if (view5 != null) {
            if (!z) {
                int[] iArr = (int[]) k6Var.a.get(C0201.m82(4023));
                int i3 = iArr[0];
                int i4 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view5.offsetLeftAndRight((i3 - iArr2[0]) - view5.getLeft());
                view5.offsetTopAndBottom((i4 - iArr2[1]) - view5.getTop());
                q6.b(viewGroup).c(view5);
            }
            Animator p0 = p0(viewGroup, view5, k6Var, k6Var2);
            if (!z) {
                if (p0 == null) {
                    q6.b(viewGroup).d(view5);
                } else {
                    view3.setTag(z5.save_overlay_view, view5);
                    a(new a(viewGroup, view5, view3));
                }
            }
            return p0;
        } else if (view == null) {
            return null;
        } else {
            int visibility = view.getVisibility();
            v6.i(view, 0);
            Animator p02 = p0(viewGroup, view, k6Var, k6Var2);
            if (p02 != null) {
                b bVar = new b(view, i2, true);
                p02.addListener(bVar);
                h5.a(p02, bVar);
                a(bVar);
            } else {
                v6.i(view, visibility);
            }
            return p02;
        }
    }

    public void v0(int i) {
        if ((i & -4) == 0) {
            this.M = i;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(4024));
    }
}
