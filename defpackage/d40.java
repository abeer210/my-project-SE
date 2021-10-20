package defpackage;

import com.dynatrace.android.agent.b0;
import com.dynatrace.android.agent.d;
import com.dynatrace.android.agent.p;
import com.dynatrace.android.agent.q;
import com.dynatrace.android.agent.t;
import com.dynatrace.android.agent.u;
import java.io.IOException;
import java.util.WeakHashMap;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import vigqyno.C0201;

/* renamed from: d40  reason: default package */
/* compiled from: OkInterceptor */
public class d40 implements Interceptor {
    public static final d40 a = new d40();
    public static WeakHashMap<Request, a40> b = new WeakHashMap<>();

    private d40() {
    }

    private b0 c(p pVar) {
        b0 b2;
        if (pVar == null || (b2 = d.b(pVar)) == null) {
            return d.a();
        }
        return b2;
    }

    public a40 a(Request request, e40 e40) {
        p e0;
        b0 c;
        if (request == null) {
            return null;
        }
        if (!x30.a.get()) {
            x30.h(null, d20.a());
        }
        if (!q.e() || !g30.a().c().e(t.WEB_REQUEST)) {
            return null;
        }
        if (request.header(q.h()) != null) {
            if (u.c) {
                s30.r(C0201.m82(36849), String.format(C0201.m82(36850), request.getClass().getName(), e40.c(), Integer.valueOf(e40.i.hashCode())));
            }
            return null;
        }
        if (u.c) {
            s30.r(C0201.m82(36851), String.format(C0201.m82(36852), request.getClass().getName(), e40.c(), Integer.valueOf(e40.i.hashCode())));
        }
        if (!x30.c.m || (c = c((e0 = p.e0()))) == null) {
            return null;
        }
        a40 a40 = new a40(e0, c.e());
        a40.d = e40;
        a40.d(c);
        synchronized (b) {
            b.put(request, a40);
        }
        return a40;
    }

    public Request b(Request request) {
        if (request == null) {
            return null;
        }
        if (b.containsKey(request)) {
            return request;
        }
        Object tag = request.tag();
        while (!request.equals(tag) && (tag instanceof Request)) {
            request = (Request) tag;
            if (b.containsKey(request)) {
                return request;
            }
            tag = request.tag();
        }
        return null;
    }

    public Request d(Request request, a40 a40) {
        Request request2;
        if (a40 == null) {
            return request;
        }
        e40 e40 = (e40) a40.d;
        b0 b0Var = a40.e;
        if (b0Var != null) {
            request2 = request.newBuilder().header(q.h(), b0Var.toString()).build();
            if (u.c) {
                s30.r(C0201.m82(36854), String.format(C0201.m82(36853), e40.c(), Integer.valueOf(e40.i.hashCode()), b0Var));
            }
        } else {
            request2 = null;
        }
        if (request2 != null) {
            return request2;
        }
        a40.d(null);
        return request;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        a40 a40;
        b0 g;
        Request request = chain.request();
        Request b2 = b(request);
        if (b2 == null) {
            a40 = null;
        } else {
            a40 = b.get(b2);
        }
        int i = 0;
        if (a40 == null) {
            if (u.c) {
                String r2 = C0201.m82(36855);
                String r3 = C0201.m82(36856);
                Object[] objArr = new Object[3];
                objArr[0] = request.url().toString();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                objArr[1] = Integer.valueOf(i);
                objArr[2] = Integer.valueOf(request.hashCode());
                s30.r(r2, String.format(r3, objArr));
            }
            return chain.proceed(request);
        }
        String header = request.header(q.h());
        if (header == null) {
            return chain.proceed(d(request, a40));
        }
        if (u.c) {
            String r8 = C0201.m82(36857);
            String r9 = C0201.m82(36858);
            Object[] objArr2 = new Object[2];
            objArr2[0] = header;
            if (b2 != null) {
                i = b2.hashCode();
            }
            objArr2[1] = Integer.valueOf(i);
            s30.r(r8, String.format(r9, objArr2));
        }
        synchronized (b) {
            b.remove(b2);
        }
        p pVar = a40.a;
        if (!(pVar == null || (g = b0.g(header, g30.a())) == null)) {
            pVar.j0(g.b());
        }
        a40.d(null);
        return chain.proceed(request);
    }
}
