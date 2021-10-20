package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import vigqyno.C0201;

/* renamed from: s2  reason: default package */
/* compiled from: ActionProvider */
public abstract class s2 {
    private b a;

    /* renamed from: s2$a */
    /* compiled from: ActionProvider */
    public interface a {
    }

    /* renamed from: s2$b */
    /* compiled from: ActionProvider */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public s2(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.a = null;
    }

    public void i(a aVar) {
    }

    public void j(b bVar) {
        if (!(this.a == null || bVar == null)) {
            Log.w(C0201.m82(1585), C0201.m82(1583) + getClass().getSimpleName() + C0201.m82(1584));
        }
        this.a = bVar;
    }
}
