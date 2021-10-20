package defpackage;

import java.io.IOException;

/* renamed from: vz  reason: default package */
/* compiled from: VisualSampleEntry */
public class vz extends rz {
    public int e;
    public int f;
    public long g;
    public long h;
    public String i;
    public int j;

    public vz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        orVar.e();
        orVar.e();
        orVar.m(4);
        orVar.f();
        orVar.f();
        this.e = orVar.p();
        this.f = orVar.p();
        this.g = orVar.q();
        this.h = orVar.q();
        orVar.t(4);
        orVar.p();
        this.i = orVar.m(32);
        this.j = orVar.p();
        orVar.t(2);
    }

    public void a(k00 k00) {
        k00.J(104, this.e);
        k00.J(105, this.f);
        k00.R(110, this.i.trim());
        k00.J(109, this.j);
        long j2 = this.g;
        double d = (double) ((j2 & -65536) >> 16);
        double d2 = (double) (j2 & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        k00.F(106, d + (d2 / pow));
        long j3 = this.h;
        double d3 = (double) ((-65536 & j3) >> 16);
        double d4 = (double) (j3 & 65535);
        double pow2 = Math.pow(2.0d, 4.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        k00.F(107, d3 + (d4 / pow2));
    }
}
