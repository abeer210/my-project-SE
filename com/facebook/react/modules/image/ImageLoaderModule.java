package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

@pj0(name = "ImageLoader")
public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = null;
    private static final String ERROR_INVALID_URI = null;
    private static final String ERROR_PREFETCH_FAILURE = null;
    public static final String NAME = null;
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<n70<Void>> mEnqueuedRequests;

    class a extends m70<v60<ye0>> {
        public final /* synthetic */ Promise a;

        public a(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.m70
        public void e(n70<v60<ye0>> n70) {
            this.a.reject(C0201.m82(36626), n70.c());
        }

        @Override // defpackage.m70
        public void f(n70<v60<ye0>> n70) {
            if (n70.b()) {
                v60<ye0> f = n70.f();
                String r0 = C0201.m82(36627);
                if (f != null) {
                    try {
                        ye0 w = f.w();
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt(C0201.m82(36628), w.c());
                        createMap.putInt(C0201.m82(36629), w.a());
                        this.a.resolve(createMap);
                    } catch (Exception e) {
                        this.a.reject(r0, e);
                    } catch (Throwable th) {
                        v60.s(f);
                        throw th;
                    }
                    v60.s(f);
                    return;
                }
                this.a.reject(r0);
            }
        }
    }

    class b extends m70<v60<ye0>> {
        public final /* synthetic */ Promise a;

        public b(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.m70
        public void e(n70<v60<ye0>> n70) {
            this.a.reject(C0201.m82(36422), n70.c());
        }

        @Override // defpackage.m70
        public void f(n70<v60<ye0>> n70) {
            if (n70.b()) {
                v60<ye0> f = n70.f();
                String r0 = C0201.m82(36423);
                if (f != null) {
                    try {
                        ye0 w = f.w();
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt(C0201.m82(36424), w.c());
                        createMap.putInt(C0201.m82(36425), w.a());
                        this.a.resolve(createMap);
                    } catch (Exception e) {
                        this.a.reject(r0, e);
                    } catch (Throwable th) {
                        v60.s(f);
                        throw th;
                    }
                    v60.s(f);
                    return;
                }
                this.a.reject(r0);
            }
        }
    }

    class c extends m70<Void> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Promise b;

        public c(int i, Promise promise) {
            this.a = i;
            this.b = promise;
        }

        @Override // defpackage.m70
        public void e(n70<Void> n70) {
            try {
                ImageLoaderModule.this.removeRequest(this.a);
                this.b.reject(C0201.m82(36466), n70.c());
            } finally {
                n70.close();
            }
        }

        @Override // defpackage.m70
        public void f(n70<Void> n70) {
            if (n70.b()) {
                try {
                    ImageLoaderModule.this.removeRequest(this.a);
                    this.b.resolve(Boolean.TRUE);
                } finally {
                    n70.close();
                }
            }
        }
    }

    class d extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ ReadableArray a;
        public final /* synthetic */ Promise b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ImageLoaderModule imageLoaderModule, ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.a = readableArray;
            this.b = promise;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap createMap = Arguments.createMap();
            be0 a2 = c80.a();
            for (int i = 0; i < this.a.size(); i++) {
                String string = this.a.getString(i);
                Uri parse = Uri.parse(string);
                if (a2.l(parse)) {
                    createMap.putString(string, C0201.m82(36833));
                } else if (a2.n(parse)) {
                    createMap.putString(string, C0201.m82(36834));
                }
            }
            this.b.resolve(createMap);
        }
    }

    static {
        C0201.m83(ImageLoaderModule.class, 136);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    private void registerRequest(int i, n70<Void> n70) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, n70);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private n70<Void> removeRequest(int i) {
        n70<Void> n70;
        synchronized (this.mEnqueuedRequestMonitor) {
            n70 = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return n70;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d2) {
        n70<Void> removeRequest = removeRequest((int) d2);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(5133);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(C0201.m82(5134), C0201.m82(5135));
            return;
        }
        c80.a().d(jh0.r(new nl0(getReactApplicationContext(), str).e()).a(), this.mCallerContext).g(new a(this, promise), h50.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(C0201.m82(5136), C0201.m82(5137));
            return;
        }
        c80.a().d(com.facebook.react.modules.fresco.a.w(jh0.r(new nl0(getReactApplicationContext(), str).e()), readableMap), this.mCallerContext).g(new b(this, promise), h50.a());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                n70<Void> valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d2, Promise promise) {
        int i = (int) d2;
        if (str == null || str.isEmpty()) {
            promise.reject(C0201.m82(5138), C0201.m82(5139));
            return;
        }
        n70<Void> r = c80.a().r(jh0.r(Uri.parse(str)).a(), this.mCallerContext);
        c cVar = new c(i, promise);
        registerRequest(i, r);
        r.g(cVar, h50.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new d(this, getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }
}
