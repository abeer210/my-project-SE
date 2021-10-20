package defpackage;

/* renamed from: bf1  reason: default package */
public final class bf1 implements o71<af1> {
    private static bf1 b = new bf1();
    private final o71<af1> a;

    private bf1(o71<af1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((af1) b.get()).b();
    }

    public static boolean b() {
        return ((af1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ af1 get() {
        return this.a.get();
    }

    public bf1() {
        this(n71.b(new df1()));
    }
}
