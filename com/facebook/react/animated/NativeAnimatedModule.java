package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

@pj0(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, t0 {
    public static final String NAME = null;
    private final com.facebook.react.uimanager.e mAnimatedFrameCallback;
    private l mNodesManager;
    private ArrayList<v> mOperations = new ArrayList<>();
    private ArrayList<v> mPreOperations = new ArrayList<>();
    private final com.facebook.react.modules.core.g mReactChoreographer = com.facebook.react.modules.core.g.i();

    class a implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ double b;

        public a(NativeAnimatedModule nativeAnimatedModule, int i, double d) {
            this.a = i;
            this.b = d;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.r(this.a, this.b);
        }
    }

    class b implements v {
        public final /* synthetic */ int a;

        public b(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.k(this.a);
        }
    }

    class c implements v {
        public final /* synthetic */ int a;

        public c(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.j(this.a);
        }
    }

    class d implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ ReadableMap c;
        public final /* synthetic */ Callback d;

        public d(NativeAnimatedModule nativeAnimatedModule, int i, int i2, ReadableMap readableMap, Callback callback) {
            this.a = i;
            this.b = i2;
            this.c = readableMap;
            this.d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.t(this.a, this.b, this.c, this.d);
        }
    }

    class e implements v {
        public final /* synthetic */ int a;

        public e(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.v(this.a);
        }
    }

    class f implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public f(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.e(this.a, this.b);
        }
    }

    class g implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public g(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.h(this.a, this.b);
        }
    }

    class h implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public h(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.d(this.a, this.b);
        }
    }

    class i implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public i(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.g(this.a, this.b);
        }
    }

    class j implements v {
        public final /* synthetic */ int a;

        public j(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.p(this.a);
        }
    }

    class k extends com.facebook.react.uimanager.e {
        public k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.e
        public void c(long j) {
            try {
                l nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager.n()) {
                    nodesManager.q(j);
                }
                com.facebook.react.modules.core.g gVar = NativeAnimatedModule.this.mReactChoreographer;
                yh0.c(gVar);
                gVar.m(g.c.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
            } catch (Exception e) {
                f60.j(C0201.m82(7988), C0201.m82(7989), e);
                throw new RuntimeException(e);
            }
        }
    }

    class l implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ReadableMap c;

        public l(NativeAnimatedModule nativeAnimatedModule, int i, String str, ReadableMap readableMap) {
            this.a = i;
            this.b = str;
            this.c = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.c(this.a, this.b, this.c);
        }
    }

    class m implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public m(NativeAnimatedModule nativeAnimatedModule, int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.o(this.a, this.b, this.c);
        }
    }

    class n implements n0 {
        public final /* synthetic */ ArrayList a;

        public n(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            l nodesManager = NativeAnimatedModule.this.getNodesManager();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(nodesManager);
            }
        }
    }

    class o implements n0 {
        public final /* synthetic */ ArrayList a;

        public o(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            l nodesManager = NativeAnimatedModule.this.getNodesManager();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(nodesManager);
            }
        }
    }

    class p implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;

        public p(NativeAnimatedModule nativeAnimatedModule, int i, ReadableMap readableMap) {
            this.a = i;
            this.b = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.f(this.a, this.b);
        }
    }

    class q implements c {
        public final /* synthetic */ int a;

        public q(int i) {
            this.a = i;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(C0201.m82(9676), this.a);
            createMap.putDouble(C0201.m82(9677), d);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(9678), createMap);
            }
        }
    }

    class r implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ c b;

        public r(NativeAnimatedModule nativeAnimatedModule, int i, c cVar) {
            this.a = i;
            this.b = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.u(this.a, this.b);
        }
    }

    class s implements v {
        public final /* synthetic */ int a;

        public s(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.x(this.a);
        }
    }

    class t implements v {
        public final /* synthetic */ int a;

        public t(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.i(this.a);
        }
    }

    class u implements v {
        public final /* synthetic */ int a;
        public final /* synthetic */ double b;

        public u(NativeAnimatedModule nativeAnimatedModule, int i, double d) {
            this.a = i;
            this.b = d;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(l lVar) {
            lVar.s(this.a, this.b);
        }
    }

    private interface v {
        void a(l lVar);
    }

    static {
        C0201.m83(NativeAnimatedModule.class, 725);
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void clearFrameCallback() {
        com.facebook.react.modules.core.g gVar = this.mReactChoreographer;
        yh0.c(gVar);
        gVar.o(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        com.facebook.react.modules.core.g gVar = this.mReactChoreographer;
        yh0.c(gVar);
        gVar.m(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private l getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            this.mNodesManager = new l((UIManagerModule) reactApplicationContextIfActiveOrWarn.getNativeModule(UIManagerModule.class));
        }
        return this.mNodesManager;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d2, String str, ReadableMap readableMap) {
        this.mOperations.add(new l(this, (int) d2, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d2, double d3) {
        this.mOperations.add(new h(this, (int) d2, (int) d3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d2, double d3) {
        this.mOperations.add(new f(this, (int) d2, (int) d3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d2, ReadableMap readableMap) {
        this.mOperations.add(new p(this, (int) d2, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d2, double d3) {
        this.mOperations.add(new i(this, (int) d2, (int) d3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d2, double d3) {
        this.mOperations.add(new g(this, (int) d2, (int) d3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d2) {
        this.mOperations.add(new t(this, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d2) {
        this.mOperations.add(new c(this, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d2) {
        this.mOperations.add(new b(this, (int) d2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(29485);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && !reactApplicationContextIfActiveOrWarn.isBridgeless()) {
            reactApplicationContextIfActiveOrWarn.addLifecycleEventListener(this);
            ((UIManagerModule) reactApplicationContextIfActiveOrWarn.getNativeModule(UIManagerModule.class)).addUIManagerListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d2, String str, double d3) {
        this.mOperations.add(new m(this, (int) d2, str, (int) d3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d2) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d2) {
        this.mPreOperations.add(new j(this, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d2, double d3) {
        this.mOperations.add(new a(this, (int) d2, d3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d2, double d3) {
        this.mOperations.add(new u(this, (int) d2, d3));
    }

    public void setNodesManager(l lVar) {
        this.mNodesManager = lVar;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d2, double d3, ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new d(this, (int) d2, (int) d3, readableMap, callback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d2) {
        int i2 = (int) d2;
        this.mOperations.add(new r(this, i2, new q(i2)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d2) {
        this.mOperations.add(new e(this, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d2) {
        this.mOperations.add(new s(this, (int) d2));
    }

    @Override // com.facebook.react.uimanager.t0
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (!this.mOperations.isEmpty() || !this.mPreOperations.isEmpty()) {
            ArrayList<v> arrayList = this.mPreOperations;
            ArrayList<v> arrayList2 = this.mOperations;
            this.mPreOperations = new ArrayList<>();
            this.mOperations = new ArrayList<>();
            uIManagerModule.prependUIBlock(new n(arrayList));
            uIManagerModule.addUIBlock(new o(arrayList2));
        }
    }
}
