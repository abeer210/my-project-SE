package com.huawei.hianalytics.ab.ef;

import org.json.JSONObject;
import vigqyno.C0201;

public class ab extends com.huawei.hianalytics.ab.bc.cd.bc.ab {
    private String bc;
    private String cd;
    private String de;
    private String ef;
    public String fg;
    private String gh;

    public ab() {
        String r0 = C0201.m82(5875);
        this.bc = r0;
        this.cd = r0;
        this.de = r0;
        this.ef = r0;
        this.fg = r0;
    }

    @Override // com.huawei.hianalytics.ab.bc.cd.bc.fg
    public JSONObject ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(5876), this.ab);
        jSONObject.put(C0201.m82(5877), this.gh);
        jSONObject.put(C0201.m82(5878), this.fg);
        jSONObject.put(C0201.m82(5879), this.ef);
        jSONObject.put(C0201.m82(5880), this.bc);
        jSONObject.put(C0201.m82(5881), this.cd);
        jSONObject.put(C0201.m82(5882), this.de);
        return jSONObject;
    }

    public void bc(String str) {
        this.bc = str;
    }

    public void cd(String str) {
        this.gh = str;
    }

    public void de(String str) {
        this.cd = str;
    }

    public void ef(String str) {
        this.de = str;
    }

    public void fg(String str) {
        this.ef = str;
    }

    public void gh(String str) {
        this.fg = str;
    }
}
