package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import vigqyno.C0201;

/* compiled from: ARTShapeShadowNode */
public class b extends f {
    public Path f;
    private float[] g;
    private float[] h;
    private float[] i;
    private float j = 1.0f;
    private int k = 1;
    private int l = 1;

    private Path f(float[] fArr) {
        int i2;
        int i3;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i4 = 0;
        while (i4 < fArr.length) {
            int i5 = i4 + 1;
            int i6 = (int) fArr[i4];
            if (i6 != 0) {
                boolean z = true;
                if (i6 == 1) {
                    path.close();
                    i4 = i5;
                } else if (i6 != 2) {
                    if (i6 == 3) {
                        int i7 = i5 + 1;
                        float f2 = fArr[i5];
                        float f3 = this.c;
                        int i8 = i7 + 1;
                        float f4 = fArr[i7] * f3;
                        int i9 = i8 + 1;
                        int i10 = i9 + 1;
                        float f5 = fArr[i9] * f3;
                        int i11 = i10 + 1;
                        i3 = i11 + 1;
                        path.cubicTo(f2 * f3, f4, fArr[i8] * f3, f5, fArr[i10] * f3, fArr[i11] * f3);
                    } else if (i6 == 4) {
                        int i12 = i5 + 1;
                        float f6 = fArr[i5];
                        float f7 = this.c;
                        float f8 = f6 * f7;
                        int i13 = i12 + 1;
                        float f9 = fArr[i12] * f7;
                        int i14 = i13 + 1;
                        float f10 = fArr[i13] * f7;
                        int i15 = i14 + 1;
                        float degrees = (float) Math.toDegrees((double) fArr[i14]);
                        int i16 = i15 + 1;
                        float degrees2 = (float) Math.toDegrees((double) fArr[i15]);
                        i3 = i16 + 1;
                        if (fArr[i16] == 1.0f) {
                            z = false;
                        }
                        float f11 = degrees2 - degrees;
                        if (Math.abs(f11) >= 360.0f) {
                            path.addCircle(f8, f9, f10, z ? Path.Direction.CCW : Path.Direction.CW);
                        } else {
                            float g2 = g(f11, 360.0f);
                            if (z && g2 < 360.0f) {
                                g2 = (360.0f - g2) * -1.0f;
                            }
                            path.arcTo(new RectF(f8 - f10, f9 - f10, f8 + f10, f9 + f10), degrees, g2);
                        }
                    } else {
                        throw new JSApplicationIllegalArgumentException(C0201.m82(9013) + i6);
                    }
                    i4 = i3;
                } else {
                    int i17 = i5 + 1;
                    float f12 = fArr[i5];
                    float f13 = this.c;
                    i2 = i17 + 1;
                    path.lineTo(f12 * f13, fArr[i17] * f13);
                }
            } else {
                int i18 = i5 + 1;
                float f14 = fArr[i5];
                float f15 = this.c;
                i2 = i18 + 1;
                path.moveTo(f14 * f15, fArr[i18] * f15);
            }
            i4 = i2;
        }
        return path;
    }

    private float g(float f2, float f3) {
        float f4 = f2 % f3;
        return f4 < 0.0f ? f4 + f3 : f4;
    }

