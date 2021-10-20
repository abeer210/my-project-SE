package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.facebook.react.views.image.g;
import vigqyno.C0201;

/* renamed from: to2  reason: default package */
/* compiled from: RotationAnimator.kt */
public final class to2 extends so2<g> {
    private final float c;
    private final float d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public to2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(15143));
        ow2.c(view2, C0201.m82(15144));
        this.c = view.getRotation();
        this.d = view2.getRotation();
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(15145));
        e().setRotation(this.c);
        e().setPivotX(0.0f);
        e().setPivotY(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e(), View.ROTATION, this.c, this.d);
        ow2.b(ofFloat, C0201.m82(15146));
        return ofFloat;
    }

    /* renamed from: h */
    public boolean g(g gVar, g gVar2) {
        ow2.c(gVar, C0201.m82(15147));
        ow2.c(gVar2, C0201.m82(15148));
        return this.c != this.d;
    }
}
