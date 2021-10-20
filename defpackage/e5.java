package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: e5  reason: default package */
/* compiled from: CircleImageView */
public class e5 extends ImageView {
    private Animation.AnimationListener a;
    private int b;
    private int c;

    /* renamed from: e5$a */
    /* compiled from: CircleImageView */
    private static class a extends OvalShape {
        private Paint a = new Paint();
        private int b;
        private e5 c;

        public a(e5 e5Var, int i) {
            this.c = e5Var;
            this.b = i;
            a((int) rect().width());
        }

        private void a(int i) {
            float f = (float) (i / 2);
            this.a.setShader(new RadialGradient(f, f, (float) this.b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.c.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.c.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.a);
            canvas.drawCircle(f, height, (float) (width - this.b), paint);
        }

        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            a((int) f);
        }
    }

    public e5(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.b = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(d5.SwipeRefreshLayout);
        this.c = obtainStyledAttributes.getColor(d5.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            k3.o0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.b, (float) i2, (float) i, 503316480);
            int i3 = this.b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.c);
        k3.k0(this, shapeDrawable);
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.b * 2), getMeasuredHeight() + (this.b * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.c = i;
        }
    }
}
