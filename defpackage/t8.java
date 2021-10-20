package defpackage;

/* renamed from: t8  reason: default package */
public class t8 extends Exception {
    private int a;

    public t8(String str, int i) {
        super(str);
        this.a = i;
    }

    public t8(String str, int i, Throwable th) {
        super(str, th);
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
