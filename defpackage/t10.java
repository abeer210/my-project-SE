package defpackage;

/* renamed from: t10  reason: default package */
/* compiled from: InvalidResponseException */
public class t10 extends Exception {
    private r10 a;

    public t10(String str, r10 r10) {
        super(str);
        this.a = r10;
    }

    public r10 a() {
        return this.a;
    }

    public t10(String str, Throwable th, r10 r10) {
        super(str, th);
        this.a = r10;
    }
}
