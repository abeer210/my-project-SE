package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import defpackage.w;
import java.util.ArrayList;

/* renamed from: a0  reason: default package */
/* compiled from: SupportActionModeWrapper */
public class a0 extends ActionMode {
    public final Context a;
    public final w b;

    /* renamed from: a0$a */
    /* compiled from: SupportActionModeWrapper */
    public static class a implements w.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<a0> c = new ArrayList<>();
        public final x0<Menu, Menu> d = new x0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.b, (x1) menu);
            this.d.put(menu, oVar);
            return oVar;
        }

        @Override // defpackage.w.a
        public void a(w wVar) {
            this.a.onDestroyActionMode(e(wVar));
        }

        @Override // defpackage.w.a
        public boolean b(w wVar, Menu menu) {
            return this.a.onCreateActionMode(e(wVar), f(menu));
        }

        @Override // defpackage.w.a
        public boolean c(w wVar, Menu menu) {
            return this.a.onPrepareActionMode(e(wVar), f(menu));
        }

        @Override // defpackage.w.a
        public boolean d(w wVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(wVar), new j(this.b, (y1) menuItem));
        }

        public ActionMode e(w wVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                a0 a0Var = this.c.get(i);
                if (a0Var != null && a0Var.b == wVar) {
                    return a0Var;
                }
            }
            a0 a0Var2 = new a0(this.b, wVar);
            this.c.add(a0Var2);
            return a0Var2;
        }
    }

    public a0(Context context, w wVar) {
        this.a = context;
        this.b = wVar;
    }

    public void finish() {
        this.b.c();
    }

    public View getCustomView() {
        return this.b.d();
    }

    public Menu getMenu() {
        return new o(this.a, (x1) this.b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public Object getTag() {
        return this.b.h();
    }

    public CharSequence getTitle() {
        return this.b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    public void invalidate() {
        this.b.k();
    }

    public boolean isTitleOptional() {
        return this.b.l();
    }

    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
