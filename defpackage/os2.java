package defpackage;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: os2  reason: default package */
/* compiled from: EndstreamOutputStream */
public class os2 extends BufferedOutputStream {
    private boolean a = false;
    private boolean b = false;
    private int c = 0;
    private boolean d = true;

    public os2(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.BufferedOutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.a && !this.b) {
            super.write(13);
            this.c++;
        }
        this.a = false;
        this.b = false;
        super.flush();
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.BufferedOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.c == 0 && i2 > 10) {
            this.d = false;
            int i3 = 0;
            while (true) {
                if (i3 >= 10) {
                    break;
                } else if (bArr[i3] < 9 || (bArr[i3] > 10 && bArr[i3] < 32 && bArr[i3] != 13)) {
                    this.d = true;
                } else {
                    i3++;
                }
            }
            this.d = true;
        }
        if (this.d) {
            if (this.a) {
                this.a = false;
                if (this.b || i2 != 1 || bArr[i] != 10) {
                    super.write(13);
                } else {
                    return;
                }
            }
            if (this.b) {
                super.write(10);
                this.b = false;
            }
            if (i2 > 0) {
                int i4 = (i + i2) - 1;
                if (bArr[i4] == 13) {
                    this.a = true;
                } else if (bArr[i4] == 10) {
                    this.b = true;
                    i2--;
                    if (i2 > 0 && bArr[(i + i2) - 1] == 13) {
                        this.a = true;
                    }
                }
                i2--;
            }
        }
        super.write(bArr, i, i2);
        this.c += i2;
    }
}
