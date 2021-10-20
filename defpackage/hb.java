package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import defpackage.kd;
import defpackage.nb;
import defpackage.sd;
import java.util.List;

/* renamed from: hb  reason: default package */
/* compiled from: PolystarContent */
public class hb implements gb, nb.b, eb {
    private final Path a = new Path();
    private final String b;
    private final ga c;
    private final kd.a d;
    private final boolean e;
    private final nb<?, Float> f;
    private final nb<?, PointF> g;
    private final nb<?, Float> h;
    private final nb<?, Float> i;
    private final nb<?, Float> j;
    private final nb<?, Float> k;
    private final nb<?, Float> l;
    private va m = new va();
    private boolean n;

    /* renamed from: hb$a */
    /* compiled from: PolystarContent */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[kd.a.values().length];
            a = iArr;
            iArr[kd.a.STAR.ordinal()] = 1;
            a[kd.a.POLYGON.ordinal()] = 2;
        }
    }

    public hb(ga gaVar, td tdVar, kd kdVar) {
        this.c = gaVar;
        this.b = kdVar.d();
        this.d = kdVar.j();
        this.e = kdVar.k();
        this.f = kdVar.g().a();
        this.g = kdVar.h().a();
        this.h = kdVar.i().a();
        this.j = kdVar.e().a();
        this.l = kdVar.f().a();
        if (this.d == kd.a.STAR) {
            this.i = kdVar.b().a();
            this.k = kdVar.c().a();
        } else {
            this.i = null;
            this.k = null;
        }
        tdVar.j(this.f);
        tdVar.j(this.g);
        tdVar.j(this.h);
        tdVar.j(this.j);
        tdVar.j(this.l);
        if (this.d == kd.a.STAR) {
            tdVar.j(this.i);
            tdVar.j(this.k);
        }
        this.f.a(this);
        this.g.a(this);
        this.h.a(this);
        this.j.a(this);
        this.l.a(this);
        if (this.d == kd.a.STAR) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    private void f() {
        double d2;
        double d3;
        double d4;
        int i2;
        int floor = (int) Math.floor((double) this.f.h().floatValue());
        nb<?, Float> nbVar = this.h;
        double radians = Math.toRadians((nbVar == null ? 0.0d : (double) nbVar.h().floatValue()) - 90.0d);
        double d5 = (double) floor;
        Double.isNaN(d5);
        float floatValue = this.l.h().floatValue() / 100.0f;
        float floatValue2 = this.j.h().floatValue();
        double d6 = (double) floatValue2;
        double cos = Math.cos(radians);
        Double.isNaN(d6);
        float f2 = (float) (cos * d6);
        double sin = Math.sin(radians);
        Double.isNaN(d6);
        float f3 = (float) (sin * d6);
        this.a.moveTo(f2, f3);
        double d7 = (double) ((float) (6.283185307179586d / d5));
        Double.isNaN(d7);
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i3 = 0;
        while (((double) i3) < ceil) {
            double cos2 = Math.cos(d8);
            Double.isNaN(d6);
            float f4 = (float) (cos2 * d6);
            double sin2 = Math.sin(d8);
            Double.isNaN(d6);
            float f5 = (float) (d6 * sin2);
            if (floatValue != 0.0f) {
                d4 = d6;
                i2 = i3;
                d3 = d8;
                double atan2 = (double) ((float) (Math.atan2((double) f3, (double) f2) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d2 = d7;
                double atan22 = (double) ((float) (Math.atan2((double) f5, (double) f4) - 1.5707963267948966d));
                float f6 = floatValue2 * floatValue * 0.25f;
                this.a.cubicTo(f2 - (cos3 * f6), f3 - (((float) Math.sin(atan2)) * f6), f4 + (((float) Math.cos(atan22)) * f6), f5 + (f6 * ((float) Math.sin(atan22))), f4, f5);
            } else {
                d3 = d8;
                d4 = d6;
                d2 = d7;
                i2 = i3;
                this.a.lineTo(f4, f5);
            }
            Double.isNaN(d2);
            d8 = d3 + d2;
            i3 = i2 + 1;
            f3 = f5;
            f2 = f4;
            ceil = ceil;
            d6 = d4;
            d7 = d2;
        }
        PointF h2 = this.g.h();
        this.a.offset(h2.x, h2.y);
        this.a.close();
    }

    private void i() {
        double d2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        double d3;
        float f7;
        float f8;
        float f9;
        double d4;
        float f10;
        float f11;
        float f12;
        float f13;
        float floatValue = this.f.h().floatValue();
        nb<?, Float> nbVar = this.h;
        double radians = Math.toRadians((nbVar == null ? 0.0d : (double) nbVar.h().floatValue()) - 90.0d);
        double d5 = (double) floatValue;
        Double.isNaN(d5);
        float f14 = (float) (6.283185307179586d / d5);
        float f15 = f14 / 2.0f;
        float f16 = floatValue - ((float) ((int) floatValue));
        if (f16 != 0.0f) {
            double d6 = (double) ((1.0f - f16) * f15);
            Double.isNaN(d6);
            radians += d6;
        }
        float floatValue2 = this.j.h().floatValue();
        float floatValue3 = this.i.h().floatValue();
        nb<?, Float> nbVar2 = this.k;
        float floatValue4 = nbVar2 != null ? nbVar2.h().floatValue() / 100.0f : 0.0f;
        nb<?, Float> nbVar3 = this.l;
        float floatValue5 = nbVar3 != null ? nbVar3.h().floatValue() / 100.0f : 0.0f;
        if (f16 != 0.0f) {
            float f17 = ((floatValue2 - floatValue3) * f16) + floatValue3;
            double d7 = (double) f17;
            double cos = Math.cos(radians);
            Double.isNaN(d7);
            d2 = d5;
            float f18 = (float) (d7 * cos);
            double sin = Math.sin(radians);
            Double.isNaN(d7);
            float f19 = (float) (d7 * sin);
            this.a.moveTo(f18, f19);
            double d8 = (double) ((f14 * f16) / 2.0f);
            Double.isNaN(d8);
            d3 = radians + d8;
            f4 = f18;
            f2 = f17;
            f6 = floatValue2;
            f3 = f19;
            f5 = f15;
        } else {
            d2 = d5;
            f6 = floatValue2;
            double d9 = (double) f6;
            double cos2 = Math.cos(radians);
            Double.isNaN(d9);
            f5 = f15;
            f4 = (float) (d9 * cos2);
            double sin2 = Math.sin(radians);
            Double.isNaN(d9);
            f3 = (float) (d9 * sin2);
            this.a.moveTo(f4, f3);
            double d10 = (double) f5;
            Double.isNaN(d10);
            d3 = radians + d10;
            f2 = 0.0f;
        }
        double ceil = Math.ceil(d2) * 2.0d;
        int i2 = 0;
        boolean z = false;
        while (true) {
            double d11 = (double) i2;
            if (d11 < ceil) {
                float f20 = z ? f6 : floatValue3;
                float f21 = (f2 == 0.0f || d11 != ceil - 2.0d) ? f5 : (f14 * f16) / 2.0f;
                if (f2 == 0.0f || d11 != ceil - 1.0d) {
                    f7 = f14;
                    f9 = f20;
                    f8 = f6;
                } else {
                    f7 = f14;
                    f8 = f6;
                    f9 = f2;
                }
                double d12 = (double) f9;
                double cos3 = Math.cos(d3);
                Double.isNaN(d12);
                float f22 = (float) (d12 * cos3);
                double sin3 = Math.sin(d3);
                Double.isNaN(d12);
                float f23 = (float) (d12 * sin3);
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.a.lineTo(f22, f23);
                    d4 = d3;
                    f11 = floatValue3;
                    f10 = floatValue4;
                    f12 = f5;
                    f13 = f21;
                } else {
                    f11 = floatValue3;
                    f10 = floatValue4;
                    double atan2 = (double) ((float) (Math.atan2((double) f3, (double) f4) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    d4 = d3;
                    f12 = f5;
                    f13 = f21;
                    double atan22 = (double) ((float) (Math.atan2((double) f23, (double) f22) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f24 = z ? f10 : floatValue5;
                    float f25 = z ? floatValue5 : f10;
                    float f26 = (z ? f11 : f8) * f24 * 0.47829f;
                    float f27 = cos4 * f26;
                    float f28 = f26 * sin4;
                    float f29 = (z ? f8 : f11) * f25 * 0.47829f;
                    float f30 = cos5 * f29;
                    float f31 = f29 * sin5;
                    if (f16 != 0.0f) {
                        if (i2 == 0) {
                            f27 *= f16;
                            f28 *= f16;
                        } else if (d11 == ceil - 1.0d) {
                            f30 *= f16;
                            f31 *= f16;
                        }
                    }
                    this.a.cubicTo(f4 - f27, f3 - f28, f22 + f30, f23 + f31, f22, f23);
                }
                double d13 = (double) f13;
                Double.isNaN(d13);
                z = !z;
                i2++;
                f3 = f23;
                d3 = d4 + d13;
                f5 = f12;
                f4 = f22;
                f6 = f8;
                f14 = f7;
                floatValue3 = f11;
                floatValue4 = f10;
            } else {
                PointF h2 = this.g.h();
                this.a.offset(h2.x, h2.y);
                this.a.close();
                return;
            }
        }
    }

    private void j() {
        this.n = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.gb
    public Path a() {
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.n = true;
            return this.a;
        }
        int i2 = a.a[this.d.ordinal()];
        if (i2 == 1) {
            i();
        } else if (i2 == 2) {
            f();
        }
        this.a.close();
        this.m.b(this.a);
        this.n = true;
        return this.a;
    }

    @Override // defpackage.nb.b
    public void b() {
        j();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            wa waVar = list.get(i2);
            if (waVar instanceof mb) {
                mb mbVar = (mb) waVar;
                if (mbVar.j() == sd.a.SIMULTANEOUSLY) {
                    this.m.a(mbVar);
                    mbVar.d(this);
                }
            }
        }
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i2, List<jc> list, jc jcVar2) {
        zf.l(jcVar, i2, list, jcVar2, this);
    }

    @Override // defpackage.wa
    public String getName() {
        return this.b;
    }

    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        nb<?, Float> nbVar;
        nb<?, Float> nbVar2;
        if (t == la.s) {
            this.f.m(dgVar);
        } else if (t == la.t) {
            this.h.m(dgVar);
        } else if (t == la.j) {
            this.g.m(dgVar);
        } else if (t == la.u && (nbVar2 = this.i) != null) {
            nbVar2.m(dgVar);
        } else if (t == la.v) {
            this.j.m(dgVar);
        } else if (t == la.w && (nbVar = this.k) != null) {
            nbVar.m(dgVar);
        } else if (t == la.x) {
            this.l.m(dgVar);
        }
    }
}
