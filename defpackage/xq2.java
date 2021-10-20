package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
import vigqyno.C0201;

/* renamed from: xq2  reason: default package */
/* compiled from: COSFloat */
public class xq2 extends cr2 {
    private BigDecimal c;
    private String d;

    public xq2(float f) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f));
        this.c = bigDecimal;
        this.d = H(bigDecimal.toPlainString());
    }

    private String H(String str) {
        if (str.indexOf(46) > -1) {
            String r0 = C0201.m82(30667);
            if (!str.endsWith(r0)) {
                while (str.endsWith(C0201.m82(30668)) && !str.endsWith(r0)) {
                    str = str.substring(0, str.length() - 1);
                }
            }
        }
        return str;
    }

    @Override // defpackage.cr2
    public int A() {
        return this.c.intValue();
    }

    @Override // defpackage.cr2
    public long E() {
        return this.c.longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof xq2) && Float.floatToIntBits(((xq2) obj).c.floatValue()) == Float.floatToIntBits(this.c.floatValue());
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.cr2
    public float r() {
        return this.c.floatValue();
    }

    public String toString() {
        return C0201.m82(30669) + this.d + C0201.m82(30670);
    }

    public xq2(String str) throws IOException {
        try {
            this.d = str;
            this.c = new BigDecimal(this.d);
        } catch (NumberFormatException e) {
            throw new IOException(C0201.m82(30665) + str + C0201.m82(30666), e);
        }
    }
}
