package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: d13  reason: default package */
/* compiled from: BERApplicationSpecific */
public class d13 extends c03 {
    public d13(int i, h03 h03) {
        super(true, i, r(h03));
    }

    private static byte[] r(h03 h03) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != h03.c(); i++) {
            try {
                byteArrayOutputStream.write(((o03) h03.b(i)).f(C0201.m82(26778)));
            } catch (IOException e) {
                throw new t03(C0201.m82(26779) + e, e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.c03, defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.k(this.a ? 96 : 64, this.b);
        s03.c(128);
        s03.d(this.c);
        s03.c(0);
        s03.c(0);
    }
}
