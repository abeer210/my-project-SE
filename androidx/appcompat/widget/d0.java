package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* compiled from: DecorToolbar */
public interface d0 {
    void a(Menu menu, m.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(p0 p0Var);

    boolean j();

    void k(int i);

    Menu l();

    void m(int i);

    int n();

    p3 o(int i, long j);

    void p(m.a aVar, g.a aVar2);

    ViewGroup q();

    void r(boolean z);

    int s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();

    void u();

    void v(boolean z);
}
