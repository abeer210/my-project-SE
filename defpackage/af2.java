package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: af2  reason: default package */
/* compiled from: NestedAnimationsOptions */
public class af2 {
    public sf2 a = new zf2();
    public sf2 b = new zf2();
    public he2 c = new he2();
    public he2 d = new he2();
    public he2 e = new he2();
    public ff2 f = new ff2();
    public pe2 g = new pe2();

    public static af2 c(JSONObject jSONObject) {
        af2 af2 = new af2();
        if (jSONObject == null) {
            return af2;
        }
        af2.c = new he2(jSONObject.optJSONObject(C0201.m82(11998)));
        af2.d = new he2(jSONObject.optJSONObject(C0201.m82(11999)));
        af2.e = new he2(jSONObject.optJSONObject(C0201.m82(12000)));
        af2.a = lg2.b(jSONObject, C0201.m82(12001), C0201.m82(12002));
        af2.b = lg2.a(jSONObject, C0201.m82(12003));
        af2.f = ff2.f(jSONObject);
        af2.g = pe2.b.a(jSONObject);
        return af2;
    }

    public void a(af2 af2) {
        this.e.g(af2.e);
        this.c.g(af2.c);
        this.d.g(af2.d);
        this.f.d(af2.f);
        this.g.c(af2.g);
        if (af2.a.f()) {
            this.a = af2.a;
        }
        if (af2.b.f()) {
            this.b = af2.b;
        }
    }

    public void b(af2 af2) {
        this.c.h(af2.c);
        this.d.h(af2.d);
        this.e.h(af2.e);
        this.f.e(af2.f);
        this.g.d(af2.g);
        if (!this.a.f()) {
            this.a = af2.a;
        }
        if (!this.b.f()) {
            this.b = af2.b;
        }
    }
}
