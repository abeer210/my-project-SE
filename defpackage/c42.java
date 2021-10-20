package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import vigqyno.C0201;

/* renamed from: c42  reason: default package */
/* compiled from: TypeAdapters */
public final class c42 {
    public static final x22<String> A = new g();
    public static final x22<BigDecimal> B = new h();
    public static final x22<BigInteger> C = new i();
    public static final y22 D = a(String.class, A);
    public static final x22<StringBuilder> E;
    public static final y22 F;
    public static final x22<StringBuffer> G;
    public static final y22 H;
    public static final x22<URL> I;
    public static final y22 J;
    public static final x22<URI> K;
    public static final y22 L;
    public static final x22<InetAddress> M;
    public static final y22 N;
    public static final x22<UUID> O;
    public static final y22 P;
    public static final x22<Currency> Q;
    public static final y22 R;
    public static final y22 S = new r();
    public static final x22<Calendar> T;
    public static final y22 U;
    public static final x22<Locale> V;
    public static final y22 W;
    public static final x22<o22> X;
    public static final y22 Y;
    public static final y22 Z = new w();
    public static final x22<Class> a;
    public static final y22 b;
    public static final x22<BitSet> c;
    public static final y22 d;
    public static final x22<Boolean> e = new b0();
    public static final x22<Boolean> f = new c0();
    public static final y22 g = b(Boolean.TYPE, Boolean.class, e);
    public static final x22<Number> h = new d0();
    public static final y22 i = b(Byte.TYPE, Byte.class, h);
    public static final x22<Number> j = new e0();
    public static final y22 k = b(Short.TYPE, Short.class, j);
    public static final x22<Number> l = new f0();
    public static final y22 m = b(Integer.TYPE, Integer.class, l);
    public static final x22<AtomicInteger> n;
    public static final y22 o;
    public static final x22<AtomicBoolean> p;
    public static final y22 q;
    public static final x22<AtomicIntegerArray> r;
    public static final y22 s;
    public static final x22<Number> t = new b();
    public static final x22<Number> u = new c();
    public static final x22<Number> v = new d();
    public static final x22<Number> w;
    public static final y22 x;
    public static final x22<Character> y = new f();
    public static final y22 z = b(Character.TYPE, Character.class, y);

    /* renamed from: c42$a */
    /* compiled from: TypeAdapters */
    static class a extends x22<AtomicIntegerArray> {
        /* renamed from: d */
        public void c(h42 h42, AtomicIntegerArray atomicIntegerArray) throws IOException {
            h42.h();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                h42.H((long) atomicIntegerArray.get(i));
            }
            h42.n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c42$a0 */
    /* compiled from: TypeAdapters */
    public static class a0 implements y22 {
        public final /* synthetic */ Class a;
        public final /* synthetic */ x22 b;

        /* renamed from: c42$a0$a */
        /* compiled from: TypeAdapters */
        class a extends x22<T1> {
            public a(Class cls) {
            }

            @Override // defpackage.x22
            public void c(h42 h42, T1 t1) throws IOException {
                a0.this.b.c(h42, t1);
            }
        }

        public a0(Class cls, x22 x22) {
            this.a = cls;
            this.b = x22;
        }

        @Override // defpackage.y22
        public <T2> x22<T2> a(k22 k22, g42<T2> g42) {
            Class<? super T2> c = g42.c();
            if (!this.a.isAssignableFrom(c)) {
                return null;
            }
            return new a(c);
        }

        public String toString() {
            return C0201.m82(2523) + this.a.getName() + C0201.m82(2524) + this.b + C0201.m82(2525);
        }
    }

