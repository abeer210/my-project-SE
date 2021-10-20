package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: r9  reason: default package */
public final class r9 {
    public static q9 a(String str, String str2) throws t8 {
        if (str == null || str2 == null) {
            throw new t8(C0201.m82(38896), 4);
        }
        q9 q9Var = new q9();
        p9 p9Var = new p9();
        p9Var.a = str2;
        c(str, p9Var, q9Var);
        while (p9Var.e < str2.length()) {
            p9Var.d = p9Var.e;
            e(str2, p9Var);
            int i = p9Var.d;
            p9Var.e = i;
            s9 d = str2.charAt(i) != '[' ? d(p9Var) : b(p9Var);
            int b = d.b();
            String r4 = C0201.m82(38891);
            if (b == 1) {
                if (d.c().charAt(0) == '@') {
                    d.h(C0201.m82(38892) + d.c().substring(1));
                    if (!C0201.m82(38893).equals(d.c())) {
                        throw new t8(r4, 102);
                    }
                }
                if (d.c().charAt(0) == '?') {
                    p9Var.b++;
                    d.g(2);
                }
            } else {
                if (d.b() != 6) {
                    continue;
                } else {
                    if (d.c().charAt(1) == '@') {
                        d.h(C0201.m82(38894) + d.c().substring(2));
                        if (!d.c().startsWith(C0201.m82(38895))) {
                            throw new t8(r4, 102);
                        }
                    }
                    if (d.c().charAt(1) == '?') {
                        p9Var.b++;
                        d.g(5);
                    }
                }
                q9Var.a(d);
            }
            f(p9Var.a.substring(p9Var.b, p9Var.c));
            q9Var.a(d);
        }
        return q9Var;
    }

    private static s9 b(p9 p9Var) throws t8 {
        s9 s9Var;
        int i = p9Var.e + 1;
        p9Var.e = i;
        if ('0' > p9Var.a.charAt(i) || p9Var.a.charAt(p9Var.e) > '9') {
            while (p9Var.e < p9Var.a.length() && p9Var.a.charAt(p9Var.e) != ']' && p9Var.a.charAt(p9Var.e) != '=') {
                p9Var.e++;
            }
            if (p9Var.e >= p9Var.a.length()) {
                throw new t8(C0201.m82(38902), 102);
            } else if (p9Var.a.charAt(p9Var.e) == ']') {
                if (C0201.m82(38897).equals(p9Var.a.substring(p9Var.d, p9Var.e))) {
                    s9Var = new s9(null, 4);
                } else {
                    throw new t8(C0201.m82(38898), 102);
                }
            } else {
                p9Var.b = p9Var.d + 1;
                int i2 = p9Var.e;
                p9Var.c = i2;
                int i3 = i2 + 1;
                p9Var.e = i3;
                char charAt = p9Var.a.charAt(i3);
                if (charAt == '\'' || charAt == '\"') {
                    while (true) {
                        p9Var.e++;
                        if (p9Var.e < p9Var.a.length()) {
                            if (p9Var.a.charAt(p9Var.e) == charAt) {
                                if (p9Var.e + 1 >= p9Var.a.length() || p9Var.a.charAt(p9Var.e + 1) != charAt) {
                                    break;
                                }
                                p9Var.e++;
                            }
                        } else {
                            break;
                        }
                    }
                    if (p9Var.e < p9Var.a.length()) {
                        p9Var.e++;
                        s9Var = new s9(null, 6);
                    } else {
                        throw new t8(C0201.m82(38901), 102);
                    }
                } else {
                    throw new t8(C0201.m82(38899), 102);
                }
            }
        } else {
            while (p9Var.e < p9Var.a.length() && '0' <= p9Var.a.charAt(p9Var.e) && p9Var.a.charAt(p9Var.e) <= '9') {
                p9Var.e++;
            }
            s9Var = new s9(null, 3);
        }
        if (p9Var.e >= p9Var.a.length() || p9Var.a.charAt(p9Var.e) != ']') {
            throw new t8(C0201.m82(38900), 102);
        }
        int i4 = p9Var.e + 1;
        p9Var.e = i4;
        s9Var.h(p9Var.a.substring(p9Var.d, i4));
        return s9Var;
    }

