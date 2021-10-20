package defpackage;

import android.app.Activity;
import android.app.Application;
import android.view.MenuItem;
import android.view.View;
import com.dynatrace.android.agent.u;
import defpackage.x30;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import vigqyno.C0201;

/* renamed from: w30  reason: default package */
/* compiled from: Callback */
public final class w30 {
    public static void A(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().i(activity);
        }
    }

    public static void B(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().j(activity);
        }
    }

    public static void C(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().k(activity);
        }
    }

    public static void D(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().l(activity);
        }
    }

    public static void E(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            x30.c((HttpURLConnection) uRLConnection, true);
        }
    }

    private static void F(b40 b40) {
        try {
            x30.p(b40);
        } catch (Exception e) {
            if (u.c) {
                s30.s(C0201.m82(12242), b40.toString(), e);
            }
        }
    }

    public static InputStream a(HttpURLConnection httpURLConnection) throws Exception {
        b40 b40 = new b40(httpURLConnection, y30.getInputStream, z30.PRE_EXEC, 0);
        try {
            F(b40);
            InputStream inputStream = httpURLConnection.getInputStream();
            d(httpURLConnection, b40);
            b40.c = z30.POST_EXEC_OK;
            F(b40);
            d(httpURLConnection, b40);
            b40.c = z30.POST_EXEC_ERR;
            F(b40);
            return inputStream;
        } catch (Exception e) {
            b40.e = e.toString();
            throw e;
        } catch (Throwable th) {
            d(httpURLConnection, b40);
            b40.c = z30.POST_EXEC_ERR;
            F(b40);
            throw th;
        }
    }

    public static InputStream b(URLConnection uRLConnection) throws Exception {
        if (uRLConnection instanceof HttpURLConnection) {
            return a((HttpURLConnection) uRLConnection);
        }
        return uRLConnection.getInputStream();
    }

    public static OutputStream c(HttpURLConnection httpURLConnection) throws Exception {
        b40 b40 = new b40(httpURLConnection, y30.getOutputStream, z30.PRE_EXEC, 0);
        try {
            F(b40);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            b40.c = z30.POST_EXEC_OK;
            F(b40);
            b40.c = z30.POST_EXEC_ERR;
            F(b40);
            return outputStream;
        } catch (Exception e) {
            b40.e = e.toString();
            throw e;
        } catch (Throwable th) {
            b40.c = z30.POST_EXEC_ERR;
            F(b40);
            throw th;
        }
    }

    private static int d(HttpURLConnection httpURLConnection, b40 b40) {
        int i;
        Exception e;
        try {
            i = httpURLConnection.getResponseCode();
            try {
                b40.e = httpURLConnection.getResponseMessage();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            i = -1;
            if (b40.e == null) {
                b40.e = e.getMessage();
            }
            b40.d = i;
            return i;
        }
        b40.d = i;
        return i;
    }

    public static int e(HttpURLConnection httpURLConnection) throws Exception {
        b40 b40 = new b40(httpURLConnection, y30.getResponseCode, z30.PRE_EXEC, 0);
        int i = -1;
        try {
            F(b40);
            i = httpURLConnection.getResponseCode();
            d(httpURLConnection, b40);
            b40.c = z30.POST_EXEC_OK;
            F(b40);
            b40.d = i;
            b40.c = z30.POST_EXEC_ERR;
            F(b40);
            return i;
        } catch (Exception e) {
            b40.e = e.toString();
            throw e;
        } catch (Throwable th) {
            b40.d = i;
            b40.c = z30.POST_EXEC_ERR;
            F(b40);
            throw th;
        }
    }

    public static void f(HttpURLConnection httpURLConnection) {
        x30.c(httpURLConnection, false);
    }

    public static void g(View view) {
        x30.k(x30.c.Clicked, view);
    }

    public static void h() {
        x30.m(x30.c.Clicked);
    }

    public static void i(Activity activity) {
        if (!x30.a.get() && activity != null) {
            if (u.c) {
                s30.r(C0201.m82(12243), C0201.m82(12244));
            }
            x30.h(activity.getApplicationContext(), d20.a());
        }
        if (u30.n().q()) {
            u30.n().i().b(activity);
        }
    }

    public static void j(Application application) {
        if (!x30.a.get() && application != null) {
            if (u.c) {
                s30.r(C0201.m82(12245), C0201.m82(12246));
            }
            x30.h(application.getApplicationContext(), d20.a());
        }
    }

    public static void k(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().d(activity);
        }
    }

    public static void l(View view, int i) {
        x30.k(x30.c.ItemClicked, view);
    }

    public static void m() {
        x30.m(x30.c.ItemClicked);
    }

    public static void n(View view, int i) {
        x30.k(x30.c.ItemSelected, view);
    }

    public static void o() {
        x30.m(x30.c.ItemSelected);
    }

    public static void p(MenuItem menuItem) {
        x30.j(x30.c.MenuItemClick, menuItem);
    }

    public static void q() {
        x30.m(x30.c.MenuItemClick);
    }

    public static void r(MenuItem menuItem) {
        x30.j(x30.c.OptionsItemSelected, menuItem);
    }

    public static void s() {
        x30.m(x30.c.OptionsItemSelected);
    }

    public static void t(int i) {
        x30.i(x30.c.PageSelected);
    }

    public static void u() {
        x30.m(x30.c.PageSelected);
    }

    public static void v(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().e(activity);
        }
    }

    public static void w(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().f(activity);
        }
    }

    public static void x(Activity activity) {
        if (u30.n().q()) {
            u30.n().i().h(activity);
        }
    }

    public static void y() {
        x30.c cVar = x30.c.SwipeToRefresh;
        x30.l(cVar, cVar.toString());
    }

    public static void z() {
        x30.m(x30.c.SwipeToRefresh);
    }
}
