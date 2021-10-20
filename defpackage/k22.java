package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import vigqyno.C0201;

/* renamed from: k22  reason: default package */
/* compiled from: Gson */
public final class k22 {
    private static final g42<?> k = g42.a(Object.class);
    private final ThreadLocal<Map<g42<?>, f<?>>> a;
    private final Map<g42<?>, x22<?>> b;
    private final g32 c;
    private final t32 d;
    public final List<y22> e;
    public final h32 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* access modifiers changed from: package-private */
    /* renamed from: k22$a */
    /* compiled from: Gson */
    public class a extends x22<Number> {
        public a(k22 k22) {
        }

        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            if (number == null) {
                h42.x();
                return;
            }
            k22.c(number.doubleValue());
            h42.N(number);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k22$b */
    /* compiled from: Gson */
    public class b extends x22<Number> {
        public b(k22 k22) {
        }

        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            if (number == null) {
                h42.x();
                return;
            }
            k22.c((double) number.floatValue());
            h42.N(number);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k22$c */
    /* compiled from: Gson */
    public static class c extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            if (number == null) {
                h42.x();
            } else {
                h42.P(number.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k22$d */
    /* compiled from: Gson */
    public static class d extends x22<AtomicLong> {
        public final /* synthetic */ x22 a;

        public d(x22 x22) {
            this.a = x22;
        }

        /* renamed from: d */
        public void c(h42 h42, AtomicLong atomicLong) throws IOException {
            this.a.c(h42, Long.valueOf(atomicLong.get()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k22$e */
    /* compiled from: Gson */
    public static class e extends x22<AtomicLongArray> {
        public final /* synthetic */ x22 a;

        public e(x22 x22) {
            this.a = x22;
        }

        /* renamed from: d */
        public void c(h42 h42, AtomicLongArray atomicLongArray) throws IOException {
            h42.h();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.a.c(h42, Long.valueOf(atomicLongArray.get(i)));
            }
            h42.n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k22$f */
    /* compiled from: Gson */
    public static class f<T> extends x22<T> {
        private x22<T> a;

        @Override // defpackage.x22
        public void c(h42 h42, T t) throws IOException {
            x22<T> x22 = this.a;
            if (x22 != null) {
                x22.c(h42, t);
                return;
            }
            throw new IllegalStateException();
        }

        public void d(x22<T> x22) {
            if (this.a == null) {
                this.a = x22;
                return;
            }
            throw new AssertionError();
        }
    }

    public k22() {
        this(h32.g, i22.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, w22.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static x22<AtomicLong> a(x22<Number> x22) {
        return new d(x22).a();
    }

    private static x22<AtomicLongArray> b(x22<Number> x22) {
        return new e(x22).a();
    }

    public static void c(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + C0201.m82(17396));
        }
    }

    private x22<Number> d(boolean z) {
        if (z) {
            return c42.v;
        }
        return new a(this);
    }

    private x22<Number> e(boolean z) {
        if (z) {
            return c42.u;
        }
        return new b(this);
    }

    private static x22<Number> i(w22 w22) {
        if (w22 == w22.DEFAULT) {
            return c42.t;
        }
        return new c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.util.Map<g42<?>, x22<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: x22<T>, x22<?> */
    public <T> x22<T> f(g42<T> g42) {
        x22<T> x22 = (x22<T>) this.b.get(g42 == null ? k : g42);
        if (x22 != null) {
            return x22;
        }
        Map<g42<?>, f<?>> map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z = true;
        }
        f<?> fVar = map.get(g42);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(g42, fVar2);
            for (y22 y22 : this.e) {
                x22 x222 = (x22<T>) y22.a(this, g42);
                if (x222 != null) {
                    fVar2.d(x222);
                    this.b.put(g42, x222);
                    return x222;
                }
            }
            throw new IllegalArgumentException(C0201.m82(17397) + g42);
        } finally {
            map.remove(g42);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> x22<T> g(Class<T> cls) {
        return f(g42.a(cls));
    }

    public <T> x22<T> h(y22 y22, g42<T> g42) {
        if (!this.e.contains(y22)) {
            y22 = this.d;
        }
        boolean z = false;
        for (y22 y222 : this.e) {
            if (z) {
                x22<T> a2 = y222.a(this, g42);
                if (a2 != null) {
                    return a2;
                }
            } else if (y222 == y22) {
                z = true;
            }
        }
        throw new IllegalArgumentException(C0201.m82(17398) + g42);
    }

    public h42 j(Writer writer) throws IOException {
        if (this.h) {
            writer.write(C0201.m82(17399));
        }
        h42 h42 = new h42(writer);
        if (this.j) {
            h42.D(C0201.m82(17400));
        }
        h42.F(this.g);
        return h42;
    }

    public String k(o22 o22) {
        StringWriter stringWriter = new StringWriter();
        o(o22, stringWriter);
        return stringWriter.toString();
    }

    public String l(Object obj) {
        if (obj == null) {
            return k(q22.a);
        }
        return m(obj, obj.getClass());
    }

    public String m(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        q(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void n(o22 o22, h42 h42) throws p22 {
        boolean s = h42.s();
        h42.E(true);
        boolean r = h42.r();
        h42.B(this.i);
        boolean p = h42.p();
        h42.F(this.g);
        try {
            o32.a(o22, h42);
            h42.E(s);
            h42.B(r);
            h42.F(p);
        } catch (IOException e2) {
            throw new p22(e2);
        } catch (AssertionError e3) {
            throw new AssertionError(C0201.m82(17401) + e3.getMessage(), e3);
        } catch (Throwable th) {
            h42.E(s);
            h42.B(r);
            h42.F(p);
            throw th;
        }
    }

    public void o(o22 o22, Appendable appendable) throws p22 {
        try {
            n(o22, j(o32.b(appendable)));
        } catch (IOException e2) {
            throw new p22(e2);
        }
    }

    public void p(Object obj, Type type, h42 h42) throws p22 {
        x22 f2 = f(g42.b(type));
        boolean s = h42.s();
        h42.E(true);
        boolean r = h42.r();
        h42.B(this.i);
        boolean p = h42.p();
        h42.F(this.g);
        try {
            f2.c(h42, obj);
            h42.E(s);
            h42.B(r);
            h42.F(p);
        } catch (IOException e2) {
            throw new p22(e2);
        } catch (AssertionError e3) {
            throw new AssertionError(C0201.m82(17402) + e3.getMessage(), e3);
        } catch (Throwable th) {
            h42.E(s);
            h42.B(r);
            h42.F(p);
            throw th;
        }
    }

    public void q(Object obj, Type type, Appendable appendable) throws p22 {
        try {
            p(obj, type, j(o32.b(appendable)));
        } catch (IOException e2) {
            throw new p22(e2);
        }
    }

    public String toString() {
        return C0201.m82(17403) + this.g + C0201.m82(17404) + this.e + C0201.m82(17405) + this.c + C0201.m82(17406);
    }

    public k22(h32 h32, j22 j22, Map<Type, l22<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, w22 w22, String str, int i2, int i3, List<y22> list, List<y22> list2, List<y22> list3) {
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = h32;
        this.c = new g32(map);
        this.g = z;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c42.Y);
        arrayList.add(w32.b);
        arrayList.add(h32);
        arrayList.addAll(list3);
        arrayList.add(c42.D);
        arrayList.add(c42.m);
        arrayList.add(c42.g);
        arrayList.add(c42.i);
        arrayList.add(c42.k);
        x22<Number> i4 = i(w22);
        arrayList.add(c42.b(Long.TYPE, Long.class, i4));
        arrayList.add(c42.b(Double.TYPE, Double.class, d(z7)));
        arrayList.add(c42.b(Float.TYPE, Float.class, e(z7)));
        arrayList.add(c42.x);
        arrayList.add(c42.o);
        arrayList.add(c42.q);
        arrayList.add(c42.a(AtomicLong.class, a(i4)));
        arrayList.add(c42.a(AtomicLongArray.class, b(i4)));
        arrayList.add(c42.s);
        arrayList.add(c42.z);
        arrayList.add(c42.F);
        arrayList.add(c42.H);
        arrayList.add(c42.a(BigDecimal.class, c42.B));
        arrayList.add(c42.a(BigInteger.class, c42.C));
        arrayList.add(c42.J);
        arrayList.add(c42.L);
        arrayList.add(c42.P);
        arrayList.add(c42.R);
        arrayList.add(c42.W);
        arrayList.add(c42.N);
        arrayList.add(c42.d);
        arrayList.add(s32.b);
        arrayList.add(c42.U);
        arrayList.add(z32.b);
        arrayList.add(y32.b);
        arrayList.add(c42.S);
        arrayList.add(q32.b);
        arrayList.add(c42.b);
        arrayList.add(new r32(this.c));
        arrayList.add(new v32(this.c, z2));
        t32 t32 = new t32(this.c);
        this.d = t32;
        arrayList.add(t32);
        arrayList.add(c42.Z);
        arrayList.add(new x32(this.c, j22, h32, this.d));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
