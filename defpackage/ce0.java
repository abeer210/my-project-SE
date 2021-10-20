package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.e0;
import com.facebook.imagepipeline.memory.f0;
import defpackage.de0;
import defpackage.j70;
import defpackage.yc0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: ce0  reason: default package */
/* compiled from: ImagePipelineConfig */
public class ce0 {
    private static c D = new c(null);
    private final boolean A;
    private final d50 B;
    private final me0 C;
    private final Bitmap.Config a;
    private final c60<hd0> b;
    private final yc0.c c;
    private final wc0 d;
    private final Context e;
    private final boolean f;
    private final ae0 g;
    private final c60<hd0> h;
    private final zd0 i;
    private final ed0 j;
    private final qe0 k;
    private final sh0 l;
    private final Integer m;
    private final c60<Boolean> n;
    private final v40 o;
    private final m60 p;
    private final int q;
    private final ng0 r;
    private final int s;
    private final f0 t;
    private final se0 u;
    private final Set<gf0> v;
    private final boolean w;
    private final v40 x;
    private final re0 y;
    private final de0 z;

    /* renamed from: ce0$a */
    /* compiled from: ImagePipelineConfig */
    class a implements c60<Boolean> {
        public a(ce0 ce0) {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: ce0$b */
    /* compiled from: ImagePipelineConfig */
    public static class b {
        private final de0.b A;
        private boolean B;
        private d50 C;
        private me0 D;
        private Bitmap.Config a;
        private c60<hd0> b;
        private yc0.c c;
        private wc0 d;
        private final Context e;
        private boolean f;
        private c60<hd0> g;
        private zd0 h;
        private ed0 i;
        private qe0 j;
        private sh0 k;
        private Integer l;
        private c60<Boolean> m;
        private v40 n;
        private m60 o;
        private Integer p;
        private ng0 q;
        private oc0 r;
        private f0 s;
        private se0 t;
        private Set<gf0> u;
        private boolean v;
        private v40 w;
        private ae0 x;
        private re0 y;
        private int z;

        public /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public ce0 E() {
            return new ce0(this, null);
        }

        public b F(boolean z2) {
            this.f = z2;
            return this;
        }

        public b G(ng0 ng0) {
            this.q = ng0;
            return this;
        }

        public b H(Set<gf0> set) {
            this.u = set;
            return this;
        }

        private b(Context context) {
            this.f = false;
            this.l = null;
            this.p = null;
            this.v = true;
            this.z = -1;
            this.A = new de0.b(this);
            this.B = true;
            this.D = new ne0();
            z50.g(context);
            this.e = context;
        }
    }

    /* renamed from: ce0$c */
    /* compiled from: ImagePipelineConfig */
    public static class c {
        private boolean a;

        public /* synthetic */ c(a aVar) {
            this();
        }

        public boolean a() {
            return this.a;
        }

        private c() {
            this.a = false;
        }
    }

    public /* synthetic */ ce0(b bVar, a aVar) {
        this(bVar);
    }

    public static b G(Context context) {
        return new b(context, null);
    }

    private static void H(j70 j70, de0 de0, i70 i70) {
        k70.b = j70;
        j70.a i2 = de0.i();
        if (i2 != null) {
            j70.b(i2);
        }
        if (i70 != null) {
            j70.a(i70);
        }
    }

    public static c h() {
        return D;
    }

    private static v40 i(Context context) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(34845));
            }
            return v40.m(context).m();
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    private static sh0 r(b bVar) {
        if (bVar.k != null && bVar.l != null) {
            throw new IllegalStateException(C0201.m82(34846));
        } else if (bVar.k != null) {
            return bVar.k;
        } else {
            return null;
        }
    }

    private static int w(b bVar, de0 de0) {
        if (bVar.p != null) {
            return bVar.p.intValue();
        }
        return de0.m() ? 1 : 0;
    }

    public se0 A() {
        return this.u;
    }

    public Set<gf0> B() {
        return Collections.unmodifiableSet(this.v);
    }

    public v40 C() {
        return this.x;
    }

    public boolean D() {
        return this.A;
    }

    public boolean E() {
        return this.f;
    }

    public boolean F() {
        return this.w;
    }

    public Bitmap.Config a() {
        return this.a;
    }

    public c60<hd0> b() {
        return this.b;
    }

    public yc0.c c() {
        return this.c;
    }

    public wc0 d() {
        return this.d;
    }

    public d50 e() {
        return this.B;
    }

    public me0 f() {
        return this.C;
    }

    public Context g() {
        return this.e;
    }

    public c60<hd0> j() {
        return this.h;
    }

