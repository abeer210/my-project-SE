package defpackage;

import defpackage.yi2;
import org.json.JSONObject;

/* renamed from: kg2  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class kg2 implements yi2.c {
    public final /* synthetic */ JSONObject a;

    public /* synthetic */ kg2(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.yi2.c
    public final boolean a(Object obj) {
        return this.a.has((String) obj);
    }
}
