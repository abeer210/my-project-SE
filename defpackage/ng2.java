package defpackage;

import org.json.JSONObject;

/* renamed from: ng2  reason: default package */
/* compiled from: FloatParser */
public class ng2 {
    public static wf2 a(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? new wf2(Float.valueOf((float) jSONObject.optDouble(str))) : new bg2();
    }
}
