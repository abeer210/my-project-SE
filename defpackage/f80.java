package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Set;

/* renamed from: f80  reason: default package */
/* compiled from: PipelineDraweeControllerBuilderSupplier */
public class f80 implements c60<e80> {
    private final Context a;
    private final be0 b;
    private final g80 c;
    private final Set<z80> d;
    private final n80 e;

    public f80(Context context, b80 b80) {
        this(context, ee0.k(), b80);
    }

    /* renamed from: a */
    public e80 get() {
        return new e80(this.a, this.c, this.b, this.d).K(this.e);
    }

    public f80(Context context, ee0 ee0, b80 b80) {
        this(context, ee0, null, b80);
    }

    public f80(Context context, ee0 ee0, Set<z80> set, b80 b80) {
        this.a = context;
        this.b = ee0.i();
        if (b80 == null) {
            g80 g80 = new g80();
            this.c = g80;
            Resources resources = context.getResources();
            t80 e2 = t80.e();
            ve0 a2 = ee0.a(context);
            n50 g = n50.g();
            gd0<m40, ye0> i = this.b.i();
            if (b80 != null) {
                b80.a();
                throw null;
            } else if (b80 == null) {
                g80.a(resources, e2, a2, g, i, null, null);
                this.d = set;
                if (b80 == null) {
                    this.e = null;
                } else {
                    b80.c();
                    throw null;
                }
            } else {
                b80.b();
                throw null;
            }
        } else {
            b80.d();
            throw null;
        }
    }
}
