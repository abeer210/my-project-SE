package defpackage;

import java.io.IOException;

/* renamed from: yx  reason: default package */
/* compiled from: SoundSampleDescriptionAtom */
public class yx extends wx<a> {

    /* access modifiers changed from: package-private */
    /* renamed from: yx$a */
    /* compiled from: SoundSampleDescriptionAtom */
    public class a extends vx {
        public int b;
        public int c;

        public a(yx yxVar, or orVar) throws IOException {
            super(orVar);
            orVar.p();
            orVar.p();
            orVar.f();
            this.b = orVar.p();
            this.c = orVar.p();
            orVar.p();
            orVar.p();
            orVar.q();
        }
    }

    public yx(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
    }

    public void b(ly lyVar) {
        a aVar = (a) this.d.get(0);
        lyVar.R(769, jx.a(769, aVar.a));
        lyVar.J(770, aVar.b);
        lyVar.J(771, aVar.c);
    }

    /* renamed from: c */
    public a a(or orVar) throws IOException {
        return new a(this, orVar);
    }
}
