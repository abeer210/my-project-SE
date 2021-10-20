package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.text.r;
import java.util.List;
import vigqyno.C0201;

/* renamed from: yo2  reason: default package */
/* compiled from: YAnimator.kt */
public final class yo2 extends so2<View> {
    private final int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yo2(View view, View view2) {
        super(view, view2);
        ow2.c(view, C0201.m82(24246));
        ow2.c(view2, C0201.m82(24247));
        Point i = zj2.i(view);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            this.c = i.y - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            return;
        }
        throw new fv2(C0201.m82(24248));
    }

    @Override // defpackage.so2
    public Animator a(ef2 ef2) {
        ow2.c(ef2, C0201.m82(24249));
        e().setTranslationY((float) this.c);
        e().setPivotY(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e(), View.TRANSLATION_Y, (float) this.c, 0.0f);
        ow2.b(ofFloat, C0201.m82(24250));
        return ofFloat;
    }

    @Override // defpackage.so2
    public List<Class<r>> b() {
        return nv2.a(r.class);
    }

    @Override // defpackage.so2
    public boolean g(View view, View view2) {
        ow2.c(view, C0201.m82(24251));
        ow2.c(view2, C0201.m82(24252));
        return this.c != 0;
    }
}
