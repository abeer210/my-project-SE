package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: qe2  reason: default package */
/* compiled from: ExternalComponent */
public class qe2 {
    public ig2 a = new eg2();
    public JSONObject b = new JSONObject();

    public static qe2 a(JSONObject jSONObject) {
        qe2 qe2 = new qe2();
        if (jSONObject == null) {
            return qe2;
        }
        ig2 a2 = ug2.a(jSONObject, C0201.m82(18862));
        qe2.a = a2;
        if (a2.f()) {
            qe2.b = b(jSONObject);
            return qe2;
        }
        throw new RuntimeException(C0201.m82(18863));
    }

    private static JSONObject b(JSONObject jSONObject) {
        String r0 = C0201.m82(18864);
        if (jSONObject.has(r0)) {
            try {
                return jSONObject.getJSONObject(r0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return new JSONObject();
    }
}
