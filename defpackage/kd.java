package defpackage;

import android.graphics.PointF;

/* renamed from: kd  reason: default package */
/* compiled from: PolystarShape */
public class kd implements dd {
    private final String a;
    private final a b;
    private final pc c;
    private final ad<PointF, PointF> d;
    private final pc e;
    private final pc f;
    private final pc g;
    private final pc h;
    private final pc i;
    private final boolean j;

    /* renamed from: kd$a */
    /* compiled from: PolystarShape */
    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int a;

        private a(int i) {
            this.a = i;
        }

        public static a b(int i) {
            a[] values = values();
            for (a aVar : values) {
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public kd(String str, a aVar, pc pcVar, ad<PointF, PointF> adVar, pc pcVar2, pc pcVar3, pc pcVar4, pc pcVar5, pc pcVar6, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = pcVar;
        this.d = adVar;
        this.e = pcVar2;
        this.f = pcVar3;
        this.g = pcVar4;
        this.h = pcVar5;
        this.i = pcVar6;
        this.j = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new hb(gaVar, tdVar, this);
    }

    public pc b() {
        return this.f;
    }

    public pc c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public pc e() {
        return this.g;
    }

    public pc f() {
        return this.i;
    }

    public pc g() {
        return this.c;
    }

    public ad<PointF, PointF> h() {
        return this.d;
    }

    public pc i() {
        return this.e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }
}
