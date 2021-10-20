package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: cg0  reason: default package */
/* compiled from: JobScheduler */
public class cg0 {
    private final Executor a;
    private final d b;
    private final Runnable c = new a();
    private final Runnable d = new b();
    private final int e;
    public af0 f = null;
    public int g = 0;
    public f h = f.IDLE;
    public long i = 0;
    public long j = 0;

    /* renamed from: cg0$a */
    /* compiled from: JobScheduler */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            cg0.this.d();
        }
    }

    /* renamed from: cg0$b */
    /* compiled from: JobScheduler */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            cg0.this.j();
        }
    }

    /* renamed from: cg0$c */
    /* compiled from: JobScheduler */
    static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            iArr[f.IDLE.ordinal()] = 1;
            a[f.QUEUED.ordinal()] = 2;
            a[f.RUNNING.ordinal()] = 3;
            try {
                a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: cg0$d */
    /* compiled from: JobScheduler */
    public interface d {
        void a(af0 af0, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cg0$e */
    /* compiled from: JobScheduler */
    public static class e {
        private static ScheduledExecutorService a;

        public static ScheduledExecutorService a() {
            if (a == null) {
                a = Executors.newSingleThreadScheduledExecutor();
            }
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cg0$f */
    /* compiled from: JobScheduler */
    public enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public cg0(Executor executor, d dVar, int i2) {
        this.a = executor;
        this.b = dVar;
        this.e = i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d() {
        af0 af0;
        int i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            af0 = this.f;
            i2 = this.g;
            this.f = null;
            this.g = 0;
            this.h = f.RUNNING;
            this.j = uptimeMillis;
        }
        try {
            if (i(af0, i2)) {
                this.b.a(af0, i2);
            }
        } finally {
            af0.h(af0);
            g();
        }
    }

    private void e(long j2) {
        if (j2 > 0) {
            e.a().schedule(this.d, j2, TimeUnit.MILLISECONDS);
        } else {
            this.d.run();
        }
    }

    private void g() {
        boolean z;
        long j2;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.h == f.RUNNING_AND_PENDING) {
                j2 = Math.max(this.j + ((long) this.e), uptimeMillis);
                z = true;
                this.i = uptimeMillis;
                this.h = f.QUEUED;
            } else {
                this.h = f.IDLE;
                j2 = 0;
                z = false;
            }
        }
        if (z) {
            e(j2 - uptimeMillis);
        }
    }

    private static boolean i(af0 af0, int i2) {
        return jf0.e(i2) || jf0.n(i2, 4) || af0.F(af0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j() {
        this.a.execute(this.c);
    }

    public void c() {
        af0 af0;
        synchronized (this) {
            af0 = this.f;
            this.f = null;
            this.g = 0;
        }
        af0.h(af0);
    }

    public synchronized long f() {
        return this.j - this.i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        e(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        return true;
     */
    public boolean h() {
        long j2;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!i(this.f, this.g)) {
                return false;
            }
            int i2 = c.a[this.h.ordinal()];
            if (i2 != 1) {
                if (i2 == 3) {
                    this.h = f.RUNNING_AND_PENDING;
                }
                j2 = 0;
            } else {
                j2 = Math.max(this.j + ((long) this.e), uptimeMillis);
                this.i = uptimeMillis;
                this.h = f.QUEUED;
                z = true;
            }
        }
    }

    public boolean k(af0 af0, int i2) {
        af0 af02;
        if (!i(af0, i2)) {
            return false;
        }
        synchronized (this) {
            af02 = this.f;
            this.f = af0.c(af0);
            this.g = i2;
        }
        af0.h(af02);
        return true;
    }
}
