package defpackage;

/* renamed from: f9  reason: default package */
public class f9 {
    private String a;
    private int b = 0;

    public f9(String str) {
        this.a = str;
    }

    public char a() {
        if (this.b < this.a.length()) {
            return this.a.charAt(this.b);
        }
        return 0;
    }

    public char b(int i) {
        if (i < this.a.length()) {
            return this.a.charAt(i);
        }
        return 0;
    }

    public int c(String str, int i) throws t8 {
        char b2 = b(this.b);
        int i2 = 0;
        boolean z = false;
        while ('0' <= b2 && b2 <= '9') {
            i2 = (i2 * 10) + (b2 - '0');
            int i3 = this.b + 1;
            this.b = i3;
            b2 = b(i3);
            z = true;
        }
        if (!z) {
            throw new t8(str, 5);
        } else if (i2 > i) {
            return i;
        } else {
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
    }

    public boolean d() {
        return this.b < this.a.length();
    }

    public int e() {
        return this.b;
    }

    public void f() {
        this.b++;
    }
}
