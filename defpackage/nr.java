package defpackage;

import java.io.EOFException;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: nr  reason: default package */
/* compiled from: SequentialByteArrayReader */
public class nr extends or {
    private final byte[] b;
    private int c;

    public nr(byte[] bArr) {
        this(bArr, 0);
    }

    @Override // defpackage.or
    public int a() {
        return this.b.length - this.c;
    }

    @Override // defpackage.or
    public byte b() throws IOException {
        int i = this.c;
        byte[] bArr = this.b;
        if (i < bArr.length) {
            this.c = i + 1;
            return bArr[i];
        }
        throw new EOFException(C0201.m82(33733));
    }

    @Override // defpackage.or
    public void c(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c;
        int i4 = i3 + i2;
        byte[] bArr2 = this.b;
        if (i4 <= bArr2.length) {
            System.arraycopy(bArr2, i3, bArr, i, i2);
            this.c += i2;
            return;
        }
        throw new EOFException(C0201.m82(33734));
    }

    @Override // defpackage.or
    public byte[] d(int i) throws IOException {
        int i2 = this.c;
        int i3 = i2 + i;
        byte[] bArr = this.b;
        if (i3 <= bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, i2, bArr2, 0, i);
            this.c += i;
            return bArr2;
        }
        throw new EOFException(C0201.m82(33735));
    }

    @Override // defpackage.or
    public long l() {
        return (long) this.c;
    }

    @Override // defpackage.or
    public void t(long j) throws IOException {
        if (j >= 0) {
            int i = this.c;
            if (((long) i) + j <= ((long) this.b.length)) {
                this.c = (int) (((long) i) + j);
                return;
            }
            throw new EOFException(C0201.m82(33736));
        }
        throw new IllegalArgumentException(C0201.m82(33737));
    }

    @Override // defpackage.or
    public boolean u(long j) throws IOException {
        if (j >= 0) {
            int i = (int) (((long) this.c) + j);
            this.c = i;
            byte[] bArr = this.b;
            if (i <= bArr.length) {
                return true;
            }
            this.c = bArr.length;
            return false;
        }
        throw new IllegalArgumentException(C0201.m82(33738));
    }

    public nr(byte[] bArr, int i) {
        if (bArr != null) {
            this.b = bArr;
            this.c = i;
            return;
        }
        throw null;
    }
}
