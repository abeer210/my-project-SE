package defpackage;

import org.json.JSONObject;

/* renamed from: tg2  reason: default package */
/* compiled from: NumberParser */
public class tg2 {
    public static fg2 a(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? new fg2(jSONObject.optInt(str)) : new dg2();
    }
}
