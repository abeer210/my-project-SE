package defpackage;

import java.util.Formatter;
import vigqyno.C0201;

/* renamed from: ha2  reason: default package */
/* compiled from: DetectionResultColumn */
public class ha2 {
    private final da2 a;
    private final ea2[] b;

    public ha2(da2 da2) {
        this.a = new da2(da2);
        this.b = new ea2[((da2.e() - da2.g()) + 1)];
    }

    public final da2 a() {
        return this.a;
    }

    public final ea2 b(int i) {
        return this.b[e(i)];
    }

    public final ea2 c(int i) {
        ea2 ea2;
        ea2 ea22;
        ea2 b2 = b(i);
        if (b2 != null) {
            return b2;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = e(i) - i2;
            if (e >= 0 && (ea22 = this.b[e]) != null) {
                return ea22;
            }
            int e2 = e(i) + i2;
            ea2[] ea2Arr = this.b;
            if (e2 < ea2Arr.length && (ea2 = ea2Arr[e2]) != null) {
                return ea2;
            }
        }
        return null;
    }

    public final ea2[] d() {
        return this.b;
    }

    public final int e(int i) {
        return i - this.a.g();
    }

    public final void f(int i, ea2 ea2) {
        this.b[e(i)] = ea2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        throw r2;
     */
    public String toString() {
        Formatter formatter = new Formatter();
        ea2[] ea2Arr = this.b;
        int i = 0;
        for (ea2 ea2 : ea2Arr) {
            if (ea2 == null) {
                formatter.format(C0201.m82(33739), Integer.valueOf(i));
                i++;
            } else {
                formatter.format(C0201.m82(33740), Integer.valueOf(i), Integer.valueOf(ea2.c()), Integer.valueOf(ea2.e()));
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
