package com.dynatrace.android.agent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ConnectionAttemptMonitor */
public final class i {
    private static final String h = (u.b + C0201.m82(3360));
    private long a;
    private long b;
    private Timer c;
    private boolean d;
    private boolean e;
    private AtomicBoolean f;
    private Date g;

    /* access modifiers changed from: private */
    /* compiled from: ConnectionAttemptMonitor */
    public class b extends TimerTask {
        private b() {
        }

        public void run() {
            synchronized (i.this) {
                i.this.f.set(true);
                i.this.k(i.this.d());
            }
        }
    }

    public i(int i) {
        if (i >= 1) {
            this.a = (long) (i + 1);
            this.f = new AtomicBoolean(true);
            this.b = 0;
            k(d());
            return;
        }
        throw new IllegalArgumentException(C0201.m82(3361));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Date d() {
        Date date = new Date(x.a() + this.b);
        long j = this.a - 1;
        this.a = j;
        if (j > 0) {
            this.b = 60000;
            return date;
        }
        if (j == 0) {
            this.b = 0;
        } else {
            long j2 = this.b;
            if (j2 == 1920000) {
                this.b = 3420000;
                return date;
            } else if (j2 != 3420000 && j2 > 0) {
                this.b = j2 * 2;
                return date;
            }
        }
        return null;
    }

    public synchronized void c() {
        if (this.c != null) {
            this.c.cancel();
            this.c.purge();
            this.c = null;
        }
    }

    public boolean e() {
        return this.f.getAndSet(false);
    }

    public synchronized boolean f() {
        if (this.f.get()) {
            return true;
        }
        if (this.e || this.c != null || (this.a > 0 && this.b < 3420000)) {
            return true;
        }
        return false;
    }

    public synchronized void g(boolean z, boolean z2) {
        this.e = z;
        this.f.set(false);
        if (z) {
            if (u.c) {
                s30.r(h, C0201.m82(3362));
            }
            this.d = true;
            this.a = -1;
            this.b = 0;
            c();
        } else {
            if (u.c) {
                s30.r(h, C0201.m82(3363));
            }
            if (this.d && this.c == null && this.b == 0) {
                this.b = 60000;
                k(d());
            } else if (z2 && this.c == null) {
                k(d());
            }
        }
    }

    public synchronized void h(int i) {
        this.e = false;
        this.f.set(false);
        if (this.d && this.c == null && this.b == 0) {
            this.b = 60000;
        }
        if (!(this.c == null && d() == null)) {
            k(new Date(x.a() + ((long) (i * C0188.f18))));
        }
    }

    public boolean i() {
        return this.d && !this.e && this.b > 0;
    }

    public synchronized void j() {
        k(this.g);
    }

    public synchronized void k(Date date) {
        c();
        this.g = date;
        if (date != null) {
            Timer timer = new Timer(h);
            this.c = timer;
            try {
                timer.schedule(new b(), this.g);
                if (u.c) {
                    String str = h;
                    s30.r(str, C0201.m82(3364) + this.g);
                }
            } catch (Exception e2) {
                if (u.c) {
                    String str2 = h;
                    s30.r(str2, C0201.m82(3365) + e2.toString());
                }
            }
        }
    }

    public synchronized void l() {
        this.e = false;
        this.f.set(false);
        if (u.c) {
            s30.r(h, C0201.m82(3366));
        }
        c();
    }
}
