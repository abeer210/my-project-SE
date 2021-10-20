package defpackage;

/* renamed from: ju2  reason: default package */
/* compiled from: ExifInfo */
public class ju2 {
    private int a;
    private int b;
    private int c;

    public ju2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ju2.class != obj.getClass()) {
            return false;
        }
        ju2 ju2 = (ju2) obj;
        if (this.a == ju2.a && this.b == ju2.b && this.c == ju2.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
