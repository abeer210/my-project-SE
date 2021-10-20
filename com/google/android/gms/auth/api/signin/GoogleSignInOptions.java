package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleSignInOptions extends ip0 implements a.d.c, a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new e();
    public static final Scope k = new Scope(C0201.m82(26705));
    public static final Scope l = new Scope(C0201.m82(26707));
    public static final Scope m = new Scope(C0201.m82(26708));
    public static final Scope n = new Scope(C0201.m82(26709));
    public static final GoogleSignInOptions o;
    private static Comparator<Scope> p = new d();
    private final int a;
    private final ArrayList<Scope> b;
    private Account c;
    private boolean d;
    private final boolean e;
    private final boolean f;
    private String g;
    private String h;
    private ArrayList<com.google.android.gms.auth.api.signin.internal.a> i;
    private String j;

    static {
        new Scope(C0201.m82(26706));
        a aVar = new a();
        aVar.b();
        aVar.c();
        o = aVar.a();
        a aVar2 = new a();
        aVar2.d(m, new Scope[0]);
        aVar2.a();
    }

    public GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<com.google.android.gms.auth.api.signin.internal.a> arrayList2, String str3) {
        this(i2, arrayList, account, z, z2, z3, str, str2, A(arrayList2), str3);
    }

    /* access modifiers changed from: private */
    public static Map<Integer, com.google.android.gms.auth.api.signin.internal.a> A(List<com.google.android.gms.auth.api.signin.internal.a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (com.google.android.gms.auth.api.signin.internal.a aVar : list) {
            hashMap.put(Integer.valueOf(aVar.o()), aVar);
        }
        return hashMap;
    }

    public static GoogleSignInOptions D(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(26710));
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.optString(C0201.m82(26711), null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, C0201.m82(26712)) : null, jSONObject.getBoolean(C0201.m82(26713)), jSONObject.getBoolean(C0201.m82(26714)), jSONObject.getBoolean(C0201.m82(26715)), jSONObject.optString(C0201.m82(26716), null), jSONObject.optString(C0201.m82(26717), null), new HashMap(), (String) null);
    }

    private final JSONObject H() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.b, p);
            ArrayList<Scope> arrayList = this.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Scope scope = arrayList.get(i2);
                i2++;
                jSONArray.put(scope.o());
            }
            jSONObject.put(C0201.m82(26718), jSONArray);
            if (this.c != null) {
                jSONObject.put(C0201.m82(26719), this.c.name);
            }
            jSONObject.put(C0201.m82(26720), this.d);
            jSONObject.put(C0201.m82(26721), this.f);
            jSONObject.put(C0201.m82(26722), this.e);
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put(C0201.m82(26723), this.g);
            }
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put(C0201.m82(26724), this.h);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Account B() {
        return this.c;
    }

    public final String Q() {
        return H().toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.c.equals(r4.B()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.g.equals(r4.s()) != false) goto L_0x006b;
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.i.size() <= 0) {
                if (googleSignInOptions.i.size() <= 0) {
                    if (this.b.size() == googleSignInOptions.r().size()) {
                        if (this.b.containsAll(googleSignInOptions.r())) {
                            if (this.c == null) {
                                if (googleSignInOptions.B() == null) {
                                }
                            }
                            if (TextUtils.isEmpty(this.g)) {
                                if (TextUtils.isEmpty(googleSignInOptions.s())) {
                                }
                            }
                            if (this.f == googleSignInOptions.u() && this.d == googleSignInOptions.w() && this.e == googleSignInOptions.y() && TextUtils.equals(this.j, googleSignInOptions.p())) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.b;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Scope scope = arrayList2.get(i2);
            i2++;
            arrayList.add(scope.o());
        }
        Collections.sort(arrayList);
        b bVar = new b();
        bVar.a(arrayList);
        bVar.a(this.c);
        bVar.a(this.g);
        bVar.c(this.f);
        bVar.c(this.d);
        bVar.c(this.e);
        bVar.a(this.j);
        return bVar.b();
    }

    public ArrayList<com.google.android.gms.auth.api.signin.internal.a> o() {
        return this.i;
    }

    public String p() {
        return this.j;
    }

    public ArrayList<Scope> r() {
        return new ArrayList<>(this.b);
    }

    public String s() {
        return this.g;
    }

    public boolean u() {
        return this.f;
    }

    public boolean w() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.y(parcel, 2, r(), false);
        kp0.s(parcel, 3, B(), i2, false);
        kp0.c(parcel, 4, w());
        kp0.c(parcel, 5, y());
        kp0.c(parcel, 6, u());
        kp0.u(parcel, 7, s(), false);
        kp0.u(parcel, 8, this.h, false);
        kp0.y(parcel, 9, o(), false);
        kp0.u(parcel, 10, p(), false);
        kp0.b(parcel, a2);
    }

    public boolean y() {
        return this.e;
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a {
        private Set<Scope> a = new HashSet();
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> h = new HashMap();
        private String i;

        public a() {
        }

        public final GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.n) && this.a.contains(GoogleSignInOptions.m)) {
                this.a.remove(GoogleSignInOptions.m);
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i, null);
        }

        public final a b() {
            this.a.add(GoogleSignInOptions.l);
            return this;
        }

        public final a c() {
            this.a.add(GoogleSignInOptions.k);
            return this;
        }

        public final a d(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            u.k(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.b);
            this.b = googleSignInOptions.e;
            this.c = googleSignInOptions.f;
            this.d = googleSignInOptions.d;
            this.e = googleSignInOptions.g;
            this.f = googleSignInOptions.c;
            this.g = googleSignInOptions.h;
            this.h = GoogleSignInOptions.A(googleSignInOptions.i);
            this.i = googleSignInOptions.j;
        }
    }

    private GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, com.google.android.gms.auth.api.signin.internal.a> map, String str3) {
        this.a = i2;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = new ArrayList<>(map.values());
        this.j = str3;
    }

    public /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, d dVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }
}
