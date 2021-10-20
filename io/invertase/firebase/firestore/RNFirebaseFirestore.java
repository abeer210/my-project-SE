package io.invertase.firebase.firestore;

import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.SetOptions;
import com.google.firebase.firestore.Transaction;
import com.google.firebase.firestore.WriteBatch;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

public class RNFirebaseFirestore extends ReactContextBaseJavaModule {
    private static final String TAG = null;
    private SparseArray<f> transactionHandlers = new SparseArray<>();

    class a implements us1<Void> {
        public final /* synthetic */ Promise a;

        public a(RNFirebaseFirestore rNFirebaseFirestore, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(12962);
            if (p) {
                Log.d(r1, C0201.m82(12963));
                this.a.resolve(null);
                return;
            }
            Log.e(r1, C0201.m82(12964), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.a, zs1.k());
        }
    }

    class b implements us1<Void> {
        public final /* synthetic */ Promise a;

        public b(RNFirebaseFirestore rNFirebaseFirestore, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(12656);
            if (p) {
                Log.d(r1, C0201.m82(12657));
                this.a.resolve(null);
                return;
            }
            Log.e(r1, C0201.m82(12658), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.a, zs1.k());
        }
    }

    class c implements us1<Void> {
        public final /* synthetic */ Promise a;

        public c(RNFirebaseFirestore rNFirebaseFirestore, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(12776);
            if (p) {
                Log.d(r1, C0201.m82(12777));
                this.a.resolve(null);
                return;
            }
            Log.e(r1, C0201.m82(12778), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.a, zs1.k());
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ f b;

        class a implements vs1 {
            public a() {
            }

            @Override // defpackage.vs1
            public void onFailure(Exception exc) {
                if (!d.this.b.c) {
                    Log.w(C0201.m82(16978), C0201.m82(16979), exc);
                    io.invertase.firebase.c.k(RNFirebaseFirestore.this.getReactApplicationContext(), C0201.m82(16981), d.this.b.b((FirebaseFirestoreException) exc, C0201.m82(16980)));
                }
            }
        }

        class b implements ws1<Void> {
            public b() {
            }

            /* renamed from: a */
            public void onSuccess(Void r3) {
                if (!d.this.b.c) {
                    Log.d(C0201.m82(16938), C0201.m82(16939));
                    io.invertase.firebase.c.k(RNFirebaseFirestore.this.getReactApplicationContext(), C0201.m82(16941), d.this.b.b(null, C0201.m82(16940)));
                }
            }
        }

        class c implements Transaction.Function<Void> {
            public c(d dVar) {
            }
        }

        public d(String str, f fVar) {
            this.a = str;
            this.b = fVar;
        }

        public void run() {
            zs1 runTransaction = RNFirebaseFirestore.getFirestoreForApp(this.a).runTransaction(new c(this));
            runTransaction.f(new b());
            runTransaction.d(new a());
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[FirebaseFirestoreException.Code.values().length];
            a = iArr;
            iArr[FirebaseFirestoreException.Code.OK.ordinal()] = 1;
            a[FirebaseFirestoreException.Code.CANCELLED.ordinal()] = 2;
            a[FirebaseFirestoreException.Code.UNKNOWN.ordinal()] = 3;
            a[FirebaseFirestoreException.Code.INVALID_ARGUMENT.ordinal()] = 4;
            a[FirebaseFirestoreException.Code.DEADLINE_EXCEEDED.ordinal()] = 5;
            a[FirebaseFirestoreException.Code.NOT_FOUND.ordinal()] = 6;
            a[FirebaseFirestoreException.Code.ALREADY_EXISTS.ordinal()] = 7;
            a[FirebaseFirestoreException.Code.PERMISSION_DENIED.ordinal()] = 8;
            a[FirebaseFirestoreException.Code.RESOURCE_EXHAUSTED.ordinal()] = 9;
            a[FirebaseFirestoreException.Code.FAILED_PRECONDITION.ordinal()] = 10;
            a[FirebaseFirestoreException.Code.ABORTED.ordinal()] = 11;
            a[FirebaseFirestoreException.Code.OUT_OF_RANGE.ordinal()] = 12;
            a[FirebaseFirestoreException.Code.UNIMPLEMENTED.ordinal()] = 13;
            a[FirebaseFirestoreException.Code.INTERNAL.ordinal()] = 14;
            a[FirebaseFirestoreException.Code.UNAVAILABLE.ordinal()] = 15;
            a[FirebaseFirestoreException.Code.DATA_LOSS.ordinal()] = 16;
            a[FirebaseFirestoreException.Code.UNAUTHENTICATED.ordinal()] = 17;
        }
    }

