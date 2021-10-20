package com.huawei.hms.support.api.hwid;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class SignInHuaweiId implements Parcelable {
    public static final Parcelable.Creator<SignInHuaweiId> CREATOR = new Parcelable.Creator<SignInHuaweiId>() {
        /* class com.huawei.hms.support.api.hwid.SignInHuaweiId.AnonymousClass1 */

        /* renamed from: a */
        public SignInHuaweiId createFromParcel(Parcel parcel) {
            return new SignInHuaweiId(parcel);
        }

        /* renamed from: a */
        public SignInHuaweiId[] newArray(int i) {
            return new SignInHuaweiId[i];
        }
    };
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private String h;
    private String i;
    private Set<Scope> j;
    private String k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();
    private String o;
    private long p;
    private String q;
    private String r;

    public SignInHuaweiId(String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, Set<Scope> set, String str7, String str8, String str9) {
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.h = str6;
        this.f = i2;
        this.g = i3;
        this.j = set;
        this.k = str7;
        this.l = str8;
        this.i = str9;
    }

    public static SignInHuaweiId build(String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, Set<Scope> set, String str7, String str8, String str9) {
        return new SignInHuaweiId(str, str2, str3, str4, str5, str6, i2, i3, set, str7, str8, str9);
    }

    public static SignInHuaweiId createDefault() {
        return build(null, null, null, null, null, null, 0, -1, new HashSet(), null, null, null);
    }

    public static SignInHuaweiId fromJson(String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            return fromJson(new JSONObject(str));
        }
        throw new JSONException(C0201.m82(5656));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInHuaweiId)) {
            return false;
        }
        return getGrantedScopes().equals(((SignInHuaweiId) obj).getGrantedScopes());
    }

    public String getAccessToken() {
        return this.e;
    }

    public Account getAccount() {
        if (this.m == null) {
            return null;
        }
        return new Account(this.m, C0201.m82(5657));
    }

    public String getCountryCode() {
        return this.i;
    }

    public String getDisplayName() {
        return this.c;
    }

    public String getEmail() {
        return this.m;
    }

    public long getExpirationTimeSecs() {
        return this.p;
    }

    public Set<Scope> getExtensionScopes() {
        return this.n;
    }

    public String getFamilyName() {
        return this.r;
    }

    public int getGender() {
        return this.g;
    }

    public String getGivenName() {
        return this.q;
    }

    public Set<Scope> getGrantedScopes() {
        return this.j;
    }

    public String getId() {
        return getUnionId();
    }

    public String getIdToken() {
        return this.o;
    }

    public String getOpenId() {
        return this.b;
    }

    public String getPhotoUriString() {
        return this.d;
    }

    public Uri getPhotoUrl() {
        String str = this.d;
        if (str == null) {
            str = C0201.m82(5658);
        }
        return Uri.parse(str);
    }

    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public String getServerAuthCode() {
        return this.k;
    }

    public String getServiceCountryCode() {
        return this.h;
    }

    public int getStatus() {
        return this.f;
    }

    public String getUid() {
        return this.a;
    }

    public String getUnionId() {
        return this.l;
    }

    public int hashCode() {
        return getRequestedScopes().hashCode();
    }

    public boolean isExpired() {
        if (this.p <= 300 || System.currentTimeMillis() / 1000 < this.p - 300) {
            return false;
        }
        return true;
    }

    public JSONObject jsonPutOpt(JSONObject jSONObject) throws JSONException {
        if (getExtensionScopes() != null) {
            JSONArray jSONArray = new JSONArray();
            for (Scope scope : getExtensionScopes()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(C0201.m82(5659), scope.getScopeUri());
                jSONArray.put(jSONObject2);
            }
            jSONObject.putOpt(C0201.m82(5660), jSONArray);
        }
        return jSONObject;
    }

    public JSONObject jsonPutScopes(JSONObject jSONObject) throws JSONException {
        if (getGrantedScopes() != null) {
            JSONArray jSONArray = new JSONArray();
            for (Scope scope : getGrantedScopes()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(C0201.m82(5661), scope.getScopeUri());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(C0201.m82(5662), jSONArray);
        }
        return jSONObject;
    }

    public JSONObject objectToJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (getUid() != null) {
            jSONObject.put(C0201.m82(5663), getUid());
        }
        if (getOpenId() != null) {
            jSONObject.put(C0201.m82(5664), getOpenId());
        }
        if (getDisplayName() != null) {
            jSONObject.put(C0201.m82(5665), getDisplayName());
        }
        if (getPhotoUriString() != null) {
            jSONObject.put(C0201.m82(5666), getPhotoUriString());
        }
        if (getAccessToken() != null) {
            jSONObject.put(C0201.m82(5667), getAccessToken());
        }
        jSONObject.put(C0201.m82(5668), getStatus());
        jSONObject.put(C0201.m82(5669), getGender());
        if (getServerAuthCode() != null) {
            jSONObject.put(C0201.m82(5670), getServerAuthCode());
        }
        if (getServiceCountryCode() != null) {
            jSONObject.put(C0201.m82(5671), getServiceCountryCode());
        }
        if (getCountryCode() != null) {
            jSONObject.put(C0201.m82(5672), getCountryCode());
        }
        if (getUnionId() != null) {
            jSONObject.put(C0201.m82(5673), getUnionId());
        }
        if (getEmail() != null) {
            jSONObject.put(C0201.m82(5674), getEmail());
        }
        if (getIdToken() != null) {
            jSONObject.put(C0201.m82(5675), getIdToken());
        }
        jSONObject.put(C0201.m82(5676), getExpirationTimeSecs());
        if (getGivenName() != null) {
            jSONObject.put(C0201.m82(5677), getGivenName());
        }
        if (getFamilyName() != null) {
            jSONObject.put(C0201.m82(5678), getFamilyName());
        }
        return jsonPutOpt(jsonPutScopes(jSONObject));
    }

    public void parserJson(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.optString(C0201.m82(5679), null);
        this.b = jSONObject.optString(C0201.m82(5680), null);
        this.c = jSONObject.optString(C0201.m82(5681), null);
        this.d = jSONObject.optString(C0201.m82(5682), null);
        this.e = jSONObject.optString(C0201.m82(5683), null);
        this.f = jSONObject.optInt(C0201.m82(5684), -1);
        this.g = jSONObject.optInt(C0201.m82(5685), -1);
        this.k = jSONObject.optString(C0201.m82(5686), null);
        this.h = jSONObject.optString(C0201.m82(5687), null);
        this.i = jSONObject.optString(C0201.m82(5688), null);
        JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(5689));
        if (jSONArray != null) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String optString = jSONArray.getJSONObject(i2).optString(C0201.m82(5690), null);
                if (optString != null) {
                    hashSet.add(new Scope(optString));
                }
            }
            this.j = hashSet;
        }
        this.l = jSONObject.optString(C0201.m82(5691), null);
        this.m = jSONObject.optString(C0201.m82(5692), null);
        this.o = jSONObject.optString(C0201.m82(5693), null);
        this.p = Long.parseLong(jSONObject.getString(C0201.m82(5694)));
        this.q = jSONObject.optString(C0201.m82(5695), null);
        this.r = jSONObject.optString(C0201.m82(5696), null);
    }

    public void readFromParcel(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.k = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = new HashSet(parcel.createTypedArrayList(Scope.CREATOR));
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readLong();
        this.q = parcel.readString();
        this.r = parcel.readString();
    }

    public SignInHuaweiId requestExtraScopes(Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.n, scopeArr);
        }
        return this;
    }

    public void setEmail(String str) {
        this.m = str;
    }

    public void setExpirationTimeSecs(long j2) {
        this.p = j2;
    }

    public void setExtensionScopes(Set<Scope> set) {
        this.n = set;
    }

    public void setFamilyName(String str) {
        this.r = str;
    }

    public void setGivenName(String str) {
        this.q = str;
    }

    public void setIdToken(String str) {
        this.o = str;
    }

    public void setPhotoUriString(String str) {
        this.d = str;
    }

    public String toJson() throws JSONException {
        return objectToJson().toString();
    }

    public String toString() {
        return C0201.m82(5697) + this.a + ',' + C0201.m82(5698) + this.c + ',' + C0201.m82(5699) + this.d + ',' + C0201.m82(5700) + this.f + ',' + C0201.m82(5701) + this.g + ',' + C0201.m82(5702) + this.h + ',' + C0201.m82(5703) + this.i + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.k);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeList(new ArrayList(this.j));
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.o);
        parcel.writeLong(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
    }

    public static SignInHuaweiId fromJson(JSONObject jSONObject) throws JSONException {
        SignInHuaweiId signInHuaweiId = new SignInHuaweiId();
        signInHuaweiId.parserJson(jSONObject);
        return signInHuaweiId;
    }

    public SignInHuaweiId(Parcel parcel) {
        readFromParcel(parcel);
    }

    public SignInHuaweiId() {
    }
}
