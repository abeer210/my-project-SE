package com.swmansion.reanimated;

import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.uimanager.o0;
import com.facebook.react.uimanager.u0;
import com.swmansion.reanimated.nodes.EventNode;
import com.swmansion.reanimated.nodes.f;
import com.swmansion.reanimated.nodes.h;
import com.swmansion.reanimated.nodes.i;
import com.swmansion.reanimated.nodes.k;
import com.swmansion.reanimated.nodes.l;
import com.swmansion.reanimated.nodes.m;
import com.swmansion.reanimated.nodes.n;
import com.swmansion.reanimated.nodes.o;
import com.swmansion.reanimated.nodes.p;
import com.swmansion.reanimated.nodes.q;
import com.swmansion.reanimated.nodes.r;
import com.swmansion.reanimated.nodes.s;
import com.swmansion.reanimated.nodes.t;
import com.swmansion.reanimated.nodes.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* compiled from: NodesManager */
public class b implements e {
    private static final Double t = Double.valueOf(0.0d);
    private final SparseArray<m> a = new SparseArray<>();
    private final Map<String, EventNode> b = new HashMap();
    private final o0 c;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter d;
    private final g e;
    private final com.facebook.react.uimanager.e f;
    private final UIManagerModule.e g;
    private final AtomicBoolean h = new AtomicBoolean();
    private final n i;
    private final ReactContext j;
    private final UIManagerModule k;
    private List<d> l = new ArrayList();
    private ConcurrentLinkedQueue<com.facebook.react.uimanager.events.c> m = new ConcurrentLinkedQueue<>();
    private boolean n;
    public double o;
    public final d p;
    public Set<String> q = Collections.emptySet();
    public Set<String> r = Collections.emptySet();
    private Queue<c> s = new LinkedList();

    /* compiled from: NodesManager */
    class a extends com.facebook.react.uimanager.e {
        public a(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.e
        public void c(long j) {
            b.this.s(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.swmansion.reanimated.b$b  reason: collision with other inner class name */
    /* compiled from: NodesManager */
    public class C0130b extends GuardedRunnable {
        public final /* synthetic */ Queue a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0130b(ReactContext reactContext, Queue queue) {
            super(reactContext);
            this.a = queue;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            boolean a2 = u0.a(b.this.c);
            while (!this.a.isEmpty()) {
                c cVar = (c) this.a.remove();
                a0 Q = b.this.c.Q(cVar.a);
                if (Q != null) {
                    b.this.k.updateView(cVar.a, Q.getViewClass(), cVar.b);
                }
            }
            if (a2) {
                b.this.c.n(-1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: NodesManager */
    public final class c {
        public int a;
        public WritableMap b;

        public c(b bVar, int i, WritableMap writableMap) {
            this.a = i;
            this.b = writableMap;
        }
    }

    /* compiled from: NodesManager */
    public interface d {
        void b();
    }

    public b(ReactContext reactContext) {
        this.j = reactContext;
        this.k = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.p = new d();
        this.c = this.k.getUIImplementation();
        this.g = this.k.getDirectEventNamesResolver();
        this.d = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.e = g.i();
        this.f = new a(reactContext);
        this.i = new n(this);
        this.k.getEventDispatcher().s(this);
    }

    private void A() {
        if (this.h.getAndSet(false)) {
            this.e.o(g.c.NATIVE_ANIMATED_MODULE, this.f);
        }
    }

    private void r(com.facebook.react.uimanager.events.c cVar) {
        if (!this.b.isEmpty()) {
            String a2 = this.g.a(cVar.f());
            int i2 = cVar.i();
            EventNode eventNode = this.b.get(i2 + a2);
            if (eventNode != null) {
                cVar.c(eventNode);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s(long j2) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        this.o = d2 / 1000000.0d;
        while (!this.m.isEmpty()) {
            r(this.m.poll());
        }
        if (!this.l.isEmpty()) {
            List<d> list = this.l;
            this.l = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).b();
            }
        }
        if (this.n) {
            m.runUpdates(this.p);
        }
        if (!this.s.isEmpty()) {
            Queue<c> queue = this.s;
            this.s = new LinkedList();
            ReactContext reactContext = this.j;
            reactContext.runOnNativeModulesQueueThread(new C0130b(reactContext, queue));
        }
        this.h.set(false);
        this.n = false;
        if (!this.l.isEmpty() || !this.m.isEmpty()) {
            z();
        }
    }

    private void z() {
        if (!this.h.getAndSet(true)) {
            this.e.m(g.c.NATIVE_ANIMATED_MODULE, this.f);
        }
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(com.facebook.react.uimanager.events.c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            r(cVar);
            return;
        }
        this.m.offer(cVar);
        z();
    }

    public void e(int i2, String str, int i3) {
        String str2 = i2 + str;
        EventNode eventNode = (EventNode) this.a.get(i3);
        if (eventNode == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28992) + i3 + C0201.m82(28993));
        } else if (!this.b.containsKey(str2)) {
            this.b.put(str2, eventNode);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28991));
        }
    }

    public void f(Set<String> set, Set<String> set2) {
        this.r = set;
        this.q = set2;
    }

    public void g(int i2, int i3) {
        m mVar = this.a.get(i2);
        if (mVar == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28995) + i2 + C0201.m82(28996));
        } else if (mVar instanceof q) {
            ((q) mVar).d(i3);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28994) + q.class.getName());
        }
    }

