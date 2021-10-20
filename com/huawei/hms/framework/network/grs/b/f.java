package com.huawei.hms.framework.network.grs.b;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Collections;
import java.util.Set;
import vigqyno.C0201;

public class f {
    private static final String a = null;
    public static final Set<String> b = Collections.unmodifiableSet(new e(16));

    static {
        C0201.m83(f.class, 372);
    }

    public static String a(String str, GrsBaseInfo grsBaseInfo) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(a, C0201.m82(13134));
            return null;
        } else if (!C0201.m82(13135).equals(str) && !C0201.m82(13136).equals(str)) {
            return b(str, grsBaseInfo);
        } else {
            Logger.v(a, C0201.m82(13137));
            return C0201.m82(13138);
        }
    }

    private static String b(String str, GrsBaseInfo grsBaseInfo) {
        String serCountry = grsBaseInfo.getSerCountry();
        String regCountry = grsBaseInfo.getRegCountry();
        String issueCountry = grsBaseInfo.getIssueCountry();
        String[] split = str.split(C0201.m82(13139));
        for (String str2 : split) {
            if (b.contains(str2.trim())) {
                if (C0201.m82(13140).equals(str2.trim()) && !TextUtils.isEmpty(serCountry)) {
                    return serCountry;
                }
                if (C0201.m82(13141).equals(str2.trim()) && !TextUtils.isEmpty(regCountry)) {
                    return regCountry;
                }
                if (C0201.m82(13142).equals(str2.trim()) && !TextUtils.isEmpty(issueCountry)) {
                    return issueCountry;
                }
            }
        }
        return C0201.m82(13143);
    }
}
