package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import vigqyno.C0201;

/* renamed from: k71  reason: default package */
public final class k71<T> extends i71<T> {
    private final T a;

    public k71(T t) {
        this.a = t;
    }

    @Override // defpackage.i71
    public final T a() {
        return this.a;
    }

    @Override // defpackage.i71
    public final boolean b() {
        return true;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof k71) {
            return this.a.equals(((k71) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(C0201.m82(33640));
        sb.append(valueOf);
        sb.append(C0201.m82(33641));
        return sb.toString();
    }
}
