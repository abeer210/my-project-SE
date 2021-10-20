package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: qf2  reason: default package */
/* compiled from: TopTabsOptions */
public class qf2 {
    public uf2 a = new ag2();
    public uf2 b = new ag2();
    public fg2 c = new dg2();
    public sf2 d = new zf2();
    public fg2 e = new dg2();

    public static qf2 c(JSONObject jSONObject) {
        qf2 qf2 = new qf2();
        if (jSONObject == null) {
            return qf2;
        }
        qf2.a = mg2.a(jSONObject, C0201.m82(15569));
        qf2.b = mg2.a(jSONObject, C0201.m82(15570));
        qf2.c = tg2.a(jSONObject, C0201.m82(15571));
        qf2.d = lg2.a(jSONObject, C0201.m82(15572));
        qf2.e = tg2.a(jSONObject, C0201.m82(15573));
        return qf2;
    }

    public void a(qf2 qf2) {
        if (qf2.a.f()) {
            this.a = qf2.a;
        }
        if (qf2.b.f()) {
            this.b = qf2.b;
        }
        if (qf2.c.f()) {
            this.c = qf2.c;
        }
        if (qf2.d.f()) {
            this.d = qf2.d;
        }
        if (qf2.e.f()) {
            this.e = qf2.e;
        }
    }

    public void b(qf2 qf2) {
        if (!this.a.f()) {
            this.a = qf2.a;
        }
        if (!this.b.f()) {
            this.b = qf2.b;
        }
        if (!this.c.f()) {
            this.c = qf2.c;
        }
        if (!this.d.f()) {
            this.d = qf2.d;
        }
        if (!this.e.f()) {
            this.e = qf2.e;
        }
    }
}
