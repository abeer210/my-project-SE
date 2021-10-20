package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;

/* renamed from: ae2  reason: default package */
/* compiled from: ModalAnimator */
public class ae2 extends wd2 {
    private Animator d;

    public ae2(Context context) {
        super(context);
    }

    public void c(View view, he2 he2, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet b = he2.b(view, a(view));
        this.d = b;
        b.addListener(animatorListenerAdapter);
        this.d.start();
    }

    public void d(View view, he2 he2, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet b = he2.b(view, b(view));
        this.d = b;
        b.addListener(animatorListenerAdapter);
        this.d.start();
    }
}
