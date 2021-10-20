package defpackage;

/* renamed from: t73  reason: default package */
/* compiled from: OperatorException */
public class t73 extends Exception {
    private Throwable a;

    public t73(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    public Throwable getCause() {
        return this.a;
    }
}
