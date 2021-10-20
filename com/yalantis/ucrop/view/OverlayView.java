package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.a;
import com.yalantis.ucrop.b;
import com.yalantis.ucrop.h;

public class OverlayView extends View {
    private int A;
    private int B;
    private gu2 C;
    private boolean D;
    private final RectF a;
    private final RectF b;
    public int c;
    public int d;
    public float[] e;
    private int f;
    private int g;
    private float h;
    private float[] i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private Path n;
    private Paint o;
    private Paint p;
    private Paint q;
    private Paint u;
    private int v;
    private float w;
    private float x;
    private int y;
    private int z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int c(float f2, float f3) {
        double d2 = (double) this.z;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3 += 2) {
            double sqrt = Math.sqrt(Math.pow((double) (f2 - this.e[i3]), 2.0d) + Math.pow((double) (f3 - this.e[i3 + 1]), 2.0d));
            if (sqrt < d2) {
                i2 = i3 / 2;
                d2 = sqrt;
            }
        }
        if (this.v != 1 || i2 >= 0 || !this.a.contains(f2, f3)) {
            return i2;
        }
        return 4;
    }

    private void e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(h.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(b.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(h.ucrop_UCropView_ucrop_frame_color, getResources().getColor(a.ucrop_color_default_crop_frame));
        this.q.setStrokeWidth((float) dimensionPixelSize);
        this.q.setColor(color);
        this.q.setStyle(Paint.Style.STROKE);
        this.u.setStrokeWidth((float) (dimensionPixelSize * 3));
        this.u.setColor(color);
        this.u.setStyle(Paint.Style.STROKE);
    }

    private void f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(h.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(b.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(h.ucrop_UCropView_ucrop_grid_color, getResources().getColor(a.ucrop_color_default_crop_grid));
        this.p.setStrokeWidth((float) dimensionPixelSize);
        this.p.setColor(color);
        this.f = typedArray.getInt(h.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.g = typedArray.getInt(h.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    private void i(float f2, float f3) {
        this.b.set(this.a);
        int i2 = this.y;
        boolean z2 = true;
        if (i2 == 0) {
            RectF rectF = this.b;
            RectF rectF2 = this.a;
            rectF.set(f2, f3, rectF2.right, rectF2.bottom);
        } else if (i2 == 1) {
            RectF rectF3 = this.b;
            RectF rectF4 = this.a;
            rectF3.set(rectF4.left, f3, f2, rectF4.bottom);
        } else if (i2 == 2) {
            RectF rectF5 = this.b;
            RectF rectF6 = this.a;
            rectF5.set(rectF6.left, rectF6.top, f2, f3);
        } else if (i2 == 3) {
            RectF rectF7 = this.b;
            RectF rectF8 = this.a;
            rectF7.set(f2, rectF8.top, rectF8.right, f3);
        } else if (i2 == 4) {
            this.b.offset(f2 - this.w, f3 - this.x);
            if (this.b.left > ((float) getLeft()) && this.b.top > ((float) getTop()) && this.b.right < ((float) getRight()) && this.b.bottom < ((float) getBottom())) {
                this.a.set(this.b);
                j();
                postInvalidate();
                return;
            }
            return;
        }
        boolean z3 = this.b.height() >= ((float) this.A);
        if (this.b.width() < ((float) this.A)) {
            z2 = false;
        }
        RectF rectF9 = this.a;
        rectF9.set(z2 ? this.b.left : rectF9.left, (z3 ? this.b : this.a).top, (z2 ? this.b : this.a).right, (z3 ? this.b : this.a).bottom);
        if (z3 || z2) {
            j();
            postInvalidate();
        }
    }

    private void j() {
        this.e = ru2.b(this.a);
        ru2.a(this.a);
        this.i = null;
        this.n.reset();
        this.n.addCircle(this.a.centerX(), this.a.centerY(), Math.min(this.a.width(), this.a.height()) / 2.0f, Path.Direction.CW);
    }

    public void a(Canvas canvas) {
        if (this.k) {
            if (this.i == null && !this.a.isEmpty()) {
                this.i = new float[((this.f * 4) + (this.g * 4))];
                int i2 = 0;
                for (int i3 = 0; i3 < this.f; i3++) {
                    float[] fArr = this.i;
                    int i4 = i2 + 1;
                    RectF rectF = this.a;
                    fArr[i2] = rectF.left;
                    int i5 = i4 + 1;
                    float f2 = ((float) i3) + 1.0f;
                    float height = rectF.height() * (f2 / ((float) (this.f + 1)));
                    RectF rectF2 = this.a;
                    fArr[i4] = height + rectF2.top;
                    float[] fArr2 = this.i;
                    int i6 = i5 + 1;
                    fArr2[i5] = rectF2.right;
                    i2 = i6 + 1;
                    fArr2[i6] = (rectF2.height() * (f2 / ((float) (this.f + 1)))) + this.a.top;
                }
                for (int i7 = 0; i7 < this.g; i7++) {
                    float[] fArr3 = this.i;
                    int i8 = i2 + 1;
                    float f3 = ((float) i7) + 1.0f;
                    float width = this.a.width() * (f3 / ((float) (this.g + 1)));
                    RectF rectF3 = this.a;
                    fArr3[i2] = width + rectF3.left;
                    float[] fArr4 = this.i;
                    int i9 = i8 + 1;
                    fArr4[i8] = rectF3.top;
                    int i10 = i9 + 1;
                    float width2 = rectF3.width() * (f3 / ((float) (this.g + 1)));
                    RectF rectF4 = this.a;
                    fArr4[i9] = width2 + rectF4.left;
                    i2 = i10 + 1;
                    this.i[i10] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.i;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.p);
            }
        }
        if (this.j) {
            canvas.drawRect(this.a, this.q);
        }
        if (this.v != 0) {
            canvas.save();
            this.b.set(this.a);
            RectF rectF5 = this.b;
            int i11 = this.B;
            rectF5.inset((float) i11, (float) (-i11));
            canvas.clipRect(this.b, Region.Op.DIFFERENCE);
            this.b.set(this.a);
            RectF rectF6 = this.b;
            int i12 = this.B;
            rectF6.inset((float) (-i12), (float) i12);
            canvas.clipRect(this.b, Region.Op.DIFFERENCE);
            canvas.drawRect(this.a, this.u);
            canvas.restore();
        }
    }

    public void b(Canvas canvas) {
        canvas.save();
        if (this.l) {
            canvas.clipPath(this.n, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.a, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.m);
        canvas.restore();
        if (this.l) {
            canvas.drawCircle(this.a.centerX(), this.a.centerY(), Math.min(this.a.width(), this.a.height()) / 2.0f, this.o);
        }
    }

    public void d() {
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    public void g(TypedArray typedArray) {
        this.l = typedArray.getBoolean(h.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(h.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(a.ucrop_color_default_dimmed));
        this.m = color;
        this.o.setColor(color);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(1.0f);
        e(typedArray);
        this.j = typedArray.getBoolean(h.ucrop_UCropView_ucrop_show_frame, true);
        f(typedArray);
        this.k = typedArray.getBoolean(h.ucrop_UCropView_ucrop_show_grid, true);
    }

    public RectF getCropViewRect() {
        return this.a;
    }

    public int getFreestyleCropMode() {
        return this.v;
    }

    public gu2 getOverlayViewChangeListener() {
        return this.C;
    }

    public void h() {
        int i2 = this.c;
        float f2 = this.h;
        int i3 = (int) (((float) i2) / f2);
        int i4 = this.d;
        if (i3 > i4) {
            int i5 = (int) (((float) i4) * f2);
            int i6 = (i2 - i5) / 2;
            this.a.set((float) (getPaddingLeft() + i6), (float) getPaddingTop(), (float) (getPaddingLeft() + i5 + i6), (float) (getPaddingTop() + this.d));
        } else {
            int i7 = (i4 - i3) / 2;
            this.a.set((float) getPaddingLeft(), (float) (getPaddingTop() + i7), (float) (getPaddingLeft() + this.c), (float) (getPaddingTop() + i3 + i7));
        }
        gu2 gu2 = this.C;
        if (gu2 != null) {
            gu2.a(this.a);
        }
        j();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.c = (getWidth() - getPaddingRight()) - paddingLeft;
            this.d = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.D) {
                this.D = false;
                setTargetAspectRatio(this.h);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = false;
        if (!this.a.isEmpty() && this.v != 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c2 = c(x2, y2);
                this.y = c2;
                if (c2 != -1) {
                    z2 = true;
                }
                if (!z2) {
                    this.w = -1.0f;
                    this.x = -1.0f;
                } else if (this.w < 0.0f) {
                    this.w = x2;
                    this.x = y2;
                }
                return z2;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.y != -1) {
                float min = Math.min(Math.max(x2, (float) getPaddingLeft()), (float) (getWidth() - getPaddingRight()));
                float min2 = Math.min(Math.max(y2, (float) getPaddingTop()), (float) (getHeight() - getPaddingBottom()));
                i(min, min2);
                this.w = min;
                this.x = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.w = -1.0f;
                this.x = -1.0f;
                this.y = -1;
                gu2 gu2 = this.C;
                if (gu2 != null) {
                    gu2.a(this.a);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z2) {
        this.l = z2;
    }

    public void setCropFrameColor(int i2) {
        this.q.setColor(i2);
    }

    public void setCropFrameStrokeWidth(int i2) {
        this.q.setStrokeWidth((float) i2);
    }

    public void setCropGridColor(int i2) {
        this.p.setColor(i2);
    }

    public void setCropGridColumnCount(int i2) {
        this.g = i2;
        this.i = null;
    }

    public void setCropGridCornerColor(int i2) {
        this.u.setColor(i2);
    }

    public void setCropGridRowCount(int i2) {
        this.f = i2;
        this.i = null;
    }

    public void setCropGridStrokeWidth(int i2) {
        this.p.setStrokeWidth((float) i2);
    }

    public void setDimmedColor(int i2) {
        this.m = i2;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z2) {
        this.v = z2 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i2) {
        this.v = i2;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(gu2 gu2) {
        this.C = gu2;
    }

    public void setShowCropFrame(boolean z2) {
        this.j = z2;
    }

    public void setShowCropGrid(boolean z2) {
        this.k = z2;
    }

    public void setTargetAspectRatio(float f2) {
        this.h = f2;
        if (this.c > 0) {
            h();
            postInvalidate();
            return;
        }
        this.D = true;
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new RectF();
        this.b = new RectF();
        this.i = null;
        this.n = new Path();
        this.o = new Paint(1);
        this.p = new Paint(1);
        this.q = new Paint(1);
        this.u = new Paint(1);
        this.v = 0;
        this.w = -1.0f;
        this.x = -1.0f;
        this.y = -1;
        this.z = getResources().getDimensionPixelSize(b.ucrop_default_crop_rect_corner_touch_threshold);
        this.A = getResources().getDimensionPixelSize(b.ucrop_default_crop_rect_min_size);
        this.B = getResources().getDimensionPixelSize(b.ucrop_default_crop_rect_corner_touch_area_line_length);
        d();
    }
}
