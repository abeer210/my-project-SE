package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: se2  reason: default package */
/* compiled from: FadeAnimation */
public class se2 extends af2 {
    public se2() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0201.m82(3671), 0);
            jSONObject.put(C0201.m82(3672), 1);
            jSONObject.put(C0201.m82(3673), C0188.f19);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0201.m82(3674), jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C0201.m82(3675), jSONObject2);
            a(af2.c(jSONObject3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
