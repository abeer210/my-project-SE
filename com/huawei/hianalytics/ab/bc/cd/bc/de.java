package com.huawei.hianalytics.ab.bc.cd.bc;

import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.ab.ab;
import com.huawei.hianalytics.ab.bc.gh.bc;
import org.json.JSONObject;
import vigqyno.C0201;

public class de implements fg {
    private String ab;
    private String bc;
    private String cd;
    private String de;
    private String ef;
    private String fg;

    @Override // com.huawei.hianalytics.ab.bc.cd.bc.fg
    public JSONObject ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(28267), this.ab);
        jSONObject.put(C0201.m82(28268), this.de);
        jSONObject.put(C0201.m82(28269), this.bc);
        jSONObject.put(C0201.m82(28270), this.ef);
        jSONObject.put(C0201.m82(28271), this.fg);
        if (TextUtils.isEmpty(this.cd)) {
            return null;
        }
        jSONObject.put(C0201.m82(28272), new JSONObject(this.cd));
        return jSONObject;
    }

    public void ab(String str) {
        this.cd = str;
    }

    public void ab(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.bc = jSONObject.optString(C0201.m82(28273));
            this.cd = jSONObject.optString(C0201.m82(28274));
            this.cd = ab.ab(this.cd, bc.de().ab());
            this.ab = jSONObject.optString(C0201.m82(28275));
            this.de = jSONObject.optString(C0201.m82(28276));
            this.ef = jSONObject.optString(C0201.m82(28277));
            this.fg = jSONObject.optString(C0201.m82(28278));
        }
    }

    public String bc() {
        return this.de;
    }

    public void bc(String str) {
        this.bc = str;
    }

    public String cd() {
        return this.ab;
    }

    public void cd(String str) {
        this.de = str;
    }

    public JSONObject de() {
        JSONObject ab2 = ab();
        ab2.put(C0201.m82(28279), ab.bc(this.cd, bc.de().ab()));
        return ab2;
    }

    public void de(String str) {
        this.ab = str;
    }

    public void ef(String str) {
        this.fg = str;
    }

    public void fg(String str) {
        this.ef = str;
    }
}
