package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: lz  reason: default package */
/* compiled from: FileTypeBox */
public class lz extends kz {
    public String d;
    public long e;
    public ArrayList<String> f = new ArrayList<>();

    public lz(or orVar, kz kzVar) throws IOException {
        super(kzVar);
        this.d = orVar.m(4);
        this.e = orVar.q();
        for (int i = 16; ((long) i) < this.a; i += 4) {
            this.f.add(orVar.m(4));
        }
    }

    public void a(gz gzVar) {
        gzVar.R(1, this.d);
        gzVar.L(2, this.e);
        ArrayList<String> arrayList = this.f;
        gzVar.S(3, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
