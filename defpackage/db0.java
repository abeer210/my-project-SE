package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import vigqyno.C0201;

/* renamed from: db0  reason: default package */
/* compiled from: DefaultBitmapFramePreparer */
public class db0 implements cb0 {
    private static final Class<?> f = db0.class;
    private final oc0 a;
    private final xa0 b;
    private final Bitmap.Config c;
    private final ExecutorService d;
    private final SparseArray<Runnable> e = new SparseArray<>();

    /* renamed from: db0$a */
    /* compiled from: DefaultBitmapFramePreparer */
    private class a implements Runnable {
        private final wa0 a;
        private final ra0 b;
        private final int c;
        private final int d;

        public a(ra0 ra0, wa0 wa0, int i, int i2) {
            this.b = ra0;
            this.a = wa0;
            this.c = i;
            this.d = i2;
        }

        private boolean a(int i, int i2) {
            v60<Bitmap> v60;
            int i3 = 2;
            if (i2 == 1) {
                v60 = this.a.a(i, this.b.e(), this.b.a());
            } else if (i2 != 2) {
                v60.s(null);
                return false;
            } else {
                try {
                    v60 = db0.this.a.b(this.b.e(), this.b.a(), db0.this.c);
                    i3 = -1;
                } catch (RuntimeException e2) {
                    f60.x(db0.f, C0201.m82(37264), e2);
                    v60.s(null);
                    return false;
                } catch (Throwable th) {
                    v60.s(null);
                    throw th;
                }
            }
            boolean b2 = b(i, v60, i2);
            v60.s(v60);
            return (b2 || i3 == -1) ? b2 : a(i, i3);
        }

        private boolean b(int i, v60<Bitmap> v60, int i2) {
            if (!v60.z(v60) || !db0.this.b.b(i, v60.w())) {
                return false;
            }
            f60.q(db0.f, C0201.m82(37265), Integer.valueOf(this.c));
            synchronized (db0.this.e) {
                this.a.b(this.c, v60, i2);
            }
            return true;
        }

        public void run() {
            try {
                if (this.a.c(this.c)) {
                    f60.q(db0.f, C0201.m82(37266), Integer.valueOf(this.c));
                    synchronized (db0.this.e) {
                        db0.this.e.remove(this.d);
                    }
                    return;
                }
                if (a(this.c, 1)) {
                    f60.q(db0.f, C0201.m82(37267), Integer.valueOf(this.c));
                } else {
                    f60.g(db0.f, C0201.m82(37268), Integer.valueOf(this.c));
                }
                synchronized (db0.this.e) {
                    db0.this.e.remove(this.d);
                }
            } catch (Throwable th) {
                synchronized (db0.this.e) {
                    db0.this.e.remove(this.d);
                    throw th;
                }
            }
        }
    }

    public db0(oc0 oc0, xa0 xa0, Bitmap.Config config, ExecutorService executorService) {
        this.a = oc0;
        this.b = xa0;
        this.c = config;
        this.d = executorService;
    }

    private static int g(ra0 ra0, int i) {
        return (ra0.hashCode() * 31) + i;
    }

    @Override // defpackage.cb0
    public boolean a(wa0 wa0, ra0 ra0, int i) {
        int g = g(ra0, i);
        synchronized (this.e) {
            if (this.e.get(g) != null) {
                f60.q(f, C0201.m82(20968), Integer.valueOf(i));
                return true;
            } else if (wa0.c(i)) {
                f60.q(f, C0201.m82(20969), Integer.valueOf(i));
                return true;
            } else {
                a aVar = new a(ra0, wa0, i, g);
                this.e.put(g, aVar);
                this.d.execute(aVar);
                return true;
            }
        }
    }
}
