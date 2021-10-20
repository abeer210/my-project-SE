package defpackage;

import android.animation.AnimatorSet;
import android.util.Property;
import android.view.View;
import defpackage.rf2;
import defpackage.yi2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: he2  reason: default package */
/* compiled from: AnimationOptions.kt */
public class he2 {
    public static final a e = new a(null);
    public ig2 a;
    public sf2 b;
    public sf2 c;
    private HashSet<rf2> d;

    /* renamed from: he2$a */
    /* compiled from: AnimationOptions.kt */
    public static final class a {

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$a  reason: collision with other inner class name */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class C0138a extends nw2 implements gw2<View, Float> {
            public static final C0138a d = new C0138a();

            public C0138a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(35419);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(35420);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(35421));
                return view.getRotation();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$b */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class b extends nw2 implements gw2<View, Float> {
            public static final b d = new b();

            public b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(35451);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(35452);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(35453));
                return view.getX();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$c */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class c extends nw2 implements gw2<View, Float> {
            public static final c d = new c();

            public c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33470);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33471);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33472));
                return view.getY();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$d */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class d extends nw2 implements gw2<View, Float> {
            public static final d d = new d();

            public d() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33502);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33503);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33504));
                return view.getTranslationX();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$e */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class e extends nw2 implements gw2<View, Float> {
            public static final e d = new e();

            public e() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33508);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33509);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33510));
                return view.getTranslationY();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$f */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class f extends nw2 implements gw2<View, Float> {
            public static final f d = new f();

            public f() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33542);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33543);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33544));
                return view.getAlpha();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$g */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class g extends nw2 implements gw2<View, Float> {
            public static final g d = new g();

            public g() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33615);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33616);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33617));
                return view.getScaleX();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$h */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class h extends nw2 implements gw2<View, Float> {
            public static final h d = new h();

            public h() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33628);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33629);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33630));
                return view.getScaleY();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$i */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class i extends nw2 implements gw2<View, Float> {
            public static final i d = new i();

            public i() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33642);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33643);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33644));
                return view.getRotationX();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: he2$a$j */
        /* compiled from: AnimationOptions.kt */
        public static final /* synthetic */ class j extends nw2 implements gw2<View, Float> {
            public static final j d = new j();

            public j() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.gw2
            public /* bridge */ /* synthetic */ Float a(View view) {
                return Float.valueOf(h(view));
            }

            @Override // defpackage.hw2
            public final String e() {
                return C0201.m82(33723);
            }

            @Override // defpackage.hw2
            public final bx2 f() {
                return qw2.b(View.class);
            }

            @Override // defpackage.hw2
            public final String g() {
                return C0201.m82(33724);
            }

            public final float h(View view) {
                ow2.c(view, C0201.m82(33725));
                return view.getRotationY();
            }
        }

        private a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final ev2<Property<View, Float>, Integer, gw2<View, Float>> b(String str) {
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals(C0201.m82(16))) {
                        return new ev2<>(View.ROTATION_X, 0, i.d);
                    }
                    break;
                case -1249320805:
                    if (str.equals(C0201.m82(15))) {
                        return new ev2<>(View.ROTATION_Y, 0, j.d);
                    }
                    break;
                case -1225497657:
                    if (str.equals(C0201.m82(14))) {
                        return new ev2<>(View.TRANSLATION_X, 1, d.d);
                    }
                    break;
                case -1225497656:
                    if (str.equals(C0201.m82(13))) {
                        return new ev2<>(View.TRANSLATION_Y, 1, e.d);
                    }
                    break;
                case -908189618:
                    if (str.equals(C0201.m82(12))) {
                        return new ev2<>(View.SCALE_X, 0, g.d);
                    }
                    break;
                case -908189617:
                    if (str.equals(C0201.m82(11))) {
                        return new ev2<>(View.SCALE_Y, 0, h.d);
                    }
                    break;
                case -40300674:
                    if (str.equals(C0201.m82(10))) {
                        return new ev2<>(View.ROTATION, 0, C0138a.d);
                    }
                    break;
                case 120:
                    if (str.equals(C0201.m82(9))) {
                        return new ev2<>(View.X, 1, b.d);
                    }
                    break;
                case 121:
                    if (str.equals(C0201.m82(8))) {
                        return new ev2<>(View.Y, 1, c.d);
                    }
                    break;
                case 92909918:
                    if (str.equals(C0201.m82(7))) {
                        return new ev2<>(View.ALPHA, 0, f.d);
                    }
                    break;
            }
            throw new IllegalArgumentException(C0201.m82(17) + str);
        }

        public /* synthetic */ a(lw2 lw2) {
            this();
        }
    }

    /* renamed from: he2$b */
    /* compiled from: AnimationOptions.kt */
    static final class b<S, T> implements yi2.f<S, T> {
        public static final b a = new b();

        @Override // defpackage.yi2.f
        public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return Integer.valueOf(b((rf2) obj, ((Number) obj2).intValue()));
        }

        public final int b(rf2 rf2, int i) {
            ow2.c(rf2, C0201.m82(1005));
            Object e = rf2.i().e(Integer.valueOf(i));
            ow2.b(e, C0201.m82(1006));
            return Math.max(((Number) e).intValue(), i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: he2$c */
    /* compiled from: AnimationOptions.kt */
    public static final class c<T> implements yi2.a<T> {
        public final /* synthetic */ List a;
        public final /* synthetic */ View b;

        public c(List list, View view) {
            this.a = list;
            this.b = view;
        }

        /* renamed from: b */
        public final void a(rf2 rf2) {
            ow2.c(rf2, C0201.m82(488));
            this.a.add(rf2.h(this.b));
        }
    }

    /* renamed from: he2$d */
    /* compiled from: AnimationOptions.kt */
    static final class d<T> implements yi2.c<T> {
        public final /* synthetic */ Property a;

        public d(Property property) {
            this.a = property;
        }

        /* renamed from: b */
        public final boolean a(rf2 rf2) {
            ow2.c(rf2, C0201.m82(212));
            return rf2.equals(this.a);
        }
    }

    /* renamed from: he2$e */
    /* compiled from: AnimationOptions.kt */
    static final class e<T> implements fj2<T> {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        public e(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        /* renamed from: b */
        public final void a(rf2 rf2) {
            ow2.c(rf2, C0201.m82(164));
            rf2.l(this.a);
            rf2.m(this.b);
        }
    }

    public he2(JSONObject jSONObject) {
        this.a = new eg2();
        this.b = new zf2();
        this.c = new zf2();
        this.d = new HashSet<>();
        if (jSONObject != null) {
            i(jSONObject);
        }
    }

    private final void i(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (ow2.a(next, C0201.m82(3748))) {
                    ig2 a2 = ug2.a(jSONObject, next);
                    ow2.b(a2, C0201.m82(3749));
                    this.a = a2;
                } else {
                    boolean a3 = ow2.a(next, C0201.m82(3750));
                    String r3 = C0201.m82(3751);
                    if (a3 || ow2.a(next, C0201.m82(3752))) {
                        sf2 a4 = lg2.a(jSONObject, next);
                        ow2.b(a4, r3);
                        this.b = a4;
                    } else if (ow2.a(next, C0201.m82(3753))) {
                        sf2 a5 = lg2.a(jSONObject, next);
                        ow2.b(a5, r3);
                        this.c = a5;
                    } else {
                        HashSet<rf2> hashSet = this.d;
                        rf2.a aVar = rf2.k;
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        a aVar2 = e;
                        ow2.b(next, C0201.m82(3754));
                        hashSet.add(aVar.a(optJSONObject, aVar2.b(next)));
                    }
                }
            }
        }
    }

    public final AnimatorSet a(View view) {
        ow2.c(view, C0201.m82(3755));
        return b(view, new AnimatorSet());
    }

    public final AnimatorSet b(View view, AnimatorSet animatorSet) {
        ow2.c(view, C0201.m82(3756));
        ow2.c(animatorSet, C0201.m82(3757));
        if (!d()) {
            return animatorSet;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        yi2.g(this.d, new c(arrayList, view));
        animatorSet2.playTogether(arrayList);
        return animatorSet2;
    }

    public final int c() {
        Object s = yi2.s(this.d, 0, b.a);
        ow2.b(s, C0201.m82(3758));
        return ((Number) s).intValue();
    }

    public boolean d() {
        return !this.d.isEmpty();
    }

    public final boolean e() {
        return this.a.f() || this.b.f() || this.c.f();
    }

    public final boolean f() {
        T t;
        if (this.d.size() == 1) {
            Iterator<T> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.j()) {
                    break;
                }
            }
            if (t != null) {
                return true;
            }
        }
        return false;
    }

    public final void g(he2 he2) {
        ow2.c(he2, C0201.m82(3759));
        if (he2.a.f()) {
            this.a = he2.a;
        }
        if (he2.b.f()) {
            this.b = he2.b;
        }
        if (he2.c.f()) {
            this.c = he2.c;
        }
        if (!he2.d.isEmpty()) {
            this.d = he2.d;
        }
    }

    public final void h(he2 he2) {
        ow2.c(he2, C0201.m82(3760));
        if (!this.a.f()) {
            this.a = he2.a;
        }
        if (!this.b.f()) {
            this.b = he2.b;
        }
        if (!this.c.f()) {
            this.c = he2.c;
        }
        if (this.d.isEmpty()) {
            this.d = he2.d;
        }
    }

    public final void j(Property<View, Float> property, float f, float f2) {
        yi2.f(this.d, new d(property), new e(f, f2));
    }

    public he2() {
        this(null);
    }
}
