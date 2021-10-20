package defpackage;

import com.dynatrace.android.agent.b;
import com.dynatrace.android.agent.j;
import com.dynatrace.android.agent.u;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* renamed from: k30  reason: default package */
/* compiled from: DatabaseWriteQueue */
public final class k30 extends Thread {
    private static final String b = (u.b + C0201.m82(24742));
    private static volatile k30 c;
    private static AtomicBoolean d = new AtomicBoolean(false);
    private BlockingQueue<a> a = new LinkedBlockingQueue();

    /* renamed from: k30$a */
    /* compiled from: DatabaseWriteQueue */
    public static class a {
        public String a;
        public String b;
        public g30 c;
        public int d;
        public long e;
        public int f;

        public a(String str, String str2, g30 g30, int i, long j, int i2) {
            this.a = str;
            this.b = str2;
            this.c = g30;
            this.d = i;
            this.e = j;
            this.f = i2;
        }
    }

    private k30() {
        setName(b);
    }

    public static k30 c() {
        if (c == null) {
            synchronized (k30.class) {
                if (c == null) {
                    c = new k30();
                }
            }
        }
        return c;
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public synchronized void b() {
        LinkedList<a> linkedList = new LinkedList<>();
        a poll = this.a.poll();
        while (poll != null) {
            linkedList.add(poll);
            poll = this.a.poll();
        }
        if (!linkedList.isEmpty()) {
            j.b.j(linkedList, b.d().e());
        }
    }

    public void d() {
        d.set(false);
        synchronized (k30.class) {
            c = null;
        }
        if (isAlive()) {
            try {
                join(1000);
            } catch (InterruptedException e) {
                if (u.c) {
                    s30.t(b, e.toString());
                }
            }
            if (isAlive() && u.c) {
                String str = b;
                s30.r(str, C0201.m82(24743) + getName());
            }
        }
    }

    public void run() {
        if (u.c) {
            s30.r(b, C0201.m82(24744));
        }
        while (d.get()) {
            try {
                Thread.sleep(250);
                b();
            } catch (Exception e) {
                if (u.c) {
                    s30.u(b, e.toString(), e);
                    return;
                }
                return;
            }
        }
    }

    public void start() {
        if (!d.get()) {
            d.set(true);
            super.start();
        }
    }
}
