package defpackage;

import android.graphics.Typeface;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: lf2  reason: default package */
/* compiled from: TitleOptions */
public class lf2 {
    public ig2 a = new eg2();
    public uf2 b = new ag2();
    public xf2 c = new cg2();
    public ge2 d = ge2.Default;
    public Typeface e;
    public me2 f = new me2();
    public fg2 g = new dg2();
    public fg2 h = new dg2();

    public static lf2 c(vj2 vj2, JSONObject jSONObject) {
        lf2 lf2 = new lf2();
        if (jSONObject == null) {
            return lf2;
        }
        lf2.f = me2.e(jSONObject.optJSONObject(C0201.m82(12609)));
        lf2.a = ug2.a(jSONObject, C0201.m82(12610));
        lf2.b = mg2.a(jSONObject, C0201.m82(12611));
        lf2.c = og2.a(jSONObject, C0201.m82(12612));
        String r1 = C0201.m82(12613);
        String r2 = C0201.m82(12614);
        lf2.e = vj2.b(jSONObject.optString(r1, r2));
        lf2.d = ge2.b((String) ug2.a(jSONObject, C0201.m82(12615)).e(r2));
        lf2.g = tg2.a(jSONObject, C0201.m82(12616));
        lf2.h = tg2.a(jSONObject, C0201.m82(12617));
        return lf2;
    }

    public void a(lf2 lf2) {
        if (lf2.a.f()) {
            this.a = lf2.a;
        }
        if (lf2.b.f()) {
            this.b = lf2.b;
        }
        if (lf2.c.f()) {
            this.c = lf2.c;
        }
        Typeface typeface = lf2.e;
        if (typeface != null) {
            this.e = typeface;
        }
        ge2 ge2 = lf2.d;
        if (ge2 != ge2.Default) {
            this.d = ge2;
        }
        if (lf2.f.b()) {
            this.f = lf2.f;
        }
        if (lf2.g.f()) {
            this.g = lf2.g;
        }
        if (lf2.h.f()) {
            this.h = lf2.h;
        }
    }

    public void b(lf2 lf2) {
        if (!this.a.f()) {
            this.a = lf2.a;
        }
        if (!this.b.f()) {
            this.b = lf2.b;
        }
        if (!this.c.f()) {
            this.c = lf2.c;
        }
        if (this.e == null) {
            this.e = lf2.e;
        }
        if (this.d == ge2.Default) {
            this.d = lf2.d;
        }
        this.f.d(lf2.f);
        if (!this.g.f()) {
            this.g = lf2.g;
        }
        if (!this.h.f()) {
            this.h = lf2.h;
        }
    }
}
