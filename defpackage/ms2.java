package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: ms2  reason: default package */
/* compiled from: BaseParser */
public abstract class ms2 {
    public final us2 a;
    public wq2 b;

    public ms2(us2 us2) {
        this.a = us2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    private boolean F() throws IOException {
        int read = this.a.read();
        while (true) {
            boolean z = false;
            if (read != -1 && read != 47 && read != 62) {
                if (read == 101 && this.a.read() == 110 && this.a.read() == 100) {
                    int read2 = this.a.read();
                    boolean z2 = read2 == 115 && this.a.read() == 116 && this.a.read() == 114 && this.a.read() == 101 && this.a.read() == 97 && this.a.read() == 109;
                    if (!z2 && read2 == 111 && this.a.read() == 98 && this.a.read() == 106) {
                        z = true;
                    }
                    if (z2 || z) {
                        return true;
                    }
                }
                read = this.a.read();
            } else if (read != -1) {
                return true;
            } else {
                this.a.unread(read);
                return false;
            }
        }
        if (read != -1) {
        }
    }

    private int a(int i) throws IOException {
        byte[] bArr = new byte[3];
        int read = this.a.read(bArr);
        if ((read == 3 && bArr[0] == 13 && bArr[1] == 10 && bArr[2] == 47) || (bArr[0] == 13 && bArr[1] == 47)) {
            i = 0;
        }
        if (read > 0) {
            this.a.unread(Arrays.copyOfRange(bArr, 0, read));
        }
        return i;
    }

    private tq2 b(er2 er2) throws IOException {
        wq2 wq2 = this.b;
        if (wq2 != null) {
            return wq2.k0(er2);
        }
        throw new IOException(C0201.m82(35077) + er2 + C0201.m82(35078) + this.a.getPosition() + C0201.m82(35079));
    }

    private boolean c(int i) {
        return 13 == i;
    }

    public static boolean e(int i) {
        return i >= 48 && i <= 57;
    }

    private static boolean h(char c) {
        return e(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    private boolean i(int i) {
        return 10 == i;
    }

    private void p(vq2 vq2) throws IOException {
        ar2 s = s();
        tq2 q = q();
        G();
        if (((char) this.a.peek()) == 'd') {
            String D = D();
            if (!D.equals(C0201.m82(35080))) {
                this.a.unread(D.getBytes(ut2.c));
            } else {
                G();
            }
        }
        if (q == null) {
            Log.w(C0201.m82(35082), C0201.m82(35081) + this.a);
            return;
        }
        q.p(true);
        vq2.n1(s, q);
    }

    private tq2 q() throws IOException {
        long position = this.a.getPosition();
        tq2 u = u();
        G();
        if (!d()) {
            return u;
        }
        long position2 = this.a.getPosition();
        tq2 u2 = u();
        G();
        v('R');
        boolean z = u instanceof zq2;
        String r7 = C0201.m82(35083);
        String r8 = C0201.m82(35084);
        if (!z) {
            throw new IOException(r8 + u + r7 + position);
        } else if (u2 instanceof zq2) {
            return b(new er2(((zq2) u).E(), ((zq2) u2).A()));
        } else {
            throw new IOException(r8 + u + r7 + position2);
        }
    }

    private gr2 r() throws IOException {
        int read;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read2 = this.a.read();
            char c = (char) read2;
            if (h(c)) {
                sb.append(c);
            } else if (read2 == 62) {
                break;
            } else {
                String r3 = C0201.m82(35085);
                if (read2 < 0) {
                    throw new IOException(r3);
                } else if (!(read2 == 32 || read2 == 10 || read2 == 9 || read2 == 13 || read2 == 8 || read2 == 12)) {
                    if (sb.length() % 2 != 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    do {
                        read = this.a.read();
                        if (read == 62) {
                            break;
                        }
                    } while (read >= 0);
                    if (read < 0) {
                        throw new IOException(r3);
                    }
                }
            }
        }
        return gr2.A(sb.toString());
    }

    public String A() throws IOException {
        int read;
        if (!this.a.j()) {
            StringBuilder sb = new StringBuilder(11);
            while (true) {
                read = this.a.read();
                if (read != -1 && !f(read)) {
                    sb.append((char) read);
                }
            }
            if (c(read) && i(this.a.peek())) {
                this.a.read();
            }
            return sb.toString();
        }
        throw new IOException(C0201.m82(35086));
    }

    public long B() throws IOException {
        G();
        StringBuilder E = E();
        try {
            return Long.parseLong(E.toString());
        } catch (NumberFormatException e) {
            this.a.unread(E.toString().getBytes(ut2.c));
            throw new IOException(C0201.m82(35087) + this.a.getPosition() + C0201.m82(35088) + ((Object) E) + C0201.m82(35089), e);
        }
    }

    public int C() throws IOException {
        int z = z();
        if (z >= 0 && ((long) z) < 10000000000L) {
            return z;
        }
        throw new IOException(C0201.m82(35090) + z + C0201.m82(35091));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024  */
    public String D() throws IOException {
        G();
        StringBuilder sb = new StringBuilder();
        int read = this.a.read();
        while (true) {
            char c = (char) read;
            if (!g(c) && read != -1) {
                sb.append(c);
                read = this.a.read();
            } else if (read != -1) {
                this.a.unread(read);
            }
        }
        if (read != -1) {
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    public final StringBuilder E() throws IOException {
        int read;
        StringBuilder sb = new StringBuilder();
        while (true) {
            read = this.a.read();
            if (read != 32 && read != 10 && read != 13 && read != 60 && read != 91 && read != 40 && read != 0 && read != -1) {
                sb.append((char) read);
            } else if (read != -1) {
                this.a.unread(read);
            }
        }
        if (read != -1) {
        }
        return sb;
    }

    public void G() throws IOException {
        int read = this.a.read();
        while (true) {
            if (!m(read) && read != 37) {
                break;
            } else if (read == 37) {
                read = this.a.read();
                while (!f(read) && read != -1) {
                    read = this.a.read();
                }
            } else {
                read = this.a.read();
            }
        }
        if (read != -1) {
            this.a.unread(read);
        }
    }

    public void H() throws IOException {
        int read = this.a.read();
        while (32 == read) {
            read = this.a.read();
        }
        if (13 == read) {
            int read2 = this.a.read();
            if (10 != read2) {
                this.a.unread(read2);
            }
        } else if (10 != read) {
            this.a.unread(read);
        }
    }

    public boolean d() throws IOException {
        return e(this.a.peek());
    }

    public boolean f(int i) {
        return i(i) || c(i);
    }

    public boolean g(int i) {
        return i == 32 || i == 13 || i == 10 || i == 9 || i == 62 || i == 60 || i == 91 || i == 47 || i == 93 || i == 41 || i == 40;
    }

    public boolean j() throws IOException {
        return k(this.a.peek());
    }

    public boolean k(int i) {
        return 32 == i;
    }

    public boolean l() throws IOException {
        return m(this.a.peek());
    }

    public boolean m(int i) {
        return i == 0 || i == 9 || i == 12 || i == 10 || i == 13 || i == 32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ce, code lost:
        return r0;
     */
    public sq2 n() throws IOException {
        v('[');
        sq2 sq2 = new sq2();
        G();
        while (true) {
            int peek = this.a.peek();
            if (peek <= 0 || ((char) peek) == ']') {
                this.a.read();
                G();
            } else {
                tq2 u = u();
                if (u instanceof dr2) {
                    if (sq2.x(sq2.size() - 1) instanceof zq2) {
                        zq2 zq2 = (zq2) sq2.H(sq2.size() - 1);
                        if (sq2.x(sq2.size() - 1) instanceof zq2) {
                            u = b(new er2(((zq2) sq2.H(sq2.size() - 1)).E(), zq2.A()));
                        }
                    }
                    u = null;
                }
                if (u != null) {
                    sq2.r(u);
                } else {
                    Log.w(C0201.m82(35093), C0201.m82(35092) + this.a.getPosition());
                    String D = D();
                    this.a.unread(D.getBytes(ut2.c));
                    if (C0201.m82(35094).equals(D) || C0201.m82(35095).equals(D)) {
                        return sq2;
                    }
                }
                G();
            }
        }
        return sq2;
    }

    public vq2 o() throws IOException {
        v('<');
        v('<');
        G();
        vq2 vq2 = new vq2();
        boolean z = false;
        while (!z) {
            G();
            char peek = (char) this.a.peek();
            if (peek == '>') {
                z = true;
            } else if (peek == '/') {
                p(vq2);
            } else {
                Log.w(C0201.m82(35098), C0201.m82(35096) + peek + C0201.m82(35097));
                if (F()) {
                    return vq2;
                }
            }
        }
        v('>');
        v('>');
        return vq2;
    }

    public ar2 s() throws IOException {
        char c;
        v('/');
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read = this.a.read();
        while (read != -1) {
            if (read == 35) {
                char read2 = (char) this.a.read();
                char read3 = (char) this.a.read();
                if (!h(read2) || !h(read3)) {
                    this.a.unread(read3);
                    byteArrayOutputStream.write(read);
                    c = read2;
                } else {
                    String str = C0201.m82(35099) + read2 + read3;
                    try {
                        byteArrayOutputStream.write(Integer.parseInt(str, 16));
                        c = this.a.read();
                    } catch (NumberFormatException e) {
                        throw new IOException(C0201.m82(35100) + str + C0201.m82(35101), e);
                    }
                }
                read = c == 1 ? 1 : 0;
            } else if (g(read)) {
                break;
            } else {
                byteArrayOutputStream.write(read);
                read = this.a.read();
            }
        }
        if (read != -1) {
            this.a.unread(read);
        }
        return ar2.A(new String(byteArrayOutputStream.toByteArray(), ut2.d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0017 A[SYNTHETIC] */
    public gr2 t() throws IOException {
        char read = (char) this.a.read();
        if (read == '(') {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int read2 = this.a.read();
            int i = 1;
            while (i > 0 && read2 != -1) {
                char c = (char) read2;
                if (c == ')') {
                    i = a(i - 1);
                    if (i != 0) {
                        byteArrayOutputStream.write(c);
                    }
                } else if (c == '(') {
                    i++;
                    byteArrayOutputStream.write(c);
                } else if (c == '\\') {
                    char read3 = (char) this.a.read();
                    if (read3 == '\n' || read3 == '\r') {
                        read2 = this.a.read();
                        while (f(read2) && read2 != -1) {
                            read2 = this.a.read();
                        }
                        if (read2 == -2) {
                            read2 = this.a.read();
                        }
                    } else {
                        if (read3 != '\\') {
                            if (read3 == 'b') {
                                byteArrayOutputStream.write(8);
                            } else if (read3 == 'f') {
                                byteArrayOutputStream.write(12);
                            } else if (read3 == 'n') {
                                byteArrayOutputStream.write(10);
                            } else if (read3 == 'r') {
                                byteArrayOutputStream.write(13);
                            } else if (read3 == 't') {
                                byteArrayOutputStream.write(9);
                            } else if (read3 != '(') {
                                if (read3 != ')') {
                                    switch (read3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append(read3);
                                            read2 = this.a.read();
                                            char c2 = (char) read2;
                                            if (c2 >= '0' && c2 <= '7') {
                                                stringBuffer.append(c2);
                                                read2 = this.a.read();
                                                char c3 = (char) read2;
                                                if (c3 >= '0' && c3 <= '7') {
                                                    stringBuffer.append(c3);
                                                    read2 = -2;
                                                }
                                            }
                                            try {
                                                byteArrayOutputStream.write(Integer.parseInt(stringBuffer.toString(), 8));
                                                break;
                                            } catch (NumberFormatException e) {
                                                throw new IOException(C0201.m82(35102) + ((Object) stringBuffer) + C0201.m82(35103), e);
                                            }
                                        default:
                                            byteArrayOutputStream.write(read3);
                                            break;
                                    }
                                    if (read2 == -2) {
                                    }
                                } else {
                                    i = a(i);
                                    if (i != 0) {
                                        byteArrayOutputStream.write(read3);
                                    } else {
                                        byteArrayOutputStream.write(92);
                                    }
                                }
                            }
                        }
                        byteArrayOutputStream.write(read3);
                    }
                } else {
                    byteArrayOutputStream.write(c);
                }
                read2 = -2;
                if (read2 == -2) {
                }
            }
            if (read2 != -1) {
                this.a.unread(read2);
            }
            return new gr2(byteArrayOutputStream.toByteArray());
        } else if (read == '<') {
            return r();
        } else {
            throw new IOException(C0201.m82(35104) + read + C0201.m82(35105) + this.a);
        }
    }

    public tq2 u() throws IOException {
        G();
        char peek = (char) this.a.peek();
        if (peek == '(') {
            return t();
        }
        if (peek == '/') {
            return s();
        }
        if (peek == '<') {
            int read = this.a.read();
            char peek2 = (char) this.a.peek();
            this.a.unread(read);
            if (peek2 != '<') {
                return t();
            }
            vq2 o = o();
            G();
            return o;
        } else if (peek == 'R') {
            this.a.read();
            return new dr2(null);
        } else if (peek == '[') {
            return n();
        } else {
            String r3 = C0201.m82(35106);
            String r4 = C0201.m82(35107);
            if (peek == 'f') {
                String str = new String(this.a.i(5), ut2.c);
                if (str.equals(C0201.m82(35118))) {
                    return uq2.c;
                }
                throw new IOException(C0201.m82(35119) + str + r4 + this.a + r3 + this.a.getPosition());
            } else if (peek == 'n') {
                w(C0201.m82(35117));
                return br2.a;
            } else if (peek == 't') {
                String str2 = new String(this.a.i(4), ut2.c);
                if (str2.equals(C0201.m82(35115))) {
                    return uq2.b;
                }
                throw new IOException(C0201.m82(35116) + str2 + r4 + this.a + r3 + this.a.getPosition());
            } else if (peek == 65535) {
                return null;
            } else {
                if (Character.isDigit(peek) || peek == '-' || peek == '+' || peek == '.') {
                    StringBuilder sb = new StringBuilder();
                    int read2 = this.a.read();
                    while (true) {
                        char c = (char) read2;
                        if (!Character.isDigit(c) && c != '-' && c != '+' && c != '.' && c != 'E' && c != 'e') {
                            break;
                        }
                        sb.append(c);
                        read2 = this.a.read();
                    }
                    if (read2 != -1) {
                        this.a.unread(read2);
                    }
                    return cr2.x(sb.toString());
                }
                String D = D();
                if (D == null || D.length() == 0) {
                    int peek3 = this.a.peek();
                    throw new IOException(C0201.m82(35110) + peek + C0201.m82(35111) + ((int) peek) + C0201.m82(35112) + ((char) peek3) + C0201.m82(35113) + peek3 + C0201.m82(35114) + this.a.getPosition());
                } else if (!C0201.m82(35108).equals(D) && !C0201.m82(35109).equals(D)) {
                    return null;
                } else {
                    this.a.unread(D.getBytes(ut2.c));
                    return null;
                }
            }
        }
    }

    public void v(char c) throws IOException {
        char read = (char) this.a.read();
        if (read != c) {
            throw new IOException(C0201.m82(35120) + c + C0201.m82(35121) + read + C0201.m82(35122) + this.a.getPosition());
        }
    }

    public void w(String str) throws IOException {
        x(str.toCharArray(), false);
    }

    public final void x(char[] cArr, boolean z) throws IOException {
        G();
        for (char c : cArr) {
            if (this.a.read() != c) {
                throw new IOException(C0201.m82(35123) + new String(cArr) + C0201.m82(35124) + c + C0201.m82(35125) + this.a.getPosition());
            }
        }
        G();
    }

    public int y() throws IOException {
        int z = z();
        if (z >= 0 && ((long) z) <= 65535) {
            return z;
        }
        throw new IOException(C0201.m82(35126) + z + C0201.m82(35127));
    }

    public int z() throws IOException {
        G();
        StringBuilder E = E();
        try {
            return Integer.parseInt(E.toString());
        } catch (NumberFormatException e) {
            this.a.unread(E.toString().getBytes(ut2.c));
            throw new IOException(C0201.m82(35128) + this.a.getPosition(), e);
        }
    }
}
