package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import defpackage.id;
import defpackage.nb;
import defpackage.wd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: td  reason: default package */
/* compiled from: BaseLayer */
public abstract class td implements ya, nb.b, kc {
    private final Path a = new Path();
    private final Matrix b = new Matrix();
    private final Paint c = new ta(1);
    private final Paint d = new ta(1, PorterDuff.Mode.DST_IN);
    private final Paint e = new ta(1, PorterDuff.Mode.DST_OUT);
    private final Paint f = new ta(1);
    private final Paint g = new ta(PorterDuff.Mode.CLEAR);
    private final RectF h = new RectF();
    private final RectF i = new RectF();
    private final RectF j = new RectF();
    private final RectF k = new RectF();
    private final String l;
    public final Matrix m = new Matrix();
    public final ga n;
    public final wd o;
    private tb p;
    private pb q;
    private td r;
    private td s;
    private List<td> t;
    private final List<nb<?, ?>> u = new ArrayList();
    public final bc v;
    private boolean w = true;

    /* access modifiers changed from: package-private */
    /* renamed from: td$a */
    /* compiled from: BaseLayer */
    public class a implements nb.b {
        public a() {
        }

        @Override // defpackage.nb.b
        public void b() {
            td tdVar = td.this;
            tdVar.I(tdVar.q.o() == 1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: td$b */
    /* compiled from: BaseLayer */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            int[] iArr = new int[id.a.values().length];
            b = iArr;
            try {
                iArr[id.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[id.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[id.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[id.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[wd.a.values().length];
            a = iArr2;
            iArr2[wd.a.SHAPE.ordinal()] = 1;
            a[wd.a.PRE_COMP.ordinal()] = 2;
            a[wd.a.SOLID.ordinal()] = 3;
            a[wd.a.IMAGE.ordinal()] = 4;
            a[wd.a.NULL.ordinal()] = 5;
            a[wd.a.TEXT.ordinal()] = 6;
            try {
                a[wd.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public td(ga gaVar, wd wdVar) {
        this.n = gaVar;
        this.o = wdVar;
        this.l = wdVar.g() + C0201.m82(7737);
        if (wdVar.f() == wd.b.INVERT) {
            this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        bc b2 = wdVar.u().b();
        this.v = b2;
        b2.b(this);
        if (wdVar.e() != null && !wdVar.e().isEmpty()) {
            tb tbVar = new tb(wdVar.e());
            this.p = tbVar;
            for (nb<nd, Path> nbVar : tbVar.a()) {
                nbVar.a(this);
            }
            for (nb<Integer, Integer> nbVar2 : this.p.c()) {
                j(nbVar2);
                nbVar2.a(this);
            }
        }
        J();
    }

    private void A(RectF rectF, Matrix matrix) {
        if (y() && this.o.f() != wd.b.INVERT) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.r.e(this.j, matrix, true);
            if (!rectF.intersect(this.j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void B() {
        this.n.invalidateSelf();
    }

    private void C(float f2) {
        this.n.n().m().a(this.o.g(), f2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void I(boolean z) {
        if (z != this.w) {
            this.w = z;
            B();
        }
    }

    private void J() {
        boolean z = true;
        if (!this.o.c().isEmpty()) {
            pb pbVar = new pb(this.o.c());
            this.q = pbVar;
            pbVar.k();
            this.q.a(new a());
            if (((Float) this.q.h()).floatValue() != 1.0f) {
                z = false;
            }
            I(z);
            j(this.q);
            return;
        }
        I(true);
    }

    private void k(Canvas canvas, Matrix matrix, id idVar, nb<nd, Path> nbVar, nb<Integer, Integer> nbVar2) {
        this.a.set(nbVar.h());
        this.a.transform(matrix);
        this.c.setAlpha((int) (((float) nbVar2.h().intValue()) * 2.55f));
        canvas.drawPath(this.a, this.c);
    }

    private void l(Canvas canvas, Matrix matrix, id idVar, nb<nd, Path> nbVar, nb<Integer, Integer> nbVar2) {
        ag.m(canvas, this.h, this.d);
        this.a.set(nbVar.h());
        this.a.transform(matrix);
        this.c.setAlpha((int) (((float) nbVar2.h().intValue()) * 2.55f));
        canvas.drawPath(this.a, this.c);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, id idVar, nb<nd, Path> nbVar, nb<Integer, Integer> nbVar2) {
        ag.m(canvas, this.h, this.c);
        canvas.drawRect(this.h, this.c);
        this.a.set(nbVar.h());
        this.a.transform(matrix);
        this.c.setAlpha((int) (((float) nbVar2.h().intValue()) * 2.55f));
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, id idVar, nb<nd, Path> nbVar, nb<Integer, Integer> nbVar2) {
        ag.m(canvas, this.h, this.d);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (((float) nbVar2.h().intValue()) * 2.55f));
        this.a.set(nbVar.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, id idVar, nb<nd, Path> nbVar, nb<Integer, Integer> nbVar2) {
        ag.m(canvas, this.h, this.e);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (((float) nbVar2.h().intValue()) * 2.55f));
        this.a.set(nbVar.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        String r0 = C0201.m82(7738);
        ca.a(r0);
        ag.n(canvas, this.h, this.d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        ca.b(r0);
        for (int i2 = 0; i2 < this.p.b().size(); i2++) {
            id idVar = this.p.b().get(i2);
            nb<nd, Path> nbVar = this.p.a().get(i2);
            nb<Integer, Integer> nbVar2 = this.p.c().get(i2);
            int i3 = b.b[idVar.a().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    if (i2 == 0) {
                        this.c.setColor(-16777216);
                        this.c.setAlpha(255);
                        canvas.drawRect(this.h, this.c);
                    }
                    if (idVar.d()) {
                        o(canvas, matrix, idVar, nbVar, nbVar2);
                    } else {
                        q(canvas, matrix, idVar, nbVar, nbVar2);
                    }
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        if (idVar.d()) {
                            m(canvas, matrix, idVar, nbVar, nbVar2);
                        } else {
                            k(canvas, matrix, idVar, nbVar, nbVar2);
                        }
                    }
                } else if (idVar.d()) {
                    n(canvas, matrix, idVar, nbVar, nbVar2);
                } else {
                    l(canvas, matrix, idVar, nbVar, nbVar2);
                }
            } else if (r()) {
                this.c.setAlpha(255);
                canvas.drawRect(this.h, this.c);
            }
        }
        String r10 = C0201.m82(7739);
        ca.a(r10);
        canvas.restore();
        ca.b(r10);
    }

    private void q(Canvas canvas, Matrix matrix, id idVar, nb<nd, Path> nbVar, nb<Integer, Integer> nbVar2) {
        this.a.set(nbVar.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
    }

    private boolean r() {
        if (this.p.a().isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < this.p.b().size(); i2++) {
            if (this.p.b().get(i2).a() != id.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.t == null) {
            if (this.s == null) {
                this.t = Collections.emptyList();
                return;
            }
            this.t = new ArrayList();
            for (td tdVar = this.s; tdVar != null; tdVar = tdVar.s) {
                this.t.add(tdVar);
            }
        }
    }

    private void t(Canvas canvas) {
        String r0 = C0201.m82(7740);
        ca.a(r0);
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.g);
        ca.b(r0);
    }

    public static td v(wd wdVar, ga gaVar, ea eaVar) {
        switch (b.a[wdVar.d().ordinal()]) {
            case 1:
                return new yd(gaVar, wdVar);
            case 2:
                return new ud(gaVar, wdVar, eaVar.n(wdVar.k()), eaVar);
            case 3:
                return new zd(gaVar, wdVar);
            case 4:
                return new vd(gaVar, wdVar);
            case 5:
                return new xd(gaVar, wdVar);
            case 6:
                return new ae(gaVar, wdVar);
            default:
                wf.c(C0201.m82(7741) + wdVar.d());
                return null;
        }
    }

    private void z(RectF rectF, Matrix matrix) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (x()) {
            int size = this.p.b().size();
            for (int i2 = 0; i2 < size; i2++) {
                id idVar = this.p.b().get(i2);
                this.a.set(this.p.a().get(i2).h());
                this.a.transform(matrix);
                int i3 = b.b[idVar.a().ordinal()];
                if (i3 != 1 && i3 != 2) {
                    if ((i3 != 3 && i3 != 4) || !idVar.d()) {
                        this.a.computeBounds(this.k, false);
                        if (i2 == 0) {
                            this.i.set(this.k);
                        } else {
                            RectF rectF2 = this.i;
                            rectF2.set(Math.min(rectF2.left, this.k.left), Math.min(this.i.top, this.k.top), Math.max(this.i.right, this.k.right), Math.max(this.i.bottom, this.k.bottom));
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.i)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    public void D(nb<?, ?> nbVar) {
        this.u.remove(nbVar);
    }

    public void E(jc jcVar, int i2, List<jc> list, jc jcVar2) {
    }

    public void F(td tdVar) {
        this.r = tdVar;
    }

    public void G(td tdVar) {
        this.s = tdVar;
    }

    public void H(float f2) {
        this.v.j(f2);
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.a().size(); i2++) {
                this.p.a().get(i2).l(f2);
            }
        }
        if (this.o.t() != 0.0f) {
            f2 /= this.o.t();
        }
        pb pbVar = this.q;
        if (pbVar != null) {
            pbVar.l(f2 / this.o.t());
        }
        td tdVar = this.r;
        if (tdVar != null) {
            this.r.H(tdVar.o.t() * f2);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            this.u.get(i3).l(f2);
        }
    }

    @Override // defpackage.nb.b
    public void b() {
        B();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        if (jcVar.g(getName(), i2)) {
            if (!C0201.m82(7742).equals(getName())) {
                jcVar2 = jcVar2.a(getName());
                if (jcVar.c(getName(), i2)) {
                    list.add(jcVar2.i(this));
                }
            }
            if (jcVar.h(getName(), i2)) {
                E(jcVar, i2 + jcVar.e(getName(), i2), list, jcVar2);
            }
        }
    }

    @Override // defpackage.ya
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.m.set(matrix);
        if (z) {
            List<td> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.m.preConcat(this.t.get(size).v.f());
                }
            } else {
                td tdVar = this.s;
                if (tdVar != null) {
                    this.m.preConcat(tdVar.v.f());
                }
            }
        }
        this.m.preConcat(this.v.f());
    }

    @Override // defpackage.ya
    public void g(Canvas canvas, Matrix matrix, int i2) {
        ca.a(this.l);
        if (!this.w || this.o.v()) {
            ca.b(this.l);
            return;
        }
        s();
        String r0 = C0201.m82(7743);
        ca.a(r0);
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.t.get(size).v.f());
        }
        ca.b(r0);
        int intValue = (int) ((((((float) i2) / 255.0f) * ((float) (this.v.h() == null ? 100 : this.v.h().h().intValue()))) / 100.0f) * 255.0f);
        boolean y = y();
        String r1 = C0201.m82(7744);
        if (y || x()) {
            String r02 = C0201.m82(7745);
            ca.a(r02);
            e(this.h, this.b, false);
            A(this.h, matrix);
            this.b.preConcat(this.v.f());
            z(this.h, this.b);
            if (!this.h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            ca.b(r02);
            if (!this.h.isEmpty()) {
                String r03 = C0201.m82(7746);
                ca.a(r03);
                this.c.setAlpha(255);
                ag.m(canvas, this.h, this.c);
                ca.b(r03);
                t(canvas);
                ca.a(r1);
                u(canvas, this.b, intValue);
                ca.b(r1);
                if (x()) {
                    p(canvas, this.b);
                }
                boolean y2 = y();
                String r2 = C0201.m82(7747);
                if (y2) {
                    String r12 = C0201.m82(7748);
                    ca.a(r12);
                    ca.a(r03);
                    ag.n(canvas, this.h, this.f, 19);
                    ca.b(r03);
                    t(canvas);
                    this.r.g(canvas, matrix, intValue);
                    ca.a(r2);
                    canvas.restore();
                    ca.b(r2);
                    ca.b(r12);
                }
                ca.a(r2);
                canvas.restore();
                ca.b(r2);
            }
            C(ca.b(this.l));
            return;
        }
        this.b.preConcat(this.v.f());
        ca.a(r1);
        u(canvas, this.b, intValue);
        ca.b(r1);
        C(ca.b(this.l));
    }

    @Override // defpackage.wa
    public String getName() {
        return this.o.g();
    }

    @Override // defpackage.kc
    public <T> void h(T t2, dg<T> dgVar) {
        this.v.c(t2, dgVar);
    }

    public void j(nb<?, ?> nbVar) {
        if (nbVar != null) {
            this.u.add(nbVar);
        }
    }

    public abstract void u(Canvas canvas, Matrix matrix, int i2);

    public wd w() {
        return this.o;
    }

    public boolean x() {
        tb tbVar = this.p;
        return tbVar != null && !tbVar.a().isEmpty();
    }

    public boolean y() {
        return this.r != null;
    }
}
