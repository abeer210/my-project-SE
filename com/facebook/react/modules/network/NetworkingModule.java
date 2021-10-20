package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import vigqyno.C0201;

@pj0(name = "Networking")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 0;
    private static final String CONTENT_ENCODING_HEADER_NAME = null;
    private static final String CONTENT_TYPE_HEADER_NAME = null;
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 0;
    public static final String NAME = null;
    private static final String REQUEST_BODY_KEY_BASE64 = null;
    private static final String REQUEST_BODY_KEY_FORMDATA = null;
    private static final String REQUEST_BODY_KEY_STRING = null;
    private static final String REQUEST_BODY_KEY_URI = null;
    private static final String TAG = null;
    private static final String USER_AGENT_HEADER_NAME = null;
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    private static e customClientBuilder;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    private final OkHttpClient mClient;
    private final c mCookieHandler;
    private final a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<f> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<g> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<h> mUriHandlers;

    /* access modifiers changed from: package-private */
    public class a implements Interceptor {
        public final /* synthetic */ String a;
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter b;
        public final /* synthetic */ int c;

        /* renamed from: com.facebook.react.modules.network.NetworkingModule$a$a  reason: collision with other inner class name */
        class C0045a implements h {
            public long a = System.nanoTime();

            public C0045a() {
            }

            @Override // com.facebook.react.modules.network.h
            public void a(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if ((z || NetworkingModule.shouldDispatch(nanoTime, this.a)) && !a.this.a.equals(C0201.m82(13005))) {
                    a aVar = a.this;
                    n.c(aVar.b, aVar.c, j, j2);
                    this.a = nanoTime;
                }
            }
        }

        public a(NetworkingModule networkingModule, String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.a = str;
            this.b = rCTDeviceEventEmitter;
            this.c = i;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response proceed = chain.proceed(chain.request());
            return proceed.newBuilder().body(new j(proceed.body(), new C0045a())).build();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Callback {
        public final /* synthetic */ int a;
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public b(int i, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z) {
            this.a = i;
            this.b = rCTDeviceEventEmitter;
            this.c = str;
            this.d = z;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            String str;
            c40.d(call, iOException);
            try {
                if (!NetworkingModule.this.mShuttingDown) {
                    NetworkingModule.this.removeRequest(this.a);
                    if (iOException.getMessage() != null) {
                        str = iOException.getMessage();
                    } else {
                        str = C0201.m82(30657) + iOException.getClass().getSimpleName();
                    }
                    n.f(this.b, this.a, str, iOException);
                    c40.e();
                }
            } finally {
                c40.e();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            c40.f(call, response);
            try {
                if (!NetworkingModule.this.mShuttingDown) {
                    NetworkingModule.this.removeRequest(this.a);
                    n.h(this.b, this.a, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                    try {
                        ResponseBody body = response.body();
                        if (C0201.m82(30658).equalsIgnoreCase(response.header(C0201.m82(30659))) && body != null) {
                            hy2 hy2 = new hy2(body.source());
                            String header = response.header(C0201.m82(30660));
                            body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1, jy2.d(hy2));
                        }
                        for (g gVar : NetworkingModule.this.mResponseHandlers) {
                            if (gVar.b(this.c)) {
                                n.a(this.b, this.a, gVar.a(body));
                                n.g(this.b, this.a);
                                c40.g();
                                return;
                            }
                        }
                        boolean z = this.d;
                        String r1 = C0201.m82(30661);
                        if (!z || !this.c.equals(r1)) {
                            String r0 = C0201.m82(30662);
                            if (this.c.equals(r1)) {
                                try {
                                    r0 = body.string();
                                } catch (IOException e2) {
                                    if (!response.request().method().equalsIgnoreCase(C0201.m82(30663))) {
                                        n.f(this.b, this.a, e2.getMessage(), e2);
                                    }
                                }
                            } else if (this.c.equals(C0201.m82(30664))) {
                                r0 = Base64.encodeToString(body.bytes(), 2);
                            }
                            n.b(this.b, this.a, r0);
                            n.g(this.b, this.a);
                            c40.g();
                            return;
                        }
                        NetworkingModule.this.readWithProgress(this.b, this.a, body);
                        n.g(this.b, this.a);
                        c40.g();
                    } catch (IOException e3) {
                        n.f(this.b, this.a, e3.getMessage(), e3);
                    }
                }
            } finally {
                c40.g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements h {
        public long a = System.nanoTime();
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter b;
        public final /* synthetic */ int c;

        public c(NetworkingModule networkingModule, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.b = rCTDeviceEventEmitter;
            this.c = i;
        }

        @Override // com.facebook.react.modules.network.h
        public void a(long j, long j2, boolean z) {
            long nanoTime = System.nanoTime();
            if (z || NetworkingModule.shouldDispatch(nanoTime, this.a)) {
                n.d(this.b, this.c, j, j2);
                this.a = nanoTime;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ int a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, int i) {
            super(reactContext);
            this.a = i;
        }

        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            cj0.a(NetworkingModule.this.mClient, Integer.valueOf(this.a));
        }
    }

    public interface e {
        void a(OkHttpClient.Builder builder);
    }

    public interface f {
        boolean a(ReadableMap readableMap);

        RequestBody b(ReadableMap readableMap, String str);
    }

    public interface g {
        WritableMap a(ResponseBody responseBody) throws IOException;

        boolean b(String str);
    }

    public interface h {
        WritableMap a(Uri uri) throws IOException;

        boolean b(Uri uri, String str);
    }

    static {
        C0201.m83(NetworkingModule.class, 77);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<e> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (e eVar : list) {
                newBuilder.addNetworkInterceptor(eVar.create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new c(reactApplicationContext);
        this.mCookieJarContainer = (a) this.mClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i2) {
        this.mRequestIds.add(Integer.valueOf(i2));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        e eVar = customClientBuilder;
        if (eVar != null) {
            eVar.a(builder);
        }
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i2) {
        new d(getReactApplicationContext(), i2).execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i2) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter(C0201.m82(25066));
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ReadableMap map = readableArray.getMap(i3);
            Headers extractHeaders = extractHeaders(map.getArray(C0201.m82(25067)), null);
            if (extractHeaders == null) {
                n.f(eventEmitter, i2, C0201.m82(25068), null);
                return null;
            }
            String r6 = C0201.m82(25069);
            String str2 = extractHeaders.get(r6);
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                extractHeaders = extractHeaders.newBuilder().removeAll(r6).build();
            } else {
                mediaType = null;
            }
            String r62 = C0201.m82(25070);
            if (map.hasKey(r62)) {
                builder.addPart(extractHeaders, RequestBody.create(mediaType, map.getString(r62)));
            } else {
                String r63 = C0201.m82(25071);
                if (!map.hasKey(r63)) {
                    n.f(eventEmitter, i2, C0201.m82(25074), null);
                } else if (mediaType == null) {
                    n.f(eventEmitter, i2, C0201.m82(25072), null);
                    return null;
                } else {
                    String string = map.getString(r63);
                    InputStream f2 = m.f(getReactApplicationContext(), string);
                    if (f2 == null) {
                        n.f(eventEmitter, i2, C0201.m82(25073) + string, null);
                        return null;
                    }
                    builder.addPart(extractHeaders, m.a(mediaType, f2));
                }
            }
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ReadableArray array = readableArray.getArray(i2);
            if (array != null && array.size() == 2) {
                String a2 = d.a(array.getString(0));
                String b2 = d.b(array.getString(1));
                if (!(a2 == null || b2 == null)) {
                    builder.add(a2, b2);
                }
            }
            return null;
        }
        String r10 = C0201.m82(25075);
        if (builder.get(r10) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(r10, str);
        }
        if (readableMap != null && readableMap.hasKey(C0201.m82(25076))) {
            z = true;
        }
        if (!z) {
            builder.removeAll(C0201.m82(25077));
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        if (getReactApplicationContextIfActiveOrWarn() != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i2, ResponseBody responseBody) throws IOException {
        long j2;
        Charset charset;
        long j3 = -1;
        try {
            j jVar = (j) responseBody;
            j2 = jVar.n();
            try {
                j3 = jVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j2 = -1;
        }
        if (responseBody.contentType() == null) {
            charset = com.facebook.react.common.g.a;
        } else {
            charset = responseBody.contentType().charset(com.facebook.react.common.g.a);
        }
        k kVar = new k(charset);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    n.e(rCTDeviceEventEmitter, i2, kVar.a(bArr, read), j2, j3);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void removeRequest(int i2) {
        this.mRequestIds.remove(Integer.valueOf(i2));
    }

    public static void setCustomClientBuilder(e eVar) {
        customClientBuilder = eVar;
    }

    /* access modifiers changed from: private */
    public static boolean shouldDispatch(long j2, long j3) {
        return j3 + 100000000 < j2;
    }

    /* access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < headers.size(); i2++) {
            String name = headers.name(i2);
            if (bundle.containsKey(name)) {
                bundle.putString(name, bundle.getString(name) + C0201.m82(25078) + headers.value(i2));
            } else {
                bundle.putString(name, headers.value(i2));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i2) {
        if (requestBody == null) {
            return null;
        }
        return m.c(requestBody, new c(this, rCTDeviceEventEmitter, i2));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d2) {
        int i2 = (int) d2;
        cancelRequest(i2);
        removeRequest(i2);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.add(fVar);
    }

    public void addResponseHandler(g gVar) {
        this.mResponseHandlers.add(gVar);
    }

    public void addUriHandler(h hVar) {
        this.mUriHandlers.add(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
        this.mCookieHandler.g(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(25079);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.b(new JavaNetCookieJar(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.i();
        this.mCookieJarContainer.a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d2) {
    }

    public void removeRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.remove(fVar);
    }

    public void removeResponseHandler(g gVar) {
        this.mResponseHandlers.remove(gVar);
    }

    public void removeUriHandler(h hVar) {
        this.mUriHandlers.remove(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d3, boolean z2) {
        int i2 = (int) d2;
        try {
            sendRequestInternal(str, str2, i2, readableArray, readableMap, str3, z, (int) d3, z2);
        } catch (Throwable th) {
            f60.j(a, m + str2, th);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter(h);
            if (eventEmitter != null) {
                n.f(eventEmitter, i2, th.getMessage(), th);
            }
        }
    }

    public void sendRequestInternal(String str, String str2, int i2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i3, boolean z2) {
        f fVar;
        RequestBody requestBody;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter(f);
        try {
            Uri parse = Uri.parse(str2);
            for (h hVar : this.mUriHandlers) {
                if (hVar.b(parse, str3)) {
                    n.a(eventEmitter, i2, hVar.a(parse));
                    n.g(eventEmitter, i2);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i2 != 0) {
                    url.tag(Integer.valueOf(i2));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                applyCustomBuilder(newBuilder);
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new a(this, str3, eventEmitter, i2));
                }
                if (i3 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout((long) i3, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    n.f(eventEmitter, i2, q, null);
                    return;
                }
                String str4 = extractHeaders.get(o);
                String str5 = extractHeaders.get(j);
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator<f> it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        fVar = it.next();
                        if (fVar.a(readableMap)) {
                            break;
                        }
                    }
                }
                fVar = null;
                if (readableMap == null || str.toLowerCase().equals(l) || str.toLowerCase().equals(i)) {
                    requestBody = m.e(str);
                } else if (fVar != null) {
                    requestBody = fVar.b(readableMap, str4);
                } else {
                    String str6 = c;
                    boolean hasKey = readableMap.hasKey(str6);
                    String str7 = g;
                    if (!hasKey) {
                        String str8 = e;
                        if (!readableMap.hasKey(str8)) {
                            String str9 = n;
                            if (!readableMap.hasKey(str9)) {
                                String str10 = d;
                                if (readableMap.hasKey(str10)) {
                                    if (str4 == null) {
                                        str4 = b;
                                    }
                                    MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(str10), str4, i2);
                                    if (constructMultipartBody != null) {
                                        requestBody = constructMultipartBody.build();
                                    } else {
                                        return;
                                    }
                                } else {
                                    requestBody = m.e(str);
                                }
                            } else if (str4 == null) {
                                n.f(eventEmitter, i2, str7, null);
                                return;
                            } else {
                                String string = readableMap.getString(str9);
                                InputStream f2 = m.f(getReactApplicationContext(), string);
                                if (f2 == null) {
                                    n.f(eventEmitter, i2, k + string, null);
                                    return;
                                }
                                requestBody = m.a(MediaType.parse(str4), f2);
                            }
                        } else if (str4 == null) {
                            n.f(eventEmitter, i2, str7, null);
                            return;
                        } else {
                            requestBody = RequestBody.create(MediaType.parse(str4), dy2.f(readableMap.getString(str8)));
                        }
                    } else if (str4 == null) {
                        n.f(eventEmitter, i2, str7, null);
                        return;
                    } else {
                        String string2 = readableMap.getString(str6);
                        MediaType parse2 = MediaType.parse(str4);
                        if (m.g(str5)) {
                            requestBody = m.b(parse2, string2);
                            if (requestBody == null) {
                                n.f(eventEmitter, i2, p, null);
                                return;
                            }
                        } else {
                            Charset charset = com.facebook.react.common.g.a;
                            if (parse2 != null) {
                                charset = parse2.charset(charset);
                            }
                            requestBody = RequestBody.create(parse2, string2.getBytes(charset));
                        }
                    }
                }
                url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i2));
                addRequest(i2);
                c40.a(build.newCall(url.build()), new b(i2, eventEmitter, str3, z));
            } catch (Exception e2) {
                n.f(eventEmitter, i2, e2.getMessage(), null);
            }
        } catch (IOException e3) {
            n.f(eventEmitter, i2, e3.getMessage(), e3);
        }
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, g.b(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<e> list) {
        this(reactApplicationContext, null, g.b(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, g.b(reactApplicationContext), null);
    }
}
