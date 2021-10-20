package defpackage;

import org.json.JSONObject;

/* renamed from: ug2  reason: default package */
/* compiled from: TextParser */
public class ug2 {
    public static ig2 a(JSONObject jSONObject, String str) {
        return (jSONObject == null || !jSONObject.has(str)) ? new eg2() : new ig2(jSONObject.optString(str));
    }

    public static ig2 b(JSONObject jSONObject, String str, String str2) {
        return (ig2) qj2.e(a(jSONObject, str), new ig2(str2));
    }
}
