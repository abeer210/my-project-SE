package defpackage;

import java.io.Serializable;
import vigqyno.C0201;

/* renamed from: bx  reason: default package */
/* compiled from: JpegComponent */
public class bx implements Serializable {
    private final int a;
    private final int b;
    private final int c;

    public bx(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public String a() {
        int i = this.a;
        if (i == 1) {
            return C0201.m82(7420);
        }
        if (i == 2) {
            return C0201.m82(7419);
        }
        if (i == 3) {
            return C0201.m82(7418);
        }
        if (i == 4) {
            return C0201.m82(7417);
        }
        if (i == 5) {
            return C0201.m82(7416);
        }
        return String.format(C0201.m82(7415), Integer.valueOf(i));
    }

    public int b() {
        return (this.b >> 4) & 15;
    }

    public int c() {
        return this.b & 15;
    }

    public String toString() {
        return String.format(C0201.m82(7421), Integer.valueOf(this.c), Integer.valueOf(b()), Integer.valueOf(c()));
    }
}
