package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.text.r;
import java.util.List;
import vigqyno.C0201;

/* renamed from: vo2  reason: default package */
/* compiled from: ScaleYAnimator.kt */
public final class vo2 extends so2<ViewGroup> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(1207));
        ow2.c(view2, C0201.m82(1208));
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(1209));
        e().setScaleY(((float) d().getHeight()) / ((float) e().getHeight()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e(), View.SCALE_Y, ((float) d().getHeight()) / ((float) e().getHeight()), 1.0f);
        ow2.b(ofFloat, C0201.m82(1210));
        return ofFloat;
    }

    @Override // defpackage.so2
    public List<Class<r>> b() {
        return nv2.a(r.class);
    }

    /* renamed from: h */
    public boolean g(ViewGroup viewGroup, ViewGroup viewGroup2) {
        ow2.c(viewGroup, C0201.m82(1211));
        ow2.c(viewGroup2, C0201.m82(1212));
        return viewGroup.getChildCount() == 0 && viewGroup2.getChildCount() == 0;
    }
}
