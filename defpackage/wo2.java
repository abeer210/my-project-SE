package defpackage;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.views.text.r;
import com.shazam.android.widget.text.reflow.BoundsCalculator;
import com.shazam.android.widget.text.reflow.ReflowTextAnimatorHelper;
import com.shazam.android.widget.text.reflow.TextColorGetter;
import vigqyno.C0201;

/* renamed from: wo2  reason: default package */
/* compiled from: TextChangeAnimator.kt */
public final class wo2 extends so2<r> {

    /* renamed from: wo2$a */
    /* compiled from: TextChangeAnimator.kt */
    static final class a implements BoundsCalculator {
        public final /* synthetic */ wo2 a;

        public a(wo2 wo2) {
            this.a = wo2;
        }

        @Override // com.shazam.android.widget.text.reflow.BoundsCalculator
        public final Rect a(View view) {
            int i;
            ow2.c(view, C0201.m82(1653));
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i2 = iArr[0];
            if (ow2.a(view, this.a.e())) {
                ViewGroup.LayoutParams layoutParams = this.a.e().getLayoutParams();
                if (layoutParams != null) {
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                } else {
                    throw new fv2(C0201.m82(1654));
                }
            } else {
                i = iArr[1];
            }
            return new Rect(i2, i, view.getWidth() + i2, view.getHeight() + i);
        }
    }

    /* renamed from: wo2$b */
    /* compiled from: TextChangeAnimator.kt */
    static final class b implements TextColorGetter {
        public static final b a = new b();

        @Override // com.shazam.android.widget.text.reflow.TextColorGetter
        public final int a(TextView textView) {
            return uj2.a(textView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(36866));
        ow2.c(view2, C0201.m82(36867));
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(36868));
        View d = d();
        String r1 = C0201.m82(36869);
        if (d != null) {
            TextView textView = (TextView) d;
            View e = e();
            if (e != null) {
                ReflowTextAnimatorHelper.Builder builder = new ReflowTextAnimatorHelper.Builder(textView, (TextView) e);
                builder.o(false);
                builder.q(new a(this));
                builder.r(b.a);
                Animator n = builder.n();
                ow2.b(n, C0201.m82(36870));
                return n;
            }
            throw new fv2(r1);
        }
        throw new fv2(r1);
    }

    /* renamed from: h */
    public boolean g(r rVar, r rVar2) {
        ow2.c(rVar, C0201.m82(36871));
        ow2.c(rVar2, C0201.m82(36872));
        Point i = zj2.i(d());
        Point i2 = zj2.i(e());
        return uj2.b(rVar) != uj2.b(rVar2) || !i.equals(i2.x, i2.y);
    }
}