    public void h(int i2, int i3) {
        m mVar = this.a.get(i2);
        m mVar2 = this.a.get(i3);
        if (mVar2 != null) {
            mVar.addChild(mVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(28997) + i3 + C0201.m82(28998));
    }

    public void i(int i2, ReadableMap readableMap) {
        m mVar;
        if (this.a.get(i2) == null) {
            String string = readableMap.getString(C0201.m82(28999));
            if (C0201.m82(29000).equals(string)) {
                mVar = new q(i2, readableMap, this, this.c);
            } else if (C0201.m82(29001).equals(string)) {
                mVar = new s(i2, readableMap, this);
            } else if (C0201.m82(29002).equals(string)) {
                mVar = new t(i2, readableMap, this);
            } else if (C0201.m82(29003).equals(string)) {
                mVar = new u(i2, readableMap, this);
            } else if (C0201.m82(29004).equals(string)) {
                mVar = new com.swmansion.reanimated.nodes.c(i2, readableMap, this);
            } else if (C0201.m82(29005).equals(string)) {
                mVar = new h(i2, readableMap, this);
            } else if (C0201.m82(29006).equals(string)) {
                mVar = new o(i2, readableMap, this);
            } else if (C0201.m82(29007).equals(string)) {
                mVar = new r(i2, readableMap, this);
            } else if (C0201.m82(29008).equals(string)) {
                mVar = new i(i2, readableMap, this);
            } else if (C0201.m82(29009).equals(string)) {
                mVar = new com.swmansion.reanimated.nodes.e(i2, readableMap, this);
            } else if (C0201.m82(29010).equals(string)) {
                mVar = new f.a(i2, readableMap, this);
            } else if (C0201.m82(29011).equals(string)) {
                mVar = new f.b(i2, readableMap, this);
            } else if (C0201.m82(29012).equals(string)) {
                mVar = new f.c(i2, readableMap, this);
            } else if (C0201.m82(29013).equals(string)) {
                mVar = new l(i2, readableMap, this);
            } else if (C0201.m82(29014).equals(string)) {
                mVar = new com.swmansion.reanimated.nodes.b(i2, readableMap, this);
            } else if (C0201.m82(29015).equals(string)) {
                mVar = new EventNode(i2, readableMap, this);
            } else if (C0201.m82(29016).equals(string)) {
                mVar = new com.swmansion.reanimated.nodes.a(i2, readableMap, this);
            } else if (C0201.m82(29017).equals(string)) {
                mVar = new com.swmansion.reanimated.nodes.g(i2, readableMap, this);
            } else if (C0201.m82(29018).equals(string)) {
                mVar = new p(i2, readableMap, this);
            } else if (C0201.m82(29019).equals(string)) {
                mVar = new k(i2, readableMap, this);
            } else if (C0201.m82(29020).equals(string)) {
                mVar = new com.swmansion.reanimated.nodes.d(i2, readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(29021) + string);
            }
            this.a.put(i2, mVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(29022) + i2 + C0201.m82(29023));
    }

    public void j(int i2, String str, int i3) {
        this.b.remove(i2 + str);
    }

    public void k(int i2, int i3) {
        m mVar = this.a.get(i2);
        if (mVar == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(29025) + i2 + C0201.m82(29026));
        } else if (mVar instanceof q) {
            ((q) mVar).e(i3);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(29024) + q.class.getName());
        }
    }

    public void l(int i2, int i3) {
        m mVar = this.a.get(i2);
        m mVar2 = this.a.get(i3);
        if (mVar2 != null) {
            mVar.removeChild(mVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(29027) + i3 + C0201.m82(29028));
    }

    public void m(int i2) {
        this.a.remove(i2);
    }

    public void n(int i2, WritableMap writableMap) {
        this.s.add(new c(this, i2, writableMap));
    }

    public <T extends m> T o(int i2, Class<T> cls) {
        T t2 = (T) this.a.get(i2);
        if (t2 == null) {
            if (cls == m.class || cls == u.class) {
                return this.i;
            }
            throw new IllegalArgumentException(C0201.m82(29029) + i2 + C0201.m82(29030) + cls + C0201.m82(29031));
        } else if (cls.isInstance(t2)) {
            return t2;
        } else {
            throw new IllegalArgumentException(C0201.m82(29032) + i2 + C0201.m82(29033) + t2.getClass() + C0201.m82(29034) + cls);
        }
    }

    public Object p(int i2) {
        m mVar = this.a.get(i2);
        if (mVar != null) {
            return mVar.value();
        }
        return t;
    }

    public void q(int i2, Callback callback) {
        callback.invoke(this.a.get(i2).value());
    }

    public void t() {
        if (this.h.get()) {
            A();
            this.h.set(true);
        }
    }

    public void u() {
        if (this.h.getAndSet(false)) {
            z();
        }
    }

    public void v(d dVar) {
        this.l.add(dVar);
        z();
    }

    public void w() {
        this.n = true;
        z();
    }

    public void x(String str, WritableMap writableMap) {
        this.d.emit(str, writableMap);
    }

    public void y(int i2, Double d2) {
        m mVar = this.a.get(i2);
        if (mVar != null) {
            ((u) mVar).c(d2);
        }
    }
}
