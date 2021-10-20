package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.e;
import com.facebook.react.fabric.mounting.mountitems.f;
import com.facebook.react.fabric.mounting.mountitems.g;
import com.facebook.react.fabric.mounting.mountitems.h;
import com.facebook.react.fabric.mounting.mountitems.i;
import com.facebook.react.fabric.mounting.mountitems.j;
import com.facebook.react.fabric.mounting.mountitems.k;
import com.facebook.react.fabric.mounting.mountitems.l;
import com.facebook.react.fabric.mounting.mountitems.m;
import com.facebook.react.fabric.mounting.mountitems.n;
import com.facebook.react.fabric.mounting.mountitems.o;
import com.facebook.react.fabric.mounting.mountitems.p;
import com.facebook.react.fabric.mounting.mountitems.q;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

@SuppressLint({"MissingNativeLoadLibrary"})
/* compiled from: FabricUIManager */
public class c implements UIManager, LifecycleEventListener {
    public static final boolean B = (dj0.b || w70.a().a(x70.e));
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    private int A;
    private Binding a;
    private final ReactApplicationContext b;
    private final jj0 c;
    private final d d;
    private final ConcurrentHashMap<Integer, k0> e;
    private final EventBeatManager f;
    private final Object g;
    private final Object h;
    private final Object i;
    private boolean j;
    private int k;
    private List<com.facebook.react.fabric.mounting.mountitems.c> l;
    private List<g> m;
    private ArrayDeque<g> n;
    private final C0039c o;
    private volatile boolean p;
    private long q;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    /* compiled from: FabricUIManager */
    class a implements g {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        public a(c cVar, int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.g
        public void a(jj0 jj0) {
            jj0.m(this.a, this.b, this.c);
            throw null;
        }
    }

    /* compiled from: FabricUIManager */
    class b implements g {
        public b(c cVar) {
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.g
        public void a(jj0 jj0) {
            jj0.c();
            throw null;
        }
    }

    /* renamed from: com.facebook.react.fabric.c$c  reason: collision with other inner class name */
    /* compiled from: FabricUIManager */
    private class C0039c extends d {
        public void c() {
            throw null;
        }
    }

    static {
        C0201.m83(c.class, 52);
        b.a();
    }

    private void a(com.facebook.react.fabric.mounting.mountitems.c cVar) {
        if (dj0.f) {
            synchronized (this.g) {
                this.l.add(cVar);
            }
            return;
        }
        synchronized (this.h) {
            this.m.add(cVar);
        }
    }

    private boolean b() {
        String str = F;
        if (this.k == 0) {
            this.u = 0;
        }
        this.q = SystemClock.uptimeMillis();
        List<com.facebook.react.fabric.mounting.mountitems.c> e2 = e();
        List<g> c2 = c();
        if (c2 == null && e2 == null) {
            return false;
        }
        String str2 = H;
        if (e2 != null) {
            com.facebook.systrace.a.c(0, C + e2.size());
            for (com.facebook.react.fabric.mounting.mountitems.c cVar : e2) {
                if (B) {
                    f60.b(str2, I + cVar.toString());
                }
                try {
                    cVar.a(this.c);
                } catch (RetryableMountingLayerException e3) {
                    if (cVar.b() == 0) {
                        cVar.c();
                        a(cVar);
                    } else {
                        ReactSoftException.logSoftException(str2, new ReactNoCrashSoftException(str + cVar.toString(), e3));
                    }
                } catch (Throwable th) {
                    ReactSoftException.logSoftException(str2, new RuntimeException(str + cVar.toString(), th));
                }
            }
            com.facebook.systrace.a.g(0);
        }
        ArrayDeque<g> d2 = d();
        if (d2 != null) {
            com.facebook.systrace.a.c(0, J + d2.size());
            while (!d2.isEmpty()) {
                d2.pollFirst().a(this.c);
            }
            com.facebook.systrace.a.g(0);
        }
        if (c2 != null) {
            com.facebook.systrace.a.c(0, s + c2.size());
            long uptimeMillis = SystemClock.uptimeMillis();
            for (g gVar : c2) {
                if (B) {
                    for (String str3 : gVar.toString().split(E)) {
                        f60.b(str2, r + str3);
                    }
                }
                gVar.a(this.c);
            }
            this.u += SystemClock.uptimeMillis() - uptimeMillis;
        }
        com.facebook.systrace.a.g(0);
        return true;
    }

    private List<g> c() {
        synchronized (this.h) {
            List<g> list = this.m;
            if (list.isEmpty()) {
                return null;
            }
            this.m = new ArrayList();
            return list;
        }
    }

