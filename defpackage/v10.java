package defpackage;

import com.dynatrace.android.agent.b;
import com.dynatrace.android.agent.u;
import com.dynatrace.android.agent.y;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import vigqyno.C0201;

/* renamed from: v10  reason: default package */
/* compiled from: RequestExecutor */
public class v10 {
    private static final String g = (u.b + C0201.m82(15268));
    private AtomicInteger a = new AtomicInteger(0);
    private String b;
    private String c;
    private b20 d;
    private n10 e;
    private p20 f;

    public v10(n10 n10, b20 b20, p20 p20) {
        this.d = b20;
        this.e = n10;
        this.f = p20;
        if (b20.c == z10.SAAS) {
            this.c = b20.a();
            return;
        }
        this.b = b.d().d.b();
        this.c = b20.a() + C0201.m82(15269) + this.b;
    }

    private n20 b(n20 n20, boolean z, String str, int i) throws Exception {
        r10 b2 = this.e.b(a(n20, z, i), str);
        if (b2.a()) {
            return d(n20, b2);
        }
        if (b2.a == 404) {
            c();
        }
        throw new t10(C0201.m82(15270) + b2.a, b2);
    }

    private void c() {
        if (this.d.c == z10.APP_MON) {
            String str = this.b;
            String r1 = C0201.m82(15271);
            if (!r1.equals(str)) {
                if (u.c) {
                    s30.r(g, String.format(C0201.m82(15272), this.b, r1));
                }
                this.b = r1;
                b.d().d.j();
                this.a.incrementAndGet();
            }
        }
    }

    private void h(String str) {
        if (str == null || str.length() <= 0 || this.a.get() > 3) {
            str = C0201.m82(15274);
        } else if (u.c) {
            s30.r(g, String.format(C0201.m82(15273), str, Integer.valueOf(this.a.get())));
        }
        if (!str.equals(this.b)) {
            this.b = str;
            this.c = this.d.a() + C0201.m82(15275) + this.b;
            b.d().d.m(this.b);
        }
    }

    public String a(n20 n20, boolean z, int i) {
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(C0201.m82(15276));
        sb.append(C0201.m82(15277));
        String r1 = C0201.m82(15278);
        sb.append(r1);
        sb.append(C0201.m82(15279));
        String r2 = C0201.m82(15280);
        sb.append(r2);
        sb.append(C0201.m82(15281));
        sb.append(r1);
        sb.append(i);
        sb.append(r2);
        sb.append(C0201.m82(15282));
        sb.append(r1);
        sb.append(b.k);
        sb.append(r2);
        sb.append(C0201.m82(15283));
        sb.append(r1);
        sb.append(s30.q(y.a()));
        sb.append(r2);
        sb.append(C0201.m82(15284));
        sb.append(r1);
        sb.append(C0201.m82(15285));
        sb.append(r2);
        sb.append(C0201.m82(15286));
        sb.append(r1);
        sb.append(C0201.m82(15287));
        if (this.d.c == z10.SAAS) {
            sb.append(r2);
            sb.append(C0201.m82(15288));
            sb.append(r1);
            sb.append(C0201.m82(15289));
            sb.append(r2);
            sb.append(C0201.m82(15290));
            sb.append(r1);
            sb.append(n20.E());
        }
        if (z) {
            sb.append(r2);
            sb.append(C0201.m82(15291));
            sb.append(r1);
            sb.append(C0201.m82(15292));
        }
        return sb.toString();
    }

    public n20 d(n20 n20, r10 r10) throws t10 {
        String str;
        if (r10 == null || (str = r10.c) == null) {
            throw new t10(C0201.m82(15299), r10);
        }
        boolean startsWith = str.startsWith(C0201.m82(15293));
        String r1 = C0201.m82(15294);
        if (!startsWith) {
            Map<String, String> l = s30.l(r10.c);
            if (l != null) {
                if (C0201.m82(15297).equals(l.get(C0201.m82(15296)))) {
                    n20 a2 = this.f.a(l, this.d.c);
                    if (this.d.c == z10.APP_MON) {
                        h(l.get(C0201.m82(15298)));
                    }
                    return a2;
                }
            }
            throw new t10(r1, r10);
        } else if (this.d.c != z10.APP_MON) {
            try {
                return this.f.b(n20, r10.c);
            } catch (ClassCastException | JSONException | s10 e2) {
                throw new t10(r1, e2, r10);
            }
        } else {
            throw new t10(C0201.m82(15295), r10);
        }
    }

    public void e() {
        this.a.set(0);
    }

    public n20 f(n20 n20, boolean z, int i) throws Exception {
        return b(n20, z, null, i);
    }

    public n20 g(n20 n20, String str, int i) throws Exception {
        return b(n20, false, str, i);
    }
}
