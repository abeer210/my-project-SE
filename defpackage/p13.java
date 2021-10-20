package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: p13  reason: default package */
/* compiled from: DERApplicationSpecific */
public class p13 extends c03 {
    public p13(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    @Override // defpackage.c03, defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.f(this.a ? 96 : 64, this.b, this.c);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C0201.m82(24276));
        if (l()) {
            stringBuffer.append(C0201.m82(24277));
        }
        stringBuffer.append(C0201.m82(24278));
        stringBuffer.append(Integer.toString(q()));
        stringBuffer.append(C0201.m82(24279));
        if (this.c != null) {
            stringBuffer.append(C0201.m82(24280));
            stringBuffer.append(qb3.d(this.c));
        } else {
            stringBuffer.append(C0201.m82(24281));
        }
        stringBuffer.append(C0201.m82(24282));
        return stringBuffer.toString();
    }
}
