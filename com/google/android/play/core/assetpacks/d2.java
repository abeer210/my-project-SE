package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import vigqyno.C0201;

public final class d2 {
    private final b0 a;
    private final fz1<i3> b;
    private final l1 c;
    private final fz1<Executor> d;
    private final x0 e;

    public d2(b0 b0Var, fz1<i3> fz1, l1 l1Var, fz1<Executor> fz12, x0 x0Var) {
        this.a = b0Var;
        this.b = fz1;
        this.c = l1Var;
        this.d = fz12;
        this.e = x0Var;
    }

    public final void a(b2 b2Var) {
        File m = this.a.m(b2Var.b, b2Var.c, b2Var.d);
        File v = this.a.v(b2Var.b, b2Var.c, b2Var.d);
        if (!m.exists() || !v.exists()) {
            throw new t0(String.format(C0201.m82(34851), b2Var.b), b2Var.a);
        }
        File b2 = this.a.b(b2Var.b, b2Var.c, b2Var.d);
        b2.mkdirs();
        if (m.renameTo(b2)) {
            new File(this.a.b(b2Var.b, b2Var.c, b2Var.d), C0201.m82(34848)).delete();
            File j = this.a.j(b2Var.b, b2Var.c, b2Var.d);
            j.mkdirs();
            if (v.renameTo(j)) {
                b0 b0Var = this.a;
                b0Var.getClass();
                this.d.a().execute(c2.a(b0Var));
                this.c.d(b2Var.b, b2Var.c, b2Var.d);
                this.e.b(b2Var.b);
                this.b.a().a(b2Var.a, b2Var.b);
                return;
            }
            throw new t0(C0201.m82(34849), b2Var.a);
        }
        throw new t0(C0201.m82(34850), b2Var.a);
    }
}
