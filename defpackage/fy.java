package defpackage;

import java.io.IOException;

/* renamed from: fy  reason: default package */
/* compiled from: VideoSampleDescriptionAtom */
public class fy extends wx<a> {

    /* access modifiers changed from: package-private */
    /* renamed from: fy$a */
    /* compiled from: VideoSampleDescriptionAtom */
    public class a extends vx {
        public String b;
        public long c;
        public long d;
        public int e;
        public int f;
        public long g;
        public long h;
        public String i;
        public int j;
        public int k;

        public a(fy fyVar, or orVar) throws IOException {
            super(orVar);
            orVar.p();
            orVar.p();
            this.b = orVar.m(4);
            this.c = orVar.q();
            this.d = orVar.q();
            this.e = orVar.p();
            this.f = orVar.p();
            this.g = orVar.q();
            this.h = orVar.q();
            orVar.q();
            orVar.p();
            this.i = orVar.m(orVar.r());
            this.j = orVar.p();
            this.k = orVar.e();
        }
    }

    public fy(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
    }

    public void b(xy xyVar) {
        a aVar = (a) this.d.get(0);
        jx.b(1, aVar.b, xyVar);
        jx.b(10, aVar.a, xyVar);
        xyVar.L(2, aVar.c);
        xyVar.L(3, aVar.d);
        xyVar.J(4, aVar.e);
        xyVar.J(5, aVar.f);
        xyVar.R(8, aVar.i.trim());
        xyVar.J(9, aVar.j);
        xyVar.J(13, aVar.k);
        long j = aVar.g;
        double d = (double) ((j & -65536) >> 16);
        double d2 = (double) (j & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        xyVar.F(6, d + (d2 / pow));
        long j2 = aVar.h;
        double d3 = (double) ((-65536 & j2) >> 16);
        double d4 = (double) (j2 & 65535);
        double pow2 = Math.pow(2.0d, 4.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        xyVar.F(7, d3 + (d4 / pow2));
    }

    /* renamed from: c */
    public a a(or orVar) throws IOException {
        return new a(this, orVar);
    }
}
