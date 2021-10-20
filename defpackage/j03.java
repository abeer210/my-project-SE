package defpackage;

import java.io.IOException;

/* renamed from: j03  reason: default package */
/* compiled from: ASN1Exception */
public class j03 extends IOException {
    private Throwable a;

    public j03(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.a;
    }

    public j03(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
