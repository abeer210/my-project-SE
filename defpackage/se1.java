package defpackage;

import vigqyno.C0201;

/* renamed from: se1  reason: default package */
public final class se1 implements te1 {
    private static final y61<Boolean> a;
    private static final y61<Boolean> b;
    private static final y61<Boolean> c;

    static {
        f71 f71 = new f71(z61.a(C0201.m82(3813)));
        a = f71.c(C0201.m82(3814), false);
        b = f71.c(C0201.m82(3815), true);
        c = f71.c(C0201.m82(3816), false);
        f71.c(C0201.m82(3817), false);
        f71.f(C0201.m82(3818), 0);
    }

    @Override // defpackage.te1
    public final boolean a() {
        return a.a().booleanValue();
    }

    @Override // defpackage.te1
    public final boolean b() {
        return c.a().booleanValue();
    }

    @Override // defpackage.te1
    public final boolean c() {
        return b.a().booleanValue();
    }
}
