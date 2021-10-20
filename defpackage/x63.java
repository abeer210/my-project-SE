package defpackage;

import java.io.IOException;

/* renamed from: x63  reason: default package */
/* compiled from: CipherIOException */
public class x63 extends IOException {
    private final Throwable a;

    public x63(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    public Throwable getCause() {
        return this.a;
    }
}
