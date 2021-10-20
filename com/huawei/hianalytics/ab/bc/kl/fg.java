package com.huawei.hianalytics.ab.bc.kl;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.huawei.hianalytics.ab.bc.ef.ab;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import vigqyno.C0201;

public class fg {
    private static final String[] ab = {C0201.m82(31106), C0201.m82(31107), C0201.m82(31108), C0201.m82(31109), C0201.m82(31110), C0201.m82(31111), C0201.m82(31112), C0201.m82(31113), C0201.m82(31114), C0201.m82(31115), C0201.m82(31116), C0201.m82(31117), C0201.m82(31118)};

    @TargetApi(9)
    public static String ab(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(31119);
        if (isEmpty) {
            ab.cd(r1, C0201.m82(31120));
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                if (!str.toLowerCase(Locale.US).startsWith(C0201.m82(31121))) {
                    return new URI(str).getHost();
                }
            }
            ab.bc(r1, C0201.m82(31122));
            return null;
        } catch (URISyntaxException e) {
            ab.bc(r1, C0201.m82(31123) + e.getMessage());
            return null;
        }
    }

    private static String ab(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            ab.cd(C0201.m82(31127), C0201.m82(31128));
            return str;
        }
        String[] split = str.split(C0201.m82(31124));
        if (split.length < i) {
            return C0201.m82(31125);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(split[split.length - i]);
        for (int i2 = 1; i2 < i; i2++) {
            stringBuffer.append(C0201.m82(31126));
            stringBuffer.append(split[(split.length - i) + i2]);
        }
        return stringBuffer.toString();
    }

    public static boolean ab(String str, String str2, int i) {
        String r4;
        StringBuilder sb;
        String message;
        String ab2 = ab(str);
        boolean isEmpty = TextUtils.isEmpty(ab2);
        String r1 = C0201.m82(31129);
        if (isEmpty || TextUtils.isEmpty(str2)) {
            r4 = C0201.m82(31135);
        } else {
            String ab3 = ab(ab2, i);
            if (TextUtils.isEmpty(ab3)) {
                r4 = C0201.m82(31130);
            } else if (str2.equals(xb2.b(ab2))) {
                return true;
            } else {
                if (!str2.equals(xb2.b(ab3))) {
                    return false;
                }
                try {
                    String substring = ab2.substring(0, ab2.length() - ab3.length());
                    if (!substring.endsWith(C0201.m82(31131))) {
                        return false;
                    }
                    return substring.matches(C0201.m82(31132));
                } catch (IndexOutOfBoundsException e) {
                    sb = new StringBuilder();
                    sb.append(C0201.m82(31134));
                    message = e.getMessage();
                    sb.append(message);
                    r4 = sb.toString();
                    ab.bc(r1, r4);
                    return false;
                } catch (Exception e2) {
                    sb = new StringBuilder();
                    sb.append(C0201.m82(31133));
                    message = e2.getMessage();
                    sb.append(message);
                    r4 = sb.toString();
                    ab.bc(r1, r4);
                    return false;
                }
            }
        }
        ab.bc(r1, r4);
        return false;
    }

    public static boolean bc(String str) {
        if (com.huawei.hianalytics.ab.gh.ab.ab.booleanValue()) {
            return true;
        }
        for (String str2 : ab) {
            if (ab(str, str2, 2)) {
                return true;
            }
        }
        return false;
    }
}
