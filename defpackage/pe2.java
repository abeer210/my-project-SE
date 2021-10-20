package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: pe2  reason: default package */
/* compiled from: ElementTransitions.kt */
public final class pe2 {
    public static final a b = new a(null);
    private ArrayList<oe2> a = new ArrayList<>();

    /* renamed from: pe2$a */
    /* compiled from: ElementTransitions.kt */
    public static final class a {
        private a() {
        }

        public final pe2 a(JSONObject jSONObject) {
            ow2.c(jSONObject, C0201.m82(5813));
            pe2 pe2 = new pe2();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(5814));
                if (jSONArray.length() == 0) {
                    return pe2;
                }
                int i = 0;
                int length = jSONArray.length();
                if (length >= 0) {
                    while (true) {
                        ArrayList<oe2> b = pe2.b();
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        ow2.b(jSONObject2, C0201.m82(5815));
                        b.add(new oe2(jSONObject2));
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                return pe2;
            } catch (JSONException unused) {
            }
        }

        public /* synthetic */ a(lw2 lw2) {
            this();
        }
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }

    public final ArrayList<oe2> b() {
        return this.a;
    }

    public final void c(pe2 pe2) {
        ow2.c(pe2, C0201.m82(21084));
        if (pe2.a()) {
            this.a = pe2.a;
        }
    }

    public final void d(pe2 pe2) {
        ow2.c(pe2, C0201.m82(21085));
        if (!a()) {
            this.a = pe2.a;
        }
    }
}
