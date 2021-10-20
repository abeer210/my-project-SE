package defpackage;

import defpackage.rj1;
import defpackage.sj1;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: rj1  reason: default package */
public abstract class rj1<MessageType extends rj1<MessageType, BuilderType>, BuilderType extends sj1<MessageType, BuilderType>> implements tm1 {
    private static boolean zzrj;
    public int zzri = 0;

    static {
        C0201.m83(rj1.class, 701);
    }

    @Override // defpackage.tm1
    public final bk1 a() {
        try {
            gk1 f = bk1.f(f());
            d(f.b());
            return f.a();
        } catch (IOException e) {
            String r2 = C0201.m82(23517);
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + r2.length());
            sb.append(C0201.m82(23518));
            sb.append(name);
            sb.append(C0201.m82(23519));
            sb.append(r2);
            sb.append(C0201.m82(23520));
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public void i(int i) {
        throw new UnsupportedOperationException();
    }
}
