package defpackage;

/* renamed from: oe1  reason: default package */
public final class oe1 implements o71<ne1> {
    private static oe1 b = new oe1();
    private final o71<ne1> a;

    private oe1(o71<ne1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((ne1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ ne1 get() {
        return this.a.get();
    }

    public oe1() {
        this(n71.b(new re1()));
    }
}
