package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import vigqyno.C0201;

public final class z1 {
    private static final gy1 b = new gy1(C0201.m82(14072));
    private final b0 a;

    public z1(b0 b0Var) {
        this.a = b0Var;
    }

    private static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file3 : listFiles) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append(C0201.m82(14073));
                sb.append(valueOf);
                throw new t0(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append(C0201.m82(14075));
            sb2.append(valueOf2);
            throw new t0(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append(C0201.m82(14074));
            sb3.append(valueOf3);
            throw new t0(sb3.toString());
        }
    }

    public final void a(y1 y1Var) {
        File k = this.a.k(y1Var.b, y1Var.c, y1Var.d, y1Var.e);
        if (k.exists()) {
            File m = this.a.m(y1Var.b, y1Var.c, y1Var.d);
            if (!m.exists()) {
                m.mkdirs();
            }
            b(k, m);
            try {
                this.a.f(y1Var.b, y1Var.c, y1Var.d, this.a.r(y1Var.b, y1Var.c, y1Var.d) + 1);
            } catch (IOException e) {
                b.e(C0201.m82(14076), e.getMessage());
                throw new t0(C0201.m82(14077), e, y1Var.a);
            }
        } else {
            throw new t0(String.format(C0201.m82(14078), y1Var.e), y1Var.a);
        }
    }
}
