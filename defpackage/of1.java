package defpackage;

/* renamed from: of1  reason: default package */
public final class of1 implements o71<sf1> {
    private static of1 b = new of1();
    private final o71<sf1> a;

    private of1(o71<sf1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((sf1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ sf1 get() {
        return this.a.get();
    }

    public of1() {
        this(n71.b(new qf1()));
    }
}
