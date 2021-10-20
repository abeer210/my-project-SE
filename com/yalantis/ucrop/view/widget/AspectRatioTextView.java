package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import androidx.core.content.b;
import com.yalantis.ucrop.a;
import com.yalantis.ucrop.h;
import java.util.Locale;
import vigqyno.C0201;

public class AspectRatioTextView extends z {
    private final Rect e;
    private Paint f;
    private int g;
    private float h;
    private String i;
    private float j;
    private float k;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void h(int i2) {
        Paint paint = this.f;
        if (paint != null) {
            paint.setColor(i2);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i2, b.d(getContext(), a.ucrop_color_widget)}));
    }

    private void j(TypedArray typedArray) {
        setGravity(1);
        this.i = typedArray.getString(h.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.j = typedArray.getFloat(h.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0f);
        float f2 = typedArray.getFloat(h.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0f);
        this.k = f2;
        float f3 = this.j;
        if (f3 == 0.0f || f2 == 0.0f) {
            this.h = 0.0f;
        } else {
            this.h = f3 / f2;
        }
        this.g = getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.b.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
        k();
        h(getResources().getColor(a.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void k() {
        if (!TextUtils.isEmpty(this.i)) {
            setText(this.i);
            return;
        }
        setText(String.format(Locale.US, C0201.m82(26805), Integer.valueOf((int) this.j), Integer.valueOf((int) this.k)));
    }

    private void l() {
        if (this.h != 0.0f) {
            float f2 = this.j;
            float f3 = this.k;
            this.j = f3;
            this.k = f2;
            this.h = f3 / f2;
        }
    }

    public float i(boolean z) {
        if (z) {
            l();
            k();
        }
        return this.h;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.e);
            Rect rect = this.e;
            float f2 = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i2 = this.g;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f2 - (((float) i2) * 1.5f), ((float) i2) / 2.0f, this.f);
        }
    }

    public void setActiveColor(int i2) {
        h(i2);
        invalidate();
    }

    public void setAspectRatio(hu2 hu2) {
        this.i = hu2.a();
        this.j = hu2.b();
        float c = hu2.c();
        this.k = c;
        float f2 = this.j;
        if (f2 == 0.0f || c == 0.0f) {
            this.h = 0.0f;
        } else {
            this.h = f2 / c;
        }
        k();
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new Rect();
        j(context.obtainStyledAttributes(attributeSet, h.ucrop_AspectRatioTextView));
    }
}
