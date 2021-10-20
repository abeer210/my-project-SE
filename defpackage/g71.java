package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import vigqyno.C0201;

/* renamed from: g71  reason: default package */
public final class g71<T> extends i71<T> {
    public static final g71<Object> a = new g71<>();

    private g71() {
    }

    @Override // defpackage.i71
    public final T a() {
        throw new IllegalStateException(C0201.m82(23839));
    }

    @Override // defpackage.i71
    public final boolean b() {
        return false;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return C0201.m82(23840);
    }
}
