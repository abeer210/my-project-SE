package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: ne2  reason: default package */
/* compiled from: DotIndicatorOptions */
public class ne2 {
    public uf2 a = new ag2();
    public fg2 b = new dg2();
    public sf2 c = new zf2();
    public sf2 d = new zf2();

    public static ne2 b(JSONObject jSONObject) {
        ne2 ne2 = new ne2();
        if (jSONObject == null) {
            return ne2;
        }
        ne2.a = mg2.a(jSONObject, C0201.m82(35154));
        ne2.b = tg2.a(jSONObject, C0201.m82(35155));
        ne2.c = lg2.a(jSONObject, C0201.m82(35156));
        ne2.d = lg2.a(jSONObject, C0201.m82(35157));
        return ne2;
    }

    public boolean a() {
        return this.c.f();
    }
}
