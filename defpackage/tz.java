package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: tz  reason: default package */
/* compiled from: TimeToSampleBox */
public class tz extends mz {
    public long e;
    public ArrayList<a> f = new ArrayList<>();

    /* renamed from: tz$a */
    /* compiled from: TimeToSampleBox */
    class a {
        public long a;

        public a(tz tzVar, long j, long j2) {
            this.a = j2;
        }
    }

    public tz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        this.e = orVar.q();
        for (int i = 0; ((long) i) < this.e; i++) {
            this.f.add(new a(this, orVar.q(), orVar.q()));
        }
    }

    public void a(e00 e00) {
        e00.F(104, (double) hz.b.longValue());
    }

    public void b(k00 k00) {
        k00.H(114, ((float) hz.b.longValue()) / ((float) this.f.get(0).a));
    }
}
