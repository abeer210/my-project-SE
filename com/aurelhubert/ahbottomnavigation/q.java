package com.aurelhubert.ahbottomnavigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: AHBottomNavigation */
public class q extends FrameLayout {
    private static String g0;
    private int A;
    private int B;
    private ArrayList<Integer> C;
    private ArrayList<Integer> D;
    private ArrayList<Integer> E;
    private ArrayList<Integer> F;
    private ArrayList<Integer> G;
    private ArrayList<Integer> H;
    private ArrayList<Integer> I;
    private ArrayList<Integer> J;
    private ArrayList<Float> K;
    private ArrayList<Float> L;
    private int M;
    private int N;
    private float O;
    private float P;
    private boolean Q;
    private boolean R;
    private f S;
    private int T;
    private int U;
    private Drawable V;
    private Typeface W;
    private e a;
    private int a0;
    private d b;
    private int b0;
    private Context c;
    private int c0;
    private Resources d;
    private int d0;
    private ArrayList<r> e = new ArrayList<>();
    private long e0;
    private ArrayList<View> f = new ArrayList<>();
    private int f0;
    private AHBottomNavigationBehavior<q> g;
    private LinearLayout h;
    private View i;
    private Animator j;
    private boolean k = false;
    private boolean l = false;
    private boolean m;
    private List<ig> n = ig.f(5);
    private Boolean[] o;
    private boolean p;
    private int q;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList<Typeface> z;

