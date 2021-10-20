package defpackage;

import vigqyno.C0201;

/* renamed from: x92  reason: default package */
/* compiled from: GeneralAppIdDecoder */
public final class x92 {
    private final b72 a;
    private final r92 b = new r92();
    private final StringBuilder c = new StringBuilder();

    public x92(b72 b72) {
        this.a = b72;
    }

    private s92 b(int i) {
        char c2;
        int f = f(i, 5);
        if (f == 15) {
            return new s92(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new s92(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new s92(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c2 = '*';
                break;
            case 59:
                c2 = ',';
                break;
            case 60:
                c2 = '-';
                break;
            case 61:
                c2 = '.';
                break;
            case 62:
                c2 = '/';
                break;
            default:
                throw new IllegalStateException(C0201.m82(24932).concat(String.valueOf(f2)));
        }
        return new s92(i + 6, c2);
    }

    private s92 d(int i) throws k62 {
        char c2;
        int f = f(i, 5);
        if (f == 15) {
            return new s92(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new s92(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new s92(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new s92(i + 7, (char) (f2 + 7));
        }
        switch (f(i, 8)) {
            case 232:
                c2 = '!';
                break;
            case 233:
                c2 = '\"';
                break;
            case 234:
                c2 = '%';
                break;
            case 235:
                c2 = '&';
                break;
            case 236:
                c2 = '\'';
                break;
            case 237:
                c2 = '(';
                break;
            case 238:
                c2 = ')';
                break;
            case 239:
                c2 = '*';
                break;
            case 240:
                c2 = '+';
                break;
            case 241:
                c2 = ',';
                break;
            case 242:
                c2 = '-';
                break;
            case 243:
                c2 = '.';
                break;
            case 244:
                c2 = '/';
                break;
            case 245:
                c2 = ':';
                break;
            case 246:
                c2 = ';';
                break;
            case 247:
                c2 = '<';
                break;
            case 248:
                c2 = '=';
                break;
            case 249:
                c2 = '>';
                break;
            case 250:
                c2 = '?';
                break;
            case 251:
                c2 = '_';
                break;
            case 252:
                c2 = ' ';
                break;
            default:
                throw k62.a();
        }
        return new s92(i + 8, c2);
    }

    private u92 e(int i) throws k62 {
        int i2 = i + 7;
        if (i2 > this.a.g()) {
            int f = f(i, 4);
            if (f == 0) {
                return new u92(this.a.g(), 10, 10);
            }
            return new u92(this.a.g(), f - 1, 10);
        }
        int f2 = f(i, 7) - 8;
        return new u92(i2, f2 / 11, f2 % 11);
    }

    public static int g(b72 b72, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (b72.c(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    private boolean h(int i) {
        int i2 = i + 3;
        if (i2 > this.a.g()) {
            return false;
        }
        while (i < i2) {
            if (this.a.c(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean i(int i) {
        int i2;
        if (i + 1 > this.a.g()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.a.g()) {
            if (i3 == 2) {
                if (!this.a.c(i + 2)) {
                    return false;
                }
            } else if (this.a.c(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    private boolean j(int i) {
        int i2;
        if (i + 1 > this.a.g()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.a.g()) {
            if (this.a.c(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    private boolean k(int i) {
        int f;
        if (i + 5 > this.a.g()) {
            return false;
        }
        int f2 = f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 6 <= this.a.g() && (f = f(i, 6)) >= 16 && f < 63) {
            return true;
        }
        return false;
    }

    private boolean l(int i) {
        int f;
        if (i + 5 > this.a.g()) {
            return false;
        }
        int f2 = f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.a.g()) {
            return false;
        }
        int f3 = f(i, 7);
        if (f3 >= 64 && f3 < 116) {
            return true;
        }
        if (i + 8 <= this.a.g() && (f = f(i, 8)) >= 232 && f < 253) {
            return true;
        }
        return false;
    }

    private boolean m(int i) {
        if (i + 7 <= this.a.g()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.a.c(i3);
                }
                if (this.a.c(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.a.g()) {
            return true;
        } else {
            return false;
        }
    }

    private q92 n() {
        while (k(this.b.a())) {
            s92 b2 = b(this.b.a());
            this.b.h(b2.a());
            if (b2.c()) {
                return new q92(new t92(this.b.a(), this.c.toString()), true);
            }
            this.c.append(b2.b());
        }
        if (h(this.b.a())) {
            this.b.b(3);
            this.b.g();
        } else if (i(this.b.a())) {
            if (this.b.a() + 5 < this.a.g()) {
                this.b.b(5);
            } else {
                this.b.h(this.a.g());
            }
            this.b.f();
        }
        return new q92(false);
    }

    private t92 o() throws k62 {
        boolean z;
        q92 q92;
        do {
            int a2 = this.b.a();
            if (this.b.c()) {
                q92 = n();
                z = q92.b();
            } else if (this.b.d()) {
                q92 = p();
                z = q92.b();
            } else {
                q92 = q();
                z = q92.b();
            }
            if (!(a2 != this.b.a()) && !z) {
                break;
            }
        } while (!z);
        return q92.a();
    }

    private q92 p() throws k62 {
        while (l(this.b.a())) {
            s92 d = d(this.b.a());
            this.b.h(d.a());
            if (d.c()) {
                return new q92(new t92(this.b.a(), this.c.toString()), true);
            }
            this.c.append(d.b());
        }
        if (h(this.b.a())) {
            this.b.b(3);
            this.b.g();
        } else if (i(this.b.a())) {
            if (this.b.a() + 5 < this.a.g()) {
                this.b.b(5);
            } else {
                this.b.h(this.a.g());
            }
            this.b.e();
        }
        return new q92(false);
    }

    private q92 q() throws k62 {
        t92 t92;
        while (m(this.b.a())) {
            u92 e = e(this.b.a());
            this.b.h(e.a());
            if (e.d()) {
                if (e.e()) {
                    t92 = new t92(this.b.a(), this.c.toString());
                } else {
                    t92 = new t92(this.b.a(), this.c.toString(), e.c());
                }
                return new q92(t92, true);
            }
            this.c.append(e.b());
            if (e.e()) {
                return new q92(new t92(this.b.a(), this.c.toString()), true);
            }
            this.c.append(e.c());
        }
        if (j(this.b.a())) {
            this.b.e();
            this.b.b(4);
        }
        return new q92(false);
    }

    public String a(StringBuilder sb, int i) throws o62, k62 {
        String str = null;
        while (true) {
            t92 c2 = c(i, str);
            String a2 = w92.a(c2.b());
            if (a2 != null) {
                sb.append(a2);
            }
            String valueOf = c2.d() ? String.valueOf(c2.c()) : null;
            if (i == c2.a()) {
                return sb.toString();
            }
            i = c2.a();
            str = valueOf;
        }
    }

    public t92 c(int i, String str) throws k62 {
        this.c.setLength(0);
        if (str != null) {
            this.c.append(str);
        }
        this.b.h(i);
        t92 o = o();
        if (o == null || !o.d()) {
            return new t92(this.b.a(), this.c.toString());
        }
        return new t92(this.b.a(), this.c.toString(), o.c());
    }

    public int f(int i, int i2) {
        return g(this.a, i, i2);
    }
}
