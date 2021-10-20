package defpackage;

import org.json.JSONObject;

/* renamed from: og2  reason: default package */
/* compiled from: FractionParser */
public class og2 {
    public static xf2 a(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? new xf2(jSONObject.optDouble(str)) : new cg2();
    }
}
