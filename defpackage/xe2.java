package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: xe2  reason: default package */
/* compiled from: ModalOptions */
public class xe2 {
    public ye2 a = ye2.Unspecified;
    public sf2 b = new zf2();

    public static xe2 c(JSONObject jSONObject) {
        xe2 xe2 = new xe2();
        if (jSONObject == null) {
            return xe2;
        }
        xe2.a = ye2.b(jSONObject.optString(C0201.m82(7824)));
        xe2.b = lg2.a(jSONObject, C0201.m82(7825));
        return xe2;
    }

    private boolean d() {
        return this.a != ye2.Unspecified;
    }

    public void a(xe2 xe2) {
        if (xe2.d()) {
            this.a = xe2.a;
        }
        if (xe2.b.f()) {
            this.b = xe2.b;
        }
    }

    public void b(xe2 xe2) {
        if (!d()) {
            this.a = xe2.a;
        }
        if (!this.b.f()) {
            this.b = xe2.b;
        }
    }
}
