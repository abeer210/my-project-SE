package defpackage;

import java.util.List;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: ve2  reason: default package */
/* compiled from: LayoutNode */
public class ve2 {
    public final String a;
    public final a b;
    public final JSONObject c;
    public final List<ve2> d;

    /* renamed from: ve2$a */
    /* compiled from: LayoutNode */
    public enum a {
        Component,
        ExternalComponent,
        Stack,
        BottomTabs,
        SideMenuRoot,
        SideMenuCenter,
        SideMenuLeft,
        SideMenuRight,
        TopTabs
    }

    public ve2(String str, a aVar, JSONObject jSONObject, List<ve2> list) {
        this.a = str;
        this.b = aVar;
        this.c = jSONObject;
        this.d = list;
    }

    public JSONObject a() {
        return this.c.optJSONObject(C0201.m82(17555));
    }
}
