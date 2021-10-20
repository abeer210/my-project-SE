package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o13  reason: default package */
/* compiled from: ConstructedOctetStream */
public class o13 extends InputStream {
    private final z03 a;
    private boolean b = true;
    private InputStream c;

    public o13(z03 z03) {
        this.a = z03;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        r03 r03;
        int i3 = 0;
        if (this.c == null) {
            if (!this.b || (r03 = (r03) this.a.b()) == null) {
                return -1;
            }
            this.b = false;
            this.c = r03.a();
        }
        while (true) {
            int read = this.c.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                r03 r032 = (r03) this.a.b();
                if (r032 == null) {
                    this.c = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.c = r032.a();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        r03 r03;
        if (this.c == null) {
            if (!this.b || (r03 = (r03) this.a.b()) == null) {
                return -1;
            }
            this.b = false;
            this.c = r03.a();
        }
        while (true) {
            int read = this.c.read();
            if (read >= 0) {
                return read;
            }
            r03 r032 = (r03) this.a.b();
            if (r032 == null) {
                this.c = null;
                return -1;
            }
            this.c = r032.a();
        }
    }
}
