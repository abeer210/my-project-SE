package defpackage;

import android.content.Context;
import android.content.Intent;
import vigqyno.C0201;

/* renamed from: k02  reason: default package */
public final class k02 {
    private static final gy1 c = new gy1(C0201.m82(17660));
    public final qy1<dy1> a;
    private final String b;

    public k02(Context context) {
        this.b = context.getPackageName();
        Intent intent = new Intent(C0201.m82(17661)).setPackage(C0201.m82(17662));
        this.a = new qy1<>(context, c, C0201.m82(17663), intent, g02.a);
    }

    public final s02<a02> a() {
        c.f(C0201.m82(17664), this.b);
        d12 d12 = new d12();
        this.a.c(new h02(this, d12, d12));
        return d12.a();
    }
}
