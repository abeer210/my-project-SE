package com.huawei.hms.support.api.hwid;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInOptionsExtension;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class HuaweiIdSignInOptions implements Parcelable, Api.ApiOptions.HasOptions {
    public static final Parcelable.Creator<HuaweiIdSignInOptions> CREATOR = new Parcelable.Creator<HuaweiIdSignInOptions>() {
        /* class com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions.AnonymousClass1 */

        /* renamed from: a */
        public HuaweiIdSignInOptions createFromParcel(Parcel parcel) {
            return new HuaweiIdSignInOptions(parcel);
        }

        /* renamed from: a */
        public HuaweiIdSignInOptions[] newArray(int i) {
            return new HuaweiIdSignInOptions[i];
        }
    };
    public static final HuaweiIdSignInOptions DEFAULT_GAMES_SIGN_IN = new Builder().requestScopes(SCOPE_GAMES, new Scope[0]).build();
    public static final HuaweiIdSignInOptions DEFAULT_SIGN_IN = new Builder().requestId().requestProfile().build();
    public static final Scope SCOPE_GAMES = new Scope(C0201.m82(7384));
    private static final PermissionInfo a = new PermissionInfo().setPermissionUri(C0201.m82(7380));
    private static final Scope b = new Scope(C0201.m82(7381));
    private static final Scope c = new Scope(C0201.m82(7382));
    private static final Scope d = new Scope(C0201.m82(7383));
    private final ArrayList<Scope> e;
    private ArrayList<PermissionInfo> f;

    public HuaweiIdSignInOptions(Set<Scope> set, Set<PermissionInfo> set2) {
        this(new ArrayList(set), new ArrayList(set2));
    }

    public static HuaweiIdSignInOptions fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return fromJsonObject(new JSONObject(str));
    }

    public static HuaweiIdSignInOptions fromJsonObject(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(7389));
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(a(jSONArray.getJSONObject(i)));
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(C0201.m82(7390));
        ArrayList arrayList2 = new ArrayList();
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(b(jSONArray2.getJSONObject(i2)));
            }
        }
        return new HuaweiIdSignInOptions(arrayList, arrayList2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HuaweiIdSignInOptions)) {
            return false;
        }
        HuaweiIdSignInOptions huaweiIdSignInOptions = (HuaweiIdSignInOptions) obj;
        if (!a(this.e, huaweiIdSignInOptions.e) || !a(this.f, huaweiIdSignInOptions.f)) {
            return false;
        }
        return true;
    }

    public List<PermissionInfo> getPermissionInfos() {
        return this.f;
    }

    public Scope[] getScopeArray() {
        ArrayList<Scope> arrayList = this.e;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    public List<Scope> getScopeList() {
        return this.e;
    }

    public int hashCode() {
        ArrayList<Scope> arrayList = this.e;
        int i = 0;
        int hashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        ArrayList<PermissionInfo> arrayList2 = this.f;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return hashCode + i;
    }

    public String toJson() throws JSONException {
        return toJsonObject().toString();
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.e != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<Scope> it = this.e.iterator();
            while (it.hasNext()) {
                jSONArray.put(a(it.next()));
            }
            jSONObject.put(C0201.m82(7391), jSONArray);
        }
        if (this.f != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<PermissionInfo> it2 = this.f.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(a(it2.next()));
            }
            jSONObject.put(C0201.m82(7392), jSONArray2);
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.e);
        parcel.writeList(this.f);
    }

    public HuaweiIdSignInOptions(ArrayList<Scope> arrayList, ArrayList<PermissionInfo> arrayList2) {
        this.e = arrayList;
        this.f = arrayList2;
    }

    private <T> boolean a(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        if (arrayList == arrayList2) {
            return true;
        }
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        return arrayList.containsAll(arrayList2);
    }

    private static PermissionInfo b(JSONObject jSONObject) {
        return new PermissionInfo().setPermissionUri(jSONObject.optString(C0201.m82(7388), null));
    }

    public static final class Builder {
        private Set<Scope> a = new HashSet();
        private Set<PermissionInfo> b = new HashSet();

        public Builder() {
        }

        public Builder addExtension(HuaweiIdSignInOptionsExtension huaweiIdSignInOptionsExtension) {
            return this;
        }

        public HuaweiIdSignInOptions build() {
            return new HuaweiIdSignInOptions(this.a, this.b);
        }

        @Deprecated
        public Builder requestAccessToken() {
            PermissionInfo permissionInfo = new PermissionInfo();
            permissionInfo.setPermissionUri(C0201.m82(20087));
            this.b.add(permissionInfo);
            return this;
        }

        public Builder requestEmail() {
            requestScopes(HuaweiIdSignInOptions.c, new Scope[0]);
            return this;
        }

        public Builder requestId() {
            return requestScopes(HuaweiIdSignInOptions.d, new Scope[0]);
        }

        public Builder requestIdToken(String str) {
            this.b.add(new PermissionInfo().setPermissionUri(C0201.m82(20088)));
            return this;
        }

        public Builder requestProfile() {
            requestScopes(HuaweiIdSignInOptions.b, new Scope[0]);
            return this;
        }

        public Builder requestScopes(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            if (scopeArr != null && scopeArr.length > 0) {
                this.a.addAll(Arrays.asList(scopeArr));
            }
            return this;
        }

        public Builder requestServerAuthCode() {
            PermissionInfo permissionInfo = new PermissionInfo();
            permissionInfo.setPermissionUri(C0201.m82(20089));
            this.b.add(permissionInfo);
            return this;
        }

        public Builder requestShippingAddress() {
            requestAccessToken();
            requestId();
            return requestScopes(new Scope(C0201.m82(20090)), new Scope[0]);
        }

        public Builder requestUid() {
            this.b.add(HuaweiIdSignInOptions.a);
            return this;
        }

        public Builder setAccountName(String str) {
            return this;
        }

        public Builder setHostedDomain(String str) {
            return this;
        }

        public Builder(HuaweiIdSignInOptions huaweiIdSignInOptions) {
            this.a.addAll(huaweiIdSignInOptions.getScopeList());
            this.b.addAll(huaweiIdSignInOptions.getPermissionInfos());
        }

        @Deprecated
        public Builder requestServerAuthCode(String str) {
            return requestServerAuthCode(str, false);
        }

        @Deprecated
        public Builder requestServerAuthCode(String str, boolean z) {
            return requestServerAuthCode();
        }
    }

    private JSONObject a(Scope scope) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (scope.getScopeUri() != null) {
            jSONObject.put(C0201.m82(7387), scope.getScopeUri());
        }
        return jSONObject;
    }

    public HuaweiIdSignInOptions(Parcel parcel) {
        this.e = parcel.createTypedArrayList(Scope.CREATOR);
        this.f = parcel.createTypedArrayList(PermissionInfo.CREATOR);
    }

    private static Scope a(JSONObject jSONObject) {
        return new Scope(jSONObject.optString(C0201.m82(7385), null));
    }

    private JSONObject a(PermissionInfo permissionInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (permissionInfo.getPermission() != null) {
            jSONObject.put(C0201.m82(7386), permissionInfo.getPermission());
        }
        return jSONObject;
    }
}
