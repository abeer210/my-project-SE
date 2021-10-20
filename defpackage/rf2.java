package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: rf2  reason: default package */
/* compiled from: ValueAnimationOptions.kt */
public final class rf2 {
    public static final a k = new a(null);
    private Property<View, Float> a;
    private Integer b;
    private gw2<? super View, Float> c;
    private wf2 d = new bg2();
    private wf2 e;
    private wf2 f;
    private wf2 g;
    private fg2 h;
    private fg2 i;
    private yf2 j;

    /* renamed from: rf2$a */
    /* compiled from: ValueAnimationOptions.kt */
    public static final class a {
        private a() {
        }

        public final rf2 a(JSONObject jSONObject, ev2<? extends Property<View, Float>, Integer, ? extends gw2<? super View, Float>> ev2) {
            ow2.c(ev2, C0201.m82(3491));
            rf2 rf2 = new rf2();
            rf2.a = (Property) ev2.a();
            rf2.b = ev2.b();
            rf2.c = (gw2) ev2.c();
            wf2 a = ng2.a(jSONObject, C0201.m82(3492));
            ow2.b(a, C0201.m82(3493));
            rf2.d = a;
            wf2 a2 = ng2.a(jSONObject, C0201.m82(3494));
            ow2.b(a2, C0201.m82(3495));
            rf2.f = a2;
            fg2 a3 = tg2.a(jSONObject, C0201.m82(3496));
            ow2.b(a3, C0201.m82(3497));
            rf2.k(a3);
            fg2 a4 = tg2.a(jSONObject, C0201.m82(3498));
            ow2.b(a4, C0201.m82(3499));
            rf2.i = a4;
            yf2 a5 = qg2.a(jSONObject, C0201.m82(3500));
            ow2.b(a5, C0201.m82(3501));
            rf2.j = a5;
            return rf2;
        }

        public /* synthetic */ a(lw2 lw2) {
            this();
        }
    }

    public rf2() {
        Float valueOf = Float.valueOf(0.0f);
        this.e = new wf2(valueOf);
        this.f = new bg2();
        this.g = new wf2(valueOf);
        this.h = new dg2();
        this.i = new dg2();
        this.j = yf2.NO_VALUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (true ^ ow2.a(rf2.class, obj.getClass()))) {
            return false;
        }
        return ow2.a(this.a, ((rf2) obj).a);
    }

    public final Animator h(View view) {
        Float f2;
        Float f3;
        ow2.c(view, C0201.m82(13536));
        if (this.d.f() || this.f.f()) {
            Float f4 = (Float) this.e.d();
            Float f5 = (Float) this.g.d();
            Integer num = this.b;
            String r5 = C0201.m82(13537);
            String r6 = C0201.m82(13538);
            if (num != null && num.intValue() == 1) {
                float floatValue = f4.floatValue();
                Context context = view.getContext();
                wf2 wf2 = this.d;
                gw2<? super View, Float> gw2 = this.c;
                if (gw2 != null) {
                    Object e2 = wf2.e(gw2.a(view));
                    ow2.b(e2, r6);
                    f3 = Float.valueOf(floatValue + xj2.a(context, ((Number) e2).floatValue()));
                    float floatValue2 = f5.floatValue();
                    Context context2 = view.getContext();
                    wf2 wf22 = this.f;
                    gw2<? super View, Float> gw22 = this.c;
                    if (gw22 != null) {
                        Object e3 = wf22.e(gw22.a(view));
                        ow2.b(e3, r5);
                        f2 = Float.valueOf(floatValue2 + xj2.a(context2, ((Number) e3).floatValue()));
                    } else {
                        ow2.f();
                        throw null;
                    }
                } else {
                    ow2.f();
                    throw null;
                }
            } else {
                float floatValue3 = f4.floatValue();
                wf2 wf23 = this.d;
                gw2<? super View, Float> gw23 = this.c;
                if (gw23 != null) {
                    Object e4 = wf23.e(gw23.a(view));
                    ow2.b(e4, r6);
                    f3 = Float.valueOf(floatValue3 + ((Number) e4).floatValue());
                    float floatValue4 = f5.floatValue();
                    wf2 wf24 = this.f;
                    gw2<? super View, Float> gw24 = this.c;
                    if (gw24 != null) {
                        Object e5 = wf24.e(gw24.a(view));
                        ow2.b(e5, r5);
                        f2 = Float.valueOf(floatValue4 + ((Number) e5).floatValue());
                    } else {
                        ow2.f();
                        throw null;
                    }
                } else {
                    ow2.f();
                    throw null;
                }
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, this.a, f3.floatValue(), f2.floatValue());
            ow2.b(ofFloat, C0201.m82(13539));
            ofFloat.setInterpolator(this.j.b());
            if (this.h.f()) {
                ofFloat.setDuration((long) ((Number) this.h.d()).intValue());
            }
            if (this.i.f()) {
                ofFloat.setStartDelay((long) ((Number) this.i.d()).intValue());
            }
            return ofFloat;
        }
        throw new IllegalArgumentException(C0201.m82(13540).toString());
    }

    public int hashCode() {
        Property<View, Float> property = this.a;
        if (property != null) {
            return property.hashCode();
        }
        return 0;
    }

    public final fg2 i() {
        return this.h;
    }

    public final boolean j() {
        return ow2.a(this.a, View.ALPHA);
    }

    public final void k(fg2 fg2) {
        ow2.c(fg2, C0201.m82(13541));
        this.h = fg2;
    }

    public final void l(float f2) {
        this.e = new wf2(Float.valueOf(f2));
    }

    public final void m(float f2) {
        this.g = new wf2(Float.valueOf(f2));
    }
}
