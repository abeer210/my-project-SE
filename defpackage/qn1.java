package defpackage;

import java.util.Iterator;

/* renamed from: qn1  reason: default package */
public final class qn1 {
    private static final Iterator<Object> a = new rn1();
    private static final Iterable<Object> b = new sn1();

    public static <T> Iterable<T> a() {
        return (Iterable<T>) b;
    }
}
