package defpackage;

/* renamed from: rd1  reason: default package */
public final class rd1 implements o71<ud1> {
    private static rd1 b = new rd1();
    private final o71<ud1> a;

    private rd1(o71<ud1> o71) {
        this.a = n71.a(o71);
    }

    public static boolean a() {
        return ((ud1) b.get()).a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.o71
    public final /* synthetic */ ud1 get() {
        return this.a.get();
    }

    public rd1() {
        this(n71.b(new td1()));
    }
}
