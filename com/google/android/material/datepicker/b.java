package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.util.g;
import vigqyno.C0201;

/* compiled from: CalendarItemStyle */
public final class b {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final vx1 f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, vx1 vx1, Rect rect) {
        g.b(rect.left);
        g.b(rect.top);
        g.b(rect.right);
        g.b(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = vx1;
    }

    public static b a(Context context, int i) {
        g.a(i != 0, C0201.m82(10669));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, xv1.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(xv1.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(xv1.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(xv1.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(xv1.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a2 = dx1.a(context, obtainStyledAttributes, xv1.MaterialCalendarItem_itemFillColor);
        ColorStateList a3 = dx1.a(context, obtainStyledAttributes, xv1.MaterialCalendarItem_itemTextColor);
        ColorStateList a4 = dx1.a(context, obtainStyledAttributes, xv1.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(xv1.MaterialCalendarItem_itemStrokeWidth, 0);
        vx1 m = vx1.b(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(xv1.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a2, a3, a4, dimensionPixelSize, m, rect);
    }

    public int b() {
        return this.a.bottom;
    }

    public int c() {
        return this.a.top;
    }

    public void d(TextView textView) {
        rx1 rx1 = new rx1();
        rx1 rx12 = new rx1();
        rx1.setShapeAppearanceModel(this.f);
        rx12.setShapeAppearanceModel(this.f);
        rx1.V(this.c);
        rx1.b0((float) this.e, this.d);
        textView.setTextColor(this.b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.b.withAlpha(30), rx1, rx12) : rx1;
        Rect rect = this.a;
        k3.k0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