    @zh0
    private g createBatchMountItem(g[] gVarArr, int i2, int i3) {
        return new BatchMountItem(gVarArr, i2, i3);
    }

    @zh0
    private g createMountItem(String str, ReadableMap readableMap, Object obj, int i2, int i3, boolean z2) {
        String a2 = a.a(str);
        k0 k0Var = this.e.get(Integer.valueOf(i2));
        if (k0Var != null) {
            return new com.facebook.react.fabric.mounting.mountitems.a(k0Var, i2, i3, a2, readableMap, (j0) obj, z2);
        }
        throw new IllegalArgumentException(C0201.m82(17332) + i2);
    }

    private ArrayDeque<g> d() {
        synchronized (this.i) {
            ArrayDeque<g> arrayDeque = this.n;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            this.n = new ArrayDeque<>(250);
            return arrayDeque;
        }
    }

    @zh0
    private g deleteMountItem(int i2) {
        return new com.facebook.react.fabric.mounting.mountitems.b(i2);
    }

    private List<com.facebook.react.fabric.mounting.mountitems.c> e() {
        if (!dj0.f) {
            return null;
        }
        synchronized (this.g) {
            List<com.facebook.react.fabric.mounting.mountitems.c> list = this.l;
            if (list.isEmpty()) {
                return null;
            }
            this.l = new ArrayList();
            return list;
        }
    }

    private void h() {
        if (!this.j) {
            try {
                boolean b2 = b();
                this.j = false;
                int i2 = this.k;
                if (i2 < 10 && b2) {
                    if (i2 > 2) {
                        ReactSoftException.logSoftException(C0201.m82(17335), new ReactNoCrashSoftException(C0201.m82(17333) + this.k + C0201.m82(17334)));
                    }
                    this.k++;
                    h();
                }
                this.k = 0;
            } catch (Throwable th) {
                this.j = false;
                throw th;
            }
        }
    }

    @zh0
    private g insertMountItem(int i2, int i3, int i4) {
        return new f(i2, i3, i4);
    }

    @zh0
    private long measure(int i2, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, float f3, float f4, float f5) {
        return measure(i2, str, readableMap, readableMap2, readableMap3, f2, f3, f4, f5, null);
    }

    @zh0
    private void preallocateView(int i2, int i3, String str, ReadableMap readableMap, Object obj, boolean z2) {
        k0 k0Var = this.e.get(Integer.valueOf(i2));
        String a2 = a.a(str);
        synchronized (this.i) {
            this.n.add(new h(k0Var, i2, i3, a2, readableMap, (j0) obj, z2));
        }
    }

    @zh0
    private g removeDeleteMultiMountItem(int[] iArr) {
        return new i(iArr);
    }

    @zh0
    private g removeMountItem(int i2, int i3, int i4) {
        return new j(i2, i3, i4);
    }

