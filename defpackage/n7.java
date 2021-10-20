package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import vigqyno.C0201;

/* renamed from: n7  reason: default package */
/* compiled from: PathInterpolatorCompat */
public class n7 implements Interpolator {
    private float[] a;
    private float[] b;

    public n7(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.a[i2] = fArr[0];
                this.b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.a[0])) <= 1.0E-5d && ((double) Math.abs(this.b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException(C0201.m82(29791) + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException(C0201.m82(29792));
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(29793));
            sb.append(this.a[0]);
            String r4 = C0201.m82(29794);
            sb.append(r4);
            sb.append(this.b[0]);
            sb.append(C0201.m82(29795));
            int i6 = min - 1;
            sb.append(this.a[i6]);
            sb.append(r4);
            sb.append(this.b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException(C0201.m82(29796) + length);
    }

    private void c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        String r0 = C0201.m82(29797);
        if (m1.j(xmlPullParser, r0)) {
            String i = m1.i(typedArray, xmlPullParser, r0, 4);
            Path e = o1.e(i);
            if (e != null) {
                b(e);
                return;
            }
            throw new InflateException(C0201.m82(29798) + i);
        }
        String r02 = C0201.m82(29799);
        if (m1.j(xmlPullParser, r02)) {
            String r1 = C0201.m82(29800);
            if (m1.j(xmlPullParser, r1)) {
                float f = m1.f(typedArray, xmlPullParser, r02, 0, 0.0f);
                float f2 = m1.f(typedArray, xmlPullParser, r1, 1, 0.0f);
                String r2 = C0201.m82(29801);
                boolean j = m1.j(xmlPullParser, r2);
                String r5 = C0201.m82(29802);
                if (j != m1.j(xmlPullParser, r5)) {
                    throw new InflateException(C0201.m82(29803));
                } else if (!j) {
                    c(f, f2);
                } else {
                    a(f, f2, m1.f(typedArray, xmlPullParser, r2, 2, 0.0f), m1.f(typedArray, xmlPullParser, r5, 3, 0.0f));
                }
            } else {
                throw new InflateException(C0201.m82(29804));
            }
        } else {
            throw new InflateException(C0201.m82(29805));
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float[] fArr2 = this.b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public n7(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = m1.k(resources, theme, attributeSet, h7.l);
        d(k, xmlPullParser);
        k.recycle();
    }
}
