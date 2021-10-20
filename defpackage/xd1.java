package defpackage;

/* renamed from: xd1  reason: default package */
public final class xd1 implements o71<ae1> {
    private static xd1 b = new xd1();
    private final o71<ae1> a;

    private xd1(o71<ae1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((ae1) b.get()).c();
    }

    public static boolean b() {
        return ((ae1) b.get()).a();
    }

    public static boolean c() {
        return ((ae1) b.get()).b();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ ae1 get() {
        return this.a.get();
    }

    public xd1() {
        this(n71.b(new zd1()));
    }
}
