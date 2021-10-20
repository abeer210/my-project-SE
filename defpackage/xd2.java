package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.reactnativenavigation.views.d;

/* renamed from: xd2  reason: default package */
/* compiled from: BottomTabsAnimator */
public class xd2 {
    private d a;

    /* renamed from: xd2$a */
    /* compiled from: BottomTabsAnimator */
    class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            xd2.this.a.q(false);
        }
    }

    /* renamed from: xd2$b */
    /* compiled from: BottomTabsAnimator */
    class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationEnd(Animator animator) {
            xd2.this.a.H(false);
        }
    }

    public xd2(d dVar) {
        this.a = dVar;
    }

    public void b(ie2 ie2) {
        if (ie2.b.d.e()) {
            AnimatorSet a2 = ie2.b.d.a(this.a);
            a2.addListener(new a());
            a2.start();
            return;
        }
        this.a.p();
    }

    public void c(ie2 ie2) {
        if (ie2.a.d.e()) {
            AnimatorSet a2 = ie2.a.d.a(this.a);
            a2.addListener(new b());
            a2.start();
            return;
        }
        this.a.G();
    }
}
