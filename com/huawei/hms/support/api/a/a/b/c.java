package com.huawei.hms.support.api.a.a.b;

import com.huawei.hms.support.api.a.a.b.b;
import com.huawei.hms.support.api.a.c.a;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: TidCacheManager */
public class c<T extends b> {
    private List<T> a = new ArrayList(100);

    public void a(T t) {
        if (t != null) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            String r2 = C0201.m82(3821);
            com.huawei.hms.support.api.a.c.b.b(r2, t.a(), C0201.m82(3820) + this.a.size());
            if (b(t) != null) {
                com.huawei.hms.support.api.a.c.b.b(r2, t.a(), C0201.m82(3822));
                return;
            }
            com.huawei.hms.support.api.a.c.b.b(r2, t.a(), C0201.m82(3823));
            this.a.add(t);
        }
    }

    public List<T> b() {
        return this.a;
    }

    public boolean c(T t) {
        if (t != null && !a.a(this.a)) {
            for (T t2 : this.a) {
                if (t2.equals(t)) {
                    com.huawei.hms.support.api.a.c.b.b(C0201.m82(3827), t.a(), C0201.m82(3828));
                    this.a.remove(t2);
                    return true;
                }
            }
        }
        return false;
    }

    public void d(T t) {
        if (t != null) {
            if (this.a.isEmpty()) {
                this.a.add(t);
                return;
            }
            String r2 = C0201.m82(3830);
            com.huawei.hms.support.api.a.c.b.b(r2, t.a(), C0201.m82(3829) + this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                T t2 = this.a.get(i);
                if (t2 != null && t2.equals(t)) {
                    com.huawei.hms.support.api.a.c.b.b(r2, t.a(), C0201.m82(3831) + t2.a() + C0201.m82(3832) + t.a());
                    this.a.set(i, t);
                    return;
                }
            }
            this.a.add(t);
            com.huawei.hms.support.api.a.c.b.b(r2, t.a(), C0201.m82(3833));
        }
    }

    public T b(T t) {
        if (t != null && !a.a(this.a)) {
            String r3 = C0201.m82(3825);
            com.huawei.hms.support.api.a.c.b.b(r3, t.a(), C0201.m82(3824) + this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                T t2 = this.a.get(i);
                if (t2 != null && t2.equals(t)) {
                    com.huawei.hms.support.api.a.c.b.b(r3, t.a(), C0201.m82(3826) + t2.a());
                    return t2;
                }
            }
        }
        return null;
    }
}
