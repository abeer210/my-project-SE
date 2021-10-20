package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* compiled from: CalendarStyle */
public final class c {
    public final b a;
    public final b b;
    public final b c;
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final Paint h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(cx1.c(context, nv1.materialCalendarStyle, g.class.getCanonicalName()), xv1.MaterialCalendar);
        this.a = b.a(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendar_dayStyle, 0));
        this.g = b.a(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendar_dayInvalidStyle, 0));
        this.b = b.a(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendar_daySelectedStyle, 0));
        this.c = b.a(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a2 = dx1.a(context, obtainStyledAttributes, xv1.MaterialCalendar_rangeFillColor);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendar_yearStyle, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendar_yearSelectedStyle, 0));
        this.f = b.a(context, obtainStyledAttributes.getResourceId(xv1.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