    @Override // com.facebook.react.views.art.f
    public void b(Canvas canvas, Paint paint, float f2) {
        float f3 = f2 * this.a;
        if (f3 > 0.01f) {
            d(canvas);
            if (this.f != null) {
                if (h(paint, f3)) {
                    canvas.drawPath(this.f, paint);
                }
                if (i(paint, f3)) {
                    canvas.drawPath(this.f, paint);
                }
                c(canvas);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(9014));
            }
        }
        markUpdateSeen();
    }

    public boolean h(Paint paint, float f2) {
        float[] fArr;
        int[] iArr;
        float[] fArr2 = this.h;
        int i2 = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        float[] fArr3 = this.h;
        int i3 = (int) fArr3[0];
        if (i3 != 0) {
            String r10 = C0201.m82(9015);
            if (i3 != 1) {
                f60.A(r10, C0201.m82(9016) + i3 + C0201.m82(9017));
            } else {
                int i4 = 5;
                if (fArr3.length < 5) {
                    f60.A(r10, C0201.m82(9018) + this.h.length);
                    return false;
                }
                float f3 = fArr3[1];
                float f4 = this.c;
                float f5 = f3 * f4;
                float f6 = fArr3[2] * f4;
                float f7 = fArr3[3] * f4;
                float f8 = fArr3[4] * f4;
                int length = (fArr3.length - 5) / 5;
                if (length > 0) {
                    int[] iArr2 = new int[length];
                    float[] fArr4 = new float[length];
                    while (i2 < length) {
                        float[] fArr5 = this.h;
                        fArr4[i2] = fArr5[(length * 4) + i4 + i2];
                        int i5 = (i2 * 4) + i4;
                        iArr2[i2] = Color.argb((int) (fArr5[i5 + 3] * 255.0f), (int) (fArr5[i5 + 0] * 255.0f), (int) (fArr5[i5 + 1] * 255.0f), (int) (fArr5[i5 + 2] * 255.0f));
                        i2++;
                        i4 = 5;
                    }
                    iArr = iArr2;
                    fArr = fArr4;
                } else {
                    iArr = null;
                    fArr = null;
                }
                paint.setShader(new LinearGradient(f5, f6, f7, f8, iArr, fArr, Shader.TileMode.CLAMP));
            }
            return true;
        }
        float f9 = fArr3.length > 4 ? fArr3[4] * f2 * 255.0f : f2 * 255.0f;
        float[] fArr6 = this.h;
        paint.setARGB((int) f9, (int) (fArr6[1] * 255.0f), (int) (fArr6[2] * 255.0f), (int) (fArr6[3] * 255.0f));
        return true;
    }

    public boolean i(Paint paint, float f2) {
        float[] fArr;
        if (this.j == 0.0f || (fArr = this.g) == null || fArr.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        int i2 = this.k;
        String r4 = C0201.m82(9019);
        if (i2 == 0) {
            paint.setStrokeCap(Paint.Cap.BUTT);
        } else if (i2 == 1) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        } else if (i2 == 2) {
            paint.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(9020) + this.k + r4);
        }
        int i3 = this.l;
        if (i3 == 0) {
            paint.setStrokeJoin(Paint.Join.MITER);
        } else if (i3 == 1) {
            paint.setStrokeJoin(Paint.Join.ROUND);
        } else if (i3 == 2) {
            paint.setStrokeJoin(Paint.Join.BEVEL);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(9021) + this.l + r4);
        }
        paint.setStrokeWidth(this.j * this.c);
        float[] fArr2 = this.g;
        int i4 = (int) (fArr2.length > 3 ? fArr2[3] * f2 * 255.0f : f2 * 255.0f);
        float[] fArr3 = this.g;
        paint.setARGB(i4, (int) (fArr3[0] * 255.0f), (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f));
        float[] fArr4 = this.i;
        if (fArr4 != null && fArr4.length > 0) {
            paint.setPathEffect(new DashPathEffect(this.i, 0.0f));
        }
        return true;
    }

    @xj0(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.h = g.b(readableArray);
        markUpdated();
    }

    @xj0(name = "d")
    public void setShapePath(ReadableArray readableArray) {
        this.f = f(g.b(readableArray));
        markUpdated();
    }

    @xj0(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.g = g.b(readableArray);
        markUpdated();
    }

    @xj0(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i2) {
        this.k = i2;
        markUpdated();
    }

    @xj0(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.i = g.b(readableArray);
        markUpdated();
    }

    @xj0(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i2) {
        this.l = i2;
        markUpdated();
    }

    @xj0(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f2) {
        this.j = f2;
        markUpdated();
    }
}
