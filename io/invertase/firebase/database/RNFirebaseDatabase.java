package io.invertase.firebase.database;

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
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Logger;
import com.google.firebase.database.OnDisconnect;
import com.google.firebase.database.ServerValue;
import com.google.firebase.database.Transaction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

public class RNFirebaseDatabase extends ReactContextBaseJavaModule {
    private static final String TAG = null;
    private static boolean enableLogging;
    private static HashMap<String, Boolean> loggingLevelSet = new HashMap<>();
    private static ReactApplicationContext reactApplicationContext;
    private static HashMap<String, a> references = new HashMap<>();
    private static SparseArray<c> transactionHandlers = new SparseArray<>();

    class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Boolean d;

        /* renamed from: io.invertase.firebase.database.RNFirebaseDatabase$a$a  reason: collision with other inner class name */
        class C0144a implements Transaction.Handler {
            public C0144a(a aVar) {
            }
        }

        public a(String str, String str2, String str3, int i, Boolean bool) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
        }

        public void run() {
            RNFirebaseDatabase.this.getReferenceForAppPath(this.a, this.b, this.c).runTransaction(new C0144a(this), this.d.booleanValue());
        }
    }

    class b implements DatabaseReference.CompletionListener {
        public b(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class c implements DatabaseReference.CompletionListener {
        public c(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class d implements DatabaseReference.CompletionListener {
        public d(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class e implements DatabaseReference.CompletionListener {
        public e(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class f implements DatabaseReference.CompletionListener {
        public f(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class g implements DatabaseReference.CompletionListener {
        public g(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class h implements DatabaseReference.CompletionListener {
        public h(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class i implements DatabaseReference.CompletionListener {
        public i(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    class j implements DatabaseReference.CompletionListener {
        public j(RNFirebaseDatabase rNFirebaseDatabase, Promise promise) {
        }
    }

    static {
        C0201.m83(RNFirebaseDatabase.class, 206);
    }

    public RNFirebaseDatabase(ReactApplicationContext reactApplicationContext2) {
        super(reactApplicationContext2);
    }

    private a getCachedInternalReferenceForApp(String str, String str2, ReadableMap readableMap) {
        String string = readableMap.getString(C0201.m82(30808));
        String string2 = readableMap.getString(C0201.m82(30809));
        ReadableArray array = readableMap.getArray(C0201.m82(30810));
        a aVar = references.get(string);
        if (aVar != null) {
            return aVar;
        }
        a internalReferenceForApp = getInternalReferenceForApp(str, str2, string, string2, array);
        references.put(string, internalReferenceForApp);
        return internalReferenceForApp;
    }

    public static FirebaseDatabase getDatabaseForApp(String str, String str2) {
        FirebaseDatabase firebaseDatabase;
        if (str2 == null || str2.length() <= 0) {
            firebaseDatabase = FirebaseDatabase.getInstance(l12.l(str));
        } else if (str == null || str.length() <= 0) {
            firebaseDatabase = FirebaseDatabase.getInstance(str2);
        } else {
            firebaseDatabase = FirebaseDatabase.getInstance(l12.l(str), str2);
        }
        Boolean bool = loggingLevelSet.get(firebaseDatabase.getApp().m());
        boolean z = enableLogging;
        String r1 = C0201.m82(30811);
        String r2 = C0201.m82(30812);
        if (z && (bool == null || !bool.booleanValue())) {
            try {
                loggingLevelSet.put(firebaseDatabase.getApp().m(), Boolean.valueOf(enableLogging));
                firebaseDatabase.setLogLevel(Logger.Level.DEBUG);
            } catch (DatabaseException unused) {
                Log.w(r2, r1 + firebaseDatabase.getApp().m());
            }
        } else if (!enableLogging && bool != null && bool.booleanValue()) {
            try {
                loggingLevelSet.put(firebaseDatabase.getApp().m(), Boolean.valueOf(enableLogging));
                firebaseDatabase.setLogLevel(Logger.Level.WARN);
            } catch (DatabaseException unused2) {
                Log.w(r2, r1 + firebaseDatabase.getApp().m());
            }
        }
        return firebaseDatabase;
    }

    private a getInternalReferenceForApp(String str, String str2, String str3, String str4, ReadableArray readableArray) {
        return new a(str, str2, str3, str4, readableArray);
    }

    public static WritableMap getJSError(DatabaseError databaseError) {
        String str;
        String str2;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(30813), databaseError.getCode());
        createMap.putString(C0201.m82(30814), databaseError.getMessage());
        int code = databaseError.getCode();
        String r2 = C0201.m82(30815);
        if (code == -25) {
            str = io.invertase.firebase.a.a(r2, C0201.m82(30840));
            str2 = io.invertase.firebase.a.b(C0201.m82(30841), r2, str);
        } else if (code == -24) {
            str = io.invertase.firebase.a.a(r2, C0201.m82(30838));
            str2 = io.invertase.firebase.a.b(C0201.m82(30839), r2, str);
        } else if (code == -4) {
            str = io.invertase.firebase.a.a(r2, C0201.m82(30836));
            str2 = io.invertase.firebase.a.b(C0201.m82(30837), r2, str);
        } else if (code == -3) {
            str = io.invertase.firebase.a.a(r2, C0201.m82(30834));
            str2 = io.invertase.firebase.a.b(C0201.m82(30835), r2, str);
        } else if (code == -2) {
            str = io.invertase.firebase.a.a(r2, C0201.m82(30832));
            str2 = io.invertase.firebase.a.b(C0201.m82(30833), r2, str);
        } else if (code != -1) {
            switch (code) {
                case -11:
                    str = io.invertase.firebase.a.a(r2, C0201.m82(30828));
                    str2 = io.invertase.firebase.a.b(C0201.m82(30829), r2, str);
                    break;
                case -10:
                    str = io.invertase.firebase.a.a(r2, C0201.m82(30826));
                    str2 = io.invertase.firebase.a.b(C0201.m82(30827), r2, str);
                    break;
                case -9:
                    str = io.invertase.firebase.a.a(r2, C0201.m82(30824));
                    str2 = io.invertase.firebase.a.b(C0201.m82(30825), r2, str);
                    break;
                case -8:
                    str = io.invertase.firebase.a.a(r2, C0201.m82(30822));
                    str2 = io.invertase.firebase.a.b(C0201.m82(30823), r2, str);
                    break;
                case -7:
                    str = io.invertase.firebase.a.a(r2, C0201.m82(30820));
                    str2 = io.invertase.firebase.a.b(C0201.m82(30821), r2, str);
                    break;
                case -6:
                    str = io.invertase.firebase.a.a(r2, C0201.m82(30818));
                    str2 = io.invertase.firebase.a.b(C0201.m82(30819), r2, str);
                    break;
                default:
                    str = io.invertase.firebase.a.a(r2, C0201.m82(30816));
                    str2 = io.invertase.firebase.a.b(C0201.m82(30817), r2, str);
                    break;
            }
        } else {
            str = io.invertase.firebase.a.a(r2, C0201.m82(30830));
            str2 = io.invertase.firebase.a.b(C0201.m82(30831), r2, str);
        }
        createMap.putString(C0201.m82(30842), str);
        createMap.putString(C0201.m82(30843), str2);
        return createMap;
    }

    public static ReactApplicationContext getReactApplicationContextInstance() {
        return reactApplicationContext;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private DatabaseReference getReferenceForAppPath(String str, String str2, String str3) {
        return getDatabaseForApp(str, str2).getReference(str3);
    }

    public static void handlePromise(Promise promise, DatabaseError databaseError) {
        if (databaseError != null) {
            WritableMap jSError = getJSError(databaseError);
            promise.reject(jSError.getString(C0201.m82(30844)), jSError.getString(C0201.m82(30845)), (Throwable) databaseError.toException());
            return;
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void enableLogging(Boolean bool) {
        enableLogging = bool.booleanValue();
        for (l12 l12 : l12.j(getReactApplicationContext())) {
            loggingLevelSet.put(l12.m(), bool);
            try {
                if (enableLogging) {
                    FirebaseDatabase.getInstance(l12).setLogLevel(Logger.Level.DEBUG);
                } else {
                    FirebaseDatabase.getInstance(l12).setLogLevel(Logger.Level.WARN);
                }
            } catch (DatabaseException unused) {
                Log.w(C0201.m82(30847), C0201.m82(30846) + l12.m());
            }
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(30848), ServerValue.TIMESTAMP);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(30849);
    }

    @ReactMethod
    public void goOffline(String str, String str2) {
        getDatabaseForApp(str, str2).goOffline();
    }

    @ReactMethod
    public void goOnline(String str, String str2) {
        getDatabaseForApp(str, str2).goOnline();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        Log.d(C0201.m82(30850), C0201.m82(30851));
        reactApplicationContext = getReactApplicationContext();
    }

    @ReactMethod
    public void keepSynced(String str, String str2, String str3, String str4, ReadableArray readableArray, Boolean bool) {
        getInternalReferenceForApp(str, str2, str3, str4, readableArray).n().keepSynced(bool.booleanValue());
    }

    @ReactMethod
    public void off(String str, String str2) {
        a aVar = references.get(str);
        if (aVar != null) {
            aVar.t(str2);
            if (!aVar.p().booleanValue()) {
                references.remove(str);
            }
        }
    }

    @ReactMethod
    public void on(String str, String str2, ReadableMap readableMap) {
        getCachedInternalReferenceForApp(str, str2, readableMap).q(readableMap.getString(C0201.m82(30852)), readableMap.getMap(C0201.m82(30853)));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Iterator<Map.Entry<String, a>> it = references.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().s();
            it.remove();
        }
    }

    @ReactMethod
    public void onDisconnectCancel(String str, String str2, String str3, Promise promise) {
        getReferenceForAppPath(str, str2, str3).onDisconnect().cancel(new f(this, promise));
    }

    @ReactMethod
    public void onDisconnectRemove(String str, String str2, String str3, Promise promise) {
        getReferenceForAppPath(str, str2, str3).onDisconnect().removeValue(new e(this, promise));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactMethod
    public void onDisconnectSet(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        char c2;
        String string = readableMap.getString(C0201.m82(30854));
        OnDisconnect onDisconnect = getReferenceForAppPath(str, str2, str3).onDisconnect();
        c cVar = new c(this, promise);
        switch (string.hashCode()) {
            case -1034364087:
                if (string.equals(C0201.m82(30860))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1023368385:
                if (string.equals(C0201.m82(30859))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -891985903:
                if (string.equals(C0201.m82(30858))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3392903:
                if (string.equals(C0201.m82(30857))) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 64711720:
                if (string.equals(C0201.m82(30856))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 93090393:
                if (string.equals(C0201.m82(30855))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        String r0 = C0201.m82(30861);
        if (c2 == 0) {
            onDisconnect.setValue(io.invertase.firebase.c.j(readableMap.getMap(r0)), cVar);
        } else if (c2 == 1) {
            onDisconnect.setValue(io.invertase.firebase.c.i(readableMap.getArray(r0)), cVar);
        } else if (c2 == 2) {
            onDisconnect.setValue(readableMap.getString(r0), cVar);
        } else if (c2 == 3) {
            onDisconnect.setValue(Double.valueOf(readableMap.getDouble(r0)), cVar);
        } else if (c2 == 4) {
            onDisconnect.setValue(Boolean.valueOf(readableMap.getBoolean(r0)), cVar);
        } else if (c2 == 5) {
            onDisconnect.setValue((Object) null, cVar);
        }
    }

    @ReactMethod
    public void onDisconnectUpdate(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        getReferenceForAppPath(str, str2, str3).onDisconnect().updateChildren(io.invertase.firebase.c.j(readableMap), new d(this, promise));
    }

    @ReactMethod
    public void once(String str, String str2, String str3, String str4, ReadableArray readableArray, String str5, Promise promise) {
        getInternalReferenceForApp(str, str2, str3, str4, readableArray).r(str5, promise);
    }

    @ReactMethod
    public void remove(String str, String str2, String str3, Promise promise) {
        getReferenceForAppPath(str, str2, str3).removeValue(new b(this, promise));
    }

    @ReactMethod
    public void set(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        getReferenceForAppPath(str, str2, str3).setValue(io.invertase.firebase.c.j(readableMap).get(C0201.m82(30862)), new g(this, promise));
    }

    @ReactMethod
    public void setPersistence(String str, String str2, Boolean bool) {
        getDatabaseForApp(str, str2).setPersistenceEnabled(bool.booleanValue());
    }

    @ReactMethod
    public void setPersistenceCacheSizeBytes(String str, String str2, int i2) {
        getDatabaseForApp(str, str2).setPersistenceCacheSizeBytes((long) i2);
    }

    @ReactMethod
    public void setPriority(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        getReferenceForAppPath(str, str2, str3).setPriority(io.invertase.firebase.c.j(readableMap).get(C0201.m82(30863)), new h(this, promise));
    }

    @ReactMethod
    public void setWithPriority(String str, String str2, String str3, ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        DatabaseReference referenceForAppPath = getReferenceForAppPath(str, str2, str3);
        Map<String, Object> j2 = io.invertase.firebase.c.j(readableMap);
        String r3 = C0201.m82(30864);
        referenceForAppPath.setValue(j2.get(r3), io.invertase.firebase.c.j(readableMap2).get(r3), new i(this, promise));
    }

    @ReactMethod
    public void transactionStart(String str, String str2, String str3, int i2, Boolean bool) {
        AsyncTask.execute(new a(str, str2, str3, i2, bool));
    }

    @ReactMethod
    public void transactionTryCommit(String str, String str2, int i2, ReadableMap readableMap) {
        c cVar = transactionHandlers.get(i2);
        if (cVar != null) {
            cVar.a(readableMap);
        }
    }

    @ReactMethod
    public void update(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        getReferenceForAppPath(str, str2, str3).updateChildren(io.invertase.firebase.c.j(readableMap), new j(this, promise));
    }
}
