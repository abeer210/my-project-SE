package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import defpackage.yi2;

/* renamed from: sd2  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class sd2 implements yi2.a {
    public final /* synthetic */ AnimatorSet a;

    public /* synthetic */ sd2(AnimatorSet animatorSet) {
        this.a = animatorSet;
    }

    @Override // defpackage.yi2.a
    public final void a(Object obj) {
        this.a.addListener((Animator.AnimatorListener) obj);
    }
}
