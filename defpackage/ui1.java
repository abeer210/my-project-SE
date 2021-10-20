package defpackage;

import java.util.List;
import vigqyno.C0201;

/* renamed from: ui1  reason: default package */
public final class ui1 extends ri1 {
    private final si1 a = new si1();

    @Override // defpackage.ri1
    public final void a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable th2 : a2) {
                    System.err.print(C0201.m82(37660));
                    th2.printStackTrace();
                }
            }
        }
    }
}
