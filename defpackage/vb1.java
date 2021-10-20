package defpackage;

import java.util.Iterator;

/* renamed from: vb1  reason: default package */
public final class vb1 {
    private static final Iterator<Object> a = new ub1();
    private static final Iterable<Object> b = new xb1();

    public static <T> Iterable<T> a() {
        return (Iterable<T>) b;
    }
}
