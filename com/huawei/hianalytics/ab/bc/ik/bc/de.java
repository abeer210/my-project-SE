package com.huawei.hianalytics.ab.bc.ik.bc;

import com.huawei.hianalytics.ab.ab.bc;
import com.huawei.hianalytics.ab.bc.ik.cd.ab;
import com.huawei.hianalytics.ab.bc.kl.ef;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import vigqyno.C0201;

public class de implements ab {
    private String ab;
    private String bc;
    private String cd;
    private List<com.huawei.hianalytics.ab.bc.cd.bc.de> de;

    public de(List<com.huawei.hianalytics.ab.bc.cd.bc.de> list, String str, String str2, String str3) {
        this.ab = str;
        this.bc = str2;
        this.cd = str3;
        this.de = list;
    }

    private void ab() {
        String ab2 = ef.ab(this.ab, this.cd, this.bc);
        com.huawei.hianalytics.ab.bc.ij.ab.ab(bc.fg(), C0201.m82(27896), ab2);
    }

    public void run() {
        List<com.huawei.hianalytics.ab.bc.cd.bc.de> list = this.de;
        String r1 = C0201.m82(27897);
        if (list == null || list.size() == 0) {
            com.huawei.hianalytics.ab.bc.ef.ab.de(r1, C0201.m82(27903));
            return;
        }
        int hi = bc.hi();
        String r4 = C0201.m82(27898);
        if (com.huawei.hianalytics.ab.bc.kl.bc.ab(bc.fg(), r4, hi * 1048576)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(27899) + this.bc);
            return;
        }
        String ab2 = ef.ab(this.ab, this.cd);
        List<com.huawei.hianalytics.ab.bc.cd.bc.de> list2 = com.huawei.hianalytics.ab.bc.de.de.bc(bc.fg(), r4, ab2).get(ab2);
        if (!(list2 == null || list2.size() == 0)) {
            this.de.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.huawei.hianalytics.ab.bc.cd.bc.de deVar : this.de) {
            try {
                jSONArray.put(deVar.de());
            } catch (JSONException unused) {
                com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(27900));
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2.length() > bc.ef() * 1048576) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(27901));
            this.de = null;
            return;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.de(r1, C0201.m82(27902) + this.bc);
        com.huawei.hianalytics.ab.bc.ij.ab.bc(bc.fg(), r4, ab2, jSONArray2);
        ab();
    }
}
