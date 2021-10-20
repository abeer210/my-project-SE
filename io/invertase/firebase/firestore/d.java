package io.invertase.firebase.firestore;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.MetadataChanges;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Source;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: RNFirebaseFirestoreCollectionReference */
public class d {
    private static Map<String, ListenerRegistration> h = new HashMap();
    private final String a;
    private final Query b = d();
    private final String c;
    private final ReadableMap d;
    private final ReadableArray e;
    private final ReadableArray f;
    private ReactContext g;

    /* compiled from: RNFirebaseFirestoreCollectionReference */
    class a extends c {
        public final /* synthetic */ Promise c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, ReactContext reactContext, d dVar2, Promise promise) {
            super(reactContext, dVar2);
            this.c = promise;
        }

        /* renamed from: c */
        public void onPostExecute(WritableMap writableMap) {
            this.c.resolve(writableMap);
        }
    }

    /* compiled from: RNFirebaseFirestoreCollectionReference */
    class b implements us1<QuerySnapshot> {
        public final /* synthetic */ c a;
        public final /* synthetic */ Promise b;

        public b(d dVar, c cVar, Promise promise) {
            this.a = cVar;
            this.b = promise;
        }

        @Override // defpackage.us1
        public void a(zs1<QuerySnapshot> zs1) {
            boolean p = zs1.p();
            String r1 = C0201.m82(29280);
            if (p) {
                Log.d(r1, C0201.m82(29281));
                this.a.execute(zs1.l());
                return;
            }
            Log.e(r1, C0201.m82(29282), zs1.k());
            RNFirebaseFirestore.promiseRejectException(this.b, zs1.k());
        }
    }

    /* compiled from: RNFirebaseFirestoreCollectionReference */
    class c implements EventListener<QuerySnapshot> {
        public c(d dVar, String str) {
        }
    }

    public d(ReactContext reactContext, String str, String str2, ReadableArray readableArray, ReadableArray readableArray2, ReadableMap readableMap) {
        this.c = str;
        this.a = str2;
        this.f = readableArray;
        this.e = readableArray2;
        this.d = readableMap;
        this.g = reactContext;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private Query a(FirebaseFirestore firebaseFirestore, Query query) {
        char c2;
        Query query2;
        char c3;
        Query query3 = query;
        for (int i = 0; i < this.f.size(); i++) {
            ReadableMap map = this.f.getMap(i);
            ReadableMap map2 = map.getMap(C0201.m82(10122));
            String string = map2.getString(C0201.m82(10123));
            String string2 = map.getString(C0201.m82(10124));
            Object i2 = b.i(firebaseFirestore, map.getMap(C0201.m82(10125)));
            String r9 = C0201.m82(10126);
            boolean equals = string.equals(r9);
            String r10 = C0201.m82(10127);
            String r11 = C0201.m82(10128);
            String r12 = C0201.m82(10129);
            String r13 = C0201.m82(10130);
            String r14 = C0201.m82(10131);
            String r15 = C0201.m82(10132);
            if (equals) {
                String string3 = map2.getString(r9);
                switch (string2.hashCode()) {
                    case -2081783184:
                        if (string2.equals(r15)) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1112834937:
                        if (string2.equals(r14)) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 66219796:
                        if (string2.equals(r13)) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 67210597:
                        if (string2.equals(r12)) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 972152550:
                        if (string2.equals(r11)) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 989027057:
                        if (string2.equals(r10)) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                if (c3 == 0) {
                    query3 = query3.whereEqualTo(string3, i2);
                } else if (c3 == 1) {
                    query3 = query3.whereGreaterThan(string3, i2);
                } else if (c3 == 2) {
                    query3 = query3.whereGreaterThanOrEqualTo(string3, i2);
                } else if (c3 == 3) {
                    query3 = query3.whereLessThan(string3, i2);
                } else if (c3 == 4) {
                    query3 = query3.whereLessThanOrEqualTo(string3, i2);
                } else if (c3 == 5) {
                    query3 = query3.whereArrayContains(string3, i2);
                }
            } else {
                ReadableArray array = map2.getArray(C0201.m82(10133));
                String[] strArr = new String[array.size()];
                for (int i3 = 0; i3 < array.size(); i3++) {
                    strArr[i3] = array.getString(i3);
                }
                FieldPath of = FieldPath.of(strArr);
                switch (string2.hashCode()) {
                    case -2081783184:
                        if (string2.equals(r15)) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1112834937:
                        if (string2.equals(r14)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 66219796:
                        if (string2.equals(r13)) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 67210597:
                        if (string2.equals(r12)) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 972152550:
                        if (string2.equals(r11)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 989027057:
                        if (string2.equals(r10)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    query2 = query3.whereEqualTo(of, i2);
                } else if (c2 == 1) {
                    query2 = query3.whereGreaterThan(of, i2);
                } else if (c2 == 2) {
                    query2 = query3.whereGreaterThanOrEqualTo(of, i2);
                } else if (c2 == 3) {
                    query2 = query3.whereLessThan(of, i2);
                } else if (c2 == 4) {
                    query2 = query3.whereLessThanOrEqualTo(of, i2);
                } else if (c2 == 5) {
                    query2 = query3.whereArrayContains(of, i2);
                }
                query3 = query2;
            }
        }
        return query3;
    }

    private Query b(FirebaseFirestore firebaseFirestore, Query query) {
        ReadableMap readableMap = this.d;
        String r1 = C0201.m82(10134);
        if (readableMap.hasKey(r1)) {
            query = query.endAt(b.g(firebaseFirestore, this.d.getArray(r1)).toArray());
        }
        ReadableMap readableMap2 = this.d;
        String r12 = C0201.m82(10135);
        if (readableMap2.hasKey(r12)) {
            query = query.endBefore(b.g(firebaseFirestore, this.d.getArray(r12)).toArray());
        }
        ReadableMap readableMap3 = this.d;
        String r13 = C0201.m82(10136);
        if (readableMap3.hasKey(r13)) {
            query = query.limit((long) this.d.getInt(r13));
        }
        ReadableMap readableMap4 = this.d;
        String r14 = C0201.m82(10137);
        if (readableMap4.hasKey(r14)) {
            query = query.startAfter(b.g(firebaseFirestore, this.d.getArray(r14)).toArray());
        }
        ReadableMap readableMap5 = this.d;
        String r15 = C0201.m82(10138);
        return readableMap5.hasKey(r15) ? query.startAt(b.g(firebaseFirestore, this.d.getArray(r15)).toArray()) : query;
    }

    private Query c(Query query) {
        Iterator<Object> it = io.invertase.firebase.c.i(this.e).iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str = (String) map.get(C0201.m82(10139));
            Map map2 = (Map) map.get(C0201.m82(10140));
            String r4 = C0201.m82(10142);
            if (((String) map2.get(C0201.m82(10141))).equals(r4)) {
                query = query.orderBy((String) map2.get(r4), Query.Direction.valueOf(str));
            } else {
                List list = (List) map2.get(C0201.m82(10143));
                query = query.orderBy(FieldPath.of((String[]) list.toArray(new String[list.size()])), Query.Direction.valueOf(str));
            }
        }
        return query;
    }

    private Query d() {
        FirebaseFirestore firestoreForApp = RNFirebaseFirestore.getFirestoreForApp(this.c);
        return b(firestoreForApp, c(a(firestoreForApp, firestoreForApp.collection(this.a))));
    }

    public static void f(String str) {
        ListenerRegistration remove = h.remove(str);
        if (remove != null) {
            remove.remove();
        }
    }

    public void e(ReadableMap readableMap, Promise promise) {
        Source source;
        if (readableMap != null) {
            String r0 = C0201.m82(10144);
            if (readableMap.hasKey(r0)) {
                String string = readableMap.getString(r0);
                if (C0201.m82(10145).equals(string)) {
                    source = Source.SERVER;
                } else if (C0201.m82(10146).equals(string)) {
                    source = Source.CACHE;
                } else {
                    source = Source.DEFAULT;
                }
                this.b.get(source).b(new b(this, new a(this, this.g, this, promise), promise));
            }
        }
        source = Source.DEFAULT;
        this.b.get(source).b(new b(this, new a(this, this.g, this, promise), promise));
    }

    public void g(String str, ReadableMap readableMap) {
        MetadataChanges metadataChanges;
        if (!h.containsKey(str)) {
            c cVar = new c(this, str);
            if (readableMap != null) {
                String r1 = C0201.m82(10147);
                if (readableMap.hasKey(r1) && readableMap.getBoolean(r1)) {
                    metadataChanges = MetadataChanges.INCLUDE;
                    h.put(str, this.b.addSnapshotListener(metadataChanges, cVar));
                }
            }
            metadataChanges = MetadataChanges.EXCLUDE;
            h.put(str, this.b.addSnapshotListener(metadataChanges, cVar));
        }
    }
}
