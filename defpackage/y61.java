package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: y61 */
public abstract class y61<T> {
    private static final Object f = new Object();
    private static Context g;
    private static final AtomicInteger h = new AtomicInteger();
    private final f71 a;
    private final String b;
    private final T c;
    private volatile int d;
    private volatile T e;

    private y61(f71 f71, String str, T t) {
        this.d = -1;
        if (f71.a != null) {
            this.a = f71;
            this.b = str;
            this.c = t;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(5226));
    }

    public static y61<Double> b(f71 f71, String str, double d2) {
        return new d71(f71, str, Double.valueOf(d2));
    }

    public static y61<Long> c(f71 f71, String str, long j) {
        return new b71(f71, str, Long.valueOf(j));
    }

    public static y61<String> d(f71 f71, String str, String str2) {
        return new c71(f71, str, str2);
    }

    public static y61<Boolean> e(f71 f71, String str, boolean z) {
        return new a71(f71, str, Boolean.valueOf(z));
    }

    private final String k(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static void l(Context context) {
        synchronized (f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (g != context) {
                synchronized (m61.class) {
                    m61.f.clear();
                }
                synchronized (e71.class) {
                    e71.f.clear();
                }
                synchronized (v61.class) {
                    v61.b = null;
                }
                h.incrementAndGet();
                g = context;
            }
        }
    }

    public static void m() {
        h.incrementAndGet();
    }

    private final T o() {
        q61 q61;
        Object a2;
        String str = (String) v61.d(g).a(C0201.m82(5227));
        if (!(str != null && l61.c.matcher(str).matches())) {
            if (this.a.a != null) {
                q61 = w61.a(g, this.a.a) ? m61.b(g.getContentResolver(), this.a.a) : null;
            } else {
                q61 = e71.c(g, null);
            }
            if (!(q61 == null || (a2 = q61.a(n())) == null)) {
                return j(a2);
            }
        } else {
            String r2 = C0201.m82(5228);
            if (Log.isLoggable(r2, 3)) {
                String r0 = C0201.m82(5229);
                String valueOf = String.valueOf(n());
                Log.d(r2, valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0));
            }
        }
        return null;
    }

    private final T p() {
        Object a2 = v61.d(g).a(k(this.a.b));
        if (a2 != null) {
            return j(a2);
        }
        return null;
    }

    public final T a() {
        int i = h.get();
        if (this.d < i) {
            synchronized (this) {
                if (this.d < i) {
                    if (g != null) {
                        T o = o();
                        if (o == null) {
                            o = p();
                            if (o == null) {
                                o = this.c;
                            }
                        }
                        this.e = o;
                        this.d = i;
                    } else {
                        throw new IllegalStateException(C0201.m82(5230));
                    }
                }
            }
        }
        return this.e;
    }

    public abstract T j(Object obj);

    public final String n() {
        return k(this.a.c);
    }

    public /* synthetic */ y61(f71 f71, String str, Object obj, b71 b71) {
        this(f71, str, obj);
    }
}
