package defpackage;

/* renamed from: qd1  reason: default package */
public final class qd1 implements o71<pd1> {
    private static qd1 b = new qd1();
    private final o71<pd1> a;

    private qd1(o71<pd1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((pd1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ pd1 get() {
        return this.a.get();
    }

    public qd1() {
        this(n71.b(new sd1()));
    }
}
