package defpackage;

/* renamed from: pb3  reason: default package */
/* compiled from: EncoderException */
public class pb3 extends IllegalStateException {
    private Throwable a;

    public pb3(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    public Throwable getCause() {
        return this.a;
    }
}
