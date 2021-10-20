package defpackage;

import java.io.IOException;

/* renamed from: ox  reason: default package */
/* compiled from: Atom */
public class ox {
    public long a;
    public String b;

    public ox(or orVar) throws IOException {
        this.a = orVar.q();
        this.b = orVar.m(4);
        long j = this.a;
        if (j == 1) {
            this.a = orVar.g();
        } else if (j == 0) {
            this.a = -1;
        }
    }

    public ox(ox oxVar) {
        this.a = oxVar.a;
        this.b = oxVar.b;
    }
}
