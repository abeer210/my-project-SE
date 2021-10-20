package defpackage;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/* renamed from: qz  reason: default package */
/* compiled from: MovieHeaderBox */
public class qz extends mz {
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public int[] k;
    public long l;

    public qz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        if (this.d == 1) {
            this.e = orVar.g();
            this.f = orVar.g();
            this.g = orVar.q();
            this.h = orVar.g();
        } else {
            this.e = orVar.q();
            this.f = orVar.q();
            this.g = orVar.q();
            this.h = orVar.q();
        }
        this.i = orVar.f();
        this.j = orVar.e();
        orVar.t(2);
        orVar.t(8);
        this.k = new int[]{orVar.f(), orVar.f(), orVar.f(), orVar.f(), orVar.f(), orVar.f(), orVar.f(), orVar.f(), orVar.f()};
        orVar.t(24);
        this.l = orVar.q();
    }

    public void a(gz gzVar) {
        Calendar instance = Calendar.getInstance();
        instance.set(1904, 0, 1, 0, 0, 0);
        long time = instance.getTime().getTime();
        gzVar.D(256, new Date((this.e * 1000) + time));
        gzVar.D(257, new Date((this.f * 1000) + time));
        long j2 = this.h / this.g;
        this.h = j2;
        gzVar.L(259, j2);
        gzVar.L(258, this.g);
        gzVar.K(271, this.k);
        int i2 = this.i;
        double d = (double) ((-65536 & i2) >> 16);
        double d2 = (double) (i2 & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        gzVar.F(260, d + (d2 / pow));
        int i3 = this.j;
        double d3 = (double) ((65280 & i3) >> 8);
        double d4 = (double) (i3 & 255);
        double pow2 = Math.pow(2.0d, 2.0d);
        Double.isNaN(d4);
        Double.isNaN(d3);
        gzVar.F(261, d3 + (d4 / pow2));
        gzVar.L(270, this.l);
    }
}
