package defpackage;

import defpackage.vt0;
import defpackage.wt0;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: vt0  reason: default package */
public abstract class vt0<MessageType extends vt0<MessageType, BuilderType>, BuilderType extends wt0<MessageType, BuilderType>> implements qw0 {
    private static boolean zzey;
    public int zzex = 0;

    static {
        C0201.m83(vt0.class, 380);
    }

    @Override // defpackage.qw0
    public final fu0 a() {
        try {
            ku0 l = fu0.l(f());
            d(l.b());
            return l.a();
        } catch (IOException e) {
            String r2 = C0201.m82(12641);
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + r2.length());
            sb.append(C0201.m82(12642));
            sb.append(name);
            sb.append(C0201.m82(12643));
            sb.append(r2);
            sb.append(C0201.m82(12644));
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public void i(int i) {
        throw new UnsupportedOperationException();
    }

    public int j() {
        throw new UnsupportedOperationException();
    }
}
