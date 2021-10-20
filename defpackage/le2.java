package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: le2  reason: default package */
/* compiled from: BottomTabsOptions */
public class le2 {
    public uf2 a = new ag2();
    public sf2 b = new zf2();
    public sf2 c = new zf2();
    public sf2 d = new zf2();
    public sf2 e = new zf2();
    public fg2 f = new dg2();
    public xf2 g = new cg2();
    public ig2 h = new eg2();
    public ig2 i = new eg2();
    public jg2 j = jg2.UNDEFINED;
    public kf2 k = kf2.UNDEFINED;

    public static le2 e(JSONObject jSONObject) {
        le2 le2 = new le2();
        if (jSONObject == null) {
            return le2;
        }
        le2.a = mg2.a(jSONObject, C0201.m82(14902));
        le2.h = ug2.a(jSONObject, C0201.m82(14903));
        le2.f = tg2.a(jSONObject, C0201.m82(14904));
        le2.b = lg2.a(jSONObject, C0201.m82(14905));
        le2.c = lg2.a(jSONObject, C0201.m82(14906));
        le2.e = lg2.a(jSONObject, C0201.m82(14907));
        le2.d = lg2.a(jSONObject, C0201.m82(14908));
        le2.g = og2.a(jSONObject, C0201.m82(14909));
        le2.i = ug2.a(jSONObject, C0201.m82(14910));
        le2.j = jg2.b(jSONObject.optString(C0201.m82(14911)));
        le2.k = kf2.b(jSONObject.optString(C0201.m82(14912)));
        return le2;
    }

    public void a() {
        this.h = new eg2();
        this.f = new dg2();
    }

    public boolean b() {
        return this.b.g() || this.c.i();
    }

    public void c(le2 le2) {
        if (le2.h.f()) {
            this.h = le2.h;
        }
        if (le2.f.f()) {
            this.f = le2.f;
        }
        if (le2.b.f()) {
            this.b = le2.b;
        }
        if (le2.c.f()) {
            this.c = le2.c;
        }
        if (le2.d.f()) {
            this.d = le2.d;
        }
        if (le2.e.f()) {
            this.e = le2.e;
        }
        if (le2.g.f()) {
            this.g = le2.g;
        }
        if (le2.a.f()) {
            this.a = le2.a;
        }
        if (le2.i.f()) {
            this.i = le2.i;
        }
        if (le2.j.e()) {
            this.j = le2.j;
        }
        if (le2.k.d()) {
            this.k = le2.k;
        }
    }

    public void d(le2 le2) {
        if (!this.h.f()) {
            this.h = le2.h;
        }
        if (!this.f.f()) {
            this.f = le2.f;
        }
        if (!this.b.f()) {
            this.b = le2.b;
        }
        if (!this.c.f()) {
            this.c = le2.c;
        }
        if (!this.d.f()) {
            this.d = le2.d;
        }
        if (!this.e.f()) {
            this.e = le2.e;
        }
        if (!this.g.f()) {
            this.g = le2.g;
        }
        if (!this.a.f()) {
            this.a = le2.a;
        }
        if (!this.j.e()) {
            this.j = le2.j;
        }
        if (!this.k.d()) {
            this.k = le2.k;
        }
    }
}
