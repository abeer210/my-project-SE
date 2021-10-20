package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.y;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: si0  reason: default package */
/* compiled from: ReactInstanceManager */
public class si0 {
    public static final String A = null;
    private static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final Set<y> a = Collections.synchronizedSet(new HashSet());
    private volatile LifecycleState b;
    private j c;
    private volatile Thread d;
    private final JavaScriptExecutorFactory e;
    private final JSBundleLoader f;
    private final String g;
    private final List<wi0> h;
    private final gj0 i;
    private final boolean j;
    private final NotThreadSafeBridgeIdleDebugListener k;
    private final Object l = new Object();
    private volatile ReactContext m;
    private final Context n;
    private com.facebook.react.modules.core.b o;
    private Activity p;
    private final Collection<k> q = Collections.synchronizedList(new ArrayList());
    private volatile boolean r = false;
    private volatile Boolean s = Boolean.FALSE;
    private final fi0 t;
    private final NativeModuleCallExceptionHandler u;
    private final JSIModulePackage v;
    private List<ViewManager> w;

    /* renamed from: si0$a */
    /* compiled from: ReactInstanceManager */
    class a implements com.facebook.react.modules.core.b {
        public a() {
        }

        @Override // com.facebook.react.modules.core.b
        public void c() {
            si0.this.B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$b */
    /* compiled from: ReactInstanceManager */
    public class b implements com.facebook.react.devsupport.e {
        public b(si0 si0) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$c */
    /* compiled from: ReactInstanceManager */
    public class c implements hj0 {
        public c(si0 si0, qj0 qj0) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$d */
    /* compiled from: ReactInstanceManager */
    public class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;

        public d(View view) {
            this.a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            si0.this.i.h(true);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$e */
    /* compiled from: ReactInstanceManager */
    public class e implements Runnable {
        public final /* synthetic */ j a;

        /* renamed from: si0$e$a */
        /* compiled from: ReactInstanceManager */
        class a implements Runnable {
            public a() {
            }

            public void run() {
                if (si0.this.c != null) {
                    si0 si0 = si0.this;
                    si0.X(si0.c);
                    si0.this.c = null;
                }
            }
        }

        /* renamed from: si0$e$b */
        /* compiled from: ReactInstanceManager */
        class b implements Runnable {
            public final /* synthetic */ ReactApplicationContext a;

            public b(ReactApplicationContext reactApplicationContext) {
                this.a = reactApplicationContext;
            }

            public void run() {
                try {
                    si0.this.Y(this.a);
                } catch (Exception e) {
                    f60.j(C0201.m82(24216), C0201.m82(24217), e);
                    si0.this.i.handleException(e);
                }
            }
        }

        public e(j jVar) {
            this.a = jVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000c */
        /* JADX WARNING: Removed duplicated region for block: B:2:0x000c A[LOOP:0: B:2:0x000c->B:16:0x000c, LOOP_START, SYNTHETIC] */
        public void run() {
            ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
            synchronized (si0.this.s) {
                while (si0.this.s.booleanValue()) {
                    si0.this.s.wait();
                }
            }
            si0.this.r = true;
            try {
                Process.setThreadPriority(-4);
                ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                ReactApplicationContext q = si0.this.q(this.a.b().create(), this.a.a());
                si0.this.d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                a aVar = new a();
                q.runOnNativeModulesQueueThread(new b(q));
                UiThreadUtil.runOnUiThread(aVar);
            } catch (Exception e) {
                si0.this.i.handleException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$f */
    /* compiled from: ReactInstanceManager */
    public class f implements Runnable {
        public final /* synthetic */ k[] a;
        public final /* synthetic */ ReactApplicationContext b;

        public f(si0 si0, k[] kVarArr, ReactApplicationContext reactApplicationContext) {
            this.a = kVarArr;
            this.b = reactApplicationContext;
        }

        public void run() {
            k[] kVarArr = this.a;
            for (k kVar : kVarArr) {
                if (kVar != null) {
                    kVar.a(this.b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$g */
    /* compiled from: ReactInstanceManager */
    public class g implements Runnable {
        public g(si0 si0) {
        }

        public void run() {
            Process.setThreadPriority(0);
            ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, C0201.m82(8839));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$h */
    /* compiled from: ReactInstanceManager */
    public class h implements Runnable {
        public h(si0 si0) {
        }

        public void run() {
            Process.setThreadPriority(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: si0$i */
    /* compiled from: ReactInstanceManager */
    public class i implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ y b;

        public i(si0 si0, int i, y yVar) {
            this.a = i;
            this.b = yVar;
        }

        public void run() {
            com.facebook.systrace.a.e(0, C0201.m82(9440), this.a);
            this.b.e(101);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: si0$j */
    /* compiled from: ReactInstanceManager */
    public class j {
        private final JavaScriptExecutorFactory a;
        private final JSBundleLoader b;

        public j(si0 si0, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            yh0.c(javaScriptExecutorFactory);
            this.a = javaScriptExecutorFactory;
            yh0.c(jSBundleLoader);
            this.b = jSBundleLoader;
        }

        public JSBundleLoader a() {
            return this.b;
        }

        public JavaScriptExecutorFactory b() {
            return this.a;
        }
    }

    /* renamed from: si0$k */
    /* compiled from: ReactInstanceManager */
    public interface k {
        void a(ReactContext reactContext);
    }

    static {
        C0201.m83(si0.class, 42);
    }

    public si0(Context context, Activity activity, com.facebook.react.modules.core.b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<wi0> list, boolean z2, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, p0 p0Var, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, com.facebook.react.devsupport.f fVar, boolean z3, ej0 ej0, int i2, int i3, JSIModulePackage jSIModulePackage, Map<String, Object> map) {
        f60.b(x, z);
        A(context);
        com.facebook.react.uimanager.c.h(context);
        this.n = context;
        this.p = activity;
        this.o = bVar;
        this.e = javaScriptExecutorFactory;
        this.f = jSBundleLoader;
        this.g = str;
        this.h = new ArrayList();
        this.j = z2;
        com.facebook.systrace.a.c(0, A);
        this.i = com.facebook.react.devsupport.a.a(context, p(), this.g, z2, fVar, ej0, i2, map);
        com.facebook.systrace.a.g(0);
        this.k = notThreadSafeBridgeIdleDebugListener;
        this.b = lifecycleState;
        this.t = new fi0(context);
        this.u = nativeModuleCallExceptionHandler;
        synchronized (this.h) {
            w70.a().c(x70.a, y);
            this.h.add(new bi0(this, new a(), p0Var, z3, i3));
            if (this.j) {
                this.h.add(new ci0());
            }
            this.h.addAll(list);
        }
        this.v = jSIModulePackage;
        com.facebook.react.modules.core.g.j();
        if (this.j) {
            this.i.o();
        }
    }

    public static void A(Context context) {
        SoLoader.g(context, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void B() {
        UiThreadUtil.assertOnUiThread();
        com.facebook.react.modules.core.b bVar = this.o;
        if (bVar != null) {
            bVar.c();
        }
    }

    private synchronized void C() {
        if (this.b == LifecycleState.RESUMED) {
            F(true);
        }
    }

    private synchronized void D() {
        ReactContext v2 = v();
        if (v2 != null) {
            if (this.b == LifecycleState.RESUMED) {
                v2.onHostPause();
                this.b = LifecycleState.BEFORE_RESUME;
            }
            if (this.b == LifecycleState.BEFORE_RESUME) {
                v2.onHostDestroy();
            }
        }
        this.b = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void E() {
        ReactContext v2 = v();
        if (v2 != null) {
            if (this.b == LifecycleState.BEFORE_CREATE) {
                v2.onHostResume(this.p);
                v2.onHostPause();
            } else if (this.b == LifecycleState.RESUMED) {
                v2.onHostPause();
            }
        }
        this.b = LifecycleState.BEFORE_RESUME;
    }

    private synchronized void F(boolean z2) {
        ReactContext v2 = v();
        if (v2 != null && (z2 || this.b == LifecycleState.BEFORE_RESUME || this.b == LifecycleState.BEFORE_CREATE)) {
            v2.onHostResume(this.p);
        }
        this.b = LifecycleState.RESUMED;
    }

    private void Q(wi0 wi0, gi0 gi0) {
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(13163));
        a2.b(C0201.m82(13164), wi0.getClass().getSimpleName());
        a2.c();
        boolean z2 = wi0 instanceof yi0;
        if (z2) {
            ((yi0) wi0).a();
        }
        gi0.b(wi0);
        if (z2) {
            ((yi0) wi0).b();
        }
        com.facebook.systrace.b.b(0).c();
    }

    private NativeModuleRegistry R(ReactApplicationContext reactApplicationContext, List<wi0> list, boolean z2) {
        gi0 gi0 = new gi0(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.h) {
            for (wi0 wi0 : list) {
                if (!z2 || !this.h.contains(wi0)) {
                    com.facebook.systrace.a.c(0, C0201.m82(13165));
                    if (z2) {
                        try {
                            this.h.add(wi0);
                        } catch (Throwable th) {
                            com.facebook.systrace.a.g(0);
                            throw th;
                        }
                    }
                    Q(wi0, gi0);
                    com.facebook.systrace.a.g(0);
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        com.facebook.systrace.a.c(0, C0201.m82(13166));
        try {
            return gi0.a();
        } finally {
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void T(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        f60.b(C0201.m82(13167), C0201.m82(13168));
        UiThreadUtil.assertOnUiThread();
        j jVar = new j(this, javaScriptExecutorFactory, jSBundleLoader);
        if (this.d == null) {
            X(jVar);
        } else {
            this.c = jVar;
        }
    }

    private void U() {
        f60.b(x, C0201.m82(13169));
        w70.a().c(x70.a, C0201.m82(13170));
        T(this.e, this.f);
    }

    private void V() {
        f60.b(x, C0201.m82(13171));
        w70.a().c(x70.a, C0201.m82(13172));
        UiThreadUtil.assertOnUiThread();
        if (this.j && this.g != null) {
            qj0 m2 = this.i.m();
            if (!com.facebook.systrace.a.h(0)) {
                if (this.f == null) {
                    this.i.f();
                    return;
                } else {
                    this.i.s(new c(this, m2));
                    return;
                }
            }
        }
        U();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void X(j jVar) {
        f60.b(C0201.m82(13173), C0201.m82(13174));
        UiThreadUtil.assertOnUiThread();
        synchronized (this.a) {
            synchronized (this.l) {
                if (this.m != null) {
                    a0(this.m);
                    this.m = null;
                }
            }
        }
        this.d = new Thread(null, new e(jVar), C0201.m82(13175));
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.d.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Y(ReactApplicationContext reactApplicationContext) {
        f60.b(C0201.m82(13176), C0201.m82(13177));
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        com.facebook.systrace.a.c(0, C0201.m82(13178));
        synchronized (this.a) {
            synchronized (this.l) {
                yh0.c(reactApplicationContext);
                this.m = reactApplicationContext;
            }
            CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
            yh0.c(catalystInstance);
            CatalystInstance catalystInstance2 = catalystInstance;
            catalystInstance2.initialize();
            this.i.e(reactApplicationContext);
            this.t.a(catalystInstance2);
            C();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (y yVar : this.a) {
                m(yVar);
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        UiThreadUtil.runOnUiThread(new f(this, (k[]) this.q.toArray(new k[this.q.size()]), reactApplicationContext));
        com.facebook.systrace.a.g(0);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new g(this));
        reactApplicationContext.runOnNativeModulesQueueThread(new h(this));
    }

    private void a0(ReactContext reactContext) {
        f60.b(C0201.m82(13179), C0201.m82(13180));
        UiThreadUtil.assertOnUiThread();
        if (this.b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.a) {
            for (y yVar : this.a) {
                o(yVar);
            }
        }
        this.t.c(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.i.q(reactContext);
    }

    private void m(y yVar) {
        WritableMap writableMap;
        f60.i(C0201.m82(13181), C0201.m82(13182));
        com.facebook.systrace.a.c(0, C0201.m82(13183));
        UIManager d2 = q0.d(this.m, yVar.getUIManagerType());
        if (d2 != null) {
            Bundle appProperties = yVar.getAppProperties();
            ViewGroup rootViewGroup = yVar.getRootViewGroup();
            if (appProperties == null) {
                writableMap = new WritableNativeMap();
            } else {
                writableMap = Arguments.fromBundle(appProperties);
            }
            int addRootView = d2.addRootView(rootViewGroup, writableMap, yVar.getInitialUITemplate());
            yVar.setRootViewTag(addRootView);
            if (yVar.getUIManagerType() == 2) {
                d2.updateRootLayoutSpecs(addRootView, yVar.getWidthMeasureSpec(), yVar.getHeightMeasureSpec());
                yVar.setShouldLogContentAppeared(true);
            } else {
                yVar.h();
            }
            com.facebook.systrace.a.a(0, C0201.m82(13184), addRootView);
            UiThreadUtil.runOnUiThread(new i(this, addRootView, yVar));
            com.facebook.systrace.a.g(0);
            return;
        }
        throw new IllegalStateException(C0201.m82(13185));
    }

    public static ti0 n() {
        return new ti0();
    }

    private void o(y yVar) {
        yVar.getRootViewGroup().removeAllViews();
        yVar.getRootViewGroup().setId(-1);
    }

    private com.facebook.react.devsupport.e p() {
        return new b(this);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private ReactApplicationContext q(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        String r0 = C0201.m82(13186);
        f60.b(r0, C0201.m82(13187));
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.n);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.u;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.i;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(R(reactApplicationContext, this.h, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        com.facebook.systrace.a.c(0, C0201.m82(13188));
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            reactApplicationContext.initializeWithInstance(build);
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(13189));
            sb.append(this.v != null ? C0201.m82(13190) : C0201.m82(13191));
            f60.i(r0, sb.toString());
            JSIModulePackage jSIModulePackage = this.v;
            String r4 = C0201.m82(13192);
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0201.m82(13193));
                sb2.append(!dj0.a ? C0201.m82(13194) : r4);
                f60.i(r0, sb2.toString());
                if (dj0.a) {
                    JSIModule jSIModule = build.getJSIModule(JSIModuleType.TurboModuleManager);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(C0201.m82(13195));
                    sb3.append(jSIModule == null ? C0201.m82(13196) : C0201.m82(13197));
                    f60.i(r0, sb3.toString());
                    build.setTurboModuleManager(jSIModule);
                    TurboModuleRegistry turboModuleRegistry = (TurboModuleRegistry) jSIModule;
                    for (String str : turboModuleRegistry.a()) {
                        turboModuleRegistry.b(str);
                    }
                }
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.k;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (com.facebook.systrace.a.h(0)) {
                build.setGlobalVariable(C0201.m82(13198), r4);
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            com.facebook.systrace.a.c(0, C0201.m82(13199));
            build.runJSBundle();
            com.facebook.systrace.a.g(0);
            return reactApplicationContext;
        } catch (Throwable th) {
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    private void u(y yVar, CatalystInstance catalystInstance) {
        f60.b(C0201.m82(13200), C0201.m82(13201));
        UiThreadUtil.assertOnUiThread();
        if (yVar.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(yVar.getRootViewTag());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(yVar.getRootViewTag());
        }
    }

    public void G(Activity activity, int i2, int i3, Intent intent) {
        ReactContext v2 = v();
        if (v2 != null) {
            v2.onActivityResult(activity, i2, i3, intent);
        }
    }

    public void H() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.m;
        if (reactContext == null) {
            f60.A(x, C0201.m82(13202));
            B();
            return;
        }
        ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
    }

    public void I() {
        UiThreadUtil.assertOnUiThread();
        if (this.j) {
            this.i.h(false);
        }
        D();
        this.p = null;
    }

    public void J(Activity activity) {
        if (activity == this.p) {
            I();
        }
    }

    public void K() {
        UiThreadUtil.assertOnUiThread();
        this.o = null;
        if (this.j) {
            this.i.h(false);
        }
        E();
    }

    public void L(Activity activity) {
        yh0.c(this.p);
        boolean z2 = activity == this.p;
        yh0.b(z2, C0201.m82(13203) + this.p.getClass().getSimpleName() + C0201.m82(13204) + activity.getClass().getSimpleName());
        K();
    }

    public void M(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.p = activity;
        if (this.j) {
            View decorView = activity.getWindow().getDecorView();
            if (!k3.M(decorView)) {
                decorView.addOnAttachStateChangeListener(new d(decorView));
            } else {
                this.i.h(true);
            }
        }
        F(false);
    }

    public void N(Activity activity, com.facebook.react.modules.core.b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.o = bVar;
        M(activity);
    }

    public void O(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext v2 = v();
        if (v2 == null) {
            f60.A(x, C0201.m82(13205));
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (C0201.m82(13206).equals(action) || C0201.m82(13207).equals(action))) {
            ((DeviceEventManagerModule) v2.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        v2.onNewIntent(this.p, intent);
    }

    public void P(boolean z2) {
        UiThreadUtil.assertOnUiThread();
        ReactContext v2 = v();
        if (v2 != null) {
            v2.onWindowFocusChange(z2);
        }
    }

    public void S() {
        yh0.b(this.r, C0201.m82(13208));
        V();
    }

    public void W(k kVar) {
        this.q.remove(kVar);
    }

    public void Z() {
        UiThreadUtil.assertOnUiThread();
        this.i.p();
    }

    public void k(k kVar) {
        this.q.add(kVar);
    }

    public void l(y yVar) {
        UiThreadUtil.assertOnUiThread();
        this.a.add(yVar);
        o(yVar);
        ReactContext v2 = v();
        if (this.d == null && v2 != null) {
            m(yVar);
        }
    }

    public void r() {
        f60.b(x, C0201.m82(13209));
        UiThreadUtil.assertOnUiThread();
        if (!this.r) {
            this.r = true;
            V();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r6.h.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r4 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r4 instanceof defpackage.bj0) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4 = ((defpackage.bj0) r4).a(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r6.h;
     */
    public ViewManager s(String str) {
        synchronized (this.l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) v();
            if (reactApplicationContext != null) {
                if (!reactApplicationContext.hasActiveCatalystInstance()) {
                }
            }
            return null;
        }
    }

    public void t(y yVar) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.a) {
            if (this.a.contains(yVar)) {
                ReactContext v2 = v();
                this.a.remove(yVar);
                if (v2 != null && v2.hasActiveCatalystInstance()) {
                    u(yVar, v2.getCatalystInstance());
                }
            }
        }
    }

    public ReactContext v() {
        ReactContext reactContext;
        synchronized (this.l) {
            reactContext = this.m;
        }
        return reactContext;
    }

    public gj0 w() {
        return this.i;
    }

    public List<ViewManager> x(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        com.facebook.systrace.a.c(0, C0201.m82(13210));
        try {
            if (this.w == null) {
                synchronized (this.h) {
                    if (this.w == null) {
                        this.w = new ArrayList();
                        for (wi0 wi0 : this.h) {
                            this.w.addAll(wi0.createViewManagers(reactApplicationContext));
                        }
                        list = this.w;
                    }
                }
                return list;
            }
            list = this.w;
            return list;
        } finally {
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = new java.util.HashSet();
        r5 = r11.h.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r5.hasNext() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r6 = r5.next();
        r7 = com.facebook.systrace.b.a(0, vigqyno.C0201.m82(13212));
        r7.b(vigqyno.C0201.m82(13213), r6.getClass().getSimpleName());
        r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if ((r6 instanceof defpackage.bj0) == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        r6 = ((defpackage.bj0) r6).b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (r6 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r0.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        com.facebook.systrace.b.b(0).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        com.facebook.systrace.a.g(0);
        r1 = new java.util.ArrayList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r11.h;
     */
    public List<String> y() {
        com.facebook.systrace.a.c(0, C0201.m82(13211));
        synchronized (this.l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) v();
            if (reactApplicationContext != null) {
                if (!reactApplicationContext.hasActiveCatalystInstance()) {
                }
            }
            return null;
        }
    }

    public boolean z() {
        return this.r;
    }
}
