package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import defpackage.pk0;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: ko2  reason: default package */
/* compiled from: ElementTransitionManager.kt */
public class ko2 {
    private final no2 a = new no2();

    /* renamed from: ko2$a */
    /* compiled from: ElementTransitionManager.kt */
    public static final class a implements pk0.b {
        public final /* synthetic */ lo2 a;
        public final /* synthetic */ oo2 b;
        public final /* synthetic */ ff2 c;
        public final /* synthetic */ pe2 d;
        public final /* synthetic */ fj2 e;

        /* renamed from: ko2$a$a  reason: collision with other inner class name */
        /* compiled from: View.kt */
        public static final class View$OnLayoutChangeListenerC0149a implements View.OnLayoutChangeListener {
            public final /* synthetic */ a a;
            public final /* synthetic */ View b;

            public View$OnLayoutChangeListenerC0149a(a aVar, View view) {
                this.a = aVar;
                this.b = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ow2.c(view, C0201.m82(15164));
                view.removeOnLayoutChangeListener(this);
                this.a.a.k(this.b);
                if (this.a.a.i()) {
                    a aVar = this.a;
                    aVar.b.b(aVar.a);
                }
                if (this.a.b.h() == this.a.c.b().size() + this.a.d.b().size()) {
                    a aVar2 = this.a;
                    aVar2.e.a(aVar2.b);
                }
            }
        }

        public a(lo2 lo2, oo2 oo2, ff2 ff2, pe2 pe2, fj2 fj2) {
            this.a = lo2;
            this.b = oo2;
            this.c = ff2;
            this.d = pe2;
            this.e = fj2;
        }

        @Override // defpackage.pk0.b
        public String a() {
            return this.a.h();
        }

        @Override // defpackage.pk0.b
        public void b(View view) {
            ow2.c(view, C0201.m82(10732));
            if (!k3.O(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0149a(this, view));
                return;
            }
            this.a.k(view);
            if (this.a.i()) {
                this.b.b(this.a);
            }
            if (this.b.h() == this.c.b().size() + this.d.b().size()) {
                this.e.a(this.b);
            }
        }
    }

    /* renamed from: ko2$b */
    /* compiled from: ElementTransitionManager.kt */
    public static final class b implements pk0.b {
        public final /* synthetic */ jo2 a;
        public final /* synthetic */ nl2 b;
        public final /* synthetic */ oo2 c;
        public final /* synthetic */ ff2 d;
        public final /* synthetic */ pe2 e;
        public final /* synthetic */ fj2 f;

        /* renamed from: ko2$b$a */
        /* compiled from: View.kt */
        public static final class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ b a;
            public final /* synthetic */ View b;

            public a(b bVar, View view) {
                this.a = bVar;
                this.b = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ow2.c(view, C0201.m82(13683));
                view.removeOnLayoutChangeListener(this);
                this.a.a.g(this.b);
                b bVar = this.a;
                bVar.a.h(bVar.b);
                b bVar2 = this.a;
                bVar2.c.a(bVar2.a);
                if (this.a.c.h() == this.a.d.b().size() + this.a.e.b().size()) {
                    b bVar3 = this.a;
                    bVar3.f.a(bVar3.c);
                }
            }
        }

        public b(jo2 jo2, nl2 nl2, oo2 oo2, ff2 ff2, pe2 pe2, fj2 fj2) {
            this.a = jo2;
            this.b = nl2;
            this.c = oo2;
            this.d = ff2;
            this.e = pe2;
            this.f = fj2;
        }

        @Override // defpackage.pk0.b
        public String a() {
            return this.a.e();
        }

        @Override // defpackage.pk0.b
        public void b(View view) {
            ow2.c(view, C0201.m82(10587));
            if (!k3.O(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new a(this, view));
                return;
            }
            this.a.g(view);
            this.a.h(this.b);
            this.c.a(this.a);
            if (this.c.h() == this.d.b().size() + this.e.b().size()) {
                this.f.a(this.c);
            }
        }
    }

    public final AnimatorSet a(he2 he2, oo2 oo2) {
        no2 no2 = this.a;
        if (he2 == null) {
            ow2.f();
            throw null;
        } else if (oo2 != null) {
            return no2.b(he2, oo2);
        } else {
            ow2.f();
            throw null;
        }
    }

    public final void b(af2 af2, nl2<?> nl2, nl2<?> nl22, fj2<oo2> fj2) {
        pe2 pe2;
        ow2.c(af2, C0201.m82(187));
        ow2.c(nl2, C0201.m82(188));
        ow2.c(nl22, C0201.m82(189));
        ow2.c(fj2, C0201.m82(190));
        ff2 ff2 = af2.f;
        pe2 pe22 = af2.g;
        if (ff2.c() || pe22.a()) {
            oo2 oo2 = new oo2();
            Iterator<ef2> it = ff2.b().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String r13 = C0201.m82(191);
                if (hasNext) {
                    ef2 next = it.next();
                    if (next != null) {
                        lo2 lo2 = new lo2(nl22, next);
                        View b2 = pk0.b(nl2.B(), lo2.g());
                        if (b2 != null) {
                            ow2.b(b2, r13);
                            lo2.j(b2);
                        }
                        pk0.c(nl22.B(), new a(lo2, oo2, ff2, pe22, fj2));
                    } else {
                        ow2.f();
                        throw null;
                    }
                } else {
                    Iterator<oe2> it2 = pe22.b().iterator();
                    while (it2.hasNext()) {
                        oe2 next2 = it2.next();
                        ow2.b(next2, C0201.m82(192));
                        jo2 jo2 = new jo2(next2);
                        View b3 = pk0.b(nl2.B(), jo2.e());
                        if (b3 != null) {
                            ow2.b(b3, r13);
                            jo2.g(b3);
                            jo2.h(nl2);
                            oo2.a(jo2);
                        }
                        if (jo2.f()) {
                            pe2 = pe22;
                        } else {
                            pe2 = pe22;
                            pk0.c(nl22.B(), new b(jo2, nl22, oo2, ff2, pe22, fj2));
                        }
                        pe22 = pe2;
                    }
                    return;
                }
            }
        } else {
            fj2.a(new oo2());
        }
    }
}
