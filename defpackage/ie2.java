package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: ie2  reason: default package */
/* compiled from: AnimationsOptions */
public class ie2 {
    public af2 a = new af2();
    public af2 b = new af2();
    public af2 c = new af2();
    public he2 d = new he2();
    public he2 e = new he2();
    public he2 f = new he2();

    public static ie2 c(JSONObject jSONObject) {
        ie2 ie2 = new ie2();
        if (jSONObject == null) {
            return ie2;
        }
        ie2.a = af2.c(jSONObject.optJSONObject(C0201.m82(31414)));
        ie2.b = af2.c(jSONObject.optJSONObject(C0201.m82(31415)));
        ie2.c = af2.c(jSONObject.optJSONObject(C0201.m82(31416)));
        ie2.d = new he2(jSONObject.optJSONObject(C0201.m82(31417)));
        ie2.e = new he2(jSONObject.optJSONObject(C0201.m82(31418)));
        ie2.f = new he2(jSONObject.optJSONObject(C0201.m82(31419)));
        return ie2;
    }

    public void a(ie2 ie2) {
        this.a.a(ie2.a);
        this.b.a(ie2.b);
        this.d.g(ie2.d);
        this.c.a(ie2.c);
        this.e.g(ie2.e);
        this.f.g(ie2.f);
    }

    public void b(ie2 ie2) {
        this.a.b(ie2.a);
        this.b.b(ie2.b);
        this.c.b(ie2.c);
        this.d.h(ie2.d);
        this.e.h(ie2.e);
        this.f.h(ie2.f);
    }
}
