package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: e03  reason: default package */
/* compiled from: ASN1Boolean */
public class e03 extends u03 {
    private static final byte[] b = {-1};
    private static final byte[] c = {0};
    public static final e03 d = new e03(false);
    public static final e03 e = new e03(true);
    private final byte[] a;

    public e03(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException(C0201.m82(16119));
        } else if (bArr[0] == 0) {
            this.a = c;
        } else if ((bArr[0] & 255) == 255) {
            this.a = b;
        } else {
            this.a = hb3.d(bArr);
        }
    }

    public static e03 q(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException(C0201.m82(16120));
        } else if (bArr[0] == 0) {
            return d;
        } else {
            if ((bArr[0] & 255) == 255) {
                return e;
            }
            return new e03(bArr);
        }
    }

    public static e03 r(Object obj) {
        if (obj == null || (obj instanceof e03)) {
            return (e03) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (e03) u03.k((byte[]) obj);
            } catch (IOException e2) {
                throw new IllegalArgumentException(C0201.m82(16121) + e2.getMessage());
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(16122) + obj.getClass().getName());
        }
    }

    public static e03 s(boolean z) {
        return z ? e : d;
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof e03) || this.a[0] != ((e03) u03).a[0]) {
            return false;
        }
        return true;
    }

    @Override // defpackage.o03
    public int hashCode() {
        return this.a[0];
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.g(1, this.a);
    }

    @Override // defpackage.u03
    public int j() {
        return 3;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public boolean t() {
        return this.a[0] != 0;
    }

    public String toString() {
        return this.a[0] != 0 ? C0201.m82(16123) : C0201.m82(16124);
    }

    public e03(boolean z) {
        this.a = z ? b : c;
    }
}
