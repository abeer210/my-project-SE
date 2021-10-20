package com.huawei.hianalytics.ab.bc.kl;

import android.util.Pair;
import com.huawei.hianalytics.ab.bc.ef.ab;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public abstract class ef {
    public static long ab(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            ab.fg(C0201.m82(29089), C0201.m82(29090));
            return 0;
        }
    }

    public static Pair<String, String> ab(String str) {
        String str2;
        String str3;
        if (C0201.m82(29091).equals(str)) {
            return new Pair<>(str, C0201.m82(29093));
        }
        String[] split = str.split(C0201.m82(29092));
        if (split.length > 2) {
            str3 = split[split.length - 1];
            str2 = str.substring(0, (str.length() - str3.length()) - 1);
        } else {
            str2 = split[0];
            str3 = split[1];
        }
        return new Pair<>(str2, str3);
    }

    public static String ab(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? C0201.m82(29094) : C0201.m82(29095) : C0201.m82(29096) : C0201.m82(29097) : C0201.m82(29098);
    }

    public static String ab(String str, String str2) {
        if (C0201.m82(29099).equals(str)) {
            return str;
        }
        return str + C0201.m82(29100) + str2;
    }

    public static String ab(String str, String str2, String str3) {
        if (C0201.m82(29101).equals(str)) {
            return C0201.m82(29102) + str3;
        }
        return str + C0201.m82(29103) + str2 + C0201.m82(29104) + str3;
    }

    public static Set<String> ab(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            String r2 = C0201.m82(29105);
            if (!r2.equals(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String r3 = C0201.m82(29106);
                sb.append(r3);
                sb.append(C0201.m82(29107));
                String str2 = str + r3 + C0201.m82(29108);
                hashSet.add(sb.toString());
                hashSet.add(str2);
                hashSet.add(str + r3 + C0201.m82(29109));
            } else {
                hashSet.add(r2);
            }
        }
        return hashSet;
    }

    public static JSONObject ab(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (C0201.m82(29110).equals(str3)) {
                jSONObject.put(C0201.m82(29111), str2);
            }
            jSONObject.put(C0201.m82(29112), str);
        } catch (JSONException unused) {
            ab.fg(C0201.m82(29113), C0201.m82(29114));
        }
        return jSONObject;
    }
}
