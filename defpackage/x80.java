package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import defpackage.x80;
import defpackage.y50;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import vigqyno.C0201;

/* renamed from: x80  reason: default package */
/* compiled from: AbstractDraweeControllerBuilder */
public abstract class x80<BUILDER extends x80<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements la0 {
    private static final z80<Object> p = new a();
    private static final NullPointerException q = new NullPointerException(C0201.m82(17350));
    private static final AtomicLong r = new AtomicLong();
    private final Context a;
    private final Set<z80> b;
    private Object c;
    private REQUEST d;
    private REQUEST e;
    private REQUEST[] f;
    private boolean g;
    private c60<n70<IMAGE>> h;
    private z80<? super INFO> i;
    private a90 j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String n;
    private ia0 o;

    /* renamed from: x80$a */
    /* compiled from: AbstractDraweeControllerBuilder */
    static class a extends y80<Object> {
        @Override // defpackage.y80, defpackage.z80
        public void b(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x80$b */
    /* compiled from: AbstractDraweeControllerBuilder */
    public class b implements c60<n70<IMAGE>> {
        public final /* synthetic */ ia0 a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ c e;

        public b(ia0 ia0, String str, Object obj, Object obj2, c cVar) {
            this.a = ia0;
            this.b = str;
            this.c = obj;
            this.d = obj2;
            this.e = cVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: x80 */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public n70<IMAGE> get() {
            return x80.this.j(this.a, this.b, this.c, this.d, this.e);
        }

        public String toString() {
            y50.b d2 = y50.d(this);
            d2.b(C0201.m82(29386), this.c.toString());
            return d2.toString();
        }
    }

    /* renamed from: x80$c */
    /* compiled from: AbstractDraweeControllerBuilder */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    public x80(Context context, Set<z80> set) {
        this.a = context;
        this.b = set;
        r();
    }

    public static String f() {
        return String.valueOf(r.getAndIncrement());
    }

    private void r() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = true;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.o = null;
        this.n = null;
    }

    public BUILDER A(z80<? super INFO> z80) {
        this.i = z80;
        q();
        return this;
    }

    public BUILDER B(REQUEST request) {
        this.d = request;
        q();
        return this;
    }

    public BUILDER C(REQUEST request) {
        this.e = request;
        q();
        return this;
    }

    public BUILDER D(ia0 ia0) {
        this.o = ia0;
        q();
        return this;
    }

    public void E() {
        boolean z = false;
        z50.j(this.f == null || this.d == null, C0201.m82(17351));
        if (this.h == null || (this.f == null && this.d == null && this.e == null)) {
            z = true;
        }
        z50.j(z, C0201.m82(17352));
    }

    @Override // defpackage.la0
    public /* bridge */ /* synthetic */ la0 c(ia0 ia0) {
        D(ia0);
        return this;
    }

    /* renamed from: d */
    public w80 a() {
        REQUEST request;
        E();
        if (this.d == null && this.f == null && (request = this.e) != null) {
            this.d = request;
            this.e = null;
        }
        return e();
    }

    public w80 e() {
        if (oh0.d()) {
            oh0.a(C0201.m82(17353));
        }
        w80 v = v();
        v.N(p());
        v.J(h());
        v.L(i());
        u(v);
        s(v);
        if (oh0.d()) {
            oh0.b();
        }
        return v;
    }

    public Object g() {
        return this.c;
    }

    public String h() {
        return this.n;
    }

    public a90 i() {
        return this.j;
    }

    public abstract n70<IMAGE> j(ia0 ia0, String str, REQUEST request, Object obj, c cVar);

    public c60<n70<IMAGE>> k(ia0 ia0, String str, REQUEST request) {
        return l(ia0, str, request, c.FULL_FETCH);
    }

    public c60<n70<IMAGE>> l(ia0 ia0, String str, REQUEST request, c cVar) {
        return new b(ia0, str, request, g(), cVar);
    }

    public c60<n70<IMAGE>> m(ia0 ia0, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(l(ia0, str, request, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(k(ia0, str, request2));
        }
        return q70.b(arrayList);
    }

    public REQUEST n() {
        return this.d;
    }

    public ia0 o() {
        return this.o;
    }

    public boolean p() {
        return this.m;
    }

    public final BUILDER q() {
        return this;
    }

    public void s(w80 w80) {
        Set<z80> set = this.b;
        if (set != null) {
            for (z80 z80 : set) {
                w80.j(z80);
            }
        }
        z80<? super INFO> z802 = this.i;
        if (z802 != null) {
            w80.j(z802);
        }
        if (this.l) {
            w80.j(p);
        }
    }

    public void t(w80 w80) {
        if (w80.q() == null) {
            w80.M(ha0.c(this.a));
        }
    }

    public void u(w80 w80) {
        if (this.k) {
            w80.v().d(this.k);
            t(w80);
        }
    }

    public abstract w80 v();

    public c60<n70<IMAGE>> w(ia0 ia0, String str) {
        c60<n70<IMAGE>> c60 = this.h;
        if (c60 != null) {
            return c60;
        }
        c60<n70<IMAGE>> c602 = null;
        REQUEST request = this.d;
        if (request != null) {
            c602 = k(ia0, str, request);
        } else {
            REQUEST[] requestArr = this.f;
            if (requestArr != null) {
                c602 = m(ia0, str, requestArr, this.g);
            }
        }
        if (!(c602 == null || this.e == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(c602);
            arrayList.add(k(ia0, str, this.e));
            c602 = r70.c(arrayList, false);
        }
        return c602 == null ? o70.a(q) : c602;
    }

    public BUILDER x() {
        r();
        q();
        return this;
    }

    public BUILDER y(boolean z) {
        this.l = z;
        q();
        return this;
    }

    public BUILDER z(Object obj) {
        this.c = obj;
        q();
        return this;
    }
}
