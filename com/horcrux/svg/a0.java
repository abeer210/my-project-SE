package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* compiled from: RenderableView */
public abstract class a0 extends w0 {
    public static a0 p0;
    private static final Pattern q0 = Pattern.compile(C0201.m82(37896));
    public int W = 0;
    public ReadableArray a0;
    public b0[] b0;
    public b0 c0 = new b0(1.0d);
    public float d0 = 1.0f;
    public float e0 = 4.0f;
    public float f0 = 0.0f;
    public Paint.Cap g0 = Paint.Cap.ROUND;
    public Paint.Join h0 = Paint.Join.ROUND;
    public ReadableArray i0;
    public float j0 = 1.0f;
    public Path.FillType k0 = Path.FillType.WINDING;
    private ArrayList<String> l0;
    private ArrayList<Object> m0;
    private ArrayList<String> n0;
    private ArrayList<String> o0;

    /* access modifiers changed from: package-private */
    /* compiled from: RenderableView */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[x.values().length];
            a = iArr;
            iArr[x.kStartMarker.ordinal()] = 1;
            a[x.kMidMarker.ordinal()] = 2;
            try {
                a[x.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public a0(ReactContext reactContext) {
        super(reactContext);
    }

    private static double C(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        return d;
    }

    private boolean D(Paint paint, float f) {
        ReadableArray readableArray = this.i0;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        E(paint, f, this.i0);
        return true;
    }

    private void E(Paint paint, float f, ReadableArray readableArray) {
        double d;
        ReadableArray readableArray2;
        a0 a0Var;
        ReadableArray readableArray3;
        int i = readableArray.getInt(0);
        if (i != 0) {
            if (i == 1) {
                a o = getSvgView().o(readableArray.getString(1));
                if (o != null) {
                    o.i(paint, this.L, this.u, f);
                }
            } else if (i == 2) {
                paint.setColor(getSvgView().y);
            } else if (i == 3) {
                a0 a0Var2 = p0;
                if (a0Var2 != null && (readableArray2 = a0Var2.i0) != null) {
                    E(paint, f, readableArray2);
                }
            } else if (i == 4 && (a0Var = p0) != null && (readableArray3 = a0Var.a0) != null) {
                E(paint, f, readableArray3);
            }
        } else if (readableArray.size() == 2) {
            int i2 = readableArray.getInt(1);
            paint.setColor((Math.round(((float) (i2 >>> 24)) * f) << 24) | (i2 & 16777215));
        } else {
            if (readableArray.size() > 4) {
                double d2 = readableArray.getDouble(4);
                double d3 = (double) f;
                Double.isNaN(d3);
                Double.isNaN(d3);
                d = d2 * d3 * 255.0d;
            } else {
                d = (double) (f * 255.0f);
            }
            paint.setARGB((int) d, (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        }
    }

    private boolean F(Paint paint, float f) {
        ReadableArray readableArray;
        paint.reset();
        double q = q(this.c0);
        if (q == 0.0d || (readableArray = this.a0) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.g0);
        paint.setStrokeJoin(this.h0);
        paint.setStrokeMiter(this.e0 * this.u);
        paint.setStrokeWidth((float) q);
        E(paint, f, this.a0);
        b0[] b0VarArr = this.b0;
        if (b0VarArr == null) {
            return true;
        }
        int length = b0VarArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) q(this.b0[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.f0));
        return true;
    }

    private ArrayList<String> getAttributeList() {
        return this.o0;
    }

    private boolean x(String str) {
        ArrayList<String> arrayList = this.o0;
        return arrayList != null && arrayList.contains(str);
    }

    public void A(Canvas canvas, Paint paint, float f) {
        o oVar = (o) getSvgView().q(this.o);
        o oVar2 = (o) getSvgView().q(this.p);
        o oVar3 = (o) getSvgView().q(this.q);
        if (this.U == null) {
            return;
        }
        if (oVar != null || oVar2 != null || oVar3 != null) {
            p0 = this;
            ArrayList<w> h = w.h(this.U);
            b0 b0Var = this.c0;
            float q = (float) (b0Var != null ? q(b0Var) : 1.0d);
            this.J = new Path();
            Iterator<w> it = h.iterator();
            while (it.hasNext()) {
                w next = it.next();
                int i = a.a[next.a.ordinal()];
                o oVar4 = i != 1 ? i != 2 ? i != 3 ? null : oVar3 : oVar2 : oVar;
                if (oVar4 != null) {
                    oVar4.P(canvas, paint, f, next, q);
                    this.J.addPath(oVar4.m(canvas, paint), oVar4.F0);
                }
            }
            p0 = null;
        }
    }

    public void B() {
        ArrayList<String> arrayList = this.l0;
        if (arrayList != null && this.m0 != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    getClass().getField(this.l0.get(size)).set(this, this.m0.get(size));
                }
                this.l0 = null;
                this.m0 = null;
                this.o0 = this.n0;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.horcrux.svg.w0
    public void j(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.b;
        if (f2 > 0.01f) {
            boolean z = false;
            boolean z2 = this.G == null;
            if (z2) {
                Path m = m(canvas, paint);
                this.G = m;
                m.setFillType(this.k0);
            }
            if (this.W == 1) {
                z = true;
            }
            Path path = this.G;
            if (z) {
                path = new Path();
                this.G.transform(this.c, path);
                canvas.setMatrix(null);
            }
            if (z2 || path != this.G) {
                RectF rectF = new RectF();
                this.L = rectF;
                path.computeBounds(rectF, true);
            }
            RectF rectF2 = new RectF(this.L);
            this.c.mapRect(rectF2);
            setClientRect(rectF2);
            i(canvas, paint);
            if (D(paint, this.j0 * f2)) {
                if (z2) {
                    Path path2 = new Path();
                    this.H = path2;
                    paint.getFillPath(path, path2);
                }
                canvas.drawPath(path, paint);
            }
            if (F(paint, this.d0 * f2)) {
                if (z2) {
                    Path path3 = new Path();
                    this.I = path3;
                    paint.getFillPath(path, path3);
                }
                canvas.drawPath(path, paint);
            }
            A(canvas, paint, f2);
        }
    }

    @Override // com.horcrux.svg.w0
    public int n(float[] fArr) {
        Region region;
        Region region2;
        if (this.G != null && this.i && this.j) {
            float[] fArr2 = new float[2];
            this.g.mapPoints(fArr2, fArr);
            this.h.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            y();
            Region region3 = this.Q;
            if ((region3 != null && region3.contains(round, round2)) || ((region = this.S) != null && (region.contains(round, round2) || ((region2 = this.R) != null && region2.contains(round, round2))))) {
                if (getClipPath() == null || this.T.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.w0
    public void s(Canvas canvas, Paint paint, float f) {
        p pVar = this.n != null ? (p) getSvgView().r(this.n) : null;
        if (pVar != null) {
            Rect clipBounds = canvas.getClipBounds();
            int height = clipBounds.height();
            int width = clipBounds.width();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Canvas canvas3 = new Canvas(createBitmap);
            Canvas canvas4 = new Canvas(createBitmap3);
            canvas3.clipRect((float) r(pVar.t0), (float) p(pVar.u0), (float) r(pVar.v0), (float) p(pVar.w0));
            Paint paint2 = new Paint(1);
            pVar.j(canvas3, paint2, 1.0f);
            int i = width * height;
            int[] iArr = new int[i];
            createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i2 = 0;
            while (i2 < i) {
                int i3 = iArr[i2];
                double d = (double) ((i3 >> 16) & 255);
                Double.isNaN(d);
                double d2 = (double) ((i3 >> 8) & 255);
                Double.isNaN(d2);
                double d3 = (double) (i3 & 255);
                Double.isNaN(d3);
                double C = C((((d * 0.299d) + (d2 * 0.587d)) + (d3 * 0.144d)) / 255.0d);
                double d4 = (double) (i3 >>> 24);
                Double.isNaN(d4);
                iArr[i2] = ((int) (d4 * C)) << 24;
                i2++;
                i = i;
                paint2 = paint2;
            }
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            j(canvas2, paint, f);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas4.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
            canvas4.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
            canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, paint);
            return;
        }
        j(canvas, paint, f);
    }

    @xj0(name = "fill")
    public void setFill(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.i0 = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Array)) {
            this.i0 = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            int i = 0;
            javaOnlyArray.pushInt(0);
            Matcher matcher = q0.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i = i2;
            }
            this.i0 = javaOnlyArray;
        }
        invalidate();
    }

    @xj0(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(float f) {
        this.j0 = f;
        invalidate();
    }

    @xj0(defaultInt = 1, name = "fillRule")
    public void setFillRule(int i) {
        if (i == 0) {
            this.k0 = Path.FillType.EVEN_ODD;
        } else if (i != 1) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(37897) + i + C0201.m82(37898));
        }
        invalidate();
    }

    public void setId(int i) {
        super.setId(i);
        RenderableViewManager.setRenderableView(i, this);
    }

    @xj0(name = "propList")
    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.o0 = arrayList;
            this.n0 = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.n0.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    @xj0(name = "stroke")
    public void setStroke(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.a0 = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Array)) {
            this.a0 = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = q0.matcher(dynamic.asString());
            while (matcher.find()) {
                javaOnlyArray.pushDouble(Double.parseDouble(matcher.group()));
            }
            this.a0 = javaOnlyArray;
        }
        invalidate();
    }

    @xj0(name = "strokeDasharray")
    public void setStrokeDasharray(ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.b0 = new b0[size];
            for (int i = 0; i < size; i++) {
                this.b0[i] = b0.b(readableArray.getDynamic(i));
            }
        } else {
            this.b0 = null;
        }
        invalidate();
    }

