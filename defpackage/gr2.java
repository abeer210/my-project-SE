package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: gr2  reason: default package */
/* compiled from: COSString */
public final class gr2 extends tq2 {
    public static final boolean c = Boolean.getBoolean(C0201.m82(35642));
    private byte[] a;
    private boolean b;

    public gr2(byte[] bArr) {
        E(bArr);
    }

    public static gr2 A(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuilder sb = new StringBuilder(str.trim());
        if (sb.length() % 2 != 0) {
            sb.append('0');
        }
        int length = sb.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            try {
                byteArrayOutputStream.write(Integer.parseInt(sb.substring(i, i2), 16));
            } catch (NumberFormatException e) {
                if (c) {
                    Log.w(C0201.m82(35643), C0201.m82(35644));
                    byteArrayOutputStream.write(63);
                } else {
                    throw new IOException(C0201.m82(35645) + str, e);
                }
            }
            i = i2;
        }
        return new gr2(byteArrayOutputStream.toByteArray());
    }

    public void E(byte[] bArr) {
        this.a = (byte[]) bArr.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gr2)) {
            return false;
        }
        gr2 gr2 = (gr2) obj;
        if (!x().equals(gr2.x()) || this.b != gr2.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a) + (this.b ? 17 : 0);
    }

    public byte[] r() {
        return this.a;
    }

    public String toString() {
        return C0201.m82(35646) + x() + C0201.m82(35647);
    }

    public String x() {
        byte[] bArr = this.a;
        if (bArr.length > 2) {
            if ((bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) {
                byte[] bArr2 = this.a;
                return new String(bArr2, 2, bArr2.length - 2, ut2.a);
            }
            byte[] bArr3 = this.a;
            if ((bArr3[0] & 255) == 255 && (bArr3[1] & 255) == 254) {
                byte[] bArr4 = this.a;
                return new String(bArr4, 2, bArr4.length - 2, ut2.b);
            }
        }
        return hr2.b(this.a);
    }
}
