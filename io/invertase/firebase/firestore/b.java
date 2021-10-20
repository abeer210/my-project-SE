package io.invertase.firebase.firestore;

import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Blob;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.SnapshotMetadata;
import io.invertase.firebase.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: FirestoreSerialize */
public class b {

    /* access modifiers changed from: package-private */
    /* compiled from: FirestoreSerialize */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[DocumentChange.Type.values().length];
            a = iArr;
            iArr[DocumentChange.Type.ADDED.ordinal()] = 1;
            a[DocumentChange.Type.MODIFIED.ordinal()] = 2;
            try {
                a[DocumentChange.Type.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static WritableMap a(Object obj) {
        WritableMap createMap = Arguments.createMap();
        String r1 = C0201.m82(12429);
        String r2 = C0201.m82(12430);
        String r3 = C0201.m82(12431);
        if (obj == null) {
            createMap.putString(r3, r1);
            createMap.putNull(r2);
            return createMap;
        } else if (obj instanceof Boolean) {
            createMap.putString(r3, C0201.m82(12432));
            createMap.putBoolean(r2, ((Boolean) obj).booleanValue());
            return createMap;
        } else {
            boolean z = obj instanceof Integer;
            String r5 = C0201.m82(12433);
            if (z) {
                createMap.putString(r3, r5);
                createMap.putDouble(r2, ((Integer) obj).doubleValue());
                return createMap;
            } else if (obj instanceof Double) {
                Double d = (Double) obj;
                if (Double.isInfinite(d.doubleValue())) {
                    createMap.putString(r3, C0201.m82(12434));
                    return createMap;
                } else if (Double.isNaN(d.doubleValue())) {
                    createMap.putString(r3, C0201.m82(12435));
                    return createMap;
                } else {
                    createMap.putString(r3, r5);
                    createMap.putDouble(r2, d.doubleValue());
                    return createMap;
                }
            } else if (obj instanceof Float) {
                createMap.putString(r3, r5);
                createMap.putDouble(r2, ((Float) obj).doubleValue());
                return createMap;
            } else if (obj instanceof Long) {
                createMap.putString(r3, r5);
                createMap.putDouble(r2, ((Long) obj).doubleValue());
                return createMap;
            } else if (obj instanceof String) {
                createMap.putString(r3, C0201.m82(12436));
                createMap.putString(r2, (String) obj);
                return createMap;
            } else if (obj instanceof Date) {
                createMap.putString(r3, C0201.m82(12437));
                createMap.putDouble(r2, (double) ((Date) obj).getTime());
                return createMap;
            } else if (Map.class.isAssignableFrom(obj.getClass())) {
                createMap.putString(r3, C0201.m82(12438));
                createMap.putMap(r2, e((Map) obj));
                return createMap;
            } else if (List.class.isAssignableFrom(obj.getClass())) {
                createMap.putString(r3, C0201.m82(12439));
                List list = (List) obj;
                createMap.putArray(r2, d(list.toArray(new Object[list.size()])));
                return createMap;
            } else if (obj instanceof DocumentReference) {
                createMap.putString(r3, C0201.m82(12440));
                createMap.putString(r2, ((DocumentReference) obj).getPath());
                return createMap;
            } else if (obj instanceof Timestamp) {
                WritableMap createMap2 = Arguments.createMap();
                Timestamp timestamp = (Timestamp) obj;
                createMap2.putDouble(C0201.m82(12441), (double) timestamp.getSeconds());
                createMap2.putInt(C0201.m82(12442), timestamp.getNanoseconds());
                createMap.putString(r3, C0201.m82(12443));
                createMap.putMap(r2, createMap2);
                return createMap;
            } else if (obj instanceof GeoPoint) {
                WritableMap createMap3 = Arguments.createMap();
                GeoPoint geoPoint = (GeoPoint) obj;
                createMap3.putDouble(C0201.m82(12444), geoPoint.getLatitude());
                createMap3.putDouble(C0201.m82(12445), geoPoint.getLongitude());
                createMap.putMap(r2, createMap3);
                createMap.putString(r3, C0201.m82(12446));
                return createMap;
            } else if (obj instanceof Blob) {
                createMap.putString(r3, C0201.m82(12447));
                createMap.putString(r2, Base64.encodeToString(((Blob) obj).toBytes(), 2));
                return createMap;
            } else {
                Log.w(C0201.m82(12449), C0201.m82(12448) + obj.getClass());
                createMap.putString(r3, r1);
                createMap.putNull(r2);
                return createMap;
            }
        }
    }

    private static WritableMap b(DocumentChange documentChange) {
        WritableMap createMap = Arguments.createMap();
        int i = a.a[documentChange.getType().ordinal()];
        String r3 = C0201.m82(12450);
        if (i == 1) {
            createMap.putString(r3, C0201.m82(12453));
        } else if (i == 2) {
            createMap.putString(r3, C0201.m82(12452));
        } else if (i == 3) {
            createMap.putString(r3, C0201.m82(12451));
        }
        createMap.putMap(C0201.m82(12454), j(documentChange.getDocument()));
        createMap.putInt(C0201.m82(12455), documentChange.getNewIndex());
        createMap.putInt(C0201.m82(12456), documentChange.getOldIndex());
        return createMap;
    }

    private static WritableArray c(List<DocumentChange> list) {
        WritableArray createArray = Arguments.createArray();
        for (DocumentChange documentChange : list) {
            createArray.pushMap(b(documentChange));
        }
        return createArray;
    }

    private static WritableArray d(Object[] objArr) {
        WritableArray createArray = Arguments.createArray();
        for (Object obj : objArr) {
            createArray.pushMap(a(obj));
        }
        return createArray;
    }

    private static WritableMap e(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            createMap.putMap(entry.getKey(), a(entry.getValue()));
        }
        return createMap;
    }

    public static List<Object> f(FirebaseFirestore firebaseFirestore, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            HashMap hashMap = new HashMap();
            ReadableMap map = readableArray.getMap(i);
            String r4 = C0201.m82(12457);
            hashMap.put(r4, map.getString(r4));
            String r42 = C0201.m82(12458);
            hashMap.put(r42, map.getString(r42));
            String r43 = C0201.m82(12459);
            if (map.hasKey(r43)) {
                hashMap.put(r43, h(firebaseFirestore, map.getMap(r43)));
            }
            String r44 = C0201.m82(12460);
            if (map.hasKey(r44)) {
                hashMap.put(r44, c.j(map.getMap(r44)));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static List<Object> g(FirebaseFirestore firebaseFirestore, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray == null) {
            return arrayList;
        }
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(i(firebaseFirestore, readableArray.getMap(i)));
        }
        return arrayList;
    }

    public static Map<String, Object> h(FirebaseFirestore firebaseFirestore, ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        if (readableMap == null) {
            return hashMap;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, i(firebaseFirestore, readableMap.getMap(nextKey)));
        }
        return hashMap;
    }

