package defpackage;

/* renamed from: ve1  reason: default package */
public final class ve1 implements o71<ue1> {
    private static ve1 b = new ve1();
    private final o71<ue1> a;

    private ve1(o71<ue1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((ue1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ ue1 get() {
        return this.a.get();
    }

    public ve1() {
        this(n71.b(new xe1()));
    }
}
