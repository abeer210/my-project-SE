package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: w  reason: default package */
/* compiled from: ActionMode */
public abstract class w {
    private Object a;
    private boolean b;

    /* renamed from: w$a */
    /* compiled from: ActionMode */
    public interface a {
        void a(w wVar);

        boolean b(w wVar, Menu menu);

        boolean c(w wVar, Menu menu);

        boolean d(w wVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.a = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.b = z;
    }
}
