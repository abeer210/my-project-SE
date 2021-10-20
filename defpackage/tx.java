package defpackage;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/* renamed from: tx  reason: default package */
/* compiled from: MovieHeaderAtom */
public class tx extends qx {
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;

    public tx(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
        this.c = orVar.q();
        this.d = orVar.q();
        this.e = orVar.q();
        this.f = orVar.q();
        this.g = orVar.f();
        this.h = orVar.e();
        orVar.t(10);
        orVar.f();
        orVar.f();
        orVar.f();
        orVar.f();
        orVar.f();
        orVar.f();
        orVar.f();
        orVar.f();
        orVar.f();
        this.i = orVar.q();
        this.j = orVar.q();
        this.k = orVar.q();
        this.l = orVar.q();
        this.m = orVar.q();
        this.n = orVar.q();
        this.o = orVar.q();
    }

    public void a(kx kxVar) {
        Calendar instance = Calendar.getInstance();
        instance.set(1904, 0, 1, 0, 0, 0);
        long time = instance.getTime().getTime();
        kxVar.D(256, new Date((this.c * 1000) + time));
        kxVar.D(257, new Date((this.d * 1000) + time));
        long j2 = this.f / this.e;
        this.f = j2;
        kxVar.L(259, j2);
        kxVar.L(258, this.e);
        int i2 = this.g;
        double d2 = (double) ((-65536 & i2) >> 16);
        double d3 = (double) (i2 & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d3);
        Double.isNaN(d2);
        kxVar.F(260, d2 + (d3 / pow));
        int i3 = this.h;
        double d4 = (double) ((65280 & i3) >> 8);
        double d5 = (double) (i3 & 255);
        double pow2 = Math.pow(2.0d, 2.0d);
        Double.isNaN(d5);
        Double.isNaN(d4);
        kxVar.F(261, d4 + (d5 / pow2));
        kxVar.L(264, this.i);
        kxVar.L(265, this.j);
        kxVar.L(266, this.k);
        kxVar.L(267, this.l);
        kxVar.L(268, this.m);
        kxVar.L(269, this.n);
        kxVar.L(270, this.o);
    }
}
