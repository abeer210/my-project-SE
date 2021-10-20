package defpackage;

import android.graphics.Typeface;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: ke2  reason: default package */
/* compiled from: BottomTabOptions */
public class ke2 {
    public ig2 a = new eg2();
    public uf2 b = new ag2();
    public uf2 c = new ag2();
    public ig2 d = new eg2();
    public ig2 e = new eg2();
    public uf2 f = new ag2();
    public uf2 g = new ag2();
    public ig2 h = new eg2();
    public ig2 i = new eg2();
    public uf2 j = new ag2();
    public sf2 k = new zf2();
    public ne2 l = new ne2();
    public fg2 m = new dg2();
    public fg2 n = new dg2();
    public sf2 o = new zf2();
    public Typeface p;

    public static ke2 c(vj2 vj2, JSONObject jSONObject) {
        ke2 ke2 = new ke2();
        if (jSONObject == null) {
            return ke2;
        }
        ke2.a = ug2.a(jSONObject, C0201.m82(17151));
        ke2.b = mg2.a(jSONObject, C0201.m82(17152));
        ke2.c = mg2.a(jSONObject, C0201.m82(17153));
        ke2.d = pg2.a(jSONObject, C0201.m82(17154));
        ke2.e = pg2.a(jSONObject, C0201.m82(17155));
        ke2.f = mg2.a(jSONObject, C0201.m82(17156));
        ke2.g = mg2.a(jSONObject, C0201.m82(17157));
        ke2.i = ug2.a(jSONObject, C0201.m82(17158));
        ke2.j = mg2.a(jSONObject, C0201.m82(17159));
        ke2.k = lg2.a(jSONObject, C0201.m82(17160));
        ke2.h = ug2.a(jSONObject, C0201.m82(17161));
        ke2.p = vj2.b(jSONObject.optString(C0201.m82(17162), C0201.m82(17163)));
        ke2.m = tg2.a(jSONObject, C0201.m82(17164));
        ke2.n = tg2.a(jSONObject, C0201.m82(17165));
        ke2.l = ne2.b(jSONObject.optJSONObject(C0201.m82(17166)));
        ke2.o = lg2.a(jSONObject, C0201.m82(17167));
        return ke2;
    }

    public void a(ke2 ke2) {
        if (ke2.a.f()) {
            this.a = ke2.a;
        }
        if (ke2.b.f()) {
            this.b = ke2.b;
        }
        if (ke2.c.f()) {
            this.c = ke2.c;
        }
        if (ke2.d.f()) {
            this.d = ke2.d;
        }
        if (ke2.e.f()) {
            this.e = ke2.e;
        }
        if (ke2.f.f()) {
            this.f = ke2.f;
        }
        if (ke2.g.f()) {
            this.g = ke2.g;
        }
        if (ke2.i.f()) {
            this.i = ke2.i;
        }
        if (ke2.j.f()) {
            this.j = ke2.j;
        }
        if (ke2.k.f()) {
            this.k = ke2.k;
        }
        if (ke2.h.f()) {
            this.h = ke2.h;
        }
        if (ke2.m.f()) {
            this.m = ke2.m;
        }
        if (ke2.n.f()) {
            this.n = ke2.n;
        }
        Typeface typeface = ke2.p;
        if (typeface != null) {
            this.p = typeface;
        }
        if (ke2.l.a()) {
            this.l = ke2.l;
        }
        if (ke2.o.f()) {
            this.o = ke2.o;
        }
    }

    public void b(ke2 ke2) {
        if (!this.a.f()) {
            this.a = ke2.a;
        }
        if (!this.b.f()) {
            this.b = ke2.b;
        }
        if (!this.c.f()) {
            this.c = ke2.c;
        }
        if (!this.d.f()) {
            this.d = ke2.d;
        }
        if (!this.e.f()) {
            this.e = ke2.e;
        }
        if (!this.f.f()) {
            this.f = ke2.f;
        }
        if (!this.g.f()) {
            this.g = ke2.g;
        }
        if (!this.i.f()) {
            this.i = ke2.i;
        }
        if (!this.j.f()) {
            this.j = ke2.j;
        }
        if (!this.k.f()) {
            this.k = ke2.k;
        }
        if (!this.m.f()) {
            this.m = ke2.m;
        }
        if (!this.n.f()) {
            this.n = ke2.n;
        }
        if (this.p == null) {
            this.p = ke2.p;
        }
        if (!this.h.f()) {
            this.h = ke2.h;
        }
        if (!this.l.a()) {
            this.l = ke2.l;
        }
        if (!this.o.f()) {
            this.o = ke2.o;
        }
    }
}