    public static Object i(FirebaseFirestore firebaseFirestore, ReadableMap readableMap) {
        String r0 = C0201.m82(12461);
        String string = readableMap.getString(r0);
        if (C0201.m82(12462).equals(string)) {
            return null;
        }
        boolean equals = C0201.m82(12463).equals(string);
        String r4 = C0201.m82(12464);
        if (equals) {
            return Boolean.valueOf(readableMap.getBoolean(r4));
        }
        if (C0201.m82(12465).equals(string)) {
            return Double.valueOf(Double.NaN);
        }
        if (C0201.m82(12466).equals(string)) {
            return Double.valueOf(readableMap.getDouble(r4));
        }
        if (C0201.m82(12467).equals(string)) {
            return Double.valueOf(Double.POSITIVE_INFINITY);
        }
        if (C0201.m82(12468).equals(string)) {
            return readableMap.getString(r4);
        }
        if (C0201.m82(12469).equals(string)) {
            return g(firebaseFirestore, readableMap.getArray(r4));
        }
        if (C0201.m82(12470).equals(string)) {
            return h(firebaseFirestore, readableMap.getMap(r4));
        }
        if (C0201.m82(12471).equals(string)) {
            return new Date(Double.valueOf(readableMap.getDouble(r4)).longValue());
        }
        if (C0201.m82(12472).equals(string)) {
            return FieldPath.documentId();
        }
        if (C0201.m82(12473).equals(string)) {
            ReadableMap map = readableMap.getMap(r4);
            return new GeoPoint(map.getDouble(C0201.m82(12474)), map.getDouble(C0201.m82(12475)));
        } else if (C0201.m82(12476).equals(string)) {
            return Blob.fromBytes(Base64.decode(readableMap.getString(r4), 2));
        } else {
            if (C0201.m82(12477).equals(string)) {
                return firebaseFirestore.document(readableMap.getString(r4));
            }
            String r2 = C0201.m82(12478);
            if (r2.equals(string)) {
                ReadableMap map2 = readableMap.getMap(r4);
                return new Timestamp((long) map2.getDouble(C0201.m82(12479)), map2.getInt(C0201.m82(12480)));
            }
            boolean equals2 = C0201.m82(12481).equals(string);
            String r6 = C0201.m82(12482);
            if (equals2) {
                ReadableMap map3 = readableMap.getMap(r4);
                String string2 = map3.getString(r0);
                if (r2.equals(string2)) {
                    return FieldValue.serverTimestamp();
                }
                boolean equals3 = C0201.m82(12483).equals(string2);
                String r22 = C0201.m82(12484);
                if (equals3) {
                    return FieldValue.increment(map3.getDouble(r22));
                }
                if (C0201.m82(12485).equals(string2)) {
                    return FieldValue.delete();
                }
                if (C0201.m82(12486).equals(string2)) {
                    return FieldValue.arrayUnion(g(firebaseFirestore, map3.getArray(r22)).toArray());
                }
                if (C0201.m82(12487).equals(string2)) {
                    return FieldValue.arrayRemove(g(firebaseFirestore, map3.getArray(r22)).toArray());
                }
                Log.w(r6, C0201.m82(12488) + string2);
                return null;
            }
            Log.w(r6, C0201.m82(12489) + string);
            return null;
        }
    }

