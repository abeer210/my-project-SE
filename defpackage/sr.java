package defpackage;

import vigqyno.C0201;

/* renamed from: sr  reason: default package */
/* compiled from: Age */
public class sr {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public sr(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    private static void a(StringBuilder sb, int i, String str) {
        if (i != 0) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append(' ');
            sb.append(str);
            if (i != 1) {
                sb.append('s');
            }
        }
    }

    public static sr b(String str) {
        if (str.length() == 19 && !str.startsWith(C0201.m82(5982))) {
            try {
                return new sr(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)), Integer.parseInt(str.substring(11, 13)), Integer.parseInt(str.substring(14, 16)), Integer.parseInt(str.substring(17, 19)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        a(sb, this.a, C0201.m82(5983));
        a(sb, this.b, C0201.m82(5984));
        a(sb, this.c, C0201.m82(5985));
        a(sb, this.d, C0201.m82(5986));
        a(sb, this.e, C0201.m82(5987));
        a(sb, this.f, C0201.m82(5988));
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sr.class != obj.getClass()) {
            return false;
        }
        sr srVar = (sr) obj;
        return this.c == srVar.c && this.d == srVar.d && this.e == srVar.e && this.b == srVar.b && this.f == srVar.f && this.a == srVar.a;
    }

    public int hashCode() {
        return (((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }

    public String toString() {
        return String.format(C0201.m82(5989), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
