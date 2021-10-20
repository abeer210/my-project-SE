package com.reactnativenavigation.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import vigqyno.C0201;

public class NavigationModule extends ReactContextBaseJavaModule {
    private static final String NAME = null;
    private oi2 eventEmitter;
    private final rg2 jsonParser;
    private final ue2 layoutFactory;
    private final pj2 now;
    private final si0 reactInstanceManager;

    class a extends u {
        public final /* synthetic */ ReactApplicationContext a;
        public final /* synthetic */ ue2 b;

        public a(ReactApplicationContext reactApplicationContext, ue2 ue2) {
            this.a = reactApplicationContext;
            this.b = ue2;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            NavigationModule.this.eventEmitter = new oi2(this.a);
            NavigationModule.this.navigator().b1(NavigationModule.this.eventEmitter);
            this.b.l(NavigationModule.this.activity(), NavigationModule.this.eventEmitter, NavigationModule.this.navigator().h0(), ((nd2) NavigationModule.this.activity().getApplication()).d());
        }
    }

    static {
        C0201.m83(NavigationModule.class, 568);
    }

    public NavigationModule(ReactApplicationContext reactApplicationContext, si0 si0, ue2 ue2) {
        this(reactApplicationContext, si0, new rg2(), ue2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private an2 navigator() {
        return activity().N();
    }

    private bf2 parse(ReadableMap readableMap) {
        if (readableMap == null) {
            return bf2.n;
        }
        return bf2.k(new vj2(activity()), this.jsonParser.b(readableMap));
    }

    public /* synthetic */ void a(ReadableMap readableMap, String str, Promise promise) {
        navigator().L0(parse(readableMap), new oj2(C0201.m82(27410), str, promise, this.eventEmitter, this.now));
    }

    public md2 activity() {
        return (md2) getCurrentActivity();
    }

    public /* synthetic */ void b(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().V0(str, parse(readableMap));
        navigator().M0(str, new oj2(C0201.m82(27411), str2, promise, this.eventEmitter, this.now));
    }

    public /* synthetic */ void c(String str, String str2, Promise promise) {
        navigator().N0(str, new oj2(C0201.m82(27412), str2, promise, this.eventEmitter, this.now));
    }

    public /* synthetic */ void d(Runnable runnable) {
        if (getCurrentActivity() != null && !activity().isFinishing()) {
            runnable.run();
        }
    }

    @ReactMethod
    public void dismissAllModals(String str, ReadableMap readableMap, Promise promise) {
        handle(new j(this, readableMap, str, promise));
    }

    @ReactMethod
    public void dismissModal(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new m(this, str2, readableMap, str, promise));
    }

    @ReactMethod
    public void dismissOverlay(String str, String str2, Promise promise) {
        handle(new l(this, str2, str, promise));
    }

    public /* synthetic */ void e(String str, ReadableMap readableMap) {
        navigator().V0(str, parse(readableMap));
    }

    public /* synthetic */ void f(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().W0(str, parse(readableMap), new oj2(C0201.m82(27413), str2, promise, this.eventEmitter, this.now));
    }

    public /* synthetic */ void g(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().X0(str, parse(readableMap), new oj2(C0201.m82(27414), str2, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void getLaunchArgs(String str, Promise promise) {
        promise.resolve(nj2.a(activity()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(27415);
    }

    @ReactMethod
    public void getNavigationConstants(Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(27416), C0201.m82(27417));
        createMap.putDouble(C0201.m82(27418), 56.0d);
        createMap.putDouble(C0201.m82(27419), (double) xj2.i(reactApplicationContext, (float) sj2.a(reactApplicationContext)));
        createMap.putDouble(C0201.m82(27420), (double) xj2.i(reactApplicationContext, (float) xj2.e(reactApplicationContext)));
        promise.resolve(createMap);
    }

    public /* synthetic */ void h(String str, ReadableMap readableMap, String str2, Promise promise) {
        navigator().Y0(str, parse(readableMap), new oj2(C0201.m82(27421), str2, promise, this.eventEmitter, this.now));
    }

    public void handle(Runnable runnable) {
        wj2.a(new i(this, runnable));
    }

    public /* synthetic */ void i(ve2 ve2, String str, String str2, Promise promise) {
        nl2 a2 = this.layoutFactory.a(ve2);
        navigator().Z0(str, a2, new oj2(C0201.m82(27422), str2, promise, this.eventEmitter, this.now));
    }

    public /* synthetic */ void j(ReadableMap readableMap) {
        try {
            bf2 parse = parse(readableMap);
            this.layoutFactory.m(parse);
            navigator().c0(parse);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void k(ve2 ve2, String str, Promise promise) {
        nl2 a2 = this.layoutFactory.a(ve2);
        navigator().c1(a2, new oj2(C0201.m82(27423), str, promise, this.eventEmitter, this.now), this.reactInstanceManager);
    }

    public /* synthetic */ void l(ReadableArray readableArray, String str, String str2, Promise promise) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(this.layoutFactory.a(sg2.a(this.jsonParser.b(readableArray.getMap(i)))));
        }
        navigator().d1(str, arrayList, new oj2(C0201.m82(27424), str2, promise, this.eventEmitter, this.now));
    }

    public /* synthetic */ void m(ve2 ve2, String str, Promise promise) {
        nl2 a2 = this.layoutFactory.a(ve2);
        navigator().e1(a2, new oj2(C0201.m82(27425), str, promise, this.eventEmitter, this.now));
    }

    @ReactMethod
    public void mergeOptions(String str, ReadableMap readableMap) {
        handle(new f(this, str, readableMap));
    }

    public /* synthetic */ void n(ve2 ve2, String str, Promise promise) {
        nl2 a2 = this.layoutFactory.a(ve2);
        navigator().f1(a2, new oj2(C0201.m82(27426), str, promise, this.eventEmitter, this.now));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        md2 activity = activity();
        if (activity != null) {
            activity.Q();
        }
        super.onCatalystInstanceDestroy();
    }

    @ReactMethod
    public void pop(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new d(this, str2, readableMap, str, promise));
    }

    @ReactMethod
    public void popTo(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new c(this, str2, readableMap, str, promise));
    }

    @ReactMethod
    public void popToRoot(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new k(this, str2, readableMap, str, promise));
    }

    @ReactMethod
    public void push(String str, String str2, ReadableMap readableMap, Promise promise) {
        handle(new e(this, sg2.a(this.jsonParser.b(readableMap)), str2, str, promise));
    }

    @ReactMethod
    public void setDefaultOptions(ReadableMap readableMap) {
        handle(new g(this, readableMap));
    }

    @ReactMethod
    public void setRoot(String str, ReadableMap readableMap, Promise promise) {
        handle(new n(this, sg2.a(this.jsonParser.b(readableMap).optJSONObject(C0201.m82(27427))), str, promise));
    }

    @ReactMethod
    public void setStackRoot(String str, String str2, ReadableArray readableArray, Promise promise) {
        handle(new h(this, readableArray, str2, str, promise));
    }

    @ReactMethod
    public void showModal(String str, ReadableMap readableMap, Promise promise) {
        handle(new o(this, sg2.a(this.jsonParser.b(readableMap)), str, promise));
    }

    @ReactMethod
    public void showOverlay(String str, ReadableMap readableMap, Promise promise) {
        handle(new b(this, sg2.a(this.jsonParser.b(readableMap)), str, promise));
    }

    public NavigationModule(ReactApplicationContext reactApplicationContext, si0 si0, rg2 rg2, ue2 ue2) {
        super(reactApplicationContext);
        this.now = new pj2();
        this.reactInstanceManager = si0;
        this.jsonParser = rg2;
        this.layoutFactory = ue2;
        reactApplicationContext.addLifecycleEventListener(new a(reactApplicationContext, ue2));
    }
}
