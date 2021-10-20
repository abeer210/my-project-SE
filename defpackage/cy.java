package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: cy  reason: default package */
/* compiled from: TimecodeInformationMediaAtom */
public class cy extends qx {
    public int c;
    public int d;
    public int e;
    public int[] f;
    public int[] g;
    public String h;

    public cy(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
        this.c = orVar.e();
        this.d = orVar.e();
        this.e = orVar.e();
        orVar.t(2);
        this.f = new int[]{orVar.p(), orVar.p(), orVar.p()};
        this.g = new int[]{orVar.p(), orVar.p(), orVar.p()};
        this.h = orVar.m(orVar.r());
    }

    public void a(uy uyVar) {
        uyVar.J(5, this.c);
        int i = this.d;
        if (i == 1) {
            uyVar.R(6, C0201.m82(9073));
        } else if (i == 2) {
            uyVar.R(6, C0201.m82(9072));
        } else if (i == 4) {
            uyVar.R(6, C0201.m82(9071));
        } else if (i == 8) {
            uyVar.R(6, C0201.m82(9070));
        } else if (i == 16) {
            uyVar.R(6, C0201.m82(9069));
        } else if (i == 32) {
            uyVar.R(6, C0201.m82(9068));
        } else if (i == 64) {
            uyVar.R(6, C0201.m82(9067));
        }
        uyVar.J(7, this.e);
        uyVar.K(8, this.f);
        uyVar.K(9, this.g);
        uyVar.R(10, this.h);
    }
}
