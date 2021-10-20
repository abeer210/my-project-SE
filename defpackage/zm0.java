package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import vigqyno.C0201;

/* renamed from: zm0  reason: default package */
/* compiled from: FloatingActionButton */
public class zm0 extends ImageButton {
    private static final Xfermode b0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    private boolean A;
    private float B;
    private float C;
    private boolean D;
    private RectF E;
    private Paint F;
    private Paint G;
    private boolean H;
    private long I;
    private float J;
    private long K;
    private double L;
    private boolean M;
    private int N;
    private float O;
    private float P;
    private float Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private boolean W;
    public int a;
    public GestureDetector a0;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Drawable k;
    private int l;
    private Animation m;
    private Animation n;
    private String o;
    private View.OnClickListener p;
    private Drawable q;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    /* access modifiers changed from: package-private */
    /* renamed from: zm0$a */
    /* compiled from: FloatingActionButton */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: zm0$b */
    /* compiled from: FloatingActionButton */
    class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            bn0 bn0 = (bn0) zm0.this.getTag(fn0.fab_label);
            if (bn0 != null) {
                bn0.s();
            }
            zm0.this.B();
            return super.onDown(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            bn0 bn0 = (bn0) zm0.this.getTag(fn0.fab_label);
            if (bn0 != null) {
                bn0.t();
            }
            zm0.this.C();
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: zm0$c */
    /* compiled from: FloatingActionButton */
    class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                if (zm0.this.p != null) {
                    zm0.this.p.onClick(zm0.this);
                }
            } finally {
                w30.h();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zm0$d */
    /* compiled from: FloatingActionButton */
    public class d extends ShapeDrawable {
        private int a;
        private int b;

        public /* synthetic */ d(zm0 zm0, Shape shape, a aVar) {
            this(shape);
        }

        public void draw(Canvas canvas) {
            setBounds(this.a, this.b, zm0.this.q() - this.a, zm0.this.p() - this.b);
            super.draw(canvas);
        }

        private d(Shape shape) {
            super(shape);
            int i = 0;
            this.a = zm0.this.v() ? zm0.this.d + Math.abs(zm0.this.e) : 0;
            this.b = zm0.this.v() ? Math.abs(zm0.this.f) + zm0.this.d : i;
            if (zm0.this.w) {
                this.a += zm0.this.x;
                this.b += zm0.this.x;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: zm0$e */
    /* compiled from: FloatingActionButton */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public float a;
        public float b;
        public float c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;

        /* renamed from: zm0$e$a */
        /* compiled from: FloatingActionButton */
        static class a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        private e(Parcel parcel) {
            super(parcel);
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            boolean z = true;
            this.h = parcel.readInt() != 0;
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.i = parcel.readInt() != 0;
            this.j = parcel.readInt() != 0;
            this.k = parcel.readInt() != 0;
            this.l = parcel.readInt() != 0;
            this.m = parcel.readInt() != 0;
            this.n = parcel.readInt() == 0 ? false : z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zm0$f */
    /* compiled from: FloatingActionButton */
    public class f extends Drawable {
        private Paint a;
        private Paint b;
        private float c;

        public /* synthetic */ f(zm0 zm0, a aVar) {
            this();
        }

        private void a() {
            zm0.this.setLayerType(1, null);
            this.a.setStyle(Paint.Style.FILL);
            this.a.setColor(zm0.this.g);
            this.b.setXfermode(zm0.b0);
            if (!zm0.this.isInEditMode()) {
                Paint paint = this.a;
                zm0 zm0 = zm0.this;
                paint.setShadowLayer((float) zm0.d, (float) zm0.e, (float) zm0.f, zm0.c);
            }
            this.c = (float) (zm0.this.getCircleSize() / 2);
            if (zm0.this.w && zm0.this.W) {
                this.c += (float) zm0.this.x;
            }
        }

        public void draw(Canvas canvas) {
            canvas.drawCircle(zm0.this.n(), zm0.this.o(), this.c, this.a);
            canvas.drawCircle(zm0.this.n(), zm0.this.o(), this.c, this.b);
        }

        public int getOpacity() {
            return 0;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }

        private f() {
            this.a = new Paint(1);
            this.b = new Paint(1);
            a();
        }
    }

    public zm0(Context context) {
        this(context, null);
    }

    private void F() {
        if (!this.D) {
            if (this.B == -1.0f) {
                this.B = getX();
            }
            if (this.C == -1.0f) {
                this.C = getY();
            }
            this.D = true;
        }
    }

    private void I() {
        this.F.setColor(this.z);
        this.F.setStyle(Paint.Style.STROKE);
        this.F.setStrokeWidth((float) this.x);
        this.G.setColor(this.y);
        this.G.setStyle(Paint.Style.STROKE);
        this.G.setStrokeWidth((float) this.x);
    }

    private void J() {
        int i2 = 0;
        int shadowX = v() ? getShadowX() : 0;
        if (v()) {
            i2 = getShadowY();
        }
        int i3 = this.x;
        this.E = new RectF((float) ((i3 / 2) + shadowX), (float) ((i3 / 2) + i2), (float) ((q() - shadowX) - (this.x / 2)), (float) ((p() - i2) - (this.x / 2)));
    }

    private void M() {
        float f2;
        float f3;
        if (this.w) {
            f3 = this.B > getX() ? getX() + ((float) this.x) : getX() - ((float) this.x);
            f2 = this.C > getY() ? getY() + ((float) this.x) : getY() - ((float) this.x);
        } else {
            f3 = this.B;
            f2 = this.C;
        }
        setX(f3);
        setY(f2);
    }

    private void N(long j2) {
        long j3 = this.K;
        if (j3 >= 200) {
            double d2 = this.L;
            double d3 = (double) j2;
            Double.isNaN(d3);
            double d4 = d2 + d3;
            this.L = d4;
            if (d4 > 500.0d) {
                this.L = d4 - 500.0d;
                this.K = 0;
                this.M = !this.M;
            }
            float cos = (((float) Math.cos(((this.L / 500.0d) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
            float f2 = (float) (270 - this.N);
            if (this.M) {
                this.O = cos * f2;
                return;
            }
            float f3 = f2 * (1.0f - cos);
            this.P += this.O - f3;
            this.O = f3;
            return;
        }
        this.K = j3 + j2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getCircleSize() {
        return getResources().getDimensionPixelSize(this.a == 0 ? dn0.fab_size_normal : dn0.fab_size_mini);
    }

    private int getShadowX() {
        return this.d + Math.abs(this.e);
    }

    private int getShadowY() {
        return this.d + Math.abs(this.f);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float n() {
        return (float) (getMeasuredWidth() / 2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float o() {
        return (float) (getMeasuredHeight() / 2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int p() {
        int circleSize = getCircleSize() + r();
        return this.w ? circleSize + (this.x * 2) : circleSize;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int q() {
        int circleSize = getCircleSize() + s();
        return this.w ? circleSize + (this.x * 2) : circleSize;
    }

    @TargetApi(16)
    private void setBackgroundCompat(Drawable drawable) {
        if (hn0.b()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    private Drawable t(int i2) {
        d dVar = new d(this, new OvalShape(), null);
        dVar.getPaint().setColor(i2);
        return dVar;
    }

    @TargetApi(21)
    private Drawable u() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, t(this.i));
        stateListDrawable.addState(new int[]{16842919}, t(this.h));
        stateListDrawable.addState(new int[0], t(this.g));
        if (hn0.c()) {
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.j}), stateListDrawable, null);
            setOutlineProvider(new a());
            setClipToOutline(true);
            this.q = rippleDrawable;
            return rippleDrawable;
        }
        this.q = stateListDrawable;
        return stateListDrawable;
    }

    private void x(Context context, AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.FloatingActionButton, i2, 0);
        this.g = obtainStyledAttributes.getColor(gn0.FloatingActionButton_fab_colorNormal, -2473162);
        this.h = obtainStyledAttributes.getColor(gn0.FloatingActionButton_fab_colorPressed, -1617853);
        this.i = obtainStyledAttributes.getColor(gn0.FloatingActionButton_fab_colorDisabled, -5592406);
        this.j = obtainStyledAttributes.getColor(gn0.FloatingActionButton_fab_colorRipple, -1711276033);
        this.b = obtainStyledAttributes.getBoolean(gn0.FloatingActionButton_fab_showShadow, true);
        this.c = obtainStyledAttributes.getColor(gn0.FloatingActionButton_fab_shadowColor, 1711276032);
        this.d = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionButton_fab_shadowRadius, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionButton_fab_shadowXOffset, this.e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(gn0.FloatingActionButton_fab_shadowYOffset, this.f);
        this.a = obtainStyledAttributes.getInt(gn0.FloatingActionButton_fab_size, 0);
        this.o = obtainStyledAttributes.getString(gn0.FloatingActionButton_fab_label);
        this.T = obtainStyledAttributes.getBoolean(gn0.FloatingActionButton_fab_progress_indeterminate, false);
        this.y = obtainStyledAttributes.getColor(gn0.FloatingActionButton_fab_progress_color, -16738680);
        this.z = obtainStyledAttributes.getColor(gn0.FloatingActionButton_fab_progress_backgroundColor, 1291845632);
        this.V = obtainStyledAttributes.getInt(gn0.FloatingActionButton_fab_progress_max, this.V);
        this.W = obtainStyledAttributes.getBoolean(gn0.FloatingActionButton_fab_progress_showBackground, true);
        if (obtainStyledAttributes.hasValue(gn0.FloatingActionButton_fab_progress)) {
            this.R = obtainStyledAttributes.getInt(gn0.FloatingActionButton_fab_progress, 0);
            this.U = true;
        }
        if (obtainStyledAttributes.hasValue(gn0.FloatingActionButton_fab_elevationCompat)) {
            float dimensionPixelOffset = (float) obtainStyledAttributes.getDimensionPixelOffset(gn0.FloatingActionButton_fab_elevationCompat, 0);
            if (isInEditMode()) {
                setElevation(dimensionPixelOffset);
            } else {
                setElevationCompat(dimensionPixelOffset);
            }
        }
        z(obtainStyledAttributes);
        y(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            if (this.T) {
                setIndeterminate(true);
            } else if (this.U) {
                F();
                H(this.R, false);
            }
        }
        setClickable(true);
    }

    private void y(TypedArray typedArray) {
        this.n = AnimationUtils.loadAnimation(getContext(), typedArray.getResourceId(gn0.FloatingActionButton_fab_hideAnimation, cn0.fab_scale_down));
    }

    private void z(TypedArray typedArray) {
        this.m = AnimationUtils.loadAnimation(getContext(), typedArray.getResourceId(gn0.FloatingActionButton_fab_showAnimation, cn0.fab_scale_up));
    }

    public boolean A() {
        return getVisibility() == 4;
    }

    @TargetApi(21)
    public void B() {
        Drawable drawable = this.q;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842910, 16842919});
        } else if (hn0.c()) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.q;
            rippleDrawable.setState(new int[]{16842910, 16842919});
            rippleDrawable.setHotspot(n(), o());
            rippleDrawable.setVisible(true, true);
        }
    }

    @TargetApi(21)
    public void C() {
        Drawable drawable = this.q;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842910});
        } else if (hn0.c()) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.q;
            rippleDrawable.setState(new int[]{16842910});
            rippleDrawable.setHotspot(n(), o());
            rippleDrawable.setVisible(true, true);
        }
    }

    public void D() {
        this.m.cancel();
        startAnimation(this.n);
    }

    public void E() {
        this.n.cancel();
        startAnimation(this.m);
    }

    public void G(int i2, int i3, int i4) {
        this.g = i2;
        this.h = i3;
        this.j = i4;
    }

    public synchronized void H(int i2, boolean z2) {
        if (!this.H) {
            this.R = i2;
            this.S = z2;
            if (!this.D) {
                this.U = true;
                return;
            }
            this.w = true;
            this.A = true;
            J();
            F();
            L();
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > this.V) {
                i2 = this.V;
            }
            float f2 = (float) i2;
            if (f2 != this.Q) {
                this.Q = this.V > 0 ? (f2 / ((float) this.V)) * 360.0f : 0.0f;
                this.I = SystemClock.uptimeMillis();
                if (!z2) {
                    this.P = this.Q;
                }
                invalidate();
            }
        }
    }

    public void K(boolean z2) {
        if (A()) {
            if (z2) {
                E();
            }
            super.setVisibility(0);
        }
    }

    public void L() {
        LayerDrawable layerDrawable;
        int i2 = 0;
        if (v()) {
            layerDrawable = new LayerDrawable(new Drawable[]{new f(this, null), u(), getIconDrawable()});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{u(), getIconDrawable()});
        }
        int i3 = -1;
        if (getIconDrawable() != null) {
            i3 = Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight());
        }
        int circleSize = getCircleSize();
        if (i3 <= 0) {
            i3 = this.l;
        }
        int i4 = (circleSize - i3) / 2;
        int abs = v() ? this.d + Math.abs(this.e) : 0;
        if (v()) {
            i2 = this.d + Math.abs(this.f);
        }
        if (this.w) {
            int i5 = this.x;
            abs += i5;
            i2 += i5;
        }
        int i6 = abs + i4;
        int i7 = i2 + i4;
        layerDrawable.setLayerInset(v() ? 2 : 1, i6, i7, i6, i7);
        setBackgroundCompat(layerDrawable);
    }

    public int getButtonSize() {
        return this.a;
    }

    public int getColorDisabled() {
        return this.i;
    }

    public int getColorNormal() {
        return this.g;
    }

    public int getColorPressed() {
        return this.h;
    }

    public int getColorRipple() {
        return this.j;
    }

    public Animation getHideAnimation() {
        return this.n;
    }

    public Drawable getIconDrawable() {
        Drawable drawable = this.k;
        if (drawable != null) {
            return drawable;
        }
        return new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.o;
    }

    public bn0 getLabelView() {
        return (bn0) getTag(fn0.fab_label);
    }

    public int getLabelVisibility() {
        bn0 labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public synchronized int getMax() {
        return this.V;
    }

    public View.OnClickListener getOnClickListener() {
        return this.p;
    }

    public synchronized int getProgress() {
        return this.H ? 0 : this.R;
    }

    public int getShadowColor() {
        return this.c;
    }

    public int getShadowRadius() {
        return this.d;
    }

    public int getShadowXOffset() {
        return this.e;
    }

    public int getShadowYOffset() {
        return this.f;
    }

    public Animation getShowAnimation() {
        return this.m;
    }

    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.w) {
            if (this.W) {
                canvas.drawArc(this.E, 360.0f, 360.0f, false, this.F);
            }
            boolean z2 = false;
            boolean z3 = true;
            if (this.H) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.I;
                N(uptimeMillis);
                float f4 = this.P + ((((float) uptimeMillis) * this.J) / 1000.0f);
                this.P = f4;
                if (f4 > 360.0f) {
                    this.P = f4 - 360.0f;
                }
                this.I = SystemClock.uptimeMillis();
                float f5 = this.P - 90.0f;
                float f6 = ((float) this.N) + this.O;
                if (isInEditMode()) {
                    f3 = 0.0f;
                    f2 = 135.0f;
                } else {
                    f3 = f5;
                    f2 = f6;
                }
                canvas.drawArc(this.E, f3, f2, false, this.G);
            } else {
                if (this.P != this.Q) {
                    float uptimeMillis2 = (((float) (SystemClock.uptimeMillis() - this.I)) / 1000.0f) * this.J;
                    float f7 = this.P;
                    float f8 = this.Q;
                    if (f7 > f8) {
                        this.P = Math.max(f7 - uptimeMillis2, f8);
                    } else {
                        this.P = Math.min(f7 + uptimeMillis2, f8);
                    }
                    this.I = SystemClock.uptimeMillis();
                    z2 = true;
                }
                canvas.drawArc(this.E, -90.0f, this.P, false, this.G);
                z3 = z2;
            }
            if (z3) {
                invalidate();
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(q(), p());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.P = eVar.a;
        this.Q = eVar.b;
        this.J = eVar.c;
        this.x = eVar.e;
        this.y = eVar.f;
        this.z = eVar.g;
        this.T = eVar.k;
        this.U = eVar.l;
        this.R = eVar.d;
        this.S = eVar.m;
        this.W = eVar.n;
        this.I = SystemClock.uptimeMillis();
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.a = this.P;
        eVar.b = this.Q;
        eVar.c = this.J;
        eVar.e = this.x;
        eVar.f = this.y;
        eVar.g = this.z;
        boolean z2 = this.H;
        eVar.k = z2;
        eVar.l = this.w && this.R > 0 && !z2;
        eVar.d = this.R;
        eVar.m = this.S;
        eVar.n = this.W;
        return eVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        F();
        if (this.T) {
            setIndeterminate(true);
            this.T = false;
        } else if (this.U) {
            H(this.R, this.S);
            this.U = false;
        } else if (this.A) {
            M();
            this.A = false;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        J();
        I();
        L();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.p != null && isEnabled()) {
            bn0 bn0 = (bn0) getTag(fn0.fab_label);
            if (bn0 == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 1) {
                if (bn0 != null) {
                    bn0.t();
                }
                C();
            } else if (action == 3) {
                if (bn0 != null) {
                    bn0.t();
                }
                C();
            }
            this.a0.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int r() {
        if (v()) {
            return getShadowY() * 2;
        }
        return 0;
    }

    public int s() {
        if (v()) {
            return getShadowX() * 2;
        }
        return 0;
    }

    public void setButtonSize(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(C0201.m82(7300));
        } else if (this.a != i2) {
            this.a = i2;
            L();
        }
    }

    public void setColorDisabled(int i2) {
        if (i2 != this.i) {
            this.i = i2;
            L();
        }
    }

    public void setColorDisabledResId(int i2) {
        setColorDisabled(getResources().getColor(i2));
    }

    public void setColorNormal(int i2) {
        if (this.g != i2) {
            this.g = i2;
            L();
        }
    }

    public void setColorNormalResId(int i2) {
        setColorNormal(getResources().getColor(i2));
    }

    public void setColorPressed(int i2) {
        if (i2 != this.h) {
            this.h = i2;
            L();
        }
    }

    public void setColorPressedResId(int i2) {
        setColorPressed(getResources().getColor(i2));
    }

    public void setColorRipple(int i2) {
        if (i2 != this.j) {
            this.j = i2;
            L();
        }
    }

    public void setColorRippleResId(int i2) {
        setColorRipple(getResources().getColor(i2));
    }

    public void setElevation(float f2) {
        if (hn0.c() && f2 > 0.0f) {
            super.setElevation(f2);
            if (!isInEditMode()) {
                this.u = true;
                this.b = false;
            }
            L();
        }
    }

    @TargetApi(21)
    public void setElevationCompat(float f2) {
        this.c = 637534208;
        float f3 = f2 / 2.0f;
        this.d = Math.round(f3);
        this.e = 0;
        if (this.a == 0) {
            f3 = f2;
        }
        this.f = Math.round(f3);
        if (hn0.c()) {
            super.setElevation(f2);
            this.v = true;
            this.b = false;
            L();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.b = true;
        L();
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        bn0 bn0 = (bn0) getTag(fn0.fab_label);
        if (bn0 != null) {
            bn0.setEnabled(z2);
        }
    }

    public void setHideAnimation(Animation animation) {
        this.n = animation;
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.k != drawable) {
            this.k = drawable;
            L();
        }
    }

    public void setImageResource(int i2) {
        Drawable drawable = getResources().getDrawable(i2);
        if (this.k != drawable) {
            this.k = drawable;
            L();
        }
    }

    public synchronized void setIndeterminate(boolean z2) {
        if (!z2) {
            this.P = 0.0f;
        }
        this.w = z2;
        this.A = true;
        this.H = z2;
        this.I = SystemClock.uptimeMillis();
        J();
        L();
    }

    public void setLabelText(String str) {
        this.o = str;
        bn0 labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setLabelTextColor(int i2) {
        getLabelView().setTextColor(i2);
    }

    public void setLabelVisibility(int i2) {
        bn0 labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i2);
            labelView.setHandleVisibilityChanges(i2 == 0);
        }
    }

    @TargetApi(21)
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.v) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin += getShadowX();
            marginLayoutParams.topMargin += getShadowY();
            marginLayoutParams.rightMargin += getShadowX();
            marginLayoutParams.bottomMargin += getShadowY();
        }
        super.setLayoutParams(layoutParams);
    }

    public synchronized void setMax(int i2) {
        this.V = i2;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.p = onClickListener;
        View view = (View) getTag(fn0.fab_label);
        if (view != null) {
            view.setOnClickListener(new c());
        }
    }

    public void setShadowColor(int i2) {
        if (this.c != i2) {
            this.c = i2;
            L();
        }
    }

    public void setShadowColorResource(int i2) {
        int color = getResources().getColor(i2);
        if (this.c != color) {
            this.c = color;
            L();
        }
    }

    public void setShadowRadius(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        if (this.d != dimensionPixelSize) {
            this.d = dimensionPixelSize;
            requestLayout();
            L();
        }
    }

    public void setShadowXOffset(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        if (this.e != dimensionPixelSize) {
            this.e = dimensionPixelSize;
            requestLayout();
            L();
        }
    }

    public void setShadowYOffset(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        if (this.f != dimensionPixelSize) {
            this.f = dimensionPixelSize;
            requestLayout();
            L();
        }
    }

    public void setShowAnimation(Animation animation) {
        this.m = animation;
    }

    public synchronized void setShowProgressBackground(boolean z2) {
        this.W = z2;
    }

    public void setShowShadow(boolean z2) {
        if (this.b != z2) {
            this.b = z2;
            L();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        bn0 bn0 = (bn0) getTag(fn0.fab_label);
        if (bn0 != null) {
            bn0.setVisibility(i2);
        }
    }

    public boolean v() {
        return !this.u && this.b;
    }

    public void w(boolean z2) {
        if (!A()) {
            if (z2) {
                D();
            }
            super.setVisibility(4);
        }
    }

    public zm0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        getLabelView().setTextColor(colorStateList);
    }

    public zm0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = hn0.a(getContext(), 4.0f);
        this.e = hn0.a(getContext(), 1.0f);
        this.f = hn0.a(getContext(), 3.0f);
        this.l = hn0.a(getContext(), 24.0f);
        this.x = hn0.a(getContext(), 6.0f);
        this.B = -1.0f;
        this.C = -1.0f;
        this.E = new RectF();
        this.F = new Paint(1);
        this.G = new Paint(1);
        this.J = 195.0f;
        this.K = 0;
        this.M = true;
        this.N = 16;
        this.V = 100;
        this.a0 = new GestureDetector(getContext(), new b());
        x(context, attributeSet, i2);
    }

    public void setShadowRadius(float f2) {
        this.d = hn0.a(getContext(), f2);
        requestLayout();
        L();
    }

    public void setShadowXOffset(float f2) {
        this.e = hn0.a(getContext(), f2);
        requestLayout();
        L();
    }

    public void setShadowYOffset(float f2) {
        this.f = hn0.a(getContext(), f2);
        requestLayout();
        L();
    }
}
