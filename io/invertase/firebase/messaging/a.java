package io.invertase.firebase.messaging;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: BundleJSONConverter */
public class a {
    private static final Map<Class<?>, h> a;

    /* renamed from: io.invertase.firebase.messaging.a$a  reason: collision with other inner class name */
    /* compiled from: BundleJSONConverter */
    static class C0147a implements h {
        @Override // io.invertase.firebase.messaging.a.h
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // io.invertase.firebase.messaging.a.h
        public void b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: BundleJSONConverter */
    static class b implements h {
        @Override // io.invertase.firebase.messaging.a.h
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // io.invertase.firebase.messaging.a.h
        public void b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* compiled from: BundleJSONConverter */
    static class c implements h {
        @Override // io.invertase.firebase.messaging.a.h
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // io.invertase.firebase.messaging.a.h
        public void b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* compiled from: BundleJSONConverter */
    static class d implements h {
        @Override // io.invertase.firebase.messaging.a.h
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // io.invertase.firebase.messaging.a.h
        public void b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* compiled from: BundleJSONConverter */
    static class e implements h {
        @Override // io.invertase.firebase.messaging.a.h
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        @Override // io.invertase.firebase.messaging.a.h
        public void b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* compiled from: BundleJSONConverter */
    static class f implements h {
        @Override // io.invertase.firebase.messaging.a.h
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }

        @Override // io.invertase.firebase.messaging.a.h
        public void b(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException(C0201.m82(7957));
        }
    }

    /* compiled from: BundleJSONConverter */
    static class g implements h {
        @Override // io.invertase.firebase.messaging.a.h
        public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException(C0201.m82(7868));
        }

        @Override // io.invertase.firebase.messaging.a.h
        public void b(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            int i = 0;
            if (jSONArray.length() == 0 || (jSONArray.get(0) instanceof String)) {
                ArrayList<String> arrayList = new ArrayList<>();
                while (i < jSONArray.length()) {
                    arrayList.add((String) jSONArray.get(i));
                    i++;
                }
                bundle.putStringArrayList(str, arrayList);
            } else if (jSONArray.get(0) instanceof Integer) {
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                while (i < jSONArray.length()) {
                    arrayList2.add((Integer) jSONArray.get(i));
                    i++;
                }
                bundle.putIntegerArrayList(str, arrayList2);
            } else if (jSONArray.get(0) instanceof Boolean) {
                boolean[] zArr = new boolean[jSONArray.length()];
                while (i < jSONArray.length()) {
                    zArr[i] = ((Boolean) jSONArray.get(i)).booleanValue();
                    i++;
                }
                bundle.putBooleanArray(str, zArr);
            } else if (jSONArray.get(0) instanceof Double) {
                double[] dArr = new double[jSONArray.length()];
                while (i < jSONArray.length()) {
                    dArr[i] = ((Double) jSONArray.get(i)).doubleValue();
                    i++;
                }
                bundle.putDoubleArray(str, dArr);
            } else if (jSONArray.get(0) instanceof Long) {
                long[] jArr = new long[jSONArray.length()];
                while (i < jSONArray.length()) {
                    jArr[i] = ((Long) jSONArray.get(i)).longValue();
                    i++;
                }
                bundle.putLongArray(str, jArr);
            } else if (jSONArray.get(0) instanceof JSONObject) {
                ArrayList arrayList3 = new ArrayList();
                while (i < jSONArray.length()) {
                    arrayList3.add(a.a((JSONObject) jSONArray.get(i)));
                    i++;
                }
                bundle.putSerializable(str, arrayList3);
            } else {
                throw new IllegalArgumentException(C0201.m82(7869) + jSONArray.get(0).getClass());
            }
        }
    }

    /* compiled from: BundleJSONConverter */
    public interface h {
        void a(JSONObject jSONObject, String str, Object obj) throws JSONException;

        void b(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Boolean.class, new C0147a());
        a.put(Integer.class, new b());
        a.put(Long.class, new c());
        a.put(Double.class, new d());
        a.put(String.class, new e());
        a.put(String[].class, new f());
        a.put(JSONArray.class, new g());
    }

    public static Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.b(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException(C0201.m82(10150) + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }

    public static JSONObject b(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                boolean z = obj instanceof List;
                String r5 = C0201.m82(10151);
                if (z) {
                    JSONArray jSONArray = new JSONArray();
                    for (Object obj2 : (List) obj) {
                        if ((obj2 instanceof String) || (obj2 instanceof Integer) || (obj2 instanceof Double) || (obj2 instanceof Long) || (obj2 instanceof Boolean)) {
                            jSONArray.put(obj2);
                        } else if (obj2 instanceof Bundle) {
                            jSONArray.put(b((Bundle) obj2));
                        } else {
                            throw new IllegalArgumentException(r5 + obj2.getClass());
                        }
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, b((Bundle) obj));
                } else {
                    h hVar = a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.a(jSONObject, str, obj);
                    } else {
                        throw new IllegalArgumentException(r5 + obj.getClass());
                    }
                }
            }
        }
        return jSONObject;
    }
}
