package defpackage;

import vigqyno.C0201;

/* renamed from: hz1  reason: default package */
public final class hz1<T> implements iz1, fz1 {
    private static final Object c = new Object();
    private volatile iz1<T> a;
    private volatile Object b = c;

    private hz1(iz1<T> iz1) {
        this.a = iz1;
    }

    public static <P extends iz1<T>, T> iz1<T> a(P p) {
        ty1.c(p);
        return p instanceof hz1 ? p : new hz1(p);
    }

    public static <P extends iz1<T>, T> fz1<T> b(P p) {
        if (p instanceof fz1) {
            return (fz1) p;
        }
        ty1.c(p);
        return new hz1(p);
    }

    @Override // defpackage.iz1, defpackage.fz1
    public final T a() {
        T t = (T) this.b;
        if (t == c) {
            synchronized (this) {
                t = this.b;
                if (t == c) {
                    t = this.a.a();
                    Object obj = this.b;
                    if (obj != c) {
                        if (obj != t) {
                            String valueOf = String.valueOf(obj);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append(C0201.m82(13388));
                            sb.append(valueOf);
                            sb.append(C0201.m82(13389));
                            sb.append(valueOf2);
                            sb.append(C0201.m82(13390));
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
