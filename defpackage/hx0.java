package defpackage;

/* renamed from: hx0  reason: default package */
public final class hx0 {
    private final String a;
    private int b = 0;

    public hx0(String str) {
        this.a = str;
    }

    public final boolean a() {
        return this.b < this.a.length();
    }

    public final int b() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            String str2 = this.a;
            int i4 = this.b;
            this.b = i4 + 1;
            char charAt2 = str2.charAt(i4);
            if (charAt2 < 55296) {
                return i2 | (charAt2 << i3);
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
        }
    }
}
