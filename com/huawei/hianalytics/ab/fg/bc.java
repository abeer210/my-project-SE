package com.huawei.hianalytics.ab.fg;

import android.content.Context;
import com.huawei.hianalytics.ab.bc.ef.ab;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public final class bc {
    private static bc cd;
    private Context ab;
    private final Object bc = new Object();

    private bc() {
    }

    public static bc ab() {
        if (cd == null) {
            bc();
        }
        return cd;
    }

    private JSONObject ab(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                ab.bc(C0201.m82(2577), C0201.m82(2578));
            }
        }
        return jSONObject;
    }

    private static synchronized void bc() {
        synchronized (bc.class) {
            if (cd == null) {
                cd = new bc();
            }
        }
    }

    public void ab(Context context) {
        synchronized (this.bc) {
            if (this.ab == null) {
                this.ab = context;
                com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(context);
            }
        }
    }

    public void ab(String str, int i) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(str, i);
    }

    public void ab(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(str, i, str2, ab(linkedHashMap));
    }

    public void ab(String str, Context context) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(str, context.getClass().getCanonicalName(), new JSONObject());
    }

    public void ab(String str, Context context, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(2579), str3);
            com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            ab.fg(C0201.m82(2580), C0201.m82(2581));
        }
    }

    public void ab(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        JSONObject ab2 = ab(linkedHashMap);
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(str, context.getClass().getCanonicalName(), ab2);
    }

    public void ab(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(str, str2, ab(linkedHashMap));
    }

    public void bc(String str, int i, String str2, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().ab(str, i, str2, ab(linkedHashMap), System.currentTimeMillis());
    }

    public void bc(String str, Context context) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().bc(str, context.getClass().getCanonicalName(), new JSONObject());
    }

    public void bc(String str, Context context, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().bc(str, context.getClass().getCanonicalName(), ab(linkedHashMap));
    }

    public void bc(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.ab.bc.ik.ab.ab.ab().bc(str, str2, ab(linkedHashMap));
    }
}