    static {
        C0201.m83(RNFirebaseFirestore.class, 713);
    }

    public RNFirebaseFirestore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private d getCollectionForAppPath(String str, String str2, ReadableArray readableArray, ReadableArray readableArray2, ReadableMap readableMap) {
        return new d(getReactApplicationContext(), str, str2, readableArray, readableArray2, readableMap);
    }

    /* access modifiers changed from: private */
    public e getDocumentForAppPath(String str, String str2) {
        return new e(getReactApplicationContext(), str, str2);
    }

    public static FirebaseFirestore getFirestoreForApp(String str) {
        return FirebaseFirestore.getInstance(l12.l(str));
    }

    public static WritableMap getJSError(FirebaseFirestoreException firebaseFirestoreException) {
        String str;
        String str2;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(34270), firebaseFirestoreException.getCode().value());
        createMap.putString(C0201.m82(34271), firebaseFirestoreException.getMessage());
        int i = e.a[firebaseFirestoreException.getCode().ordinal()];
        String r1 = C0201.m82(34272);
        String r2 = C0201.m82(34273);
        switch (i) {
            case 1:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34306));
                str2 = io.invertase.firebase.a.b(C0201.m82(34307), r2, str);
                break;
            case 2:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34304));
                str2 = io.invertase.firebase.a.b(C0201.m82(34305), r2, str);
                break;
            case 3:
                str = io.invertase.firebase.a.a(r2, r1);
                str2 = io.invertase.firebase.a.b(C0201.m82(34303), r2, str);
                break;
            case 4:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34301));
                str2 = io.invertase.firebase.a.b(C0201.m82(34302), r2, str);
                break;
            case 5:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34299));
                str2 = io.invertase.firebase.a.b(C0201.m82(34300), r2, str);
                break;
            case 6:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34297));
                str2 = io.invertase.firebase.a.b(C0201.m82(34298), r2, str);
                break;
            case 7:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34295));
                str2 = io.invertase.firebase.a.b(C0201.m82(34296), r2, str);
                break;
            case 8:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34293));
                str2 = io.invertase.firebase.a.b(C0201.m82(34294), r2, str);
                break;
            case 9:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34291));
                str2 = io.invertase.firebase.a.b(C0201.m82(34292), r2, str);
                break;
            case 10:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34289));
                str2 = io.invertase.firebase.a.b(C0201.m82(34290), r2, str);
                break;
            case 11:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34287));
                str2 = io.invertase.firebase.a.b(C0201.m82(34288), r2, str);
                break;
            case 12:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34285));
                str2 = io.invertase.firebase.a.b(C0201.m82(34286), r2, str);
                break;
            case 13:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34283));
                str2 = io.invertase.firebase.a.b(C0201.m82(34284), r2, str);
                break;
            case 14:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34281));
                str2 = io.invertase.firebase.a.b(C0201.m82(34282), r2, str);
                break;
            case 15:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34279));
                str2 = io.invertase.firebase.a.b(C0201.m82(34280), r2, str);
                break;
            case 16:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34277));
                str2 = io.invertase.firebase.a.b(C0201.m82(34278), r2, str);
                break;
            case 17:
                str = io.invertase.firebase.a.a(r2, C0201.m82(34275));
                str2 = io.invertase.firebase.a.b(C0201.m82(34276), r2, str);
                break;
            default:
                str = io.invertase.firebase.a.a(r2, r1);
                str2 = io.invertase.firebase.a.b(C0201.m82(34274), r2, str);
                break;
        }
        createMap.putString(C0201.m82(34308), str);
        createMap.putString(C0201.m82(34309), str2);
        return createMap;
    }

    public static void promiseRejectException(Promise promise, FirebaseFirestoreException firebaseFirestoreException) {
        WritableMap jSError = getJSError(firebaseFirestoreException);
        promise.reject(jSError.getString(C0201.m82(34310)), jSError.getString(C0201.m82(34311)), (Throwable) firebaseFirestoreException);
    }

    @ReactMethod
    public void collectionGet(String str, String str2, ReadableArray readableArray, ReadableArray readableArray2, ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        getCollectionForAppPath(str, str2, readableArray, readableArray2, readableMap).e(readableMap2, promise);
    }

    @ReactMethod
    public void collectionOffSnapshot(String str, String str2, ReadableArray readableArray, ReadableArray readableArray2, ReadableMap readableMap, String str3) {
        d.f(str3);
    }

    @ReactMethod
    public void collectionOnSnapshot(String str, String str2, ReadableArray readableArray, ReadableArray readableArray2, ReadableMap readableMap, String str3, ReadableMap readableMap2) {
        getCollectionForAppPath(str, str2, readableArray, readableArray2, readableMap).g(str3, readableMap2);
    }

    @ReactMethod
    public void disableNetwork(String str, Promise promise) {
        getFirestoreForApp(str).disableNetwork().b(new a(this, promise));
    }

    @ReactMethod
    public void documentBatch(String str, ReadableArray readableArray, Promise promise) {
        FirebaseFirestore firestoreForApp = getFirestoreForApp(str);
        WriteBatch batch = firestoreForApp.batch();
        Iterator<Object> it = b.f(firestoreForApp, readableArray).iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str2 = (String) map.get(C0201.m82(34312));
            Map map2 = (Map) map.get(C0201.m82(34314));
            DocumentReference document = firestoreForApp.document((String) map.get(C0201.m82(34313)));
            char c2 = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1785516855) {
                if (hashCode != 81986) {
                    if (hashCode == 2012838315 && str2.equals(C0201.m82(34315))) {
                        c2 = 0;
                    }
                } else if (str2.equals(C0201.m82(34316))) {
                    c2 = 1;
                }
            } else if (str2.equals(C0201.m82(34317))) {
                c2 = 2;
            }
            if (c2 == 0) {
                batch = batch.delete(document);
            } else if (c2 == 1) {
                Map map3 = (Map) map.get(C0201.m82(34318));
                if (map3 != null) {
                    String r2 = C0201.m82(34319);
                    if (map3.containsKey(r2) && ((Boolean) map3.get(r2)).booleanValue()) {
                        batch = batch.set(document, map2, SetOptions.merge());
                    }
                }
                batch = batch.set(document, map2);
            } else if (c2 == 2) {
                batch = batch.update(document, map2);
            }
        }
        batch.commit().b(new c(this, promise));
    }

    @ReactMethod
    public void documentDelete(String str, String str2, Promise promise) {
        getDocumentForAppPath(str, str2).a(promise);
    }

    @ReactMethod
    public void documentGet(String str, String str2, ReadableMap readableMap, Promise promise) {
        getDocumentForAppPath(str, str2).b(readableMap, promise);
    }

    @ReactMethod
    public void documentOffSnapshot(String str, String str2, String str3) {
        e.d(str3);
    }

    @ReactMethod
    public void documentOnSnapshot(String str, String str2, String str3, ReadableMap readableMap) {
        getDocumentForAppPath(str, str2).e(str3, readableMap);
    }

    @ReactMethod
    public void documentSet(String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        getDocumentForAppPath(str, str2).f(readableMap, readableMap2, promise);
    }

    @ReactMethod
    public void documentUpdate(String str, String str2, ReadableMap readableMap, Promise promise) {
        getDocumentForAppPath(str, str2).g(readableMap, promise);
    }

    @ReactMethod
    public void enableNetwork(String str, Promise promise) {
        getFirestoreForApp(str).enableNetwork().b(new b(this, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(34320), FieldValue.delete().toString());
        hashMap.put(C0201.m82(34321), FieldValue.serverTimestamp().toString());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(34322);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        int size = this.transactionHandlers.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.transactionHandlers.get(i);
            if (fVar != null) {
                fVar.a();
            }
        }
        this.transactionHandlers.clear();
    }

    @ReactMethod
    public void setLogLevel(String str) {
        if (C0201.m82(34323).equals(str) || C0201.m82(34324).equals(str)) {
            FirebaseFirestore.setLoggingEnabled(true);
        } else {
            FirebaseFirestore.setLoggingEnabled(false);
        }
    }

    @ReactMethod
    public void settings(String str, ReadableMap readableMap, Promise promise) {
        FirebaseFirestore firestoreForApp = getFirestoreForApp(str);
        FirebaseFirestoreSettings.Builder builder = new FirebaseFirestoreSettings.Builder();
        String r1 = C0201.m82(34325);
        if (readableMap.hasKey(r1)) {
            builder.setHost(readableMap.getString(r1));
        } else {
            builder.setHost(firestoreForApp.getFirestoreSettings().getHost());
        }
        String r12 = C0201.m82(34326);
        if (readableMap.hasKey(r12)) {
            builder.setPersistenceEnabled(readableMap.getBoolean(r12));
        } else {
            builder.setPersistenceEnabled(firestoreForApp.getFirestoreSettings().isPersistenceEnabled());
        }
        String r13 = C0201.m82(34327);
        if (readableMap.hasKey(r13)) {
            int i = readableMap.getInt(r13);
            if (i == -1) {
                builder.setCacheSizeBytes(-1);
            } else {
                builder.setCacheSizeBytes((long) i);
            }
        } else {
            builder.setCacheSizeBytes(firestoreForApp.getFirestoreSettings().getCacheSizeBytes());
        }
        String r14 = C0201.m82(34328);
        if (readableMap.hasKey(r14)) {
            builder.setSslEnabled(readableMap.getBoolean(r14));
        } else {
            builder.setSslEnabled(firestoreForApp.getFirestoreSettings().isSslEnabled());
        }
        String r15 = C0201.m82(34329);
        if (readableMap.hasKey(r15)) {
            builder.setTimestampsInSnapshotsEnabled(readableMap.getBoolean(r15));
        }
        firestoreForApp.setFirestoreSettings(builder.build());
        promise.resolve(null);
    }

    @ReactMethod
    public void transactionApplyBuffer(String str, int i, ReadableArray readableArray) {
        f fVar = this.transactionHandlers.get(i);
        if (fVar != null) {
            fVar.e(readableArray);
        }
    }

    @ReactMethod
    public void transactionBegin(String str, int i) {
        f fVar = new f(str, i);
        this.transactionHandlers.put(i, fVar);
        AsyncTask.execute(new d(str, fVar));
    }

    @ReactMethod
    public void transactionDispose(String str, int i) {
        f fVar = this.transactionHandlers.get(i);
        if (fVar != null) {
            fVar.a();
            this.transactionHandlers.delete(i);
        }
    }

    @ReactMethod
    public void transactionGetDocument(String str, int i, String str2, Promise promise) {
        f fVar = this.transactionHandlers.get(i);
        if (fVar == null) {
            promise.reject(C0201.m82(34330), C0201.m82(34331));
        } else {
            fVar.c(getDocumentForAppPath(str, str2).c(), promise);
        }
    }
}
