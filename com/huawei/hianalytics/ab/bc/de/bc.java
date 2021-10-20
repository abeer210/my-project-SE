package com.huawei.hianalytics.ab.bc.de;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.cd;
import com.huawei.hianalytics.ab.bc.cd.bc.de;
import com.huawei.hianalytics.ab.bc.cd.bc.ef;
import com.huawei.hianalytics.ab.bc.ef.ab;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class bc {
    private String ab;
    private String bc;
    private String cd;
    private List<de> de;
    private String ef;

    public bc(String str, String str2, String str3, List<de> list, String str4) {
        this.ab = str;
        this.bc = str2;
        this.cd = str3;
        this.de = list;
        this.ef = str4;
    }

    private String ab(String str, String str2) {
        String r4;
        String cd2 = cd.cd(str, str2);
        boolean isEmpty = TextUtils.isEmpty(cd2);
        String r2 = C0201.m82(35380);
        if (isEmpty) {
            ab.ab(C0201.m82(35381), C0201.m82(35382), str, str2);
            return r2;
        }
        boolean equals = C0201.m82(35383).equals(str2);
        String r1 = C0201.m82(35384);
        if (equals) {
            r4 = C0201.m82(35385);
        } else if (C0201.m82(35386).equals(str2)) {
            r4 = C0201.m82(35387);
        } else if (!C0201.m82(35388).equals(str2)) {
            return r2;
        } else {
            r4 = C0201.m82(35389);
        }
        return r4.replace(r1, cd2);
    }

    private byte[] ab(ef efVar) {
        String str;
        String r0 = C0201.m82(35390);
        try {
            JSONObject ab2 = efVar.ab();
            if (ab2 != null) {
                return com.huawei.hianalytics.ab.bc.kl.de.ab(ab2.toString().getBytes(C0201.m82(35392)));
            }
            ab.ef(r0, C0201.m82(35391));
            return new byte[0];
        } catch (JSONException unused) {
            str = C0201.m82(35394);
            ab.ef(r0, str);
            return new byte[0];
        } catch (UnsupportedEncodingException unused2) {
            str = C0201.m82(35393);
            ab.ef(r0, str);
            return new byte[0];
        }
    }

    private void bc() {
        Context fg = com.huawei.hianalytics.ab.ab.bc.fg();
        String r1 = C0201.m82(35395);
        boolean ab2 = com.huawei.hianalytics.ab.bc.kl.bc.ab(fg, r1, 5242880);
        String r2 = C0201.m82(35396);
        if (ab2) {
            ab.de(r2, C0201.m82(35397));
            return;
        }
        JSONArray cd2 = cd();
        String ab3 = com.huawei.hianalytics.ab.bc.kl.ef.ab(this.ab, this.bc, this.ef);
        ab.cd(r2, C0201.m82(35398) + ab3);
        com.huawei.hianalytics.ab.bc.ij.ab.bc(com.huawei.hianalytics.ab.ab.bc.fg(), r1, ab3, cd2.toString());
    }

    private JSONArray cd() {
        JSONArray jSONArray = new JSONArray();
        for (de deVar : this.de) {
            try {
                jSONArray.put(deVar.de());
            } catch (JSONException unused) {
                ab.cd(C0201.m82(35399), C0201.m82(35400));
            }
        }
        return jSONArray;
    }

    private ef de() {
        return com.huawei.hianalytics.ab.de.ab.ab(this.de, this.ab, this.bc, this.ef, this.cd);
    }

    public void ab() {
        com.huawei.hianalytics.ab.bc.ik.cd.bc bcVar;
        com.huawei.hianalytics.ab.bc.ik.cd.ab abVar;
        String r0;
        String ab2 = ab(this.ab, this.bc);
        boolean isEmpty = TextUtils.isEmpty(ab2);
        String r1 = C0201.m82(35401);
        if (isEmpty) {
            if (!C0201.m82(35402).equals(this.bc)) {
                r0 = C0201.m82(35403);
                ab.ef(r1, r0);
                return;
            }
        }
        if (!C0201.m82(35404).equals(this.ab)) {
            if (!C0201.m82(35405).equals(this.ab)) {
                bc();
            }
        }
        ef de2 = de();
        if (de2 != null) {
            byte[] ab3 = ab(de2);
            if (ab3.length == 0) {
                r0 = C0201.m82(35406);
                ab.ef(r1, r0);
                return;
            }
            abVar = new com.huawei.hianalytics.ab.bc.ik.bc.ab(ab3, ab2, this.ab, this.bc, this.ef, this.de);
            bcVar = com.huawei.hianalytics.ab.bc.ik.cd.bc.ab();
        } else {
            abVar = new com.huawei.hianalytics.ab.bc.ik.bc.de(this.de, this.ab, this.ef, this.bc);
            bcVar = com.huawei.hianalytics.ab.bc.ik.cd.bc.bc();
        }
        bcVar.ab(abVar);
    }
}
