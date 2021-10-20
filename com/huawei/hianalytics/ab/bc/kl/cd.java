package com.huawei.hianalytics.ab.bc.kl;

import android.text.TextUtils;
import com.huawei.hianalytics.ab.bc.ef.ab;
import java.util.Map;
import java.util.regex.Pattern;
import vigqyno.C0201;

public class cd {
    public static String ab(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            return ab(str, str2, str3) ? str2 : str4;
        }
        ab.fg(C0201.m82(24228), C0201.m82(24227) + str);
        return str4;
    }

    public static boolean ab(String str) {
        return !ab(C0201.m82(24229), str, 256);
    }

    public static boolean ab(String str, String str2, int i) {
        StringBuilder sb;
        String r5;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String r2 = C0201.m82(24230);
        if (isEmpty) {
            sb = new StringBuilder();
            r5 = C0201.m82(24231);
        } else if (str2.length() <= i) {
            return true;
        } else {
            sb = new StringBuilder();
            r5 = C0201.m82(24232);
        }
        sb.append(r5);
        sb.append(str);
        ab.fg(r2, sb.toString());
        return false;
    }

    public static boolean ab(String str, String str2, String str3) {
        StringBuilder sb;
        String r5;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String r2 = C0201.m82(24233);
        if (isEmpty) {
            sb = new StringBuilder();
            r5 = C0201.m82(24234);
        } else if (Pattern.compile(str3).matcher(str2).matches()) {
            return true;
        } else {
            sb = new StringBuilder();
            r5 = C0201.m82(24235);
        }
        sb.append(r5);
        sb.append(str);
        ab.fg(r2, sb.toString());
        return false;
    }

    public static boolean ab(Map<String, String> map) {
        String r5;
        String r1 = C0201.m82(24236);
        if (map == null || map.size() == 0) {
            r5 = C0201.m82(24242);
        } else if (map.size() == 1 && (map.get(C0201.m82(24237)) != null || map.get(C0201.m82(24238)) != null)) {
            r5 = C0201.m82(24239);
        } else if (map.size() <= 2048 && map.toString().length() <= 204800) {
            return true;
        } else {
            r5 = C0201.m82(24240) + map.size() + C0201.m82(24241) + map.toString().length();
        }
        ab.fg(r1, r5);
        return false;
    }
}
