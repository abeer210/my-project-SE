package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: px  reason: default package */
/* compiled from: FileTypeCompatibilityAtom */
public class px extends ox {
    public String c;
    public long d;
    public ArrayList<String> e = new ArrayList<>((int) ((this.a / 16) >> 2));

    public px(or orVar, ox oxVar) throws IOException {
        super(oxVar);
        this.c = orVar.m(4);
        this.d = orVar.q();
        for (int i = 16; ((long) i) < this.a; i += 4) {
            this.e.add(orVar.m(4));
        }
    }

    public void a(kx kxVar) {
        kxVar.R(4096, this.c);
        kxVar.L(4097, this.d);
        ArrayList<String> arrayList = this.e;
        kxVar.S(4098, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
