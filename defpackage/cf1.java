package defpackage;

/* renamed from: cf1  reason: default package */
public final class cf1 implements o71<ff1> {
    private static cf1 b = new cf1();
    private final o71<ff1> a;

    private cf1(o71<ff1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((ff1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ ff1 get() {
        return this.a.get();
    }

    public cf1() {
        this(n71.b(new ef1()));
    }
}
