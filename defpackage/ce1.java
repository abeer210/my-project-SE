package defpackage;

/* renamed from: ce1  reason: default package */
public final class ce1 implements o71<be1> {
    private static ce1 b = new ce1();
    private final o71<be1> a;

    private ce1(o71<be1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((be1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ be1 get() {
        return this.a.get();
    }

    public ce1() {
        this(n71.b(new ee1()));
    }
}
