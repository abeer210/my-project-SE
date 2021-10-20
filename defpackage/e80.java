package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.ih0;
import defpackage.x80;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: e80  reason: default package */
/* compiled from: PipelineDraweeControllerBuilder */
public class e80 extends x80<e80, ih0, v60<ye0>, bf0> {
    private final be0 s;
    private final g80 t;
    private v50<ve0> u;
    private j80 v;
    private n80 w;

    /* access modifiers changed from: package-private */
    /* renamed from: e80$a */
    /* compiled from: PipelineDraweeControllerBuilder */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[x80.c.values().length];
            a = iArr;
            iArr[x80.c.FULL_FETCH.ordinal()] = 1;
            a[x80.c.DISK_CACHE.ordinal()] = 2;
            try {
                a[x80.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public e80(Context context, g80 g80, be0 be0, Set<z80> set) {
        super(context, set);
        this.s = be0;
        this.t = g80;
    }

    public static ih0.b F(x80.c cVar) {
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            return ih0.b.FULL_FETCH;
        }
        if (i == 2) {
            return ih0.b.DISK_CACHE;
        }
        if (i == 3) {
            return ih0.b.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException(C0201.m82(34827) + cVar + C0201.m82(34828));
    }

    private m40 G() {
        ih0 ih0 = (ih0) n();
        wc0 j = this.s.j();
        if (j == null || ih0 == null) {
            return null;
        }
        if (ih0.g() != null) {
            return j.c(ih0, g());
        }
        return j.a(ih0, g());
    }

    /* renamed from: H */
    public n70<v60<ye0>> j(ia0 ia0, String str, ih0 ih0, Object obj, x80.c cVar) {
        return this.s.f(ih0, obj, F(cVar), I(ia0));
    }

    public gf0 I(ia0 ia0) {
        if (ia0 instanceof d80) {
            return ((d80) ia0).Y();
        }
        return null;
    }

    /* renamed from: J */
    public d80 v() {
        d80 d80;
        if (oh0.d()) {
            oh0.a(C0201.m82(34829));
        }
        try {
            ia0 o = o();
            String f = x80.f();
            if (o instanceof d80) {
                d80 = (d80) o;
            } else {
                d80 = this.t.c();
            }
            d80.a0(w(d80, f), f, G(), g(), this.u, this.v);
            d80.b0(this.w);
            return d80;
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public e80 K(n80 n80) {
        this.w = n80;
        q();
        return this;
    }

    /* renamed from: L */
    public e80 b(Uri uri) {
        if (uri == null) {
            super.B(null);
            return this;
        }
        jh0 r = jh0.r(uri);
        r.D(sd0.b());
        super.B(r.a());
        return this;
    }
}
