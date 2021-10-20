package defpackage;

import java.io.IOException;

/* renamed from: dy  reason: default package */
/* compiled from: TimecodeSampleDescriptionAtom */
public class dy extends wx<a> {

    /* access modifiers changed from: package-private */
    /* renamed from: dy$a */
    /* compiled from: TimecodeSampleDescriptionAtom */
    public class a extends vx {
        public int b;

        public a(dy dyVar, or orVar) throws IOException {
            super(orVar);
            orVar.t(4);
            this.b = orVar.f();
            orVar.f();
            orVar.f();
            orVar.h();
            orVar.t(1);
        }
    }

    public dy(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
    }

    public void b(uy uyVar) {
        boolean z = false;
        a aVar = (a) this.d.get(0);
        uyVar.B(1, (aVar.b & 1) == 1);
        uyVar.B(2, (aVar.b & 2) == 2);
        uyVar.B(3, (aVar.b & 4) == 4);
        if ((aVar.b & 8) == 8) {
            z = true;
        }
        uyVar.B(4, z);
    }

    /* renamed from: c */
    public a a(or orVar) throws IOException {
        return new a(this, orVar);
    }
}
