package defpackage;

/* renamed from: vz2  reason: default package */
/* compiled from: ImageDimensions */
public class vz2 {
    private int a;
    private int b;
    private int c;
    private int d;

    public vz2(int i, int i2) {
        this(i, i2, 0);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        if (e()) {
            return this.a;
        }
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        if (e()) {
            return this.b;
        }
        return this.a;
    }

    public boolean e() {
        return this.d % 180 == 90;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vz2)) {
            return super.equals(obj);
        }
        vz2 vz2 = (vz2) obj;
        return vz2.d() == d() && vz2.b() == b() && vz2.a() == a() && vz2.c() == c();
    }

    public vz2(int i, int i2, int i3) {
        this(i, i2, i3, -1);
    }

    public vz2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i4;
        this.d = i3;
    }
}
