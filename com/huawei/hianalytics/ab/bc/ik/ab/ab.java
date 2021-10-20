package com.huawei.hianalytics.ab.bc.ik.ab;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.cd;
import com.huawei.hianalytics.ab.bc.ik.cd.bc;
import com.huawei.hianalytics.ab.bc.kl.ef;
import com.huawei.hianalytics.ab.bc.kl.gh;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import vigqyno.C0201;

public class ab {
    private static ab bc;
    private static Map<String, Long> cd = new HashMap();
    private Context ab;

    public static ab ab() {
        return bc();
    }

    private static void ab(String str, String str2, long j, long j2, JSONObject jSONObject, String str3, String str4) {
        bc.bc().ab(new com.huawei.hianalytics.ab.bc.ik.bc.bc(str3, ef.ab(jSONObject, str2, String.valueOf(j2), str4), str, C0201.m82(23847), j));
    }

    private static synchronized ab bc() {
        ab abVar;
        synchronized (ab.class) {
            if (bc == null) {
                bc = new ab();
            }
            abVar = bc;
        }
        return abVar;
    }

    private void bc(Context context) {
        String str;
        String de = com.huawei.hianalytics.ab.bc.bc.ab.de(context);
        com.huawei.hianalytics.ab.ab.bc.ab(de);
        boolean ab2 = gh.bc().ab();
        String r2 = C0201.m82(23848);
        if (ab2) {
            String r1 = C0201.m82(23849);
            String r3 = C0201.m82(23850);
            String r4 = C0201.m82(23851);
            String ab3 = com.huawei.hianalytics.ab.bc.ij.ab.ab(context, r1, r3, r4);
            com.huawei.hianalytics.ab.bc.ij.ab.bc(context, r1, r3, de);
            com.huawei.hianalytics.ab.ab.bc.bc(ab3);
            if (TextUtils.isEmpty(ab3)) {
                str = C0201.m82(23852);
            } else if (!ab3.equals(de)) {
                com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, C0201.m82(23853));
                ab().ab(r4, C0201.m82(23854), ab3);
                return;
            } else {
                return;
            }
        } else {
            str = C0201.m82(23855);
        }
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, str);
    }

    private static void cd(String str, String str2, String str3, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        long longValue = cd.containsKey(str) ? cd.get(str).longValue() : 0;
        long j2 = currentTimeMillis - longValue;
        if (longValue != 0) {
            j = j2;
        }
        ab(str, str3, currentTimeMillis, j, jSONObject, str2, C0201.m82(23856));
    }

    public void ab(Context context) {
        this.ab = context;
        bc(context);
        com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().de(com.huawei.hianalytics.ab.bc.bc.ab.ab());
    }

    public void ab(String str, int i) {
        Context context = this.ab;
        String r1 = C0201.m82(23857);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(23858));
            return;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(23859));
        ab(str, ef.ab(i), com.huawei.hianalytics.ab.ab.bc.de());
    }

    public void ab(String str, int i, String str2, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            currentTimeMillis = ef.ab(C0201.m82(23860), currentTimeMillis);
        }
        bc.bc().ab(new com.huawei.hianalytics.ab.bc.ik.bc.bc(str2, jSONObject, str, ef.ab(i), currentTimeMillis));
    }

    public void ab(String str, int i, String str2, JSONObject jSONObject, long j) {
        new com.huawei.hianalytics.ab.bc.de.ef(str, ef.ab(i), str2, jSONObject.toString(), j).ab();
    }

    public void ab(String str, String str2) {
        boolean a = cd.a(str, str2);
        String r1 = C0201.m82(23861);
        if (a) {
            long gh = cd.gh(str, str2);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - gh > 30000) {
                com.huawei.hianalytics.ab.bc.ef.ab.ab(r1, C0201.m82(23862));
                cd.ab(str, str2, currentTimeMillis);
                ab(str, str2, com.huawei.hianalytics.ab.ab.bc.de());
                return;
            }
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, C0201.m82(23863));
            return;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(23864) + str);
    }

    public void ab(String str, String str2, String str3) {
        Context context = this.ab;
        String r1 = C0201.m82(23865);
        if (context == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(23866));
            return;
        }
        String ab2 = com.huawei.hianalytics.ab.bc.bc.cd.ab(context);
        if (cd.c(str, str2) && !C0201.m82(23867).equals(ab2)) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(r1, C0201.m82(23868) + ab2);
        } else if (TextUtils.isEmpty(ab2) || C0201.m82(23869).equals(ab2)) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r1, C0201.m82(23870));
        } else {
            bc.bc().ab(new com.huawei.hianalytics.ab.bc.ik.bc.cd(str, str2, str3));
        }
    }

    public void ab(String str, String str2, String str3, JSONObject jSONObject) {
        if (this.ab == null) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(23871), C0201.m82(23872));
            return;
        }
        cd(str, str2, str3, jSONObject);
        cd.put(str, 0L);
    }

    public void ab(String str, String str2, JSONObject jSONObject) {
        ab(str, C0201.m82(23873), str2, jSONObject);
    }

    public void bc(String str, String str2, String str3, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        cd.put(str, Long.valueOf(currentTimeMillis));
        ab(str, str3, currentTimeMillis, 0, jSONObject, str2, C0201.m82(23874));
    }

    public void bc(String str, String str2, JSONObject jSONObject) {
        bc(str, C0201.m82(23875), str2, jSONObject);
    }
}
