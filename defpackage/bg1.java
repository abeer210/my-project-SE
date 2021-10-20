package defpackage;

/* renamed from: bg1  reason: default package */
public final class bg1 implements o71<eg1> {
    private static bg1 b = new bg1();
    private final o71<eg1> a;

    private bg1(o71<eg1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((eg1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ eg1 get() {
        return this.a.get();
    }

    public bg1() {
        this(n71.b(new dg1()));
    }
}
