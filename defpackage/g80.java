package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;

/* renamed from: g80  reason: default package */
/* compiled from: PipelineDraweeControllerFactory */
public class g80 {
    private Resources a;
    private t80 b;
    private ve0 c;
    private Executor d;
    private gd0<m40, ye0> e;
    private v50<ve0> f;
    private c60<Boolean> g;

    public void a(Resources resources, t80 t80, ve0 ve0, Executor executor, gd0<m40, ye0> gd0, v50<ve0> v50, c60<Boolean> c60) {
        this.a = resources;
        this.b = t80;
        this.c = ve0;
        this.d = executor;
        this.e = gd0;
        this.f = v50;
        this.g = c60;
    }

    public d80 b(Resources resources, t80 t80, ve0 ve0, Executor executor, gd0<m40, ye0> gd0, v50<ve0> v50) {
        return new d80(resources, t80, ve0, executor, gd0, v50);
    }

    public d80 c() {
        d80 b2 = b(this.a, this.b, this.c, this.d, this.e, this.f);
        c60<Boolean> c60 = this.g;
        if (c60 != null) {
            b2.j0(c60.get().booleanValue());
        }
        return b2;
    }
}
