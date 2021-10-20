package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: oe2  reason: default package */
/* compiled from: ElementTransitionOptions.kt */
public final class oe2 {
    private final he2 a;

    public oe2(JSONObject jSONObject) {
        ow2.c(jSONObject, C0201.m82(32741));
        this.a = new he2(jSONObject);
    }

    public final AnimatorSet a(View view) {
        ow2.c(view, C0201.m82(32742));
        return this.a.a(view);
    }

    public final String b() {
        Object d = this.a.a.d();
        ow2.b(d, C0201.m82(32743));
        return (String) d;
    }
}
