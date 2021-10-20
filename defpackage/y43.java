package defpackage;

import java.io.IOException;

/* renamed from: y43  reason: default package */
/* compiled from: CertIOException */
public class y43 extends IOException {
    private Throwable a;

    public y43(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    public Throwable getCause() {
        return this.a;
    }
}
