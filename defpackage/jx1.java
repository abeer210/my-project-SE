package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: jx1  reason: default package */
/* compiled from: ShadowRenderer */
public class jx1 {
    private static final int[] i = new int[3];
    private static final float[] j = {0.0f, 0.5f, 1.0f};
    private static final int[] k = new int[4];
    private static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g;
    private Paint h;

    public jx1() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.g;
        if (z) {
            int[] iArr = k;
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.e;
            iArr[3] = this.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = (float) (-i2);
            rectF.inset(f4, f4);
            int[] iArr2 = k;
            iArr2[0] = 0;
            iArr2[1] = this.d;
            iArr2[2] = this.e;
            iArr2[3] = this.f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float[] fArr = l;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, k, l, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.h);
        }
        canvas.drawArc(rectF, f2, f3, true, this.b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = i;
        iArr[0] = this.f;
        iArr[1] = this.e;
        iArr[2] = this.d;
        Paint paint = this.c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, i, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    public Paint c() {
        return this.a;
    }

    public void d(int i2) {
        this.d = n1.o(i2, 68);
        this.e = n1.o(i2, 20);
        this.f = n1.o(i2, 0);
    }

    public jx1(int i2) {
        this.g = new Path();
        this.h = new Paint();
        d(i2);
        this.h.setColor(0);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.a = paint2;
        paint2.setColor(this.d);
        this.c = new Paint(this.b);
    }
}
