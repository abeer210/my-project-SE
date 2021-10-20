package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.text.r;
import java.util.List;
import vigqyno.C0201;

/* renamed from: uo2  reason: default package */
/* compiled from: ScaleXAnimator.kt */
public final class uo2 extends so2<ViewGroup> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(13018));
        ow2.c(view2, C0201.m82(13019));
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(13020));
        e().setScaleX(((float) d().getWidth()) / ((float) e().getWidth()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e(), View.SCALE_X, ((float) d().getWidth()) / ((float) e().getWidth()), 1.0f);
        ow2.b(ofFloat, C0201.m82(13021));
        return ofFloat;
    }

    @Override // defpackage.so2
    public List<Class<?>> b() {
        return nv2.a(r.class);
    }

    /* renamed from: h */
    public boolean g(ViewGroup viewGroup, ViewGroup viewGroup2) {
        ow2.c(viewGroup, C0201.m82(13022));
        ow2.c(viewGroup2, C0201.m82(13023));
        return viewGroup.getChildCount() == 0 && viewGroup2.getChildCount() == 0;
    }
}
