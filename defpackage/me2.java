package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: me2  reason: default package */
/* compiled from: Component */
public class me2 {
    public ig2 a = new eg2();
    public ig2 b = new eg2();
    public ge2 c = ge2.Default;
    public sf2 d = new zf2();
    public fg2 e = new dg2();
    public fg2 f = new dg2();

    public static me2 e(JSONObject jSONObject) {
        me2 me2 = new me2();
        if (jSONObject == null) {
            return me2;
        }
        me2.a = ug2.a(jSONObject, C0201.m82(7887));
        me2.b = ug2.a(jSONObject, C0201.m82(7888));
        me2.c = ge2.b((String) ug2.a(jSONObject, C0201.m82(7889)).e(C0201.m82(7890)));
        me2.d = lg2.a(jSONObject, C0201.m82(7891));
        me2.e = tg2.a(jSONObject, C0201.m82(7892));
        me2.f = tg2.a(jSONObject, C0201.m82(7893));
        return me2;
    }

    public boolean a(me2 me2) {
        return this.a.c(me2.a) && this.b.c(me2.b) && this.c.equals(me2.c) && this.d.c(me2.d) && this.e.c(me2.e) && this.f.c(me2.f);
    }

    public boolean b() {
        return this.a.f();
    }

    public void c(me2 me2) {
        if (me2.b.f()) {
            this.b = me2.b;
        }
        if (me2.a.f()) {
            this.a = me2.a;
        }
        if (me2.d.f()) {
            this.d = me2.d;
        }
        ge2 ge2 = me2.c;
        if (ge2 != ge2.Default) {
            this.c = ge2;
        }
        if (me2.e.f()) {
            this.e = me2.e;
        }
        if (me2.f.f()) {
            this.f = me2.f;
        }
    }

    public void d(me2 me2) {
        if (!this.b.f()) {
            this.b = me2.b;
        }
        if (!this.a.f()) {
            this.a = me2.a;
        }
        if (!this.d.f()) {
            this.d = me2.d;
        }
        if (this.c == ge2.Default) {
            this.c = me2.c;
        }
        if (!this.e.f()) {
            this.e = me2.e;
        }
        if (!this.f.f()) {
            this.f = me2.f;
        }
    }
}