    public zd0 k() {
        return this.i;
    }

    public de0 l() {
        return this.z;
    }

    public ae0 m() {
        return this.g;
    }

    public ed0 n() {
        return this.j;
    }

    public qe0 o() {
        return this.k;
    }

    public re0 p() {
        return this.y;
    }

    public sh0 q() {
        return this.l;
    }

    public Integer s() {
        return this.m;
    }

    public c60<Boolean> t() {
        return this.n;
    }

    public v40 u() {
        return this.o;
    }

    public int v() {
        return this.q;
    }

    public m60 x() {
        return this.p;
    }

    public ng0 y() {
        return this.r;
    }

    public f0 z() {
        return this.t;
    }

    private ce0(b bVar) {
        c60<hd0> c60;
        yc0.c cVar;
        wc0 wc0;
        ae0 ae0;
        c60<hd0> c602;
        ed0 ed0;
        c60<Boolean> c603;
        v40 v40;
        m60 m60;
        int i2;
        ng0 ng0;
        f0 f0Var;
        se0 se0;
        Set<gf0> set;
        v40 v402;
        zd0 zd0;
        j70 i3;
        if (oh0.d()) {
            oh0.a(C0201.m82(34842));
        }
        this.z = bVar.A.m();
        if (bVar.b == null) {
            c60 = new zc0((ActivityManager) bVar.e.getSystemService(C0201.m82(34843)));
        } else {
            c60 = bVar.b;
        }
        this.b = c60;
        if (bVar.c == null) {
            cVar = new uc0();
        } else {
            cVar = bVar.c;
        }
        this.c = cVar;
        this.a = bVar.a == null ? Bitmap.Config.ARGB_8888 : bVar.a;
        if (bVar.d == null) {
            wc0 = ad0.f();
        } else {
            wc0 = bVar.d;
        }
        this.d = wc0;
        Context context = bVar.e;
        z50.g(context);
        this.e = context;
        if (bVar.x == null) {
            ae0 = new wd0(new yd0());
        } else {
            ae0 = bVar.x;
        }
        this.g = ae0;
        this.f = bVar.f;
        if (bVar.g == null) {
            c602 = new bd0();
        } else {
            c602 = bVar.g;
        }
        this.h = c602;
        if (bVar.i == null) {
            ed0 = kd0.n();
        } else {
            ed0 = bVar.i;
        }
        this.j = ed0;
        this.k = bVar.j;
        this.l = r(bVar);
        this.m = bVar.l;
        if (bVar.m == null) {
            c603 = new a(this);
        } else {
            c603 = bVar.m;
        }
        this.n = c603;
        if (bVar.n == null) {
            v40 = i(bVar.e);
        } else {
            v40 = bVar.n;
        }
        this.o = v40;
        if (bVar.o == null) {
            m60 = n60.b();
        } else {
            m60 = bVar.o;
        }
        this.p = m60;
        this.q = w(bVar, this.z);
        if (bVar.z < 0) {
            i2 = 30000;
        } else {
            i2 = bVar.z;
        }
        this.s = i2;
        if (oh0.d()) {
            oh0.a(C0201.m82(34844));
        }
        if (bVar.q == null) {
            ng0 = new bg0(this.s);
        } else {
            ng0 = bVar.q;
        }
        this.r = ng0;
        if (oh0.d()) {
            oh0.b();
        }
        oc0 unused = bVar.r;
        if (bVar.s == null) {
            f0Var = new f0(e0.m().m());
        } else {
            f0Var = bVar.s;
        }
        this.t = f0Var;
        if (bVar.t == null) {
            se0 = new ue0();
        } else {
            se0 = bVar.t;
        }
        this.u = se0;
        if (bVar.u == null) {
            set = new HashSet<>();
        } else {
            set = bVar.u;
        }
        this.v = set;
        this.w = bVar.v;
        if (bVar.w == null) {
            v402 = this.o;
        } else {
            v402 = bVar.w;
        }
        this.x = v402;
        this.y = bVar.y;
        int d2 = this.t.d();
        if (bVar.h == null) {
            zd0 = new vd0(d2);
        } else {
            zd0 = bVar.h;
        }
        this.i = zd0;
        this.A = bVar.B;
        this.B = bVar.C;
        this.C = bVar.D;
        j70 h2 = this.z.h();
        if (h2 != null) {
            H(h2, this.z, new mc0(z()));
        } else if (this.z.o() && k70.a && (i3 = k70.i()) != null) {
            H(i3, this.z, new mc0(z()));
        }
        if (oh0.d()) {
            oh0.b();
        }
    }
}
