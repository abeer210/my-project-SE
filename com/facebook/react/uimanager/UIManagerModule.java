package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "UIManager")
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    private static final boolean DEBUG = w70.a().a(x70.d);
    public static final String NAME = null;
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final com.facebook.react.uimanager.events.d mEventDispatcher;
    private final List<t0> mListeners;
    private final f mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final o0 mUIImplementation;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final a1 mViewManagerRegistry;

    class a implements e {
        public a() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.e
        public String a(String str) {
            Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
            return map != null ? (String) map.get(C0201.m82(29147)) : str;
        }
    }

    class b extends GuardedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, int i, Object obj) {
            super(reactContext);
            this.a = i;
            this.b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.X(this.a, this.b);
        }
    }

    class c implements Runnable {
        public final /* synthetic */ UIManager a;
        public final /* synthetic */ int b;
        public final /* synthetic */ ReadableMap c;

        public c(UIManagerModule uIManagerModule, UIManager uIManager, int i, ReadableMap readableMap) {
            this.a = uIManager;
            this.b = i;
            this.c = readableMap;
        }

        public void run() {
            this.a.synchronouslyUpdateViewOnUIThread(this.b, this.c);
        }
    }

    class d extends GuardedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, int i, int i2, int i3) {
            super(reactContext);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.b0(this.a, this.b, this.c);
            UIManagerModule.this.mUIImplementation.n(-1);
        }
    }

    public interface e {
        String a(String str);
    }

    private class f implements ComponentCallbacks2 {
        private f(UIManagerModule uIManagerModule) {
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                d1.a().c();
            }
        }

        public /* synthetic */ f(UIManagerModule uIManagerModule, a aVar) {
            this(uIManagerModule);
        }
    }

    public interface g {
        List<String> a();

        ViewManager b(String str);
    }

    static {
        C0201.m83(UIManagerModule.class, 712);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, g gVar, int i) {
        this(reactApplicationContext, gVar, new p0(), i);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager R = str != null ? this.mUIImplementation.R(str) : null;
        if (R == null) {
            return null;
        }
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(21311));
        a2.b(C0201.m82(21312), R.getName());
        a2.b(C0201.m82(21313), Boolean.TRUE);
        a2.c();
        try {
            Map<String, Object> c2 = s0.c(R, null, null, null, this.mCustomDirectEvents);
            if (c2 != null) {
                return Arguments.makeNativeMap(c2);
            }
            com.facebook.systrace.b.b(0).c();
            return null;
        } finally {
            com.facebook.systrace.b.b(0).c();
        }
    }

    private static Map<String, Object> createConstants(g gVar) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(21314));
        a2.b(C0201.m82(21315), Boolean.TRUE);
        a2.c();
        try {
            return s0.a(gVar);
        } finally {
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    public void addUIBlock(n0 n0Var) {
        this.mUIImplementation.a(n0Var);
    }

    public void addUIManagerListener(t0 t0Var) {
        this.mListeners.add(t0Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = C0201.m82(21319) + i + C0201.m82(21320) + str + C0201.m82(21321) + readableMap;
            f60.b(C0201.m82(21322), str2);
            w70.a().c(x70.d, str2);
        }
        this.mUIImplementation.j(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.k();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.l(i, i2, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        UIManager d2 = q0.d(getReactApplicationContext(), zj0.a(i));
        if (d2 != null) {
            if (dynamic.getType() == ReadableType.Number) {
                d2.dispatchCommand(i, dynamic.asInt(), readableArray);
            } else if (dynamic.getType() == ReadableType.String) {
                d2.dispatchCommand(i, dynamic.asString(), readableArray);
            }
        }
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.p(i, (float) Math.round(q.b(readableArray.getDouble(0))), (float) Math.round(q.b(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return writableMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(s0.d());
    }

    public e getDirectEventNamesResolver() {
        return new a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(21323);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.q();
    }

    public o0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public a1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.bridge.JSIModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.B(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        a0 Q = this.mUIImplementation.Q(i);
        if (Q == null) {
            f60.A(C0201.m82(21325), C0201.m82(21324) + i);
            return;
        }
        Q.dirty();
        this.mUIImplementation.n(-1);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = C0201.m82(21326) + i + C0201.m82(21327) + readableArray + C0201.m82(21328) + readableArray2 + C0201.m82(21329) + readableArray3 + C0201.m82(21330) + readableArray4 + C0201.m82(21331) + readableArray5;
            f60.b(C0201.m82(21332), str);
            w70.a().c(x70.d, str);
        }
        this.mUIImplementation.u(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.v(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.w(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i, i2, callback, callback2);
    }

    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.z(i, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(21333));
        a2.a(C0201.m82(21334), i);
        a2.c();
        for (t0 t0Var : this.mListeners) {
            t0Var.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.n(i);
        } finally {
            com.facebook.systrace.a.g(0);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.A();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        d1.a().c();
        z0.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.D();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.E();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.F();
    }

    @ReactMethod
    @Deprecated
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService(C0201.m82(21335));
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    @Deprecated
    public void preComputeConstantsForViewManager(List<String> list) {
        r0 r0Var = new r0();
        for (String str : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str);
            if (computeConstantsForViewManager != null) {
                r0Var.put(str, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(r0Var);
    }

    public void prependUIBlock(n0 n0Var) {
        this.mUIImplementation.G(n0Var);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.H();
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.K(i);
    }

    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.N(i);
    }

    public void removeUIManagerListener(t0 t0Var) {
        this.mListeners.remove(t0Var);
    }

    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.O(i, i2);
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        return zj0.b(i) ? i : this.mUIImplementation.P(i);
    }

    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().V().w(i);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        int a2 = zj0.a(i);
        if (a2 == 2) {
            UIManager d2 = q0.d(getReactApplicationContext(), a2);
            if (d2 != null) {
                d2.sendAccessibilityEvent(i, i2);
                return;
            }
            return;
        }
        this.mUIImplementation.S(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            String str = C0201.m82(21336) + i + C0201.m82(21337) + readableArray;
            f60.b(C0201.m82(21338), str);
            w70.a().c(x70.d, str);
        }
        this.mUIImplementation.T(i, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.U(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.V(z);
    }

    public void setViewHierarchyUpdateDebugListener(ak0 ak0) {
        this.mUIImplementation.W(ak0);
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.Y(i, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        int a2 = zj0.a(i);
        if (a2 == 2) {
            UIManager d2 = q0.d(getReactApplicationContext(), a2);
            if (d2 != null) {
                d2.synchronouslyUpdateViewOnUIThread(i, readableMap);
                return;
            }
            return;
        }
        this.mUIImplementation.Z(i, new c0(readableMap));
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.a0(i, i2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new d(reactApplicationContext, i, i2, i3));
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        UIManager d2;
        if (DEBUG) {
            String str2 = C0201.m82(21339) + i + C0201.m82(21340) + str + C0201.m82(21341) + readableMap;
            f60.b(C0201.m82(21342), str2);
            w70.a().c(x70.d, str2);
        }
        int a2 = zj0.a(i);
        if (a2 == 2) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            if (reactApplicationContext.hasActiveCatalystInstance() && (d2 = q0.d(reactApplicationContext, a2)) != null) {
                reactApplicationContext.runOnUiQueueThread(new c(this, d2, i, readableMap));
                return;
            }
            return;
        }
        this.mUIImplementation.d0(i, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.f0(i, i2, callback);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new p0(), i);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        com.facebook.systrace.a.c(0, C0201.m82(21318));
        int a2 = z.a();
        this.mUIImplementation.I(t, a2, new k0(getReactApplicationContext(), t.getContext(), ((y) t).getSurfaceID()));
        com.facebook.systrace.a.g(0);
        return a2;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mUIImplementation.m(i, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.d getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, g gVar, p0 p0Var, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new f(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        c.h(reactApplicationContext);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.d(reactApplicationContext);
        this.mModuleConstants = createConstants(gVar);
        this.mCustomDirectEvents = r0.c();
        a1 a1Var = new a1(gVar);
        this.mViewManagerRegistry = a1Var;
        this.mUIImplementation = p0Var.a(reactApplicationContext, a1Var, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        b.AbstractC0053b a2 = com.facebook.systrace.b.a(0, C0201.m82(21316));
        a2.b(C0201.m82(21317), Boolean.FALSE);
        a2.c();
        try {
            return s0.b(list, map, map2);
        } finally {
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, p0 p0Var, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new f(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        c.h(reactApplicationContext);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.d(reactApplicationContext);
        HashMap b2 = com.facebook.react.common.e.b();
        this.mCustomDirectEvents = b2;
        this.mModuleConstants = createConstants(list, null, b2);
        a1 a1Var = new a1(list);
        this.mViewManagerRegistry = a1Var;
        this.mUIImplementation = p0Var.a(reactApplicationContext, a1Var, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
