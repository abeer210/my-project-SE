package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: gs  reason: default package */
/* compiled from: AviRiffHandler */
public class gs implements qq {
    private final fs a;

    public gs(wr wrVar) {
        fs fsVar = new fs();
        this.a = fsVar;
        wrVar.a(fsVar);
    }

    @Override // defpackage.qq
    public void a(String str, byte[] bArr) {
        try {
            if (str.equals(C0201.m82(18265))) {
                br brVar = new br(bArr);
                brVar.w(false);
                String str2 = new String(brVar.c(0, 4));
                String str3 = new String(brVar.c(4, 4));
                float e = brVar.e(20);
                float e2 = brVar.e(24);
                int h = brVar.h(32);
                if (str2.equals(C0201.m82(18266))) {
                    if (!this.a.b(1)) {
                        float f = e2 / e;
                        this.a.F(1, (double) f);
                        double d = (double) (((float) h) / f);
                        int i = (int) d;
                        Integer valueOf = Integer.valueOf(i / ((int) Math.pow(60.0d, 2.0d)));
                        Integer valueOf2 = Integer.valueOf((i / ((int) Math.pow(60.0d, 1.0d))) - (valueOf.intValue() * 60));
                        double pow = Math.pow(60.0d, 0.0d);
                        Double.isNaN(d);
                        double d2 = d / pow;
                        double intValue = (double) (valueOf2.intValue() * 60);
                        Double.isNaN(intValue);
                        Integer valueOf3 = Integer.valueOf((int) Math.round(d2 - intValue));
                        this.a.R(3, String.format(C0201.m82(18267), valueOf, valueOf2, valueOf3));
                        this.a.R(4, str3);
                    }
                } else if (str2.equals(C0201.m82(18268)) && !this.a.b(2)) {
                    this.a.F(2, (double) (e2 / e));
                }
            } else if (str.equals(C0201.m82(18269))) {
                br brVar2 = new br(bArr);
                brVar2.w(false);
                int h2 = brVar2.h(24);
                int h3 = brVar2.h(32);
                int h4 = brVar2.h(36);
                this.a.J(6, h3);
                this.a.J(7, h4);
                this.a.J(8, h2);
            }
        } catch (IOException e3) {
            this.a.a(e3.getMessage());
        }
    }

    @Override // defpackage.qq
    public boolean b(String str) {
        return str.equals(C0201.m82(18270)) || str.equals(C0201.m82(18271)) || str.equals(C0201.m82(18272));
    }

    @Override // defpackage.qq
    public boolean c(String str) {
        return str.equals(C0201.m82(18273)) || str.equals(C0201.m82(18274));
    }

    @Override // defpackage.qq
    public boolean d(String str) {
        return str.equals(C0201.m82(18275));
    }
}
