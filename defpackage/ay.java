package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ay  reason: default package */
/* compiled from: TextSampleDescriptionAtom */
public class ay extends wx<a> {

    /* access modifiers changed from: package-private */
    /* renamed from: ay$a */
    /* compiled from: TextSampleDescriptionAtom */
    public class a extends vx {
        public int b;
        public int c;
        public int[] d;
        public long e;
        public int f;
        public int g;
        public int[] h;
        public String i;

        public a(ay ayVar, or orVar) throws IOException {
            super(orVar);
            this.b = orVar.f();
            this.c = orVar.f();
            this.d = new int[]{orVar.p(), orVar.p(), orVar.p()};
            this.e = orVar.g();
            orVar.t(8);
            this.f = orVar.p();
            this.g = orVar.p();
            orVar.t(1);
            orVar.t(2);
            this.h = new int[]{orVar.p(), orVar.p(), orVar.p()};
            this.i = orVar.m(orVar.r());
        }
    }

    public ay(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
    }

    public void b(ry ryVar) {
        boolean z = false;
        a aVar = (a) this.d.get(0);
        ryVar.B(1, (aVar.b & 2) == 2);
        ryVar.B(2, (aVar.b & 8) == 8);
        ryVar.B(3, (aVar.b & 32) == 32);
        ryVar.B(4, (aVar.b & 64) == 64);
        ryVar.R(5, (aVar.b & 128) == 128 ? C0201.m82(4544) : C0201.m82(4545));
        ryVar.R(6, (aVar.b & 256) == 256 ? C0201.m82(4546) : C0201.m82(4547));
        ryVar.B(7, (aVar.b & 512) == 512);
        ryVar.B(8, (aVar.b & 4096) == 4096);
        ryVar.B(9, (aVar.b & 8192) == 8192);
        if ((aVar.b & 16384) == 16384) {
            z = true;
        }
        ryVar.B(10, z);
        int i = aVar.c;
        if (i == -1) {
            ryVar.R(11, C0201.m82(4550));
        } else if (i == 0) {
            ryVar.R(11, C0201.m82(4549));
        } else if (i == 1) {
            ryVar.R(11, C0201.m82(4548));
        }
        ryVar.K(12, aVar.d);
        ryVar.L(13, aVar.e);
        ryVar.J(14, aVar.f);
        int i2 = aVar.g;
        if (i2 == 1) {
            ryVar.R(15, C0201.m82(4557));
        } else if (i2 == 2) {
            ryVar.R(15, C0201.m82(4556));
        } else if (i2 == 4) {
            ryVar.R(15, C0201.m82(4555));
        } else if (i2 == 8) {
            ryVar.R(15, C0201.m82(4554));
        } else if (i2 == 16) {
            ryVar.R(15, C0201.m82(4553));
        } else if (i2 == 32) {
            ryVar.R(15, C0201.m82(4552));
        } else if (i2 == 64) {
            ryVar.R(15, C0201.m82(4551));
        }
        ryVar.K(16, aVar.h);
        ryVar.R(17, aVar.i);
    }

    /* renamed from: c */
    public a a(or orVar) throws IOException {
        return new a(this, orVar);
    }
}
