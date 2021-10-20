package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: je2  reason: default package */
/* compiled from: BackButton */
public class je2 extends tf2 {
    public sf2 p = new zf2();
    private boolean q;

    public je2() {
        this.b = C0201.m82(29428);
        this.c = new ig2(C0201.m82(29429));
    }

    public static je2 o(JSONObject jSONObject) {
        je2 je2 = new je2();
        if (jSONObject != null && !jSONObject.toString().equals(C0201.m82(29430))) {
            je2.q = true;
            je2.p = lg2.a(jSONObject, C0201.m82(29431));
            je2.c = ug2.b(jSONObject, C0201.m82(29432), C0201.m82(29433));
            String r1 = C0201.m82(29434);
            if (jSONObject.has(r1)) {
                je2.m = ug2.a(jSONObject.optJSONObject(r1), C0201.m82(29435));
            }
            je2.b = jSONObject.optString(C0201.m82(29436), C0201.m82(29437));
            je2.e = lg2.a(jSONObject, C0201.m82(29438));
            je2.f = lg2.a(jSONObject, C0201.m82(29439));
            je2.h = mg2.a(jSONObject, C0201.m82(29440));
            je2.i = mg2.a(jSONObject, C0201.m82(29441));
            je2.n = ug2.a(jSONObject, C0201.m82(29442));
        }
        return je2;
    }

    public boolean l() {
        return this.q;
    }

    public void m(je2 je2) {
        if (!C0201.m82(29443).equals(je2.b)) {
            this.b = je2.b;
        }
        if (je2.c.f()) {
            this.c = je2.c;
        }
        if (je2.m.f()) {
            this.m = je2.m;
        }
        if (je2.p.f()) {
            this.p = je2.p;
        }
        if (je2.h.f()) {
            this.h = je2.h;
        }
        if (je2.i.f()) {
            this.i = je2.i;
        }
        if (je2.f.f()) {
            this.f = je2.f;
        }
        if (je2.e.f()) {
            this.e = je2.e;
        }
        if (je2.n.f()) {
            this.n = je2.n;
        }
    }

    public void n(je2 je2) {
        if (C0201.m82(29444).equals(this.b)) {
            this.b = je2.b;
        }
        if (!this.c.f()) {
            this.c = je2.c;
        }
        if (!this.m.f()) {
            this.m = je2.m;
        }
        if (!this.p.f()) {
            this.p = je2.p;
        }
        if (!this.h.f()) {
            this.h = je2.h;
        }
        if (!this.i.f()) {
            this.i = je2.i;
        }
        if (!this.f.f()) {
            this.f = je2.f;
        }
        if (!this.e.f()) {
            this.e = je2.e;
        }
        if (!this.n.f()) {
            this.n = je2.n;
        }
    }

    public void p() {
        this.p = new sf2(Boolean.TRUE);
        this.q = true;
    }
}
