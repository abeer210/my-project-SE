package com.huawei.hms.auth.api.signin.internal;

import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: HuaweiIdCpClientInfo */
public class a {
    private String a;
    private String b;
    private long c;
    private String d;

    public static a d(String str) throws JSONException {
        return new a().a(new JSONObject(str));
    }

    public void a(String str) {
        this.a = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public String toString() {
        return C0201.m82(32146) + this.a + '\'' + C0201.m82(32147) + this.b + '\'' + C0201.m82(32148) + this.c + '\'' + C0201.m82(32149) + this.d + '}';
    }

    public void a(long j) {
        this.c = j;
    }

    public String b() throws JSONException {
        return c().toString();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(C0201.m82(32142), this.a);
        jSONObject.putOpt(C0201.m82(32143), this.b);
        jSONObject.put(C0201.m82(32144), this.c);
        jSONObject.putOpt(C0201.m82(32145), this.d);
        return jSONObject;
    }

    public String a() {
        return this.d;
    }

    public a a(JSONObject jSONObject) {
        this.a = jSONObject.optString(C0201.m82(32138), null);
        this.b = jSONObject.optString(C0201.m82(32139), null);
        this.c = jSONObject.optLong(C0201.m82(32140));
        this.d = jSONObject.optString(C0201.m82(32141), null);
        return this;
    }
}
