package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: lj0  reason: default package */
/* compiled from: HeadlessJsTaskContext */
public class lj0 {
    private static final WeakHashMap<ReactContext, lj0> h = new WeakHashMap<>();
    private final WeakReference<ReactContext> a;
    private final Set<mj0> b = new CopyOnWriteArraySet();
    private final AtomicInteger c = new AtomicInteger(0);
    private final Handler d = new Handler();
    private final Set<Integer> e = new CopyOnWriteArraySet();
    private final Map<Integer, kj0> f = new ConcurrentHashMap();
    private final SparseArray<Runnable> g = new SparseArray<>();

    /* access modifiers changed from: package-private */
    /* renamed from: lj0$a */
    /* compiled from: HeadlessJsTaskContext */
    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public void run() {
            for (mj0 mj0 : lj0.this.b) {
                mj0.onHeadlessJsTaskFinish(this.a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lj0$b */
    /* compiled from: HeadlessJsTaskContext */
    public class b implements Runnable {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        public void run() {
            lj0.this.c(this.a);
        }
    }

    private lj0(ReactContext reactContext) {
        this.a = new WeakReference<>(reactContext);
    }

    public static lj0 d(ReactContext reactContext) {
        lj0 lj0 = h.get(reactContext);
        if (lj0 != null) {
            return lj0;
        }
        lj0 lj02 = new lj0(reactContext);
        h.put(reactContext, lj02);
        return lj02;
    }

    private void h(int i) {
        Runnable runnable = this.g.get(i);
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.g.remove(i);
        }
    }

    private void j(int i, long j) {
        b bVar = new b(i);
        this.g.append(i, bVar);
        this.d.postDelayed(bVar, j);
    }

    private synchronized void l(kj0 kj0, int i) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.a.get();
        yh0.d(reactContext, C0201.m82(21436));
        ReactContext reactContext2 = reactContext;
        if (reactContext2.getLifecycleState() == LifecycleState.RESUMED) {
            if (!kj0.e()) {
                throw new IllegalStateException(C0201.m82(21437) + kj0.c() + C0201.m82(21438));
            }
        }
        this.e.add(Integer.valueOf(i));
        this.f.put(Integer.valueOf(i), new kj0(kj0));
        if (reactContext2.hasActiveCatalystInstance()) {
            ((AppRegistry) reactContext2.getJSModule(AppRegistry.class)).startHeadlessTask(i, kj0.c(), kj0.a());
        } else {
            ReactSoftException.logSoftException(C0201.m82(21439), new RuntimeException(C0201.m82(21440)));
        }
        if (kj0.d() > 0) {
            j(i, kj0.d());
        }
        for (mj0 mj0 : this.b) {
            mj0.onHeadlessJsTaskStart(i);
        }
    }

    public void b(mj0 mj0) {
        this.b.add(mj0);
    }

    public synchronized void c(int i) {
        boolean remove = this.e.remove(Integer.valueOf(i));
        yh0.b(remove, C0201.m82(21441) + i + C0201.m82(21442));
        boolean z = this.f.remove(Integer.valueOf(i)) != null;
        yh0.b(z, C0201.m82(21443) + i + C0201.m82(21444));
        h(i);
        UiThreadUtil.runOnUiThread(new a(i));
    }

    public boolean e() {
        return this.e.size() > 0;
    }

    public synchronized boolean f(int i) {
        return this.e.contains(Integer.valueOf(i));
    }

    public void g(mj0 mj0) {
        this.b.remove(mj0);
    }

    public synchronized boolean i(int i) {
        kj0 kj0 = this.f.get(Integer.valueOf(i));
        boolean z = kj0 != null;
        yh0.b(z, C0201.m82(21445) + i + C0201.m82(21446));
        nj0 b2 = kj0.b();
        if (b2.b()) {
            h(i);
            kj0.c();
            kj0.a();
            kj0.d();
            kj0.e();
            b2.a();
            throw null;
        }
        return false;
    }

    public synchronized int k(kj0 kj0) {
        int incrementAndGet;
        incrementAndGet = this.c.incrementAndGet();
        l(kj0, incrementAndGet);
        return incrementAndGet;
    }
}
