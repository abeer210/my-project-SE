package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: y00  reason: default package */
/* compiled from: PsdReader */
public class y00 {
    public void a(or orVar, wr wrVar) {
        x00 x00 = new x00();
        wrVar.a(x00);
        try {
            if (orVar.f() != 943870035) {
                x00.a(C0201.m82(30571));
                return;
            }
            int p = orVar.p();
            if (p == 1 || p == 2) {
                orVar.t(6);
                x00.J(1, orVar.p());
                x00.J(2, orVar.f());
                x00.J(3, orVar.f());
                x00.J(4, orVar.p());
                x00.J(5, orVar.p());
                try {
                    orVar.t(orVar.q());
                    new u00().c(orVar, (int) orVar.q(), wrVar);
                } catch (IOException unused) {
                }
            } else {
                x00.a(C0201.m82(30572));
            }
        } catch (IOException unused2) {
            x00.a(C0201.m82(30573));
        }
    }
}
