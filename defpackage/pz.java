package defpackage;

import java.io.IOException;

/* renamed from: pz  reason: default package */
/* compiled from: MediaHeaderBox */
public class pz extends mz {
    public long e;
    public long f;
    public long g;
    public long h;
    public String i;

    public pz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        if (this.d == 1) {
            this.e = orVar.g();
            this.f = orVar.g();
            this.g = (long) orVar.f();
            this.h = orVar.g();
        } else {
            this.e = orVar.q();
            this.f = orVar.q();
            this.g = orVar.q();
            this.h = orVar.q();
        }
        short e2 = orVar.e();
        this.i = new String(new char[]{(char) (((e2 & 31744) >> 10) + 96), (char) (((e2 & 992) >> 5) + 96), (char) ((e2 & 31) + 96)});
        hz.c = Long.valueOf(this.e);
        hz.d = Long.valueOf(this.f);
        hz.b = Long.valueOf(this.g);
        hz.e = Long.valueOf(this.h);
        hz.f = this.i;
    }
}
