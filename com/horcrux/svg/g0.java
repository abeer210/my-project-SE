package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.i;
import java.text.Bidi;
import java.util.ArrayList;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: TSpanView */
public class g0 extends t0 {
    private Path E0;
    public String F0;
    private h0 G0;
    private final ArrayList<String> H0 = new ArrayList<>();
    private final ArrayList<Matrix> I0 = new ArrayList<>();
    private final AssetManager J0 = this.a.getResources().getAssets();

    /* access modifiers changed from: package-private */
    /* compiled from: TSpanView */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|(2:41|42)|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|(2:41|42)|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f6 */
        static {
            int[] iArr = new int[i0.values().length];
            c = iArr;
            try {
                iArr[i0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[i0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c[i0.afterEdge.ordinal()] = 3;
            c[i0.textAfterEdge.ordinal()] = 4;
            c[i0.alphabetic.ordinal()] = 5;
            c[i0.ideographic.ordinal()] = 6;
            c[i0.middle.ordinal()] = 7;
            c[i0.central.ordinal()] = 8;
            c[i0.mathematical.ordinal()] = 9;
            c[i0.hanging.ordinal()] = 10;
            c[i0.textTop.ordinal()] = 11;
            c[i0.beforeEdge.ordinal()] = 12;
            c[i0.textBeforeEdge.ordinal()] = 13;
            c[i0.bottom.ordinal()] = 14;
            c[i0.center.ordinal()] = 15;
            try {
                c[i0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[o0.values().length];
            b = iArr2;
            iArr2[o0.spacing.ordinal()] = 1;
            try {
                b[o0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[m0.values().length];
            a = iArr3;
            iArr3[m0.start.ordinal()] = 1;
            a[m0.middle.ordinal()] = 2;
            try {
                a[m0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public g0(ReactContext reactContext) {
        super(reactContext);
    }

    private void V(Paint paint, h hVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            double d = hVar.n;
            double d2 = hVar.a;
            double d3 = (double) this.u;
            Double.isNaN(d3);
            paint.setLetterSpacing((float) (d / (d2 * d3)));
            if (d == 0.0d && hVar.i == k0.normal) {
                paint.setFontFeatureSettings(C0201.m82(14384) + hVar.g);
            } else {
                paint.setFontFeatureSettings(C0201.m82(14385) + hVar.g);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                paint.setFontVariationSettings(C0201.m82(14386) + hVar.f + hVar.h);
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00d9 */
    private void W(Paint paint, h hVar) {
        int i = 0;
        boolean z = hVar.e == l0.Bold || hVar.f >= 550;
        boolean z2 = hVar.c == j0.italic;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        Typeface typeface = null;
        int i2 = hVar.f;
        String str = hVar.b;
        if (str != null && str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String r7 = C0201.m82(14387);
            sb.append(r7);
            sb.append(str);
            sb.append(C0201.m82(14388));
            String sb2 = sb.toString();
            String str2 = r7 + str + C0201.m82(14389);
            if (Build.VERSION.SDK_INT >= 26) {
                Typeface.Builder builder = new Typeface.Builder(this.J0, sb2);
                StringBuilder sb3 = new StringBuilder();
                String r8 = C0201.m82(14390);
                sb3.append(r8);
                sb3.append(i2);
                sb3.append(hVar.h);
                builder.setFontVariationSettings(sb3.toString());
                builder.setWeight(i2);
                builder.setItalic(z2);
                typeface = builder.build();
                if (typeface == null) {
                    Typeface.Builder builder2 = new Typeface.Builder(this.J0, str2);
                    builder2.setFontVariationSettings(r8 + i2 + hVar.h);
                    builder2.setWeight(i2);
                    builder2.setItalic(z2);
                    typeface = builder2.build();
                }
            } else {
                typeface = Typeface.create(Typeface.createFromAsset(this.J0, sb2), i);
                try {
                    typeface = Typeface.create(Typeface.createFromAsset(this.J0, str2), i);
                } catch (Exception unused) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = i.b().d(str, i, this.J0);
            } catch (Exception unused2) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        double d = hVar.a;
        double d2 = (double) this.u;
        Double.isNaN(d2);
        paint.setTextSize((float) (d * d2));
        if (Build.VERSION.SDK_INT >= 21) {
            paint.setLetterSpacing(0.0f);
        }
    }

    private void X(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        i K = K();
        M();
        h b = K.b();
        TextPaint textPaint = new TextPaint(paint);
        W(textPaint, b);
        V(textPaint, b);
        double c = K.c();
        int i = a.a[b.j.ordinal()];
        if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout a0 = a0(textPaint, alignment, true, new SpannableString(this.F0), (int) v.a(this.t0, (double) canvas.getWidth(), 0.0d, (double) this.u, c));
        int lineAscent = a0.getLineAscent(0);
        double m = K.m();
        double d = (double) lineAscent;
        Double.isNaN(d);
        L();
        canvas.save();
        canvas.translate((float) K.l(0.0d), (float) (m + d));
        a0.draw(canvas);
        canvas.restore();
    }

    private double Y(b0 b0Var, double d, double d2) {
        return v.a(b0Var, d, 0.0d, (double) this.u, d2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0294  */
    private Path Z(String str, Paint paint, Canvas canvas) {
        boolean z;
        PathMeasure pathMeasure;
        double d;
        j jVar;
        float[] fArr;
        boolean[] zArr;
        i iVar;
        boolean z2;
        int i;
        double d2;
        double d3;
        double d4;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        String str2;
        boolean z5;
        int i4;
        double d5;
        double d6;
        i iVar2;
        double d7;
        double d8;
        double d9;
        PathMeasure pathMeasure2;
        int i5;
        double d10;
        Matrix matrix;
        float[] fArr2;
        int i6;
        Paint paint2;
        g0 g0Var;
        j jVar2;
        int i7;
        float[] fArr3;
        Path path;
        double d11;
        char c;
        PathMeasure pathMeasure3;
        double d12;
        String str3;
        Path path2;
        j jVar3;
        int i8;
        double d13;
        int i9;
        int hashCode;
        char c2;
        double d14;
        g0 g0Var2 = this;
        Paint paint3 = paint;
        int length = str.length();
        Path path3 = new Path();
        g0Var2.H0.clear();
        g0Var2.I0.clear();
        if (length == 0) {
            return path3;
        }
        boolean z6 = g0Var2.G0 != null;
        if (z6) {
            PathMeasure pathMeasure4 = new PathMeasure(g0Var2.G0.Y(canvas, paint3), false);
            double length2 = (double) pathMeasure4.getLength();
            boolean isClosed = pathMeasure4.isClosed();
            if (length2 == 0.0d) {
                return path3;
            }
            pathMeasure = pathMeasure4;
            d = length2;
            z = isClosed;
        } else {
            pathMeasure = null;
            d = 0.0d;
            z = false;
        }
        i K = K();
        h b = K.b();
        g0Var2.W(paint3, b);
        j jVar4 = new j(paint3);
        boolean[] zArr2 = new boolean[length];
        char[] charArray = str.toCharArray();
        Path path4 = path3;
        double d15 = b.l;
        double d16 = b.m;
        double d17 = b.n;
        boolean z7 = !b.o;
        boolean z8 = d17 == 0.0d && b.i == k0.normal;
        if (Build.VERSION.SDK_INT >= 21) {
            if (z8) {
                paint3.setFontFeatureSettings(C0201.m82(14391) + b.g);
            } else {
                paint3.setFontFeatureSettings(C0201.m82(14392) + b.g);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                paint3.setFontVariationSettings(C0201.m82(14393) + b.f + b.h);
            }
        }
        ReadableMap readableMap = b.d;
        float[] fArr4 = new float[length];
        paint3.getTextWidths(str, fArr4);
        m0 m0Var = b.j;
        PathMeasure pathMeasure5 = pathMeasure;
        double d18 = d17;
        double S = T().S(paint3);
        double b0 = g0Var2.b0(m0Var, S);
        double c3 = K.c();
        if (z6) {
            boolean z9 = g0Var2.G0.V() == q0.sharp;
            int i10 = g0Var2.G0.W() == r0.right ? -1 : 1;
            zArr = zArr2;
            fArr = fArr4;
            iVar = K;
            jVar = jVar4;
            double Y = Y(g0Var2.G0.X(), d, c3);
            b0 += Y;
            if (z) {
                d3 = Y + (m0Var == m0.middle ? -(d / 2.0d) : 0.0d);
                d2 = d3 + d;
            } else {
                d2 = d;
                d3 = 0.0d;
            }
            i = i10;
            z2 = z9;
        } else {
            zArr = zArr2;
            fArr = fArr4;
            iVar = K;
            jVar = jVar4;
            d2 = d;
            d3 = 0.0d;
            i = 1;
            z2 = false;
        }
        double d19 = 1.0d;
        b0 b0Var = g0Var2.u0;
        double d20 = d;
        if (b0Var != null) {
            z3 = z2;
            d4 = d3;
            double a2 = v.a(b0Var, (double) canvas.getWidth(), 0.0d, (double) g0Var2.u, c3);
            if (a2 < 0.0d) {
                throw new IllegalArgumentException(C0201.m82(14394));
            } else if (a.b[g0Var2.w0.ordinal()] != 2) {
                double d21 = (double) (length - 1);
                Double.isNaN(d21);
                d18 += (a2 - S) / d21;
            } else {
                d19 = a2 / S;
            }
        } else {
            d4 = d3;
            z3 = z2;
        }
        double d22 = (double) i;
        Double.isNaN(d22);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        double d23 = (double) fontMetrics.descent;
        float f = fontMetrics.leading;
        double d24 = d19 * d22;
        double d25 = (double) f;
        Double.isNaN(d23);
        Double.isNaN(d25);
        double d26 = d25 + d23;
        int i11 = i;
        double d27 = (double) ((-fontMetrics.ascent) + f);
        double d28 = (double) (-fontMetrics.top);
        Double.isNaN(d28);
        double d29 = d28 + d26;
        String Q = Q();
        i0 P = P();
        if (P != null) {
            switch (a.c[P.ordinal()]) {
                case 2:
                case 3:
                case 4:
                    Double.isNaN(d23);
                    d26 = -d23;
                    break;
                case 6:
                    Double.isNaN(d23);
                    d26 = -d23;
                    break;
                case 7:
                    Rect rect = new Rect();
                    paint3.getTextBounds(C0201.m82(14395), 0, 1, rect);
                    double height = (double) rect.height();
                    Double.isNaN(height);
                    d26 = height / 2.0d;
                    break;
                case 8:
                    Double.isNaN(d27);
                    Double.isNaN(d23);
                    d26 = (d27 - d23) / 2.0d;
                    break;
                case 9:
                    d14 = 0.5d;
                    Double.isNaN(d27);
                    d26 = d27 * d14;
                    break;
                case 10:
                    d14 = 0.8d;
                    Double.isNaN(d27);
                    d26 = d27 * d14;
                    break;
                case 11:
                case 12:
                case 13:
                    d26 = d27;
                    break;
                case 15:
                    d26 = d29 / 2.0d;
                    break;
                case 16:
                    d26 = d28;
                    break;
            }
            if (!(Q == null || Q.isEmpty() || (i9 = a.c[P.ordinal()]) == 14 || i9 == 16)) {
                hashCode = Q.hashCode();
                if (hashCode == -1720785339) {
                    if (hashCode != 114240) {
                        if (hashCode == 109801339 && Q.equals(C0201.m82(14396))) {
                            c2 = 1;
                            String r3 = C0201.m82(14399);
                            String r5 = C0201.m82(14400);
                            String r7 = C0201.m82(14401);
                            if (c2 != 0) {
                                if (c2 != 1) {
                                    if (c2 != 2) {
                                        float f2 = g0Var2.u;
                                        double d30 = (double) f2;
                                        Double.isNaN(d30);
                                        d26 -= v.b(Q, d30 * c3, (double) f2, c3);
                                    }
                                } else if (readableMap != null && readableMap.hasKey(r7) && readableMap.hasKey(r5)) {
                                    int i12 = readableMap.getInt(r5);
                                    ReadableMap map = readableMap.getMap(r7);
                                    if (map.hasKey(r3)) {
                                        ReadableMap map2 = map.getMap(r3);
                                        String r52 = C0201.m82(14402);
                                        if (map2.hasKey(r52)) {
                                            double d31 = map2.getDouble(r52);
                                            double d32 = (double) g0Var2.u;
                                            Double.isNaN(d32);
                                            double d33 = (double) i12;
                                            Double.isNaN(d33);
                                            d26 -= ((d32 * c3) * d31) / d33;
                                        }
                                    }
                                }
                            } else if (readableMap != null && readableMap.hasKey(r7) && readableMap.hasKey(r5)) {
                                int i13 = readableMap.getInt(r5);
                                ReadableMap map3 = readableMap.getMap(r7);
                                if (map3.hasKey(r3)) {
                                    ReadableMap map4 = map3.getMap(r3);
                                    String r4 = C0201.m82(14403);
                                    if (map4.hasKey(r4)) {
                                        double d34 = map4.getDouble(r4);
                                        double d35 = (double) g0Var2.u;
                                        Double.isNaN(d35);
                                        double d36 = (double) i13;
                                        Double.isNaN(d36);
                                        d26 += ((d35 * c3) * d34) / d36;
                                    }
                                }
                            }
                        }
                    } else if (Q.equals(C0201.m82(14397))) {
                        c2 = 0;
                        String r32 = C0201.m82(14399);
                        String r53 = C0201.m82(14400);
                        String r72 = C0201.m82(14401);
                        if (c2 != 0) {
                        }
                    }
                } else if (Q.equals(C0201.m82(14398))) {
                    c2 = 2;
                    String r322 = C0201.m82(14399);
                    String r532 = C0201.m82(14400);
                    String r722 = C0201.m82(14401);
                    if (c2 != 0) {
                    }
                }
                c2 = 65535;
                String r3222 = C0201.m82(14399);
                String r5322 = C0201.m82(14400);
                String r7222 = C0201.m82(14401);
                if (c2 != 0) {
                }
            }
            double d37 = d26;
            Matrix matrix2 = new Matrix();
            Matrix matrix3 = new Matrix();
            Matrix matrix4 = new Matrix();
            float[] fArr5 = new float[9];
            float[] fArr6 = new float[9];
            i2 = 0;
            while (i2 < length) {
                char c4 = charArray[i2];
                String valueOf = String.valueOf(c4);
                boolean z10 = zArr[i2];
                if (z10) {
                    str2 = C0201.m82(14404);
                    i3 = length;
                    z4 = false;
                } else {
                    String str4 = valueOf;
                    int i14 = i2;
                    z4 = false;
                    while (true) {
                        int i15 = i14 + 1;
                        if (i15 >= length || fArr[i15] > 0.0f) {
                            i3 = length;
                            str2 = str4;
                        } else {
                            str4 = str4 + charArray[i15];
                            zArr[i15] = true;
                            i14 = i15;
                            length = length;
                            z4 = true;
                        }
                    }
                    i3 = length;
                    str2 = str4;
                }
                double measureText = (double) paint3.measureText(str2);
                Double.isNaN(measureText);
                double d38 = measureText * d19;
                if (z7) {
                    z5 = z4;
                    i4 = i2;
                    double d39 = (double) fArr[i2];
                    Double.isNaN(d39);
                    d15 = (d39 * d19) - d38;
                } else {
                    z5 = z4;
                    i4 = i2;
                }
                boolean z11 = c4 == ' ';
                double d40 = (z11 ? d16 : 0.0d) + d18 + d38;
                if (z10) {
                    d5 = d37;
                    d6 = 0.0d;
                } else {
                    d5 = d37;
                    d6 = d15 + d40;
                }
                double l = iVar.l(d6);
                float[] fArr7 = fArr5;
                double m = iVar.m();
                double i16 = iVar.i();
                double j = iVar.j();
                double k = iVar.k();
                if (!z10 && !z11) {
                    Double.isNaN(d22);
                    Double.isNaN(d22);
                    double d41 = d38 * d22;
                    Double.isNaN(d22);
                    double d42 = (b0 + ((l + i16) * d22)) - (d40 * d22);
                    if (z6) {
                        double d43 = d42 + d41;
                        double d44 = d41 / 2.0d;
                        c = c4;
                        double d45 = d42 + d44;
                        if (d45 <= d2 && d45 >= d4) {
                            iVar2 = iVar;
                            if (z3) {
                                pathMeasure5.getMatrix((float) d45, matrix3, 3);
                                pathMeasure3 = pathMeasure5;
                                d11 = k;
                            } else {
                                pathMeasure3 = pathMeasure5;
                                if (d42 < 0.0d) {
                                    d11 = k;
                                    pathMeasure3.getMatrix(0.0f, matrix2, 3);
                                    matrix2.preTranslate((float) d42, 0.0f);
                                    i8 = 1;
                                } else {
                                    d11 = k;
                                    i8 = 1;
                                    pathMeasure3.getMatrix((float) d42, matrix2, 1);
                                }
                                pathMeasure3.getMatrix((float) d45, matrix3, i8);
                                if (d43 > d20) {
                                    d13 = d20;
                                    pathMeasure3.getMatrix((float) d13, matrix4, 3);
                                    matrix4.preTranslate((float) (d43 - d13), 0.0f);
                                } else {
                                    d13 = d20;
                                    pathMeasure3.getMatrix((float) d43, matrix4, i8);
                                }
                                matrix2.getValues(fArr7);
                                matrix4.getValues(fArr6);
                                double d46 = (double) fArr7[2];
                                d20 = d13;
                                double d47 = (double) fArr7[5];
                                fArr7 = fArr7;
                                double d48 = (double) fArr6[2];
                                double d49 = (double) fArr6[5];
                                Double.isNaN(d48);
                                Double.isNaN(d46);
                                Double.isNaN(d49);
                                Double.isNaN(d47);
                                Double.isNaN(d22);
                                matrix3.preRotate((float) (Math.atan2(d49 - d47, d48 - d46) * 57.29577951308232d * d22));
                            }
                            matrix3.preTranslate((float) (-d44), (float) (j + d5));
                            d12 = d24;
                            i7 = i11;
                            matrix3.preScale((float) d12, (float) i7);
                            matrix3.postTranslate(0.0f, (float) m);
                        }
                    } else {
                        c = c4;
                        d11 = k;
                        iVar2 = iVar;
                        pathMeasure3 = pathMeasure5;
                        d12 = d24;
                        i7 = i11;
                        matrix3.setTranslate((float) d42, (float) (m + j + d5));
                    }
                    matrix3.preRotate((float) d11);
                    if (z5) {
                        path2 = new Path();
                        d7 = d20;
                        pathMeasure2 = pathMeasure3;
                        i5 = i4;
                        fArr2 = fArr6;
                        d9 = d12;
                        d10 = d16;
                        fArr3 = fArr7;
                        matrix = matrix4;
                        d8 = d22;
                        path = path4;
                        i6 = i3;
                        paint.getTextPath(str2, 0, str2.length(), 0.0f, 0.0f, path2);
                        str3 = str2;
                        jVar3 = jVar;
                    } else {
                        d10 = d16;
                        i6 = i3;
                        str3 = str2;
                        i5 = i4;
                        fArr3 = fArr7;
                        d7 = d20;
                        d9 = d12;
                        pathMeasure2 = pathMeasure3;
                        fArr2 = fArr6;
                        d8 = d22;
                        path = path4;
                        jVar3 = jVar;
                        matrix = matrix4;
                        path2 = jVar3.b(c, str3);
                    }
                    RectF rectF = new RectF();
                    path2.computeBounds(rectF, true);
                    if (rectF.width() == 0.0f) {
                        canvas.save();
                        jVar2 = jVar3;
                        canvas.concat(matrix3);
                        g0Var = this;
                        g0Var.H0.add(str3);
                        g0Var.I0.add(new Matrix(matrix3));
                        paint2 = paint;
                        canvas.drawText(str3, 0.0f, 0.0f, paint2);
                        canvas.restore();
                    } else {
                        g0Var = this;
                        paint2 = paint;
                        jVar2 = jVar3;
                        path2.transform(matrix3);
                        path.addPath(path2);
                    }
                    int i17 = i5 + 1;
                    fArr5 = fArr3;
                    i11 = i7;
                    jVar = jVar2;
                    g0Var2 = g0Var;
                    length = i6;
                    matrix4 = matrix;
                    d16 = d10;
                    pathMeasure5 = pathMeasure2;
                    d20 = d7;
                    path4 = path;
                    i2 = i17;
                    paint3 = paint2;
                    fArr6 = fArr2;
                    d24 = d9;
                    d22 = d8;
                    d37 = d5;
                    iVar = iVar2;
                }
                g0Var = this;
                paint2 = paint;
                iVar2 = iVar;
                d10 = d16;
                pathMeasure2 = pathMeasure5;
                i6 = i3;
                i5 = i4;
                fArr3 = fArr7;
                fArr2 = fArr6;
                d9 = d24;
                jVar2 = jVar;
                d7 = d20;
                i7 = i11;
                d8 = d22;
                path = path4;
                matrix = matrix4;
                int i172 = i5 + 1;
                fArr5 = fArr3;
                i11 = i7;
                jVar = jVar2;
                g0Var2 = g0Var;
                length = i6;
                matrix4 = matrix;
                d16 = d10;
                pathMeasure5 = pathMeasure2;
                d20 = d7;
                path4 = path;
                i2 = i172;
                paint3 = paint2;
                fArr6 = fArr2;
                d24 = d9;
                d22 = d8;
                d37 = d5;
                iVar = iVar2;
            }
            return path4;
        }
        d26 = 0.0d;
        hashCode = Q.hashCode();
        if (hashCode == -1720785339) {
        }
        c2 = 65535;
        String r32222 = C0201.m82(14399);
        String r53222 = C0201.m82(14400);
        String r72222 = C0201.m82(14401);
        if (c2 != 0) {
        }
        double d372 = d26;
        Matrix matrix22 = new Matrix();
        Matrix matrix32 = new Matrix();
        Matrix matrix42 = new Matrix();
        float[] fArr52 = new float[9];
        float[] fArr62 = new float[9];
        i2 = 0;
        while (i2 < length) {
        }
        return path4;
    }

    private StaticLayout a0(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(spannableString, textPaint, i, alignment, 1.0f, 0.0f, z);
        }
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double b0(m0 m0Var, double d) {
        int i = a.a[m0Var.ordinal()];
        if (i == 2) {
            return (-d) / 2.0d;
        }
        if (i != 3) {
            return 0.0d;
        }
        return -d;
    }

    private void c0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == h0.class) {
                this.G0 = (h0) parent;
                return;
            } else if (!(parent instanceof t0)) {
                return;
            }
        }
    }

    public static String d0(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit < runStart) {
                        break;
                    }
                    sb.append(str.charAt(runLimit));
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    @Override // com.horcrux.svg.t0
    public double S(Paint paint) {
        if (!Double.isNaN(this.D0)) {
            return this.D0;
        }
        String str = this.F0;
        double d = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof t0) {
                    d += ((t0) childAt).S(paint);
                }
            }
            this.D0 = d;
            return d;
        } else if (str.length() == 0) {
            this.D0 = 0.0d;
            return 0.0d;
        } else {
            h b = K().b();
            W(paint, b);
            V(paint, b);
            double measureText = (double) paint.measureText(str);
            this.D0 = measureText;
            return measureText;
        }
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.t0
    public void e() {
        this.E0 = null;
        super.e();
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.t0
    public void invalidate() {
        this.E0 = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.t0, com.horcrux.svg.k, com.horcrux.svg.a0
    public void j(Canvas canvas, Paint paint, float f) {
        if (this.F0 != null) {
            b0 b0Var = this.t0;
            if (b0Var == null || b0Var.a == 0.0d) {
                int size = this.H0.size();
                if (size > 0) {
                    W(paint, K().b());
                    for (int i = 0; i < size; i++) {
                        canvas.save();
                        canvas.concat(this.I0.get(i));
                        canvas.drawText(this.H0.get(i), 0.0f, 0.0f, paint);
                        canvas.restore();
                    }
                }
                H(canvas, paint, f);
                return;
            }
            X(canvas, paint);
            return;
        }
        i(canvas, paint);
        G(canvas, paint, f);
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.t0, com.horcrux.svg.k
    public Path m(Canvas canvas, Paint paint) {
        Path path = this.E0;
        if (path != null) {
            return path;
        }
        if (this.F0 == null) {
            Path R = R(canvas, paint);
            this.E0 = R;
            return R;
        }
        c0();
        M();
        this.E0 = Z(d0(this.F0), paint, canvas);
        L();
        return this.E0;
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.k, com.horcrux.svg.a0
    public int n(float[] fArr) {
        Region region;
        if (this.F0 == null) {
            return super.n(fArr);
        }
        if (this.G != null && this.i && this.j) {
            float[] fArr2 = new float[2];
            this.g.mapPoints(fArr2, fArr);
            this.h.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            y();
            Region region2 = this.Q;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.S) != null && region.contains(round, round2))) {
                if (getClipPath() == null || this.T.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @xj0(name = "content")
    public void setContent(String str) {
        this.F0 = str;
        invalidate();
    }
}
