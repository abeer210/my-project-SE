package defpackage;

import android.content.Context;
import defpackage.j40;
import defpackage.l40;
import defpackage.w40;
import defpackage.z60;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: x40  reason: default package */
/* compiled from: DiskStorageCache */
public class x40 implements b50, e50 {
    private static final Class<?> q = x40.class;
    private static final long r = TimeUnit.HOURS.toMillis(2);
    private static final long s = TimeUnit.MINUTES.toMillis(30);
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    private final long a;
    private final long b;
    private final CountDownLatch c;
    private long d;
    private final l40 e;
    public final Set<String> f;
    private long g;
    private final z60 h;
    private final w40 i;
    private final a50 j;
    private final j40 k;
    private final boolean l;
    private final b m;
    private final com.facebook.common.time.a n;
    private final Object o = new Object();
    private boolean p;

    /* renamed from: x40$a */
    /* compiled from: DiskStorageCache */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            synchronized (x40.this.o) {
                x40.this.o();
            }
            x40.this.p = true;
            x40.this.c.countDown();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x40$b */
    /* compiled from: DiskStorageCache */
    public static class b {
        private boolean a = false;
        private long b = -1;
        private long c = -1;

        public synchronized long a() {
            return this.c;
        }

        public synchronized long b() {
            return this.b;
        }

        public synchronized void c(long j, long j2) {
            if (this.a) {
                this.b += j;
                this.c += j2;
            }
        }

        public synchronized boolean d() {
            return this.a;
        }

        public synchronized void e() {
            this.a = false;
            this.c = -1;
            this.b = -1;
        }

        public synchronized void f(long j, long j2) {
            this.c = j2;
            this.b = j;
            this.a = true;
        }
    }

    /* renamed from: x40$c */
    /* compiled from: DiskStorageCache */
    public static class c {
        public final long a;
        public final long b;
        public final long c;

