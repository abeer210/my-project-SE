package defpackage;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

/* renamed from: a9  reason: default package */
public class a9 extends PushbackReader {
    private int a = 0;
    private int b = 0;
    private int c = 0;

    public a9(Reader reader) {
        super(reader, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (defpackage.g9.c((char) r10.b) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (defpackage.g9.c((char) r10.b) != false) goto L_0x0044;
     */
    private char a(char c2) {
        int i = this.a;
        if (i == 0) {
            if (c2 == '&') {
                this.a = 1;
            }
            return c2;
        } else if (i == 1) {
            if (c2 == '#') {
                this.a = 2;
            } else {
                this.a = 5;
            }
            return c2;
        } else if (i != 2) {
            if (i == 3) {
                if (('0' <= c2 && c2 <= '9') || (('a' <= c2 && c2 <= 'f') || ('A' <= c2 && c2 <= 'F'))) {
                    this.b = (this.b * 16) + Character.digit(c2, 16);
                    int i2 = this.c + 1;
                    this.c = i2;
                    if (i2 <= 4) {
                        this.a = 3;
                        return c2;
                    }
                } else if (c2 == ';') {
                }
                this.a = 5;
                return c2;
            } else if (i == 4) {
                if ('0' <= c2 && c2 <= '9') {
                    this.b = (this.b * 10) + Character.digit(c2, 10);
                    int i3 = this.c + 1;
                    this.c = i3;
                    if (i3 <= 5) {
                        this.a = 4;
                        return c2;
                    }
                } else if (c2 == ';') {
                }
                this.a = 5;
                return c2;
            } else if (i != 5) {
                return c2;
            } else {
                this.a = 0;
                return c2;
            }
            this.a = 0;
            return (char) this.b;
        } else {
            if (c2 == 'x') {
                this.b = 0;
                this.c = 0;
                this.a = 3;
            } else if ('0' > c2 || c2 > '9') {
                this.a = 5;
            } else {
                this.b = Character.digit(c2, 10);
                this.c = 1;
                this.a = 4;
            }
            return c2;
        }
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        char[] cArr2 = new char[8];
        boolean z = true;
        int i3 = 0;
        loop0:
        while (true) {
            int i4 = 0;
            while (z && i3 < i2) {
                z = super.read(cArr2, i4, 1) == 1;
                if (z) {
                    char a2 = a(cArr2[i4]);
                    int i5 = this.a;
                    if (i5 == 0) {
                        if (g9.c(a2)) {
                            a2 = ' ';
                        }
                        cArr[i] = a2;
                        i3++;
                        i++;
                    } else {
                        i4++;
                        if (i5 == 5) {
                            unread(cArr2, 0, i4);
                        }
                    }
                } else if (i4 > 0) {
                    unread(cArr2, 0, i4);
                    this.a = 5;
                    z = true;
                }
            }
        }
        if (i3 > 0 || z) {
            return i3;
        }
        return -1;
    }
}