    @zh0
    private void scheduleMountItem(g gVar, int i2, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        boolean z2 = gVar instanceof BatchMountItem;
        if (z2) {
            this.w = j2;
            this.x = j6 - j5;
            this.z = j8 - j7;
            this.y = SystemClock.uptimeMillis() - j7;
            this.v = SystemClock.uptimeMillis();
        }
        synchronized (this.h) {
            this.m.add(gVar);
        }
        if (UiThreadUtil.isOnUiThread()) {
            h();
        }
        if (z2) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i2, j2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i2, j7);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i2, j8);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i2, j3);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i2, j4);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i2, j5);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i2, j6);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i2);
        }
    }

    @zh0
    private g updateEventEmitterMountItem(int i2, Object obj) {
        return new l(i2, (EventEmitterWrapper) obj);
    }

    @zh0
    private g updateLayoutMountItem(int i2, int i3, int i4, int i5, int i6, int i7) {
        return new m(i2, i3, i4, i5, i6, i7);
    }

    @zh0
    private g updateLocalDataMountItem(int i2, ReadableMap readableMap) {
        return new n(i2, readableMap);
    }

    @zh0
    private g updatePaddingMountItem(int i2, int i3, int i4, int i5, int i6) {
        return new o(i2, i3, i4, i5, i6);
    }

    @zh0
    private g updatePropsMountItem(int i2, ReadableMap readableMap) {
        return new p(i2, readableMap);
    }

    @zh0
    private g updateStateMountItem(int i2, Object obj) {
        return new q(i2, (j0) obj);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t2, WritableMap writableMap, String str) {
        int a2 = z.a();
        new k0(this.b, t2.getContext(), ((y) t2).getSurfaceID());
        this.c.a(a2, t2);
        throw null;
    }

    @zh0
    public void clearJSResponder() {
        synchronized (this.h) {
            this.m.add(new b(this));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i2, int i3, ReadableArray readableArray) {
        a(new com.facebook.react.fabric.mounting.mountitems.d(i2, i3, readableArray));
    }

    /* renamed from: f */
    public d getEventDispatcher() {
        return this.d;
    }

    public void g(int i2, String str, WritableMap writableMap) {
        this.c.f(i2);
        throw null;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(17336), Long.valueOf(this.w));
        hashMap.put(C0201.m82(17337), Long.valueOf(this.x));
        hashMap.put(C0201.m82(17338), Long.valueOf(this.v));
        hashMap.put(C0201.m82(17339), Long.valueOf(this.q));
        hashMap.put(C0201.m82(17340), Long.valueOf(this.u));
        hashMap.put(C0201.m82(17341), Long.valueOf(this.y));
        hashMap.put(C0201.m82(17342), Long.valueOf(this.z));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
        this.d.B(2, new FabricEventEmitter(this));
        this.d.q(this.f);
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        String r0 = C0201.m82(17343);
        f60.n(r0, C0201.m82(17344));
        if (this.p) {
            ReactSoftException.logSoftException(r0, new IllegalStateException(C0201.m82(17345)));
            return;
        }
        this.p = true;
        this.o.c();
        throw null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        com.facebook.react.modules.core.g.i().o(g.c.DISPATCH_UI, this.o);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        com.facebook.react.modules.core.g.i().m(g.c.DISPATCH_UI, this.o);
    }

    @zh0
    public void onRequestEventBeat() {
        this.d.u();
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i2, int i3) {
        synchronized (this.h) {
            this.m.add(new k(i2, i3));
        }
    }

    @zh0
    public void setJSResponder(int i2, int i3, boolean z2) {
        synchronized (this.h) {
            this.m.add(new a(this, i2, i3, z2));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i2, ReadableMap readableMap) {
        int i3;
        Throwable th;
        String str;
        Exception e2;
        ReactMarkerConstants reactMarkerConstants;
        String str2 = t;
        UiThreadUtil.assertOnUiThread();
        long uptimeMillis = SystemClock.uptimeMillis();
        int i4 = this.A;
        this.A = i4 + 1;
        String str3 = null;
        try {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i4);
            if (B) {
                f60.c(str2, D, Integer.valueOf(i2));
            }
            str = str2;
            try {
                scheduleMountItem(updatePropsMountItem(i2, readableMap), i4, uptimeMillis, 0, 0, 0, 0, 0, 0);
                reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
                i3 = i4;
                str3 = null;
            } catch (Exception e3) {
                e2 = e3;
                i3 = i4;
                str3 = null;
                try {
                    ReactSoftException.logSoftException(str, new ReactNoCrashSoftException(G, e2));
                    reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
                    ReactMarker.logFabricMarker(reactMarkerConstants, str3, i3);
                } catch (Throwable th2) {
                    th = th2;
                    ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, str3, i3);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i3 = i4;
                str3 = null;
                ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, str3, i3);
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            i3 = i4;
            str = str2;
            ReactSoftException.logSoftException(str, new ReactNoCrashSoftException(G, e2));
            reactMarkerConstants = ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END;
            ReactMarker.logFabricMarker(reactMarkerConstants, str3, i3);
        } catch (Throwable th4) {
            th = th4;
            i3 = i4;
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, str3, i3);
            throw th;
        }
        ReactMarker.logFabricMarker(reactMarkerConstants, str3, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4 = B;
        String r1 = C0201.m82(17346);
        if (z4) {
            f60.b(r1, C0201.m82(17347));
        }
        k0 k0Var = this.e.get(Integer.valueOf(i2));
        if (k0Var != null) {
            boolean g2 = com.facebook.react.modules.i18nmanager.a.d().g(k0Var);
            z2 = com.facebook.react.modules.i18nmanager.a.d().b(k0Var);
            z3 = g2;
        } else {
            ReactSoftException.logSoftException(r1, new IllegalStateException(C0201.m82(17348) + i2));
            z3 = false;
            z2 = false;
        }
        this.a.setConstraints(i2, ij0.b(i3), ij0.a(i3), ij0.b(i4), ij0.a(i4), z3, z2);
    }

    @zh0
    private long measure(int i2, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, float f3, float f4, float f5, int[] iArr) {
        k0 k0Var;
        if (i2 < 0) {
            k0Var = this.b;
        } else {
            k0Var = this.e.get(Integer.valueOf(i2));
        }
        this.c.g(k0Var, str, readableMap, readableMap2, readableMap3, ij0.d(f2, f3), ij0.c(f2, f3), ij0.d(f4, f5), ij0.c(f4, f5), iArr);
        throw null;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i2, String str, ReadableArray readableArray) {
        a(new e(i2, str, readableArray));
    }
}
