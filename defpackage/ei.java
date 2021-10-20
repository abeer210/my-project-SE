package defpackage;

import com.bumptech.glide.load.g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ei  reason: default package */
/* compiled from: Jobs */
public final class ei {
    private final Map<g, xh<?>> a = new HashMap();
    private final Map<g, xh<?>> b = new HashMap();

    private Map<g, xh<?>> b(boolean z) {
        return z ? this.b : this.a;
    }

    public xh<?> a(g gVar, boolean z) {
        return b(z).get(gVar);
    }

    public void c(g gVar, xh<?> xhVar) {
        b(xhVar.p()).put(gVar, xhVar);
    }

    public void d(g gVar, xh<?> xhVar) {
        Map<g, xh<?>> b2 = b(xhVar.p());
        if (xhVar.equals(b2.get(gVar))) {
            b2.remove(gVar);
        }
    }
}
