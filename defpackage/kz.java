package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: kz  reason: default package */
/* compiled from: Box */
public class kz {
    public long a;
    public String b;
    public String c;

    public kz(or orVar) throws IOException {
        this.a = orVar.q();
        this.b = orVar.m(4);
        long j = this.a;
        if (j == 1) {
            this.a = orVar.g();
        } else if (j == 0) {
            this.a = -1;
        }
        if (this.b.equals(C0201.m82(28251))) {
            this.c = orVar.m(16);
        }
    }

    public kz(kz kzVar) {
        this.a = kzVar.a;
        this.b = kzVar.b;
        this.c = kzVar.c;
    }
}
