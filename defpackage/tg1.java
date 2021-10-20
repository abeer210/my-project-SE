package defpackage;

/* renamed from: tg1  reason: default package */
public final class tg1 implements o71<rg1> {
    private static tg1 b = new tg1();
    private final o71<rg1> a;

    private tg1(o71<rg1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((rg1) b.get()).b();
    }

    public static boolean b() {
        return ((rg1) b.get()).c();
    }

    public static boolean c() {
        return ((rg1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ rg1 get() {
        return this.a.get();
    }

    public tg1() {
        this(n71.b(new vg1()));
    }
}
