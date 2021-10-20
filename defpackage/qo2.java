package defpackage;

import android.animation.TypeEvaluator;
import com.facebook.react.views.view.d;
import vigqyno.C0201;

/* renamed from: qo2  reason: default package */
/* compiled from: BackgroundColorEvaluator.kt */
public final class qo2 implements TypeEvaluator<double[]> {
    private final double[] a = new double[3];
    private final d b;

    public qo2(d dVar) {
        ow2.c(dVar, C0201.m82(36035));
        this.b = dVar;
    }

    /* renamed from: a */
    public double[] evaluate(float f, double[] dArr, double[] dArr2) {
        ow2.c(dArr, C0201.m82(36036));
        ow2.c(dArr2, C0201.m82(36037));
        n1.g(dArr, dArr2, (double) f, this.a);
        this.b.x(zi2.b(this.a));
        return this.a;
    }
}
