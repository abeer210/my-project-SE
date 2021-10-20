package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import defpackage.kj2;

/* renamed from: ll2  reason: default package */
/* compiled from: TitleBarButtonController */
public class ll2 extends nl2<fp2> implements MenuItem.OnMenuItemClickListener {
    private MenuItem q;
    private final jm2 u;
    private wi2 v;
    private final tf2 w;
    private final ep2 x;
    private b y;
    private Drawable z;

    /* access modifiers changed from: package-private */
    /* renamed from: ll2$a */
    /* compiled from: TitleBarButtonController */
    public class a extends lj2 {
        public final /* synthetic */ MenuItem a;

        public a(MenuItem menuItem) {
            this.a = menuItem;
        }

        @Override // defpackage.lj2, defpackage.kj2.b
        public void c(Drawable drawable) {
            ll2.this.z = drawable;
            ll2.this.x0(drawable);
            this.a.setIcon(drawable);
        }
    }

    /* renamed from: ll2$b */
    /* compiled from: TitleBarButtonController */
    public interface b {
        void c(String str);
    }

    public ll2(Activity activity, jm2 jm2, wi2 wi2, tf2 tf2, ep2 ep2, b bVar) {
        super(activity, tf2.b, new pl2(activity), new bf2(), new io2(activity));
        this.u = jm2;
        this.v = wi2;
        this.w = tf2;
        this.x = ep2;
        this.y = bVar;
    }

    private void j0(dp2 dp2, MenuItem menuItem) {
        if (this.w.g.f()) {
            menuItem.setShowAsAction(((Integer) this.w.g.d()).intValue());
        }
        menuItem.setEnabled(this.w.e.j());
        menuItem.setOnMenuItemClickListener(this);
        if (this.w.d()) {
            menuItem.setActionView(B());
            if (this.w.c.f()) {
                ((fp2) B()).setContentDescription((CharSequence) this.w.c.d());
            }
        } else {
            if (this.w.c.f()) {
                y2.c(menuItem, (CharSequence) this.w.c.d());
            }
            if (this.w.e()) {
                w0(new a(menuItem));
            }
        }
        z0(dp2, this.w.n);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q0(ll2 ll2, View view) {
        w30.g(view);
        try {
            ll2.t0(view);
        } finally {
            w30.h();
        }
    }

    private /* synthetic */ void t0(View view) {
        this.y.c(this.w.b);
    }

    private void w0(kj2.b bVar) {
        jm2 jm2 = this.u;
        tf2 tf2 = this.w;
        bVar.getClass();
        jm2.a(tf2, new yk2(bVar));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x0(Drawable drawable) {
        if (!this.w.f.i()) {
            if (this.w.e.j() && this.w.h.f()) {
                this.v.b(drawable, ((Integer) this.w.h.d()).intValue());
            } else if (this.w.e.g()) {
                this.v.b(drawable, ((Integer) this.w.i.e(-3355444)).intValue());
            }
        }
    }

    private void y0(Toolbar toolbar) {
        if (this.w.n.f()) {
            toolbar.post(new qk2(this, toolbar));
        }
    }

    private void z0(Toolbar toolbar, ig2 ig2) {
        if (ig2.f()) {
            xj2.k(toolbar, new ok2(this, ig2, toolbar));
        }
    }

    @Override // defpackage.nl2
    public boolean E() {
        return !this.w.o.b.f() || super.E();
    }

    @Override // defpackage.nl2
    @SuppressLint({"MissingSuperCall"})
    public void O() {
        ((fp2) B()).x(ni2.Button);
    }

    @Override // defpackage.nl2
    @SuppressLint({"MissingSuperCall"})
    public void P() {
        ((fp2) B()).y(ni2.Button);
    }

    @Override // defpackage.nl2
    public void b0(String str) {
        ((fp2) B()).d(str);
    }

    public void i0(dp2 dp2, int i) {
        if (!this.w.o.b() || !dp2.V(this.q, i)) {
            dp2.getMenu().removeItem(this.w.c());
            MenuItem add = dp2.getMenu().add(0, this.w.c(), i, this.v.a());
            this.q = add;
            j0(dp2, add);
        }
    }

    public void k0(Toolbar toolbar) {
        this.u.a(this.w, new nk2(this, toolbar));
    }

    /* renamed from: l0 */
    public fp2 p() {
        fp2 a2 = this.x.a(u(), this.w.o);
        this.j = a2;
        fp2 fp2 = a2;
        fp2.v();
        return fp2;
    }

    public boolean m0(ll2 ll2) {
        if (ll2 == this) {
            return true;
        }
        if (!ll2.x().equals(x())) {
            return false;
        }
        return this.w.b(ll2.w);
    }

    public tf2 n0() {
        return this.w;
    }

    public String o0() {
        return this.w.a;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        w30.p(menuItem);
        try {
            this.y.c(this.w.b);
            return true;
        } finally {
            w30.q();
        }
    }

    public int p0() {
        return this.w.c();
    }

    public /* synthetic */ void r0(Toolbar toolbar, Drawable drawable) {
        x0(drawable);
        toolbar.setNavigationOnClickListener(new pk2(this));
        toolbar.setNavigationIcon(drawable);
        y0(toolbar);
        if (this.w.c.f()) {
            toolbar.setNavigationContentDescription((CharSequence) this.w.c.d());
        }
    }

    public /* synthetic */ void u0(Toolbar toolbar) {
        ImageButton imageButton = (ImageButton) zj2.b(toolbar, ImageButton.class);
        if (imageButton != null) {
            imageButton.setTag(this.w.n.d());
        }
    }

    public /* synthetic */ void v0(ig2 ig2, Toolbar toolbar) {
        T t;
        if (this.w.d() && (t = this.j) != null) {
            ((fp2) t).setTag(ig2.d());
        }
        for (TextView textView : zj2.c((ActionMenuView) zj2.b(toolbar, ActionMenuView.class), TextView.class)) {
            if (this.w.d.f() && ((String) this.w.d.d()).equals(textView.getText().toString())) {
                textView.setTag(ig2.d());
            } else if (this.w.m.f() && ui2.a(textView.getCompoundDrawables(), this.z)) {
                textView.setTag(ig2.d());
            }
        }
    }

    @Override // defpackage.nl2
    public String w() {
        return (String) this.w.o.a.d();
    }
}
