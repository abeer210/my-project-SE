package defpackage;

/* renamed from: nb3  reason: default package */
/* compiled from: DecoderException */
public class nb3 extends IllegalStateException {
    private Throwable a;

    public nb3(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    public Throwable getCause() {
        return this.a;
    }
}