    public static WritableMap j(DocumentSnapshot documentSnapshot) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        SnapshotMetadata metadata = documentSnapshot.getMetadata();
        createMap.putBoolean(C0201.m82(12490), metadata.isFromCache());
        createMap.putBoolean(C0201.m82(12491), metadata.hasPendingWrites());
        createMap2.putMap(C0201.m82(12492), createMap);
        createMap2.putString(C0201.m82(12493), documentSnapshot.getReference().getPath());
        if (documentSnapshot.exists()) {
            createMap2.putMap(C0201.m82(12494), e(documentSnapshot.getData()));
        }
        return createMap2;
    }

    public static WritableMap k(QuerySnapshot querySnapshot) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        SnapshotMetadata metadata = querySnapshot.getMetadata();
        List<DocumentSnapshot> documents = querySnapshot.getDocuments();
        List documentChanges = querySnapshot.getDocumentChanges();
        for (DocumentSnapshot documentSnapshot : documents) {
            createArray.pushMap(j(documentSnapshot));
        }
        createMap.putBoolean(C0201.m82(12495), metadata.isFromCache());
        createMap.putBoolean(C0201.m82(12496), metadata.hasPendingWrites());
        createMap2.putMap(C0201.m82(12497), createMap);
        createMap2.putArray(C0201.m82(12498), createArray);
        createMap2.putArray(C0201.m82(12499), c(documentChanges));
        return createMap2;
    }
}
