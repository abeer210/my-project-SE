package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import vigqyno.C0201;

public final class p2 {
    private static final gy1 b = new gy1(C0201.m82(8239));
    private final b0 a;

    public p2(b0 b0Var) {
        this.a = b0Var;
    }

    private final void b(o2 o2Var, File file) {
        try {
            File y = this.a.y(o2Var.b, o2Var.c, o2Var.d, o2Var.e);
            if (y.exists()) {
                try {
                    if (v1.b(n2.a(file, y)).equals(o2Var.f)) {
                        b.f(C0201.m82(8240), o2Var.e, o2Var.b);
                        return;
                    }
                    throw new t0(String.format(C0201.m82(8241), o2Var.e), o2Var.a);
                } catch (NoSuchAlgorithmException e) {
                    throw new t0(C0201.m82(8243), e, o2Var.a);
                } catch (IOException e2) {
                    throw new t0(String.format(C0201.m82(8242), o2Var.e), e2, o2Var.a);
                }
            } else {
                throw new t0(String.format(C0201.m82(8244), o2Var.e), o2Var.a);
            }
        } catch (IOException e3) {
            throw new t0(String.format(C0201.m82(8245), o2Var.e), e3, o2Var.a);
        }
    }

    public final void a(o2 o2Var) {
        File c = this.a.c(o2Var.b, o2Var.c, o2Var.d, o2Var.e);
        if (c.exists()) {
            b(o2Var, c);
            File k = this.a.k(o2Var.b, o2Var.c, o2Var.d, o2Var.e);
            if (!k.exists()) {
                k.mkdirs();
            }
            if (!c.renameTo(k)) {
                throw new t0(String.format(C0201.m82(8246), o2Var.e), o2Var.a);
            }
            return;
        }
        throw new t0(String.format(C0201.m82(8247), o2Var.e), o2Var.a);
    }
}
