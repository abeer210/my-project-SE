package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: no2  reason: default package */
/* compiled from: TransitionAnimatorCreator.kt */
public class no2 {

    /* renamed from: no2$a */
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return bw2.a(ViewGroupManager.getViewZIndex(t.b()), ViewGroupManager.getViewZIndex(t2.b()));
        }
    }

    /* renamed from: no2$b */
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object tag = t.b().getTag(qd2.original_index_in_parent);
            String r0 = C0201.m82(17659);
            if (tag != null) {
                Integer valueOf = Integer.valueOf(((Integer) tag).intValue());
                Object tag2 = t2.b().getTag(qd2.original_index_in_parent);
                if (tag2 != null) {
                    return bw2.a(valueOf, Integer.valueOf(((Integer) tag2).intValue()));
                }
                throw new fv2(r0);
            }
            throw new fv2(r0);
        }
    }

    /* renamed from: no2$c */
    /* compiled from: Animator.kt */
    public static final class c implements Animator.AnimatorListener {
        public final /* synthetic */ no2 a;
        public final /* synthetic */ oo2 b;

        public c(no2 no2, oo2 oo2) {
            this.a = no2;
            this.b = oo2;
        }

        public void onAnimationCancel(Animator animator) {
            ow2.c(animator, C0201.m82(17760));
            this.a.i(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            ow2.c(animator, C0201.m82(17761));
        }

        public void onAnimationRepeat(Animator animator) {
            ow2.c(animator, C0201.m82(17762));
        }

        public void onAnimationStart(Animator animator) {
            ow2.c(animator, C0201.m82(17763));
        }
    }

    /* renamed from: no2$d */
    /* compiled from: Animator.kt */
    public static final class d implements Animator.AnimatorListener {
        public final /* synthetic */ no2 a;
        public final /* synthetic */ oo2 b;

        public d(no2 no2, oo2 oo2) {
            this.a = no2;
            this.b = oo2;
        }

        public void onAnimationCancel(Animator animator) {
            ow2.c(animator, C0201.m82(18069));
        }

        public void onAnimationEnd(Animator animator) {
            ow2.c(animator, C0201.m82(18070));
            this.a.i(this.b);
        }

        public void onAnimationRepeat(Animator animator) {
            ow2.c(animator, C0201.m82(18071));
        }

        public void onAnimationStart(Animator animator) {
            ow2.c(animator, C0201.m82(18072));
        }
    }

    /* renamed from: no2$e */
    /* compiled from: TransitionAnimatorCreator.kt */
    public static final class e extends AnimatorListenerAdapter {
        public final /* synthetic */ lo2 a;

        public e(lo2 lo2) {
            this.a = lo2;
        }

        public void onAnimationStart(Animator animator) {
            ow2.c(animator, C0201.m82(18184));
            this.a.f().setAlpha(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: no2$f */
    /* compiled from: TransitionAnimatorCreator.kt */
    public static final class f extends pw2 implements gw2<mo2, hv2> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.gw2
        public /* bridge */ /* synthetic */ hv2 a(mo2 mo2) {
            b(mo2);
            return hv2.a;
        }

        public final void b(mo2 mo2) {
            ow2.c(mo2, C0201.m82(17988));
            mo2.b().setTag(qd2.original_index_in_parent, Integer.valueOf(zj2.h(mo2.b())));
        }
    }

    /* renamed from: no2$g */
    /* compiled from: Comparisons.kt */
    public static final class g<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return bw2.a(ViewGroupManager.getViewZIndex(t.b()), ViewGroupManager.getViewZIndex(t2.b()));
        }
    }

    private final List<AnimatorSet> c(List<jo2> list) {
        ArrayList arrayList = new ArrayList();
        for (jo2 jo2 : list) {
            arrayList.add(jo2.d());
        }
        return arrayList;
    }

    private final AnimatorSet d(lo2 lo2) {
        AnimatorSet e2 = lo2.e();
        e2.addListener(new e(lo2));
        return e2;
    }

    private final List<AnimatorSet> e(List<lo2> list) {
        ArrayList arrayList = new ArrayList();
        for (lo2 lo2 : list) {
            arrayList.add(d(lo2));
        }
        return arrayList;
    }

    private final void f(oo2 oo2) {
        oo2.c(f.a);
    }

    private final void g(mo2 mo2) {
        Point i = zj2.i(mo2.b());
        ViewParent parent = mo2.b().getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            mo2.b().setTag(qd2.original_parent, viewGroup);
            mo2.b().setTag(qd2.original_layout_params, mo2.b().getLayoutParams());
            mo2.b().setTag(qd2.original_top, Integer.valueOf(i.y - mo2.a()));
            mo2.b().setTag(qd2.original_bottom, Integer.valueOf(mo2.b().getBottom()));
            mo2.b().setTag(qd2.original_right, Integer.valueOf(mo2.b().getRight()));
            mo2.b().setTag(qd2.original_left, Integer.valueOf(i.x));
            viewGroup.removeView(mo2.b());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mo2.b().getLayoutParams());
            layoutParams.topMargin = i.y;
            layoutParams.leftMargin = i.x;
            layoutParams.width = mo2.b().getWidth();
            layoutParams.height = mo2.b().getHeight();
            mo2.b().setLayoutParams(layoutParams);
            mo2.c().X().j(mo2.b());
            return;
        }
        throw new fv2(C0201.m82(24310));
    }

    private final void h(oo2 oo2) {
        for (mo2 mo2 : wv2.i(oo2.d(), new g())) {
            g(mo2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void i(oo2 oo2) {
        ArrayList<mo2> arrayList = new ArrayList();
        arrayList.addAll(oo2.f());
        arrayList.addAll(oo2.e());
        if (arrayList.size() > 1) {
            sv2.f(arrayList, new a());
        }
        if (arrayList.size() > 1) {
            sv2.f(arrayList, new b());
        }
        for (mo2 mo2 : arrayList) {
            mo2.c().X().W(mo2.b());
            j(mo2.b());
        }
        Iterator<T> it = oo2.f().iterator();
        while (it.hasNext()) {
            it.next().f().setAlpha(1.0f);
        }
    }

    private final void j(View view) {
        zj2.m(view);
        Object a2 = yj2.a(view, qd2.original_top);
        ow2.b(a2, C0201.m82(24311));
        view.setTop(((Number) a2).intValue());
        Object a3 = yj2.a(view, qd2.original_bottom);
        ow2.b(a3, C0201.m82(24312));
        view.setBottom(((Number) a3).intValue());
        Object a4 = yj2.a(view, qd2.original_right);
        ow2.b(a4, C0201.m82(24313));
        view.setRight(((Number) a4).intValue());
        Object a5 = yj2.a(view, qd2.original_left);
        ow2.b(a5, C0201.m82(24314));
        view.setLeft(((Number) a5).intValue());
        Object a6 = yj2.a(view, qd2.original_parent);
        ow2.b(a6, C0201.m82(24315));
        Object a7 = yj2.a(view, qd2.original_layout_params);
        ow2.b(a7, C0201.m82(24316));
        Object a8 = yj2.a(view, qd2.original_index_in_parent);
        ow2.b(a8, C0201.m82(24317));
        ((ViewGroup) a6).addView(view, ((Number) a8).intValue(), (ViewGroup.LayoutParams) a7);
    }

    private final void k(Collection<? extends Animator> collection, he2 he2) {
        for (Animator animator : collection) {
            if (animator instanceof AnimatorSet) {
                ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
                ow2.b(childAnimations, C0201.m82(24318));
                k(childAnimations, he2);
            } else if (((int) animator.getDuration()) <= 0) {
                animator.setDuration((long) he2.c());
            }
        }
    }

    public final AnimatorSet b(he2 he2, oo2 oo2) {
        ow2.c(he2, C0201.m82(24319));
        ow2.c(oo2, C0201.m82(24320));
        if (oo2.g()) {
            return new AnimatorSet();
        }
        f(oo2);
        h(oo2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(e(oo2.f()));
        arrayList.addAll(c(oo2.e()));
        k(arrayList, he2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new d(this, oo2));
        animatorSet.addListener(new c(this, oo2));
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }
}
