package defpackage;

import java.util.List;

/* renamed from: cm1  reason: default package */
public abstract class cm1 {
    private static final cm1 a = new em1();
    private static final cm1 b = new fm1();

    private cm1() {
    }

    public static cm1 d() {
        return a;
    }

    public static cm1 e() {
        return b;
    }

    public abstract <L> List<L> a(Object obj, long j);

    public abstract <L> void b(Object obj, Object obj2, long j);

    public abstract void c(Object obj, long j);
}
