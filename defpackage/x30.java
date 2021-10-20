package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.dynatrace.android.agent.b0;
import com.dynatrace.android.agent.d;
import com.dynatrace.android.agent.p;
import com.dynatrace.android.agent.q;
import com.dynatrace.android.agent.t;
import com.dynatrace.android.agent.u;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* renamed from: x30  reason: default package */
/* compiled from: CallbackCore */
public final class x30 {
    public static AtomicBoolean a = new AtomicBoolean(false);
    public static Context b = null;
    public static b20 c = e20.a();
    public static boolean d = false;
    private static WeakHashMap<HttpURLConnection, a40> e = new WeakHashMap<>();
    private static volatile p f = null;
    private static volatile c g = null;

    /* renamed from: x30$b */
    /* compiled from: CallbackCore */
    private static class b extends Thread {
        private static HashSet<Integer> b = new HashSet<>();
        private HttpURLConnection a;

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private a40 b() {
            WeakHashMap weakHashMap;
            a40 a40 = null;
            try {
                a40 a402 = (a40) x30.e.get(this.a);
                if (a402 != null) {
                    return a402;
                }
                String a2 = b0.a(this.a);
                if (a2 != null) {
                    synchronized (x30.e) {
                        weakHashMap = new WeakHashMap(x30.e);
                    }
                    for (Map.Entry entry : weakHashMap.entrySet()) {
                        if (((a40) entry.getValue()).e.h(a2)) {
                            if (u.c) {
                                String r2 = C0201.m82(30885);
                                s30.r(r2, C0201.m82(30886) + a2);
                            }
                            x30.e.remove(entry.getKey());
                            x30.e.put(this.a, entry.getValue());
                            return (a40) entry.getValue();
                        }
                    }
                    return null;
                }
                if (b.contains(Integer.valueOf(this.a.hashCode()))) {
                    return null;
                }
                b.add(Integer.valueOf(this.a.hashCode()));
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i > 3) {
                        break;
                    }
                    try {
                        a40 = x30.n(this.a);
                        break;
                    } catch (Exception unused) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException unused2) {
                        }
                        i = i2;
                    }
                }
                b.remove(Integer.valueOf(this.a.hashCode()));
                return a40;
            } catch (Exception e) {
                if (u.c) {
                    s30.s(C0201.m82(30887), C0201.m82(30888), e);
                }
            }
        }

        public void run() {
            b();
        }

        private b(HttpURLConnection httpURLConnection) {
            this.a = httpURLConnection;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x30$c */
    /* compiled from: CallbackCore */
    public enum c {
        Clicked,
        ItemClicked,
        ItemSelected,
        MenuItemClick,
        OptionsItemSelected,
        PageSelected,
        SwipeToRefresh
    }

    public static a40 c(HttpURLConnection httpURLConnection, boolean z) {
        if (httpURLConnection != null && q.e() && g30.a().c().e(t.WEB_REQUEST)) {
            b bVar = new b(httpURLConnection);
            if (z) {
                return bVar.b();
            }
            try {
                httpURLConnection.getURL().toString();
                return bVar.b();
            } catch (Exception unused) {
                bVar.start();
            }
        }
        return null;
    }

    public static String d() {
        String property = System.getProperty(C0201.m82(4981));
        if (property != null) {
            return property;
        }
        return C0201.m82(4982) + System.getProperty(C0201.m82(4983));
    }

    private static b0 e(p pVar, HttpURLConnection httpURLConnection) {
        b0 c2;
        if (pVar == null || (c2 = d.c(pVar, httpURLConnection)) == null) {
            return o(httpURLConnection);
        }
        return c2;
    }

    private static String f(MenuItem menuItem) {
        CharSequence title = menuItem.getTitle();
        String r1 = C0201.m82(4984);
        if (title == null || title.length() <= 0) {
            return r1 + menuItem.getClass().getSimpleName();
        }
        return r1 + title.toString();
    }

    private static String g(View view) {
        CharSequence text;
        CharSequence contentDescription = view.getContentDescription();
        String r1 = C0201.m82(4985);
        if (contentDescription != null && contentDescription.length() > 0) {
            return r1 + contentDescription.toString();
        } else if (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null || text.length() <= 0) {
            return r1 + view.getClass().getSimpleName();
        } else {
            return r1 + text.toString();
        }
    }

    public static void h(Context context, b20 b20) {
        if (context != null && !a.getAndSet(true)) {
            if (com.dynatrace.android.agent.b.d().b() != null) {
                b20 = com.dynatrace.android.agent.b.d().b();
            } else if (b20 == null) {
                return;
            }
            if (b20.q) {
                u.c = true;
            }
            c = b20;
            if (!b20.s && u.c) {
                s30.r(C0201.m82(4987), C0201.m82(4986) + c.toString());
            }
            if (s30.f(context)) {
                b = context;
                b20 b202 = c;
                if (b202.s) {
                    q.y(context, b202);
                }
                if (com.dynatrace.android.agent.b.d().c() == null) {
                    com.dynatrace.android.agent.b.d().h(c, b);
                }
                b20 b203 = c;
                if (b203.j || b203.k) {
                    new u30(context, true);
                    if (c.j) {
                        u30.n().i().m();
                    }
                }
            }
        }
    }

    public static void i(c cVar) {
        l(cVar, C0201.m82(4988) + cVar.toString());
    }

    public static void j(c cVar, MenuItem menuItem) {
        if (menuItem == null) {
            i(cVar);
        } else {
            l(cVar, f(menuItem));
        }
    }

    public static void k(c cVar, View view) {
        if (view == null) {
            i(cVar);
        } else {
            l(cVar, g(view));
        }
    }

    public static void l(c cVar, String str) {
        String a2;
        boolean z = u.c;
        String r2 = C0201.m82(4989);
        if (z) {
            s30.r(r2, String.format(C0201.m82(4990), cVar, str));
        }
        if (!(f == null || g == cVar)) {
            f.m0(0);
            f = null;
            g = null;
        }
        if (f == null) {
            f = p.c0(str, g30.b(false, true), com.dynatrace.android.agent.b.d().c);
            g = cVar;
        }
        if (u.c && (a2 = v30.b().a()) != null) {
            s30.r(r2, String.format(C0201.m82(4991), cVar, a2));
        }
        if (u.c) {
            s30.r(r2, String.format(C0201.m82(4992), cVar));
        }
    }

    public static void m(c cVar) {
        if (u.c) {
            s30.r(C0201.m82(4995), C0201.m82(4993) + cVar + C0201.m82(4994));
        }
        if (f != null && g == cVar) {
            f.l0();
            f = null;
            g = null;
        }
    }

    /* access modifiers changed from: private */
    public static a40 n(HttpURLConnection httpURLConnection) {
        p e0;
        b0 e2;
        if (u.c) {
            s30.r(C0201.m82(4996), String.format(C0201.m82(4997), httpURLConnection.getClass().getSimpleName(), httpURLConnection.getURL().toString()));
        }
        if (!a.get()) {
            h(null, d20.a());
        }
        if (!c.m || (e2 = e((e0 = p.e0()), httpURLConnection)) == null) {
            return null;
        }
        a40 a40 = new a40(e0, e2.e());
        synchronized (e) {
            e.put(httpURLConnection, a40);
        }
        a40.d(e2);
        return a40;
    }

    private static b0 o(HttpURLConnection httpURLConnection) {
        b0 a2 = d.a();
        if (a2 == null) {
            return a2;
        }
        try {
            httpURLConnection.setRequestProperty(q.h(), a2.toString());
        } catch (Exception e2) {
            if (u.c) {
                s30.t(C0201.m82(4998), e2.toString());
            }
        }
        return a2;
    }

    public static void p(b40 b40) {
        HttpURLConnection httpURLConnection = b40.i;
        if (httpURLConnection != null && c.m) {
            if (u.c) {
                s30.r(C0201.m82(4999), String.format(C0201.m82(5000), b40.c, b40.b, httpURLConnection.getClass().getSimpleName(), b40.c()));
            }
            a40 a40 = e.get(b40.i);
            if (a40 != null) {
                if (z30.PRE_EXEC == b40.c) {
                    a40.a(b0.a(b40.i));
                }
                a40.b(b40);
                if (a40.c) {
                    synchronized (e) {
                        e.remove(b40.i);
                    }
                    a40.c(b40);
                }
            }
        }
    }
}
