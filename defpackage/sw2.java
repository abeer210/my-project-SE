package defpackage;

import vigqyno.C0201;

/* renamed from: sw2  reason: default package */
/* compiled from: Progressions.kt */
public class sw2 implements Iterable<Integer> {
    public static final a d = new a(null);
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: sw2$a */
    /* compiled from: Progressions.kt */
    public static final class a {
        private a() {
        }

        public final sw2 a(int i, int i2, int i3) {
            return new sw2(i, i2, i3);
        }

        public /* synthetic */ a(lw2 lw2) {
            this();
        }
    }

    public sw2(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException(C0201.m82(1361));
        } else if (i3 != Integer.MIN_VALUE) {
            this.a = i;
            this.b = ew2.b(i, i2, i3);
            this.c = i3;
        } else {
            throw new IllegalArgumentException(C0201.m82(1360));
        }
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    /* renamed from: d */
    public zv2 iterator() {
        return new tw2(this.a, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof sw2) {
            if (!isEmpty() || !((sw2) obj).isEmpty()) {
                sw2 sw2 = (sw2) obj;
                if (!(this.a == sw2.a && this.b == sw2.b && this.c == sw2.c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        if (this.c > 0) {
            if (this.a > this.b) {
                return true;
            }
        } else if (this.a < this.b) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        int i2 = this.c;
        String r1 = C0201.m82(1362);
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(C0201.m82(1363));
            sb.append(this.b);
            sb.append(r1);
            i = this.c;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(C0201.m82(1364));
            sb.append(this.b);
            sb.append(r1);
            i = -this.c;
        }
        sb.append(i);
        return sb.toString();
    }
}
