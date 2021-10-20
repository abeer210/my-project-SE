package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ea  reason: default package */
/* compiled from: LottieComposition */
public class ea {
    private final oa a = new oa();
    private final HashSet<String> b = new HashSet<>();
    private Map<String, List<wd>> c;
    private Map<String, ha> d;
    private Map<String, hc> e;
    private List<mc> f;
    private y0<ic> g;
    private u0<wd> h;
    private List<wd> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private int o = 0;

    public void a(String str) {
        wf.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public y0<ic> c() {
        return this.g;
    }

    public float d() {
        return (float) ((long) ((e() / this.m) * 1000.0f));
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, hc> g() {
        return this.e;
    }

    public float h() {
        return this.m;
    }

    public Map<String, ha> i() {
        return this.d;
    }

    public List<wd> j() {
        return this.i;
    }

    public mc k(String str) {
        this.f.size();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            mc mcVar = this.f.get(i2);
            if (mcVar.a(str)) {
                return mcVar;
            }
        }
        return null;
    }

    public int l() {
        return this.o;
    }

    public oa m() {
        return this.a;
    }

    public List<wd> n(String str) {
        return this.c.get(str);
    }

    public float o() {
        return this.k;
    }

    public boolean p() {
        return this.n;
    }

    public void q(int i2) {
        this.o += i2;
    }

    public void r(Rect rect, float f2, float f3, float f4, List<wd> list, u0<wd> u0Var, Map<String, List<wd>> map, Map<String, ha> map2, y0<ic> y0Var, Map<String, hc> map3, List<mc> list2) {
        this.j = rect;
        this.k = f2;
        this.l = f3;
        this.m = f4;
        this.i = list;
        this.h = u0Var;
        this.c = map;
        this.d = map2;
        this.g = y0Var;
        this.e = map3;
        this.f = list2;
    }

    public wd s(long j2) {
        return this.h.g(j2);
    }

    public void t(boolean z) {
        this.n = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(C0201.m82(12098));
        for (wd wdVar : this.i) {
            sb.append(wdVar.w(C0201.m82(12099)));
        }
        return sb.toString();
    }

    public void u(boolean z) {
        this.a.b(z);
    }
}
