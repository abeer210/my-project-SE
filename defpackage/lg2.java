package defpackage;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: lg2  reason: default package */
/* compiled from: BoolParser */
public class lg2 {
    public static sf2 a(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? new sf2(Boolean.valueOf(jSONObject.optBoolean(str))) : new zf2();
    }

    public static sf2 b(JSONObject jSONObject, String... strArr) {
        List asList = Arrays.asList(strArr);
        jSONObject.getClass();
        String str = (String) yi2.e(asList, new kg2(jSONObject));
        return str != null ? new sf2(Boolean.valueOf(jSONObject.optBoolean(str))) : new zf2();
    }
}
