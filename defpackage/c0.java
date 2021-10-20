package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: c0  reason: default package */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class c0 {
    public final ArrayList<p3> a = new ArrayList<>();
    private long b = -1;
    private Interpolator c;
    public q3 d;
    private boolean e;
    private final r3 f = new a();

    /* renamed from: c0$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class a extends r3 {
        private boolean a = false;
        private int b = 0;

        public a() {
        }

        @Override // defpackage.q3
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == c0.this.a.size()) {
                q3 q3Var = c0.this.d;
                if (q3Var != null) {
                    q3Var.b(null);
                }
                d();
            }
        }

        @Override // defpackage.r3, defpackage.q3
        public void c(View view) {
            if (!this.a) {
                this.a = true;
                q3 q3Var = c0.this.d;
                if (q3Var != null) {
                    q3Var.c(null);
                }
            }
        }

        public void d() {
            this.b = 0;
            this.a = false;
            c0.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<p3> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public c0 c(p3 p3Var) {
        if (!this.e) {
            this.a.add(p3Var);
        }
        return this;
    }

    public c0 d(p3 p3Var, p3 p3Var2) {
        this.a.add(p3Var);
        p3Var2.h(p3Var.c());
        this.a.add(p3Var2);
        return this;
    }

    public c0 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public c0 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public c0 g(q3 q3Var) {
        if (!this.e) {
            this.d = q3Var;
        }
        return this;
    }

    public void h() {
        if (!this.e) {
            Iterator<p3> it = this.a.iterator();
            while (it.hasNext()) {
                p3 next = it.next();
                long j = this.b;
                if (j >= 0) {
                    next.d(j);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    next.e(interpolator);
                }
                if (this.d != null) {
                    next.f(this.f);
                }
                next.j();
            }
            this.e = true;
        }
    }
}
