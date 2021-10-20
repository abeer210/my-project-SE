package defpackage;

import java.util.List;

/* renamed from: fa1  reason: default package */
public abstract class fa1 {
    private static final fa1 a = new ha1();
    private static final fa1 b = new ga1();

    private fa1() {
    }

    public static fa1 d() {
        return a;
    }

    public static fa1 e() {
        return b;
    }

    public abstract <L> List<L> a(Object obj, long j);

    public abstract <L> void b(Object obj, Object obj2, long j);

    public abstract void c(Object obj, long j);
}
