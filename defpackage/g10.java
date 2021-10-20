package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: g10  reason: default package */
/* compiled from: WavRiffHandler */
public class g10 implements qq {
    private final f10 a;
    private String b = C0201.m82(9401);

    public g10(wr wrVar) {
        f10 f10 = new f10();
        this.a = f10;
        wrVar.a(f10);
    }

    @Override // defpackage.qq
    public void a(String str, byte[] bArr) {
        try {
            if (str.equals(C0201.m82(9402))) {
                br brVar = new br(bArr);
                brVar.w(false);
                short f = brVar.f(0);
                short f2 = brVar.f(2);
                int h = brVar.h(4);
                int h2 = brVar.h(8);
                short f3 = brVar.f(12);
                if (f == 1) {
                    this.a.J(6, brVar.f(14));
                    this.a.R(1, f10.g.get(Integer.valueOf(f)));
                } else if (f10.g.containsKey(Integer.valueOf(f))) {
                    this.a.R(1, f10.g.get(Integer.valueOf(f)));
                } else {
                    this.a.R(1, C0201.m82(9403));
                }
                this.a.J(2, f2);
                this.a.J(3, h);
                this.a.J(4, h2);
                this.a.J(5, f3);
            } else if (str.equals(C0201.m82(9404))) {
                try {
                    if (this.a.b(4)) {
                        double length = (double) bArr.length;
                        double g = this.a.g(4);
                        Double.isNaN(length);
                        double d = length / g;
                        int i = (int) d;
                        Integer valueOf = Integer.valueOf(i / ((int) Math.pow(60.0d, 2.0d)));
                        Integer valueOf2 = Integer.valueOf((i / ((int) Math.pow(60.0d, 1.0d))) - (valueOf.intValue() * 60));
                        double pow = d / Math.pow(60.0d, 0.0d);
                        double intValue = (double) (valueOf2.intValue() * 60);
                        Double.isNaN(intValue);
                        Integer valueOf3 = Integer.valueOf((int) Math.round(pow - intValue));
                        this.a.R(16, String.format(C0201.m82(9405), valueOf, valueOf2, valueOf3));
                    }
                } catch (xr unused) {
                    this.a.a(C0201.m82(9406));
                }
            } else if (f10.f.containsKey(str)) {
                this.a.R(f10.f.get(str).intValue(), new String(bArr).substring(0, bArr.length - 1));
            }
        } catch (IOException e) {
            this.a.a(e.getMessage());
        }
    }

    @Override // defpackage.qq
    public boolean b(String str) {
        String r0 = C0201.m82(9407);
        if (str.equals(r0)) {
            this.b = r0;
            return true;
        }
        this.b = C0201.m82(9408);
        return false;
    }

    @Override // defpackage.qq
    public boolean c(String str) {
        return str.equals(C0201.m82(9409)) || (this.b.equals(C0201.m82(9410)) && f10.f.containsKey(str)) || str.equals(C0201.m82(9411));
    }

    @Override // defpackage.qq
    public boolean d(String str) {
        return str.equals(C0201.m82(9412));
    }
}
