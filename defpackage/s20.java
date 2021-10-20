package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: s20  reason: default package */
/* compiled from: CookieHandler */
public class s20 {
    private t20 a = new t20();
    private u20 b;
    private z10 c;
    private Set<String> d;
    private Map<String, String> e;

    public s20(Set<String> set, z10 z10) {
        this.d = set;
        this.c = z10;
    }

    public void a(Context context) {
        this.b = new u20(context);
    }

    public synchronized void b(g30 g30, String str) {
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        if (this.c == z10.SAAS) {
            String r1 = C0201.m82(4325);
            hashMap.put(r1, C0201.m82(4326) + this.a.b(g30));
        }
        if (g30.c().b()) {
            Map<String, String> map = this.e;
            String r12 = C0201.m82(4327);
            map.put(r12, C0201.m82(4328) + this.a.a(g30, str));
            if (this.c == z10.APP_MON) {
                Map<String, String> map2 = this.e;
                String r0 = C0201.m82(4329);
                map2.put(r0, C0201.m82(4330) + this.a.c(g30.b, g30.c));
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C0201.m82(4331));
            if (this.c == z10.APP_MON) {
                arrayList.add(C0201.m82(4332));
            }
            this.b.b(this.d, arrayList);
        }
        if (!this.e.isEmpty()) {
            this.b.c(this.d, this.e.values());
        }
    }

    public synchronized void c(g30 g30) {
        if (this.c == z10.SAAS) {
            String str = C0201.m82(4333) + this.a.b(g30);
            this.e.put(C0201.m82(4334), str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.b.c(this.d, arrayList);
        }
    }
}
