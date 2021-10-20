package defpackage;

import org.json.JSONObject;

/* renamed from: mg2  reason: default package */
/* compiled from: ColorParser */
public class mg2 {
    public static uf2 a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.opt(str) instanceof Integer ? new uf2(jSONObject.optInt(str)) : new vf2();
        }
        return new ag2();
    }
}
