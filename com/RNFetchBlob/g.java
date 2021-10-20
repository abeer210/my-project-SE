package com.RNFetchBlob;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;
import vigqyno.C0201;

/* compiled from: RNFetchBlobReq */
public class g extends BroadcastReceiver implements Runnable {
    public static ConnectionPool A = new ConnectionPool();
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    public static final String ae = null;
    public static final String af = null;
    public static final String ag = null;
    public static final String ah = null;
    public static final String ai = null;
    public static final String aj = null;
    public static final String ak = null;
    public static final String al = null;
    public static final String am = null;
    public static final String an = null;
    public static final String ao = null;
    public static final String ap = null;
    public static final String aq = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static HashMap<String, Call> w = new HashMap<>();
    public static HashMap<String, Long> x = new HashMap<>();
    public static HashMap<String, f> y = new HashMap<>();
    public static HashMap<String, f> z = new HashMap<>();
    public b a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public ReadableArray g;
    public ReadableMap h;
    public Callback i;
    public long j;
    public long k;
    public a l;
    public e m;
    public EnumC0030g n;
    public f o = f.Auto;
    public WritableMap p;
    public boolean q = false;
    public ArrayList<String> u = new ArrayList<>();
    public OkHttpClient v;

    /* compiled from: RNFetchBlobReq */
    class a implements Interceptor {
        public a() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            g.this.u.add(chain.request().url().toString());
            return chain.proceed(chain.request());
        }
    }

    /* compiled from: RNFetchBlobReq */
    class b implements Interceptor {
        public final /* synthetic */ Request a;

        public b(Request request) {
            this.a = request;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            ResponseBody responseBody;
            try {
                Response proceed = chain.proceed(this.a);
                int i = d.b[g.this.n.ordinal()];
                if (i == 1) {
                    responseBody = new q8(RNFetchBlob.RCTContext, g.this.b, proceed.body(), g.this.a.j.booleanValue());
                } else if (i != 2) {
                    responseBody = new q8(RNFetchBlob.RCTContext, g.this.b, proceed.body(), g.this.a.j.booleanValue());
                } else {
                    responseBody = new r8(RNFetchBlob.RCTContext, g.this.b, proceed.body(), g.this.f, g.this.a.h.booleanValue());
                }
                return proceed.newBuilder().body(responseBody).build();
            } catch (SocketException unused) {
                g.this.q = true;
                return chain.proceed(chain.request());
            } catch (SocketTimeoutException e) {
                g.this.q = true;
                h.a(C0201.m82(9937) + e.getLocalizedMessage());
                return chain.proceed(chain.request());
            } catch (Exception unused2) {
                return chain.proceed(chain.request());
            }
        }
    }

    /* compiled from: RNFetchBlobReq */
    class c implements okhttp3.Callback {
        public c() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            c40.d(call, iOException);
            try {
                g.c(g.this.b);
                if (g.this.p == null) {
                    g.this.p = Arguments.createMap();
                }
                if (iOException.getClass().equals(SocketTimeoutException.class)) {
                    g.this.p.putBoolean(C0201.m82(9989), true);
                    g.this.i.invoke(C0201.m82(9990), null, null);
                } else {
                    g.this.i.invoke(iOException.getLocalizedMessage(), null, null);
                }
                g.this.m();
            } finally {
                c40.e();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            String r0 = C0201.m82(9991);
            String r1 = C0201.m82(9992);
            String r2 = C0201.m82(9993);
            String r3 = C0201.m82(9994);
            String r4 = C0201.m82(9995);
            c40.f(call, response);
            try {
                ReadableMap readableMap = g.this.a.d;
                if (readableMap != null) {
                    String r5 = C0201.m82(9996);
                    boolean hasKey = readableMap.hasKey(r4);
                    String r7 = C0201.m82(9997);
                    String string = hasKey ? g.this.a.d.getString(r4) : r7;
                    if (readableMap.hasKey(r3)) {
                        r7 = readableMap.getString(r3);
                    }
                    if (readableMap.hasKey(r2)) {
                        r5 = readableMap.getString(r2);
                    }
                    boolean z = readableMap.hasKey(r1) ? readableMap.getBoolean(r1) : false;
                    boolean z2 = readableMap.hasKey(r0) ? readableMap.getBoolean(r0) : false;
                    ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
                    ReactApplicationContext reactApplicationContext2 = RNFetchBlob.RCTContext;
                    ((DownloadManager) reactApplicationContext.getSystemService(C0201.m82(9998))).addCompletedDownload(string, r7, z, r5, g.this.f, g.this.j, z2);
                }
                g.this.d(response);
            } finally {
                c40.g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            int[] iArr = new int[EnumC0030g.values().length];
            b = iArr;
            try {
                iArr[EnumC0030g.KeepInMemory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[EnumC0030g.FileStorage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            a = iArr2;
            iArr2[e.SingleFile.ordinal()] = 1;
            a[e.AsIs.ordinal()] = 2;
            a[e.Form.ordinal()] = 3;
            a[e.WithoutBody.ordinal()] = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq */
    public enum e {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq */
    public enum f {
        Auto,
        UTF8,
        BASE64
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.RNFetchBlob.g$g  reason: collision with other inner class name */
    /* compiled from: RNFetchBlobReq */
    public enum EnumC0030g {
        KeepInMemory,
        FileStorage
    }

    static {
        C0201.m83(g.class, 4);
    }

    public g(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, OkHttpClient okHttpClient, Callback callback) {
        this.c = str2.toUpperCase();
        b bVar = new b(readableMap);
        this.a = bVar;
        this.b = str;
        this.d = str3;
        this.h = readableMap2;
        this.i = callback;
        this.e = str4;
        this.g = readableArray;
        this.v = okHttpClient;
        if (bVar.a.booleanValue() || this.a.b != null) {
            this.n = EnumC0030g.FileStorage;
        } else {
            this.n = EnumC0030g.KeepInMemory;
        }
        if (str4 != null) {
            this.m = e.SingleFile;
        } else if (readableArray != null) {
            this.m = e.Form;
        } else {
            this.m = e.WithoutBody;
        }
    }

    public static void c(String str) {
        if (w.containsKey(str)) {
            w.get(str).cancel();
            w.remove(str);
        }
        if (x.containsKey(str)) {
            ((DownloadManager) RNFetchBlob.RCTContext.getApplicationContext().getSystemService(C0201.m82(1367))).remove(x.get(str).longValue());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void d(Response response) {
        boolean l2 = l(response);
        e(k(response, l2));
        int i2 = d.b[this.n.ordinal()];
        String r2 = C0201.m82(1368);
        String r3 = C0201.m82(1369);
        String r4 = C0201.m82(1370);
        String r5 = C0201.m82(1371);
        if (i2 == 1) {
            if (l2) {
                try {
                    if (this.a.g.booleanValue()) {
                        String n2 = d.n(this.b);
                        InputStream byteStream = response.body().byteStream();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(n2));
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = byteStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        byteStream.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        this.i.invoke(null, r2, n2);
                    }
                } catch (IOException unused) {
                    this.i.invoke(C0201.m82(1375), null);
                }
            }
            byte[] bytes = response.body().bytes();
            CharsetEncoder newEncoder = Charset.forName(r4).newEncoder();
            f fVar = this.o;
            f fVar2 = f.BASE64;
            String r11 = C0201.m82(1374);
            if (fVar == fVar2) {
                this.i.invoke(null, r11, Base64.encodeToString(bytes, 2));
                return;
            }
            try {
                newEncoder.encode(ByteBuffer.wrap(bytes).asCharBuffer());
                String str = new String(bytes);
                this.i.invoke(null, r5, str);
            } catch (CharacterCodingException unused2) {
                if (this.o == f.UTF8) {
                    this.i.invoke(null, r5, r3);
                } else {
                    this.i.invoke(null, r11, Base64.encodeToString(bytes, 2));
                }
            }
        } else if (i2 != 2) {
            try {
                this.i.invoke(null, r5, new String(response.body().bytes(), r4));
            } catch (IOException unused3) {
                this.i.invoke(C0201.m82(1372), null);
            }
        } else {
            try {
                response.body().bytes();
            } catch (Exception unused4) {
            }
            String replace = this.f.replace(C0201.m82(1373), r3);
            this.f = replace;
            this.i.invoke(null, r2, replace);
        }
        response.body().close();
        m();
    }

    private void e(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(1376), writableMap);
    }

    public static OkHttpClient.Builder f(OkHttpClient.Builder builder) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && i2 <= 19) {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException(C0201.m82(1378) + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                SSLContext instance2 = SSLContext.getInstance(C0201.m82(1377));
                instance2.init(null, new TrustManager[]{x509TrustManager}, null);
                builder.sslSocketFactory(instance2.getSocketFactory(), x509TrustManager);
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e2) {
                f60.j(C0201.m82(1379), C0201.m82(1380), e2);
            }
        }
        return builder;
    }

    private String g(HashMap<String, String> hashMap, String str) {
        String str2 = hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = hashMap.get(str.toLowerCase());
        return str3 == null ? C0201.m82(1381) : str3;
    }

    private String h(Headers headers, String str) {
        String str2 = headers.get(str);
        if (str2 != null) {
            return str2;
        }
        return headers.get(str.toLowerCase()) == null ? C0201.m82(1382) : headers.get(str.toLowerCase());
    }

    public static f i(String str) {
        if (!y.containsKey(str)) {
            return null;
        }
        return y.get(str);
    }

    public static f j(String str) {
        if (!z.containsKey(str)) {
            return null;
        }
        return z.get(str);
    }

    private WritableMap k(Response response, boolean z2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(1383), response.code());
        createMap.putString(C0201.m82(1384), C0201.m82(1385));
        createMap.putString(C0201.m82(1386), this.b);
        createMap.putBoolean(C0201.m82(1387), this.q);
        WritableMap createMap2 = Arguments.createMap();
        for (int i2 = 0; i2 < response.headers().size(); i2++) {
            createMap2.putString(response.headers().name(i2), response.headers().value(i2));
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = this.u.iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        createMap.putArray(C0201.m82(1388), createArray);
        createMap.putMap(C0201.m82(1389), createMap2);
        Headers headers = response.headers();
        String r1 = C0201.m82(1390);
        if (z2) {
            createMap.putString(r1, C0201.m82(1391));
        } else {
            String r7 = C0201.m82(1392);
            if (h(headers, r7).equalsIgnoreCase(C0201.m82(1393))) {
                createMap.putString(r1, C0201.m82(1394));
            } else if (h(headers, r7).contains(C0201.m82(1395))) {
                createMap.putString(r1, C0201.m82(1396));
            } else {
                createMap.putString(r1, C0201.m82(1397));
            }
        }
        return createMap;
    }

    private boolean l(Response response) {
        boolean z2;
        String h2 = h(response.headers(), C0201.m82(1398));
        boolean z3 = !h2.equalsIgnoreCase(C0201.m82(1399));
        boolean z4 = !h2.equalsIgnoreCase(C0201.m82(1400));
        if (this.a.l != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.l.size()) {
                    break;
                } else if (h2.toLowerCase().contains(this.a.l.getString(i2).toLowerCase())) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if ((!z4 || z3) && !z2) {
                return false;
            }
            return true;
        }
        z2 = false;
        if (!z4) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m() {
        if (w.containsKey(this.b)) {
            w.remove(this.b);
        }
        if (x.containsKey(this.b)) {
            x.remove(this.b);
        }
        if (z.containsKey(this.b)) {
            z.remove(this.b);
        }
        if (y.containsKey(this.b)) {
            y.remove(this.b);
        }
        a aVar = this.l;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010b A[SYNTHETIC, Splitter:B:30:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0148  */
    public void onReceive(Context context, Intent intent) {
        String str;
        ReadableMap readableMap;
        String str2;
        Cursor query;
        String str3 = ac;
        if (M.equals(intent.getAction())) {
            Context applicationContext = RNFetchBlob.RCTContext.getApplicationContext();
            if (intent.getExtras().getLong(G) == this.k) {
                m();
                DownloadManager.Query query2 = new DownloadManager.Query();
                query2.setFilterById(this.k);
                DownloadManager downloadManager = (DownloadManager) applicationContext.getSystemService(O);
                downloadManager.query(query2);
                Cursor query3 = downloadManager.query(query2);
                String str4 = ab;
                if (query3 == null) {
                    this.i.invoke(str4 + this.d + ah, null, null);
                    return;
                }
                try {
                    if (query3.moveToFirst()) {
                        int i2 = query3.getInt(query3.getColumnIndex(Q));
                        if (i2 == 16) {
                            this.i.invoke(str4 + this.d + I + i2, null, null);
                            if (query3 == null) {
                                return;
                            }
                            return;
                        }
                        String string = query3.getString(query3.getColumnIndex(D));
                        if (string != null && this.a.d.hasKey(str3) && this.a.d.getString(str3).contains(ao) && (query = applicationContext.getContentResolver().query(Uri.parse(string), new String[]{B}, null, null, null)) != null) {
                            query.moveToFirst();
                            str = query.getString(0);
                            query.close();
                            if (query3 != null) {
                                query3.close();
                            }
                            readableMap = this.a.d;
                            str2 = t;
                            if (!readableMap.hasKey(str2)) {
                                try {
                                    String string2 = this.a.d.getString(str2);
                                    if (new File(string2).exists()) {
                                        this.i.invoke(null, str2, string2);
                                        return;
                                    }
                                    throw new Exception(L);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    this.i.invoke(e2.getLocalizedMessage(), null);
                                    return;
                                }
                            } else if (str == null) {
                                this.i.invoke(C, str2, null);
                                return;
                            } else {
                                this.i.invoke(null, str2, str);
                                return;
                            }
                        }
                    }
                    str = null;
                    if (query3 != null) {
                    }
                    readableMap = this.a.d;
                    str2 = t;
                    if (!readableMap.hasKey(str2)) {
                    }
                } finally {
                    if (query3 != null) {
                        query3.close();
                    }
                }
            }
        }
    }

    public void run() {
        String str;
        OkHttpClient.Builder builder;
        String str2 = N;
        String str3 = ap;
        String str4 = U;
        ReadableMap readableMap = this.a.d;
        String str5 = R;
        if (readableMap != null) {
            String str6 = r;
            if (readableMap.hasKey(str6) && this.a.d.getBoolean(str6)) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.d));
                if (this.a.d.getBoolean(V)) {
                    request.setNotificationVisibility(1);
                } else {
                    request.setNotificationVisibility(2);
                }
                ReadableMap readableMap2 = this.a.d;
                String str7 = an;
                if (readableMap2.hasKey(str7)) {
                    request.setTitle(this.a.d.getString(str7));
                }
                ReadableMap readableMap3 = this.a.d;
                String str8 = F;
                if (readableMap3.hasKey(str8)) {
                    request.setDescription(this.a.d.getString(str8));
                }
                if (this.a.d.hasKey(str5)) {
                    request.setDestinationUri(Uri.parse(ae + this.a.d.getString(str5)));
                }
                ReadableMap readableMap4 = this.a.d;
                String str9 = aj;
                if (readableMap4.hasKey(str9)) {
                    request.setMimeType(this.a.d.getString(str9));
                }
                ReadableMapKeySetIterator keySetIterator = this.h.keySetIterator();
                ReadableMap readableMap5 = this.a.d;
                String str10 = X;
                if (readableMap5.hasKey(str10) && this.a.d.hasKey(str10)) {
                    request.allowScanningByMediaScanner();
                }
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    request.addRequestHeader(nextKey, this.h.getString(nextKey));
                }
                Context applicationContext = RNFetchBlob.RCTContext.getApplicationContext();
                long enqueue = ((DownloadManager) applicationContext.getSystemService(J)).enqueue(request);
                this.k = enqueue;
                x.put(this.b, Long.valueOf(enqueue));
                applicationContext.registerReceiver(this, new IntentFilter(aq));
                return;
            }
        }
        String str11 = this.b;
        boolean isEmpty = this.a.c.isEmpty();
        String str12 = S;
        if (isEmpty) {
            str = str12;
        } else {
            str = T + this.a.c;
        }
        String str13 = this.a.f;
        if (str13 != null) {
            str11 = h.b(str13);
            if (str11 == null) {
                str11 = this.b;
            }
            File file = new File(d.n(str11) + str);
            if (file.exists()) {
                this.i.invoke(null, str5, file.getAbsolutePath());
                return;
            }
        }
        b bVar = this.a;
        String str14 = bVar.b;
        if (str14 != null) {
            this.f = str14;
        } else if (bVar.a.booleanValue()) {
            this.f = d.n(str11) + str;
        }
        try {
            if (this.a.e.booleanValue()) {
                builder = h.c(this.v);
            } else {
                builder = this.v.newBuilder();
            }
            Request.Builder builder2 = new Request.Builder();
            try {
                builder2.url(new URL(this.d));
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
            }
            HashMap<String, String> hashMap = new HashMap<>();
            if (this.h != null) {
                ReadableMapKeySetIterator keySetIterator2 = this.h.keySetIterator();
                while (keySetIterator2.hasNextKey()) {
                    String nextKey2 = keySetIterator2.nextKey();
                    String string = this.h.getString(nextKey2);
                    if (!nextKey2.equalsIgnoreCase(af)) {
                        builder2.header(nextKey2.toLowerCase(), string);
                        hashMap.put(nextKey2.toLowerCase(), string);
                    } else if (string.equalsIgnoreCase(s)) {
                        this.o = f.BASE64;
                    } else if (string.equalsIgnoreCase(ag)) {
                        this.o = f.UTF8;
                    }
                }
            }
            boolean equalsIgnoreCase = this.c.equalsIgnoreCase(str3);
            String str15 = H;
            String str16 = W;
            String str17 = E;
            if (equalsIgnoreCase || this.c.equalsIgnoreCase(str16) || this.c.equalsIgnoreCase(str15)) {
                String lowerCase = g(hashMap, str4).toLowerCase();
                if (this.g != null) {
                    this.m = e.Form;
                } else if (lowerCase.isEmpty()) {
                    if (!lowerCase.equalsIgnoreCase(str12)) {
                        builder2.header(str4, Y);
                    }
                    this.m = e.SingleFile;
                }
                if (this.e != null) {
                    if (this.e.startsWith(am) || this.e.startsWith(al)) {
                        this.m = e.SingleFile;
                    } else if (lowerCase.toLowerCase().contains(str2) || lowerCase.toLowerCase().startsWith(Z)) {
                        String replace = lowerCase.replace(str2, str12).replace(K, str12);
                        if (hashMap.containsKey(str17)) {
                            hashMap.put(str17, replace);
                        }
                        if (hashMap.containsKey(str4)) {
                            hashMap.put(str4, replace);
                        }
                        this.m = e.SingleFile;
                    } else {
                        this.m = e.AsIs;
                    }
                }
            } else {
                this.m = e.WithoutBody;
            }
            boolean equalsIgnoreCase2 = g(hashMap, ai).equalsIgnoreCase(aa);
            int i2 = d.a[this.m.ordinal()];
            if (i2 == 1) {
                a aVar = new a(this.b);
                aVar.a(equalsIgnoreCase2);
                aVar.l(this.m);
                aVar.j(this.e);
                aVar.k(MediaType.parse(g(hashMap, str17)));
                this.l = aVar;
                builder2.method(this.c, aVar);
            } else if (i2 == 2) {
                a aVar2 = new a(this.b);
                aVar2.a(equalsIgnoreCase2);
                aVar2.l(this.m);
                aVar2.j(this.e);
                aVar2.k(MediaType.parse(g(hashMap, str17)));
                this.l = aVar2;
                builder2.method(this.c, aVar2);
            } else if (i2 == 3) {
                a aVar3 = new a(this.b);
                aVar3.a(equalsIgnoreCase2);
                aVar3.l(this.m);
                aVar3.i(this.g);
                aVar3.k(MediaType.parse(P + (ak + this.b)));
                this.l = aVar3;
                builder2.method(this.c, aVar3);
            } else if (i2 == 4) {
                if (this.c.equalsIgnoreCase(str3) || this.c.equalsIgnoreCase(str16) || this.c.equalsIgnoreCase(str15)) {
                    builder2.method(this.c, RequestBody.create((MediaType) null, new byte[0]));
                } else {
                    builder2.method(this.c, null);
                }
            }
            Request build = builder2.build();
            builder.addNetworkInterceptor(new a());
            builder.addInterceptor(new b(build));
            if (this.a.i >= 0) {
                builder.connectTimeout(this.a.i, TimeUnit.MILLISECONDS);
                builder.readTimeout(this.a.i, TimeUnit.MILLISECONDS);
            }
            builder.connectionPool(A);
            builder.retryOnConnectionFailure(false);
            builder.followRedirects(this.a.k.booleanValue());
            builder.followSslRedirects(this.a.k.booleanValue());
            builder.retryOnConnectionFailure(true);
            f(builder);
            Call newCall = builder.build().newCall(build);
            w.put(this.b, newCall);
            c40.a(newCall, new c());
        } catch (Exception e3) {
            e3.printStackTrace();
            m();
            this.i.invoke(ad + e3.getMessage() + e3.getCause());
        }
    }
}
