package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: c13  reason: default package */
/* compiled from: ASN1UTCTime */
public class c13 extends u03 {
    private byte[] a;

    public c13(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof c13)) {
            return false;
        }
        return hb3.a(this.a, ((c13) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.h(this.a);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.c(23);
        int length = this.a.length;
        s03.i(length);
        for (int i = 0; i != length; i++) {
            s03.c(this.a[i]);
        }
    }

    @Override // defpackage.u03
    public int j() {
        int length = this.a.length;
        return a33.a(length) + 1 + length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public String q() {
        String r = r();
        if (r.charAt(0) < '5') {
            return C0201.m82(36963) + r;
        }
        return C0201.m82(36964) + r;
    }

    public String r() {
        String b = mb3.b(this.a);
        if (b.indexOf(45) >= 0 || b.indexOf(43) >= 0) {
            int indexOf = b.indexOf(45);
            if (indexOf < 0) {
                indexOf = b.indexOf(43);
            }
            if (indexOf == b.length() - 3) {
                b = b + C0201.m82(36967);
            }
            String r2 = C0201.m82(36968);
            if (indexOf == 10) {
                return b.substring(0, 10) + C0201.m82(36969) + b.substring(10, 13) + r2 + b.substring(13, 15);
            }
            return b.substring(0, 12) + C0201.m82(36970) + b.substring(12, 15) + r2 + b.substring(15, 17);
        } else if (b.length() == 11) {
            return b.substring(0, 10) + C0201.m82(36965);
        } else {
            return b.substring(0, 12) + C0201.m82(36966);
        }
    }

    public String toString() {
        return mb3.b(this.a);
    }
}
