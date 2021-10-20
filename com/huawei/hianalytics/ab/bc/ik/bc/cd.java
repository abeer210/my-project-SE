package com.huawei.hianalytics.ab.bc.ik.bc;

import android.content.Context;
import android.util.Pair;
import com.huawei.hianalytics.ab.ab.bc;
import com.huawei.hianalytics.ab.bc.cd.bc.de;
import com.huawei.hianalytics.ab.bc.ik.cd.ab;
import com.huawei.hianalytics.ab.bc.kl.ef;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public class cd implements ab {
    private Context ab = bc.fg();
    private String bc;
    private String cd;
    private String de;

    public cd(String str, String str2, String str3) {
        this.bc = str;
        this.cd = str2;
        this.de = str3;
    }

    private void ab(String str, List<de> list) {
        Pair<String, String> ab2 = ef.ab(str);
        new com.huawei.hianalytics.ab.bc.de.ab(list, (String) ab2.first, (String) ab2.second, this.de).ab();
    }

    public void run() {
        String r0 = C0201.m82(29552);
        String r1 = C0201.m82(29553);
        String r2 = C0201.m82(29554);
        com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, C0201.m82(29555));
        boolean ab2 = com.huawei.hianalytics.ab.bc.kl.bc.ab(this.ab);
        String r4 = C0201.m82(29556);
        if (ab2) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, C0201.m82(29557));
            this.cd = r4;
        }
        try {
            Map<String, List<de>> ab3 = com.huawei.hianalytics.ab.bc.de.de.ab(this.ab, this.bc, this.cd);
            if (ab3.size() == 0) {
                com.huawei.hianalytics.ab.bc.ef.ab.bc(r2, C0201.m82(29558), this.bc, this.cd);
                if (r4.equals(this.cd)) {
                    com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, new String[0]);
                    com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, new String[0]);
                    return;
                }
                String ab4 = ef.ab(this.bc, this.cd);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, ab4);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, ab4);
                return;
            }
            for (Map.Entry<String, List<de>> entry : ab3.entrySet()) {
                ab(entry.getKey(), entry.getValue());
            }
            if (r4.equals(this.cd)) {
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, new String[0]);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, new String[0]);
            } else {
                String ab5 = ef.ab(this.bc, this.cd);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, ab5);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, ab5);
            }
            if (ab2) {
                com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, C0201.m82(29561));
                com.huawei.hianalytics.ab.bc.gh.bc.de().bc();
            }
        } catch (IllegalArgumentException e) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r2, C0201.m82(29560) + e.getMessage());
            if (r4.equals(this.cd)) {
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, new String[0]);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, new String[0]);
            } else {
                String ab6 = ef.ab(this.bc, this.cd);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, ab6);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, ab6);
            }
        } catch (Exception e2) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r2, C0201.m82(29559) + e2.getMessage());
            if (r4.equals(this.cd)) {
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, new String[0]);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, new String[0]);
            } else {
                String ab7 = ef.ab(this.bc, this.cd);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, ab7);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, ab7);
            }
        } catch (Throwable th) {
            if (r4.equals(this.cd)) {
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, new String[0]);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, new String[0]);
            } else {
                String ab8 = ef.ab(this.bc, this.cd);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r1, ab8);
                com.huawei.hianalytics.ab.bc.ij.ab.ab(this.ab, r0, ab8);
            }
            throw th;
        }
    }
}