    /* access modifiers changed from: package-private */
    /* compiled from: AHBottomNavigation */
    public class a implements Animator.AnimatorListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            q qVar = q.this;
            qVar.setBackgroundColor(((r) qVar.e.get(this.a)).a(q.this.c));
            q.this.i.setBackgroundColor(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            q.this.i.setBackgroundColor(((r) q.this.e.get(this.a)).a(q.this.c));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AHBottomNavigation */
    public class b implements Animator.AnimatorListener {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            q qVar = q.this;
            qVar.setBackgroundColor(((r) qVar.e.get(this.a)).a(q.this.c));
            q.this.i.setBackgroundColor(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            q.this.i.setBackgroundColor(((r) q.this.e.get(this.a)).a(q.this.c));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: AHBottomNavigation */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ AHTextView a;

        public c(AHTextView aHTextView) {
            this.a = aHTextView;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a.getAlpha() == 0.0f) {
                this.a.setText(C0201.m82(32750));
            }
        }
    }

    /* compiled from: AHBottomNavigation */
    public interface d {
        void a(int i);
    }

    /* compiled from: AHBottomNavigation */
    public interface e {
        boolean a(int i, boolean z);
    }

    /* compiled from: AHBottomNavigation */
    public enum f {
        SHOW_WHEN_ACTIVE,
        SHOW_WHEN_ACTIVE_FORCE,
        ALWAYS_SHOW,
        ALWAYS_HIDE
    }

    static {
        C0201.m83(q.class, 611);
    }

    public q(Context context) {
        super(context);
        Boolean bool = Boolean.TRUE;
        this.o = new Boolean[]{bool, bool, bool, bool, bool};
        this.p = false;
        this.q = 0;
        this.u = 0;
        this.v = true;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = new ArrayList<>();
        this.A = -1;
        this.B = 0;
        this.C = new ArrayList<>(5);
        this.D = new ArrayList<>(5);
        this.E = new ArrayList<>(5);
        this.F = new ArrayList<>(5);
        this.G = new ArrayList<>(5);
        this.H = new ArrayList<>(5);
        this.I = new ArrayList<>(5);
        this.J = new ArrayList<>(5);
        this.K = new ArrayList<>(5);
        this.L = new ArrayList<>(5);
        this.N = 0;
        this.Q = false;
        this.R = false;
        this.S = f.SHOW_WHEN_ACTIVE;
        s(context, null);
    }

    private void M(int i2, int i3) {
        r rVar = this.e.get(i2);
        String r1 = C0201.m82(17783);
        String r6 = i3 == i2 ? C0201.m82(17784) : r1;
        String e2 = rVar.e(this.c);
        String r3 = C0201.m82(17785);
        if (e2 != null) {
            r6 = r6 + rVar.e(this.c) + r3;
        }
        if (s.d(this.n.get(i2).h())) {
            int parseInt = Integer.parseInt(this.n.get(i2).h());
            StringBuilder sb = new StringBuilder();
            sb.append(r6);
            sb.append(parseInt);
            sb.append(C0201.m82(17786));
            if (parseInt != 1) {
                r1 = C0201.m82(17787);
            }
            sb.append(r1);
            sb.append(r3);
            r6 = sb.toString();
        }
        this.f.get(i2).setContentDescription(r6 + C0201.m82(17788) + (i2 + 1) + C0201.m82(17789) + getItemsCount());
    }

    private void U(ig igVar, AHTextView aHTextView) {
        aHTextView.setText(igVar.h());
        W(igVar, aHTextView);
        if (aHTextView.getAlpha() == 1.0f) {
            return;
        }
        if (igVar.p()) {
            f(aHTextView);
            igVar.o(false);
            return;
        }
        aHTextView.setScaleX(1.0f);
        aHTextView.setScaleY(1.0f);
        aHTextView.setAlpha(1.0f);
    }

    private void V(int i2, boolean z2) {
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            M(i3, i2);
        }
        if (this.q == i2) {
            e eVar = this.a;
            if (eVar != null && z2) {
                eVar.a(i2, true);
                return;
            }
            return;
        }
        e eVar2 = this.a;
        if (eVar2 == null || !z2 || eVar2.a(i2, false)) {
            int dimension = (int) this.d.getDimension(u.bottom_navigation_margin_top_active);
            int dimension2 = (int) this.d.getDimension(u.bottom_navigation_margin_top_inactive);
            int i4 = 0;
            while (i4 < this.f.size()) {
                View view = this.f.get(i4);
                if (this.l) {
                    view.setSelected(i4 == i2);
                }
                if (i4 == i2) {
                    AHTextView aHTextView = (AHTextView) view.findViewById(w.bottom_navigation_item_title);
                    ImageView imageView = (ImageView) view.findViewById(w.bottom_navigation_item_icon);
                    imageView.setSelected(true);
                    s.s(imageView, dimension2, dimension);
                    s.p((AHTextView) view.findViewById(w.bottom_navigation_notification), this.b0, this.a0);
                    s.q(aHTextView, this.F.get(i4), this.E.get(i4));
                    s.r(aHTextView, m(i4), l(i4));
                    s.o(this.e.get(i2).b(this.c), imageView, this.D.get(i4), this.C.get(i4), this.Q);
                    if (Build.VERSION.SDK_INT >= 21 && this.k) {
                        int max = Math.max(getWidth(), getHeight());
                        int x2 = ((int) view.getX()) + (view.getWidth() / 2);
                        int height = view.getHeight() / 2;
                        Animator animator = this.j;
                        if (animator != null && animator.isRunning()) {
                            this.j.cancel();
                            setBackgroundColor(this.e.get(i2).a(this.c));
                            this.i.setBackgroundColor(0);
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.i, x2, height, 0.0f, (float) max);
                        this.j = createCircularReveal;
                        createCircularReveal.setStartDelay(5);
                        this.j.addListener(new a(i2));
                        this.j.start();
                    } else if (this.k) {
                        s.t(this, this.u, this.e.get(i2).a(this.c));
                    } else {
                        int i5 = this.B;
                        if (i5 != 0) {
                            setBackgroundResource(i5);
                        } else {
                            setBackgroundColor(this.A);
                        }
                        this.i.setBackgroundColor(0);
                    }
                } else if (i4 == this.q) {
                    AHTextView aHTextView2 = (AHTextView) view.findViewById(w.bottom_navigation_item_title);
                    ImageView imageView2 = (ImageView) view.findViewById(w.bottom_navigation_item_icon);
                    imageView2.setSelected(false);
                    s.s(imageView2, dimension, dimension2);
                    s.p((AHTextView) view.findViewById(w.bottom_navigation_notification), this.a0, this.b0);
                    s.q(aHTextView2, this.E.get(i4), this.F.get(i4));
                    s.r(aHTextView2, l(i4), m(i4));
                    s.o(this.e.get(this.q).b(this.c), imageView2, this.C.get(i4), this.D.get(i4), this.Q);
                }
                i4++;
            }
            this.q = i2;
            if (i2 > 0 && i2 < this.e.size()) {
                this.u = this.e.get(this.q).a(this.c);
            } else if (this.q == -1) {
                int i6 = this.B;
                if (i6 != 0) {
                    setBackgroundResource(i6);
                } else {
                    setBackgroundColor(this.A);
                }
                this.i.setBackgroundColor(0);
            }
        }
    }

    private void W(ig igVar, AHTextView aHTextView) {
        ViewGroup.LayoutParams layoutParams = aHTextView.getLayoutParams();
        layoutParams.width = (igVar.i() < 0 || igVar.k()) ? -2 : igVar.i();
        layoutParams.height = igVar.i() >= 0 ? igVar.i() : getResources().getDimensionPixelSize(u.bottom_navigation_notification_height);
        aHTextView.requestLayout();
    }

