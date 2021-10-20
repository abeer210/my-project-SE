package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.e;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* compiled from: EventDispatcher */
public class d implements LifecycleEventListener {
    private static final Comparator<c> q = new a();
    private final Object a = new Object();
    private final Object b = new Object();
    private final ReactApplicationContext c;
    private final LongSparseArray<Integer> d = new LongSparseArray<>();
    private final Map<String, Short> e = e.b();
    private final c f = new c(this, null);
    private final ArrayList<c> g = new ArrayList<>();
    private final ArrayList<e> h = new ArrayList<>();
    private final List<a> i = new ArrayList();
    private final C0048d j = new C0048d(this, null);
    private final AtomicInteger k = new AtomicInteger();
    private c[] l = new c[16];
    private int m = 0;
    private volatile ReactEventEmitter n;
    private short o = 0;
    private volatile boolean p = false;

    /* compiled from: EventDispatcher */
    static class a implements Comparator<c> {
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if (cVar == null && cVar2 == null) {
                return 0;
            }
            if (cVar == null) {
                return -1;
            }
            if (cVar2 == null) {
                return 1;
            }
            long g = cVar.g() - cVar2.g();
            if (g == 0) {
                return 0;
            }
            return g < 0 ? -1 : 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: EventDispatcher */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            d.this.D();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: EventDispatcher */
    public class c implements Runnable {
        private c() {
        }

        public void run() {
            com.facebook.systrace.a.c(0, C0201.m82(31365));
            try {
                com.facebook.systrace.a.d(0, C0201.m82(31366), d.this.k.getAndIncrement());
                d.this.p = false;
                yh0.c(d.this.n);
                synchronized (d.this.b) {
                    if (d.this.m > 0) {
                        if (d.this.m > 1) {
                            Arrays.sort(d.this.l, 0, d.this.m, d.q);
                        }
                        for (int i = 0; i < d.this.m; i++) {
                            c cVar = d.this.l[i];
                            if (cVar != null) {
                                com.facebook.systrace.a.d(0, cVar.f(), cVar.h());
                                cVar.c(d.this.n);
                                cVar.d();
                            }
                        }
                        d.this.t();
                        d.this.d.clear();
                    }
                }
                for (a aVar : d.this.i) {
                    aVar.a();
                }
            } finally {
                com.facebook.systrace.a.g(0);
            }
        }

        public /* synthetic */ c(d dVar, a aVar) {
            this();
        }
    }

    public d(ReactApplicationContext reactApplicationContext) {
        this.c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.n = new ReactEventEmitter(this.c);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void D() {
        UiThreadUtil.assertOnUiThread();
        this.j.f();
    }

    private void r(c cVar) {
        int i2 = this.m;
        c[] cVarArr = this.l;
        if (i2 == cVarArr.length) {
            this.l = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        c[] cVarArr2 = this.l;
        int i3 = this.m;
        this.m = i3 + 1;
        cVarArr2[i3] = cVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void t() {
        Arrays.fill(this.l, 0, this.m, (Object) null);
        this.m = 0;
    }

    private long w(int i2, String str, short s) {
        short s2;
        Short sh = this.e.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.o;
            this.o = (short) (s3 + 1);
            this.e.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return x(i2, s2, s);
    }

    private static long x(int i2, short s, short s2) {
        return ((((long) s) & 65535) << 32) | ((long) i2) | ((((long) s2) & 65535) << 48);
    }

    private void y() {
        if (this.n != null) {
            this.j.d();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void z() {
        synchronized (this.a) {
            synchronized (this.b) {
                for (int i2 = 0; i2 < this.g.size(); i2++) {
                    c cVar = this.g.get(i2);
                    if (!cVar.a()) {
                        r(cVar);
                    } else {
                        long w = w(cVar.i(), cVar.f(), cVar.e());
                        Integer num = this.d.get(w);
                        c cVar2 = null;
                        if (num == null) {
                            this.d.put(w, Integer.valueOf(this.m));
                        } else {
                            c cVar3 = this.l[num.intValue()];
                            c b2 = cVar.b(cVar3);
                            if (b2 != cVar3) {
                                this.d.put(w, Integer.valueOf(this.m));
                                this.l[num.intValue()] = null;
                                cVar2 = cVar3;
                                cVar = b2;
                            } else {
                                cVar2 = cVar;
                                cVar = null;
                            }
                        }
                        if (cVar != null) {
                            r(cVar);
                        }
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                    }
                }
            }
            this.g.clear();
        }
    }

    public void A() {
        UiThreadUtil.runOnUiThread(new b());
    }

    public void B(int i2, RCTEventEmitter rCTEventEmitter) {
        this.n.register(i2, rCTEventEmitter);
    }

    public void C(e eVar) {
        this.h.remove(eVar);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        D();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        D();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        y();
    }

    public void q(a aVar) {
        this.i.add(aVar);
    }

    public void s(e eVar) {
        this.h.add(eVar);
    }

    public void u() {
        y();
    }

    public void v(c cVar) {
        yh0.b(cVar.k(), C0201.m82(24685));
        Iterator<e> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
        synchronized (this.a) {
            this.g.add(cVar);
            com.facebook.systrace.a.j(0, cVar.f(), cVar.h());
        }
        y();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.events.d$d  reason: collision with other inner class name */
    /* compiled from: EventDispatcher */
    public class C0048d extends a.AbstractC0040a {
        private volatile boolean b;
        private boolean c;

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.react.uimanager.events.d$d$a */
        /* compiled from: EventDispatcher */
        public class a implements Runnable {
            public a() {
            }

            public void run() {
                C0048d.this.c();
            }
        }

        private C0048d() {
            this.b = false;
            this.c = false;
        }

        private void e() {
            g.i().m(g.c.TIMERS_EVENTS, d.this.j);
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0040a
        public void a(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.c) {
                this.b = false;
            } else {
                e();
            }
            String r0 = C0201.m82(31766);
            com.facebook.systrace.a.c(0, r0);
            try {
                d.this.z();
                if (!d.this.p) {
                    d.this.p = true;
                    com.facebook.systrace.a.j(0, r0, d.this.k.get());
                    d.this.c.runOnJSQueueThread(d.this.f);
                }
            } finally {
                com.facebook.systrace.a.g(0);
            }
        }

        public void c() {
            if (!this.b) {
                this.b = true;
                e();
            }
        }

        public void d() {
            if (!this.b) {
                if (d.this.c.isOnUiQueueThread()) {
                    c();
                } else {
                    d.this.c.runOnUiQueueThread(new a());
                }
            }
        }

        public void f() {
            this.c = true;
        }

        public /* synthetic */ C0048d(d dVar, a aVar) {
            this();
        }
    }
}
