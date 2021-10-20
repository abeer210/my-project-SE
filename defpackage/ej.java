package defpackage;

import android.util.Log;
import com.bumptech.glide.load.g;
import defpackage.aj;
import defpackage.kg;
import java.io.File;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ej  reason: default package */
/* compiled from: DiskLruCacheWrapper */
public class ej implements aj {
    private final jj a;
    private final File b;
    private final long c;
    private final cj d = new cj();
    private kg e;

    @Deprecated
    public ej(File file, long j) {
        this.b = file;
        this.c = j;
        this.a = new jj();
    }

    public static aj c(File file, long j) {
        return new ej(file, j);
    }

    private synchronized kg d() throws IOException {
        if (this.e == null) {
            this.e = kg.E(this.b, 1, 1, this.c);
        }
        return this.e;
    }

    @Override // defpackage.aj
    public void a(g gVar, aj.b bVar) {
        String r0 = C0201.m82(12945);
        String b2 = this.a.b(gVar);
        this.d.a(b2);
        try {
            if (Log.isLoggable(r0, 2)) {
                Log.v(r0, C0201.m82(12946) + b2 + C0201.m82(12947) + gVar);
            }
            try {
                kg d2 = d();
                if (d2.B(b2) == null) {
                    kg.c y = d2.y(b2);
                    if (y != null) {
                        try {
                            if (bVar.a(y.f(0))) {
                                y.e();
                            }
                            this.d.b(b2);
                        } finally {
                            y.b();
                        }
                    } else {
                        throw new IllegalStateException(C0201.m82(12948) + b2);
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable(r0, 5)) {
                    Log.w(r0, C0201.m82(12949), e2);
                }
            }
        } finally {
            this.d.b(b2);
        }
    }

    @Override // defpackage.aj
    public File b(g gVar) {
        String b2 = this.a.b(gVar);
        String r1 = C0201.m82(12950);
        if (Log.isLoggable(r1, 2)) {
            Log.v(r1, C0201.m82(12951) + b2 + C0201.m82(12952) + gVar);
        }
        try {
            kg.e B = d().B(b2);
            if (B != null) {
                return B.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable(r1, 5)) {
                return null;
            }
            Log.w(r1, C0201.m82(12953), e2);
            return null;
        }
    }
}
