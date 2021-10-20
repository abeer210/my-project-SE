package defpackage;

/* renamed from: if1  reason: default package */
public final class if1 implements o71<lf1> {
    private static if1 b = new if1();
    private final o71<lf1> a;

    private if1(o71<lf1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((lf1) b.get()).c();
    }

    public static boolean b() {
        return ((lf1) b.get()).b();
    }

    public static boolean c() {
        return ((lf1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ lf1 get() {
        return this.a.get();
    }

    public if1() {
        this(n71.b(new kf1()));
    }
}
