package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import vigqyno.C0201;

/* renamed from: ic2  reason: default package */
public class ic2 {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public ic2(X500Principal x500Principal) {
        String name = x500Principal.getName(C0201.m82(27547));
        this.a = name;
        this.b = name.length();
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.b;
        String r2 = C0201.m82(27548);
        if (i4 < i5) {
            char c2 = this.g[i];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException(r2 + this.a);
            } else {
                i2 = c2 - '7';
            }
            char c3 = this.g[i4];
            if (c3 >= '0' && c3 <= '9') {
                i3 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i3 = c3 - 'W';
            } else if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException(r2 + this.a);
            } else {
                i3 = c3 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException(r2 + this.a);
    }

    private String c() {
        while (true) {
            int i = this.c;
            if (i >= this.b || this.g[i] != ' ') {
                int i2 = this.c;
            } else {
                this.c = i + 1;
            }
        }
        int i22 = this.c;
        if (i22 == this.b) {
            return null;
        }
        this.d = i22;
        this.c = i22 + 1;
        while (true) {
            int i3 = this.c;
            if (i3 >= this.b) {
                break;
            }
            char[] cArr = this.g;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        int i4 = this.c;
        int i5 = this.b;
        String r4 = C0201.m82(27549);
        if (i4 < i5) {
            this.e = i4;
            if (this.g[i4] == ' ') {
                while (true) {
                    int i6 = this.c;
                    if (i6 >= this.b) {
                        break;
                    }
                    char[] cArr2 = this.g;
                    if (cArr2[i6] == '=' || cArr2[i6] != ' ') {
                        break;
                    }
                    this.c = i6 + 1;
                }
                char[] cArr3 = this.g;
                int i7 = this.c;
                if (cArr3[i7] != '=' || i7 == this.b) {
                    throw new IllegalStateException(r4 + this.a);
                }
            }
            this.c++;
            while (true) {
                int i8 = this.c;
                if (i8 >= this.b || this.g[i8] != ' ') {
                    int i9 = this.e;
                    int i10 = this.d;
                } else {
                    this.c = i8 + 1;
                }
            }
            int i92 = this.e;
            int i102 = this.d;
            if (i92 - i102 > 4) {
                char[] cArr4 = this.g;
                if (cArr4[i102 + 3] == '.' && (cArr4[i102] == 'O' || cArr4[i102] == 'o')) {
                    char[] cArr5 = this.g;
                    int i11 = this.d;
                    if (cArr5[i11 + 1] == 'I' || cArr5[i11 + 1] == 'i') {
                        char[] cArr6 = this.g;
                        int i12 = this.d;
                        if (cArr6[i12 + 2] == 'D' || cArr6[i12 + 2] == 'd') {
                            this.d += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.g;
            int i13 = this.d;
            return new String(cArr7, i13, this.e - i13);
        }
        throw new IllegalStateException(r4 + this.a);
    }

    private String d() {
        int i = this.c + 1;
        this.c = i;
        this.d = i;
        this.e = i;
        while (true) {
            int i2 = this.c;
            if (i2 != this.b) {
                char[] cArr = this.g;
                if (cArr[i2] == '\"') {
                    this.c = i2 + 1;
                    while (true) {
                        int i3 = this.c;
                        if (i3 >= this.b || this.g[i3] != ' ') {
                            char[] cArr2 = this.g;
                            int i4 = this.d;
                        } else {
                            this.c = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.g;
                    int i42 = this.d;
                    return new String(cArr22, i42, this.e - i42);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.e] = g();
                } else {
                    cArr[this.e] = cArr[i2];
                }
                this.c++;
                this.e++;
            } else {
                throw new IllegalStateException(C0201.m82(27550) + this.a);
            }
        }
    }

    private String e() {
        int i = this.c;
        int i2 = i + 4;
        int i3 = this.b;
        String r3 = C0201.m82(27551);
        if (i2 < i3) {
            this.d = i;
            this.c = i + 1;
            while (true) {
                int i4 = this.c;
                if (i4 == this.b) {
                    break;
                }
                char[] cArr = this.g;
                if (cArr[i4] == '+' || cArr[i4] == ',' || cArr[i4] == ';') {
                    break;
                } else if (cArr[i4] == ' ') {
                    this.e = i4;
                    this.c = i4 + 1;
                    while (true) {
                        int i5 = this.c;
                        if (i5 >= this.b || this.g[i5] != ' ') {
                            break;
                        }
                        this.c = i5 + 1;
                    }
                } else {
                    if (cArr[i4] >= 'A' && cArr[i4] <= 'F') {
                        cArr[i4] = (char) (cArr[i4] + ' ');
                    }
                    this.c++;
                }
            }
            this.e = this.c;
            int i6 = this.e;
            int i7 = this.d;
            int i8 = i6 - i7;
            if (i8 < 5 || (i8 & 1) == 0) {
                throw new IllegalStateException(r3 + this.a);
            }
            int i9 = i8 / 2;
            byte[] bArr = new byte[i9];
            int i10 = i7 + 1;
            for (int i11 = 0; i11 < i9; i11++) {
                bArr[i11] = (byte) a(i10);
                i10 += 2;
            }
            return new String(this.g, this.d, i8);
        }
        throw new IllegalStateException(r3 + this.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r1 = r8.g;
        r2 = r8.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        return new java.lang.String(r1, r2, r8.f - r2);
     */
    private String f() {
        int i = this.c;
        this.d = i;
        this.e = i;
        while (true) {
            int i2 = this.c;
            if (i2 < this.b) {
                char[] cArr = this.g;
                char c2 = cArr[i2];
                if (c2 == ' ') {
                    int i3 = this.e;
                    this.f = i3;
                    this.c = i2 + 1;
                    this.e = i3 + 1;
                    cArr[i3] = ' ';
                    while (true) {
                        int i4 = this.c;
                        if (i4 >= this.b) {
                            break;
                        }
                        char[] cArr2 = this.g;
                        if (cArr2[i4] != ' ') {
                            break;
                        }
                        int i5 = this.e;
                        this.e = i5 + 1;
                        cArr2[i5] = ' ';
                        this.c = i4 + 1;
                    }
                    int i6 = this.c;
                    if (i6 == this.b) {
                        break;
                    }
                    char[] cArr3 = this.g;
                    if (cArr3[i6] == ',' || cArr3[i6] == '+' || cArr3[i6] == ';') {
                        break;
                    }
                } else if (c2 == ';') {
                    break;
                } else if (c2 != '\\') {
                    if (c2 == '+' || c2 == ',') {
                        break;
                    }
                    int i7 = this.e;
                    this.e = i7 + 1;
                    cArr[i7] = cArr[i2];
                    this.c = i2 + 1;
                } else {
                    int i8 = this.e;
                    this.e = i8 + 1;
                    cArr[i8] = g();
                    this.c++;
                }
            } else {
                char[] cArr4 = this.g;
                int i9 = this.d;
                return new String(cArr4, i9, this.e - i9);
            }
        }
        char[] cArr5 = this.g;
        int i10 = this.d;
        return new String(cArr5, i10, this.e - i10);
    }

    private char g() {
        int i = this.c + 1;
        this.c = i;
        if (i != this.b) {
            char c2 = this.g[i];
            if (!(c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#')) {
                switch (c2) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c2) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return h();
                        }
                }
            }
            return this.g[this.c];
        }
        throw new IllegalStateException(C0201.m82(27552) + this.a);
    }

    private char h() {
        int i;
        int i2;
        int a2 = a(this.c);
        this.c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return '?';
        }
        if (a2 <= 223) {
            i2 = a2 & 31;
            i = 1;
        } else if (a2 <= 239) {
            i = 2;
            i2 = a2 & 15;
        } else {
            i = 3;
            i2 = a2 & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.c + 1;
            this.c = i4;
            if (i4 == this.b || this.g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.c = i5;
            int a3 = a(i5);
            this.c++;
            if ((a3 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a3 & 63);
        }
        return (char) i2;
    }

    public List<String> b(String str) {
        String str2;
        String r7;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.a.toCharArray();
        List<String> emptyList = Collections.emptyList();
        String c2 = c();
        if (c2 == null) {
            return emptyList;
        }
        do {
            int i = this.c;
            if (i < this.b) {
                char c3 = this.g[i];
                if (c3 == '\"') {
                    str2 = d();
                } else if (c3 != '#') {
                    str2 = (c3 == '+' || c3 == ',' || c3 == ';') ? C0201.m82(27553) : f();
                } else {
                    str2 = e();
                }
                if (str.equalsIgnoreCase(c2)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList<>();
                    }
                    emptyList.add(str2);
                }
                int i2 = this.c;
                if (i2 < this.b) {
                    char[] cArr = this.g;
                    char c4 = cArr[i2];
                    r7 = C0201.m82(27554);
                    if (c4 == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                        this.c++;
                        c2 = c();
                    } else {
                        throw new IllegalStateException(r7 + this.a);
                    }
                }
            }
            return emptyList;
        } while (c2 != null);
        throw new IllegalStateException(r7 + this.a);
    }
}
