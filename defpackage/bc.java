package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import defpackage.nb;
import java.util.Collections;

/* renamed from: bc  reason: default package */
/* compiled from: TransformKeyframeAnimation */
public class bc {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private nb<PointF, PointF> f;
    private nb<?, PointF> g;
    private nb<eg, eg> h;
    private nb<Float, Float> i;
    private nb<Integer, Integer> j;
    private pb k;
    private pb l;
    private nb<?, Float> m;
    private nb<?, Float> n;

    public bc(zc zcVar) {
        this.f = zcVar.c() == null ? null : zcVar.c().a();
        this.g = zcVar.f() == null ? null : zcVar.f().a();
        this.h = zcVar.h() == null ? null : zcVar.h().a();
        this.i = zcVar.g() == null ? null : zcVar.g().a();
        pb pbVar = zcVar.i() == null ? null : (pb) zcVar.i().a();
        this.k = pbVar;
        if (pbVar != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = zcVar.j() == null ? null : (pb) zcVar.j().a();
        if (zcVar.e() != null) {
            this.j = zcVar.e().a();
        }
        if (zcVar.k() != null) {
            this.m = zcVar.k().a();
        } else {
            this.m = null;
        }
        if (zcVar.d() != null) {
            this.n = zcVar.d().a();
        } else {
            this.n = null;
        }
    }

    private void d() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.e[i2] = 0.0f;
        }
    }

    public void a(td tdVar) {
        tdVar.j(this.j);
        tdVar.j(this.m);
        tdVar.j(this.n);
        tdVar.j(this.f);
        tdVar.j(this.g);
        tdVar.j(this.h);
        tdVar.j(this.i);
        tdVar.j(this.k);
        tdVar.j(this.l);
    }

    public void b(nb.b bVar) {
        nb<Integer, Integer> nbVar = this.j;
        if (nbVar != null) {
            nbVar.a(bVar);
        }
        nb<?, Float> nbVar2 = this.m;
        if (nbVar2 != null) {
            nbVar2.a(bVar);
        }
        nb<?, Float> nbVar3 = this.n;
        if (nbVar3 != null) {
            nbVar3.a(bVar);
        }
        nb<PointF, PointF> nbVar4 = this.f;
        if (nbVar4 != null) {
            nbVar4.a(bVar);
        }
        nb<?, PointF> nbVar5 = this.g;
        if (nbVar5 != null) {
            nbVar5.a(bVar);
        }
        nb<eg, eg> nbVar6 = this.h;
        if (nbVar6 != null) {
            nbVar6.a(bVar);
        }
        nb<Float, Float> nbVar7 = this.i;
        if (nbVar7 != null) {
            nbVar7.a(bVar);
        }
        pb pbVar = this.k;
        if (pbVar != null) {
            pbVar.a(bVar);
        }
        pb pbVar2 = this.l;
        if (pbVar2 != null) {
            pbVar2.a(bVar);
        }
    }

    public <T> boolean c(T t, dg<T> dgVar) {
        pb pbVar;
        pb pbVar2;
        nb<?, Float> nbVar;
        nb<?, Float> nbVar2;
        if (t == la.e) {
            nb<PointF, PointF> nbVar3 = this.f;
            if (nbVar3 == null) {
                this.f = new cc(dgVar, new PointF());
                return true;
            }
            nbVar3.m(dgVar);
            return true;
        } else if (t == la.f) {
            nb<?, PointF> nbVar4 = this.g;
            if (nbVar4 == null) {
                this.g = new cc(dgVar, new PointF());
                return true;
            }
            nbVar4.m(dgVar);
            return true;
        } else if (t == la.k) {
            nb<eg, eg> nbVar5 = this.h;
            if (nbVar5 == null) {
                this.h = new cc(dgVar, new eg());
                return true;
            }
            nbVar5.m(dgVar);
            return true;
        } else if (t == la.l) {
            nb<Float, Float> nbVar6 = this.i;
            if (nbVar6 == null) {
                this.i = new cc(dgVar, Float.valueOf(0.0f));
                return true;
            }
            nbVar6.m(dgVar);
            return true;
        } else if (t == la.c) {
            nb<Integer, Integer> nbVar7 = this.j;
            if (nbVar7 == null) {
                this.j = new cc(dgVar, 100);
                return true;
            }
            nbVar7.m(dgVar);
            return true;
        } else if (t != la.y || (nbVar2 = this.m) == null) {
            if (t != la.z || (nbVar = this.n) == null) {
                if (t == la.m && (pbVar2 = this.k) != null) {
                    if (pbVar2 == null) {
                        this.k = new pb(Collections.singletonList(new bg(Float.valueOf(0.0f))));
                    }
                    this.k.m(dgVar);
                    return true;
                } else if (t != la.n || (pbVar = this.l) == null) {
                    return false;
                } else {
                    if (pbVar == null) {
                        this.l = new pb(Collections.singletonList(new bg(Float.valueOf(0.0f))));
                    }
                    this.l.m(dgVar);
                    return true;
                }
            } else if (nbVar == null) {
                this.n = new cc(dgVar, 100);
                return true;
            } else {
                nbVar.m(dgVar);
                return true;
            }
        } else if (nbVar2 == null) {
            this.m = new cc(dgVar, 100);
            return true;
        } else {
            nbVar2.m(dgVar);
            return true;
        }
    }

    public nb<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        float f2;
        this.a.reset();
        nb<?, PointF> nbVar = this.g;
        if (nbVar != null) {
            PointF h2 = nbVar.h();
            if (!(h2.x == 0.0f && h2.y == 0.0f)) {
                this.a.preTranslate(h2.x, h2.y);
            }
        }
        nb<Float, Float> nbVar2 = this.i;
        if (nbVar2 != null) {
            if (nbVar2 instanceof cc) {
                f2 = nbVar2.h().floatValue();
            } else {
                f2 = ((pb) nbVar2).o();
            }
            if (f2 != 0.0f) {
                this.a.preRotate(f2);
            }
        }
        if (this.k != null) {
            pb pbVar = this.l;
            float cos = pbVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-pbVar.o()) + 90.0f)));
            pb pbVar2 = this.l;
            float sin = pbVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-pbVar2.o()) + 90.0f)));
            d();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.k.o()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f3;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        nb<eg, eg> nbVar3 = this.h;
        if (nbVar3 != null) {
            eg h3 = nbVar3.h();
            if (!(h3.b() == 1.0f && h3.c() == 1.0f)) {
                this.a.preScale(h3.b(), h3.c());
            }
        }
        nb<PointF, PointF> nbVar4 = this.f;
        if (nbVar4 != null) {
            PointF h4 = nbVar4.h();
            if (!(h4.x == 0.0f && h4.y == 0.0f)) {
                this.a.preTranslate(-h4.x, -h4.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f2) {
        nb<?, PointF> nbVar = this.g;
        PointF pointF = null;
        PointF h2 = nbVar == null ? null : nbVar.h();
        nb<eg, eg> nbVar2 = this.h;
        eg h3 = nbVar2 == null ? null : nbVar2.h();
        this.a.reset();
        if (h2 != null) {
            this.a.preTranslate(h2.x * f2, h2.y * f2);
        }
        if (h3 != null) {
            double d2 = (double) f2;
            this.a.preScale((float) Math.pow((double) h3.b(), d2), (float) Math.pow((double) h3.c(), d2));
        }
        nb<Float, Float> nbVar3 = this.i;
        if (nbVar3 != null) {
            float floatValue = nbVar3.h().floatValue();
            nb<PointF, PointF> nbVar4 = this.f;
            if (nbVar4 != null) {
                pointF = nbVar4.h();
            }
            Matrix matrix = this.a;
            float f3 = floatValue * f2;
            float f4 = 0.0f;
            float f5 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f5, f4);
        }
        return this.a;
    }

    public nb<?, Integer> h() {
        return this.j;
    }

    public nb<?, Float> i() {
        return this.m;
    }

    public void j(float f2) {
        nb<Integer, Integer> nbVar = this.j;
        if (nbVar != null) {
            nbVar.l(f2);
        }
        nb<?, Float> nbVar2 = this.m;
        if (nbVar2 != null) {
            nbVar2.l(f2);
        }
        nb<?, Float> nbVar3 = this.n;
        if (nbVar3 != null) {
            nbVar3.l(f2);
        }
        nb<PointF, PointF> nbVar4 = this.f;
        if (nbVar4 != null) {
            nbVar4.l(f2);
        }
        nb<?, PointF> nbVar5 = this.g;
        if (nbVar5 != null) {
            nbVar5.l(f2);
        }
        nb<eg, eg> nbVar6 = this.h;
        if (nbVar6 != null) {
            nbVar6.l(f2);
        }
        nb<Float, Float> nbVar7 = this.i;
        if (nbVar7 != null) {
            nbVar7.l(f2);
        }
        pb pbVar = this.k;
        if (pbVar != null) {
            pbVar.l(f2);
        }
        pb pbVar2 = this.l;
        if (pbVar2 != null) {
            pbVar2.l(f2);
        }
    }
}
