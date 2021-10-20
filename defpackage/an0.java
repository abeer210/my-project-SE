package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import vigqyno.C0201;

/* renamed from: an0  reason: default package */
/* compiled from: FloatingActionMenu */
public class an0 extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private int D;
    private float E;
    private float F;
    private float G;
    private int H;
    private int I;
    private int J;
    private Drawable K;
    private int L;
    private Interpolator M;
    private Interpolator N;
    private boolean O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private Typeface U;
    private boolean V;
    private ImageView W;
    private AnimatorSet a;
    private Animation a0;
    private AnimatorSet b;
    private Animation b0;
    private AnimatorSet c;
    private Animation c0;
    private int d;
    private Animation d0;
    private zm0 e;
    private boolean e0;
    private int f;
    private boolean f0;
    private int g;
    private int g0;
    private int h;
    private j h0;
    private int i;
    private ValueAnimator i0;
    private boolean j;
    private ValueAnimator j0;
    private boolean k;
    private int k0;
    private Handler l;
    private int l0;
    private int m;
    private Context m0;
    private int n;
    private String n0;
    private int o;
    private boolean o0;
    private int p;
    private int q;
    private int u;
    private ColorStateList v;
    private float w;
    private int x;
    private boolean y;
    private int z;

    /* access modifiers changed from: package-private */
    /* renamed from: an0$a */
    /* compiled from: FloatingActionMenu */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            an0.this.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.a, this.b, this.c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an0$b */
    /* compiled from: FloatingActionMenu */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            an0.this.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.a, this.b, this.c));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an0$c */
    /* compiled from: FloatingActionMenu */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                an0.this.J(an0.this.O);
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an0$d */
    /* compiled from: FloatingActionMenu */
    public class d implements Runnable {
        public final /* synthetic */ zm0 a;
        public final /* synthetic */ boolean b;

        public d(zm0 zm0, boolean z) {
            this.a = zm0;
            this.b = z;
        }

        public void run() {
            if (!an0.this.D()) {
                if (this.a != an0.this.e) {
                    this.a.K(this.b);
                }
                bn0 bn0 = (bn0) this.a.getTag(fn0.fab_label);
                if (bn0 != null && bn0.r()) {
                    bn0.x(this.b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an0$e */
    /* compiled from: FloatingActionMenu */
    public class e implements Runnable {
        public e() {
        }

        public void run() {
            an0.this.j = true;
            if (an0.this.h0 != null) {
                an0.this.h0.a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an0$f */
    /* compiled from: FloatingActionMenu */
    public class f implements Runnable {
        public final /* synthetic */ zm0 a;
        public final /* synthetic */ boolean b;

        public f(zm0 zm0, boolean z) {
            this.a = zm0;
            this.b = z;
        }

        public void run() {
            if (an0.this.D()) {
                if (this.a != an0.this.e) {
                    this.a.w(this.b);
                }
                bn0 bn0 = (bn0) this.a.getTag(fn0.fab_label);
                if (bn0 != null && bn0.r()) {
                    bn0.q(this.b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an0$g */
    /* compiled from: FloatingActionMenu */
    public class g implements Runnable {
        public g() {
        }

        public void run() {
            an0.this.j = false;
            if (an0.this.h0 != null) {
                an0.this.h0.a(false);
            }
        }
    }

    /* renamed from: an0$h */
    /* compiled from: FloatingActionMenu */
    class h implements Runnable {
        public final /* synthetic */ boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public void run() {
            if (this.a) {
                an0 an0 = an0.this;
                an0.startAnimation(an0.b0);
            }
            an0.this.setVisibility(4);
            an0.this.e0 = false;
        }
    }

    /* renamed from: an0$i */
    /* compiled from: FloatingActionMenu */
    class i implements Runnable {
        public final /* synthetic */ boolean a;

        public i(boolean z) {
            this.a = z;
        }

        public void run() {
            an0.this.v(this.a);
        }
    }

    /* renamed from: an0$j */
    /* compiled from: FloatingActionMenu */
    public interface j {
        void a(boolean z);
    }

    public an0(Context context) {
        this(context, null);
    }

    private boolean A() {
        return this.k0 != 0;
    }

    private void I(boolean z2) {
        if (B()) {
            this.e.K(z2);
            if (z2) {
                this.W.startAnimation(this.c0);
            }
            this.W.setVisibility(0);
        }
    }

    private void j(zm0 zm0) {
        String labelText = zm0.getLabelText();
        if (!TextUtils.isEmpty(labelText)) {
            bn0 bn0 = new bn0(this.m0);
            bn0.setClickable(true);
            bn0.setFab(zm0);
            bn0.setShowAnimation(AnimationUtils.loadAnimation(getContext(), this.m));
            bn0.setHideAnimation(AnimationUtils.loadAnimation(getContext(), this.n));
            if (this.T > 0) {
                bn0.setTextAppearance(getContext(), this.T);
                bn0.setShowShadow(false);
                bn0.setUsingStyle(true);
            } else {
                bn0.w(this.z, this.A, this.B);
                bn0.setShowShadow(this.y);
                bn0.setCornerRadius(this.x);
                if (this.Q > 0) {
                    setLabelEllipsize(bn0);
                }
                bn0.setMaxLines(this.R);
                bn0.y();
                bn0.setTextSize(0, this.w);
                bn0.setTextColor(this.v);
                int i2 = this.u;
                int i3 = this.o;
                if (this.y) {
                    i2 += zm0.getShadowRadius() + Math.abs(zm0.getShadowXOffset());
                    i3 += zm0.getShadowRadius() + Math.abs(zm0.getShadowYOffset());
                }
                bn0.setPadding(i2, i3, this.u, this.o);
                if (this.R < 0 || this.P) {
                    bn0.setSingleLine(this.P);
                }
            }
            Typeface typeface = this.U;
            if (typeface != null) {
                bn0.setTypeface(typeface);
            }
            bn0.setText(labelText);
            bn0.setOnClickListener(zm0.getOnClickListener());
            addView(bn0);
            zm0.setTag(fn0.fab_label, bn0);
        }
    }

    private int l(int i2) {
        double d2 = (double) i2;
        Double.isNaN(d2);
        Double.isNaN(d2);
        return (int) ((0.03d * d2) + d2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r8.l0 == 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r8.l0 == 0) goto L_0x0015;
     */
    private void n() {
        float f2;
        float f3 = 135.0f;
        if (this.g0 == 0) {
            f2 = this.l0 == 0 ? -135.0f : 135.0f;
        } else {
            f2 = this.l0 == 0 ? 135.0f : -135.0f;
        }
        f3 = -135.0f;
        String r7 = C0201.m82(30642);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.W, r7, f2, 0.0f);
        this.a.play(ObjectAnimator.ofFloat(this.W, r7, 0.0f, f3));
        this.b.play(ofFloat);
        this.a.setInterpolator(this.M);
        this.b.setInterpolator(this.N);
        this.a.setDuration(300L);
        this.b.setDuration(300L);
    }

    private void o() {
        for (int i2 = 0; i2 < this.i; i2++) {
            if (getChildAt(i2) != this.W) {
                zm0 zm0 = (zm0) getChildAt(i2);
                if (zm0.getTag(fn0.fab_label) == null) {
                    j(zm0);
                    zm0 zm02 = this.e;
                    if (zm0 == zm02) {
                        zm02.setOnClickListener(new c());
                    }
                }
            }
        }
    }

    private void p() {
        zm0 zm0 = new zm0(getContext());
        this.e = zm0;
        boolean z2 = this.C;
        zm0.b = z2;
        if (z2) {
            zm0.d = hn0.a(getContext(), this.E);
            this.e.e = hn0.a(getContext(), this.F);
            this.e.f = hn0.a(getContext(), this.G);
        }
        this.e.G(this.H, this.I, this.J);
        zm0 zm02 = this.e;
        zm02.c = this.D;
        zm02.a = this.S;
        zm02.L();
        this.e.setLabelText(this.n0);
        ImageView imageView = new ImageView(getContext());
        this.W = imageView;
        imageView.setImageDrawable(this.K);
        addView(this.e, super.generateDefaultLayoutParams());
        addView(this.W);
        n();
    }

    private void setLabelEllipsize(bn0 bn0) {
        int i2 = this.Q;
        if (i2 == 1) {
            bn0.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i2 == 2) {
            bn0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i2 == 3) {
            bn0.setEllipsize(TextUtils.TruncateAt.END);
        } else if (i2 == 4) {
            bn0.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void v(boolean z2) {
        if (!B()) {
            this.e.w(z2);
            if (z2) {
                this.W.startAnimation(this.d0);
            }
            this.W.setVisibility(4);
            this.e0 = false;
        }
    }

    private void w(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.FloatingActionMenu, 0, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_buttonSpacing, this.d);
        this.g = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_labels_margin, this.g);
        int i2 = obtainStyledAttributes.getInt(gn0.FloatingActionMenu_menu_labels_position, 0);
        this.l0 = i2;
        this.m = obtainStyledAttributes.getResourceId(gn0.FloatingActionMenu_menu_labels_showAnimation, i2 == 0 ? cn0.fab_slide_in_from_right : cn0.fab_slide_in_from_left);
        this.n = obtainStyledAttributes.getResourceId(gn0.FloatingActionMenu_menu_labels_hideAnimation, this.l0 == 0 ? cn0.fab_slide_out_to_right : cn0.fab_slide_out_to_left);
        this.o = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_labels_paddingTop, this.o);
        this.p = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_labels_paddingRight, this.p);
        this.q = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_labels_paddingBottom, this.q);
        this.u = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_labels_paddingLeft, this.u);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(gn0.FloatingActionMenu_menu_labels_textColor);
        this.v = colorStateList;
        if (colorStateList == null) {
            this.v = ColorStateList.valueOf(-1);
        }
        this.w = obtainStyledAttributes.getDimension(gn0.FloatingActionMenu_menu_labels_textSize, getResources().getDimension(dn0.labels_text_size));
        this.x = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_labels_cornerRadius, this.x);
        this.y = obtainStyledAttributes.getBoolean(gn0.FloatingActionMenu_menu_labels_showShadow, true);
        this.z = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_labels_colorNormal, -13421773);
        this.A = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_labels_colorPressed, -12303292);
        this.B = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_labels_colorRipple, 1728053247);
        this.C = obtainStyledAttributes.getBoolean(gn0.FloatingActionMenu_menu_showShadow, true);
        this.D = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_shadowColor, 1711276032);
        this.E = obtainStyledAttributes.getDimension(gn0.FloatingActionMenu_menu_shadowRadius, this.E);
        this.F = obtainStyledAttributes.getDimension(gn0.FloatingActionMenu_menu_shadowXOffset, this.F);
        this.G = obtainStyledAttributes.getDimension(gn0.FloatingActionMenu_menu_shadowYOffset, this.G);
        this.H = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_colorNormal, -2473162);
        this.I = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_colorPressed, -1617853);
        this.J = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_colorRipple, -1711276033);
        this.L = obtainStyledAttributes.getInt(gn0.FloatingActionMenu_menu_animationDelayPerItem, 50);
        Drawable drawable = obtainStyledAttributes.getDrawable(gn0.FloatingActionMenu_menu_icon);
        this.K = drawable;
        if (drawable == null) {
            this.K = getResources().getDrawable(en0.fab_add);
        }
        this.P = obtainStyledAttributes.getBoolean(gn0.FloatingActionMenu_menu_labels_singleLine, false);
        this.Q = obtainStyledAttributes.getInt(gn0.FloatingActionMenu_menu_labels_ellipsize, 0);
        this.R = obtainStyledAttributes.getInt(gn0.FloatingActionMenu_menu_labels_maxLines, -1);
        this.S = obtainStyledAttributes.getInt(gn0.FloatingActionMenu_menu_fab_size, 0);
        this.T = obtainStyledAttributes.getResourceId(gn0.FloatingActionMenu_menu_labels_style, 0);
        String string = obtainStyledAttributes.getString(gn0.FloatingActionMenu_menu_labels_customFont);
        try {
            if (!TextUtils.isEmpty(string)) {
                this.U = Typeface.createFromAsset(getContext().getAssets(), string);
            }
            this.g0 = obtainStyledAttributes.getInt(gn0.FloatingActionMenu_menu_openDirection, 0);
            this.k0 = obtainStyledAttributes.getColor(gn0.FloatingActionMenu_menu_backgroundColor, 0);
            if (obtainStyledAttributes.hasValue(gn0.FloatingActionMenu_menu_fab_label)) {
                this.o0 = true;
                this.n0 = obtainStyledAttributes.getString(gn0.FloatingActionMenu_menu_fab_label);
            }
            if (obtainStyledAttributes.hasValue(gn0.FloatingActionMenu_menu_labels_padding)) {
                z(obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionMenu_menu_labels_padding, 0));
            }
            this.M = new OvershootInterpolator();
            this.N = new AnticipateInterpolator();
            this.m0 = new ContextThemeWrapper(getContext(), this.T);
            x();
            p();
            y(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        } catch (RuntimeException e2) {
            throw new IllegalArgumentException(C0201.m82(30643) + string, e2);
        }
    }

    private void x() {
        int alpha = Color.alpha(this.k0);
        int red = Color.red(this.k0);
        int green = Color.green(this.k0);
        int blue = Color.blue(this.k0);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, alpha);
        this.i0 = ofInt;
        ofInt.setDuration(300L);
        this.i0.addUpdateListener(new a(red, green, blue));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(alpha, 0);
        this.j0 = ofInt2;
        ofInt2.setDuration(300L);
        this.j0.addUpdateListener(new b(red, green, blue));
    }

    private void y(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(gn0.FloatingActionMenu_menu_fab_show_animation, cn0.fab_scale_up);
        setMenuButtonShowAnimation(AnimationUtils.loadAnimation(getContext(), resourceId));
        this.c0 = AnimationUtils.loadAnimation(getContext(), resourceId);
        int resourceId2 = typedArray.getResourceId(gn0.FloatingActionMenu_menu_fab_hide_animation, cn0.fab_scale_down);
        setMenuButtonHideAnimation(AnimationUtils.loadAnimation(getContext(), resourceId2));
        this.d0 = AnimationUtils.loadAnimation(getContext(), resourceId2);
    }

    private void z(int i2) {
        this.o = i2;
        this.p = i2;
        this.q = i2;
        this.u = i2;
    }

    public boolean B() {
        return this.e.A();
    }

    public boolean C() {
        return getVisibility() == 4;
    }

    public boolean D() {
        return this.j;
    }

    public void E(boolean z2) {
        if (!D()) {
            if (A()) {
                this.i0.start();
            }
            if (this.V) {
                AnimatorSet animatorSet = this.c;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.b.cancel();
                    this.a.start();
                }
            }
            this.k = true;
            int i2 = 0;
            int i3 = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if ((childAt instanceof zm0) && childAt.getVisibility() != 8) {
                    i2++;
                    this.l.postDelayed(new d((zm0) childAt, z2), (long) i3);
                    i3 += this.L;
                }
            }
            this.l.postDelayed(new e(), (long) ((i2 + 1) * this.L));
        }
    }

    public void F(zm0 zm0) {
        removeView(zm0.getLabelView());
        removeView(zm0);
        this.i--;
    }

    public void G(boolean z2) {
        if (C()) {
            if (z2) {
                startAnimation(this.a0);
            }
            setVisibility(0);
        }
    }

    public void H(boolean z2) {
        if (B()) {
            I(z2);
        }
    }

    public void J(boolean z2) {
        if (D()) {
            m(z2);
        } else {
            E(z2);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public int getAnimationDelayPerItem() {
        return this.L;
    }

    public AnimatorSet getIconToggleAnimatorSet() {
        return this.c;
    }

    public int getMenuButtonColorNormal() {
        return this.H;
    }

    public int getMenuButtonColorPressed() {
        return this.I;
    }

    public int getMenuButtonColorRipple() {
        return this.J;
    }

    public String getMenuButtonLabelText() {
        return this.n0;
    }

    public ImageView getMenuIconView() {
        return this.W;
    }

    public void k(zm0 zm0) {
        addView(zm0, this.i - 2);
        this.i++;
        j(zm0);
    }

    public void m(boolean z2) {
        if (D()) {
            if (A()) {
                this.j0.start();
            }
            if (this.V) {
                AnimatorSet animatorSet = this.c;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    this.b.start();
                    this.a.cancel();
                }
            }
            this.k = false;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if ((childAt instanceof zm0) && childAt.getVisibility() != 8) {
                    i2++;
                    this.l.postDelayed(new f((zm0) childAt, z2), (long) i3);
                    i3 += this.L;
                }
            }
            this.l.postDelayed(new g(), (long) ((i2 + 1) * this.L));
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.e);
        bringChildToFront(this.W);
        this.i = getChildCount();
        o();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.l0 == 0) {
            i6 = ((i4 - i2) - (this.f / 2)) - getPaddingRight();
        } else {
            i6 = (this.f / 2) + getPaddingLeft();
        }
        boolean z3 = this.g0 == 0;
        if (z3) {
            i7 = ((i5 - i3) - this.e.getMeasuredHeight()) - getPaddingBottom();
        } else {
            i7 = getPaddingTop();
        }
        int measuredWidth = i6 - (this.e.getMeasuredWidth() / 2);
        zm0 zm0 = this.e;
        zm0.layout(measuredWidth, i7, zm0.getMeasuredWidth() + measuredWidth, this.e.getMeasuredHeight() + i7);
        int measuredWidth2 = i6 - (this.W.getMeasuredWidth() / 2);
        int measuredHeight = ((this.e.getMeasuredHeight() / 2) + i7) - (this.W.getMeasuredHeight() / 2);
        ImageView imageView = this.W;
        imageView.layout(measuredWidth2, measuredHeight, imageView.getMeasuredWidth() + measuredWidth2, this.W.getMeasuredHeight() + measuredHeight);
        if (z3) {
            i7 = i7 + this.e.getMeasuredHeight() + this.d;
        }
        for (int i9 = this.i - 1; i9 >= 0; i9--) {
            View childAt = getChildAt(i9);
            if (childAt != this.W) {
                zm0 zm02 = (zm0) childAt;
                if (zm02.getVisibility() != 8) {
                    int measuredWidth3 = i6 - (zm02.getMeasuredWidth() / 2);
                    if (z3) {
                        i7 = (i7 - zm02.getMeasuredHeight()) - this.d;
                    }
                    if (zm02 != this.e) {
                        zm02.layout(measuredWidth3, i7, zm02.getMeasuredWidth() + measuredWidth3, zm02.getMeasuredHeight() + i7);
                        if (!this.k) {
                            zm02.w(false);
                        }
                    }
                    View view = (View) zm02.getTag(fn0.fab_label);
                    if (view != null) {
                        int measuredWidth4 = ((this.o0 ? this.f : zm02.getMeasuredWidth()) / 2) + this.g;
                        int i10 = this.l0 == 0 ? i6 - measuredWidth4 : measuredWidth4 + i6;
                        if (this.l0 == 0) {
                            i8 = i10 - view.getMeasuredWidth();
                        } else {
                            i8 = view.getMeasuredWidth() + i10;
                        }
                        int i11 = this.l0 == 0 ? i8 : i10;
                        if (this.l0 != 0) {
                            i10 = i8;
                        }
                        int measuredHeight2 = (i7 - this.h) + ((zm02.getMeasuredHeight() - view.getMeasuredHeight()) / 2);
                        view.layout(i11, measuredHeight2, i10, view.getMeasuredHeight() + measuredHeight2);
                        if (!this.k) {
                            view.setVisibility(4);
                        }
                    }
                    if (z3) {
                        i7 -= this.d;
                    } else {
                        i7 = i7 + childAt.getMeasuredHeight() + this.d;
                    }
                }
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        this.f = 0;
        measureChildWithMargins(this.W, i2, 0, i3, 0);
        for (int i4 = 0; i4 < this.i; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || childAt == this.W)) {
                measureChildWithMargins(childAt, i2, 0, i3, 0);
                this.f = Math.max(this.f, childAt.getMeasuredWidth());
            }
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (i6 >= this.i) {
                break;
            }
            View childAt2 = getChildAt(i6);
            if (!(childAt2.getVisibility() == 8 || childAt2 == this.W)) {
                int measuredWidth = childAt2.getMeasuredWidth() + 0;
                int measuredHeight = i5 + childAt2.getMeasuredHeight();
                bn0 bn0 = (bn0) childAt2.getTag(fn0.fab_label);
                if (bn0 != null) {
                    int measuredWidth2 = this.f - childAt2.getMeasuredWidth();
                    if (!this.o0) {
                        i8 = 2;
                    }
                    int i9 = measuredWidth2 / i8;
                    measureChildWithMargins(bn0, i2, childAt2.getMeasuredWidth() + bn0.n() + this.g + i9, i3, 0);
                    i7 = Math.max(i7, measuredWidth + bn0.getMeasuredWidth() + i9);
                }
                i5 = measuredHeight;
            }
            i6++;
        }
        int max = Math.max(this.f, i7 + this.g) + getPaddingLeft() + getPaddingRight();
        int l2 = l(i5 + (this.d * (this.i - 1)) + getPaddingTop() + getPaddingBottom());
        if (getLayoutParams().width == -1) {
            max = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i2);
        }
        if (getLayoutParams().height == -1) {
            l2 = ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), i3);
        }
        setMeasuredDimension(max, l2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return D();
        }
        if (action != 1) {
            return false;
        }
        m(this.O);
        return true;
    }

    /* renamed from: q */
    public ViewGroup.MarginLayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* renamed from: r */
    public ViewGroup.MarginLayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: s */
    public ViewGroup.MarginLayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setAnimated(boolean z2) {
        this.O = z2;
        long j2 = 300;
        this.a.setDuration(z2 ? 300 : 0);
        AnimatorSet animatorSet = this.b;
        if (!z2) {
            j2 = 0;
        }
        animatorSet.setDuration(j2);
    }

    public void setAnimationDelayPerItem(int i2) {
        this.L = i2;
    }

    public void setClosedOnTouchOutside(boolean z2) {
        this.f0 = z2;
    }

    public void setIconAnimated(boolean z2) {
        this.V = z2;
    }

    public void setIconAnimationCloseInterpolator(Interpolator interpolator) {
        this.b.setInterpolator(interpolator);
    }

    public void setIconAnimationInterpolator(Interpolator interpolator) {
        this.a.setInterpolator(interpolator);
        this.b.setInterpolator(interpolator);
    }

    public void setIconAnimationOpenInterpolator(Interpolator interpolator) {
        this.a.setInterpolator(interpolator);
    }

    public void setIconToggleAnimatorSet(AnimatorSet animatorSet) {
        this.c = animatorSet;
    }

    public void setMenuButtonColorNormal(int i2) {
        this.H = i2;
        this.e.setColorNormal(i2);
    }

    public void setMenuButtonColorNormalResId(int i2) {
        this.H = getResources().getColor(i2);
        this.e.setColorNormalResId(i2);
    }

    public void setMenuButtonColorPressed(int i2) {
        this.I = i2;
        this.e.setColorPressed(i2);
    }

    public void setMenuButtonColorPressedResId(int i2) {
        this.I = getResources().getColor(i2);
        this.e.setColorPressedResId(i2);
    }

    public void setMenuButtonColorRipple(int i2) {
        this.J = i2;
        this.e.setColorRipple(i2);
    }

    public void setMenuButtonColorRippleResId(int i2) {
        this.J = getResources().getColor(i2);
        this.e.setColorRippleResId(i2);
    }

    public void setMenuButtonHideAnimation(Animation animation) {
        this.b0 = animation;
        this.e.setHideAnimation(animation);
    }

    public void setMenuButtonLabelText(String str) {
        this.e.setLabelText(str);
    }

    public void setMenuButtonShowAnimation(Animation animation) {
        this.a0 = animation;
        this.e.setShowAnimation(animation);
    }

    public void setOnMenuButtonClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMenuToggleListener(j jVar) {
        this.h0 = jVar;
    }

    public void t(boolean z2) {
        if (!C() && !this.e0) {
            this.e0 = true;
            if (D()) {
                m(z2);
                this.l.postDelayed(new h(z2), (long) (this.L * this.i));
                return;
            }
            if (z2) {
                startAnimation(this.b0);
            }
            setVisibility(4);
            this.e0 = false;
        }
    }

    public void u(boolean z2) {
        if (!B() && !this.e0) {
            this.e0 = true;
            if (D()) {
                m(z2);
                this.l.postDelayed(new i(z2), (long) (this.L * this.i));
                return;
            }
            v(z2);
        }
    }

    public an0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public an0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new AnimatorSet();
        this.b = new AnimatorSet();
        this.d = hn0.a(getContext(), 0.0f);
        this.g = hn0.a(getContext(), 0.0f);
        this.h = hn0.a(getContext(), 0.0f);
        this.l = new Handler();
        this.o = hn0.a(getContext(), 4.0f);
        this.p = hn0.a(getContext(), 8.0f);
        this.q = hn0.a(getContext(), 4.0f);
        this.u = hn0.a(getContext(), 8.0f);
        this.x = hn0.a(getContext(), 3.0f);
        this.E = 4.0f;
        this.F = 1.0f;
        this.G = 3.0f;
        this.O = true;
        this.V = true;
        w(context, attributeSet);
    }
}
