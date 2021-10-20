package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleSignInAccount extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();
    private static e n = h.d();
    private final int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Uri f;
    private String g;
    private long h;
    private String i;
    private List<Scope> j;
    private String k;
    private String l;
    private Set<Scope> m = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j2;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    public static GoogleSignInAccount E(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString(C0201.m82(30284), null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString(C0201.m82(30285)));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(30286));
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount F = F(jSONObject.optString(C0201.m82(30287)), jSONObject.optString(C0201.m82(30288), null), jSONObject.optString(C0201.m82(30289), null), jSONObject.optString(C0201.m82(30290), null), jSONObject.optString(C0201.m82(30291), null), jSONObject.optString(C0201.m82(30292), null), parse, Long.valueOf(parseLong), jSONObject.getString(C0201.m82(30293)), hashSet);
        F.g = jSONObject.optString(C0201.m82(30294), null);
        return F;
    }

    private static GoogleSignInAccount F(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(n.a() / 1000) : l2).longValue();
        u.g(str7);
        u.k(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    private final JSONObject P() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (u() != null) {
                jSONObject.put(C0201.m82(30295), u());
            }
            if (w() != null) {
                jSONObject.put(C0201.m82(30296), w());
            }
            if (p() != null) {
                jSONObject.put(C0201.m82(30297), p());
            }
            if (o() != null) {
                jSONObject.put(C0201.m82(30298), o());
            }
            if (s() != null) {
                jSONObject.put(C0201.m82(30299), s());
            }
            if (r() != null) {
                jSONObject.put(C0201.m82(30300), r());
            }
            if (y() != null) {
                jSONObject.put(C0201.m82(30301), y().toString());
            }
            if (A() != null) {
                jSONObject.put(C0201.m82(30302), A());
            }
            jSONObject.put(C0201.m82(30303), this.h);
            jSONObject.put(C0201.m82(30304), this.i);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.j.toArray(new Scope[this.j.size()]);
            Arrays.sort(scopeArr, b.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.o());
            }
            jSONObject.put(C0201.m82(30305), jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String A() {
        return this.g;
    }

    public Account B() {
        if (this.d == null) {
            return null;
        }
        return new Account(this.d, C0201.m82(30306));
    }

    public final String G() {
        return this.i;
    }

    public final String H() {
        JSONObject P = P();
        P.remove(C0201.m82(30307));
        return P.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.i.equals(this.i) && googleSignInAccount.z().equals(z());
    }

    public int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + z().hashCode();
    }

    public String o() {
        return this.e;
    }

    public String p() {
        return this.d;
    }

    public String r() {
        return this.l;
    }

    public String s() {
        return this.k;
    }

    public String u() {
        return this.b;
    }

    public String w() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.u(parcel, 2, u(), false);
        kp0.u(parcel, 3, w(), false);
        kp0.u(parcel, 4, p(), false);
        kp0.u(parcel, 5, o(), false);
        kp0.s(parcel, 6, y(), i2, false);
        kp0.u(parcel, 7, A(), false);
        kp0.q(parcel, 8, this.h);
        kp0.u(parcel, 9, this.i, false);
        kp0.y(parcel, 10, this.j, false);
        kp0.u(parcel, 11, s(), false);
        kp0.u(parcel, 12, r(), false);
        kp0.b(parcel, a2);
    }

    public Uri y() {
        return this.f;
    }

    public Set<Scope> z() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }
}
