package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import vigqyno.C0201;

/* renamed from: tm2  reason: default package */
/* compiled from: ModalStack */
public class tm2 {
    private List<nl2> a = new ArrayList();
    private final sm2 b;
    private oi2 c;

    /* access modifiers changed from: package-private */
    /* renamed from: tm2$a */
    /* compiled from: ModalStack */
    public class a extends bj2 {
        public final /* synthetic */ String b;
        public final /* synthetic */ nl2 c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(aj2 aj2, String str, nl2 nl2) {
            super(aj2);
            this.b = str;
            this.c = nl2;
        }

        @Override // defpackage.aj2, defpackage.bj2
        public void a(String str) {
            tm2.this.c.h(this.b, this.c.w(), 1);
            super.a(this.b);
        }
    }

    /* renamed from: tm2$b */
    /* compiled from: ModalStack */
    class b extends bj2 {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(aj2 aj2, String str, String str2, int i) {
            super(aj2);
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        @Override // defpackage.aj2, defpackage.bj2
        public void a(String str) {
            tm2.this.c.h(this.b, this.c, this.d);
            super.a(str);
        }
    }

    public tm2(Activity activity) {
        this.b = new sm2(new ae2(activity));
    }

    private nl2 f(String str) {
        for (nl2 nl2 : this.a) {
            if (nl2.t(str) != null) {
                return nl2;
            }
        }
        return null;
    }

    private boolean j(nl2 nl2) {
        return !i() && k().equals(nl2);
    }

    public void b() {
        for (nl2 nl2 : this.a) {
            nl2.q();
        }
        this.a.clear();
    }

    public void c(nl2 nl2, bf2 bf2, aj2 aj2) {
        if (this.a.isEmpty()) {
            aj2.a((String) qj2.c(nl2, C0201.m82(10345), rm2.a));
            return;
        }
        String x = k().x();
        String w = k().w();
        int q = q();
        k().M(bf2);
        while (!this.a.isEmpty()) {
            if (this.a.size() == 1) {
                d(this.a.get(0).x(), nl2, new b(aj2, x, w, q));
            } else {
                this.a.get(0).q();
                this.a.remove(0);
            }
        }
    }

    public boolean d(String str, nl2 nl2, aj2 aj2) {
        nl2 f = f(str);
        if (f != null) {
            boolean j = j(f);
            this.a.remove(f);
            nl2 g = i() ? nl2 : j ? g(q() - 1) : null;
            a aVar = new a(aj2, str, f);
            if (!j || g != null) {
                this.b.d(f, g, nl2, aVar);
                return true;
            }
            aj2.onError(C0201.m82(10346));
            return false;
        }
        aj2.onError(C0201.m82(10347));
        return false;
    }

    public nl2 e(String str) {
        for (nl2 nl2 : this.a) {
            nl2 t = nl2.t(str);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public nl2 g(int i) {
        return this.a.get(i);
    }

    public boolean h(aj2 aj2, nl2 nl2) {
        if (i()) {
            return false;
        }
        if (k().C(aj2)) {
            return true;
        }
        return d(k().x(), nl2, aj2);
    }

    public boolean i() {
        return this.a.isEmpty();
    }

    public nl2 k() {
        if (!this.a.isEmpty()) {
            List<nl2> list = this.a;
            return list.get(list.size() - 1);
        }
        throw new EmptyStackException();
    }

    public void l(bf2 bf2) {
        this.b.j(bf2);
    }

    public void m(oi2 oi2) {
        this.c = oi2;
    }

    public void n(CoordinatorLayout coordinatorLayout) {
        this.b.k(coordinatorLayout);
    }

    public void o(ViewGroup viewGroup) {
        this.b.l(viewGroup);
    }

    public void p(nl2 nl2, nl2 nl22, aj2 aj2) {
        if (!i()) {
            nl22 = k();
        }
        this.a.add(nl2);
        this.b.m(nl2, nl22, aj2);
    }

    public int q() {
        return this.a.size();
    }
}
