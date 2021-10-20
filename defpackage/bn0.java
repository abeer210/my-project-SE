package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.TextView;

/* renamed from: bn0  reason: default package */
/* compiled from: Label */
public class bn0 extends TextView {
    private static final Xfermode v = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    private int a;
    private int b;
    private int c;
    private int d;
    private Drawable e;
    private boolean f = true;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private zm0 m;
    private Animation n;
    private Animation o;
    private boolean p;
    private boolean q = true;
    public GestureDetector u = new GestureDetector(getContext(), new b());

    /* access modifiers changed from: package-private */
    /* renamed from: bn0$a */
    /* compiled from: Label */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: bn0$b */
    /* compiled from: Label */
    class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            bn0.this.s();
            if (bn0.this.m != null) {
                bn0.this.m.B();
            }
            return super.onDown(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            bn0.this.t();
            if (bn0.this.m != null) {
                bn0.this.m.C();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: bn0$c */
    /* compiled from: Label */
    private class c extends Drawable {
        private Paint a;
        private Paint b;

        public /* synthetic */ c(bn0 bn0, a aVar) {
            this();
        }

        private void a() {
            bn0.this.setLayerType(1, null);
            this.a.setStyle(Paint.Style.FILL);
            this.a.setColor(bn0.this.i);
            this.b.setXfermode(bn0.v);
            if (!bn0.this.isInEditMode()) {
                this.a.setShadowLayer((float) bn0.this.a, (float) bn0.this.b, (float) bn0.this.c, bn0.this.d);
            }
        }

        public void draw(Canvas canvas) {
            RectF rectF = new RectF((float) (bn0.this.a + Math.abs(bn0.this.b)), (float) (bn0.this.a + Math.abs(bn0.this.c)), (float) bn0.this.g, (float) bn0.this.h);
            canvas.drawRoundRect(rectF, (float) bn0.this.l, (float) bn0.this.l, this.a);
            canvas.drawRoundRect(rectF, (float) bn0.this.l, (float) bn0.this.l, this.b);
        }

        public int getOpacity() {
            return 0;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }

        private c() {
            this.a = new Paint(1);
            this.b = new Paint(1);
            a();
        }
    }

    public bn0(Context context) {
        super(context);
    }

    private int k() {
        if (this.h == 0) {
            this.h = getMeasuredHeight();
        }
        return getMeasuredHeight() + m();
    }

    private int l() {
        if (this.g == 0) {
            this.g = getMeasuredWidth();
        }
        return getMeasuredWidth() + n();
    }

    @TargetApi(21)
    private Drawable o() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, p(this.j));
        stateListDrawable.addState(new int[0], p(this.i));
        if (hn0.c()) {
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.k}), stateListDrawable, null);
            setOutlineProvider(new a());
            setClipToOutline(true);
            this.e = rippleDrawable;
            return rippleDrawable;
        }
        this.e = stateListDrawable;
        return stateListDrawable;
    }

    private Drawable p(int i2) {
        int i3 = this.l;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{(float) i3, (float) i3, (float) i3, (float) i3, (float) i3, (float) i3, (float) i3, (float) i3}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    @TargetApi(21)
    private void setBackgroundCompat(Drawable drawable) {
        if (hn0.b()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    private void setShadow(zm0 zm0) {
        this.d = zm0.getShadowColor();
        this.a = zm0.getShadowRadius();
        this.b = zm0.getShadowXOffset();
        this.c = zm0.getShadowYOffset();
        this.f = zm0.v();
    }

    private void u() {
        if (this.o != null) {
            this.n.cancel();
            startAnimation(this.o);
        }
    }

    private void v() {
        if (this.n != null) {
            this.o.cancel();
            startAnimation(this.n);
        }
    }

    public int m() {
        if (this.f) {
            return this.a + Math.abs(this.c);
        }
        return 0;
    }

    public int n() {
        if (this.f) {
            return this.a + Math.abs(this.b);
        }
        return 0;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(l(), k());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        zm0 zm0 = this.m;
        if (zm0 == null || zm0.getOnClickListener() == null || !this.m.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            t();
            this.m.C();
        } else if (action == 3) {
            t();
            this.m.C();
        }
        this.u.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void q(boolean z) {
        if (z) {
            u();
        }
        setVisibility(4);
    }

    public boolean r() {
        return this.q;
    }

    @TargetApi(21)
    public void s() {
        if (this.p) {
            this.e = getBackground();
        }
        Drawable drawable = this.e;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842919});
        } else if (hn0.c()) {
            Drawable drawable2 = this.e;
            if (drawable2 instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) drawable2;
                rippleDrawable.setState(new int[]{16842910, 16842919});
                rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
                rippleDrawable.setVisible(true, true);
            }
        }
    }

    public void setCornerRadius(int i2) {
        this.l = i2;
    }

    public void setFab(zm0 zm0) {
        this.m = zm0;
        setShadow(zm0);
    }

    public void setHandleVisibilityChanges(boolean z) {
        this.q = z;
    }

    public void setHideAnimation(Animation animation) {
        this.o = animation;
    }

    public void setShowAnimation(Animation animation) {
        this.n = animation;
    }

    public void setShowShadow(boolean z) {
        this.f = z;
    }

    public void setUsingStyle(boolean z) {
        this.p = z;
    }

    @TargetApi(21)
    public void t() {
        if (this.p) {
            this.e = getBackground();
        }
        Drawable drawable = this.e;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
        } else if (hn0.c()) {
            Drawable drawable2 = this.e;
            if (drawable2 instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) drawable2;
                rippleDrawable.setState(new int[0]);
                rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
                rippleDrawable.setVisible(true, true);
            }
        }
    }

    public void w(int i2, int i3, int i4) {
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public void x(boolean z) {
        if (z) {
            v();
        }
        setVisibility(0);
    }

    public void y() {
        LayerDrawable layerDrawable;
        if (this.f) {
            layerDrawable = new LayerDrawable(new Drawable[]{new c(this, null), o()});
            layerDrawable.setLayerInset(1, this.a + Math.abs(this.b), this.a + Math.abs(this.c), this.a + Math.abs(this.b), this.a + Math.abs(this.c));
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{o()});
        }
        setBackgroundCompat(layerDrawable);
    }
}
