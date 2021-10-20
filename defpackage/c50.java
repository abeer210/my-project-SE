package defpackage;

import defpackage.l40;
import java.io.IOException;

/* renamed from: c50  reason: default package */
/* compiled from: SettableCacheEvent */
public class c50 implements k40 {
    private static final Object b = new Object();
    private static c50 c;
    private static int d;
    private c50 a;

    private c50() {
    }

    public static c50 a() {
        synchronized (b) {
            if (c == null) {
                return new c50();
            }
            c50 c50 = c;
            c = c50.a;
            c50.a = null;
            d--;
            return c50;
        }
    }

    private void c() {
    }

    public void b() {
        synchronized (b) {
            if (d < 5) {
                c();
                d++;
                if (c != null) {
                    this.a = c;
                }
                c = this;
            }
        }
    }

    public c50 d(m40 m40) {
        return this;
    }

    public c50 e(long j) {
        return this;
    }

    public c50 f(long j) {
        return this;
    }

    public c50 g(l40.a aVar) {
        return this;
    }

    public c50 h(IOException iOException) {
        return this;
    }

    public c50 i(long j) {
        return this;
    }

    public c50 j(String str) {
        return this;
    }
}
