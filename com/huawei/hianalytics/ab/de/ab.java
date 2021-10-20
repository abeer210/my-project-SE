package com.huawei.hianalytics.ab.de;

import android.util.Pair;
import com.huawei.hianalytics.ab.bc.cd.bc.de;
import com.huawei.hianalytics.ab.bc.cd.bc.ef;
import com.huawei.hianalytics.ab.bc.de.cd;
import com.huawei.hianalytics.ab.bc.de.fg;
import com.huawei.hianalytics.ab.cd.ab.bc;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public class ab extends cd {

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hianalytics.ab.de.ab$ab  reason: collision with other inner class name */
    public static /* synthetic */ class C0082ab {
        public static final /* synthetic */ int[] ab;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[bc.values().length];
            ab = iArr;
            iArr[bc.SN.ordinal()] = 1;
            ab[bc.IMEI.ordinal()] = 2;
            try {
                ab[bc.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static ef ab(List<de> list, String str, String str2, String str3, String str4) {
        com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(19844), C0201.m82(19845));
        ef ab = cd.ab();
        if (ab == null) {
            return null;
        }
        ab.ab(ab(fg.ef().ab(), str, str2, str3));
        ab.ab(ab(str, str2));
        ab.ab(ab(str2, str, str4));
        ab.ab(com.huawei.hianalytics.ab.ab.cd.de(str, str2));
        ab.ab(list);
        return ab;
    }

    public static com.huawei.hianalytics.ab.ef.ab ab(String str, String str2) {
        com.huawei.hianalytics.ab.ef.ab ab = cd.ab(str, str2);
        com.huawei.hianalytics.ab.cd.ab.ab cd = com.huawei.hianalytics.ab.cd.bc.ab.ab().cd(str, str2);
        ab.gh(com.huawei.hianalytics.ab.cd.bc.ab.ab().ab(com.huawei.hianalytics.ab.ab.cd.b(str, str2)));
        ab.fg(com.huawei.hianalytics.ab.ab.cd.lm(str, str2));
        ab.cd(com.huawei.hianalytics.ab.cd.bc.ab.ab().fg(str, str2));
        int i = C0082ab.ab[cd.ab().ordinal()];
        if (i == 1) {
            ab.de(cd.bc());
        } else if (i == 2) {
            ab.bc(cd.bc());
        } else if (i == 3) {
            ab.ef(cd.bc());
        }
        return ab;
    }

    public static com.huawei.hianalytics.ab.ef.bc ab(String str, String str2, String str3, String str4) {
        com.huawei.hianalytics.ab.ef.bc ab = cd.ab(str, str2, str3, str4);
        String ab2 = com.huawei.hianalytics.ab.cd.bc.ab.ab().ab(com.huawei.hianalytics.ab.ab.cd.b(str2, str3));
        long currentTimeMillis = System.currentTimeMillis();
        String b = xb2.b(com.huawei.hianalytics.ab.ab.bc.cd() + ab2 + currentTimeMillis);
        ab.fg(String.valueOf(currentTimeMillis));
        ab.gh(b);
        return ab;
    }

    public static com.huawei.hianalytics.ab.ef.cd ab(String str, String str2, String str3) {
        com.huawei.hianalytics.ab.ef.cd ab = cd.ab(str, str2, str3);
        Pair<String, String> ef = com.huawei.hianalytics.ab.cd.bc.ab.ab().ef(str2, str);
        ab.fg((String) ef.first);
        ab.gh((String) ef.second);
        ab.hi(com.huawei.hianalytics.ab.bc.bc.ab.bc());
        ab.de(com.huawei.hianalytics.ab.cd.bc.ab.ab().de(str2, str));
        return ab;
    }

    public static Map<String, String> bc(String str, String str2, String str3) {
        Map<String, String> bc = cd.bc(str, str3);
        Map<String, String> fg = com.huawei.hianalytics.ab.ab.cd.fg(str, str2);
        if (fg == null) {
            return bc;
        }
        bc.putAll(fg);
        return bc;
    }
}
