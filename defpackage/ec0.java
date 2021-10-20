package defpackage;

import android.net.Uri;
import defpackage.y50;
import defpackage.yc0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import vigqyno.C0201;

/* renamed from: ec0  reason: default package */
/* compiled from: AnimatedFrameCache */
public class ec0 {
    private final m40 a;
    private final yc0<m40, ye0> b;
    private final yc0.e<m40> c = new a();
    private final LinkedHashSet<m40> d = new LinkedHashSet<>();

    /* renamed from: ec0$a */
    /* compiled from: AnimatedFrameCache */
    class a implements yc0.e<m40> {
        public a() {
        }

        /* renamed from: b */
        public void a(m40 m40, boolean z) {
            ec0.this.f(m40, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ec0$b */
    /* compiled from: AnimatedFrameCache */
    public static class b implements m40 {
        private final m40 a;
        private final int b;

        public b(m40 m40, int i) {
            this.a = m40;
            this.b = i;
        }

        @Override // defpackage.m40
        public boolean a(Uri uri) {
            return this.a.a(uri);
        }

        @Override // defpackage.m40
        public String b() {
            return null;
        }

        @Override // defpackage.m40
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b || !this.a.equals(bVar.a)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.m40
        public int hashCode() {
            return (this.a.hashCode() * 1013) + this.b;
        }

        public String toString() {
            y50.b d = y50.d(this);
            d.b(C0201.m82(29523), this.a);
            d.a(C0201.m82(29524), this.b);
            return d.toString();
        }
    }

    public ec0(m40 m40, yc0<m40, ye0> yc0) {
        this.a = m40;
        this.b = yc0;
    }

    private b e(int i) {
        return new b(this.a, i);
    }

    private synchronized m40 g() {
        m40 m40;
        m40 = null;
        Iterator<m40> it = this.d.iterator();
        if (it.hasNext()) {
            m40 = it.next();
            it.remove();
        }
        return m40;
    }

    public v60<ye0> a(int i, v60<ye0> v60) {
        return this.b.f(e(i), v60, this.c);
    }

    public boolean b(int i) {
        return this.b.h(e(i));
    }

    public v60<ye0> c(int i) {
        return this.b.get(e(i));
    }

    public v60<ye0> d() {
        v60<ye0> y;
        do {
            m40 g = g();
            if (g == null) {
                return null;
            }
            y = this.b.y(g);
        } while (y == null);
        return y;
    }

    public synchronized void f(m40 m40, boolean z) {
        if (z) {
            this.d.add(m40);
        } else {
            this.d.remove(m40);
        }
    }
}
