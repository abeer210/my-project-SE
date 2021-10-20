package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.text.r;
import com.facebook.react.views.view.d;
import java.util.List;
import vigqyno.C0201;

/* renamed from: po2  reason: default package */
/* compiled from: BackgroundColorAnimator.kt */
public final class po2 extends so2<ViewGroup> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public po2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(9102));
        ow2.c(view2, C0201.m82(9103));
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(9104));
        Drawable background = e().getBackground();
        if (background != null) {
            qo2 qo2 = new qo2((d) background);
            double[] a = zi2.a(zj2.f(d()));
            double[] a2 = zi2.a(zj2.f(e()));
            ow2.b(a, C0201.m82(9105));
            ow2.b(a2, C0201.m82(9106));
            qo2.evaluate(0.0f, a, a2);
            ValueAnimator ofObject = ObjectAnimator.ofObject(qo2, a, a2);
            ow2.b(ofObject, C0201.m82(9107));
            return ofObject;
        }
        throw new fv2(C0201.m82(9108));
    }

    @Override // defpackage.so2
    public List<Class<r>> b() {
        return nv2.a(r.class);
    }

    /* renamed from: h */
    public boolean g(ViewGroup viewGroup, ViewGroup viewGroup2) {
        ow2.c(viewGroup, C0201.m82(9109));
        ow2.c(viewGroup2, C0201.m82(9110));
        if ((viewGroup.getBackground() instanceof d) && (viewGroup2.getBackground() instanceof d)) {
            Drawable background = viewGroup.getBackground();
            String r0 = C0201.m82(9111);
            if (background != null) {
                int j = ((d) background).j();
                Drawable background2 = viewGroup2.getBackground();
                if (background2 == null) {
                    throw new fv2(r0);
                } else if (j != ((d) background2).j()) {
                    return true;
                }
            } else {
                throw new fv2(r0);
            }
        }
        return false;
    }
}
