package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;
import vigqyno.C0201;

/* compiled from: ReactChoreographer */
public class g {
    private static g g;
    private volatile a a;
    private final d b;
    private final Object c = new Object();
    private final ArrayDeque<a.AbstractC0040a>[] d;
    private int e;
    private boolean f;

    /* access modifiers changed from: package-private */
    /* compiled from: ReactChoreographer */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            g.this.n();
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ReactChoreographer */
    public class b implements Runnable {
        public final /* synthetic */ Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        public void run() {
            synchronized (g.class) {
                if (g.this.a == null) {
                    g.this.a = a.d();
                }
            }
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* compiled from: ReactChoreographer */
    public enum c {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        private final int a;

        private c(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ReactChoreographer */
    public class d extends a.AbstractC0040a {
        private d() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0040a
        public void a(long j) {
            synchronized (g.this.c) {
                g.this.f = false;
                for (int i = 0; i < g.this.d.length; i++) {
                    ArrayDeque arrayDeque = g.this.d[i];
                    int size = arrayDeque.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a.AbstractC0040a aVar = (a.AbstractC0040a) arrayDeque.pollFirst();
                        if (aVar != null) {
                            aVar.a(j);
                            g.g(g.this);
                        } else {
                            f60.i(C0201.m82(36121), C0201.m82(36122));
                        }
                    }
                }
                g.this.l();
            }
        }

        public /* synthetic */ d(g gVar, a aVar) {
            this();
        }
    }

    private g() {
        int i = 0;
        this.e = 0;
        this.f = false;
        this.b = new d(this, null);
        this.d = new ArrayDeque[c.values().length];
        while (true) {
            ArrayDeque<a.AbstractC0040a>[] arrayDequeArr = this.d;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            } else {
                k(null);
                return;
            }
        }
    }

    public static /* synthetic */ int g(g gVar) {
        int i = gVar.e;
        gVar.e = i - 1;
        return i;
    }

    public static g i() {
        yh0.d(g, C0201.m82(24336));
        return g;
    }

    public static void j() {
        if (g == null) {
            g = new g();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l() {
        yh0.a(this.e >= 0);
        if (this.e == 0 && this.f) {
            if (this.a != null) {
                this.a.f(this.b);
            }
            this.f = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n() {
        this.a.e(this.b);
        this.f = true;
    }

    public void k(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new b(runnable));
    }

    public void m(c cVar, a.AbstractC0040a aVar) {
        synchronized (this.c) {
            this.d[cVar.b()].addLast(aVar);
            boolean z = true;
            int i = this.e + 1;
            this.e = i;
            if (i <= 0) {
                z = false;
            }
            yh0.a(z);
            if (!this.f) {
                if (this.a == null) {
                    k(new a());
                } else {
                    n();
                }
            }
        }
    }

    public void o(c cVar, a.AbstractC0040a aVar) {
        synchronized (this.c) {
            if (this.d[cVar.b()].removeFirstOccurrence(aVar)) {
                this.e--;
                l();
            } else {
                f60.i(C0201.m82(24337), C0201.m82(24338));
            }
        }
    }
}
