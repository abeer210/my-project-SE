package defpackage;

import android.graphics.Typeface;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: jf2  reason: default package */
/* compiled from: SubtitleOptions */
public class jf2 {
    public ig2 a = new eg2();
    public uf2 b = new ag2();
    public xf2 c = new cg2();
    public Typeface d;
    public ge2 e = ge2.Default;

    public static jf2 c(vj2 vj2, JSONObject jSONObject) {
        jf2 jf2 = new jf2();
        if (jSONObject == null) {
            return jf2;
        }
        jf2.a = ug2.a(jSONObject, C0201.m82(27177));
        jf2.b = mg2.a(jSONObject, C0201.m82(27178));
        jf2.c = og2.a(jSONObject, C0201.m82(27179));
        String r1 = C0201.m82(27180);
        String r2 = C0201.m82(27181);
        jf2.d = vj2.b(jSONObject.optString(r1, r2));
        jf2.e = ge2.b((String) ug2.a(jSONObject, C0201.m82(27182)).e(r2));
        return jf2;
    }

    public void a(jf2 jf2) {
        if (jf2.a.f()) {
            this.a = jf2.a;
        }
        if (jf2.b.f()) {
            this.b = jf2.b;
        }
        if (jf2.c.f()) {
            this.c = jf2.c;
        }
        Typeface typeface = jf2.d;
        if (typeface != null) {
            this.d = typeface;
        }
        ge2 ge2 = jf2.e;
        if (ge2 != ge2.Default) {
            this.e = ge2;
        }
    }

    public void b(jf2 jf2) {
        if (!this.a.f()) {
            this.a = jf2.a;
        }
        if (!this.b.f()) {
            this.b = jf2.b;
        }
        if (!this.c.f()) {
            this.c = jf2.c;
        }
        if (this.d == null) {
            this.d = jf2.d;
        }
        if (this.e == ge2.Default) {
            this.e = jf2.e;
        }
    }
}
