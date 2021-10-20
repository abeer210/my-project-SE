package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: pg2  reason: default package */
/* compiled from: IconParser */
public class pg2 {
    public static ig2 a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new eg2();
        }
        try {
            if (!(jSONObject.get(str) instanceof String)) {
                jSONObject = jSONObject.optJSONObject(str);
                str = C0201.m82(25944);
            }
            return ug2.a(jSONObject, str);
        } catch (JSONException e) {
            e.printStackTrace();
            return new eg2();
        }
    }
}
