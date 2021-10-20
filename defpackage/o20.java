package defpackage;

import defpackage.m20;
import defpackage.n20;
import defpackage.q20;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: o20  reason: default package */
/* compiled from: ServerConfigurationManager */
public class o20 implements p20 {
    private static final n20 b;
    private static final n20 c;
    private final String a;

    static {
        n20.b bVar = new n20.b();
        bVar.u();
        bVar.F(n20.c.ERROR);
        b = bVar.r();
        n20.b bVar2 = new n20.b();
        bVar2.H(-1);
        c = bVar2.r();
    }

    public o20(String str) {
        this.a = str;
    }

    private int c(int i, int i2, int i3, int i4, int i5) {
        return i < i2 ? i4 : i > i3 ? i5 : i;
    }

    private int d(int i, int i2, int i3) {
        return c(i, i2, i3, i2, i3);
    }

    private int e(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, i4, i4);
    }

    private JSONObject g(n20 n20) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(33083), n20.t());
        jSONObject.put(C0201.m82(33084), n20.y());
        jSONObject.put(C0201.m82(33085), n20.z());
        jSONObject.put(C0201.m82(33086), j(n20));
        return jSONObject;
    }

    private JSONObject h(n20 n20) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(33087), n20.B());
        return jSONObject;
    }

    private JSONObject i(n20 n20) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(33088), n20.u());
        jSONObject.put(C0201.m82(33089), n20.J());
        q20 C = n20.C();
        jSONObject.put(C0201.m82(33090), C.e());
        jSONObject.put(C0201.m82(33091), C.d());
        jSONObject.put(C0201.m82(33092), C.c());
        jSONObject.put(C0201.m82(33093), n20.A());
        jSONObject.put(C0201.m82(33094), n20.G().d());
        jSONObject.put(C0201.m82(33095), n20.v());
        return jSONObject;
    }

    private JSONObject j(n20 n20) throws JSONException {
        m20 x = n20.x();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(33096), x.c());
        return jSONObject;
    }

    @Override // defpackage.p20
    public n20 a(Map<String, String> map, z10 z10) {
        n20.b bVar = new n20.b();
        bVar.s(s30.k(map, C0201.m82(33097), 0, 1, 1, true));
        bVar.C(s30.j(map, C0201.m82(33098), 60, 540, 120));
        bVar.t(s30.k(map, C0201.m82(33099), 0, 2, 1, true));
        bVar.z(s30.k(map, C0201.m82(33100), 0, 2, 1, true));
        bVar.A(s30.k(map, C0201.m82(33101), 0, 2, 1, true));
        boolean z = false;
        bVar.D(s30.j(map, C0201.m82(33102), 0, C0188.f24, 1));
        bVar.v(s30.j(map, C0201.m82(33103), 1, C0188.f24, z10 == z10.APP_MON ? 30 : 150));
        q20.b a2 = q20.a();
        a2.e(s30.j(map, C0201.m82(33104), 0, C0188.f24, 600));
        bVar.E(a2.d());
        bVar.I(s30.k(map, C0201.m82(33105), 1, 100, 100, true));
        bVar.x(s30.k(map, C0201.m82(33106), 0, C0188.f24, 1, true));
        if (s30.k(map, C0201.m82(33107), 0, 1, 1, true) == 1) {
            z = true;
        }
        bVar.B(z);
        return bVar.r();
    }

    @Override // defpackage.p20
    public n20 b(n20 n20, String str) throws JSONException, ClassCastException, s10 {
        n20.b bVar;
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        String r0 = C0201.m82(33108);
        if (jSONObject.has(r0)) {
            String r1 = C0201.m82(33109);
            boolean has = jSONObject.has(r1);
            String r3 = C0201.m82(33110);
            String r4 = C0201.m82(33111);
            if (!(has && jSONObject.has(r4) && jSONObject.has(r3))) {
                bVar = n20.N(true);
            } else {
                n20.b s = n20.s();
                long j = jSONObject.getLong(r1);
                if (j <= n20.E()) {
                    return n20;
                }
                s.H(j);
                JSONObject jSONObject2 = jSONObject.getJSONObject(r3);
                String r12 = C0201.m82(33112);
                if (jSONObject2.has(r12)) {
                    s.v(d(jSONObject2.getInt(r12), 10, C0188.f24));
                }
                String r13 = C0201.m82(33113);
                if (jSONObject2.has(r13)) {
                    s.B(jSONObject2.getBoolean(r13));
                }
                s.E(m(jSONObject2));
                String r14 = C0201.m82(33114);
                if (jSONObject2.has(r14)) {
                    s.C(d(jSONObject2.getInt(r14), 10, 120));
                }
                String r15 = C0201.m82(33115);
                if (jSONObject2.has(r15)) {
                    s.J(i30.b(jSONObject2.getInt(r15), n20.r));
                }
                String r16 = C0201.m82(33116);
                if (jSONObject2.has(r16)) {
                    s.w(d(jSONObject2.getInt(r16), 0, 100));
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject(r4);
                String r17 = C0201.m82(33117);
                if (jSONObject3.has(r17) && !this.a.equals(jSONObject3.getString(r17))) {
                    return b;
                }
                String r18 = C0201.m82(33118);
                if (jSONObject3.has(r18)) {
                    s.s(e(jSONObject3.getInt(r18), 0, 1, 1));
                }
                String r19 = C0201.m82(33119);
                if (jSONObject3.has(r19)) {
                    s.t(e(jSONObject3.getInt(r19), 0, 1, 1));
                }
                String r110 = C0201.m82(33120);
                if (jSONObject3.has(r110)) {
                    s.z(e(jSONObject3.getInt(r110), 0, 1, 1));
                }
                if (jSONObject3.has(C0201.m82(33121))) {
                    s.A(e(jSONObject3.getInt(C0201.m82(33122)), 0, 1, 1));
                }
                if (jSONObject3.has(C0201.m82(33123))) {
                    s.I(e(jSONObject3.getInt(C0201.m82(33124)), 1, 100, 100));
                }
                if (jSONObject3.has(C0201.m82(33125))) {
                    s.y(l(jSONObject3.getJSONObject(C0201.m82(33126))));
                }
                bVar = s;
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject(r0);
            String r02 = C0201.m82(33127);
            if (jSONObject4.has(r02) && jSONObject4.getString(r02).compareToIgnoreCase(C0201.m82(33128)) == 0) {
                return b;
            }
            bVar.F(n20.c.OK);
            String r03 = C0201.m82(33129);
            if (jSONObject4.has(r03)) {
                bVar.x(e(jSONObject4.getInt(r03), 0, C0188.f24, 1));
            }
            String r04 = C0201.m82(33130);
            if (jSONObject4.has(r04)) {
                bVar.D(e(jSONObject4.getInt(r04), 0, C0188.f24, 1));
            }
            String r05 = C0201.m82(33131);
            if (jSONObject4.has(r05)) {
                bVar.G(jSONObject4.getBoolean(r05));
            }
            return bVar.r();
        }
        throw new s10(C0201.m82(33132));
    }

    public n20 f(String str) throws s10, JSONException {
        n20 b2 = b(c, str);
        if (b2.D() == n20.c.OK) {
            return b2;
        }
        throw new s10(C0201.m82(33133) + b2.D());
    }

    public String k(n20 n20) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0201.m82(33134), i(n20));
        jSONObject.put(C0201.m82(33135), g(n20));
        jSONObject.put(C0201.m82(33136), h(n20));
        jSONObject.put(C0201.m82(33137), 0L);
        return jSONObject.toString();
    }

    public m20 l(JSONObject jSONObject) throws JSONException {
        m20.b b2 = m20.b();
        String r1 = C0201.m82(33138);
        if (jSONObject.has(r1)) {
            b2.c(jSONObject.getBoolean(r1));
        }
        return b2.b();
    }

    public q20 m(JSONObject jSONObject) throws JSONException {
        q20.b a2 = q20.a();
        String r1 = C0201.m82(33139);
        if (jSONObject.has(r1)) {
            a2.g(d(jSONObject.getInt(r1), 10, C0188.f24));
        }
        String r12 = C0201.m82(33140);
        if (jSONObject.has(r12)) {
            a2.f(d(jSONObject.getInt(r12), 100, C0188.f24));
        }
        String r13 = C0201.m82(33141);
        if (jSONObject.has(r13)) {
            a2.e(d(jSONObject.getInt(r13), 30, C0188.f24));
        }
        return a2.d();
    }
}
