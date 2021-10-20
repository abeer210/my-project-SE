package com.RNFetchBlob;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.content.FileProvider;
import com.RNFetchBlob.f;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import vigqyno.C0201;

public class RNFetchBlob extends ReactContextBaseJavaModule {
    private static boolean ActionViewVisible = false;
    public static ReactApplicationContext RCTContext;
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static LinkedBlockingQueue<Runnable> fsTaskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor fsThreadPool = new ThreadPoolExecutor(2, 10, 5000, TimeUnit.MILLISECONDS, taskQueue);
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    private static SparseArray<Promise> promiseTable = new SparseArray<>();
    private static LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 5000, TimeUnit.MILLISECONDS, taskQueue);
    private final OkHttpClient mClient = com.facebook.react.modules.network.g.g();

    class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Promise c;

        public a(RNFetchBlob rNFetchBlob, String str, String str2, Promise promise) {
            this.a = str;
            this.b = str2;
            this.c = promise;
        }

        public void run() {
            d.o(this.a, this.b, this.c);
        }
    }

    class b implements Runnable {
        public final /* synthetic */ ReactApplicationContext a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public b(RNFetchBlob rNFetchBlob, ReactApplicationContext reactApplicationContext, String str, String str2, int i, int i2, String str3) {
            this.a = reactApplicationContext;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
            this.f = str3;
        }

        public void run() {
            new d(this.a).y(this.b, this.c, this.d, this.e, this.f);
        }
    }

    class c implements Runnable {
        public final /* synthetic */ Callback a;

        public c(RNFetchBlob rNFetchBlob, Callback callback) {
            this.a = callback;
        }

        public void run() {
            d.f(this.a);
        }
    }

    class d implements ActivityEventListener {
        public d(RNFetchBlob rNFetchBlob) {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            if (i == c.a.intValue() && i2 == -1) {
                ((Promise) RNFetchBlob.promiseTable.get(c.a.intValue())).resolve(intent.getData().toString());
                RNFetchBlob.promiseTable.remove(c.a.intValue());
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    class e implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Promise d;

        public e(RNFetchBlob rNFetchBlob, String str, String str2, String str3, Promise promise) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = promise;
        }

        public void run() {
            d.c(this.a, this.b, this.c, this.d);
        }
    }

    class f implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ ReadableArray b;
        public final /* synthetic */ Promise c;

        public f(RNFetchBlob rNFetchBlob, String str, ReadableArray readableArray, Promise promise) {
            this.a = str;
            this.b = readableArray;
            this.c = promise;
        }

        public void run() {
            d.d(this.a, this.b, this.c);
        }
    }

    class g implements LifecycleEventListener {
        public final /* synthetic */ Promise a;

        public g(RNFetchBlob rNFetchBlob, Promise promise) {
            this.a = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (RNFetchBlob.ActionViewVisible) {
                this.a.resolve(null);
            }
            RNFetchBlob.RCTContext.removeLifecycleEventListener(this);
        }
    }

    class h implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Callback c;

        public h(RNFetchBlob rNFetchBlob, String str, String str2, Callback callback) {
            this.a = str;
            this.b = str2;
            this.c = callback;
        }

        public void run() {
            d.b(this.a, this.b, this.c);
        }
    }

    class i implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Promise c;

        public i(RNFetchBlob rNFetchBlob, String str, String str2, Promise promise) {
            this.a = str;
            this.b = str2;
            this.c = promise;
        }

        public void run() {
            d.x(this.a, this.b, this.c);
        }
    }

    class j implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ ReadableArray b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Promise d;

        public j(RNFetchBlob rNFetchBlob, String str, ReadableArray readableArray, boolean z, Promise promise) {
            this.a = str;
            this.b = readableArray;
            this.c = z;
            this.d = promise;
        }

        public void run() {
            d.I(this.a, this.b, this.c, this.d);
        }
    }

    class k implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Promise e;

        public k(RNFetchBlob rNFetchBlob, String str, String str2, String str3, boolean z, Promise promise) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = promise;
        }

        public void run() {
            d.J(this.a, this.b, this.c, this.d, this.e);
        }
    }

    class l implements Runnable {
        public final /* synthetic */ ReadableArray a;
        public final /* synthetic */ ReactApplicationContext b;
        public final /* synthetic */ Callback c;

        public l(RNFetchBlob rNFetchBlob, ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.a = readableArray;
            this.b = reactApplicationContext;
            this.c = callback;
        }

        public void run() {
            int size = this.a.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                ReadableMap map = this.a.getMap(i);
                String r5 = C0201.m82(35447);
                if (map.hasKey(r5)) {
                    strArr[i] = map.getString(r5);
                    String r52 = C0201.m82(35448);
                    if (map.hasKey(r52)) {
                        strArr2[i] = map.getString(r52);
                    } else {
                        strArr2[i] = null;
                    }
                }
            }
            new d(this.b).A(strArr, strArr2, this.c);
        }
    }

    static {
        C0201.m83(RNFetchBlob.class, 71);
    }

    public RNFetchBlob(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        ((com.facebook.react.modules.network.a) this.mClient.cookieJar()).b(new JavaNetCookieJar(new com.facebook.react.modules.network.c(reactApplicationContext)));
        RCTContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new d(this));
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            Uri e2 = FileProvider.e(currentActivity, getReactApplicationContext().getPackageName() + C0201.m82(23133), new File(str));
            int i2 = Build.VERSION.SDK_INT;
            String r4 = C0201.m82(23134);
            if (i2 >= 24) {
                Intent dataAndType = new Intent(r4).setDataAndType(e2, str2);
                dataAndType.setFlags(1);
                dataAndType.addFlags(268435456);
                dataAndType.addFlags(268435456);
                if (dataAndType.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
                    getReactApplicationContext().startActivity(dataAndType);
                }
            } else {
                Intent intent = new Intent(r4);
                getReactApplicationContext().startActivity(intent.setDataAndType(Uri.parse(C0201.m82(23135) + str), str2).setFlags(268435456));
            }
            ActionViewVisible = true;
            RCTContext.addLifecycleEventListener(new g(this, promise));
        } catch (Exception e3) {
            promise.reject(C0201.m82(23136), e3.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        String str = h;
        String str2 = c;
        String str3 = e;
        String str4 = l;
        DownloadManager downloadManager = (DownloadManager) RCTContext.getSystemService(i);
        String str5 = d;
        if (readableMap != null) {
            String str6 = g;
            if (readableMap.hasKey(str6)) {
                String w = d.w(readableMap.getString(str6));
                if (w == null) {
                    promise.reject(str5, a + readableMap.getString(str6));
                    return;
                }
                try {
                    WritableMap D = d.D(w);
                    boolean hasKey = readableMap.hasKey(str4);
                    String str7 = j;
                    String string = hasKey ? readableMap.getString(str4) : str7;
                    if (readableMap.hasKey(str3)) {
                        str7 = readableMap.getString(str3);
                    }
                    downloadManager.addCompletedDownload(string, str7, true, readableMap.hasKey(str2) ? readableMap.getString(str2) : null, w, Long.valueOf(D.getString(b)).longValue(), readableMap.hasKey(str) && readableMap.getBoolean(str));
                    promise.resolve(null);
                    return;
                } catch (Exception e2) {
                    promise.reject(f, e2.getLocalizedMessage());
                    return;
                }
            }
        }
        promise.reject(str5, k);
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        try {
            g.c(str);
            callback.invoke(null, str);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        d.a(str, callback);
    }

    @ReactMethod
    public void cp(String str, String str2, Callback callback) {
        threadPool.execute(new h(this, str, str2, callback));
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Promise promise) {
        threadPool.execute(new e(this, str, str2, str3, promise));
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        threadPool.execute(new f(this, str, readableArray, promise));
    }

    @ReactMethod
    public void df(Callback callback) {
        fsThreadPool.execute(new c(this, callback));
    }

    @ReactMethod
    public void enableProgressReport(String str, int i2, int i3) {
        g.y.put(str, new f(true, i2, i3, f.a.Download));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i2, int i3) {
        g.z.put(str, new f(true, i2, i3, f.a.Upload));
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        d.j(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new g(readableMap, str, str2, str3, readableMap2, str4, null, this.mClient, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new g(readableMap, str, str2, str3, readableMap2, null, readableArray, this.mClient, callback).run();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return d.m(getReactApplicationContext());
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        Intent intent = new Intent(C0201.m82(23137));
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType(C0201.m82(23138));
        }
        promiseTable.put(c.a.intValue(), promise);
        getReactApplicationContext().startActivityForResult(intent, c.a.intValue(), null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(23139);
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        d.k(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        d.l(promise);
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        threadPool.execute(new a(this, str, str2, promise));
    }

    @ReactMethod
    public void ls(String str, Promise promise) {
        d.s(str, promise);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        d.t(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        d.u(str, promise);
    }

    @ReactMethod
    public void mv(String str, String str2, Callback callback) {
        d.v(str, str2, callback);
    }

    @ReactMethod
    public void readFile(String str, String str2, Promise promise) {
        threadPool.execute(new i(this, str, str2, promise));
    }

    @ReactMethod
    public void readStream(String str, String str2, int i2, int i3, String str3) {
        fsThreadPool.execute(new b(this, getReactApplicationContext(), str, str2, i2, i3, str3));
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        d.z(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        threadPool.execute(new l(this, readableArray, getReactApplicationContext(), callback));
    }

    @ReactMethod
    public void slice(String str, String str2, int i2, int i3, Promise promise) {
        d.B(str, str2, i2, i3, C0201.m82(23140), promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        d.C(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        d.F(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        d.G(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        d.H(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z, Promise promise) {
        threadPool.execute(new k(this, str, str2, str3, z, promise));
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z, Promise promise) {
        threadPool.execute(new j(this, str, readableArray, z, promise));
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z, Callback callback) {
        new d(getReactApplicationContext()).K(str, str2, z, callback);
    }
}
