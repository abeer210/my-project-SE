package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.dynatrace.android.agent.b;
import com.dynatrace.android.agent.p;
import com.dynatrace.android.agent.u;
import vigqyno.C0201;

/* renamed from: t30  reason: default package */
/* compiled from: LcCallbacks */
public class t30 {
    private static final String b = (u.b + C0201.m82(37888));
    private boolean a = false;

    private void a(Activity activity, e30 e30) {
        if (u.c) {
            s30.r(b, String.format(C0201.m82(37889), activity.getClass().getSimpleName(), e30.toString()));
        }
    }

    public void b(Activity activity) {
        c(activity, null);
    }

    public void c(Activity activity, Bundle bundle) {
        a(activity, e30.onActivityCreate);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().f(activity, e30.onActivityCreate);
            u30.n().c(activity, e30.onActivityCreate);
            v30.b().f(activity, e30.onActivityCreate);
        }
    }

    public void d(Activity activity) {
        a(activity, e30.onActivityDestroy);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().r(activity, e30.onActivityDestroy);
        }
    }

    public void e(Activity activity) {
        a(activity, e30.onActivityPause);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().r(activity, e30.onActivityPause);
            v30.b().f(activity, e30.onActivityPause);
        }
    }

    public void f(Activity activity) {
        g(activity, null);
    }

    public void g(Activity activity, Bundle bundle) {
        a(activity, e30.onActivityPostCreate);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().c(activity, e30.onActivityPostCreate);
        }
    }

    public void h(Activity activity) {
        p e0;
        a(activity, e30.onActivityPostResume);
        b20 b2 = b.d().b();
        if (this.a) {
            if (u.c) {
                s30.v(b, String.format(C0201.m82(37890), b.l));
            }
            if (!(b2 == null || b2.k || (e0 = p.e0()) == null)) {
                e0.Z();
            }
            u30.n().s(activity);
            this.a = false;
        }
        if (b2 == null || b2.k) {
            u30.n().c(activity, e30.onActivityPostResume);
            u30.n().r(activity, e30.onActivityPostResume);
        }
    }

    public void i(Activity activity) {
        a(activity, e30.onActivityRestart);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().c(activity, e30.onActivityRestart);
        }
    }

    public void j(Activity activity) {
        a(activity, e30.onActivityResume);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().f(activity, e30.onActivityResume);
            u30.n().c(activity, e30.onActivityResume);
            v30.b().f(activity, e30.onActivityResume);
        }
    }

    public void k(Activity activity) {
        a(activity, e30.onActivityStart);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().f(activity, e30.onActivityStart);
            u30.n().c(activity, e30.onActivityStart);
            v30.b().f(activity, e30.onActivityStart);
        }
    }

    public void l(Activity activity) {
        a(activity, e30.onActivityStop);
        b20 b2 = b.d().b();
        if (b2 == null || b2.k) {
            u30.n().r(activity, e30.onActivityStop);
            v30.b().f(activity, e30.onActivityStop);
        }
    }

    public void m() {
        if (u.c) {
            s30.v(b, String.format(C0201.m82(37891), b.l));
        }
        u30.n().g();
        this.a = true;
    }
}
