package com.huawei.hianalytics.ab.bc.cd.bc;

import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.ef.ab;
import com.huawei.hianalytics.ab.bc.kl.de;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class ef implements fg {
    private List<de> ab;
    private bc bc;
    private cd cd;
    private fg de;
    private String ef = C0201.m82(26618);
    private String fg;

    public ef(String str) {
        this.fg = str;
    }

    @Override // com.huawei.hianalytics.ab.bc.cd.bc.fg
    public JSONObject ab() {
        String r0;
        String r02 = C0201.m82(26619);
        List<de> list = this.ab;
        String r3 = C0201.m82(26620);
        if (list == null || list.size() == 0) {
            r0 = C0201.m82(26631);
        } else if (this.bc == null || this.cd == null || this.de == null) {
            r0 = C0201.m82(26630);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0201.m82(26621), this.bc.ab());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject ab2 = this.de.ab();
            ab2.put(C0201.m82(26622), this.cd.ab());
            try {
                ab2.put(r02, new JSONObject(this.ef));
            } catch (JSONException unused) {
                ab2.put(r02, this.ef);
            }
            jSONObject2.put(C0201.m82(26623), ab2);
            JSONArray jSONArray = new JSONArray();
            for (de deVar : this.ab) {
                JSONObject ab3 = deVar.ab();
                if (ab3 != null) {
                    jSONArray.put(ab3);
                } else {
                    ab.ef(r3, C0201.m82(26624));
                }
            }
            jSONObject2.put(C0201.m82(26625), jSONArray);
            try {
                String a = ac2.a(vb2.c(de.ab(jSONObject2.toString().getBytes(C0201.m82(26626))), ac2.b(this.fg)));
                if (TextUtils.isEmpty(a)) {
                    ab.ef(r3, C0201.m82(26627));
                    return null;
                }
                jSONObject.put(C0201.m82(26628), a);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                r0 = C0201.m82(26629);
            }
        }
        ab.ef(r3, r0);
        return null;
    }

    public void ab(bc bcVar) {
        this.bc = bcVar;
    }

    public void ab(cd cdVar) {
        this.cd = cdVar;
    }

    public void ab(com.huawei.hianalytics.ab.ef.ab abVar) {
        this.de = abVar;
    }

    public void ab(String str) {
        if (str != null) {
            this.ef = str;
        }
    }

    public void ab(List<de> list) {
        this.ab = list;
    }
}