        public c(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    static {
        C0201.m83(x40.class, 40);
    }

    public x40(w40 w40, a50 a50, c cVar, l40 l40, j40 j40, f50 f50, Context context, Executor executor, boolean z) {
        this.a = cVar.b;
        long j2 = cVar.c;
        this.b = j2;
        this.d = j2;
        this.h = z60.d();
        this.i = w40;
        this.j = a50;
        this.g = -1;
        this.e = l40;
        long j3 = cVar.a;
        this.k = j40;
        this.m = new b();
        this.n = com.facebook.common.time.c.a();
        this.l = z;
        this.f = new HashSet();
        if (f50 != null) {
            f50.a(this);
        }
        if (this.l) {
            this.c = new CountDownLatch(1);
            executor.execute(new a());
            return;
        }
        this.c = new CountDownLatch(0);
    }

    private h40 k(w40.b bVar, m40 m40, String str) throws IOException {
        h40 c2;
        synchronized (this.o) {
            c2 = bVar.c(m40);
            this.f.add(str);
            this.m.c(c2.size(), 1);
        }
        return c2;
    }

    private void l(long j2, l40.a aVar) throws IOException {
        try {
            Collection<w40.a> m2 = m(this.i.g());
            long b2 = this.m.b();
            long j3 = b2 - j2;
            int i2 = 0;
            long j4 = 0;
            for (w40.a aVar2 : m2) {
                if (j4 > j3) {
                    break;
                }
                long h2 = this.i.h(aVar2);
                this.f.remove(aVar2.t());
                if (h2 > 0) {
                    i2++;
                    j4 += h2;
                    c50 a2 = c50.a();
                    a2.j(aVar2.t());
                    a2.g(aVar);
                    a2.i(h2);
                    a2.f(b2 - j4);
                    a2.e(j2);
                    this.e.b(a2);
                    a2.b();
                }
            }
            this.m.c(-j4, (long) (-i2));
            this.i.c();
        } catch (IOException e2) {
            j40 j40 = this.k;
            j40.a aVar3 = j40.a.EVICTION;
            Class<?> cls = q;
            j40.a(aVar3, cls, y + e2.getMessage(), e2);
            throw e2;
        }
    }

    private Collection<w40.a> m(Collection<w40.a> collection) {
        long now = this.n.now() + r;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (w40.a aVar : collection) {
            if (aVar.u() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.j.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void n() throws IOException {
        synchronized (this.o) {
            boolean o2 = o();
            r();
            long b2 = this.m.b();
            if (b2 > this.d && !o2) {
                this.m.e();
                o();
            }
            if (b2 > this.d) {
                l((this.d * 9) / 10, l40.a.CACHE_FULL);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean o() {
        long now = this.n.now();
        if (this.m.d()) {
            long j2 = this.g;
            if (j2 != -1 && now - j2 <= s) {
                return false;
            }
        }
        return p();
    }

    private boolean p() {
        Set<String> set;
        long j2;
        long now = this.n.now();
        long j3 = r + now;
        if (!this.l || !this.f.isEmpty()) {
            set = this.l ? new HashSet<>() : null;
        } else {
            set = this.f;
        }
        try {
            long j4 = 0;
            long j5 = -1;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            int i4 = 0;
            for (w40.a aVar : this.i.g()) {
                i3++;
                j4 += aVar.a();
                if (aVar.u() > j3) {
                    i4++;
                    i2 = (int) (((long) i2) + aVar.a());
                    j2 = j3;
                    j5 = Math.max(aVar.u() - now, j5);
                    z = true;
                } else {
                    j2 = j3;
                    if (this.l) {
                        set.add(aVar.t());
                    }
                }
                j3 = j2;
            }
            if (z) {
                j40 j40 = this.k;
                j40.a aVar2 = j40.a.READ_INVALID_ENTRY;
                Class<?> cls = q;
                j40.a(aVar2, cls, u + i4 + t + i2 + x + j5 + w, null);
            }
            long j6 = (long) i3;
            if (!(this.m.a() == j6 && this.m.b() == j4)) {
                if (this.l && this.f != set) {
                    this.f.clear();
                    this.f.addAll(set);
                }
                this.m.f(j4, j6);
            }
            this.g = now;
            return true;
        } catch (IOException e2) {
            j40 j402 = this.k;
            j40.a aVar3 = j40.a.GENERIC_IO;
            Class<?> cls2 = q;
            j402.a(aVar3, cls2, v + e2.getMessage(), e2);
            return false;
        }
    }

    private w40.b q(String str, m40 m40) throws IOException {
        n();
        return this.i.d(str, m40);
    }

    private void r() {
        if (this.h.f(this.i.b() ? z60.a.EXTERNAL : z60.a.INTERNAL, this.b - this.m.b())) {
            this.d = this.a;
        } else {
            this.d = this.b;
        }
    }

    @Override // defpackage.b50
    public void a() {
        synchronized (this.o) {
            try {
                this.i.a();
                this.f.clear();
                this.e.c();
            } catch (IOException | NullPointerException e2) {
                j40 j40 = this.k;
                j40.a aVar = j40.a.EVICTION;
                Class<?> cls = q;
                j40.a(aVar, cls, C0201.m82(12966) + e2.getMessage(), e2);
            }
            this.m.e();
        }
    }

    @Override // defpackage.b50
    public h40 b(m40 m40) {
        h40 h40;
        c50 a2 = c50.a();
        a2.d(m40);
        try {
            synchronized (this.o) {
                List<String> b2 = n40.b(m40);
                int i2 = 0;
                String str = null;
                h40 = null;
                while (true) {
                    if (i2 >= b2.size()) {
                        break;
                    }
                    str = b2.get(i2);
                    a2.j(str);
                    h40 = this.i.f(str, m40);
                    if (h40 != null) {
                        break;
                    }
                    i2++;
                }
                if (h40 == null) {
                    this.e.a(a2);
                    this.f.remove(str);
                } else {
                    this.e.e(a2);
                    this.f.add(str);
                }
            }
            return h40;
        } catch (IOException e2) {
            this.k.a(j40.a.GENERIC_IO, q, C0201.m82(12967), e2);
            a2.h(e2);
            this.e.g(a2);
            return null;
        } finally {
            a2.b();
        }
    }

    @Override // defpackage.b50
    public boolean c(m40 m40) {
        synchronized (this.o) {
            List<String> b2 = n40.b(m40);
            for (int i2 = 0; i2 < b2.size(); i2++) {
                if (this.f.contains(b2.get(i2))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // defpackage.b50
    public void d(m40 m40) {
        synchronized (this.o) {
            try {
                List<String> b2 = n40.b(m40);
                for (int i2 = 0; i2 < b2.size(); i2++) {
                    String str = b2.get(i2);
                    this.i.remove(str);
                    this.f.remove(str);
                }
            } catch (IOException e2) {
                j40 j40 = this.k;
                j40.a aVar = j40.a.DELETE_FILE;
                Class<?> cls = q;
                j40.a(aVar, cls, C0201.m82(12968) + e2.getMessage(), e2);
            }
        }
    }

    @Override // defpackage.b50
    public boolean e(m40 m40) {
        synchronized (this.o) {
            if (c(m40)) {
                return true;
            }
            try {
                List<String> b2 = n40.b(m40);
                for (int i2 = 0; i2 < b2.size(); i2++) {
                    String str = b2.get(i2);
                    if (this.i.e(str, m40)) {
                        this.f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.b50
    public h40 f(m40 m40, s40 s40) throws IOException {
        String a2;
        c50 a3 = c50.a();
        a3.d(m40);
        this.e.h(a3);
        synchronized (this.o) {
            a2 = n40.a(m40);
        }
        a3.j(a2);
        try {
            w40.b q2 = q(a2, m40);
            try {
                q2.b(s40, m40);
                h40 k2 = k(q2, m40, a2);
                a3.i(k2.size());
                a3.f(this.m.b());
                this.e.f(a3);
                a3.b();
                return k2;
            } finally {
                if (!q2.a()) {
                    f60.e(q, C0201.m82(12970));
                }
            }
        } catch (IOException e2) {
            a3.h(e2);
            this.e.d(a3);
            f60.f(q, C0201.m82(12971), e2);
            throw e2;
        } catch (Throwable th) {
            a3.b();
            throw th;
        }
    }
}
