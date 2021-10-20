package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: ff2  reason: default package */
/* compiled from: SharedElements */
public class ff2 {
    private List<ef2> a = new ArrayList();

    private void a(ef2 ef2) {
        this.a.add(ef2);
    }

    public static ff2 f(JSONObject jSONObject) {
        ff2 ff2 = new ff2();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(C0201.m82(15574));
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        ff2.a(ef2.f(jSONArray.getJSONObject(i)));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return ff2;
    }

    public List<ef2> b() {
        return this.a;
    }

    public boolean c() {
        return !this.a.isEmpty();
    }

    public void d(ff2 ff2) {
        if (ff2.c()) {
            this.a = ff2.a;
        }
    }

    public void e(ff2 ff2) {
        if (!c()) {
            this.a = ff2.a;
        }
    }
}