    @xj0(name = "strokeDashoffset")
    public void setStrokeDashoffset(float f) {
        this.f0 = f * this.u;
        invalidate();
    }

    @xj0(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(int i) {
        if (i == 0) {
            this.g0 = Paint.Cap.BUTT;
        } else if (i == 1) {
            this.g0 = Paint.Cap.ROUND;
        } else if (i == 2) {
            this.g0 = Paint.Cap.SQUARE;
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(37899) + i + C0201.m82(37900));
        }
        invalidate();
    }

    @xj0(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(int i) {
        if (i == 0) {
            this.h0 = Paint.Join.MITER;
        } else if (i == 1) {
            this.h0 = Paint.Join.ROUND;
        } else if (i == 2) {
            this.h0 = Paint.Join.BEVEL;
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(37901) + i + C0201.m82(37902));
        }
        invalidate();
    }

    @xj0(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(float f) {
        this.e0 = f;
        invalidate();
    }

    @xj0(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(float f) {
        this.d0 = f;
        invalidate();
    }

    @xj0(name = "strokeWidth")
    public void setStrokeWidth(Dynamic dynamic) {
        this.c0 = b0.b(dynamic);
        invalidate();
    }

    @xj0(name = "vectorEffect")
    public void setVectorEffect(int i) {
        this.W = i;
        invalidate();
    }

    public Region w(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom)));
        return region;
    }

    public void y() {
        if (this.Q == null && this.H != null) {
            RectF rectF = new RectF();
            this.M = rectF;
            this.H.computeBounds(rectF, true);
            this.Q = w(this.H, this.M);
        }
        if (this.Q == null && this.G != null) {
            RectF rectF2 = new RectF();
            this.M = rectF2;
            this.G.computeBounds(rectF2, true);
            this.Q = w(this.G, this.M);
        }
        if (this.S == null && this.I != null) {
            RectF rectF3 = new RectF();
            this.N = rectF3;
            this.I.computeBounds(rectF3, true);
            this.S = w(this.I, this.N);
        }
        if (this.R == null && this.J != null) {
            RectF rectF4 = new RectF();
            this.O = rectF4;
            this.J.computeBounds(rectF4, true);
            this.R = w(this.J, this.O);
        }
        Path clipPath = getClipPath();
        if (clipPath != null && this.K != clipPath) {
            this.K = clipPath;
            RectF rectF5 = new RectF();
            this.P = rectF5;
            clipPath.computeBounds(rectF5, true);
            this.T = w(clipPath, this.P);
        }
    }

    public void z(a0 a0Var) {
        ArrayList<String> attributeList = a0Var.getAttributeList();
        if (!(attributeList == null || attributeList.size() == 0)) {
            this.m0 = new ArrayList<>();
            this.o0 = this.n0 == null ? new ArrayList<>() : new ArrayList<>(this.n0);
            int size = attributeList.size();
            for (int i = 0; i < size; i++) {
                try {
                    String str = attributeList.get(i);
                    Field field = getClass().getField(str);
                    Object obj = field.get(a0Var);
                    this.m0.add(field.get(this));
                    if (!x(str)) {
                        this.o0.add(str);
                        field.set(this, obj);
                    }
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            this.l0 = attributeList;
        }
    }
}
