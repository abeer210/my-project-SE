package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import defpackage.gc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ae  reason: default package */
/* compiled from: TextLayer */
public class ae extends td {
    private final Paint A = new a(this, 1);
    private final Paint B = new b(this, 1);
    private final Map<ic, List<xa>> C = new HashMap();
    private final u0<String> D = new u0<>();
    private final ac E;
    private final ga F;
    private final ea G;
    private nb<Integer, Integer> H;
    private nb<Integer, Integer> I;
    private nb<Integer, Integer> J;
    private nb<Integer, Integer> K;
    private nb<Float, Float> L;
    private nb<Float, Float> M;
    private nb<Float, Float> N;
    private nb<Float, Float> O;
    private nb<Float, Float> P;
    private nb<Float, Float> Q;
    private final StringBuilder x = new StringBuilder(2);
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    /* renamed from: ae$a */
    /* compiled from: TextLayer */
    class a extends Paint {
        public a(ae aeVar, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: ae$b */
    /* compiled from: TextLayer */
    class b extends Paint {
        public b(ae aeVar, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ae$c */
    /* compiled from: TextLayer */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[gc.a.values().length];
            a = iArr;
            iArr[gc.a.LEFT_ALIGN.ordinal()] = 1;
            a[gc.a.RIGHT_ALIGN.ordinal()] = 2;
            try {
                a[gc.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ae(ga gaVar, wd wdVar) {
        super(gaVar, wdVar);
        pc pcVar;
        pc pcVar2;
        oc ocVar;
        oc ocVar2;
        this.F = gaVar;
        this.G = wdVar.a();
        ac d = wdVar.q().a();
        this.E = d;
        d.a(this);
        j(this.E);
        yc r = wdVar.r();
        if (!(r == null || (ocVar2 = r.a) == null)) {
            nb<Integer, Integer> a2 = ocVar2.a();
            this.H = a2;
            a2.a(this);
            j(this.H);
        }
        if (!(r == null || (ocVar = r.b) == null)) {
            nb<Integer, Integer> a3 = ocVar.a();
            this.J = a3;
            a3.a(this);
            j(this.J);
        }
        if (!(r == null || (pcVar2 = r.c) == null)) {
            nb<Float, Float> a4 = pcVar2.a();
            this.L = a4;
            a4.a(this);
            j(this.L);
        }
        if (r != null && (pcVar = r.d) != null) {
            nb<Float, Float> a5 = pcVar.a();
            this.N = a5;
            a5.a(this);
            j(this.N);
        }
    }

    private void K(gc.a aVar, Canvas canvas, float f) {
        int i = c.a[aVar.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private String L(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!X(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.D.d(j)) {
            return this.D.g(j);
        }
        this.x.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.x.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.x.toString();
        this.D.m(j, sb);
        return sb;
    }

    private void M(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    private void N(ic icVar, Matrix matrix, float f, gc gcVar, Canvas canvas) {
        List<xa> U = U(icVar);
        for (int i = 0; i < U.size(); i++) {
            Path a2 = U.get(i).a();
            a2.computeBounds(this.y, false);
            this.z.set(matrix);
            this.z.preTranslate(0.0f, (-gcVar.g) * ag.e());
            this.z.preScale(f, f);
            a2.transform(this.z);
            if (gcVar.k) {
                Q(a2, this.A, canvas);
                Q(a2, this.B, canvas);
            } else {
                Q(a2, this.B, canvas);
                Q(a2, this.A, canvas);
            }
        }
    }

    private void O(String str, gc gcVar, Canvas canvas) {
        if (gcVar.k) {
            M(str, this.A, canvas);
            M(str, this.B, canvas);
            return;
        }
        M(str, this.B, canvas);
        M(str, this.A, canvas);
    }

    private void P(String str, gc gcVar, Canvas canvas, float f) {
        float floatValue;
        int i = 0;
        while (i < str.length()) {
            String L2 = L(str, i);
            i += L2.length();
            O(L2, gcVar, canvas);
            float measureText = this.A.measureText(L2, 0, 1);
            float f2 = ((float) gcVar.e) / 10.0f;
            nb<Float, Float> nbVar = this.O;
            if (nbVar != null) {
                floatValue = nbVar.h().floatValue();
            } else {
                nb<Float, Float> nbVar2 = this.N;
                if (nbVar2 != null) {
                    floatValue = nbVar2.h().floatValue();
                } else {
                    canvas.translate(measureText + (f2 * f), 0.0f);
                }
            }
            f2 += floatValue;
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    private void Q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private void R(String str, gc gcVar, Matrix matrix, hc hcVar, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            ic e = this.G.c().e(ic.c(str.charAt(i), hcVar.a(), hcVar.c()));
            if (e != null) {
                N(e, matrix, f2, gcVar, canvas);
                float b2 = ((float) e.b()) * f2 * ag.e() * f;
                float f3 = ((float) gcVar.e) / 10.0f;
                nb<Float, Float> nbVar = this.O;
                if (nbVar != null) {
                    floatValue = nbVar.h().floatValue();
                } else {
                    nb<Float, Float> nbVar2 = this.N;
                    if (nbVar2 != null) {
                        floatValue = nbVar2.h().floatValue();
                    }
                    canvas.translate(b2 + (f3 * f), 0.0f);
                }
                f3 += floatValue;
                canvas.translate(b2 + (f3 * f), 0.0f);
            }
        }
    }

    private void S(gc gcVar, Matrix matrix, hc hcVar, Canvas canvas) {
        float f;
        nb<Float, Float> nbVar = this.Q;
        if (nbVar != null) {
            f = nbVar.h().floatValue();
        } else {
            nb<Float, Float> nbVar2 = this.P;
            if (nbVar2 != null) {
                f = nbVar2.h().floatValue();
            } else {
                f = gcVar.c;
            }
        }
        float f2 = f / 100.0f;
        float g = ag.g(matrix);
        String str = gcVar.a;
        float e = gcVar.f * ag.e();
        List<String> W = W(str);
        int size = W.size();
        for (int i = 0; i < size; i++) {
            String str2 = W.get(i);
            float V = V(str2, hcVar, f2, g);
            canvas.save();
            K(gcVar.d, canvas, V);
            canvas.translate(0.0f, (((float) i) * e) - ((((float) (size - 1)) * e) / 2.0f));
            R(str2, gcVar, matrix, hcVar, canvas, g, f2);
            canvas.restore();
        }
    }

    private void T(gc gcVar, hc hcVar, Matrix matrix, Canvas canvas) {
        float f;
        float g = ag.g(matrix);
        Typeface E2 = this.F.E(hcVar.a(), hcVar.c());
        if (E2 != null) {
            String str = gcVar.a;
            sa D2 = this.F.D();
            if (D2 == null) {
                this.A.setTypeface(E2);
                nb<Float, Float> nbVar = this.Q;
                if (nbVar != null) {
                    f = nbVar.h().floatValue();
                } else {
                    nb<Float, Float> nbVar2 = this.P;
                    if (nbVar2 != null) {
                        f = nbVar2.h().floatValue();
                    } else {
                        f = gcVar.c;
                    }
                }
                this.A.setTextSize(f * ag.e());
                this.B.setTypeface(this.A.getTypeface());
                this.B.setTextSize(this.A.getTextSize());
                float e = gcVar.f * ag.e();
                List<String> W = W(str);
                int size = W.size();
                for (int i = 0; i < size; i++) {
                    String str2 = W.get(i);
                    K(gcVar.d, canvas, this.B.measureText(str2));
                    canvas.translate(0.0f, (((float) i) * e) - ((((float) (size - 1)) * e) / 2.0f));
                    P(str2, gcVar, canvas, g);
                    canvas.setMatrix(matrix);
                }
                return;
            }
            D2.a(str);
            throw null;
        }
    }

    private List<xa> U(ic icVar) {
        if (this.C.containsKey(icVar)) {
            return this.C.get(icVar);
        }
        List<pd> a2 = icVar.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new xa(this.F, this, a2.get(i)));
        }
        this.C.put(icVar, arrayList);
        return arrayList;
    }

    private float V(String str, hc hcVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            ic e = this.G.c().e(ic.c(str.charAt(i), hcVar.a(), hcVar.c()));
            if (e != null) {
                double d = (double) f3;
                double b2 = e.b();
                double d2 = (double) f;
                Double.isNaN(d2);
                double d3 = b2 * d2;
                double e2 = (double) ag.e();
                Double.isNaN(e2);
                double d4 = d3 * e2;
                double d5 = (double) f2;
                Double.isNaN(d5);
                Double.isNaN(d);
                f3 = (float) (d + (d4 * d5));
            }
        }
        return f3;
    }

    private List<String> W(String str) {
        String r0 = C0201.m82(2931);
        String r1 = C0201.m82(2932);
        return Arrays.asList(str.replaceAll(r0, r1).replaceAll(C0201.m82(2933), r1).split(r1));
    }

    private boolean X(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override // defpackage.td, defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, (float) this.G.b().width(), (float) this.G.b().height());
    }

    @Override // defpackage.td, defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        super.h(t, dgVar);
        if (t == la.a) {
            nb<Integer, Integer> nbVar = this.I;
            if (nbVar != null) {
                D(nbVar);
            }
            if (dgVar == null) {
                this.I = null;
                return;
            }
            cc ccVar = new cc(dgVar);
            this.I = ccVar;
            ccVar.a(this);
            j(this.I);
        } else if (t == la.b) {
            nb<Integer, Integer> nbVar2 = this.K;
            if (nbVar2 != null) {
                D(nbVar2);
            }
            if (dgVar == null) {
                this.K = null;
                return;
            }
            cc ccVar2 = new cc(dgVar);
            this.K = ccVar2;
            ccVar2.a(this);
            j(this.K);
        } else if (t == la.o) {
            nb<Float, Float> nbVar3 = this.M;
            if (nbVar3 != null) {
                D(nbVar3);
            }
            if (dgVar == null) {
                this.M = null;
                return;
            }
            cc ccVar3 = new cc(dgVar);
            this.M = ccVar3;
            ccVar3.a(this);
            j(this.M);
        } else if (t == la.p) {
            nb<Float, Float> nbVar4 = this.O;
            if (nbVar4 != null) {
                D(nbVar4);
            }
            if (dgVar == null) {
                this.O = null;
                return;
            }
            cc ccVar4 = new cc(dgVar);
            this.O = ccVar4;
            ccVar4.a(this);
            j(this.O);
        } else if (t == la.B) {
            nb<Float, Float> nbVar5 = this.Q;
            if (nbVar5 != null) {
                D(nbVar5);
            }
            if (dgVar == null) {
                this.Q = null;
                return;
            }
            cc ccVar5 = new cc(dgVar);
            this.Q = ccVar5;
            ccVar5.a(this);
            j(this.Q);
        }
    }

    @Override // defpackage.td
    public void u(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.F.l0()) {
            canvas.setMatrix(matrix);
        }
        gc gcVar = (gc) this.E.h();
        hc hcVar = this.G.g().get(gcVar.b);
        if (hcVar == null) {
            canvas.restore();
            return;
        }
        nb<Integer, Integer> nbVar = this.I;
        if (nbVar != null) {
            this.A.setColor(nbVar.h().intValue());
        } else {
            nb<Integer, Integer> nbVar2 = this.H;
            if (nbVar2 != null) {
                this.A.setColor(nbVar2.h().intValue());
            } else {
                this.A.setColor(gcVar.h);
            }
        }
        nb<Integer, Integer> nbVar3 = this.K;
        if (nbVar3 != null) {
            this.B.setColor(nbVar3.h().intValue());
        } else {
            nb<Integer, Integer> nbVar4 = this.J;
            if (nbVar4 != null) {
                this.B.setColor(nbVar4.h().intValue());
            } else {
                this.B.setColor(gcVar.i);
            }
        }
        int intValue = ((this.v.h() == null ? 100 : this.v.h().h().intValue()) * 255) / 100;
        this.A.setAlpha(intValue);
        this.B.setAlpha(intValue);
        nb<Float, Float> nbVar5 = this.M;
        if (nbVar5 != null) {
            this.B.setStrokeWidth(nbVar5.h().floatValue());
        } else {
            nb<Float, Float> nbVar6 = this.L;
            if (nbVar6 != null) {
                this.B.setStrokeWidth(nbVar6.h().floatValue());
            } else {
                this.B.setStrokeWidth(gcVar.j * ag.e() * ag.g(matrix));
            }
        }
        if (this.F.l0()) {
            S(gcVar, matrix, hcVar, canvas);
        } else {
            T(gcVar, hcVar, matrix, canvas);
        }
        canvas.restore();
    }
}
