package defpackage;

import android.animation.TimeInterpolator;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: ef2  reason: default package */
/* compiled from: SharedElementTransitionOptions.kt */
public final class ef2 {
    public static final a f = new a(null);
    private ig2 a = new eg2();
    private ig2 b = new eg2();
    private fg2 c = new dg2();
    private fg2 d = new dg2();
    private yf2 e = yf2.NO_VALUE;

    /* renamed from: ef2$a */
    /* compiled from: SharedElementTransitionOptions.kt */
    public static final class a {
        private a() {
        }

        public final ef2 a(JSONObject jSONObject) {
            ef2 ef2 = new ef2();
            if (jSONObject == null) {
                return ef2;
            }
            ig2 a = ug2.a(jSONObject, C0201.m82(19922));
            ow2.b(a, C0201.m82(19923));
            ef2.h(a);
            ig2 a2 = ug2.a(jSONObject, C0201.m82(19924));
            ow2.b(a2, C0201.m82(19925));
            ef2.k(a2);
            fg2 a3 = tg2.a(jSONObject, C0201.m82(19926));
            ow2.b(a3, C0201.m82(19927));
            ef2.g(a3);
            fg2 a4 = tg2.a(jSONObject, C0201.m82(19928));
            ow2.b(a4, C0201.m82(19929));
            ef2.j(a4);
            yf2 a5 = qg2.a(jSONObject, C0201.m82(19930));
            ow2.b(a5, C0201.m82(19931));
            ef2.i(a5);
            return ef2;
        }

        public /* synthetic */ a(lw2 lw2) {
            this();
        }
    }

    public static final ef2 f(JSONObject jSONObject) {
        return f.a(jSONObject);
    }

    public final long a() {
        return (long) ((Number) this.c.e(0)).intValue();
    }

    public final ig2 b() {
        return this.a;
    }

    public final TimeInterpolator c() {
        TimeInterpolator b2 = this.e.b();
        ow2.b(b2, C0201.m82(28218));
        return b2;
    }

    public final long d() {
        return (long) ((Number) this.d.e(0)).intValue();
    }

    public final ig2 e() {
        return this.b;
    }

    public final void g(fg2 fg2) {
        ow2.c(fg2, C0201.m82(28219));
        this.c = fg2;
    }

    public final void h(ig2 ig2) {
        ow2.c(ig2, C0201.m82(28220));
        this.a = ig2;
    }

    public final void i(yf2 yf2) {
        ow2.c(yf2, C0201.m82(28221));
        this.e = yf2;
    }

    public final void j(fg2 fg2) {
        ow2.c(fg2, C0201.m82(28222));
        this.d = fg2;
    }

    public final void k(ig2 ig2) {
        ow2.c(ig2, C0201.m82(28223));
        this.b = ig2;
    }
}
