package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: ms  reason: default package */
/* compiled from: EpsReader */
public class ms {
    private int a;

    private void a(ls lsVar, String str, String str2) throws IOException {
        Integer num = ls.f.get(str);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 8) {
                f(lsVar, str2);
            } else if (intValue == 36) {
                int i = this.a;
                lsVar.R(i, lsVar.r(this.a) + C0201.m82(32029) + str2);
            } else if (!ls.e.containsKey(num) || lsVar.b(num.intValue())) {
                this.a = 0;
            } else {
                lsVar.R(num.intValue(), str2);
                this.a = num.intValue();
            }
            this.a = num.intValue();
        }
    }

    private static byte[] b(or orVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = false;
        char c = 0;
        byte b = 0;
        int i = 0;
        while (!z) {
            b = orVar.b();
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        int j = j(b);
                        if (j != -1) {
                            i = j * 16;
                            c = 3;
                        } else if (b != 13 && b != 10) {
                            return null;
                        } else {
                            c = 0;
                        }
                    } else if (c == 3) {
                        int j2 = j(b);
                        if (j2 == -1) {
                            return null;
                        }
                        byteArrayOutputStream.write(j2 + i);
                    } else {
                        continue;
                    }
                } else if (b != 32) {
                    z = true;
                }
                c = 2;
            } else if (!(b == 10 || b == 13 || b == 32)) {
                if (b != 37) {
                    return null;
                }
                c = 1;
            }
        }
        while (b != 10) {
            b = orVar.b();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void c(ls lsVar, wr wrVar, or orVar) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.setLength(0);
            while (true) {
                char b = (char) orVar.b();
                if (b != '\r' && b != '\n') {
                    sb.append(b);
                }
            }
            if (sb.length() == 0 || sb.charAt(0) == '%') {
                int indexOf = sb.indexOf(C0201.m82(32030));
                if (indexOf != -1) {
                    str = sb.substring(0, indexOf).trim();
                    a(lsVar, str, sb.substring(indexOf + 1).trim());
                } else {
                    str = sb.toString().trim();
                }
                if (str.equals(C0201.m82(32031))) {
                    g(wrVar, orVar);
                } else if (str.equals(C0201.m82(32032))) {
                    e(wrVar, orVar);
                } else if (str.equals(C0201.m82(32033))) {
                    h(wrVar, orVar);
                }
            } else {
                return;
            }
        }
    }

    private static void e(wr wrVar, or orVar) throws IOException {
        byte[] b = b(orVar);
        if (b != null) {
            new iw().c(new br(b), wrVar);
        }
    }

    private static void f(ls lsVar, String str) throws IOException {
        lsVar.R(8, str.trim());
        String[] split = str.split(C0201.m82(32034));
        int i = 0;
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[3]);
        if (!lsVar.b(28)) {
            lsVar.J(28, parseInt);
        }
        if (!lsVar.b(29)) {
            lsVar.J(29, parseInt2);
        }
        if (!lsVar.b(30)) {
            lsVar.J(30, parseInt3);
        }
        if (!lsVar.b(31)) {
            if (parseInt3 == 1) {
                i = 1;
            } else if (parseInt3 == 2 || parseInt3 == 3 || parseInt3 == 4) {
                i = 3;
            }
            if (i != 0) {
                lsVar.J(31, i * parseInt * parseInt2);
            }
        }
    }

    private static void g(wr wrVar, or orVar) throws IOException {
        byte[] b = b(orVar);
        if (b != null) {
            new u00().c(new nr(b), b.length, wrVar);
        }
    }

    private static void h(wr wrVar, or orVar) throws IOException {
        new m10().c(new String(i(orVar, C0201.m82(32035).getBytes()), fr.a), wrVar);
    }

    private static byte[] i(or orVar, byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i = 0;
        while (i != length) {
            byte b = orVar.b();
            i = b == bArr[i] ? i + 1 : 0;
            byteArrayOutputStream.write(b);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int j(byte b) {
        if (b >= 48 && b <= 57) {
            return b - 48;
        }
        byte b2 = 65;
        if (b < 65 || b > 70) {
            b2 = 97;
            if (b < 97 || b > 102) {
                return -1;
            }
        }
        return (b - b2) + 10;
    }

    public void d(InputStream inputStream, wr wrVar) throws IOException {
        lr lrVar = new lr(inputStream);
        ls lsVar = new ls();
        wrVar.a(lsVar);
        int h = lrVar.h(0);
        if (h == -976170042) {
            lrVar.w(false);
            int h2 = lrVar.h(4);
            int h3 = lrVar.h(8);
            int h4 = lrVar.h(12);
            int h5 = lrVar.h(16);
            int h6 = lrVar.h(20);
            int h7 = lrVar.h(24);
            if (h7 != 0) {
                lsVar.J(32, h7);
                lsVar.J(33, h6);
                try {
                    new xq().d(new br(lrVar.c(h6, h7)), new v00(wrVar, null), 0);
                } catch (wq e) {
                    lsVar.a(C0201.m82(32037) + e.getMessage());
                }
            } else if (h5 != 0) {
                lsVar.J(34, h5);
                lsVar.J(35, h4);
            }
            c(lsVar, wrVar, new nr(lrVar.c(h2, h3)));
        } else if (h != 622940243) {
            lsVar.a(C0201.m82(32036));
        } else {
            inputStream.reset();
            c(lsVar, wrVar, new pr(inputStream));
        }
    }
}
