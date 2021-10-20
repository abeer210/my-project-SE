package io.invertase.firebase.firestore;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.MetadataChanges;
import com.google.firebase.firestore.SetOptions;
import com.google.firebase.firestore.Source;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: RNFirebaseFirestoreDocumentReference */
public class e {
    private static Map<String, ListenerRegistration> d = new HashMap();
    private final String a;
    private final DocumentReference b;
    private ReactContext c;

    /* compiled from: RNFirebaseFirestoreDocumentReference */
    class a implements us1<Void> {
        public final /* synthetic */ Promise a;

        public a(e eVar, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31725);
            if (p) {
                Log.d(r1, C0201.m82(31726));
                this.a.resolve(null);
                return;
            }
            Log.e(r1, C0201.m82(31727), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.a, zs1.k());
        }
    }

    /* compiled from: RNFirebaseFirestoreDocumentReference */
    class b extends a {
        public final /* synthetic */ Promise c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, ReactContext reactContext, e eVar2, Promise promise) {
            super(reactContext, eVar2);
            this.c = promise;
        }

        /* renamed from: c */
        public void onPostExecute(WritableMap writableMap) {
            this.c.resolve(writableMap);
        }
    }

    /* compiled from: RNFirebaseFirestoreDocumentReference */
    class c implements us1<DocumentSnapshot> {
        public final /* synthetic */ a a;
        public final /* synthetic */ Promise b;

        public c(e eVar, a aVar, Promise promise) {
            this.a = aVar;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<DocumentSnapshot> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(31783);
            if (p) {
                Log.d(r1, C0201.m82(31784));
                this.a.execute(zs1.l());
                return;
            }
            Log.e(r1, C0201.m82(31785), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.b, zs1.k());
        }
    }

    /* compiled from: RNFirebaseFirestoreDocumentReference */
    class d implements EventListener<DocumentSnapshot> {
        public d(e eVar, String str) {
        }
    }

    /* renamed from: io.invertase.firebase.firestore.e$e  reason: collision with other inner class name */
    /* compiled from: RNFirebaseFirestoreDocumentReference */
    class C0146e implements us1<Void> {
        public final /* synthetic */ Promise a;

        public C0146e(e eVar, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(32026);
            if (p) {
                Log.d(r1, C0201.m82(32027));
                this.a.resolve(null);
                return;
            }
            Log.e(r1, C0201.m82(32028), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.a, zs1.k());
        }
    }

    /* compiled from: RNFirebaseFirestoreDocumentReference */
    class f implements us1<Void> {
        public final /* synthetic */ Promise a;

        public f(e eVar, Promise promise) {
            this.a = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<Void> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(32089);
            if (p) {
                Log.d(r1, C0201.m82(32090));
                this.a.resolve(null);
                return;
            }
            Log.e(r1, C0201.m82(32091), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.a, zs1.k());
        }
    }

    public e(ReactContext reactContext, String str, String str2) {
        this.a = str;
        this.c = reactContext;
        this.b = RNFirebaseFirestore.getFirestoreForApp(str).document(str2);
    }

    public static void d(String str) {
        ListenerRegistration remove = d.remove(str);
        if (remove != null) {
            remove.remove();
        }
    }

    public void a(Promise promise) {
        this.b.delete().b(new a(this, promise));
    }

    public void b(ReadableMap readableMap, Promise promise) {
        Source source;
        if (readableMap != null) {
            String r0 = C0201.m82(10263);
            if (readableMap.hasKey(r0)) {
                String string = readableMap.getString(r0);
                if (C0201.m82(10264).equals(string)) {
                    source = Source.SERVER;
                } else if (C0201.m82(10265).equals(string)) {
                    source = Source.CACHE;
                } else {
                    source = Source.DEFAULT;
                }
                this.b.get(source).b(new c(this, new b(this, this.c, this, promise), promise));
            }
        }
        source = Source.DEFAULT;
        this.b.get(source).b(new c(this, new b(this, this.c, this, promise), promise));
    }

    public DocumentReference c() {
        return this.b;
    }

    public void e(String str, ReadableMap readableMap) {
        MetadataChanges metadataChanges;
        if (!d.containsKey(str)) {
            d dVar = new d(this, str);
            if (readableMap != null) {
                String r1 = C0201.m82(10266);
                if (readableMap.hasKey(r1) && readableMap.getBoolean(r1)) {
                    metadataChanges = MetadataChanges.INCLUDE;
                    d.put(str, this.b.addSnapshotListener(metadataChanges, dVar));
                }
            }
            metadataChanges = MetadataChanges.EXCLUDE;
            d.put(str, this.b.addSnapshotListener(metadataChanges, dVar));
        }
    }

    public void f(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        zs1 zs1;
        Map<String, Object> h = b.h(RNFirebaseFirestore.getFirestoreForApp(this.a), readableMap);
        if (readableMap2 != null) {
            String r0 = C0201.m82(10267);
            if (readableMap2.hasKey(r0) && readableMap2.getBoolean(r0)) {
                zs1 = this.b.set(h, SetOptions.merge());
                zs1.b(new C0146e(this, promise));
            }
        }
        zs1 = this.b.set(h);
        zs1.b(new C0146e(this, promise));
    }

    public void g(ReadableMap readableMap, Promise promise) {
        this.b.update(b.h(RNFirebaseFirestore.getFirestoreForApp(this.a), readableMap)).b(new f(this, promise));
    }
}
