package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: x20  reason: default package */
/* compiled from: JavaStacktraceProcessor */
public class x20 implements b30 {
    private final Throwable a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public x20(Throwable th, int i) {
        this(th, i, 128000, C0188.f18, 250);
    }

    private String b() {
        StringBuilder sb = new StringBuilder();
        Throwable th = this.a;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (th == null || i >= this.b || i2 > this.c) {
                break;
            }
            if (i > 0) {
                sb.append(C0201.m82(8119));
                i2 += 12;
            }
            String c2 = c(th.toString(), i3, i > 0);
            String r7 = C0201.m82(8120);
            String[] split = c2.split(r7);
            if (split.length > this.b - i) {
                int i4 = 0;
                while (i < this.b) {
                    if (i4 > 0) {
                        sb.append(r7);
                    }
                    sb.append(split[i4]);
                    i2 = sb.length();
                    i++;
                    i4++;
                }
            } else {
                sb.append(c2);
                i2 = sb.length();
                i += split.length;
                int length = sb.length();
                StackTraceElement[] stackTrace = th.getStackTrace();
                if (stackTrace != null) {
                    int min = Math.min(stackTrace.length, this.b - i);
                    int i5 = 0;
                    while (true) {
                        i3 = i2;
                        i2 = length;
                        if (i5 >= min || i2 >= this.c) {
                            break;
                        }
                        sb.append(r7);
                        sb.append(C0201.m82(8121));
                        sb.append(stackTrace[i5]);
                        length = sb.length();
                        i++;
                        i5++;
                    }
                } else {
                    i3 = i2;
                    i2 = length;
                }
                th = th.getCause();
            }
        }
        if (i2 > this.c) {
            return sb.substring(0, i3).trim();
        }
        return sb.toString().trim();
    }

    private String c(String str, int i, boolean z) {
        if (str == null) {
            return C0201.m82(8122);
        }
        int min = Math.min(Math.max(0, (this.c - i) - (z ? 12 : 0)), this.d);
        return str.length() > min ? str.substring(0, min) : str;
    }

    @Override // defpackage.b30
    public a30 a() {
        return new a30(s30.o(this.a.getClass().getName(), this.e), s30.o(this.a.toString(), this.d), b(), y20.JAVA);
    }

    public x20(Throwable th, int i, int i2, int i3, int i4) {
        this.a = th;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
