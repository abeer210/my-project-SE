package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: by  reason: default package */
/* compiled from: TimeToSampleAtom */
public class by extends qx {
    public long c;
    public ArrayList<a> d = new ArrayList<>();
    public long e;

    /* renamed from: by$a */
    /* compiled from: TimeToSampleAtom */
    class a {
        public a(by byVar, or orVar) throws IOException {
            orVar.q();
            orVar.q();
        }
    }

    public by(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
        this.c = orVar.q();
        for (int i = 0; ((long) i) < this.c; i++) {
            this.d.add(new a(this, orVar));
        }
        orVar.q();
        this.e = orVar.q();
    }

    public void a(xy xyVar) {
        xyVar.H(14, ((float) lx.b.longValue()) / ((float) this.e));
    }
}
