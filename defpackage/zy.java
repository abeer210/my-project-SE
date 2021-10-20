package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: zy  reason: default package */
/* compiled from: QuickTimeDataHandler */
public class zy extends nx {
    private int c = 0;
    private ArrayList<String> d = new ArrayList<>();

    public zy(wr wrVar) {
        super(wrVar);
    }

    @Override // defpackage.mq
    public mq c(ox oxVar, byte[] bArr) throws IOException {
        if (bArr != null) {
            nr nrVar = new nr(bArr);
            if (oxVar.b.equals(C0201.m82(23773))) {
                h(nrVar);
            } else if (oxVar.b.equals(C0201.m82(23774))) {
                g(bArr, nrVar);
            }
        } else {
            int a = er.a(oxVar.b.getBytes(), 0, true);
            if (a > 0 && a < this.d.size() + 1) {
                this.c = a - 1;
            }
        }
        return this;
    }

    @Override // defpackage.mq
    public boolean e(ox oxVar) {
        return oxVar.b.equals(C0201.m82(23775)) || oxVar.b.equals(C0201.m82(23776)) || oxVar.b.equals(C0201.m82(23777));
    }

    @Override // defpackage.mq
    public boolean f(ox oxVar) {
        return oxVar.b.equals(C0201.m82(23778)) || er.a(oxVar.b.getBytes(), 0, true) <= this.d.size();
    }

    public void g(byte[] bArr, nr nrVar) throws IOException {
        nrVar.t(8);
        this.b.R(cz.g.get(this.d.get(this.c)).intValue(), new String(nrVar.d(bArr.length - 8)));
    }

    public void h(nr nrVar) throws IOException {
        nrVar.t(4);
        int f = nrVar.f();
        for (int i = 0; i < f; i++) {
            int f2 = nrVar.f();
            nrVar.t(4);
            this.d.add(new String(nrVar.d(f2 - 8)));
        }
    }
}
