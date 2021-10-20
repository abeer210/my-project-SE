package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.facebook.react.views.image.g;
import defpackage.w90;
import vigqyno.C0201;

/* renamed from: ro2  reason: default package */
/* compiled from: MatrixAnimator.kt */
public final class ro2 extends so2<g> {

    /* renamed from: ro2$a */
    /* compiled from: MatrixAnimator.kt */
    static final class a<T> implements TypeEvaluator<Float> {
        public final /* synthetic */ g a;
        public final /* synthetic */ ro2 b;

        public a(g gVar, ro2 ro2) {
            this.a = gVar;
            this.b = ro2;
        }

        /* renamed from: a */
        public final Void evaluate(float f, Object obj, Object obj2) {
            ow2.c(obj, C0201.m82(30913));
            ow2.c(obj2, C0201.m82(30914));
            ba0 ba0 = (ba0) this.a.getHierarchy();
            String r4 = C0201.m82(30915);
            ow2.b(ba0, r4);
            if (ba0.n() != null) {
                ba0 ba02 = (ba0) this.a.getHierarchy();
                ow2.b(ba02, r4);
                w90.b bVar = (w90.b) ba02.n();
                if (bVar != null) {
                    bVar.b(f);
                    this.b.e().invalidate();
                } else {
                    ow2.f();
                    throw null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ro2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(34461));
        ow2.c(view2, C0201.m82(34462));
    }

    private final Rect h(View view) {
        return new Rect(0, 0, view.getWidth(), view.getHeight());
    }

    private final w90.c i(View view) {
        if (view != null) {
            ba0 ba0 = (ba0) ((g) view).getHierarchy();
            ow2.b(ba0, C0201.m82(34463));
            return ba0.n();
        }
        throw new fv2(C0201.m82(34464));
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(34465));
        View e = e();
        if (e != null) {
            g gVar = (g) e;
            ba0 ba0 = (ba0) gVar.getHierarchy();
            ow2.b(ba0, C0201.m82(34466));
            ba0.u(new w90.b(i(d()), i(e()), h(d()), h(e())));
            ValueAnimator ofObject = ObjectAnimator.ofObject(new a(gVar, this), 0, 1);
            ow2.b(ofObject, C0201.m82(34467));
            return ofObject;
        }
        throw new fv2(C0201.m82(34468));
    }

    /* renamed from: j */
    public boolean g(g gVar, g gVar2) {
        ow2.c(gVar, C0201.m82(34469));
        ow2.c(gVar2, C0201.m82(34470));
        return !zj2.a(d(), e());
    }
}
