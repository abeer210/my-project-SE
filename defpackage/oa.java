package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: oa  reason: default package */
/* compiled from: PerformanceTracker */
public class oa {
    private boolean a = false;
    private final Set<a> b = new s0();
    private final Map<String, yf> c = new HashMap();

    /* renamed from: oa$a */
    /* compiled from: PerformanceTracker */
    public interface a {
        void a(float f);
    }

    public void a(String str, float f) {
        if (this.a) {
            yf yfVar = this.c.get(str);
            if (yfVar == null) {
                yfVar = new yf();
                this.c.put(str, yfVar);
            }
            yfVar.a(f);
            if (str.equals(C0201.m82(35182))) {
                for (a aVar : this.b) {
                    aVar.a(f);
                }
            }
        }
    }

    public void b(boolean z) {
        this.a = z;
    }
}
