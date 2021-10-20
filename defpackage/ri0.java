package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.devsupport.c;
import com.facebook.react.modules.core.b;
import vigqyno.C0201;

/* renamed from: ri0  reason: default package */
/* compiled from: ReactDelegate */
public class ri0 {
    private final Activity a;
    private zi0 b;
    private Bundle c;
    private c d = new c();
    private vi0 e;

    public ri0(Activity activity, vi0 vi0, String str, Bundle bundle) {
        this.a = activity;
        this.c = bundle;
        this.e = vi0;
    }

    private vi0 b() {
        return this.e;
    }

    public zi0 a() {
        throw null;
    }

    public zi0 c() {
        return this.b;
    }

    public void d(String str) {
        if (this.b == null) {
            zi0 a2 = a();
            this.b = a2;
            a2.r(b().j(), str, this.c);
            return;
        }
        throw new IllegalStateException(C0201.m82(15406));
    }

    public void e(int i, int i2, Intent intent, boolean z) {
        if (b().n() && z) {
            b().j().G(this.a, i, i2, intent);
        }
    }

    public boolean f() {
        if (!b().n()) {
            return false;
        }
        b().j().H();
        return true;
    }

    public void g() {
        zi0 zi0 = this.b;
        if (zi0 != null) {
            zi0.t();
            this.b = null;
        }
        if (b().n()) {
            b().j().J(this.a);
        }
    }

    public void h() {
        if (b().n()) {
            b().j().L(this.a);
        }
    }

    public void i() {
        if (!b().n()) {
            return;
        }
        if (this.a instanceof b) {
            si0 j = b().j();
            Activity activity = this.a;
            j.N(activity, (b) activity);
            return;
        }
        throw new ClassCastException(C0201.m82(15407));
    }

    public boolean j(int i, KeyEvent keyEvent) {
        if (!b().n() || !b().m()) {
            return false;
        }
        if (i == 82) {
            b().j().Z();
            return true;
        }
        c cVar = this.d;
        yh0.c(cVar);
        if (!cVar.b(i, this.a.getCurrentFocus())) {
            return false;
        }
        b().j().w().f();
        return true;
    }
}