    /* renamed from: c42$b */
    /* compiled from: TypeAdapters */
    static class b extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            h42.N(number);
        }
    }

    /* renamed from: c42$b0 */
    /* compiled from: TypeAdapters */
    static class b0 extends x22<Boolean> {
        /* renamed from: d */
        public void c(h42 h42, Boolean bool) throws IOException {
            h42.K(bool);
        }
    }

    /* renamed from: c42$c */
    /* compiled from: TypeAdapters */
    static class c extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            h42.N(number);
        }
    }

    /* renamed from: c42$c0 */
    /* compiled from: TypeAdapters */
    static class c0 extends x22<Boolean> {
        /* renamed from: d */
        public void c(h42 h42, Boolean bool) throws IOException {
            h42.P(bool == null ? C0201.m82(8482) : bool.toString());
        }
    }

    /* renamed from: c42$d */
    /* compiled from: TypeAdapters */
    static class d extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            h42.N(number);
        }
    }

    /* renamed from: c42$d0 */
    /* compiled from: TypeAdapters */
    static class d0 extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            h42.N(number);
        }
    }

    /* renamed from: c42$e */
    /* compiled from: TypeAdapters */
    static class e extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            h42.N(number);
        }
    }

    /* renamed from: c42$e0 */
    /* compiled from: TypeAdapters */
    static class e0 extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            h42.N(number);
        }
    }

    /* renamed from: c42$f */
    /* compiled from: TypeAdapters */
    static class f extends x22<Character> {
        /* renamed from: d */
        public void c(h42 h42, Character ch) throws IOException {
            h42.P(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: c42$f0 */
    /* compiled from: TypeAdapters */
    static class f0 extends x22<Number> {
        /* renamed from: d */
        public void c(h42 h42, Number number) throws IOException {
            h42.N(number);
        }
    }

    /* renamed from: c42$g */
    /* compiled from: TypeAdapters */
    static class g extends x22<String> {
        /* renamed from: d */
        public void c(h42 h42, String str) throws IOException {
            h42.P(str);
        }
    }

    /* renamed from: c42$g0 */
    /* compiled from: TypeAdapters */
    static class g0 extends x22<AtomicInteger> {
        /* renamed from: d */
        public void c(h42 h42, AtomicInteger atomicInteger) throws IOException {
            h42.H((long) atomicInteger.get());
        }
    }

    /* renamed from: c42$h */
    /* compiled from: TypeAdapters */
    static class h extends x22<BigDecimal> {
        /* renamed from: d */
        public void c(h42 h42, BigDecimal bigDecimal) throws IOException {
            h42.N(bigDecimal);
        }
    }

    /* renamed from: c42$h0 */
    /* compiled from: TypeAdapters */
    static class h0 extends x22<AtomicBoolean> {
        /* renamed from: d */
        public void c(h42 h42, AtomicBoolean atomicBoolean) throws IOException {
            h42.Q(atomicBoolean.get());
        }
    }

    /* renamed from: c42$i */
    /* compiled from: TypeAdapters */
    static class i extends x22<BigInteger> {
        /* renamed from: d */
        public void c(h42 h42, BigInteger bigInteger) throws IOException {
            h42.N(bigInteger);
        }
    }

    /* renamed from: c42$i0 */
    /* compiled from: TypeAdapters */
    private static final class i0<T extends Enum<T>> extends x22<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public i0(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    b32 b32 = (b32) cls.getField(name).getAnnotation(b32.class);
                    if (b32 != null) {
                        name = b32.value();
                        for (String str : b32.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: d */
        public void c(h42 h42, T t) throws IOException {
            h42.P(t == null ? null : this.b.get(t));
        }
    }

    /* renamed from: c42$j */
    /* compiled from: TypeAdapters */
    static class j extends x22<StringBuilder> {
        /* renamed from: d */
        public void c(h42 h42, StringBuilder sb) throws IOException {
            h42.P(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: c42$k */
    /* compiled from: TypeAdapters */
    static class k extends x22<Class> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [h42, java.lang.Object] */
        @Override // defpackage.x22
        public /* bridge */ /* synthetic */ void c(h42 h42, Class cls) throws IOException {
            d(h42, cls);
            throw null;
        }

        public void d(h42 h42, Class cls) throws IOException {
            throw new UnsupportedOperationException(C0201.m82(10872) + cls.getName() + C0201.m82(10873));
        }
    }

    /* renamed from: c42$l */
    /* compiled from: TypeAdapters */
    static class l extends x22<StringBuffer> {
        /* renamed from: d */
        public void c(h42 h42, StringBuffer stringBuffer) throws IOException {
            h42.P(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: c42$m */
    /* compiled from: TypeAdapters */
    static class m extends x22<URL> {
        /* renamed from: d */
        public void c(h42 h42, URL url) throws IOException {
            h42.P(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: c42$n */
    /* compiled from: TypeAdapters */
    static class n extends x22<URI> {
        /* renamed from: d */
        public void c(h42 h42, URI uri) throws IOException {
            h42.P(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: c42$o */
    /* compiled from: TypeAdapters */
    static class o extends x22<InetAddress> {
        /* renamed from: d */
        public void c(h42 h42, InetAddress inetAddress) throws IOException {
            h42.P(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: c42$p */
    /* compiled from: TypeAdapters */
    static class p extends x22<UUID> {
        /* renamed from: d */
        public void c(h42 h42, UUID uuid) throws IOException {
            h42.P(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: c42$q */
    /* compiled from: TypeAdapters */
    static class q extends x22<Currency> {
        /* renamed from: d */
        public void c(h42 h42, Currency currency) throws IOException {
            h42.P(currency.getCurrencyCode());
        }
    }

    /* renamed from: c42$r */
    /* compiled from: TypeAdapters */
    static class r implements y22 {

        /* renamed from: c42$r$a */
        /* compiled from: TypeAdapters */
        class a extends x22<Timestamp> {
            public final /* synthetic */ x22 a;

            public a(r rVar, x22 x22) {
                this.a = x22;
            }

            /* renamed from: d */
            public void c(h42 h42, Timestamp timestamp) throws IOException {
                this.a.c(h42, timestamp);
            }
        }

        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            if (g42.c() != Timestamp.class) {
                return null;
            }
            return new a(this, k22.g(Date.class));
        }
    }

    /* renamed from: c42$s */
    /* compiled from: TypeAdapters */
    static class s extends x22<Calendar> {
        /* renamed from: d */
        public void c(h42 h42, Calendar calendar) throws IOException {
            if (calendar == null) {
                h42.x();
                return;
            }
            h42.k();
            h42.u(C0201.m82(11639));
            h42.H((long) calendar.get(1));
            h42.u(C0201.m82(11640));
            h42.H((long) calendar.get(2));
            h42.u(C0201.m82(11641));
            h42.H((long) calendar.get(5));
            h42.u(C0201.m82(11642));
            h42.H((long) calendar.get(11));
            h42.u(C0201.m82(11643));
            h42.H((long) calendar.get(12));
            h42.u(C0201.m82(11644));
            h42.H((long) calendar.get(13));
            h42.o();
        }
    }

    /* renamed from: c42$t */
    /* compiled from: TypeAdapters */
    static class t extends x22<Locale> {
        /* renamed from: d */
        public void c(h42 h42, Locale locale) throws IOException {
            h42.P(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: c42$u */
    /* compiled from: TypeAdapters */
    static class u extends x22<o22> {
        /* renamed from: d */
        public void c(h42 h42, o22 o22) throws IOException {
            if (o22 == null || o22.e()) {
                h42.x();
            } else if (o22.g()) {
                t22 c = o22.c();
                if (c.q()) {
                    h42.N(c.k());
                } else if (c.o()) {
                    h42.Q(c.i());
                } else {
                    h42.P(c.l());
                }
            } else if (o22.d()) {
                h42.h();
                Iterator<o22> it = o22.a().iterator();
                while (it.hasNext()) {
                    c(h42, it.next());
                }
                h42.n();
            } else if (o22.f()) {
                h42.k();
                for (Map.Entry<String, o22> entry : o22.b().j()) {
                    h42.u(entry.getKey());
                    c(h42, entry.getValue());
                }
                h42.o();
            } else {
                throw new IllegalArgumentException(C0201.m82(12004) + o22.getClass());
            }
        }
    }

    /* renamed from: c42$v */
    /* compiled from: TypeAdapters */
    static class v extends x22<BitSet> {
        /* renamed from: d */
        public void c(h42 h42, BitSet bitSet) throws IOException {
            h42.h();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                h42.H(bitSet.get(i) ? 1 : 0);
            }
            h42.n();
        }
    }

    /* renamed from: c42$w */
    /* compiled from: TypeAdapters */
    static class w implements y22 {
        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            Class<? super Object> c = g42.c();
            if (!Enum.class.isAssignableFrom(c) || c == Enum.class) {
                return null;
            }
            if (!c.isEnum()) {
                c = c.getSuperclass();
            }
            return new i0(c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c42$x */
    /* compiled from: TypeAdapters */
    public static class x implements y22 {
        public final /* synthetic */ Class a;
        public final /* synthetic */ x22 b;

        public x(Class cls, x22 x22) {
            this.a = cls;
            this.b = x22;
        }

        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            if (g42.c() == this.a) {
                return this.b;
            }
            return null;
        }

        public String toString() {
            return C0201.m82(12071) + this.a.getName() + C0201.m82(12072) + this.b + C0201.m82(12073);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c42$y */
    /* compiled from: TypeAdapters */
    public static class y implements y22 {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Class b;
        public final /* synthetic */ x22 c;

        public y(Class cls, Class cls2, x22 x22) {
            this.a = cls;
            this.b = cls2;
            this.c = x22;
        }

        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            Class<? super T> c2 = g42.c();
            if (c2 == this.a || c2 == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return C0201.m82(12287) + this.b.getName() + C0201.m82(12288) + this.a.getName() + C0201.m82(12289) + this.c + C0201.m82(12290);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c42$z */
    /* compiled from: TypeAdapters */
    public static class z implements y22 {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Class b;
        public final /* synthetic */ x22 c;

        public z(Class cls, Class cls2, x22 x22) {
            this.a = cls;
            this.b = cls2;
            this.c = x22;
        }

        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            Class<? super T> c2 = g42.c();
            if (c2 == this.a || c2 == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return C0201.m82(12230) + this.a.getName() + C0201.m82(12231) + this.b.getName() + C0201.m82(12232) + this.c + C0201.m82(12233);
        }
    }

    static {
        x22<Class> a2 = new k().a();
        a = a2;
        b = a(Class.class, a2);
        x22<BitSet> a3 = new v().a();
        c = a3;
        d = a(BitSet.class, a3);
        x22<AtomicInteger> a4 = new g0().a();
        n = a4;
        o = a(AtomicInteger.class, a4);
        x22<AtomicBoolean> a5 = new h0().a();
        p = a5;
        q = a(AtomicBoolean.class, a5);
        x22<AtomicIntegerArray> a6 = new a().a();
        r = a6;
        s = a(AtomicIntegerArray.class, a6);
        e eVar = new e();
        w = eVar;
        x = a(Number.class, eVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = a(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        x22<Currency> a7 = new q().a();
        Q = a7;
        R = a(Currency.class, a7);
        s sVar = new s();
        T = sVar;
        U = c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = a(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = d(o22.class, uVar);
    }

    public static <TT> y22 a(Class<TT> cls, x22<TT> x22) {
        return new x(cls, x22);
    }

    public static <TT> y22 b(Class<TT> cls, Class<TT> cls2, x22<? super TT> x22) {
        return new y(cls, cls2, x22);
    }

    public static <TT> y22 c(Class<TT> cls, Class<? extends TT> cls2, x22<? super TT> x22) {
        return new z(cls, cls2, x22);
    }

    public static <T1> y22 d(Class<T1> cls, x22<T1> x22) {
        return new a0(cls, x22);
    }
}
