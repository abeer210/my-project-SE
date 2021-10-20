package com.huawei.hianalytics.ab.cd.bc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hianalytics.ab.bc.bc.bc;
import java.util.UUID;
import vigqyno.C0201;

public class ab {
    private static ab bc;
    private Context ab;

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hianalytics.ab.cd.bc.ab$ab  reason: collision with other inner class name */
    public static class C0081ab extends bc {
        public String ab;
        public String bc;

        public C0081ab(String str, String str2) {
            this.ab = str;
            this.bc = str2;
        }

        @Override // com.huawei.hianalytics.ab.cd.bc.bc
        public String ab() {
            return com.huawei.hianalytics.ab.ab.ab.de(this.ab, this.bc);
        }

        @Override // com.huawei.hianalytics.ab.cd.bc.bc
        public String ab(String str) {
            return xb2.b(str);
        }

        @Override // com.huawei.hianalytics.ab.cd.bc.bc
        public String bc() {
            return com.huawei.hianalytics.ab.ab.ab.gh(this.ab, this.bc);
        }

        @Override // com.huawei.hianalytics.ab.cd.bc.bc
        public String cd() {
            return com.huawei.hianalytics.ab.ab.ab.ik(this.ab, this.bc);
        }

        @Override // com.huawei.hianalytics.ab.cd.bc.bc
        public int de() {
            int i = 0;
            int i2 = (com.huawei.hianalytics.ab.ab.ab.kl(this.ab, this.bc) ? 4 : 0) | 0;
            if (com.huawei.hianalytics.ab.ab.ab.ef(this.ab, this.bc)) {
                i = 2;
            }
            return i2 | i | (com.huawei.hianalytics.ab.ab.ab.hi(this.ab, this.bc) ? 1 : 0);
        }
    }

    public static ab ab() {
        ab abVar;
        synchronized (ab.class) {
            if (bc == null) {
                bc = new ab();
            }
            abVar = bc;
        }
        return abVar;
    }

    public String ab(String str, String str2) {
        return bc.ab(this.ab, str, str2);
    }

    public String ab(boolean z) {
        String r0 = C0201.m82(26827);
        if (!z) {
            return r0;
        }
        String ik = com.huawei.hianalytics.ab.ab.bc.ik();
        if (TextUtils.isEmpty(ik)) {
            Context context = this.ab;
            String r1 = C0201.m82(26828);
            String r2 = C0201.m82(26829);
            ik = com.huawei.hianalytics.ab.bc.ij.ab.ab(context, r1, r2, r0);
            if (TextUtils.isEmpty(ik)) {
                ik = UUID.randomUUID().toString().replace(C0201.m82(26830), r0);
                com.huawei.hianalytics.ab.bc.ij.ab.bc(this.ab, r1, r2, ik);
            }
            com.huawei.hianalytics.ab.ab.bc.cd(ik);
        }
        return ik;
    }

    public void ab(Context context) {
        if (this.ab == null) {
            this.ab = context;
        }
    }

    public String bc(String str, String str2) {
        return bc.bc(this.ab, str, str2);
    }

    public com.huawei.hianalytics.ab.cd.ab.ab cd(String str, String str2) {
        return new C0081ab(str, str2).ab(this.ab);
    }

    public String de(String str, String str2) {
        return de.bc(str, str2);
    }

    public Pair<String, String> ef(String str, String str2) {
        if (com.huawei.hianalytics.ab.ab.ab.fg(str, str2)) {
            String kl = com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().kl();
            String lm = com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().lm();
            if (!TextUtils.isEmpty(kl) && !TextUtils.isEmpty(lm)) {
                return new Pair<>(kl, lm);
            }
            Pair<String, String> ef = cd.ef(this.ab);
            com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().hi((String) ef.first);
            com.huawei.hianalytics.ab.bc.cd.ab.ab.cd().bc().ij((String) ef.second);
            return ef;
        }
        String r3 = C0201.m82(26831);
        return new Pair<>(r3, r3);
    }

    public String fg(String str, String str2) {
        return de.ab(str, str2);
    }
}
