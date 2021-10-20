package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: mf2  reason: default package */
/* compiled from: TopBarBackgroundOptions */
public class mf2 {
    public uf2 a = new ag2();
    public me2 b = new me2();
    public sf2 c = new zf2();

    public static mf2 c(JSONObject jSONObject) {
        mf2 mf2 = new mf2();
        if (jSONObject == null) {
            return mf2;
        }
        mf2.a = mg2.a(jSONObject, C0201.m82(9852));
        mf2.b = me2.e(jSONObject.optJSONObject(C0201.m82(9853)));
        mf2.c = lg2.a(jSONObject, C0201.m82(9854));
        if (mf2.b.b()) {
            mf2.a = new uf2(0);
        }
        return mf2;
    }

    public void a(mf2 mf2) {
        if (mf2.a.f()) {
            this.a = mf2.a;
        }
        if (mf2.c.f()) {
            this.c = mf2.c;
        }
        this.b.c(mf2.b);
    }

    public void b(mf2 mf2) {
        if (!this.a.f()) {
            this.a = mf2.a;
        }
        if (!this.c.f()) {
            this.c = mf2.c;
        }
        this.b.d(mf2.b);
    }
}
