package defpackage;

import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: zv2  reason: default package */
/* compiled from: Iterators.kt */
public abstract class zv2 implements Iterator<Integer> {
    /* renamed from: a */
    public final Integer next() {
        return Integer.valueOf(b());
    }

    public abstract int b();

    public void remove() {
        throw new UnsupportedOperationException(C0201.m82(32755));
    }
}
