package defpackage;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: tf2  reason: default package */
/* compiled from: Button */
public class tf2 {
    public String a;
    public String b;
    public ig2 c = new eg2();
    public ig2 d = new eg2();
    public sf2 e = new zf2();
    public sf2 f = new zf2();
    public fg2 g = new dg2();
    public uf2 h = new ag2();
    public uf2 i = new ag2();
    public xf2 j = new cg2();
    private ig2 k = new eg2();
    public Typeface l;
    public ig2 m = new eg2();
    public ig2 n = new eg2();
    public me2 o = new me2();

    public tf2() {
        StringBuilder sb = new StringBuilder();
        String r1 = C0201.m82(38298);
        sb.append(r1);
        sb.append(cj2.a());
        this.a = sb.toString();
        this.b = r1 + cj2.a();
    }

    public static ArrayList<tf2> h(JSONObject jSONObject, String str, vj2 vj2) {
        ArrayList<tf2> arrayList = new ArrayList<>();
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            arrayList.addAll(j(optJSONArray, vj2));
        } else {
            arrayList.add(i(jSONObject.optJSONObject(str), vj2));
        }
        return arrayList;
    }

    private static tf2 i(JSONObject jSONObject, vj2 vj2) {
        tf2 tf2 = new tf2();
        String optString = jSONObject.optString(C0201.m82(38299));
        tf2.b = (String) qj2.e(optString, C0201.m82(38300) + cj2.a());
        tf2.c = ug2.a(jSONObject, C0201.m82(38301));
        tf2.d = ug2.a(jSONObject, C0201.m82(38302));
        tf2.e = lg2.a(jSONObject, C0201.m82(38303));
        tf2.f = lg2.a(jSONObject, C0201.m82(38304));
        tf2.g = k(jSONObject);
        tf2.h = mg2.a(jSONObject, C0201.m82(38305));
        tf2.i = mg2.a(jSONObject, C0201.m82(38306));
        tf2.j = og2.a(jSONObject, C0201.m82(38307));
        tf2.l = vj2.b(jSONObject.optString(C0201.m82(38308), C0201.m82(38309)));
        tf2.k = ug2.a(jSONObject, C0201.m82(38310));
        tf2.n = ug2.a(jSONObject, C0201.m82(38311));
        tf2.o = me2.e(jSONObject.optJSONObject(C0201.m82(38312)));
        String r5 = C0201.m82(38313);
        if (jSONObject.has(r5)) {
            tf2.m = ug2.a(jSONObject.optJSONObject(r5), C0201.m82(38314));
        }
        return tf2;
    }

    private static ArrayList<tf2> j(JSONArray jSONArray, vj2 vj2) {
        ArrayList<tf2> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(i(jSONArray.optJSONObject(i2), vj2));
        }
        return arrayList;
    }

    private static fg2 k(JSONObject jSONObject) {
        ig2 a2 = ug2.a(jSONObject, C0201.m82(38315));
        if (!a2.f()) {
            return new fg2(1);
        }
        String str = (String) a2.d();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1414557169:
                if (str.equals(C0201.m82(38319))) {
                    c2 = 0;
                    break;
                }
                break;
            case -1192154216:
                if (str.equals(C0201.m82(38318))) {
                    c2 = 3;
                    break;
                }
                break;
            case -940730605:
                if (str.equals(C0201.m82(38317))) {
                    c2 = 2;
                    break;
                }
                break;
            case 104712844:
                if (str.equals(C0201.m82(38316))) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return new fg2(2);
        }
        if (c2 == 1) {
            return new fg2(0);
        }
        if (c2 != 2) {
            return new fg2(1);
        }
        return new fg2(4);
    }

    public tf2 a() {
        tf2 tf2 = new tf2();
        tf2.f(this);
        return tf2;
    }

    public boolean b(tf2 tf2) {
        return Objects.equals(this.b, tf2.b) && this.c.c(tf2.c) && this.d.c(tf2.d) && this.e.c(tf2.e) && this.f.c(tf2.f) && this.g.c(tf2.g) && this.h.c(tf2.h) && this.i.c(tf2.i) && this.j.c(tf2.j) && this.k.c(tf2.k) && Objects.equals(this.l, tf2.l) && this.m.c(tf2.m) && this.n.c(tf2.n) && this.o.a(tf2.o);
    }

    public int c() {
        return jj2.c.a((String) this.o.b.e(this.b));
    }

    public boolean d() {
        return this.o.b();
    }

    public boolean e() {
        return this.m.f();
    }

    public void f(tf2 tf2) {
        if (tf2.d.f()) {
            this.d = tf2.d;
        }
        if (tf2.c.f()) {
            this.c = tf2.c;
        }
        if (tf2.e.f()) {
            this.e = tf2.e;
        }
        if (tf2.f.f()) {
            this.f = tf2.f;
        }
        if (tf2.h.f()) {
            this.h = tf2.h;
        }
        if (tf2.i.f()) {
            this.i = tf2.i;
        }
        if (tf2.j.f()) {
            this.j = tf2.j;
        }
        Typeface typeface = tf2.l;
        if (typeface != null) {
            this.l = typeface;
        }
        if (tf2.k.f()) {
            this.k = tf2.k;
        }
        if (tf2.n.f()) {
            this.n = tf2.n;
        }
        if (tf2.o.b()) {
            this.o = tf2.o;
        }
        if (tf2.g.f()) {
            this.g = tf2.g;
        }
        if (tf2.m.f()) {
            this.m = tf2.m;
        }
        String str = tf2.b;
        if (str != null) {
            this.b = str;
        }
        String str2 = tf2.a;
        if (str2 != null) {
            this.a = str2;
        }
    }

    public void g(tf2 tf2) {
        if (!this.d.f()) {
            this.d = tf2.d;
        }
        if (!this.c.f()) {
            this.c = tf2.c;
        }
        if (!this.e.f()) {
            this.e = tf2.e;
        }
        if (!this.f.f()) {
            this.f = tf2.f;
        }
        if (!this.h.f()) {
            this.h = tf2.h;
        }
        if (!this.i.f()) {
            this.i = tf2.i;
        }
        if (!this.j.f()) {
            this.j = tf2.j;
        }
        if (this.l == null) {
            this.l = tf2.l;
        }
        if (!this.k.f()) {
            this.k = tf2.k;
        }
        if (!this.n.f()) {
            this.n = tf2.n;
        }
        if (!this.o.b()) {
            this.o = tf2.o;
        }
        if (!this.g.f()) {
            this.g = tf2.g;
        }
        if (!this.m.f()) {
            this.m = tf2.m;
        }
    }
}
