package defpackage;

/* renamed from: vf1  reason: default package */
public final class vf1 implements o71<yf1> {
    private static vf1 b = new vf1();
    private final o71<yf1> a;

    private vf1(o71<yf1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((yf1) b.get()).b();
    }

    public static double b() {
        return ((yf1) b.get()).a();
    }

    public static long c() {
        return ((yf1) b.get()).e();
    }

    public static long d() {
        return ((yf1) b.get()).d();
    }

    public static String e() {
        return ((yf1) b.get()).c();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ yf1 get() {
        return this.a.get();
    }

    public vf1() {
        this(n71.b(new xf1()));
    }
}
