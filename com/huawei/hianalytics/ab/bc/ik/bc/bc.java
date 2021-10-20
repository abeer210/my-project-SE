package com.huawei.hianalytics.ab.bc.ik.bc;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.cd;
import com.huawei.hianalytics.ab.bc.cd.bc.de;
import com.huawei.hianalytics.ab.bc.ik.cd.ab;
import com.huawei.hianalytics.ab.bc.kl.ef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class bc implements ab {
    private Context ab = com.huawei.hianalytics.ab.ab.bc.fg();
    private String bc;
    private JSONObject cd;
    private String de;
    private String ef;
    private String fg;
    private String gh;
    private Boolean hi;

    public bc(String str, JSONObject jSONObject, String str2, String str3, long j) {
        this.bc = str;
        this.cd = jSONObject;
        this.de = str2;
        this.ef = str3;
        this.fg = String.valueOf(j);
        if (com.huawei.hianalytics.ab.ab.ab.ij(str2, C0201.m82(12359))) {
            com.huawei.hianalytics.ab.bc.hi.bc ab2 = com.huawei.hianalytics.ab.bc.hi.ab.ab().ab(str2, j);
            this.gh = ab2.bc();
            this.hi = Boolean.valueOf(ab2.cd());
        }
    }

    public void run() {
        JSONArray jSONArray;
        String r0 = C0201.m82(12360);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r0, C0201.m82(12361));
        int ef2 = com.huawei.hianalytics.ab.ab.bc.ef();
        int hi2 = cd.hi(this.de, this.ef);
        String r4 = C0201.m82(12362);
        boolean ab2 = com.huawei.hianalytics.ab.bc.kl.bc.ab(this.ab, r4, ef2 * 1048576);
        String r3 = C0201.m82(12363);
        if (ab2) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(r0, C0201.m82(12364));
            com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(r3, C0201.m82(12365));
            return;
        }
        de deVar = new de();
        deVar.bc(this.bc);
        deVar.ab(this.cd.toString());
        deVar.de(this.ef);
        deVar.cd(this.fg);
        deVar.fg(this.gh);
        Boolean bool = this.hi;
        deVar.ef(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject de2 = deVar.de();
            String ab3 = ef.ab(this.de, this.ef);
            String ab4 = com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r4, ab3, r3);
            try {
                jSONArray = !TextUtils.isEmpty(ab4) ? new JSONArray(ab4) : new JSONArray();
            } catch (JSONException unused) {
                com.huawei.hianalytics.ab.bc.ef.ab.de(r0, C0201.m82(12366));
                jSONArray = new JSONArray();
            }
            jSONArray.put(de2);
            com.huawei.hianalytics.ab.bc.ij.ab.bc(this.ab, r4, ab3, jSONArray.toString());
            if (jSONArray.toString().length() > hi2 * 1024) {
                com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(this.de, this.ef);
            }
        } catch (JSONException unused2) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r0, C0201.m82(12367));
        }
    }
}
