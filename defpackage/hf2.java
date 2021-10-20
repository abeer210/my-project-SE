package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: hf2  reason: default package */
/* compiled from: SideMenuRootOptions */
public class hf2 {
    public gf2 a = new gf2();
    public gf2 b = new gf2();

    public static hf2 c(JSONObject jSONObject) {
        hf2 hf2 = new hf2();
        if (jSONObject == null) {
            return hf2;
        }
        hf2.a = gf2.c(jSONObject.optJSONObject(C0201.m82(1651)));
        hf2.b = gf2.c(jSONObject.optJSONObject(C0201.m82(1652)));
        return hf2;
    }

    public void a(hf2 hf2) {
        this.a.a(hf2.a);
        this.b.a(hf2.b);
    }

    public void b(hf2 hf2) {
        this.a.b(hf2.a);
        this.b.b(hf2.b);
    }
}
