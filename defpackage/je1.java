package defpackage;

/* renamed from: je1  reason: default package */
public final class je1 implements o71<me1> {
    private static je1 b = new je1();
    private final o71<me1> a;

    private je1(o71<me1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((me1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ me1 get() {
        return this.a.get();
    }

    public je1() {
        this(n71.b(new le1()));
    }
}
