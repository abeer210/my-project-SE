package defpackage;

/* renamed from: et2  reason: default package */
/* compiled from: AccessPermission */
public class et2 {
    private int a;
    private boolean b;

    public et2() {
        this.a = -4;
        this.b = false;
        this.a = -4;
    }

    public static et2 a() {
        et2 et2 = new et2();
        et2.b(true);
        et2.c(true);
        et2.d(true);
        et2.e(true);
        et2.f(true);
        et2.g(true);
        et2.h(true);
        et2.i(true);
        return et2;
    }

    private boolean j(int i, boolean z) {
        int i2 = this.a;
        int i3 = z ? (1 << (i - 1)) | i2 : ((1 << (i - 1)) ^ -1) & i2;
        this.a = i3;
        if (((1 << (i - 1)) & i3) != 0) {
            return true;
        }
        return false;
    }

    public void b(boolean z) {
        if (!this.b) {
            j(11, z);
        }
    }

    public void c(boolean z) {
        if (!this.b) {
            j(5, z);
        }
    }

    public void d(boolean z) {
        if (!this.b) {
            j(10, z);
        }
    }

    public void e(boolean z) {
        if (!this.b) {
            j(9, z);
        }
    }

    public void f(boolean z) {
        if (!this.b) {
            j(4, z);
        }
    }

    public void g(boolean z) {
        if (!this.b) {
            j(6, z);
        }
    }

    public void h(boolean z) {
        if (!this.b) {
            j(3, z);
        }
    }

    public void i(boolean z) {
        if (!this.b) {
            j(12, z);
        }
    }

    public void k() {
        this.b = true;
    }

    public et2(byte[] bArr) {
        this.a = -4;
        this.b = false;
        this.a = 0;
        int i = 0 | (bArr[0] & 255);
        this.a = i;
        int i2 = i << 8;
        this.a = i2;
        int i3 = i2 | (bArr[1] & 255);
        this.a = i3;
        int i4 = i3 << 8;
        this.a = i4;
        int i5 = i4 | (bArr[2] & 255);
        this.a = i5;
        int i6 = i5 << 8;
        this.a = i6;
        this.a = (bArr[3] & 255) | i6;
    }

    public et2(int i) {
        this.a = -4;
        this.b = false;
        this.a = i;
    }
}
