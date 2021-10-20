package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;
import vigqyno.C0201;

/* compiled from: ReactSlider */
public class a extends u {
    private static int g;
    private double b = 0.0d;
    private double c = 0.0d;
    private double d = 0.0d;
    private double e = 0.0d;
    private double f = 0.0d;

    static {
        C0201.m83(a.class, 661);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            super.setStateListAnimator(null);
        }
    }

    private void c() {
        if (this.e == 0.0d) {
            double d2 = this.c - this.b;
            double d3 = (double) g;
            Double.isNaN(d3);
            this.f = d2 / d3;
        }
        setMax(getTotalSteps());
        d();
    }

    private void d() {
        double d2 = this.d;
        double d3 = this.b;
        double totalSteps = (double) getTotalSteps();
        Double.isNaN(totalSteps);
        setProgress((int) Math.round(((d2 - d3) / (this.c - d3)) * totalSteps));
    }

    private double getStepValue() {
        double d2 = this.e;
        return d2 > 0.0d ? d2 : this.f;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.c - this.b) / getStepValue());
    }

    public double b(int i) {
        if (i == getMax()) {
            return this.c;
        }
        double d2 = (double) i;
        double stepValue = getStepValue();
        Double.isNaN(d2);
        return (d2 * stepValue) + this.b;
    }

    public void setMaxValue(double d2) {
        this.c = d2;
        c();
    }

    public void setMinValue(double d2) {
        this.b = d2;
        c();
    }

    public void setStep(double d2) {
        this.e = d2;
        c();
    }

    public void setValue(double d2) {
        this.d = d2;
        d();
    }
}
