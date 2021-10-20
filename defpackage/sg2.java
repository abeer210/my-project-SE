package defpackage;

import defpackage.ve2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: sg2  reason: default package */
/* compiled from: LayoutNodeParser */
public class sg2 {
    public static ve2 a(JSONObject jSONObject) {
        return new ve2(jSONObject.optString(C0201.m82(8277)), ve2.a.valueOf(jSONObject.optString(C0201.m82(8278))), c(jSONObject), b(jSONObject));
    }

    private static List<ve2> b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        String r1 = C0201.m82(8279);
        if (jSONObject.has(r1)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(r1);
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(a(optJSONArray.optJSONObject(i)));
            }
        }
        return arrayList;
    }

    private static JSONObject c(JSONObject jSONObject) {
        String r0 = C0201.m82(8280);
        return jSONObject.has(r0) ? jSONObject.optJSONObject(r0) : new JSONObject();
    }
}
