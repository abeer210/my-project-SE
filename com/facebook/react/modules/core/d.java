package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.h;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* compiled from: JavaTimerManager */
public class d {
    private final ReactApplicationContext a;
    private final c b;
    private final g c;
    private final gj0 d;
    private final Object e = new Object();
    private final Object f = new Object();
    private final PriorityQueue<e> g;
    private final SparseArray<e> h;
    private final AtomicBoolean i = new AtomicBoolean(true);
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final f k = new f(this, null);
    private final C0042d l = new C0042d(this, null);
    private c m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    /* access modifiers changed from: package-private */
    /* compiled from: JavaTimerManager */
    public class a implements Comparator<e> {
        public a(d dVar) {
        }

        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            long j = eVar.d - eVar2.d;
            if (j == 0) {
                return 0;
            }
            return j < 0 ? -1 : 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: JavaTimerManager */
    public class b implements Runnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public void run() {
            synchronized (d.this.f) {
                if (this.a) {
                    d.this.C();
                } else {
                    d.this.o();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: JavaTimerManager */
    public class c implements Runnable {
        private volatile boolean a = false;
        private final long b;

        public c(long j) {
            this.b = j;
        }

        public void a() {
            this.a = true;
        }

        public void run() {
            boolean z;
            if (!this.a) {
                long c2 = h.c() - (this.b / 1000000);
                long a2 = h.a() - c2;
                if (16.666666f - ((float) c2) >= 1.0f) {
                    synchronized (d.this.f) {
                        z = d.this.p;
                    }
                    if (z) {
                        d.this.b.callIdleCallbacks((double) a2);
                    }
                    d.this.m = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.d$d  reason: collision with other inner class name */
    /* compiled from: JavaTimerManager */
    public class C0042d extends a.AbstractC0040a {
        private C0042d() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0040a
        public void a(long j) {
            if (!d.this.i.get() || d.this.j.get()) {
                if (d.this.m != null) {
                    d.this.m.a();
                }
                d dVar = d.this;
                dVar.m = new c(j);
                d.this.a.runOnJSQueueThread(d.this.m);
                d.this.c.m(g.c.IDLE_EVENT, this);
            }
        }

        public /* synthetic */ C0042d(d dVar, a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: JavaTimerManager */
    public static class e {
        private final int a;
        private final boolean b;
        private final int c;
        private long d;

        public /* synthetic */ e(int i, long j, int i2, boolean z, a aVar) {
            this(i, j, i2, z);
        }

        private e(int i, long j, int i2, boolean z) {
            this.a = i;
            this.d = j;
            this.c = i2;
            this.b = z;
        }
    }

    public d(ReactApplicationContext reactApplicationContext, c cVar, g gVar, gj0 gj0) {
        this.a = reactApplicationContext;
        this.b = cVar;
        this.c = gVar;
        this.d = gj0;
        this.g = new PriorityQueue<>(11, new a(this));
        this.h = new SparseArray<>();
    }

    private void B() {
        if (!this.n) {
            this.c.m(g.c.TIMERS_EVENTS, this.k);
            this.n = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void C() {
        if (!this.o) {
            this.c.m(g.c.IDLE_EVENT, this.l);
            this.o = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o() {
        if (this.o) {
            this.c.o(g.c.IDLE_EVENT, this.l);
            this.o = false;
        }
    }

    private void p() {
        lj0 d2 = lj0.d(this.a);
        if (this.n && this.i.get() && !d2.e()) {
            this.c.o(g.c.TIMERS_EVENTS, this.k);
            this.n = false;
        }
    }

    private static boolean s(e eVar, long j2) {
        return !eVar.b && ((long) eVar.c) < j2;
    }

    private void t() {
        if (this.i.get() && !this.j.get()) {
            p();
        }
    }

    private void u() {
        synchronized (this.f) {
            if (this.p) {
                C();
            }
        }
    }

    public void A() {
        p();
        o();
    }

    @zh0
    public void createTimer(int i2, long j2, boolean z) {
        e eVar = new e(i2, (h.b() / 1000000) + j2, (int) j2, z, null);
        synchronized (this.e) {
            this.g.add(eVar);
            this.h.put(i2, eVar);
        }
    }

    @zh0
    public void deleteTimer(int i2) {
        synchronized (this.e) {
            e eVar = this.h.get(i2);
            if (eVar != null) {
                this.h.remove(i2);
                this.g.remove(eVar);
            }
        }
    }

    public void q(int i2, int i3, double d2, boolean z) {
        long a2 = h.a();
        long j2 = (long) d2;
        if (this.d.b() && Math.abs(j2 - a2) > 60000) {
            this.b.emitTimeDriftWarning(C0201.m82(24795));
        }
        long max = Math.max(0L, (j2 - a2) + ((long) i3));
        if (i3 != 0 || z) {
            createTimer(i2, max, z);
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i2);
        this.b.callTimers(createArray);
    }

    public boolean r(long j2) {
        synchronized (this.e) {
            e peek = this.g.peek();
            if (peek == null) {
                return false;
            }
            if (s(peek, j2)) {
                return true;
            }
            Iterator<e> it = this.g.iterator();
            while (it.hasNext()) {
                if (s(it.next(), j2)) {
                    return true;
                }
            }
            return false;
        }
    }

    @zh0
    public void setSendIdleEvents(boolean z) {
        synchronized (this.f) {
            this.p = z;
        }
        UiThreadUtil.runOnUiThread(new b(z));
    }

    public void v(int i2) {
        if (!lj0.d(this.a).e()) {
            this.j.set(false);
            p();
            t();
        }
    }

    public void w(int i2) {
        if (!this.j.getAndSet(true)) {
            B();
            u();
        }
    }

    public void x() {
        p();
        t();
    }

    public void y() {
        this.i.set(true);
        p();
        t();
    }

    public void z() {
        this.i.set(false);
        B();
        u();
    }

    /* access modifiers changed from: private */
    /* compiled from: JavaTimerManager */
    public class f extends a.AbstractC0040a {
        private WritableArray b;

        private f() {
            this.b = null;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0040a
        public void a(long j) {
            if (!d.this.i.get() || d.this.j.get()) {
                long j2 = j / 1000000;
                synchronized (d.this.e) {
                    while (!d.this.g.isEmpty() && ((e) d.this.g.peek()).d < j2) {
                        e eVar = (e) d.this.g.poll();
                        if (this.b == null) {
                            this.b = Arguments.createArray();
                        }
                        this.b.pushInt(eVar.a);
                        if (eVar.b) {
                            eVar.d = ((long) eVar.c) + j2;
                            d.this.g.add(eVar);
                        } else {
                            d.this.h.remove(eVar.a);
                        }
                    }
                }
                if (this.b != null) {
                    d.this.b.callTimers(this.b);
                    this.b = null;
                }
                d.this.c.m(g.c.TIMERS_EVENTS, this);
            }
        }

        public /* synthetic */ f(d dVar, a aVar) {
            this();
        }
    }
}
