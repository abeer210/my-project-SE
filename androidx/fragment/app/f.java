package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.g;
import androidx.lifecycle.s;
import vigqyno.C0201;

/* compiled from: FragmentController */
public class f {
    private final h<?> a;

    private f(h<?> hVar) {
        this.a = hVar;
    }

    public static f b(h<?> hVar) {
        g.d(hVar, C0201.m82(18353));
        return new f(hVar);
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.a;
        hVar.e.p(hVar, hVar, fragment);
    }

    public void c() {
        this.a.e.y();
    }

    public void d(Configuration configuration) {
        this.a.e.z(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.e.A(menuItem);
    }

    public void f() {
        this.a.e.B();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.e.C(menu, menuInflater);
    }

    public void h() {
        this.a.e.D();
    }

    public void i() {
        this.a.e.F();
    }

    public void j(boolean z) {
        this.a.e.G(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.e.V(menuItem);
    }

    public void l(Menu menu) {
        this.a.e.W(menu);
    }

    public void m() {
        this.a.e.Y();
    }

    public void n(boolean z) {
        this.a.e.Z(z);
    }

    public boolean o(Menu menu) {
        return this.a.e.a0(menu);
    }

    public void p() {
        this.a.e.c0();
    }

    public void q() {
        this.a.e.d0();
    }

    public void r() {
        this.a.e.f0();
    }

    public boolean s() {
        return this.a.e.l0();
    }

    public Fragment t(String str) {
        return this.a.e.q0(str);
    }

    public i u() {
        return this.a.e;
    }

    public void v() {
        this.a.e.R0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.e.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.a;
        if (hVar instanceof s) {
            hVar.e.b1(parcelable);
            return;
        }
        throw new IllegalStateException(C0201.m82(18354));
    }

    public Parcelable y() {
        return this.a.e.d1();
    }
}
