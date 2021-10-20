package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: RequestBuilder */
public class j<TranscodeType> extends vn<j<TranscodeType>> implements Cloneable {
    public static final ao Q = ((ao) ((ao) ((ao) new ao().e(vh.b)).Y(g.LOW)).f0(true));
    private final Context D;
    private final k E;
    private final Class<TranscodeType> F;
    private final e G;
    private l<?, ? super TranscodeType> H;
    private Object I;
    private List<zn<TranscodeType>> J;
    private j<TranscodeType> K;
    private j<TranscodeType> L;
    private Float M;
    private boolean N = true;
    private boolean O;
    private boolean P;

    /* access modifiers changed from: package-private */
    /* compiled from: RequestBuilder */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        }
    }

    @SuppressLint({"CheckResult"})
    public j(c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.E = kVar;
        this.F = cls;
        this.D = context;
        this.H = kVar.p(cls);
        this.G = cVar.i();
        y0(kVar.n());
        a(kVar.o());
    }

    private <Y extends no<TranscodeType>> Y A0(Y y, zn<TranscodeType> znVar, vn<?> vnVar, Executor executor) {
        ep.d(y);
        if (this.O) {
            xn p0 = p0(y, znVar, vnVar, executor);
            xn f = y.f();
            if (!p0.e(f) || D0(vnVar, f)) {
                this.E.m(y);
                y.c(p0);
                this.E.w(y, p0);
                return y;
            }
            ep.d(f);
            if (!f.isRunning()) {
                f.d();
            }
            return y;
        }
        throw new IllegalArgumentException(C0201.m82(5335));
    }

    private boolean D0(vn<?> vnVar, xn xnVar) {
        return !vnVar.F() && xnVar.k();
    }

    private j<TranscodeType> I0(Object obj) {
        this.I = obj;
        this.O = true;
        return this;
    }

    private xn J0(Object obj, no<TranscodeType> noVar, zn<TranscodeType> znVar, vn<?> vnVar, yn ynVar, l<?, ? super TranscodeType> lVar, g gVar, int i, int i2, Executor executor) {
        Context context = this.D;
        e eVar = this.G;
        return co.y(context, eVar, obj, this.I, this.F, vnVar, i, i2, gVar, noVar, znVar, this.J, ynVar, eVar.f(), lVar.b(), executor);
    }

    private xn p0(no<TranscodeType> noVar, zn<TranscodeType> znVar, vn<?> vnVar, Executor executor) {
        return r0(new Object(), noVar, znVar, null, this.H, vnVar.v(), vnVar.s(), vnVar.q(), vnVar, executor);
    }

    private xn r0(Object obj, no<TranscodeType> noVar, zn<TranscodeType> znVar, yn ynVar, l<?, ? super TranscodeType> lVar, g gVar, int i, int i2, vn<?> vnVar, Executor executor) {
        wn wnVar;
        wn wnVar2;
        if (this.L != null) {
            wnVar2 = new wn(obj, ynVar);
            wnVar = wnVar2;
        } else {
            wnVar = null;
            wnVar2 = ynVar;
        }
        xn v0 = v0(obj, noVar, znVar, wnVar2, lVar, gVar, i, i2, vnVar, executor);
        if (wnVar == null) {
            return v0;
        }
        int s = this.L.s();
        int q = this.L.q();
        if (fp.r(i, i2) && !this.L.O()) {
            s = vnVar.s();
            q = vnVar.q();
        }
        j<TranscodeType> jVar = this.L;
        wnVar.q(v0, jVar.r0(obj, noVar, znVar, wnVar, jVar.H, jVar.v(), s, q, this.L, executor));
        return wnVar;
    }

    private xn v0(Object obj, no<TranscodeType> noVar, zn<TranscodeType> znVar, yn ynVar, l<?, ? super TranscodeType> lVar, g gVar, int i, int i2, vn<?> vnVar, Executor executor) {
        g gVar2;
        j<TranscodeType> jVar = this.K;
        if (jVar != null) {
            if (!this.P) {
                l<?, ? super TranscodeType> lVar2 = jVar.N ? lVar : jVar.H;
                if (this.K.G()) {
                    gVar2 = this.K.v();
                } else {
                    gVar2 = x0(gVar);
                }
                int s = this.K.s();
                int q = this.K.q();
                if (fp.r(i, i2) && !this.K.O()) {
                    s = vnVar.s();
                    q = vnVar.q();
                }
                Cdo doVar = new Cdo(obj, ynVar);
                xn J0 = J0(obj, noVar, znVar, vnVar, doVar, lVar, gVar, i, i2, executor);
                this.P = true;
                j<TranscodeType> jVar2 = this.K;
                xn r0 = jVar2.r0(obj, noVar, znVar, doVar, lVar2, gVar2, s, q, jVar2, executor);
                this.P = false;
                doVar.p(J0, r0);
                return doVar;
            }
            throw new IllegalStateException(C0201.m82(5336));
        } else if (this.M == null) {
            return J0(obj, noVar, znVar, vnVar, ynVar, lVar, gVar, i, i2, executor);
        } else {
            Cdo doVar2 = new Cdo(obj, ynVar);
            doVar2.p(J0(obj, noVar, znVar, vnVar, doVar2, lVar, gVar, i, i2, executor), J0(obj, noVar, znVar, vnVar.clone().e0(this.M.floatValue()), doVar2, lVar, x0(gVar), i, i2, executor));
            return doVar2;
        }
    }

    private g x0(g gVar) {
        int i = a.b[gVar.ordinal()];
        if (i == 1) {
            return g.NORMAL;
        }
        if (i == 2) {
            return g.HIGH;
        }
        if (i == 3 || i == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException(C0201.m82(5337) + v());
    }

    @SuppressLint({"CheckResult"})
    private void y0(List<zn<Object>> list) {
        for (zn<Object> znVar : list) {
            n0(znVar);
        }
    }

    public <Y extends no<TranscodeType>> Y B0(Y y, zn<TranscodeType> znVar, Executor executor) {
        A0(y, znVar, this, executor);
        return y;
    }

    public oo<ImageView, TranscodeType> C0(ImageView imageView) {
        vn<?> vnVar;
        fp.a();
        ep.d(imageView);
        if (!N() && L() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    vnVar = c().R();
                    break;
                case 2:
                    vnVar = c().S();
                    break;
                case 3:
                case 4:
                case 5:
                    vnVar = c().T();
                    break;
                case 6:
                    vnVar = c().S();
                    break;
            }
            oo<ImageView, TranscodeType> a2 = this.G.a(imageView, this.F);
            A0(a2, null, vnVar, zo.b());
            return a2;
        }
        vnVar = this;
        oo<ImageView, TranscodeType> a22 = this.G.a(imageView, this.F);
        A0(a22, null, vnVar, zo.b());
        return a22;
    }

    public j<TranscodeType> E0(zn<TranscodeType> znVar) {
        this.J = null;
        return n0(znVar);
    }

    public j<TranscodeType> F0(Object obj) {
        I0(obj);
        return this;
    }

    public no<TranscodeType> K0() {
        return L0(C0188.f23, C0188.f23);
    }

    public no<TranscodeType> L0(int i, int i2) {
        lo j = lo.j(this.E, i, i2);
        z0(j);
        return j;
    }

    public j<TranscodeType> n0(zn<TranscodeType> znVar) {
        if (znVar != null) {
            if (this.J == null) {
                this.J = new ArrayList();
            }
            this.J.add(znVar);
        }
        return this;
    }

    /* renamed from: o0 */
    public j<TranscodeType> a(vn<?> vnVar) {
        ep.d(vnVar);
        return (j) super.a(vnVar);
    }

    /* renamed from: w0 */
    public j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.H = jVar.H.clone();
        return jVar;
    }

    public <Y extends no<TranscodeType>> Y z0(Y y) {
        B0(y, null, zo.b());
        return y;
    }
}
