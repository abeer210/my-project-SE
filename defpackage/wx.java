package defpackage;

import defpackage.vx;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: wx  reason: default package */
/* compiled from: SampleDescriptionAtom */
public abstract class wx<T extends vx> extends qx {
    public long c;
    public ArrayList<T> d = new ArrayList<>((int) this.c);

    public wx(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
        this.c = orVar.q();
        for (int i = 0; ((long) i) < this.c; i++) {
            this.d.add(a(orVar));
        }
    }

    public abstract T a(or orVar) throws IOException;
}
