package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.wd;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ud  reason: default package */
/* compiled from: CompositionLayer */
public class ud extends td {
    private final RectF A = new RectF();
    private Paint B = new Paint();
    private nb<Float, Float> x;
    private final List<td> y = new ArrayList();
    private final RectF z = new RectF();

    /* renamed from: ud$a */
    /* compiled from: CompositionLayer */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[wd.b.values().length];
            a = iArr;
            iArr[wd.b.ADD.ordinal()] = 1;
            a[wd.b.INVERT.ordinal()] = 2;
        }
    }

    public ud(ga gaVar, wd wdVar, List<wd> list, ea eaVar) {
        super(gaVar, wdVar);
        int i;
        td tdVar;
        pc s = wdVar.s();
        if (s != null) {
            nb<Float, Float> a2 = s.a();
            this.x = a2;
            j(a2);
            this.x.a(this);
        } else {
            this.x = null;
        }
        u0 u0Var = new u0(eaVar.j().size());
        int size = list.size() - 1;
        td tdVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            wd wdVar2 = list.get(size);
            td v = td.v(wdVar2, gaVar, eaVar);
            if (v != null) {
                u0Var.m(v.w().b(), v);
                if (tdVar2 != null) {
                    tdVar2.F(v);
                    tdVar2 = null;
                } else {
                    this.y.add(0, v);
                    int i2 = a.a[wdVar2.f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        tdVar2 = v;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < u0Var.q(); i++) {
            td tdVar3 = (td) u0Var.g(u0Var.l(i));
            if (!(tdVar3 == null || (tdVar = (td) u0Var.g(tdVar3.w().h())) == null)) {
                tdVar3.G(tdVar);
            }
        }
    }

    @Override // defpackage.td
    public void E(jc jcVar, int i, List<jc> list, jc jcVar2) {
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            this.y.get(i2).d(jcVar, i, list, jcVar2);
        }
    }

    @Override // defpackage.td
    public void H(float f) {
        super.H(f);
        if (this.x != null) {
            f = ((this.x.h().floatValue() * this.o.a().h()) - this.o.a().o()) / (this.n.n().e() + 0.01f);
        }
        if (this.x == null) {
            f -= this.o.p();
        }
        if (this.o.t() != 0.0f) {
            f /= this.o.t();
        }
        for (int size = this.y.size() - 1; size >= 0; size--) {
            this.y.get(size).H(f);
        }
    }

    @Override // defpackage.td, defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z2) {
        super.e(rectF, matrix, z2);
        for (int size = this.y.size() - 1; size >= 0; size--) {
            this.z.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.y.get(size).e(this.z, this.m, true);
            rectF.union(this.z);
        }
    }

    @Override // defpackage.td, defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        super.h(t, dgVar);
        if (t != la.A) {
            return;
        }
        if (dgVar == null) {
            nb<Float, Float> nbVar = this.x;
            if (nbVar != null) {
                nbVar.m(null);
                return;
            }
            return;
        }
        cc ccVar = new cc(dgVar);
        this.x = ccVar;
        ccVar.a(this);
        j(this.x);
    }

    @Override // defpackage.td
    public void u(Canvas canvas, Matrix matrix, int i) {
        String r0 = C0201.m82(9951);
        ca.a(r0);
        this.A.set(0.0f, 0.0f, (float) this.o.j(), (float) this.o.i());
        matrix.mapRect(this.A);
        boolean z2 = this.n.G() && this.y.size() > 1 && i != 255;
        if (z2) {
            this.B.setAlpha(i);
            ag.m(canvas, this.A, this.B);
        } else {
            canvas.save();
        }
        if (z2) {
            i = 255;
        }
        for (int size = this.y.size() - 1; size >= 0; size--) {
            if (!this.A.isEmpty() ? canvas.clipRect(this.A) : true) {
                this.y.get(size).g(canvas, matrix, i);
            }
        }
        canvas.restore();
        ca.b(r0);
    }
}
