package defpackage;

import android.animation.AnimatorSet;

/* renamed from: ud2  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class ud2 implements Runnable {
    public final /* synthetic */ be2 a;
    public final /* synthetic */ nl2 b;
    public final /* synthetic */ AnimatorSet c;
    public final /* synthetic */ bf2 d;

    public /* synthetic */ ud2(be2 be2, nl2 nl2, AnimatorSet animatorSet, bf2 bf2) {
        this.a = be2;
        this.b = nl2;
        this.c = animatorSet;
        this.d = bf2;
    }

    public final void run() {
        this.a.g(this.b, this.c, this.d);
    }
}