    private static void c(String str, p9 p9Var, q9 q9Var) throws t8 {
        s9 s9Var;
        while (p9Var.e < p9Var.a.length()) {
            if (C0201.m82(38903).indexOf(p9Var.a.charAt(p9Var.e)) >= 0) {
                break;
            }
            p9Var.e++;
        }
        int i = p9Var.e;
        int i2 = p9Var.d;
        if (i != i2) {
            String h = h(str, p9Var.a.substring(i2, i));
            y9 d = w8.a().d(h);
            if (d == null) {
                q9Var.a(new s9(str, C0188.f23));
                s9Var = new s9(h, 1);
            } else {
                q9Var.a(new s9(d.a(), C0188.f23));
                s9 s9Var2 = new s9(h(d.a(), d.c()), 1);
                s9Var2.e(true);
                s9Var2.f(d.d().d());
                q9Var.a(s9Var2);
                if (d.d().i()) {
                    s9Var = new s9(C0201.m82(38904), 5);
                } else if (d.d().h()) {
                    s9Var = new s9(C0201.m82(38905), 3);
                } else {
                    return;
                }
                s9Var.e(true);
                s9Var.f(d.d().d());
            }
            q9Var.a(s9Var);
            return;
        }
        throw new t8(C0201.m82(38906), 102);
    }

    private static s9 d(p9 p9Var) throws t8 {
        p9Var.b = p9Var.d;
        while (p9Var.e < p9Var.a.length()) {
            if (C0201.m82(38907).indexOf(p9Var.a.charAt(p9Var.e)) >= 0) {
                break;
            }
            p9Var.e++;
        }
        int i = p9Var.e;
        p9Var.c = i;
        int i2 = p9Var.d;
        if (i != i2) {
            return new s9(p9Var.a.substring(i2, i), 1);
        }
        throw new t8(C0201.m82(38908), 102);
    }

    private static void e(String str, p9 p9Var) throws t8 {
        if (str.charAt(p9Var.d) == '/') {
            int i = p9Var.d + 1;
            p9Var.d = i;
            if (i >= str.length()) {
                throw new t8(C0201.m82(38909), 102);
            }
        }
        if (str.charAt(p9Var.d) == '*') {
            int i2 = p9Var.d + 1;
            p9Var.d = i2;
            if (i2 >= str.length() || str.charAt(p9Var.d) != '[') {
                throw new t8(C0201.m82(38910), 102);
            }
        }
    }

    private static void f(String str) throws t8 {
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            if (g9.g(substring)) {
                if (w8.a().b(substring) == null) {
                    throw new t8(C0201.m82(38911), 102);
                }
                return;
            }
        }
        throw new t8(C0201.m82(38912), 102);
    }

    private static void g(String str) throws t8 {
        if (!g9.f(str)) {
            throw new t8(C0201.m82(38913), 102);
        }
    }

    private static String h(String str, String str2) throws t8 {
        if (str == null || str.length() == 0) {
            throw new t8(C0201.m82(38919), 101);
        } else if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new t8(C0201.m82(38918), 102);
        } else if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new t8(C0201.m82(38917), 102);
        } else {
            String a = w8.a().a(str);
            if (a != null) {
                int indexOf = str2.indexOf(58);
                if (indexOf < 0) {
                    g(str2);
                    return a + str2;
                }
                g(str2.substring(0, indexOf));
                g(str2.substring(indexOf));
                String substring = str2.substring(0, indexOf + 1);
                String a2 = w8.a().a(str);
                if (a2 == null) {
                    throw new t8(C0201.m82(38915), 101);
                } else if (substring.equals(a2)) {
                    return str2;
                } else {
                    throw new t8(C0201.m82(38914), 101);
                }
            } else {
                throw new t8(C0201.m82(38916), 101);
            }
        }
    }
}
