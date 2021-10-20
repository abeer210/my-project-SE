package defpackage;

import java.io.IOException;
import java.util.Hashtable;
import vigqyno.C0201;

/* renamed from: n43  reason: default package */
/* compiled from: IETFUtils */
public class n43 {
    public static void a(StringBuffer stringBuffer, i43 i43, Hashtable hashtable) {
        if (i43.k()) {
            h43[] j = i43.j();
            boolean z = true;
            for (int i = 0; i != j.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                b(stringBuffer, j[i], hashtable);
            }
        } else if (i43.g() != null) {
            b(stringBuffer, i43.g(), hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, h43 h43, Hashtable hashtable) {
        String str = (String) hashtable.get(h43.i());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(h43.i().u());
        }
        stringBuffer.append('=');
        stringBuffer.append(i(h43.j()));
    }

    private static boolean c(h43 h43, h43 h432) {
        if (h43 == h432) {
            return true;
        }
        return h43 != null && h432 != null && h43.i().equals(h432.i()) && e(i(h43.j())).equals(e(i(h432.j())));
    }

    private static String d(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String e(String str) {
        String d = mb3.d(str);
        int i = 0;
        if (d.length() > 0 && d.charAt(0) == '#') {
            u03 f = f(d);
            if (f instanceof a13) {
                d = mb3.d(((a13) f).c());
            }
        }
        if (d.length() > 1) {
            while (true) {
                int i2 = i + 1;
                if (i2 < d.length() && d.charAt(i) == '\\' && d.charAt(i2) == ' ') {
                    i += 2;
                } else {
                    int length = d.length() - 1;
                }
            }
            int length2 = d.length() - 1;
            while (true) {
                int i3 = length2 - 1;
                if (i3 > 0 && d.charAt(i3) == '\\' && d.charAt(length2) == ' ') {
                    length2 -= 2;
                } else if (i > 0 || length2 < d.length() - 1) {
                    d = d.substring(i, length2 + 1);
                }
            }
            d = d.substring(i, length2 + 1);
        }
        return h(d);
    }

    private static u03 f(String str) {
        try {
            return u03.k(qb3.a(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException(C0201.m82(968) + e);
        }
    }

    public static boolean g(i43 i43, i43 i432) {
        if (i43.k()) {
            if (!i432.k()) {
                return false;
            }
            h43[] j = i43.j();
            h43[] j2 = i432.j();
            if (j.length != j2.length) {
                return false;
            }
            for (int i = 0; i != j.length; i++) {
                if (!c(j[i], j2[i])) {
                    return false;
                }
            }
            return true;
        } else if (!i432.k()) {
            return c(i43.g(), i432.g());
        } else {
            return false;
        }
    }

    public static String h(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static String i(g03 g03) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = g03 instanceof a13;
        String r3 = C0201.m82(969);
        int i = 0;
        if (!z || (g03 instanceof l23)) {
            try {
                stringBuffer.append(C0201.m82(970) + d(qb3.b(g03.b().f(C0201.m82(971)))));
            } catch (IOException unused) {
                throw new IllegalArgumentException(C0201.m82(972));
            }
        } else {
            String c = ((a13) g03).c();
            if (c.length() <= 0 || c.charAt(0) != '#') {
                stringBuffer.append(c);
            } else {
                stringBuffer.append(r3 + c);
            }
        }
        int length = stringBuffer.length();
        int i2 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i2 = 0;
        }
        while (i2 != length) {
            if (stringBuffer.charAt(i2) == ',' || stringBuffer.charAt(i2) == '\"' || stringBuffer.charAt(i2) == '\\' || stringBuffer.charAt(i2) == '+' || stringBuffer.charAt(i2) == '=' || stringBuffer.charAt(i2) == '<' || stringBuffer.charAt(i2) == '>' || stringBuffer.charAt(i2) == ';') {
                stringBuffer.insert(i2, r3);
                i2++;
                length++;
            }
            i2++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, r3);
                i += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, '\\');
            length2--;
        }
        return stringBuffer.toString();
    }
}
