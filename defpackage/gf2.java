package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: gf2  reason: default package */
/* compiled from: SideMenuOptions */
public class gf2 {
    public sf2 a = new zf2();
    public sf2 b = new zf2();
    public sf2 c = new zf2();
    public fg2 d = new dg2();
    public fg2 e = new dg2();

    public static gf2 c(JSONObject jSONObject) {
        gf2 gf2 = new gf2();
        if (jSONObject == null) {
            return gf2;
        }
        gf2.a = lg2.a(jSONObject, C0201.m82(13698));
        gf2.b = lg2.a(jSONObject, C0201.m82(13699));
        gf2.c = lg2.a(jSONObject, C0201.m82(13700));
        gf2.d = tg2.a(jSONObject, C0201.m82(13701));
        gf2.e = tg2.a(jSONObject, C0201.m82(13702));
        return gf2;
    }

    public void a(gf2 gf2) {
        if (gf2.a.f()) {
            this.a = gf2.a;
        }
        if (gf2.b.f()) {
            this.b = gf2.b;
        }
        if (gf2.c.f()) {
            this.c = gf2.c;
        }
        if (gf2.d.f()) {
            this.d = gf2.d;
        }
        if (gf2.e.f()) {
            this.e = gf2.e;
        }
    }

    public void b(gf2 gf2) {
        if (!this.a.f()) {
            this.a = gf2.a;
        }
        if (!this.b.f()) {
            this.b = gf2.b;
        }
        if (!this.c.f()) {
            this.c = gf2.c;
        }
        if (!this.d.f()) {
            this.d = gf2.d;
        }
        if (!this.e.f()) {
            this.e = gf2.e;
        }
    }
}
