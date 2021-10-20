package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.u;
import java.util.concurrent.BlockingQueue;
import vigqyno.C0201;

public final class l4 extends Thread {
    private final Object a = new Object();
    private final BlockingQueue<m4<?>> b;
    private final /* synthetic */ i4 c;

    public l4(i4 i4Var, String str, BlockingQueue<m4<?>> blockingQueue) {
        this.c = i4Var;
        u.k(str);
        u.k(blockingQueue);
        this.b = blockingQueue;
        setName(str);
    }

    private final void a(InterruptedException interruptedException) {
        this.c.e().H().a(String.valueOf(getName()).concat(C0201.m82(29076)), interruptedException);
    }

    public final void b() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        r1 = r7.c.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r7.c.j.release();
        r7.c.i.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r7 != r7.c.c) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        r7.c.c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r7 != r7.c.d) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r7.c.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        r7.c.e().E().d(vigqyno.C0201.m82(29077));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        return;
     */
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.c.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                m4<?> poll = this.b.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.b ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null && !(this.c.k)) {
                            try {
                                this.a.wait(30000);
                            } catch (InterruptedException e2) {
                                a(e2);
                            }
                        }
                    }
                    synchronized (this.c.i) {
                        if (this.b.peek() == null) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            synchronized (this.c.i) {
                this.c.j.release();
                this.c.i.notifyAll();
                if (this == this.c.c) {
                    this.c.c = null;
                } else if (this == this.c.d) {
                    this.c.d = null;
                } else {
                    this.c.e().E().d(C0201.m82(29078));
                }
                throw th;
            }
        }
    }
}
