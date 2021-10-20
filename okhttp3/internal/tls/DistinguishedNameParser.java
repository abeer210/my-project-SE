package okhttp3.internal.tls;

import javax.security.auth.x500.X500Principal;
import vigqyno.C0201;

public final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    public DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName(C0201.m82(2434));
        this.dn = name;
        this.length = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r1 = r8.chars;
        r2 = r8.beg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        return new java.lang.String(r1, r2, r8.cur - r2);
     */
    private String escapedAV() {
        int i = this.pos;
        this.beg = i;
        this.end = i;
        while (true) {
            int i2 = this.pos;
            if (i2 < this.length) {
                char[] cArr = this.chars;
                char c = cArr[i2];
                if (c == ' ') {
                    int i3 = this.end;
                    this.cur = i3;
                    this.pos = i2 + 1;
                    this.end = i3 + 1;
                    cArr[i3] = ' ';
                    while (true) {
                        int i4 = this.pos;
                        if (i4 >= this.length) {
                            break;
                        }
                        char[] cArr2 = this.chars;
                        if (cArr2[i4] != ' ') {
                            break;
                        }
                        int i5 = this.end;
                        this.end = i5 + 1;
                        cArr2[i5] = ' ';
                        this.pos = i4 + 1;
                    }
                    int i6 = this.pos;
                    if (i6 == this.length) {
                        break;
                    }
                    char[] cArr3 = this.chars;
                    if (cArr3[i6] == ',' || cArr3[i6] == '+' || cArr3[i6] == ';') {
                        break;
                    }
                } else if (c == ';') {
                    break;
                } else if (c != '\\') {
                    if (c == '+' || c == ',') {
                        break;
                    }
                    int i7 = this.end;
                    this.end = i7 + 1;
                    cArr[i7] = cArr[i2];
                    this.pos = i2 + 1;
                } else {
                    int i8 = this.end;
                    this.end = i8 + 1;
                    cArr[i8] = getEscaped();
                    this.pos++;
                }
            } else {
                char[] cArr4 = this.chars;
                int i9 = this.beg;
                return new String(cArr4, i9, this.end - i9);
            }
        }
        char[] cArr5 = this.chars;
        int i10 = this.beg;
        return new String(cArr5, i10, this.end - i10);
    }

    private int getByte(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.length;
        String r2 = C0201.m82(2435);
        if (i4 < i5) {
            char c = this.chars[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException(r2 + this.dn);
            } else {
                i2 = c - '7';
            }
            char c2 = this.chars[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException(r2 + this.dn);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException(r2 + this.dn);
    }

    private char getEscaped() {
        int i = this.pos + 1;
        this.pos = i;
        if (i != this.length) {
            char c = this.chars[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return getUTF8();
                        }
                }
            }
            return this.chars[this.pos];
        }
        throw new IllegalStateException(C0201.m82(2436) + this.dn);
    }

    private char getUTF8() {
        int i;
        int i2;
        int i3 = getByte(this.pos);
        this.pos++;
        if (i3 < 128) {
            return (char) i3;
        }
        if (i3 < 192 || i3 > 247) {
            return '?';
        }
        if (i3 <= 223) {
            i2 = i3 & 31;
            i = 1;
        } else if (i3 <= 239) {
            i = 2;
            i2 = i3 & 15;
        } else {
            i = 3;
            i2 = i3 & 7;
        }
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.pos + 1;
            this.pos = i5;
            if (i5 == this.length || this.chars[i5] != '\\') {
                return '?';
            }
            int i6 = i5 + 1;
            this.pos = i6;
            int i7 = getByte(i6);
            this.pos++;
            if ((i7 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (i7 & 63);
        }
        return (char) i2;
    }

    private String hexAV() {
        int i = this.pos;
        int i2 = i + 4;
        int i3 = this.length;
        String r3 = C0201.m82(2437);
        if (i2 < i3) {
            this.beg = i;
            this.pos = i + 1;
            while (true) {
                int i4 = this.pos;
                if (i4 == this.length) {
                    break;
                }
                char[] cArr = this.chars;
                if (cArr[i4] == '+' || cArr[i4] == ',' || cArr[i4] == ';') {
                    break;
                } else if (cArr[i4] == ' ') {
                    this.end = i4;
                    this.pos = i4 + 1;
                    while (true) {
                        int i5 = this.pos;
                        if (i5 >= this.length || this.chars[i5] != ' ') {
                            break;
                        }
                        this.pos = i5 + 1;
                    }
                } else {
                    if (cArr[i4] >= 'A' && cArr[i4] <= 'F') {
                        cArr[i4] = (char) (cArr[i4] + ' ');
                    }
                    this.pos++;
                }
            }
            this.end = this.pos;
            int i6 = this.end;
            int i7 = this.beg;
            int i8 = i6 - i7;
            if (i8 < 5 || (i8 & 1) == 0) {
                throw new IllegalStateException(r3 + this.dn);
            }
            int i9 = i8 / 2;
            byte[] bArr = new byte[i9];
            int i10 = i7 + 1;
            for (int i11 = 0; i11 < i9; i11++) {
                bArr[i11] = (byte) getByte(i10);
                i10 += 2;
            }
            return new String(this.chars, this.beg, i8);
        }
        throw new IllegalStateException(r3 + this.dn);
    }

    private String nextAT() {
        while (true) {
            int i = this.pos;
            if (i >= this.length || this.chars[i] != ' ') {
                int i2 = this.pos;
            } else {
                this.pos = i + 1;
            }
        }
        int i22 = this.pos;
        if (i22 == this.length) {
            return null;
        }
        this.beg = i22;
        this.pos = i22 + 1;
        while (true) {
            int i3 = this.pos;
            if (i3 >= this.length) {
                break;
            }
            char[] cArr = this.chars;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.pos = i3 + 1;
        }
        int i4 = this.pos;
        int i5 = this.length;
        String r4 = C0201.m82(2438);
        if (i4 < i5) {
            this.end = i4;
            if (this.chars[i4] == ' ') {
                while (true) {
                    int i6 = this.pos;
                    if (i6 >= this.length) {
                        break;
                    }
                    char[] cArr2 = this.chars;
                    if (cArr2[i6] == '=' || cArr2[i6] != ' ') {
                        break;
                    }
                    this.pos = i6 + 1;
                }
                char[] cArr3 = this.chars;
                int i7 = this.pos;
                if (cArr3[i7] != '=' || i7 == this.length) {
                    throw new IllegalStateException(r4 + this.dn);
                }
            }
            this.pos++;
            while (true) {
                int i8 = this.pos;
                if (i8 >= this.length || this.chars[i8] != ' ') {
                    int i9 = this.end;
                    int i10 = this.beg;
                } else {
                    this.pos = i8 + 1;
                }
            }
            int i92 = this.end;
            int i102 = this.beg;
            if (i92 - i102 > 4) {
                char[] cArr4 = this.chars;
                if (cArr4[i102 + 3] == '.' && (cArr4[i102] == 'O' || cArr4[i102] == 'o')) {
                    char[] cArr5 = this.chars;
                    int i11 = this.beg;
                    if (cArr5[i11 + 1] == 'I' || cArr5[i11 + 1] == 'i') {
                        char[] cArr6 = this.chars;
                        int i12 = this.beg;
                        if (cArr6[i12 + 2] == 'D' || cArr6[i12 + 2] == 'd') {
                            this.beg += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.chars;
            int i13 = this.beg;
            return new String(cArr7, i13, this.end - i13);
        }
        throw new IllegalStateException(r4 + this.dn);
    }

    private String quotedAV() {
        int i = this.pos + 1;
        this.pos = i;
        this.beg = i;
        this.end = i;
        while (true) {
            int i2 = this.pos;
            if (i2 != this.length) {
                char[] cArr = this.chars;
                if (cArr[i2] == '\"') {
                    this.pos = i2 + 1;
                    while (true) {
                        int i3 = this.pos;
                        if (i3 >= this.length || this.chars[i3] != ' ') {
                            char[] cArr2 = this.chars;
                            int i4 = this.beg;
                        } else {
                            this.pos = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.chars;
                    int i42 = this.beg;
                    return new String(cArr22, i42, this.end - i42);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.end] = getEscaped();
                } else {
                    cArr[this.end] = cArr[i2];
                }
                this.pos++;
                this.end++;
            } else {
                throw new IllegalStateException(C0201.m82(2439) + this.dn);
            }
        }
    }

    public String findMostSpecific(String str) {
        String str2;
        String r7;
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String nextAT = nextAT();
        if (nextAT == null) {
            return null;
        }
        do {
            int i = this.pos;
            if (i == this.length) {
                return null;
            }
            char c = this.chars[i];
            if (c == '\"') {
                str2 = quotedAV();
            } else if (c != '#') {
                str2 = (c == '+' || c == ',' || c == ';') ? C0201.m82(2440) : escapedAV();
            } else {
                str2 = hexAV();
            }
            if (str.equalsIgnoreCase(nextAT)) {
                return str2;
            }
            int i2 = this.pos;
            if (i2 >= this.length) {
                return null;
            }
            char[] cArr = this.chars;
            char c2 = cArr[i2];
            r7 = C0201.m82(2441);
            if (c2 == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.pos++;
                nextAT = nextAT();
            } else {
                throw new IllegalStateException(r7 + this.dn);
            }
        } while (nextAT != null);
        throw new IllegalStateException(r7 + this.dn);
    }
}
