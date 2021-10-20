package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import vigqyno.C0201;

public final class i2 {
    private static final gy1 d = new gy1(C0201.m82(14032));
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    private final b0 a;
    private final fz1<i3> b;
    private final c c;

    static {
        C0201.m83(i2.class, 45);
    }

    public i2(b0 b0Var, fz1<i3> fz1, c cVar) {
        this.a = b0Var;
        this.b = fz1;
        this.c = cVar;
    }

    public final void a(h2 h2Var) {
        File b2 = this.a.b(h2Var.b, h2Var.c, h2Var.d);
        b0 b0Var = this.a;
        String str = h2Var.b;
        int i2 = h2Var.c;
        long j2 = h2Var.d;
        File file = new File(b0Var.j(str, i2, j2), h2Var.h);
        try {
            InputStream inputStream = h2Var.j;
            if (h2Var.g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            try {
                e0 e0Var = new e0(b2, file);
                if (this.c.b()) {
                    File c2 = this.a.c(h2Var.b, h2Var.e, h2Var.f, h2Var.h);
                    if (!c2.exists()) {
                        c2.mkdirs();
                    }
                    l2 l2Var = new l2(this.a, h2Var.b, h2Var.e, h2Var.f, h2Var.h);
                    ty1.b(e0Var, inputStream, new w0(c2, l2Var), h2Var.i);
                    l2Var.j(0);
                } else {
                    File file2 = new File(this.a.y(h2Var.b, h2Var.e, h2Var.f, h2Var.h), i);
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    ty1.b(e0Var, inputStream, new FileOutputStream(file2), h2Var.i);
                    if (!file2.renameTo(this.a.w(h2Var.b, h2Var.e, h2Var.f, h2Var.h))) {
                        throw new t0(String.format(e, h2Var.h, h2Var.b), h2Var.a);
                    }
                }
                inputStream.close();
                if (this.c.b()) {
                    d.f(k, h2Var.h, h2Var.b);
                } else {
                    d.f(f, h2Var.h, h2Var.b);
                }
                this.b.a().d(h2Var.a, h2Var.b, h2Var.h, 0);
                try {
                    h2Var.j.close();
                    return;
                } catch (IOException unused) {
                    d.g(h, h2Var.h, h2Var.b);
                    return;
                }
            } catch (Throwable th) {
                ez1.a(th, th);
            }
            throw th;
        } catch (IOException e2) {
            d.e(j, e2.getMessage());
            throw new t0(String.format(g, h2Var.h, h2Var.b), e2, h2Var.a);
        }
    }
}
