package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: bf2  reason: default package */
/* compiled from: Options */
public class bf2 {
    public static final bf2 n = new bf2();
    public of2 a = new of2();
    public qf2 b = new qf2();
    public pf2 c = new pf2();
    public ke2 d = new ke2();
    public le2 e = new le2();
    public df2 f = new df2();
    public re2 g = new re2();
    public ie2 h = new ie2();
    public hf2 i = new hf2();
    public xe2 j = new xe2();
    public ze2 k = new ze2();
    public if2 l = new if2();
    public we2 m = new we2();

    public static bf2 k(vj2 vj2, JSONObject jSONObject) {
        bf2 bf2 = new bf2();
        if (jSONObject == null) {
            return bf2;
        }
        bf2.a = of2.d(vj2, jSONObject.optJSONObject(C0201.m82(9818)));
        bf2.b = qf2.c(jSONObject.optJSONObject(C0201.m82(9819)));
        bf2.c = pf2.c(vj2, jSONObject.optJSONObject(C0201.m82(9820)));
        bf2.d = ke2.c(vj2, jSONObject.optJSONObject(C0201.m82(9821)));
        bf2.e = le2.e(jSONObject.optJSONObject(C0201.m82(9822)));
        bf2.f = df2.a(jSONObject.optJSONObject(C0201.m82(9823)));
        bf2.g = re2.d(jSONObject.optJSONObject(C0201.m82(9824)));
        bf2.i = hf2.c(jSONObject.optJSONObject(C0201.m82(9825)));
        bf2.h = ie2.c(jSONObject.optJSONObject(C0201.m82(9826)));
        bf2.j = xe2.c(jSONObject);
        bf2.k = ze2.c(jSONObject.optJSONObject(C0201.m82(9827)));
        bf2.l = if2.e(jSONObject.optJSONObject(C0201.m82(9828)));
        bf2.m = we2.c(jSONObject.optJSONObject(C0201.m82(9829)));
        return bf2;
    }

    public bf2 a() {
        this.h = new ie2();
        return this;
    }

    public bf2 b() {
        this.d = new ke2();
        return this;
    }

    public bf2 c() {
        this.e = new le2();
        return this;
    }

    public bf2 d() {
        this.g = new re2();
        return this;
    }

    public bf2 e() {
        this.e.h = new eg2();
        this.e.f = new dg2();
        return this;
    }

    public bf2 f() {
        this.a = new of2();
        return this;
    }

    public bf2 g() {
        this.c = new pf2();
        return this;
    }

    public bf2 h() {
        this.b = new qf2();
        return this;
    }

    public bf2 i() {
        bf2 bf2 = new bf2();
        bf2.a.b(this.a);
        bf2.b.a(this.b);
        bf2.c.a(this.c);
        bf2.d.a(this.d);
        bf2.e.c(this.e);
        bf2.f = this.f;
        bf2.g.b(this.g);
        bf2.i.a(this.i);
        bf2.h.a(this.h);
        bf2.j.a(this.j);
        bf2.k.a(this.k);
        bf2.l.c(this.l);
        bf2.m.a(this.m);
        return bf2;
    }

    public bf2 j(bf2 bf2) {
        bf2 i2 = i();
        i2.a.b(bf2.a);
        i2.b.a(bf2.b);
        i2.c.a(bf2.c);
        i2.d.a(bf2.d);
        i2.e.c(bf2.e);
        i2.g.b(bf2.g);
        i2.h.a(bf2.h);
        i2.i.a(bf2.i);
        i2.j.a(bf2.j);
        i2.k.a(bf2.k);
        i2.l.c(bf2.l);
        i2.m.a(bf2.m);
        return i2;
    }

    public void l(int i2) {
        this.c.c = i2;
    }

    public bf2 m(bf2 bf2) {
        this.a.c(bf2.a);
        this.c.b(bf2.c);
        this.b.b(bf2.b);
        this.d.b(bf2.d);
        this.e.d(bf2.e);
        this.g.c(bf2.g);
        this.h.b(bf2.h);
        this.i.b(bf2.i);
        this.j.b(bf2.j);
        this.k.b(bf2.k);
        this.l.d(bf2.l);
        this.m.b(bf2.m);
        return this;
    }
}
