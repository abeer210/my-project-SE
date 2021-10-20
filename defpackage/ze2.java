package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: ze2  reason: default package */
/* compiled from: NavigationBarOptions */
public class ze2 {
    public uf2 a = new ag2();
    public sf2 b = new zf2();

    public static ze2 c(JSONObject jSONObject) {
        ze2 ze2 = new ze2();
        if (jSONObject == null) {
            return ze2;
        }
        ze2.a = mg2.a(jSONObject, C0201.m82(33146));
        ze2.b = lg2.a(jSONObject, C0201.m82(33147));
        return ze2;
    }

    public void a(ze2 ze2) {
        if (ze2.a.f()) {
            this.a = ze2.a;
        }
        if (ze2.b.f()) {
            this.b = ze2.b;
        }
    }

    public void b(ze2 ze2) {
        if (!this.a.f()) {
            this.a = ze2.a;
        }
        if (!this.b.f()) {
            this.b = ze2.b;
        }
    }
}
