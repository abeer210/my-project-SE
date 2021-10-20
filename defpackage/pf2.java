package defpackage;

import android.graphics.Typeface;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: pf2  reason: default package */
/* compiled from: TopTabOptions */
public class pf2 {
    public ig2 a = new eg2();
    public Typeface b;
    public int c;

    public static pf2 c(vj2 vj2, JSONObject jSONObject) {
        pf2 pf2 = new pf2();
        if (jSONObject == null) {
            return pf2;
        }
        pf2.a = ug2.a(jSONObject, C0201.m82(28624));
        pf2.b = vj2.b(jSONObject.optString(C0201.m82(28625)));
        return pf2;
    }

    public void a(pf2 pf2) {
        if (pf2.a.f()) {
            this.a = pf2.a;
        }
        Typeface typeface = pf2.b;
        if (typeface != null) {
            this.b = typeface;
        }
        int i = pf2.c;
        if (i >= 0) {
            this.c = i;
        }
    }

    public void b(pf2 pf2) {
        if (this.b == null) {
            this.b = pf2.b;
        }
    }
}
