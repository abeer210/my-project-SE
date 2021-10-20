package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: re2  reason: default package */
/* compiled from: FabOptions */
public class re2 {
    public ig2 a = new eg2();
    public uf2 b = new ag2();
    public uf2 c = new ag2();
    public uf2 d = new ag2();
    public ig2 e = new eg2();
    public uf2 f = new ag2();
    public sf2 g = new zf2();
    public ArrayList<re2> h = new ArrayList<>();
    public ig2 i = new eg2();
    public ig2 j = new eg2();
    public sf2 k = new zf2();
    public ig2 l = new eg2();

    public static re2 d(JSONObject jSONObject) {
        re2 re2 = new re2();
        if (jSONObject == null) {
            return re2;
        }
        re2.a = ug2.a(jSONObject, C0201.m82(7138));
        re2.b = mg2.a(jSONObject, C0201.m82(7139));
        re2.c = mg2.a(jSONObject, C0201.m82(7140));
        re2.d = mg2.a(jSONObject, C0201.m82(7141));
        re2.g = lg2.a(jSONObject, C0201.m82(7142));
        String r1 = C0201.m82(7143);
        if (jSONObject.has(r1)) {
            re2.e = ug2.a(jSONObject.optJSONObject(r1), C0201.m82(7144));
        }
        re2.f = mg2.a(jSONObject, C0201.m82(7145));
        String r12 = C0201.m82(7146);
        if (jSONObject.has(r12)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(r12);
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                re2.h.add(d(optJSONArray.optJSONObject(i2)));
            }
        }
        re2.i = ug2.a(jSONObject, C0201.m82(7147));
        re2.j = ug2.a(jSONObject, C0201.m82(7148));
        re2.k = lg2.a(jSONObject, C0201.m82(7149));
        re2.l = ug2.a(jSONObject, C0201.m82(7150));
        return re2;
    }

    public boolean a() {
        return this.a.f() || this.e.f();
    }

    public void b(re2 re2) {
        if (re2.a.f()) {
            this.a = re2.a;
        }
        if (re2.b.f()) {
            this.b = re2.b;
        }
        if (re2.c.f()) {
            this.c = re2.c;
        }
        if (re2.d.f()) {
            this.d = re2.d;
        }
        if (re2.g.f()) {
            this.g = re2.g;
        }
        if (re2.e.f()) {
            this.e = re2.e;
        }
        if (re2.f.f()) {
            this.f = re2.f;
        }
        if (re2.h.size() > 0) {
            this.h = re2.h;
        }
        if (re2.j.f()) {
            this.j = re2.j;
        }
        if (re2.i.f()) {
            this.i = re2.i;
        }
        if (re2.k.f()) {
            this.k = re2.k;
        }
        if (re2.l.f()) {
            this.l = re2.l;
        }
    }

    public void c(re2 re2) {
        if (!this.a.f()) {
            this.a = re2.a;
        }
        if (!this.b.f()) {
            this.b = re2.b;
        }
        if (!this.c.f()) {
            this.c = re2.c;
        }
        if (!this.d.f()) {
            this.d = re2.d;
        }
        if (!this.g.f()) {
            this.g = re2.g;
        }
        if (!this.e.f()) {
            this.e = re2.e;
        }
        if (!this.f.f()) {
            this.f = re2.f;
        }
        if (this.h.size() == 0) {
            this.h = re2.h;
        }
        if (!this.i.f()) {
            this.i = re2.i;
        }
        if (!this.j.f()) {
            this.j = re2.j;
        }
        if (!this.k.f()) {
            this.k = re2.k;
        }
        if (!this.l.f()) {
            this.l = re2.l;
        }
    }
}
