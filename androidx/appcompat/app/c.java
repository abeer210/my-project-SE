package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.core.app.a;
import androidx.core.app.g;
import androidx.core.app.o;
import androidx.fragment.app.d;
import defpackage.w;

/* compiled from: AppCompatActivity */
public class c extends d implements d, o.a {
    private e q;
    private Resources u;

    private boolean H(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    public e A() {
        if (this.q == null) {
            this.q = e.e(this, this);
        }
        return this.q;
    }

    public a B() {
        return A().k();
    }

    public void C(o oVar) {
        oVar.b(this);
    }

    public void D(int i) {
    }

    public void E(o oVar) {
    }

    @Deprecated
    public void F() {
    }

    public boolean G() {
        Intent g = g();
        if (g == null) {
            return false;
        }
        if (K(g)) {
            o d = o.d(this);
            C(d);
            E(d);
            d.e();
            try {
                a.l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            J(g);
            return true;
        }
    }

    public void I(Toolbar toolbar) {
        A().D(toolbar);
    }

    public void J(Intent intent) {
        g.e(this, intent);
    }

    public boolean K(Intent intent) {
        return g.f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        A().d(context);
    }

    public void closeOptionsMenu() {
        a B = B();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B == null || !B.g()) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.e
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a B = B();
        if (keyCode != 82 || B == null || !B.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.d
    public void e(w wVar) {
    }

    @Override // androidx.appcompat.app.d
    public void f(w wVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) A().g(i);
    }

    @Override // androidx.core.app.o.a
    public Intent g() {
        return g.a(this);
    }

    public MenuInflater getMenuInflater() {
        return A().j();
    }

    public Resources getResources() {
        if (this.u == null && c1.c()) {
            this.u = new c1(this, super.getResources());
        }
        Resources resources = this.u;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.d
    public w h(w.a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        A().m();
    }

    @Override // androidx.fragment.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.u != null) {
            this.u.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        A().p(configuration);
    }

    public void onContentChanged() {
        F();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onCreate(Bundle bundle) {
        w30.i(this);
        e A = A();
        A.l();
        A.q(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onDestroy() {
        w30.k(this);
        super.onDestroy();
        A().r();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (H(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.d
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a B = B();
        if (menuItem.getItemId() != 16908332 || B == null || (B.j() & 4) == 0) {
            return false;
        }
        return G();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.d
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
        A().s(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onPostResume() {
        w30.x(this);
        super.onPostResume();
        A().t();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A().u(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onStart() {
        w30.C(this);
        super.onStart();
        A().v();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e
    public void onStop() {
        w30.D(this);
        super.onStop();
        A().w();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A().F(charSequence);
    }

    public void openOptionsMenu() {
        a B = B();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B == null || !B.q()) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        A().A(i);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        A().E(i);
    }

    @Override // androidx.fragment.app.d
    public void z() {
        A().m();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        A().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A().C(view, layoutParams);
    }
}
