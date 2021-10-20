package defpackage;

import java.io.File;
import vigqyno.C0201;

/* renamed from: cs2  reason: default package */
/* compiled from: MemoryUsageSetting */
public final class cs2 {
    private final boolean a;
    private final boolean b;
    private final long c;
    private final long d;
    private File e;

    private cs2(boolean z, boolean z2, long j, long j2) {
        boolean z3 = z2 ? z : true;
        j = !z ? -1 : j;
        j2 = j2 <= 0 ? -1 : j2;
        j = j < -1 ? -1 : j;
        if (z3 && j == 0) {
            if (z2) {
                z3 = false;
            } else {
                j = j2;
            }
        }
        if (z3 && j2 > -1 && (j == -1 || j > j2)) {
            j2 = j;
        }
        this.a = z3;
        this.b = z2;
        this.c = j;
        this.d = j2;
    }

    public static cs2 g() {
        return h(-1);
    }

    public static cs2 h(long j) {
        return new cs2(false, true, 0, j);
    }

    public long a() {
        return this.c;
    }

    public long b() {
        return this.d;
    }

    public File c() {
        return this.e;
    }

    public boolean d() {
        return this.c >= 0;
    }

    public boolean e() {
        return this.d > 0;
    }

    public cs2 f(File file) {
        this.e = file;
        return this;
    }

    public boolean i() {
        return this.a;
    }

    public boolean j() {
        return this.b;
    }

    public String toString() {
        String str;
        boolean z = this.a;
        String r1 = C0201.m82(33073);
        if (z) {
            if (this.b) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0201.m82(33074));
                sb.append(this.c);
                sb.append(C0201.m82(33075));
                if (e()) {
                    str = C0201.m82(33076) + this.d + C0201.m82(33077);
                } else {
                    str = C0201.m82(33078);
                }
                sb.append(str);
                return sb.toString();
            } else if (!d()) {
                return C0201.m82(33080);
            } else {
                return C0201.m82(33079) + this.c + r1;
            }
        } else if (!e()) {
            return C0201.m82(33082);
        } else {
            return C0201.m82(33081) + this.d + r1;
        }
    }
}
