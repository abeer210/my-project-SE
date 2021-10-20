package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import defpackage.nb;
import defpackage.sd;
import java.util.List;

/* renamed from: za  reason: default package */
/* compiled from: EllipseContent */
public class za implements gb, nb.b, eb {
    private final Path a = new Path();
    private final String b;
    private final ga c;
    private final nb<?, PointF> d;
    private final nb<?, PointF> e;
    private final cd f;
    private va g = new va();
    private boolean h;

    public za(ga gaVar, td tdVar, cd cdVar) {
        this.b = cdVar.b();
        this.c = gaVar;
        this.d = cdVar.d().a();
        this.e = cdVar.c().a();
        this.f = cdVar;
        tdVar.j(this.d);
        tdVar.j(this.e);
        this.d.a(this);
        this.e.a(this);
    }

    private void f() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.gb
    public Path a() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF h2 = this.d.h();
        float f2 = h2.x / 2.0f;
        float f3 = h2.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.a.reset();
        if (this.f.f()) {
            float f6 = -f3;
            this.a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF h3 = this.e.h();
        this.a.offset(h3.x, h3.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }

    @Override // defpackage.nb.b
    public void b() {
        f();
    }

    @Override // defpackage.wa
    public void c(List<wa> list, List<wa> list2) {
        for (int i = 0; i < list.size(); i++) {
            wa waVar = list.get(i);
            if (waVar instanceof mb) {
                mb mbVar = (mb) waVar;
                if (mbVar.j() == sd.a.SIMULTANEOUSLY) {
                    this.g.a(mbVar);
                    mbVar.d(this);
                }
            }
        }
    }

    @Override // defpackage.kc
    public void d(jc jcVar, int i, List<jc> list, jc jcVar2) {
        zf.l(jcVar, i, list, jcVar2, this);
    }

    @Override // defpackage.wa
    public String getName() {
        return this.b;
    }

    @Override // defpackage.kc
    public <T> void h(T t, dg<T> dgVar) {
        if (t == la.g) {
            this.d.m(dgVar);
        } else if (t == la.j) {
            this.e.m(dgVar);
        }
    }
}
