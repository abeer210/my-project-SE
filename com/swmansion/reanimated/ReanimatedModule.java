package com.swmansion.reanimated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import vigqyno.C0201;

@pj0(name = "ReanimatedModule")
public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, t0 {
    public static final String NAME = null;
    private b mNodesManager;
    private ArrayList<m> mOperations = new ArrayList<>();
    private nq2 mTransitionManager;

    class a implements m {
        public final /* synthetic */ Set a;
        public final /* synthetic */ Set b;

        public a(ReanimatedModule reanimatedModule, Set set, Set set2) {
            this.a = set;
            this.b = set2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.f(this.a, this.b);
        }
    }

    class b implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ Callback b;

        public b(ReanimatedModule reanimatedModule, int i, Callback callback) {
            this.a = i;
            this.b = callback;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.q(this.a, this.b);
        }
    }

    class c implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ Double b;

        public c(ReanimatedModule reanimatedModule, int i, Double d) {
            this.a = i;
            this.b = d;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.y(this.a, this.b);
        }
    }

    class d implements n0 {
        public final /* synthetic */ ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            b nodesManager = ReanimatedModule.this.getNodesManager();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(nodesManager);
            }
        }
    }

    class e implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;

        public e(ReanimatedModule reanimatedModule, int i, ReadableMap readableMap) {
            this.a = i;
            this.b = readableMap;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.i(this.a, this.b);
        }
    }

    class f implements m {
        public final /* synthetic */ int a;

        public f(ReanimatedModule reanimatedModule, int i) {
            this.a = i;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.m(this.a);
        }
    }

    class g implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public g(ReanimatedModule reanimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.h(this.a, this.b);
        }
    }

    class h implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public h(ReanimatedModule reanimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.l(this.a, this.b);
        }
    }

    class i implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public i(ReanimatedModule reanimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.g(this.a, this.b);
        }
    }

    class j implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public j(ReanimatedModule reanimatedModule, int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.k(this.a, this.b);
        }
    }

    class k implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public k(ReanimatedModule reanimatedModule, int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.e(this.a, this.b, this.c);
        }
    }

    class l implements m {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public l(ReanimatedModule reanimatedModule, int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(b bVar) {
            bVar.j(this.a, this.b, this.c);
        }
    }

    private interface m {
        void a(b bVar);
    }

    static {
        C0201.m83(ReanimatedModule.class, 464);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private b getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new b(getReactApplicationContext());
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void animateNextTransition(int i2, ReadableMap readableMap) {
        this.mTransitionManager.a(i2, readableMap);
    }

    @ReactMethod
    public void attachEvent(int i2, String str, int i3) {
        this.mOperations.add(new k(this, i2, str, i3));
    }

    @ReactMethod
    public void configureProps(ReadableArray readableArray, ReadableArray readableArray2) {
        int size = readableArray.size();
        HashSet hashSet = new HashSet(size);
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(readableArray.getString(i2));
        }
        int size2 = readableArray2.size();
        HashSet hashSet2 = new HashSet(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            hashSet2.add(readableArray2.getString(i3));
        }
        this.mOperations.add(new a(this, hashSet, hashSet2));
    }

    @ReactMethod
    public void connectNodeToView(int i2, int i3) {
        this.mOperations.add(new i(this, i2, i3));
    }

    @ReactMethod
    public void connectNodes(int i2, int i3) {
        this.mOperations.add(new g(this, i2, i3));
    }

    @ReactMethod
    public void createNode(int i2, ReadableMap readableMap) {
        this.mOperations.add(new e(this, i2, readableMap));
    }

    @ReactMethod
    public void detachEvent(int i2, String str, int i3) {
        this.mOperations.add(new l(this, i2, str, i3));
    }

    @ReactMethod
    public void disconnectNodeFromView(int i2, int i3) {
        this.mOperations.add(new j(this, i2, i3));
    }

    @ReactMethod
    public void disconnectNodes(int i2, int i3) {
        this.mOperations.add(new h(this, i2, i3));
    }

    @ReactMethod
    public void dropNode(int i2) {
        this.mOperations.add(new f(this, i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(33770);
    }

    @ReactMethod
    public void getValue(int i2, Callback callback) {
        this.mOperations.add(new b(this, i2, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
        this.mTransitionManager = new nq2(uIManagerModule);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        b bVar = this.mNodesManager;
        if (bVar != null) {
            bVar.t();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        b bVar = this.mNodesManager;
        if (bVar != null) {
            bVar.u();
        }
    }

    @ReactMethod
    public void setValue(int i2, Double d2) {
        this.mOperations.add(new c(this, i2, d2));
    }

    @Override // com.facebook.react.uimanager.t0
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (!this.mOperations.isEmpty()) {
            ArrayList<m> arrayList = this.mOperations;
            this.mOperations = new ArrayList<>();
            uIManagerModule.addUIBlock(new d(arrayList));
        }
    }
}
