package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.w;
import java.lang.ref.WeakReference;

/* renamed from: z  reason: default package */
/* compiled from: StandaloneActionMode */
public class z extends w implements g.a {
    private Context c;
    private ActionBarContextView d;
    private w.a e;
    private WeakReference<View> f;
    private boolean g;
    private g h;

    public z(Context context, ActionBarContextView actionBarContextView, w.a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.S(1);
        this.h = gVar;
        gVar.R(this);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(g gVar, MenuItem menuItem) {
        return this.e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(g gVar) {
        k();
        this.d.l();
    }

    @Override // defpackage.w
    public void c() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    @Override // defpackage.w
    public View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.w
    public Menu e() {
        return this.h;
    }

    @Override // defpackage.w
    public MenuInflater f() {
        return new b0(this.d.getContext());
    }

    @Override // defpackage.w
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.w
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // defpackage.w
    public void k() {
        this.e.c(this, this.h);
    }

    @Override // defpackage.w
    public boolean l() {
        return this.d.j();
    }

    @Override // defpackage.w
    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.w
    public void n(int i) {
        o(this.c.getString(i));
    }

    @Override // defpackage.w
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.w
    public void q(int i) {
        r(this.c.getString(i));
    }

    @Override // defpackage.w
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.w
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
