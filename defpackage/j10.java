package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: j10  reason: default package */
/* compiled from: WebpRiffHandler */
public class j10 implements qq {
    private final wr a;

    public j10(wr wrVar) {
        this.a = wrVar;
    }

    @Override // defpackage.qq
    public void a(String str, byte[] bArr) {
        i10 i10 = new i10();
        if (str.equals(C0201.m82(22291))) {
            new vs().c(new br(bArr), this.a);
        } else if (str.equals(C0201.m82(22292))) {
            new iw().c(new br(bArr), this.a);
        } else if (str.equals(C0201.m82(22293))) {
            new m10().f(bArr, this.a);
        } else if (str.equals(C0201.m82(22294)) && bArr.length == 10) {
            br brVar = new br(bArr);
            brVar.w(false);
            try {
                boolean a2 = brVar.a(1);
                boolean a3 = brVar.a(4);
                int g = brVar.g(4);
                int g2 = brVar.g(7);
                i10.J(2, g + 1);
                i10.J(1, g2 + 1);
                i10.B(3, a3);
                i10.B(4, a2);
                this.a.a(i10);
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } else if (str.equals(C0201.m82(22295)) && bArr.length > 4) {
            br brVar2 = new br(bArr);
            brVar2.w(false);
            try {
                if (brVar2.j(0) == 47) {
                    short u = brVar2.u(1);
                    short u2 = brVar2.u(2);
                    short u3 = brVar2.u(3);
                    i10.J(2, (u | ((u2 & 63) << 8)) + 1);
                    i10.J(1, (((brVar2.u(4) & 15) << 10) | (u3 << 2) | ((u2 & 192) >> 6)) + 1);
                    this.a.a(i10);
                }
            } catch (IOException e2) {
                e2.printStackTrace(System.err);
            }
        } else if (str.equals(C0201.m82(22296)) && bArr.length > 9) {
            br brVar3 = new br(bArr);
            brVar3.w(false);
            try {
                if (brVar3.u(3) != 157 || brVar3.u(4) != 1) {
                    return;
                }
                if (brVar3.u(5) == 42) {
                    int s = brVar3.s(6);
                    int s2 = brVar3.s(8);
                    i10.J(2, s);
                    i10.J(1, s2);
                    this.a.a(i10);
                }
            } catch (IOException e3) {
                i10.a(e3.getMessage());
            }
        }
    }

    @Override // defpackage.qq
    public boolean b(String str) {
        return false;
    }

    @Override // defpackage.qq
    public boolean c(String str) {
        return str.equals(C0201.m82(22297)) || str.equals(C0201.m82(22298)) || str.equals(C0201.m82(22299)) || str.equals(C0201.m82(22300)) || str.equals(C0201.m82(22301)) || str.equals(C0201.m82(22302));
    }

    @Override // defpackage.qq
    public boolean d(String str) {
        return str.equals(C0201.m82(22303));
    }
}