    private void X(boolean z2, int i2) {
        int i3 = 0;
        while (i3 < this.f.size() && i3 < this.n.size()) {
            if (i2 == -1 || i2 == i3) {
                ig igVar = this.n.get(i3);
                int b2 = jg.b(igVar, this.T);
                int a2 = jg.a(igVar, this.U);
                AHTextView aHTextView = (AHTextView) this.f.get(i3).findViewById(w.bottom_navigation_notification);
                if (z2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        aHTextView.setElevation(igVar.m() ? 0.0f : (float) this.f0);
                    }
                    aHTextView.setTextColor(b2);
                    Typeface typeface = this.W;
                    if (typeface != null) {
                        aHTextView.setTypeface(typeface);
                    } else {
                        aHTextView.setTypeface(null, 1);
                    }
                    Drawable drawable = this.V;
                    if (drawable != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            aHTextView.setBackground(drawable.getConstantState().newDrawable());
                        } else {
                            aHTextView.setBackgroundDrawable(drawable);
                        }
                    } else if (a2 != 0) {
                        Drawable f2 = androidx.core.content.b.f(this.c, v.notification_background);
                        if (Build.VERSION.SDK_INT >= 16) {
                            aHTextView.setBackground(s.c(f2, Integer.valueOf(a2), this.Q));
                        } else {
                            aHTextView.setBackgroundDrawable(s.c(f2, Integer.valueOf(a2), this.Q));
                        }
                    }
                }
                if (igVar.n()) {
                    r(igVar, aHTextView);
                } else {
                    U(igVar, aHTextView);
                }
            }
            i3++;
        }
    }

    private void Y(int i2, boolean z2) {
        if (this.q == i2) {
            e eVar = this.a;
            if (eVar != null && z2) {
                eVar.a(i2, true);
                return;
            }
            return;
        }
        e eVar2 = this.a;
        if (eVar2 == null || !z2 || eVar2.a(i2, false)) {
            int dimension = (int) this.d.getDimension(u.bottom_navigation_small_margin_top_active);
            int dimension2 = (int) this.d.getDimension(u.bottom_navigation_small_margin_top);
            int i3 = 0;
            while (i3 < this.f.size()) {
                View view = this.f.get(i3);
                if (this.l) {
                    view.setSelected(i3 == i2);
                }
                if (i3 == i2) {
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(w.bottom_navigation_small_container);
                    AHTextView aHTextView = (AHTextView) view.findViewById(w.bottom_navigation_small_item_title);
                    ImageView imageView = (ImageView) view.findViewById(w.bottom_navigation_small_item_icon);
                    AHTextView aHTextView2 = (AHTextView) view.findViewById(w.bottom_navigation_notification);
                    imageView.setSelected(true);
                    if (this.S != f.ALWAYS_HIDE) {
                        s.s(imageView, dimension2, dimension);
                        s.p(aHTextView2, this.b0, this.a0);
                        s.s(aHTextView2, this.d0, this.c0);
                        s.q(aHTextView, this.D.get(i3), this.C.get(i3));
                        s.u(frameLayout, this.P, this.O);
                    }
                    s.n(aHTextView, 0.0f, 1.0f);
                    s.o(this.e.get(i2).b(this.c), imageView, this.D.get(i3), this.C.get(i3), this.Q);
                    if (Build.VERSION.SDK_INT >= 21 && this.k) {
                        int max = Math.max(getWidth(), getHeight());
                        int x2 = ((int) this.f.get(i2).getX()) + (this.f.get(i2).getWidth() / 2);
                        int height = this.f.get(i2).getHeight() / 2;
                        Animator animator = this.j;
                        if (animator != null && animator.isRunning()) {
                            this.j.cancel();
                            setBackgroundColor(this.e.get(i2).a(this.c));
                            this.i.setBackgroundColor(0);
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.i, x2, height, 0.0f, (float) max);
                        this.j = createCircularReveal;
                        createCircularReveal.setStartDelay(5);
                        this.j.addListener(new b(i2));
                        this.j.start();
                    } else if (this.k) {
                        s.t(this, this.u, this.e.get(i2).a(this.c));
                    } else {
                        int i4 = this.B;
                        if (i4 != 0) {
                            setBackgroundResource(i4);
                        } else {
                            setBackgroundColor(this.A);
                        }
                        this.i.setBackgroundColor(0);
                    }
                } else if (i3 == this.q) {
                    View findViewById = view.findViewById(w.bottom_navigation_small_container);
                    AHTextView aHTextView3 = (AHTextView) view.findViewById(w.bottom_navigation_small_item_title);
                    ImageView imageView2 = (ImageView) view.findViewById(w.bottom_navigation_small_item_icon);
                    AHTextView aHTextView4 = (AHTextView) view.findViewById(w.bottom_navigation_notification);
                    imageView2.setSelected(false);
                    if (this.S != f.ALWAYS_HIDE) {
                        s.s(imageView2, dimension, dimension2);
                        s.p(aHTextView4, this.a0, this.b0);
                        s.s(aHTextView4, this.c0, this.d0);
                        s.q(aHTextView3, this.C.get(i3), this.D.get(i3));
                        s.u(findViewById, this.O, this.P);
                    }
                    s.n(aHTextView3, 1.0f, 0.0f);
                    s.o(this.e.get(this.q).b(this.c), imageView2, this.C.get(i3), this.D.get(i3), this.Q);
                }
                i3++;
            }
            this.q = i2;
            if (i2 > 0 && i2 < this.e.size()) {
                this.u = this.e.get(this.q).a(this.c);
            } else if (this.q == -1) {
                int i5 = this.B;
                if (i5 != 0) {
                    setBackgroundResource(i5);
                } else {
                    setBackgroundColor(this.A);
                }
                this.i.setBackgroundColor(0);
            }
        }
    }

    private void e(AHTextView aHTextView) {
        aHTextView.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setListener(new c(aHTextView)).setDuration(this.e0).start();
    }

    private void f(AHTextView aHTextView) {
        aHTextView.setScaleX(0.0f);
        aHTextView.setScaleY(0.0f);
        aHTextView.setAlpha(0.0f);
        aHTextView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(this.e0).start();
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    private int g(int i2) {
        if (!this.m) {
            return i2;
        }
        int identifier = getResources().getIdentifier(C0201.m82(17790), C0201.m82(17791), C0201.m82(17792));
        if (identifier > 0) {
            this.N = this.d.getDimensionPixelSize(identifier);
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842973, 16843760});
        boolean z2 = obtainStyledAttributes.getBoolean(1, true);
        if (o() && z2) {
            i2 += this.N;
        }
        obtainStyledAttributes.recycle();
        return i2;
    }

    private void h(LinearLayout linearLayout) {
        boolean z2;
        LayoutInflater layoutInflater = (LayoutInflater) this.c.getSystemService(C0201.m82(17793));
        float dimension = this.d.getDimension(u.bottom_navigation_height);
        float dimension2 = this.d.getDimension(u.bottom_navigation_min_width);
        float dimension3 = this.d.getDimension(u.bottom_navigation_max_width);
        if (this.S == f.ALWAYS_SHOW && this.e.size() > 3) {
            dimension2 = this.d.getDimension(u.bottom_navigation_small_inactive_min_width);
            dimension3 = this.d.getDimension(u.bottom_navigation_small_inactive_max_width);
        }
        int width = getWidth();
        if (width != 0 && this.e.size() != 0) {
            float size = (float) (width / this.e.size());
            if (size >= dimension2) {
                dimension2 = size > dimension3 ? dimension3 : size;
            }
            int dimension4 = (int) this.d.getDimension(u.bottom_navigation_margin_top_active);
            boolean z3 = false;
            int i2 = 0;
            while (i2 < this.e.size()) {
                boolean z4 = this.q == i2;
                r rVar = this.e.get(i2);
                View inflate = layoutInflater.inflate(x.bottom_navigation_item, this, z3);
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(w.bottom_navigation_container);
                ImageView imageView = (ImageView) inflate.findViewById(w.bottom_navigation_item_icon);
                AHTextView aHTextView = (AHTextView) inflate.findViewById(w.bottom_navigation_item_title);
                AHTextView aHTextView2 = (AHTextView) inflate.findViewById(w.bottom_navigation_notification);
                imageView.setImageDrawable(rVar.b(this.c));
                if (this.S == f.ALWAYS_HIDE) {
                    aHTextView.setVisibility(8);
                    ((FrameLayout.LayoutParams) imageView.getLayoutParams()).gravity = 17;
                    ((ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams()).topMargin = ((this.M - this.d.getDimensionPixelSize(u.bottom_navigation_icon)) / 2) - k(4);
                } else {
                    aHTextView.setText(rVar.e(this.c));
                }
                aHTextView.setTypeface(this.z.get(i2));
                if (this.S == f.ALWAYS_SHOW && this.e.size() > 3) {
                    frameLayout.setPadding(0, frameLayout.getPaddingTop(), 0, frameLayout.getPaddingBottom());
                }
                if (z4) {
                    if (this.l) {
                        z2 = true;
                        inflate.setSelected(true);
                    } else {
                        z2 = true;
                    }
                    imageView.setSelected(z2);
                    if (inflate.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimension4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                        marginLayoutParams2.setMargins(this.a0, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                        inflate.requestLayout();
                    }
                } else {
                    imageView.setSelected(false);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                    marginLayoutParams3.setMargins(this.b0, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                }
                if (!this.k) {
                    int i3 = this.B;
                    if (i3 != 0) {
                        setBackgroundResource(i3);
                    } else {
                        setBackgroundColor(this.A);
                    }
                } else if (z4) {
                    setBackgroundColor(rVar.a(this.c));
                    this.u = rVar.a(this.c);
                }
                aHTextView.setTextSize(0, z4 ? l(i2) : m(i2));
                if (this.o[i2].booleanValue()) {
                    inflate.setOnClickListener(new b(this, i2));
                    imageView.setImageDrawable(s.c(this.e.get(i2).b(this.c), (z4 ? this.C : this.D).get(i2), this.Q));
                    aHTextView.setTextColor((z4 ? this.E : this.F).get(i2));
                    inflate.setSoundEffectsEnabled(this.y);
                } else {
                    imageView.setImageDrawable(s.c(this.e.get(i2).b(this.c), this.G.get(i2), this.Q));
                    aHTextView.setTextColor(this.H.get(i2));
                }
                if (rVar.d() != null) {
                    inflate.setTag(rVar.d());
                }
                linearLayout.addView(inflate, new FrameLayout.LayoutParams((int) dimension2, (int) dimension));
                this.f.add(inflate);
                M(i2, this.q);
                i2++;
                z3 = false;
            }
            X(true, -1);
        }
    }

    private void j(LinearLayout linearLayout) {
        LayoutInflater layoutInflater = (LayoutInflater) this.c.getSystemService(C0201.m82(17794));
        float dimension = this.d.getDimension(u.bottom_navigation_height);
        float dimension2 = this.d.getDimension(u.bottom_navigation_small_inactive_min_width);
        float dimension3 = this.d.getDimension(u.bottom_navigation_small_inactive_max_width);
        int width = getWidth();
        if (width != 0 && this.e.size() != 0) {
            float size = (float) (width / this.e.size());
            if (size >= dimension2) {
                dimension2 = size > dimension3 ? dimension3 : size;
            }
            int dimension4 = (int) this.d.getDimension(u.bottom_navigation_small_margin_top_active);
            float dimension5 = this.d.getDimension(u.bottom_navigation_small_selected_width_difference);
            this.O = (((float) this.e.size()) * dimension5) + dimension2;
            float f2 = dimension2 - dimension5;
            this.P = f2;
            int i2 = 0;
            while (i2 < this.e.size()) {
                boolean z2 = this.q == i2;
                r rVar = this.e.get(i2);
                View inflate = layoutInflater.inflate(x.bottom_navigation_small_item, (ViewGroup) this, false);
                ImageView imageView = (ImageView) inflate.findViewById(w.bottom_navigation_small_item_icon);
                AHTextView aHTextView = (AHTextView) inflate.findViewById(w.bottom_navigation_small_item_title);
                AHTextView aHTextView2 = (AHTextView) inflate.findViewById(w.bottom_navigation_notification);
                imageView.setImageDrawable(rVar.b(this.c));
                if (this.S != f.ALWAYS_HIDE) {
                    aHTextView.setText(rVar.e(this.c));
                }
                float l2 = l(i2);
                if (l2 != 0.0f) {
                    aHTextView.setTextSize(0, l2);
                }
                aHTextView.setTypeface(this.z.get(i2));
                if (z2) {
                    if (this.l) {
                        inflate.setSelected(true);
                    }
                    imageView.setSelected(true);
                    if (this.S != f.ALWAYS_HIDE && (inflate.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimension4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                        marginLayoutParams2.setMargins(this.a0, this.c0, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                        inflate.requestLayout();
                    }
                } else {
                    imageView.setSelected(false);
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) aHTextView2.getLayoutParams();
                    marginLayoutParams3.setMargins(this.b0, this.d0, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                }
                if (!this.k) {
                    int i3 = this.B;
                    if (i3 != 0) {
                        setBackgroundResource(i3);
                    } else {
                        setBackgroundColor(this.A);
                    }
                } else if (i2 == this.q) {
                    setBackgroundColor(rVar.a(this.c));
                    this.u = rVar.a(this.c);
                }
                if (this.o[i2].booleanValue()) {
                    imageView.setImageDrawable(s.c(this.e.get(i2).b(this.c), (this.q == i2 ? this.C : this.D).get(i2), this.Q));
                    aHTextView.setTextColor((this.q == i2 ? this.E : this.F).get(i2));
                    aHTextView.setAlpha(this.q == i2 ? 1.0f : 0.0f);
                    inflate.setOnClickListener(new c(this, i2));
                    inflate.setSoundEffectsEnabled(this.y);
                } else {
                    imageView.setImageDrawable(s.c(this.e.get(i2).b(this.c), this.G.get(i2), this.Q));
                    aHTextView.setTextColor(this.H.get(i2));
                    aHTextView.setAlpha(0.0f);
                }
                int i4 = i2 == this.q ? (int) this.O : (int) f2;
                if (this.S == f.ALWAYS_HIDE) {
                    double d2 = (double) f2;
                    Double.isNaN(d2);
                    i4 = (int) (d2 * 1.16d);
                }
                if (rVar.d() != null) {
                    inflate.setTag(rVar.d());
                }
                linearLayout.addView(inflate, new FrameLayout.LayoutParams(i4, (int) dimension));
                this.f.add(inflate);
                M(i2, this.q);
                i2++;
            }
            X(true, -1);
        }
    }

    private int k(int i2) {
        return i2 * (getResources().getDisplayMetrics().densityDpi / 160);
    }

    private float l(int i2) {
        if (this.K.get(i2) != null) {
            return this.K.get(i2).floatValue();
        }
        if (this.S != f.ALWAYS_SHOW || this.e.size() <= 3) {
            return this.d.getDimension(u.bottom_navigation_text_size_active);
        }
        return this.d.getDimension(u.bottom_navigation_text_size_forced_active);
    }

    private float m(int i2) {
        if (this.L.get(i2) != null) {
            return this.L.get(i2).floatValue();
        }
        if (this.S != f.ALWAYS_SHOW || this.e.size() <= 3) {
            return this.d.getDimension(u.bottom_navigation_text_size_inactive);
        }
        return this.d.getDimension(u.bottom_navigation_text_size_forced_inactive);
    }

    private void r(ig igVar, AHTextView aHTextView) {
        if (aHTextView.getAlpha() == 0.0f) {
            return;
        }
        if (igVar.p()) {
            e(aHTextView);
            igVar.o(false);
            return;
        }
        aHTextView.setScaleX(0.0f);
        aHTextView.setScaleY(0.0f);
        aHTextView.setAlpha(0.0f);
    }

    private void s(Context context, AttributeSet attributeSet) {
        this.c = context;
        Resources resources = context.getResources();
        this.d = resources;
        this.f0 = resources.getDimensionPixelSize(u.bottom_navigation_notification_elevation);
        s.b(this.C, 5, null);
        s.b(this.D, 5, null);
        s.b(this.G, 5, null);
        s.b(this.E, 5, null);
        s.b(this.F, 5, null);
        s.b(this.H, 5, null);
        s.b(this.z, 5, null);
        s.b(this.K, 5, null);
        s.b(this.L, 5, null);
        s.b(this.I, 5, Integer.valueOf(androidx.core.content.b.d(context, t.colorBottomNavigationActiveColored)));
        s.b(this.J, 5, Integer.valueOf(androidx.core.content.b.d(context, t.colorBottomNavigationInactiveColored)));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.AHBottomNavigationBehavior_Params, 0, 0);
            try {
                this.l = obtainStyledAttributes.getBoolean(y.AHBottomNavigationBehavior_Params_selectedBackgroundVisible, false);
                this.m = obtainStyledAttributes.getBoolean(y.AHBottomNavigationBehavior_Params_translucentNavigationEnabled, false);
                s.m(this.E, new f(obtainStyledAttributes, context));
                s.m(this.F, new d(obtainStyledAttributes, context));
                s.m(this.G, new a(obtainStyledAttributes, context));
                s.m(this.I, new g(obtainStyledAttributes, context));
                s.m(this.J, new e(obtainStyledAttributes, context));
                this.k = obtainStyledAttributes.getBoolean(y.AHBottomNavigationBehavior_Params_colored, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.T = androidx.core.content.b.d(context, 17170443);
        this.M = (int) this.d.getDimension(u.bottom_navigation_height);
        this.a0 = (int) this.d.getDimension(u.bottom_navigation_notification_margin_left_active);
        this.b0 = (int) this.d.getDimension(u.bottom_navigation_notification_margin_left);
        this.c0 = (int) this.d.getDimension(u.bottom_navigation_notification_margin_top_active);
        this.d0 = (int) this.d.getDimension(u.bottom_navigation_notification_margin_top);
        this.e0 = 150;
        k3.o0(this, this.d.getDimension(u.bottom_navigation_elevation));
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.M));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(q qVar, int i2, View view) {
        w30.g(view);
        try {
            qVar.y(i2, view);
        } finally {
            w30.h();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void u(q qVar, int i2, View view) {
        w30.g(view);
        try {
            qVar.z(i2, view);
        } finally {
            w30.h();
        }
    }

    private boolean v() {
        if (this.R && this.e.size() == 3) {
            return true;
        }
        f fVar = this.S;
        if (fVar == f.ALWAYS_HIDE || fVar == f.SHOW_WHEN_ACTIVE_FORCE || (this.e.size() != 3 && this.S != f.ALWAYS_SHOW)) {
            return false;
        }
        return true;
    }

    private /* synthetic */ void y(int i2, View view) {
        V(i2, true);
    }

    private /* synthetic */ void z(int i2, View view) {
        Y(i2, true);
    }

    public void F() {
        i();
    }

    public void G() {
        H(true);
    }

    public void H(boolean z2) {
        AHBottomNavigationBehavior<q> aHBottomNavigationBehavior = this.g;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.S(this, z2);
            return;
        }
        p3 c2 = k3.c(this);
        c2.k(0.0f);
        c2.e(new n4());
        c2.d(z2 ? 300 : 0);
        c2.j();
    }

    public void I(int i2, boolean z2) {
        if (i2 >= this.e.size()) {
            String str = g0;
            Log.w(str, C0201.m82(17795) + this.e.size() + C0201.m82(17796));
        } else if (v()) {
            V(i2, z2);
        } else {
            Y(i2, z2);
        }
    }

    public void J(int i2, Integer num) {
        if (!s.a(this.C.get(i2), num)) {
            this.C.set(i2, num);
            i();
        }
    }

    public void K(int i2, Integer num) {
        if (!s.a(this.D.get(i2), num)) {
            this.D.set(i2, num);
            i();
        }
    }

    public void L(ig igVar, int i2) {
        if (i2 < 0 || i2 > this.e.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, C0201.m82(17797), Integer.valueOf(i2), Integer.valueOf(this.e.size())));
        }
        if (igVar == null) {
            igVar = new ig();
        }
        this.n.set(i2, igVar);
        X(true, i2);
    }

    public void N(int i2, String str) {
        if (i2 >= 0 && i2 < this.f.size()) {
            this.f.get(i2).setTag(str);
        }
    }

    public void O(int i2, Integer num) {
        if (!s.a(this.E.get(i2), num)) {
            this.E.set(i2, num);
            i();
        }
    }

    public void P(int i2, Float f2) {
        if (!s.a(this.K.get(i2), f2)) {
            this.K.set(i2, Float.valueOf(TypedValue.applyDimension(2, f2.floatValue(), this.d.getDisplayMetrics())));
            i();
        }
    }

    public void Q(int i2, Integer num) {
        if (!s.a(this.F.get(i2), num)) {
            this.F.set(i2, num);
            i();
        }
    }

    public void R(int i2, Float f2) {
        if (!s.a(this.L.get(i2), f2)) {
            this.L.set(i2, Float.valueOf(TypedValue.applyDimension(2, f2.floatValue(), this.d.getDisplayMetrics())));
            i();
        }
    }

    public void S(int i2, Typeface typeface) {
        if (this.z.get(i2) != typeface) {
            this.z.set(i2, typeface);
            i();
        }
    }

    public void T(boolean z2, float f2) {
        if (!z2) {
            f2 = 0.0f;
        }
        k3.o0(this, f2);
        setClipToPadding(false);
    }

    public void d(List<r> list) {
        if (list.size() > 5 || this.e.size() + list.size() > 5) {
            Log.w(g0, C0201.m82(17798));
        }
        this.e.addAll(list);
        i();
    }

    public int getCurrentItem() {
        return this.q;
    }

    public int getDefaultBackgroundColor() {
        return this.A;
    }

    public int getItemsCount() {
        return this.e.size();
    }

    public f getTitleState() {
        return this.S;
    }

    public void i() {
        if (this.e.size() < 3) {
            Log.w(g0, C0201.m82(17799));
        } else if (this.e.size() > 5) {
            Log.w(g0, C0201.m82(17800));
        }
        int dimension = (int) this.d.getDimension(u.bottom_navigation_height);
        removeAllViews();
        this.f.clear();
        this.i = new View(this.c);
        if (Build.VERSION.SDK_INT >= 21) {
            addView(this.i, new FrameLayout.LayoutParams(-1, g(dimension)));
            this.M = dimension;
        }
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        this.h.setGravity(17);
        addView(this.h, new FrameLayout.LayoutParams(-1, dimension));
        if (v()) {
            h(this.h);
        } else {
            j(this.h);
        }
        post(new p(this));
    }

    public r n(int i2) {
        if (i2 >= 0 && i2 <= this.e.size() - 1) {
            return this.e.get(i2);
        }
        String str = g0;
        Log.w(str, C0201.m82(17801) + this.e.size() + C0201.m82(17802));
        return null;
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    public boolean o() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService(C0201.m82(17803))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i3 > displayMetrics2.widthPixels || i2 > displayMetrics2.heightPixels;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.p) {
            setBehaviorTranslationEnabled(this.v);
            this.p = true;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.q = bundle.getInt(C0201.m82(17804));
            this.n = bundle.getParcelableArrayList(C0201.m82(17805));
            parcelable = bundle.getParcelable(C0201.m82(17806));
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(17807), super.onSaveInstanceState());
        bundle.putInt(C0201.m82(17808), this.q);
        bundle.putParcelableArrayList(C0201.m82(17809), new ArrayList<>(this.n));
        return bundle;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        i();
    }

    public void p() {
        q(true);
    }

    public void q(boolean z2) {
        AHBottomNavigationBehavior<q> aHBottomNavigationBehavior = this.g;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.R(this, this.M, z2);
        } else if (getParent() instanceof CoordinatorLayout) {
            this.w = true;
            this.x = z2;
        } else {
            p3 c2 = k3.c(this);
            c2.k((float) this.M);
            c2.e(new n4());
            c2.d(z2 ? 300 : 0);
            c2.j();
        }
    }

    public void setBehaviorTranslationEnabled(boolean z2) {
        this.v = z2;
        if (getParent() instanceof CoordinatorLayout) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AHBottomNavigationBehavior<q> aHBottomNavigationBehavior = this.g;
            if (aHBottomNavigationBehavior == null) {
                this.g = new AHBottomNavigationBehavior<>(z2, this.N);
            } else {
                aHBottomNavigationBehavior.T(z2, this.N);
            }
            d dVar = this.b;
            if (dVar != null) {
                this.g.U(dVar);
            }
            ((CoordinatorLayout.f) layoutParams).o(this.g);
            if (this.w) {
                this.w = false;
                this.g.R(this, this.M, this.x);
            }
        }
    }

    public void setColored(boolean z2) {
        this.k = z2;
        this.C = z2 ? this.I : this.E;
        this.D = z2 ? this.J : this.F;
        i();
    }

    public void setCurrentItem(int i2) {
        I(i2, true);
    }

    public void setDefaultBackgroundColor(int i2) {
        this.A = i2;
        i();
    }

    public void setDefaultBackgroundResource(int i2) {
        this.B = i2;
        i();
    }

    public void setForceTint(boolean z2) {
        this.Q = z2;
        i();
    }

    public void setNotificationAnimationDuration(long j2) {
        this.e0 = j2;
        X(true, -1);
    }

    public void setNotificationBackground(Drawable drawable) {
        this.V = drawable;
        X(true, -1);
    }

    public void setNotificationBackgroundColor(int i2) {
        if (this.U != i2) {
            this.U = i2;
            X(true, -1);
        }
    }

    public void setNotificationBackgroundColorResource(int i2) {
        this.U = androidx.core.content.b.d(this.c, i2);
        X(true, -1);
    }

    public void setNotificationTextColor(int i2) {
        if (this.T != i2) {
            this.T = i2;
            X(true, -1);
        }
    }

    public void setNotificationTextColorResource(int i2) {
        this.T = androidx.core.content.b.d(this.c, i2);
        X(true, -1);
    }

    public void setNotificationTypeface(Typeface typeface) {
        this.W = typeface;
        X(true, -1);
    }

    public void setOnNavigationPositionListener(d dVar) {
        this.b = dVar;
        AHBottomNavigationBehavior<q> aHBottomNavigationBehavior = this.g;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.U(dVar);
        }
    }

    public void setOnTabSelectedListener(e eVar) {
        this.a = eVar;
    }

    public void setPreferLargeIcons(boolean z2) {
        this.R = z2;
    }

    public void setSelectedBackgroundVisible(boolean z2) {
        this.l = z2;
        i();
    }

    public void setSoundEffectsEnabled(boolean z2) {
        super.setSoundEffectsEnabled(z2);
        this.y = z2;
    }

    public void setTitleState(f fVar) {
        this.S = fVar;
        i();
    }

    public void setTranslucentNavigationEnabled(boolean z2) {
        this.m = z2;
    }

    public void setUseElevation(boolean z2) {
        k3.o0(this, z2 ? this.d.getDimension(u.bottom_navigation_elevation) : 0.0f);
        setClipToPadding(false);
    }
}
