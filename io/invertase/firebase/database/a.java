package io.invertase.firebase.database;

import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: RNFirebaseDatabaseReference */
public class a {
    private String a;
    private Query b;
    private String c;
    private String d;
    private HashMap<String, ChildEventListener> e = new HashMap<>();
    private HashMap<String, ValueEventListener> f = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: io.invertase.firebase.database.a$a  reason: collision with other inner class name */
    /* compiled from: RNFirebaseDatabaseReference */
    public class AsyncTaskC0145a extends f {
        public final /* synthetic */ Promise b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AsyncTaskC0145a(a aVar, a aVar2, Promise promise) {
            super(aVar2);
            this.b = promise;
        }

        /* renamed from: c */
        public void onPostExecute(WritableMap writableMap) {
            if (b().booleanValue()) {
                this.b.resolve(writableMap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFirebaseDatabaseReference */
    public class b implements ValueEventListener {
        public b(a aVar, f fVar, Promise promise) {
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFirebaseDatabaseReference */
    public class c implements ChildEventListener {
        public c(a aVar, String str, Promise promise) {
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFirebaseDatabaseReference */
    public class d implements ChildEventListener {
        public d(a aVar, String str, ReadableMap readableMap, String str2) {
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFirebaseDatabaseReference */
    public class e implements ValueEventListener {
        public e(a aVar, ReadableMap readableMap, String str) {
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: RNFirebaseDatabaseReference */
    public static class f extends AsyncTask<Object, Void, WritableMap> {
        private WeakReference<a> a;

        public f(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public final WritableMap doInBackground(Object... objArr) {
            try {
                return b.g((DataSnapshot) objArr[0], (String) objArr[1]);
            } catch (RuntimeException e) {
                if (b().booleanValue()) {
                    RNFirebaseDatabase.getReactApplicationContextInstance().handleException(e);
                }
                throw e;
            }
        }

        public Boolean b() {
            return Boolean.valueOf((RNFirebaseDatabase.getReactApplicationContextInstance() == null || this.a.get() == null) ? false : true);
        }
    }

    public a(String str, String str2, String str3, String str4, ReadableArray readableArray) {
        this.a = str3;
        this.b = null;
        this.c = str;
        this.d = str2;
        m(str4, readableArray);
    }

    private void a(ReadableMap readableMap, String str) {
        String string = readableMap.getString(C0201.m82(21205));
        readableMap.getString(C0201.m82(21206));
        if (!o(string).booleanValue()) {
            c(string, new d(this, str, readableMap, string));
        }
    }

    private void b(String str, Promise promise) {
        this.b.addChildEventListener(new c(this, str, promise));
    }

    private void c(String str, ChildEventListener childEventListener) {
        this.e.put(str, childEventListener);
        this.b.addChildEventListener(childEventListener);
    }

    private void d(String str, ValueEventListener valueEventListener) {
        this.f.put(str, valueEventListener);
        this.b.addValueEventListener(valueEventListener);
    }

    private void e(Promise promise) {
        this.b.addListenerForSingleValueEvent(new b(this, new AsyncTaskC0145a(this, this, promise), promise));
        Log.d(C0201.m82(21208), C0201.m82(21207) + this.a);
    }

    private void f(ReadableMap readableMap) {
        String string = readableMap.getString(C0201.m82(21209));
        if (!o(string).booleanValue()) {
            d(string, new e(this, readableMap, string));
        }
    }

    private void g(String str, String str2, Map map) {
        boolean equals = C0201.m82(21210).equals(str2);
        String r1 = C0201.m82(21211);
        if (equals) {
            double doubleValue = ((Double) map.get(r1)).doubleValue();
            if (str == null) {
                this.b = this.b.endAt(doubleValue);
            } else {
                this.b = this.b.endAt(doubleValue, str);
            }
        } else if (C0201.m82(21212).equals(str2)) {
            boolean booleanValue = ((Boolean) map.get(r1)).booleanValue();
            if (str == null) {
                this.b = this.b.endAt(booleanValue);
            } else {
                this.b = this.b.endAt(booleanValue, str);
            }
        } else if (C0201.m82(21213).equals(str2)) {
            String str3 = (String) map.get(r1);
            if (str == null) {
                this.b = this.b.endAt(str3);
            } else {
                this.b = this.b.endAt(str3, str);
            }
        }
    }

    private void h(String str, String str2, Map map) {
        boolean equals = C0201.m82(21214).equals(str2);
        String r1 = C0201.m82(21215);
        if (equals) {
            double doubleValue = ((Double) map.get(r1)).doubleValue();
            if (str == null) {
                this.b = this.b.equalTo(doubleValue);
            } else {
                this.b = this.b.equalTo(doubleValue, str);
            }
        } else if (C0201.m82(21216).equals(str2)) {
            boolean booleanValue = ((Boolean) map.get(r1)).booleanValue();
            if (str == null) {
                this.b = this.b.equalTo(booleanValue);
            } else {
                this.b = this.b.equalTo(booleanValue, str);
            }
        } else if (C0201.m82(21217).equals(str2)) {
            String str3 = (String) map.get(r1);
            if (str == null) {
                this.b = this.b.equalTo(str3);
            } else {
                this.b = this.b.equalTo(str3, str);
            }
        }
    }

    private void i(String str, Map map) {
        String str2 = (String) map.get(C0201.m82(21218));
        String str3 = (String) map.get(C0201.m82(21219));
        if (C0201.m82(21220).equals(str)) {
            h(str3, str2, map);
        } else if (C0201.m82(21221).equals(str)) {
            g(str3, str2, map);
        } else if (C0201.m82(21222).equals(str)) {
            l(str3, str2, map);
        }
    }

    private void j(String str, String str2, Map map) {
        int intValue = ((Double) map.get(C0201.m82(21223))).intValue();
        if (C0201.m82(21224).equals(str)) {
            this.b = this.b.limitToLast(intValue);
        } else if (C0201.m82(21225).equals(str)) {
            this.b = this.b.limitToFirst(intValue);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(String str, String str2, Map map) {
        char c2;
        switch (str.hashCode()) {
            case -626148087:
                if (str.equals(C0201.m82(21229))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 729747418:
                if (str.equals(C0201.m82(21228))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1200288727:
                if (str.equals(C0201.m82(21227))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1217630252:
                if (str.equals(C0201.m82(21226))) {
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
            this.b = this.b.orderByKey();
        } else if (c2 == 1) {
            this.b = this.b.orderByPriority();
        } else if (c2 == 2) {
            this.b = this.b.orderByValue();
        } else if (c2 == 3) {
            this.b = this.b.orderByChild((String) map.get(C0201.m82(21230)));
        }
    }

    private void l(String str, String str2, Map map) {
        boolean equals = C0201.m82(21231).equals(str2);
        String r1 = C0201.m82(21232);
        if (equals) {
            double doubleValue = ((Double) map.get(r1)).doubleValue();
            if (str == null) {
                this.b = this.b.startAt(doubleValue);
            } else {
                this.b = this.b.startAt(doubleValue, str);
            }
        } else if (C0201.m82(21233).equals(str2)) {
            boolean booleanValue = ((Boolean) map.get(r1)).booleanValue();
            if (str == null) {
                this.b = this.b.startAt(booleanValue);
            } else {
                this.b = this.b.startAt(booleanValue, str);
            }
        } else if (C0201.m82(21234).equals(str2)) {
            String str3 = (String) map.get(r1);
            if (str == null) {
                this.b = this.b.startAt(str3);
            } else {
                this.b = this.b.startAt(str3, str);
            }
        }
    }

    private void m(String str, ReadableArray readableArray) {
        this.b = RNFirebaseDatabase.getDatabaseForApp(this.c, this.d).getReference(str);
        Iterator<Object> it = io.invertase.firebase.c.i(readableArray).iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str2 = (String) map.get(C0201.m82(21235));
            String str3 = (String) map.get(C0201.m82(21236));
            if (C0201.m82(21237).equals(str2)) {
                k(str3, str2, map);
            } else if (C0201.m82(21238).equals(str2)) {
                j(str3, str2, map);
            } else if (C0201.m82(21239).equals(str2)) {
                i(str3, map);
            }
        }
    }

    private Boolean o(String str) {
        return Boolean.valueOf(this.f.containsKey(str) || this.e.containsKey(str));
    }

    public Query n() {
        return this.b;
    }

    public Boolean p() {
        return Boolean.valueOf(this.f.size() > 0 || this.e.size() > 0);
    }

    public void q(String str, ReadableMap readableMap) {
        if (str.equals(C0201.m82(21240))) {
            f(readableMap);
        } else {
            a(readableMap, str);
        }
    }

    public void r(String str, Promise promise) {
        if (str.equals(C0201.m82(21241))) {
            e(promise);
        } else {
            b(str, promise);
        }
    }

    public void s() {
        if (p().booleanValue()) {
            Iterator<Map.Entry<String, ValueEventListener>> it = this.f.entrySet().iterator();
            while (it.hasNext()) {
                this.b.removeEventListener(it.next().getValue());
                it.remove();
            }
            Iterator<Map.Entry<String, ChildEventListener>> it2 = this.e.entrySet().iterator();
            while (it2.hasNext()) {
                this.b.removeEventListener(it2.next().getValue());
                it2.remove();
            }
        }
    }

    public void t(String str) {
        if (this.f.containsKey(str)) {
            this.b.removeEventListener(this.f.get(str));
            this.f.remove(str);
        }
        if (this.e.containsKey(str)) {
            this.b.removeEventListener(this.e.get(str));
            this.e.remove(str);
        }
    }
}
