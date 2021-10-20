package defpackage;

import defpackage.xw;
import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: dx  reason: default package */
/* compiled from: JpegDhtReader */
public class dx implements wp {
    private byte[] d(or orVar, int i) throws IOException {
        byte b;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            byte b2 = orVar.b();
            if ((b2 & 255) != 255 || (b = orVar.b()) == 0) {
                bArr[i2] = b2;
            } else {
                throw new IOException(C0201.m82(11512) + yp.b(b) + C0201.m82(11513));
            }
        }
        return bArr;
    }

    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            c(new nr(bArr), wrVar);
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.DHT);
    }

    public void c(or orVar, wr wrVar) {
        xw xwVar = (xw) wrVar.e(xw.class);
        if (xwVar == null) {
            xwVar = new xw();
            wrVar.a(xwVar);
        }
        while (orVar.a() > 0) {
            try {
                byte b = orVar.b();
                xw.a.EnumC0227a b2 = xw.a.EnumC0227a.b((b & 240) >> 4);
                int i = b & 15;
                byte[] d = d(orVar, 16);
                int i2 = 0;
                for (byte b3 : d) {
                    i2 += b3 & 255;
                }
                xwVar.V().add(new xw.a(b2, i, d, d(orVar, i2)));
            } catch (IOException e) {
                xwVar.a(e.getMessage());
            }
        }
        xwVar.J(1, xwVar.V().size());
    }
}
