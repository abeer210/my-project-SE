package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.sw1;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect c;
    private final RectF d;
    private final RectF e;
    private final int[] f;
    private float g;
    private float h;

    class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.setVisibility(4);
                this.c.setAlpha(1.0f);
                this.c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ sw1 a;
        public final /* synthetic */ Drawable b;

        public c(FabTransformationBehavior fabTransformationBehavior, sw1 sw1, Drawable drawable) {
            this.a = sw1;
            this.b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ sw1 a;

        public d(FabTransformationBehavior fabTransformationBehavior, sw1 sw1) {
            this.a = sw1;
        }

        public void onAnimationEnd(Animator animator) {
            sw1.e revealInfo = this.a.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    /* access modifiers changed from: protected */
    public static class e {
        public fw1 a;
        public hw1 b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(rv1.mtrl_child_content_container);
        if (findViewById != null) {
            return f0(findViewById);
        }
        if ((view instanceof b) || (view instanceof a)) {
            return f0(((ViewGroup) view).getChildAt(0));
        }
        return f0(view);
    }

    private void L(View view, e eVar, gw1 gw1, gw1 gw12, float f2, float f3, float f4, float f5, RectF rectF) {
        float S = S(eVar, gw1, f2, f4);
        float S2 = S(eVar, gw12, f3, f5);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.g, this.h);
    }

    private Pair<gw1, gw1> N(float f2, float f3, boolean z, e eVar) {
        gw1 gw1;
        gw1 gw12;
        if (f2 == 0.0f || f3 == 0.0f) {
            gw12 = eVar.a.e(C0201.m82(25183));
            gw1 = eVar.a.e(C0201.m82(25184));
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            gw12 = eVar.a.e(C0201.m82(25181));
            gw1 = eVar.a.e(C0201.m82(25182));
        } else {
            gw12 = eVar.a.e(C0201.m82(25179));
            gw1 = eVar.a.e(C0201.m82(25180));
        }
        return new Pair<>(gw12, gw1);
    }

    private float O(View view, View view2, hw1 hw1) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, hw1), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, hw1 hw1) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, hw1));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, hw1 hw1) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        int i = hw1.a & 7;
        if (i == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i != 5) {
            f2 = 0.0f;
            return f2 + hw1.b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + hw1.b;
    }

    private float R(View view, View view2, hw1 hw1) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        int i = hw1.a & 112;
        if (i == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i != 80) {
            f2 = 0.0f;
            return f2 + hw1.c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + hw1.c;
    }

    private float S(e eVar, gw1 gw1, float f2, float f3) {
        long c2 = gw1.c();
        long d2 = gw1.d();
        gw1 e2 = eVar.a.e(C0201.m82(25185));
        return yv1.a(f2, f3, gw1.e().getInterpolation(((float) (((e2.c() + e2.d()) + 17) - c2)) / ((float) d2)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void U(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof sw1) || rw1.a != 0) && (K = K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        bw1.a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, bw1.a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, bw1.a, 0.0f);
                }
                eVar.a.e(C0201.m82(25186)).a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof sw1) {
            sw1 sw1 = (sw1) view2;
            int d0 = d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    sw1.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(sw1, sw1.d.a, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(sw1, sw1.d.a, d0);
            }
            objectAnimator.setEvaluator(aw1.b());
            eVar.a.e(C0201.m82(25187)).a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    private void W(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.b);
        float R = R(view, view2, eVar.b);
        Pair<gw1, gw1> N = N(Q, R, z, eVar);
        gw1 gw1 = (gw1) N.first;
        gw1 gw12 = (gw1) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        gw1.a(ofFloat);
        gw12.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float r = k3.r(view2) - k3.r(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-r);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -r);
        }
        eVar.a.e(C0201.m82(25188)).a(objectAnimator);
        list.add(objectAnimator);
    }

    private void Y(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof sw1) {
            sw1 sw1 = (sw1) view2;
            float O = O(view, view2, eVar.b);
            float P = P(view, view2, eVar.b);
            ((FloatingActionButton) view).i(this.c);
            float width = ((float) this.c.width()) / 2.0f;
            gw1 e2 = eVar.a.e(C0201.m82(25189));
            if (z) {
                if (!z2) {
                    sw1.setRevealInfo(new sw1.e(O, P, width));
                }
                if (z2) {
                    width = sw1.getRevealInfo().c;
                }
                animator = pw1.a(sw1, O, P, zw1.b(O, P, 0.0f, 0.0f, f2, f3));
                animator.addListener(new d(this, sw1));
                b0(view2, e2.c(), (int) O, (int) P, width, list);
            } else {
                float f4 = sw1.getRevealInfo().c;
                Animator a2 = pw1.a(sw1, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                b0(view2, e2.c(), i, i2, f4, list);
                a0(view2, e2.c(), e2.d(), eVar.a.f(), i, i2, width, list);
                animator = a2;
            }
            e2.a(animator);
            list.add(animator);
            list2.add(pw1.b(sw1));
        }
    }

    private void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof sw1) && (view instanceof ImageView)) {
            sw1 sw1 = (sw1) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, cw1.b, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, cw1.b, 255);
                }
                objectAnimator.addUpdateListener(new b(this, view2));
                eVar.a.e(C0201.m82(25190)).a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(this, sw1, drawable));
            }
        }
    }

    private void a0(View view, long j, long j2, long j3, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    private void b0(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void c0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float Q = Q(view, view2, eVar.b);
        float R = R(view, view2, eVar.b);
        Pair<gw1, gw1> N = N(Q, R, z, eVar);
        gw1 gw1 = (gw1) N.first;
        gw1 gw12 = (gw1) N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, gw1, gw12, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        gw1.a(objectAnimator2);
        gw12.a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    private int d0(View view) {
        ColorStateList n = k3.n(view);
        if (n != null) {
            return n.getColorForState(view.getDrawableState(), n.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet J(View view, View view2, boolean z, boolean z2) {
        e e0 = e0(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.d;
        c0(view, view2, z, z2, e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view, view2, z, e0, arrayList);
        Z(view, view2, z, z2, e0, arrayList, arrayList2);
        Y(view, view2, z, z2, e0, width, height, arrayList, arrayList2);
        V(view, view2, z, z2, e0, arrayList, arrayList2);
        U(view, view2, z, z2, e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        zv1.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException(C0201.m82(25191));
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public abstract e e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
