package defpackage;

import vigqyno.C0201;

/* renamed from: kf1  reason: default package */
public final class kf1 implements lf1 {
    private static final y61<Boolean> a;
    private static final y61<Boolean> b;
    private static final y61<Boolean> c;

    static {
        f71 f71 = new f71(z61.a(C0201.m82(24933)));
        a = f71.c(C0201.m82(24934), false);
        b = f71.c(C0201.m82(24935), false);
        c = f71.c(C0201.m82(24936), false);
    }

    @Override // defpackage.lf1
    public final boolean a() {
        return c.a().booleanValue();
    }

    @Override // defpackage.lf1
    public final boolean b() {
        return b.a().booleanValue();
    }

    @Override // defpackage.lf1
    public final boolean c() {
        return a.a().booleanValue();
    }
}
