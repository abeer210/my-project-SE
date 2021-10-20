package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: cr2  reason: default package */
/* compiled from: COSNumber */
public abstract class cr2 extends tq2 {
    @Deprecated
    public static final zq2 a = zq2.e;
    @Deprecated
    public static final zq2 b = zq2.f;

    public static cr2 x(String str) throws IOException {
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if ('0' <= charAt && charAt <= '9') {
                return zq2.H((long) (charAt - '0'));
            }
            if (charAt == '-' || charAt == '.') {
                return zq2.e;
            }
            throw new IOException(C0201.m82(26673) + str);
        } else if (str.indexOf(46) != -1 || str.toLowerCase().indexOf(101) != -1) {
            return new xq2(str);
        } else {
            try {
                if (str.charAt(0) == '+') {
                    return zq2.H(Long.parseLong(str.substring(1)));
                }
                return zq2.H(Long.parseLong(str));
            } catch (NumberFormatException e) {
                throw new IOException(C0201.m82(26674) + str, e);
            }
        }
    }

    public abstract int A();

    public abstract long E();

    public abstract float r();
}
