package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.p;
import com.facebook.react.views.view.f;
import com.horcrux.svg.b0;
import java.util.ArrayList;
import vigqyno.C0201;

@SuppressLint({"ViewConstructor"})
/* compiled from: VirtualView */
public abstract class w0 extends f {
    private static final float[] V = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private k A;
    private double B = -1.0d;
    private double C = -1.0d;
    private float D = -1.0f;
    private float E = -1.0f;
    private i F;
    public Path G;
    public Path H;
    public Path I;
    public Path J;
    public Path K;
    public RectF L;
    public RectF M;
    public RectF N;
    public RectF O;
    public RectF P;
    public Region Q;
    public Region R;
    public Region S;
    public Region T;
    public ArrayList<q> U;
    public final ReactContext a;
    public float b = 1.0f;
    public Matrix c = new Matrix();
    public Matrix d = new Matrix();
    public Matrix e = new Matrix();
    public Matrix f = new Matrix();
    public Matrix g = new Matrix();
    public final Matrix h = new Matrix();
    public boolean i = true;
    public boolean j = true;
    private RectF k;
    public int l;
    private String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public final float u;
    private boolean v;
    private boolean w;
    public String x;
    private e0 y;
    private Path z;

    /* access modifiers changed from: package-private */
    /* compiled from: VirtualView */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[b0.b.values().length];
            a = iArr;
            iArr[b0.b.EMS.ordinal()] = 1;
            a[b0.b.EXS.ordinal()] = 2;
            a[b0.b.CM.ordinal()] = 3;
            a[b0.b.MM.ordinal()] = 4;
            a[b0.b.IN.ordinal()] = 5;
            a[b0.b.PT.ordinal()] = 6;
            try {
                a[b0.b.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public w0(ReactContext reactContext) {
        super(reactContext);
        this.a = reactContext;
        this.u = c.e().density;
    }

    private double getCanvasDiagonal() {
        double d2 = this.C;
        if (d2 != -1.0d) {
            return d2;
        }
        double sqrt = Math.sqrt(Math.pow((double) getCanvasWidth(), 2.0d) + Math.pow((double) getCanvasHeight(), 2.0d)) * 0.7071067811865476d;
        this.C = sqrt;
        return sqrt;
    }

    private float getCanvasHeight() {
        float f2 = this.D;
        if (f2 != -1.0f) {
            return f2;
        }
        k textRoot = getTextRoot();
        if (textRoot == null) {
            this.D = (float) getSvgView().getCanvasBounds().height();
        } else {
            this.D = textRoot.I().d();
        }
        return this.D;
    }

    private float getCanvasWidth() {
        float f2 = this.E;
        if (f2 != -1.0f) {
            return f2;
        }
        k textRoot = getTextRoot();
        if (textRoot == null) {
            this.E = (float) getSvgView().getCanvasBounds().width();
        } else {
            this.E = textRoot.I().g();
        }
        return this.E;
    }

    private double getFontSizeFromContext() {
        double d2 = this.B;
        if (d2 != -1.0d) {
            return d2;
        }
        k textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.F == null) {
            this.F = textRoot.I();
        }
        double c2 = this.F.c();
        this.B = c2;
        return c2;
    }

    private void h() {
        w0 w0Var = this;
        while (true) {
            ViewParent parent = w0Var.getParent();
            if (parent instanceof w0) {
                w0Var = (w0) parent;
                if (w0Var.G != null) {
                    w0Var.e();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private double k(b0 b0Var) {
        double d2;
        switch (a.a[b0Var.b.ordinal()]) {
            case 1:
                d2 = getFontSizeFromContext();
                break;
            case 2:
                d2 = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                d2 = 35.43307d;
                break;
            case 4:
                d2 = 3.543307d;
                break;
            case 5:
                d2 = 90.0d;
                break;
            case 6:
                d2 = 1.25d;
                break;
            case 7:
                d2 = 15.0d;
                break;
            default:
                d2 = 1.0d;
                break;
        }
        double d3 = b0Var.a * d2;
        double d4 = (double) this.u;
        Double.isNaN(d4);
        return d3 * d4;
    }

    public void e() {
        this.C = -1.0d;
        this.D = -1.0f;
        this.E = -1.0f;
        this.B = -1.0d;
        this.S = null;
        this.R = null;
        this.Q = null;
        this.G = null;
    }

    public void f() {
        e();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof w0) {
                ((w0) childAt).f();
            }
        }
    }

    public RectF getClientRect() {
        return this.k;
    }

    public Path getClipPath() {
        return this.z;
    }

    public k getParentTextRoot() {
        ViewParent parent = getParent();
        if (!(parent instanceof w0)) {
            return null;
        }
        return ((w0) parent).getTextRoot();
    }

    public e0 getSvgView() {
        e0 e0Var = this.y;
        if (e0Var != null) {
            return e0Var;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof e0) {
            this.y = (e0) parent;
        } else if (parent instanceof w0) {
            this.y = ((w0) parent).getSvgView();
        } else {
            f60.i(C0201.m82(12056), C0201.m82(12054) + getClass().getName() + C0201.m82(12055));
        }
        return this.y;
    }

    public k getTextRoot() {
        if (this.A == null) {
            w0 w0Var = this;
            while (true) {
                if (w0Var == null) {
                    break;
                }
                if (w0Var instanceof k) {
                    k kVar = (k) w0Var;
                    if (kVar.I() != null) {
                        this.A = kVar;
                        break;
                    }
                }
                ViewParent parent = w0Var.getParent();
                if (!(parent instanceof w0)) {
                    w0Var = null;
                } else {
                    w0Var = (w0) parent;
                }
            }
        }
        return this.A;
    }

    public void i(Canvas canvas, Paint paint) {
        Path l2 = l(canvas, paint);
        if (l2 != null) {
            canvas.clipPath(l2);
        }
    }

    public void invalidate() {
        if (!(this instanceof a0) || this.G != null) {
            e();
            h();
            super.invalidate();
        }
    }

    public abstract void j(Canvas canvas, Paint paint, float f2);

    public Path l(Canvas canvas, Paint paint) {
        Path path;
        if (this.m != null) {
            c cVar = (c) getSvgView().p(this.m);
            String r1 = C0201.m82(12057);
            if (cVar != null) {
                if (cVar.l == 0) {
                    path = cVar.m(canvas, paint);
                } else {
                    path = cVar.J(canvas, paint, Region.Op.UNION);
                }
                path.transform(cVar.d);
                path.transform(cVar.e);
                int i2 = cVar.l;
                if (i2 == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i2 != 1) {
                    f60.A(r1, C0201.m82(12058) + this.l + C0201.m82(12059));
                }
                this.z = path;
            } else {
                f60.A(r1, C0201.m82(12060) + this.m);
            }
        }
        return getClipPath();
    }

    public abstract Path m(Canvas canvas, Paint paint);

    public abstract int n(float[] fArr);

    public boolean o() {
        return this.v;
    }

    @Override // com.facebook.react.views.view.f
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        RectF rectF = this.k;
        if (rectF != null) {
            if (!(this instanceof k)) {
                setLeft((int) Math.floor((double) rectF.left));
                setTop((int) Math.floor((double) this.k.top));
                setRight((int) Math.ceil((double) this.k.right));
                setBottom((int) Math.ceil((double) this.k.bottom));
            }
            setMeasuredDimension((int) Math.ceil((double) this.k.width()), (int) Math.ceil((double) this.k.height()));
        }
    }

    @Override // com.facebook.react.views.view.f
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        RectF rectF = this.k;
        if (rectF != null) {
            i4 = (int) Math.ceil((double) rectF.width());
        } else {
            i4 = ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i2);
        }
        RectF rectF2 = this.k;
        if (rectF2 != null) {
            i5 = (int) Math.ceil((double) rectF2.height());
        } else {
            i5 = ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), i3);
        }
        setMeasuredDimension(i4, i5);
    }

    public double p(b0 b0Var) {
        double d2;
        double canvasHeight;
        b0.b bVar = b0Var.b;
        if (bVar == b0.b.NUMBER) {
            d2 = b0Var.a;
            canvasHeight = (double) this.u;
            Double.isNaN(canvasHeight);
        } else if (bVar != b0.b.PERCENTAGE) {
            return k(b0Var);
        } else {
            d2 = b0Var.a / 100.0d;
            canvasHeight = (double) getCanvasHeight();
            Double.isNaN(canvasHeight);
        }
        return d2 * canvasHeight;
    }

    public double q(b0 b0Var) {
        double d2;
        double canvasDiagonal;
        b0.b bVar = b0Var.b;
        if (bVar == b0.b.NUMBER) {
            d2 = b0Var.a;
            canvasDiagonal = (double) this.u;
            Double.isNaN(canvasDiagonal);
        } else if (bVar != b0.b.PERCENTAGE) {
            return k(b0Var);
        } else {
            d2 = b0Var.a / 100.0d;
            canvasDiagonal = getCanvasDiagonal();
        }
        return d2 * canvasDiagonal;
    }

    public double r(b0 b0Var) {
        double d2;
        double canvasWidth;
        b0.b bVar = b0Var.b;
        if (bVar == b0.b.NUMBER) {
            d2 = b0Var.a;
            canvasWidth = (double) this.u;
            Double.isNaN(canvasWidth);
        } else if (bVar != b0.b.PERCENTAGE) {
            return k(b0Var);
        } else {
            d2 = b0Var.a / 100.0d;
            canvasWidth = (double) getCanvasWidth();
            Double.isNaN(canvasWidth);
        }
        return d2 * canvasWidth;
    }

    public void s(Canvas canvas, Paint paint, float f2) {
        j(canvas, paint, f2);
    }

    public void setClientRect(RectF rectF) {
        RectF rectF2 = this.k;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.k = rectF;
            if (rectF == null) {
                return;
            }
            if (this.v || this.w) {
                int floor = (int) Math.floor((double) this.k.left);
                int floor2 = (int) Math.floor((double) this.k.top);
                int ceil = (int) Math.ceil((double) this.k.width());
                int ceil2 = (int) Math.ceil((double) this.k.height());
                if (this.v) {
                    int ceil3 = (int) Math.ceil((double) this.k.right);
                    int ceil4 = (int) Math.ceil((double) this.k.bottom);
                    if (!(this instanceof k)) {
                        setLeft(floor);
                        setTop(floor2);
                        setRight(ceil3);
                        setBottom(ceil4);
                    }
                    setMeasuredDimension(ceil, ceil2);
                }
                if (this.w) {
                    ((UIManagerModule) this.a.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(p.n(getId(), floor, floor2, ceil, ceil2));
                }
            }
        }
    }

    @xj0(name = "clipPath")
    public void setClipPath(String str) {
        this.z = null;
        this.m = str;
        invalidate();
    }

    @xj0(defaultInt = 1, name = "clipRule")
    public void setClipRule(int i2) {
        this.l = i2;
        invalidate();
    }

    @xj0(name = "markerEnd")
    public void setMarkerEnd(String str) {
        this.q = str;
        invalidate();
    }

    @xj0(name = "markerMid")
    public void setMarkerMid(String str) {
        this.p = str;
        invalidate();
    }

    @xj0(name = "markerStart")
    public void setMarkerStart(String str) {
        this.o = str;
        invalidate();
    }

    @xj0(name = "mask")
    public void setMask(String str) {
        this.n = str;
        invalidate();
    }

    @xj0(name = "matrix")
    public void setMatrix(Dynamic dynamic) {
        ReadableType type = dynamic.getType();
        if (dynamic.isNull() || !type.equals(ReadableType.Array)) {
            this.d = null;
            this.g = null;
            this.i = false;
        } else {
            int c2 = v.c(dynamic.asArray(), V, this.u);
            if (c2 == 6) {
                if (this.d == null) {
                    this.d = new Matrix();
                    this.g = new Matrix();
                }
                this.d.setValues(V);
                this.i = this.d.invert(this.g);
            } else if (c2 != -1) {
                f60.A(C0201.m82(12061), C0201.m82(12062));
            }
        }
        super.invalidate();
        h();
    }

    @xj0(name = "name")
    public void setName(String str) {
        this.x = str;
        invalidate();
    }

    @xj0(name = "onLayout")
    public void setOnLayout(boolean z2) {
        this.w = z2;
        invalidate();
    }

    @xj0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f2) {
        this.b = f2;
        invalidate();
    }

    @xj0(name = "responsible")
    public void setResponsible(boolean z2) {
        this.v = z2;
        invalidate();
    }

    public void t(Canvas canvas, int i2) {
        canvas.restoreToCount(i2);
    }

    public int u(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.c.setConcat(this.d, this.e);
        canvas.concat(this.c);
        this.c.preConcat(matrix);
        this.c.invert(this.f);
        return save;
    }

    public void v() {
        if (this.x != null) {
            getSvgView().k(this, this.x);
        }
    }
}
