package defpackage;

import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: qz0  reason: default package */
public final class qz0 extends yy0<qz0> implements Cloneable {
    private byte[] c = gz0.e;
    private String d = C0201.m82(27948);
    private byte[][] e = gz0.d;

    public qz0() {
        this.b = null;
        this.a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final qz0 clone() {
        try {
            qz0 qz0 = (qz0) super.clone();
            byte[][] bArr = this.e;
            if (bArr != null && bArr.length > 0) {
                qz0.e = (byte[][]) bArr.clone();
            }
            return qz0;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final void a(wy0 wy0) throws IOException {
        if (!Arrays.equals(this.c, gz0.e)) {
            wy0.d(1, this.c);
        }
        byte[][] bArr = this.e;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.e;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    wy0.d(2, bArr3);
                }
                i++;
            }
        }
        String str = this.d;
        if (str != null && !str.equals(C0201.m82(27949))) {
            wy0.c(4, this.d);
        }
        super.a(wy0);
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final int d() {
        int d2 = super.d();
        if (!Arrays.equals(this.c, gz0.e)) {
            d2 += wy0.i(1, this.c);
        }
        byte[][] bArr = this.e;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.e;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += wy0.s(bArr3);
                }
                i++;
            }
            d2 = d2 + i2 + (i3 * 1);
        }
        String str = this.d;
        return (str == null || str.equals(C0201.m82(27950))) ? d2 : d2 + wy0.h(4, this.d);
    }

    @Override // defpackage.yy0, defpackage.dz0
    public final /* synthetic */ dz0 e() throws CloneNotSupportedException {
        return (qz0) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qz0)) {
            return false;
        }
        qz0 qz0 = (qz0) obj;
        if (!Arrays.equals(this.c, qz0.c)) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            if (qz0.d != null) {
                return false;
            }
        } else if (!str.equals(qz0.d)) {
            return false;
        }
        if (!cz0.i(this.e, qz0.e)) {
            return false;
        }
        az0 az0 = this.b;
        if (az0 != null && !az0.a()) {
            return this.b.equals(qz0.b);
        }
        az0 az02 = qz0.b;
        return az02 == null || az02.a();
    }

    /* Return type fixed from 'yy0' to match base method */
    @Override // defpackage.yy0
    public final /* synthetic */ qz0 f() throws CloneNotSupportedException {
        return (qz0) clone();
    }

    public final int hashCode() {
        int hashCode = (((qz0.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.c)) * 31;
        String str = this.d;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + cz0.g(this.e)) * 31) + 1237) * 31;
        az0 az0 = this.b;
        if (az0 != null && !az0.a()) {
            i = this.b.hashCode();
        }
        return hashCode2 + i;
    }
}
