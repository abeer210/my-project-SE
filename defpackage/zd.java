package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: zd  reason: default package */
/* compiled from: SolidLayer */
public class zd extends td {
    private final Path A = new Path();
    private final wd B;
    private nb<ColorFilter, ColorFilter> C;
    private final RectF x = new RectF();
    private final Paint y = new ta();
    private final float[] z = new float[8];

    public zd(ga gaVar, wd wdVar) {
        super(gaVar, wdVar);
        this.B = wdVar;
        this.y.setAlpha(0);
        this.y.setStyle(Paint.Style.FILL);
        this.y.setColor(wdVar.m());
    }

    @Override // defpackage.td, defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        this.x.set(0.0f, 0.0f, (float) this.B.o(), (float) this.B.n());
        this.m.mapRect(this.x);
        rectF.set(this.x);
    }

    @Override // defpackage.td, defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        super.h(t, dgVar);
        if (t != la.C) {
            return;
        }
        if (dgVar == null) {
            this.C = null;
        } else {
            this.C = new cc(dgVar);
        }
    }

    @Override // defpackage.td
    public void u(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.B.m());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.v.h() == null ? 100 : this.v.h().h().intValue()))) / 100.0f) * 255.0f);
            this.y.setAlpha(intValue);
            nb<ColorFilter, ColorFilter> nbVar = this.C;
            if (nbVar != null) {
                this.y.setColorFilter(nbVar.h());
            }
            if (intValue > 0) {
                float[] fArr = this.z;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.B.o();
                float[] fArr2 = this.z;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.B.o();
                this.z[5] = (float) this.B.n();
                float[] fArr3 = this.z;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.B.n();
                matrix.mapPoints(this.z);
                this.A.reset();
                Path path = this.A;
                float[] fArr4 = this.z;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.A;
                float[] fArr5 = this.z;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.A;
                float[] fArr6 = this.z;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.A;
                float[] fArr7 = this.z;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.A;
                float[] fArr8 = this.z;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.A.close();
                canvas.drawPath(this.A, this.y);
            }
        }
    }
}
