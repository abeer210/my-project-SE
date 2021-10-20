package defpackage;

/* renamed from: ag1  reason: default package */
public final class ag1 implements o71<zf1> {
    private static ag1 b = new ag1();
    private final o71<zf1> a;

    private ag1(o71<zf1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((zf1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ zf1 get() {
        return this.a.get();
    }

    public ag1() {
        this(n71.b(new cg1()));
    }
}
