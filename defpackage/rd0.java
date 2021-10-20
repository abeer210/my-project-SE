package defpackage;

import vigqyno.C0201;

/* renamed from: rd0  reason: default package */
/* compiled from: ResizeOptions */
public class rd0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;

    public rd0(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rd0)) {
            return false;
        }
        rd0 rd0 = (rd0) obj;
        if (this.a == rd0.a && this.b == rd0.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return d70.a(this.a, this.b);
    }

    public String toString() {
        return String.format(null, C0201.m82(9011), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public rd0(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public rd0(int i, int i2, float f, float f2) {
        boolean z = true;
        z50.b(i > 0);
        z50.b(i2 <= 0 ? false : z);
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
    }
}
