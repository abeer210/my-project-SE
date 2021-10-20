package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: x5  reason: default package */
/* compiled from: PathProperty */
public class x5<T> extends Property<T, Float> {
    private final Property<T, PointF> a;
    private final PathMeasure b;
    private final float c;
    private final float[] d = new float[2];
    private final PointF e = new PointF();
    private float f;

    public x5(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.b = pathMeasure;
        this.c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f);
    }

    /* renamed from: b */
    public void set(T t, Float f2) {
        this.f = f2.floatValue();
        this.b.getPosTan(this.c * f2.floatValue(), this.d, null);
        PointF pointF = this.e;
        float[] fArr = this.d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.a.set(t, pointF);
    }
}
