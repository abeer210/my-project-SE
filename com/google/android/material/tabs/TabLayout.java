package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.z0;
import androidx.core.util.Pools$SimplePool;
import androidx.viewpager.widget.ViewPager;
import defpackage.w3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import vigqyno.C0188;
import vigqyno.C0201;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    private static final androidx.core.util.e<i> R = new androidx.core.util.f(16);
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    private final ArrayList<f> G;
    private f H;
    private final HashMap<e<? extends i>, f> I;
    private ValueAnimator J;
    public ViewPager K;
    private androidx.viewpager.widget.a L;
    private DataSetObserver M;
    private j N;
    private d O;
    private boolean P;
    private final androidx.core.util.e<k> Q;
    private final ArrayList<i> a;
    private i b;
    private final RectF c;
    public final h d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public PorterDuff.Mode n;
    public float o;
    public float p;
    public final int q;
    public int u;
    private final int v;
    private final int w;
    private final int x;
    private int y;
    public int z;

    class a extends r2 {
        public a() {
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            w3Var.b0(w3.b.a(1, TabLayout.this.getTabCount(), false, 1));
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements f {
        public final /* synthetic */ e a;

        public b(e eVar) {
            this.a = eVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.f
        public void a(i iVar) {
            this.a.a(iVar);
        }

        @Override // com.google.android.material.tabs.TabLayout.f
        public void b(i iVar) {
            this.a.b(iVar);
        }

        @Override // com.google.android.material.tabs.TabLayout.f
        public void c(i iVar) {
            this.a.c(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* access modifiers changed from: private */
    public class d implements ViewPager.i {
        private boolean a;

        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.K == viewPager) {
                tabLayout.E(aVar2, this.a);
            }
        }

        public void b(boolean z) {
            this.a = z;
        }
    }

    @Deprecated
    public interface e<T extends i> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface f {
        void a(i iVar);

        void b(i iVar);

        void c(i iVar);
    }

    /* access modifiers changed from: private */
    public class g extends DataSetObserver {
        public g() {
        }

        public void onChanged() {
            TabLayout.this.x();
        }

        public void onInvalidated() {
            TabLayout.this.x();
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends LinearLayout {
        private int a;
        private final Paint b;
        private final GradientDrawable c;
        public int d = -1;
        public float e;
        private int f = -1;
        public int g = -1;
        public int h = -1;
        public ValueAnimator i;
        private int j = -1;
        private int k = -1;

        /* access modifiers changed from: package-private */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                h hVar = h.this;
                hVar.f(yv1.b(hVar.j, this.a, animatedFraction), yv1.b(h.this.k, this.b, animatedFraction));
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            public void onAnimationEnd(Animator animator) {
                h hVar = h.this;
                hVar.d = this.a;
                hVar.e = 0.0f;
            }

            public void onAnimationStart(Animator animator) {
                h.this.d = this.a;
            }
        }

        public h(Context context) {
            super(context);
            setWillNotDraw(false);
            this.b = new Paint();
            this.c = new GradientDrawable();
        }

        private void d(k kVar, RectF rectF) {
            int contentWidth = kVar.getContentWidth();
            int a2 = (int) com.google.android.material.internal.h.a(getContext(), 24);
            if (contentWidth < a2) {
                contentWidth = a2;
            }
            int left = (kVar.getLeft() + kVar.getRight()) / 2;
            int i2 = contentWidth / 2;
            rectF.set((float) (left - i2), 0.0f, (float) (left + i2), 0.0f);
        }

        private void j() {
            int i2;
            int i3;
            View childAt = getChildAt(this.d);
            if (childAt == null || childAt.getWidth() <= 0) {
                i3 = -1;
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.E && (childAt instanceof k)) {
                    d((k) childAt, tabLayout.c);
                    i3 = (int) TabLayout.this.c.left;
                    i2 = (int) TabLayout.this.c.right;
                }
                if (this.e > 0.0f && this.d < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.d + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.E && (childAt2 instanceof k)) {
                        d((k) childAt2, tabLayout2.c);
                        left = (int) TabLayout.this.c.left;
                        right = (int) TabLayout.this.c.right;
                    }
                    float f2 = this.e;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            f(i3, i2);
        }

        private void k(boolean z, int i2, int i3) {
            View childAt = getChildAt(i2);
            if (childAt == null) {
                j();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.E && (childAt instanceof k)) {
                d((k) childAt, tabLayout.c);
                left = (int) TabLayout.this.c.left;
                right = (int) TabLayout.this.c.right;
            }
            int i4 = this.g;
            int i5 = this.h;
            if (i4 != left || i5 != right) {
                if (z) {
                    this.j = i4;
                    this.k = i5;
                }
                a aVar = new a(left, right);
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.i = valueAnimator;
                    valueAnimator.setInterpolator(yv1.b);
                    valueAnimator.setDuration((long) i3);
                    valueAnimator.setFloatValues(0.0f, 1.0f);
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.addListener(new b(i2));
                    valueAnimator.start();
                    return;
                }
                this.i.removeAllUpdateListeners();
                this.i.addUpdateListener(aVar);
            }
        }

        public void c(int i2, int i3) {
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.i.cancel();
            }
            k(true, i2, i3);
        }

        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.m;
            int i2 = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i3 = this.a;
            if (i3 >= 0) {
                intrinsicHeight = i3;
            }
            int i4 = TabLayout.this.B;
            if (i4 == 0) {
                i2 = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i4 == 1) {
                i2 = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    intrinsicHeight = 0;
                } else {
                    intrinsicHeight = getHeight();
                }
            }
            int i5 = this.g;
            if (i5 >= 0 && this.h > i5) {
                Drawable drawable2 = TabLayout.this.m;
                if (drawable2 == null) {
                    drawable2 = this.c;
                }
                Drawable r = androidx.core.graphics.drawable.a.r(drawable2);
                r.setBounds(this.g, i2, this.h, intrinsicHeight);
                Paint paint = this.b;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        r.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.n(r, paint.getColor());
                    }
                }
                r.draw(canvas);
            }
            super.draw(canvas);
        }

        public boolean e() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void f(int i2, int i3) {
            if (i2 != this.g || i3 != this.h) {
                this.g = i2;
                this.h = i3;
                k3.Z(this);
            }
        }

        public void g(int i2, float f2) {
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.i.cancel();
            }
            this.d = i2;
            this.e = f2;
            j();
        }

        public void h(int i2) {
            if (this.b.getColor() != i2) {
                this.b.setColor(i2);
                k3.Z(this);
            }
        }

        public void i(int i2) {
            if (this.a != i2) {
                this.a = i2;
                k3.Z(this);
            }
        }

        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                j();
            } else {
                k(false, this.d, -1);
            }
        }

        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.z == 1 || tabLayout.C == 2) {
                    int childCount = getChildCount();
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.h.a(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i6 = 0; i6 < childCount; i6++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.z = 0;
                            tabLayout2.M(false);
                        }
                        if (z) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.f != i2) {
                requestLayout();
                this.f = i2;
            }
        }
    }

    public static class i {
        private Drawable a;
        private CharSequence b;
        private CharSequence c;
        private int d = -1;
        private View e;
        private int f = 1;
        public TabLayout g;
        public k h;

        public View d() {
            return this.e;
        }

        public Drawable e() {
            return this.a;
        }

        public int f() {
            return this.d;
        }

        public int g() {
            return this.f;
        }

        public CharSequence h() {
            return this.b;
        }

        public boolean i() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.d;
            }
            throw new IllegalArgumentException(C0201.m82(15394));
        }

        public void j() {
            this.g = null;
            this.h = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = -1;
            this.e = null;
        }

        public void k() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                tabLayout.C(this);
                return;
            }
            throw new IllegalArgumentException(C0201.m82(15395));
        }

        public i l(CharSequence charSequence) {
            this.c = charSequence;
            r();
            return this;
        }

        public i m(int i) {
            n(LayoutInflater.from(this.h.getContext()).inflate(i, (ViewGroup) this.h, false));
            return this;
        }

        public i n(View view) {
            this.e = view;
            r();
            return this;
        }

        public i o(Drawable drawable) {
            this.a = drawable;
            TabLayout tabLayout = this.g;
            if (tabLayout.z == 1 || tabLayout.C == 2) {
                this.g.M(true);
            }
            r();
            if (kw1.a && this.h.m() && this.h.e.isVisible()) {
                this.h.invalidate();
            }
            return this;
        }

        public void p(int i) {
            this.d = i;
        }

        public i q(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                this.h.setContentDescription(charSequence);
            }
            this.b = charSequence;
            r();
            return this;
        }

        public void r() {
            k kVar = this.h;
            if (kVar != null) {
                kVar.u();
            }
        }
    }

    public static class j implements ViewPager.j {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public j(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.c != 2 || this.b == 1;
                if (!(this.c == 2 && this.b == 0)) {
                    z = true;
                }
                tabLayout.G(i, f, z2, z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            this.b = this.c;
            this.c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            boolean z;
            w30.t(i);
            try {
                TabLayout tabLayout = this.a.get();
                if (!(tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount())) {
                    if (this.c != 0) {
                        if (this.c != 2 || this.b != 0) {
                            z = false;
                            tabLayout.D(tabLayout.v(i), z);
                        }
                    }
                    z = true;
                    tabLayout.D(tabLayout.v(i), z);
                }
            } finally {
                w30.u();
            }
        }

        public void d() {
            this.c = 0;
            this.b = 0;
        }
    }

    public final class k extends LinearLayout {
        private i a;
        private TextView b;
        private ImageView c;
        private View d;
        private jw1 e;
        private View f;
        private TextView g;
        private ImageView h;
        private Drawable i;
        private int j = 2;

        class a extends r2 {
            public final /* synthetic */ TabLayout d;

            public a(TabLayout tabLayout) {
                this.d = tabLayout;
            }

            @Override // defpackage.r2
            public void f(View view, AccessibilityEvent accessibilityEvent) {
                super.f(view, accessibilityEvent);
                accessibilityEvent.setClassName(C0201.m82(19698));
            }

            @Override // defpackage.r2
            public void g(View view, w3 w3Var) {
                super.g(view, w3Var);
                w3Var.Z(C0201.m82(19699));
                if (k.this.e != null && k.this.e.isVisible()) {
                    CharSequence contentDescription = k.this.getContentDescription();
                    w3Var.d0(((Object) contentDescription) + C0201.m82(19700) + ((Object) k.this.e.g()));
                }
                w3Var.c0(w3.c.b(0, 1, ((k) view).a.f(), 1, false, k.this.isSelected()));
                if (k.this.isSelected()) {
                    w3Var.a0(false);
                    w3Var.R(w3.a.g);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements View.OnLayoutChangeListener {
            public final /* synthetic */ View a;

            public b(View view) {
                this.a = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.a.getVisibility() == 0) {
                    k.this.t(this.a);
                }
            }
        }

        public k(Context context) {
            super(context);
            v(context);
            k3.u0(this, TabLayout.this.e, TabLayout.this.f, TabLayout.this.g, TabLayout.this.h);
            setGravity(17);
            setOrientation(!TabLayout.this.D ? 1 : 0);
            setClickable(true);
            k3.v0(this, i3.b(getContext(), 1002));
            k3.h0(this, new a(TabLayout.this));
        }

        private jw1 getBadge() {
            return this.e;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.f};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        private jw1 getOrCreateBadge() {
            if (this.e == null) {
                this.e = jw1.c(getContext());
            }
            s();
            jw1 jw1 = this.e;
            if (jw1 != null) {
                return jw1;
            }
            throw new IllegalStateException(C0201.m82(15478));
        }

        private void h(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new b(view));
            }
        }

        private float i(Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }

        private FrameLayout j() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void k(Canvas canvas) {
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.i.draw(canvas);
            }
        }

        private FrameLayout l(View view) {
            if ((view == this.c || view == this.b) && kw1.a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean m() {
            return this.e != null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.material.tabs.TabLayout$k */
        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayout;
            if (kw1.a) {
                frameLayout = j();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(tv1.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.c = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.material.tabs.TabLayout$k */
        /* JADX WARN: Multi-variable type inference failed */
        private void o() {
            FrameLayout frameLayout;
            if (kw1.a) {
                frameLayout = j();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(tv1.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.b = textView;
            frameLayout.addView(textView);
        }

        private void q(View view) {
            if (m() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                kw1.a(this.e, view, l(view));
                this.d = view;
            }
        }

        private void r() {
            if (m() && this.d != null) {
                setClipChildren(true);
                setClipToPadding(true);
                jw1 jw1 = this.e;
                View view = this.d;
                kw1.b(jw1, view, l(view));
                this.d = null;
            }
        }

        private void s() {
            i iVar;
            i iVar2;
            if (m()) {
                if (this.f != null) {
                    r();
                } else if (this.c != null && (iVar2 = this.a) != null && iVar2.e() != null) {
                    View view = this.d;
                    ImageView imageView = this.c;
                    if (view != imageView) {
                        r();
                        q(this.c);
                        return;
                    }
                    t(imageView);
                } else if (this.b == null || (iVar = this.a) == null || iVar.g() != 1) {
                    r();
                } else {
                    View view2 = this.d;
                    TextView textView = this.b;
                    if (view2 != textView) {
                        r();
                        q(this.b);
                        return;
                    }
                    t(textView);
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void t(View view) {
            if (m() && view == this.d) {
                kw1.c(this.e, view, l(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Unknown variable types count: 2 */
        private void v(Context context) {
            int i2 = TabLayout.this.q;
            GradientDrawable gradientDrawable = null;
            if (i2 != 0) {
                Drawable d2 = n.d(context, i2);
                this.i = d2;
                if (d2 != null && d2.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            } else {
                this.i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.l != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a2 = ix1.a(TabLayout.this.l);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.F) {
                        gradientDrawable2 = null;
                    }
                    if (!TabLayout.this.F) {
                        gradientDrawable = gradientDrawable3;
                    }
                    gradientDrawable2 = new RippleDrawable(a2, gradientDrawable2, gradientDrawable);
                } else {
                    Drawable r = androidx.core.graphics.drawable.a.r(gradientDrawable3);
                    androidx.core.graphics.drawable.a.o(r, a2);
                    gradientDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable2, r});
                }
            }
            k3.k0(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        private void x(TextView textView, ImageView imageView) {
            i iVar = this.a;
            CharSequence charSequence = null;
            Drawable mutate = (iVar == null || iVar.e() == null) ? null : androidx.core.graphics.drawable.a.r(this.a.e()).mutate();
            i iVar2 = this.a;
            CharSequence h2 = iVar2 != null ? iVar2.h() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(h2);
            if (textView != null) {
                if (z) {
                    textView.setText(h2);
                    if (this.a.f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int a2 = (!z || imageView.getVisibility() != 0) ? 0 : (int) com.google.android.material.internal.h.a(getContext(), 8);
                if (TabLayout.this.D) {
                    if (a2 != x2.a(marginLayoutParams)) {
                        x2.c(marginLayoutParams, a2);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (a2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a2;
                    x2.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.a;
            CharSequence charSequence2 = iVar3 != null ? iVar3.c : null;
            if (!z) {
                charSequence = charSequence2;
            }
            z0.a(this, charSequence);
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.i;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.i.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public i getTab() {
            return this.a;
        }

        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.u, C0188.f23);
            }
            super.onMeasure(i2, i3);
            if (this.b != null) {
                float f2 = TabLayout.this.o;
                int i4 = this.j;
                ImageView imageView = this.c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.p;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int d2 = androidx.core.widget.j.d(this.b);
                if (f2 != textSize || (d2 >= 0 && i4 != d2)) {
                    if (TabLayout.this.C == 1 && f2 > textSize && lineCount == 1 && ((layout = this.b.getLayout()) == null || i(layout, 0, f2) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.b.setTextSize(0, f2);
                        this.b.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        public void p() {
            setTab(null);
            setSelected(false);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.a.k();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(i iVar) {
            if (iVar != this.a) {
                this.a = iVar;
                u();
            }
        }

        public final void u() {
            i iVar = this.a;
            Drawable drawable = null;
            View d2 = iVar != null ? iVar.d() : null;
            if (d2 != null) {
                ViewParent parent = d2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d2);
                    }
                    addView(d2);
                }
                this.f = d2;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) d2.findViewById(16908308);
                this.g = textView2;
                if (textView2 != null) {
                    this.j = androidx.core.widget.j.d(textView2);
                }
                this.h = (ImageView) d2.findViewById(16908294);
            } else {
                View view = this.f;
                if (view != null) {
                    removeView(view);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    n();
                }
                if (!(iVar == null || iVar.e() == null)) {
                    drawable = androidx.core.graphics.drawable.a.r(iVar.e()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.o(drawable, TabLayout.this.k);
                    PorterDuff.Mode mode = TabLayout.this.n;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.p(drawable, mode);
                    }
                }
                if (this.b == null) {
                    o();
                    this.j = androidx.core.widget.j.d(this.b);
                }
                androidx.core.widget.j.q(this.b, TabLayout.this.i);
                ColorStateList colorStateList = TabLayout.this.j;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                x(this.b, this.c);
                s();
                h(this.c);
                h(this.b);
            } else if (!(this.g == null && this.h == null)) {
                x(this.g, this.h);
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.c)) {
                setContentDescription(iVar.c);
            }
            setSelected(iVar != null && iVar.i());
        }

        public final void w() {
            setOrientation(!TabLayout.this.D ? 1 : 0);
            if (this.g == null && this.h == null) {
                x(this.b, this.c);
            } else {
                x(this.g, this.h);
            }
        }
    }

    public static class l implements f {
        private final ViewPager a;

        public l(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.f
        public void a(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.f
        public void b(i iVar) {
            this.a.setCurrentItem(iVar.f());
        }

        @Override // com.google.android.material.tabs.TabLayout.f
        public void c(i iVar) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private void B(int i2) {
        k kVar = (k) this.d.getChildAt(i2);
        this.d.removeViewAt(i2);
        if (kVar != null) {
            kVar.p();
            this.Q.a(kVar);
        }
        requestLayout();
    }

    private void J(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.K;
        if (viewPager2 != null) {
            j jVar = this.N;
            if (jVar != null) {
                viewPager2.L(jVar);
            }
            d dVar = this.O;
            if (dVar != null) {
                this.K.K(dVar);
            }
        }
        f fVar = this.H;
        if (fVar != null) {
            A(fVar);
            this.H = null;
        }
        if (viewPager != null) {
            this.K = viewPager;
            if (this.N == null) {
                this.N = new j(this);
            }
            this.N.d();
            viewPager.e(this.N);
            l lVar = new l(viewPager);
            this.H = lVar;
            b(lVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                E(adapter, z2);
            }
            if (this.O == null) {
                this.O = new d();
            }
            this.O.b(z2);
            viewPager.d(this.O);
            F(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.K = null;
            E(null, false);
        }
        this.P = z3;
    }

    private void K() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.get(i2).r();
        }
    }

    private void L(LinearLayout.LayoutParams layoutParams) {
        if (this.C == 1 && this.z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void f(a aVar) {
        i w2 = w();
        CharSequence charSequence = aVar.a;
        if (charSequence != null) {
            w2.q(charSequence);
        }
        Drawable drawable = aVar.b;
        if (drawable != null) {
            w2.o(drawable);
        }
        int i2 = aVar.c;
        if (i2 != 0) {
            w2.m(i2);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            w2.l(aVar.getContentDescription());
        }
        c(w2);
    }

    private void g(i iVar) {
        k kVar = iVar.h;
        kVar.setSelected(false);
        kVar.setActivated(false);
        this.d.addView(kVar, iVar.f(), o());
    }

    private int getDefaultHeight() {
        int size = this.a.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                i iVar = this.a.get(i2);
                if (iVar != null && iVar.e() != null && !TextUtils.isEmpty(iVar.h())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.D) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.v;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.C;
        if (i3 == 0 || i3 == 2) {
            return this.x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(View view) {
        if (view instanceof a) {
            f((a) view);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(5356));
    }

    private void i(int i2) {
        if (i2 != -1) {
            if (getWindowToken() == null || !k3.O(this) || this.d.e()) {
                F(i2, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int k2 = k(i2, 0.0f);
            if (scrollX != k2) {
                u();
                this.J.setIntValues(scrollX, k2);
                this.J.start();
            }
            this.d.c(i2, this.A);
        }
    }

    private void j() {
        int i2;
        int i3 = this.C;
        if (i3 == 0 || i3 == 2) {
            i2 = Math.max(0, this.y - this.e);
        } else {
            i2 = 0;
        }
        k3.u0(this.d, i2, 0, 0, 0);
        int i4 = this.C;
        if (i4 == 0) {
            this.d.setGravity(8388611);
        } else if (i4 == 1 || i4 == 2) {
            this.d.setGravity(1);
        }
        M(true);
    }

    private int k(int i2, float f2) {
        int i3 = this.C;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.d.getChildAt(i2);
        int i5 = i2 + 1;
        View childAt2 = i5 < this.d.getChildCount() ? this.d.getChildAt(i5) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i4 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (width + i4)) * 0.5f * f2);
        return k3.w(this) == 0 ? left + i6 : left - i6;
    }

    private void m(i iVar, int i2) {
        iVar.p(i2);
        this.a.add(i2, iVar);
        int size = this.a.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.a.get(i2).p(i2);
            } else {
                return;
            }
        }
    }

    private static ColorStateList n(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private LinearLayout.LayoutParams o() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        L(layoutParams);
        return layoutParams;
    }

    private k q(i iVar) {
        androidx.core.util.e<k> eVar = this.Q;
        k b2 = eVar != null ? eVar.b() : null;
        if (b2 == null) {
            b2 = new k(getContext());
        }
        b2.setTab(iVar);
        b2.setFocusable(true);
        b2.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.c)) {
            b2.setContentDescription(iVar.b);
        } else {
            b2.setContentDescription(iVar.c);
        }
        return b2;
    }

    private void r(i iVar) {
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).a(iVar);
        }
    }

    private void s(i iVar) {
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).b(iVar);
        }
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.d.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.d.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    private void t(i iVar) {
        for (int size = this.G.size() - 1; size >= 0; size--) {
            this.G.get(size).c(iVar);
        }
    }

    private void u() {
        if (this.J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J = valueAnimator;
            valueAnimator.setInterpolator(yv1.b);
            this.J.setDuration((long) this.A);
            this.J.addUpdateListener(new c());
        }
    }

    public void A(f fVar) {
        this.G.remove(fVar);
    }

    public void C(i iVar) {
        D(iVar, true);
    }

    public void D(i iVar, boolean z2) {
        i iVar2 = this.b;
        if (iVar2 != iVar) {
            int f2 = iVar != null ? iVar.f() : -1;
            if (z2) {
                if ((iVar2 == null || iVar2.f() == -1) && f2 != -1) {
                    F(f2, 0.0f, true);
                } else {
                    i(f2);
                }
                if (f2 != -1) {
                    setSelectedTabView(f2);
                }
            }
            this.b = iVar;
            if (iVar2 != null) {
                t(iVar2);
            }
            if (iVar != null) {
                s(iVar);
            }
        } else if (iVar2 != null) {
            r(iVar);
            i(iVar.f());
        }
    }

    public void E(androidx.viewpager.widget.a aVar, boolean z2) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.L;
        if (!(aVar2 == null || (dataSetObserver = this.M) == null)) {
            aVar2.w(dataSetObserver);
        }
        this.L = aVar;
        if (z2 && aVar != null) {
            if (this.M == null) {
                this.M = new g();
            }
            aVar.o(this.M);
        }
        x();
    }

    public void F(int i2, float f2, boolean z2) {
        G(i2, f2, z2, true);
    }

    public void G(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.d.getChildCount()) {
            if (z3) {
                this.d.g(i2, f2);
            }
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.J.cancel();
            }
            scrollTo(k(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    public void H(int i2, int i3) {
        setTabTextColors(n(i2, i3));
    }

    public void I(ViewPager viewPager, boolean z2) {
        J(viewPager, z2, false);
    }

    public void M(boolean z2) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            L((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    public f N(e eVar) {
        if (eVar == null) {
            return null;
        }
        if (this.I.containsKey(eVar)) {
            return this.I.get(eVar);
        }
        b bVar = new b(eVar);
        this.I.put(eVar, bVar);
        return bVar;
    }

    public void addView(View view) {
        h(view);
    }

    public void b(f fVar) {
        if (!this.G.contains(fVar)) {
            this.G.add(fVar);
        }
    }

    public void c(i iVar) {
        e(iVar, this.a.isEmpty());
    }

    public void d(i iVar, int i2, boolean z2) {
        if (iVar.g == this) {
            m(iVar, i2);
            g(iVar);
            if (z2) {
                iVar.k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(5357));
    }

    public void e(i iVar, boolean z2) {
        d(iVar, this.a.size(), z2);
    }

    public int getSelectedTabPosition() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.a.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    public ColorStateList getTabIconTint() {
        return this.k;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.l;
    }

    public Drawable getTabSelectedIndicator() {
        return this.m;
    }

    public ColorStateList getTabTextColors() {
        return this.j;
    }

    public void l() {
        this.G.clear();
        this.I.clear();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sx1.e(this);
        if (this.K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                J((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            setupWithViewPager(null);
            this.P = false;
        }
    }

    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            if (childAt instanceof k) {
                ((k) childAt).k(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r0 != 2) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x007d;
     */
    public void onMeasure(int i2, int i3) {
        int a2 = (int) com.google.android.material.internal.h.a(getContext(), getDefaultHeight());
        int mode = View.MeasureSpec.getMode(i3);
        boolean z2 = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(a2 + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= a2) {
            getChildAt(0).setMinimumHeight(a2);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.w;
            if (i4 <= 0) {
                i4 = (int) (((float) size) - com.google.android.material.internal.h.a(getContext(), 56));
            }
            this.u = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.C;
            if (i5 != 0) {
                if (i5 != 1) {
                }
                if (z2) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
        }
    }

    public i p() {
        i b2 = R.b();
        return b2 == null ? new i() : b2;
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        sx1.d(this, f2);
    }

    public void setInlineLabel(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof k) {
                    ((k) childAt).w();
                }
            }
            j();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(e eVar) {
        l();
        b(N(eVar));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        u();
        this.J.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.m != drawable) {
            this.m = drawable;
            k3.Z(this.d);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.d.h(i2);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.B != i2) {
            this.B = i2;
            k3.Z(this.d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.d.i(i2);
    }

    public void setTabGravity(int i2) {
        if (this.z != i2) {
            this.z = i2;
            j();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            K();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(n.c(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.E = z2;
        k3.Z(this.d);
    }

    public void setTabMode(int i2) {
        if (i2 != this.C) {
            this.C = i2;
            j();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof k) {
                    ((k) childAt).v(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(n.c(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            K();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        E(aVar, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof k) {
                    ((k) childAt).v(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        I(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public i v(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.a.get(i2);
    }

    public i w() {
        i p2 = p();
        p2.g = this;
        p2.h = q(p2);
        return p2;
    }

    public void x() {
        int currentItem;
        z();
        androidx.viewpager.widget.a aVar = this.L;
        if (aVar != null) {
            int h2 = aVar.h();
            for (int i2 = 0; i2 < h2; i2++) {
                i w2 = w();
                w2.q(this.L.j(i2));
                e(w2, false);
            }
            ViewPager viewPager = this.K;
            if (viewPager != null && h2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                C(v(currentItem));
            }
        }
    }

    public boolean y(i iVar) {
        return R.a(iVar);
    }

    public void z() {
        for (int childCount = this.d.getChildCount() - 1; childCount >= 0; childCount--) {
            B(childCount);
        }
        Iterator<i> it = this.a.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.j();
            y(next);
        }
        this.b = null;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        h(view);
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new ArrayList<>();
        this.c = new RectF();
        this.u = C0188.f24;
        this.G = new ArrayList<>();
        this.I = new HashMap<>();
        this.Q = new Pools$SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        h hVar = new h(context);
        this.d = hVar;
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray h2 = com.google.android.material.internal.g.h(context, attributeSet, xv1.TabLayout, i2, wv1.Widget_Design_TabLayout, xv1.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            rx1 rx1 = new rx1();
            rx1.V(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            rx1.L(context);
            rx1.U(k3.r(this));
            k3.k0(this, rx1);
        }
        this.d.i(h2.getDimensionPixelSize(xv1.TabLayout_tabIndicatorHeight, -1));
        this.d.h(h2.getColor(xv1.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(dx1.d(context, h2, xv1.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(h2.getInt(xv1.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(h2.getBoolean(xv1.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = h2.getDimensionPixelSize(xv1.TabLayout_tabPadding, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = h2.getDimensionPixelSize(xv1.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f = h2.getDimensionPixelSize(xv1.TabLayout_tabPaddingTop, this.f);
        this.g = h2.getDimensionPixelSize(xv1.TabLayout_tabPaddingEnd, this.g);
        this.h = h2.getDimensionPixelSize(xv1.TabLayout_tabPaddingBottom, this.h);
        int resourceId = h2.getResourceId(xv1.TabLayout_tabTextAppearance, wv1.TextAppearance_Design_Tab);
        this.i = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, m.TextAppearance);
        try {
            this.o = (float) obtainStyledAttributes.getDimensionPixelSize(m.TextAppearance_android_textSize, 0);
            this.j = dx1.a(context, obtainStyledAttributes, m.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (h2.hasValue(xv1.TabLayout_tabTextColor)) {
                this.j = dx1.a(context, h2, xv1.TabLayout_tabTextColor);
            }
            if (h2.hasValue(xv1.TabLayout_tabSelectedTextColor)) {
                this.j = n(this.j.getDefaultColor(), h2.getColor(xv1.TabLayout_tabSelectedTextColor, 0));
            }
            this.k = dx1.a(context, h2, xv1.TabLayout_tabIconTint);
            this.n = com.google.android.material.internal.h.d(h2.getInt(xv1.TabLayout_tabIconTintMode, -1), null);
            this.l = dx1.a(context, h2, xv1.TabLayout_tabRippleColor);
            this.A = h2.getInt(xv1.TabLayout_tabIndicatorAnimationDuration, C0188.f19);
            this.v = h2.getDimensionPixelSize(xv1.TabLayout_tabMinWidth, -1);
            this.w = h2.getDimensionPixelSize(xv1.TabLayout_tabMaxWidth, -1);
            this.q = h2.getResourceId(xv1.TabLayout_tabBackground, 0);
            this.y = h2.getDimensionPixelSize(xv1.TabLayout_tabContentStart, 0);
            this.C = h2.getInt(xv1.TabLayout_tabMode, 1);
            this.z = h2.getInt(xv1.TabLayout_tabGravity, 0);
            this.D = h2.getBoolean(xv1.TabLayout_tabInlineLabel, false);
            this.F = h2.getBoolean(xv1.TabLayout_tabUnboundedRipple, false);
            h2.recycle();
            Resources resources = getResources();
            this.p = (float) resources.getDimensionPixelSize(pv1.design_tab_text_size_2line);
            this.x = resources.getDimensionPixelSize(pv1.design_tab_scrollable_min_width);
            j();
            k3.h0(this, new a());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(n.d(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
