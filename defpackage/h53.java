package defpackage;

/* renamed from: h53  reason: default package */
/* compiled from: CMSException */
public class h53 extends Exception {
    public Exception a;

    public h53(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.a;
    }

    public h53(String str, Exception exc) {
        super(str);
        this.a = exc;
    }
}
