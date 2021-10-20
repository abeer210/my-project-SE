package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: t23  reason: default package */
/* compiled from: DefiniteLengthInputStream */
public class t23 extends y23 {
    private static final byte[] e = new byte[0];
    private final int c;
    private int d;

    public t23(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i >= 0) {
            this.c = i;
            this.d = i;
            if (i == 0) {
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(31713));
    }

    @Override // defpackage.y23
    public int a() {
        return this.d;
    }

    public byte[] h() throws IOException {
        int i = this.d;
        if (i == 0) {
            return e;
        }
        byte[] bArr = new byte[i];
        int c2 = i - sb3.c(this.a, bArr);
        this.d = c2;
        if (c2 == 0) {
            c(true);
            return bArr;
        }
        throw new EOFException(C0201.m82(31714) + this.c + C0201.m82(31715) + this.d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read();
        if (read >= 0) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                c(true);
            }
            return read;
        }
        throw new EOFException(C0201.m82(31716) + this.c + C0201.m82(31717) + this.d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.d - read;
            this.d = i4;
            if (i4 == 0) {
                c(true);
            }
            return read;
        }
        throw new EOFException(C0201.m82(31718) + this.c + C0201.m82(31719) + this.d);
    }
}
