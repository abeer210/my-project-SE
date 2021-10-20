package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.facebook.react.views.text.r;
import java.util.List;
import vigqyno.C0201;

/* renamed from: xo2  reason: default package */
/* compiled from: XAnimator.kt */
public final class xo2 extends so2<View> {
    private final int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(26793));
        ow2.c(view2, C0201.m82(26794));
        this.c = zj2.i(view).x - zj2.i(view2).x;
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(26795));
        e().setTranslationX((float) this.c);
        e().setPivotX(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e(), View.TRANSLATION_X, (float) this.c, 0.0f);
        ow2.b(ofFloat, C0201.m82(26796));
        return ofFloat;
    }

    @Override // defpackage.so2
    public List<Class<r>> b() {
        return nv2.a(r.class);
    }

    @Override // defpackage.so2
    public boolean g(View view, View view2) {
        ow2.c(view, C0201.m82(26797));
        ow2.c(view2, C0201.m82(26798));
        return this.c != 0;
    }
}
