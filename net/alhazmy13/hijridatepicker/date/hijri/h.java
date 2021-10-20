package net.alhazmy13.hijridatepicker.date.hijri;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import vigqyno.C0201;

/* compiled from: SimpleMonthView */
public class h extends e {
    public h(Context context, AttributeSet attributeSet, a aVar) {
        super(context, attributeSet, aVar);
    }

    @Override // net.alhazmy13.hijridatepicker.date.hijri.e
    public void d(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.n == i3) {
            canvas.drawCircle((float) i4, (float) (i5 - (e.L / 3)), (float) e.P, this.f);
        }
        if (m(i, i2, i3)) {
            this.d.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        } else {
            this.d.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
        if (this.a.j(i, i2, i3)) {
            this.d.setColor(this.G);
        } else if (this.n == i3) {
            this.d.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.d.setColor(this.C);
        } else if (!this.m || this.o != i3) {
            this.d.setColor(m(i, i2, i3) ? this.F : this.B);
        } else {
            this.d.setColor(this.E);
        }
        canvas.drawText(String.format(C0201.m82(20734), Integer.valueOf(i3)), (float) i4, (float) i5, this.d);
    }
}
