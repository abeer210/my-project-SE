package defpackage;

/* renamed from: u92  reason: default package */
/* compiled from: DecodedNumeric */
public final class u92 extends v92 {
    private final int b;
    private final int c;

    public u92(int i, int i2, int i3) throws k62 {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw k62.a();
        }
        this.b = i2;
        this.c = i3;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.b == 10;
    }

    public boolean e() {
        return this.c == 10;
    }
}
