package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: we2  reason: default package */
/* compiled from: LayoutOptions */
public class we2 {
    public uf2 a = new ag2();
    public uf2 b = new ag2();
    public fg2 c = new dg2();
    public cf2 d = new cf2();
    public te2 e = te2.DEFAULT;

    public static we2 c(JSONObject jSONObject) {
        we2 we2 = new we2();
        if (jSONObject == null) {
            return we2;
        }
        we2.a = mg2.a(jSONObject, C0201.m82(14556));
        we2.b = mg2.a(jSONObject, C0201.m82(14557));
        we2.c = tg2.a(jSONObject, C0201.m82(14558));
        we2.d = cf2.e(jSONObject);
        we2.e = te2.b(jSONObject.optString(C0201.m82(14559), C0201.m82(14560)));
        return we2;
    }

    public void a(we2 we2) {
        if (we2.a.f()) {
            this.a = we2.a;
        }
        if (we2.b.f()) {
            this.b = we2.b;
        }
        if (we2.c.f()) {
            this.c = we2.c;
        }
        if (we2.d.c()) {
            this.d = we2.d;
        }
        if (we2.e.e()) {
            this.e = we2.e;
        }
    }

    public void b(we2 we2) {
        if (!this.a.f()) {
            this.a = we2.a;
        }
        if (!this.b.f()) {
            this.b = we2.b;
        }
        if (!this.c.f()) {
            this.c = we2.c;
        }
        if (!this.d.c()) {
            this.d = we2.d;
        }
        if (!this.e.e()) {
            this.e = we2.e;
        }
    }
}
