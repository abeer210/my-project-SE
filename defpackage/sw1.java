package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import vigqyno.C0201;

/* renamed from: sw1  reason: default package */
/* compiled from: CircularRevealWidget */
public interface sw1 {

    /* renamed from: sw1$b */
    /* compiled from: CircularRevealWidget */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        private final e a = new e();

        /* renamed from: a */
        public e evaluate(float f, e eVar, e eVar2) {
            this.a.a(zw1.c(eVar.a, eVar2.a, f), zw1.c(eVar.b, eVar2.b, f), zw1.c(eVar.c, eVar2.c, f));
            return this.a;
        }
    }

    /* renamed from: sw1$c */
    /* compiled from: CircularRevealWidget */
    public static class c extends Property<sw1, e> {
        public static final Property<sw1, e> a = new c(C0201.m82(10952));

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(sw1 sw1) {
            return sw1.getRevealInfo();
        }

        /* renamed from: b */
        public void set(sw1 sw1, e eVar) {
            sw1.setRevealInfo(eVar);
        }
    }

    /* renamed from: sw1$d */
    /* compiled from: CircularRevealWidget */
    public static class d extends Property<sw1, Integer> {
        public static final Property<sw1, Integer> a = new d(C0201.m82(11027));

        private d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(sw1 sw1) {
            return Integer.valueOf(sw1.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(sw1 sw1, Integer num) {
            sw1.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: sw1$e */
    /* compiled from: CircularRevealWidget */
    public static class e {
        public float a;
        public float b;
        public float c;

        public void a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
