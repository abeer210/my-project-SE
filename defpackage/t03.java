package defpackage;

/* renamed from: t03  reason: default package */
/* compiled from: ASN1ParsingException */
public class t03 extends IllegalStateException {
    private Throwable a;

    public t03(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.a;
    }

    public t03(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
