package com.huawei.hianalytics.ab.bc.de;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.bc;
import com.huawei.hianalytics.ab.bc.ij.ab;
import com.huawei.hianalytics.ab.bc.kl.ef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import vigqyno.C0201;

public class de {
    public static Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> ab(Context context, String str) {
        if (context == null) {
            return null;
        }
        Map<String, ?> bc = ab.bc(context, str);
        bc(bc);
        return ab(bc);
    }

    public static Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> ab(Context context, String str, String str2) {
        Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> map;
        Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> map2;
        boolean equals = C0201.m82(21124).equals(str2);
        String r1 = C0201.m82(21125);
        String r2 = C0201.m82(21126);
        if (equals || TextUtils.isEmpty(str)) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(21127), C0201.m82(21128));
            map = ab(context, r2);
            map2 = ab(context, r1);
        } else {
            String ab = ef.ab(str, str2);
            map = bc(context, r2, ab);
            map2 = bc(context, r1, ab);
        }
        return ab(map, map2);
    }

    private static Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> ab(Map<String, ?> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                ab(key, (String) entry.getValue(), hashMap);
            }
        }
        return hashMap;
    }

    private static Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> ab(Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> map, Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> map2) {
        if (map.size() == 0 && map2.size() == 0) {
            return new HashMap();
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<com.huawei.hianalytics.ab.bc.cd.bc.de> value = entry.getValue();
            List<com.huawei.hianalytics.ab.bc.cd.bc.de> list = map2.get(key);
            if (list != null && list.size() > 0) {
                value.addAll(list);
            }
            hashMap.put(key, value);
        }
        return hashMap;
    }

    private static void ab(String str, String str2, Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> map) {
        String r0 = C0201.m82(21129);
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str2)) {
                JSONArray jSONArray = new JSONArray(str2);
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        com.huawei.hianalytics.ab.bc.cd.bc.de deVar = new com.huawei.hianalytics.ab.bc.cd.bc.de();
                        try {
                            deVar.ab(jSONArray.getJSONObject(i));
                            arrayList.add(deVar);
                        } catch (JSONException unused) {
                            com.huawei.hianalytics.ab.bc.ef.ab.ef(r0, C0201.m82(21130));
                        }
                    }
                    map.put(str, arrayList);
                }
            }
        } catch (JSONException unused2) {
            com.huawei.hianalytics.ab.bc.ef.ab.ef(r0, C0201.m82(21131));
        }
    }

    public static Map<String, List<com.huawei.hianalytics.ab.bc.cd.bc.de>> bc(Context context, String str, String str2) {
        String ab = ab.ab(context, str, str2, C0201.m82(21132));
        HashMap hashMap = new HashMap();
        ab(str2, ab, hashMap);
        return hashMap;
    }

    private static void bc(Map<String, ?> map) {
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        Set<String> ab = ef.ab(bc.ab());
        while (it.hasNext()) {
            if (!ab.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }
}
