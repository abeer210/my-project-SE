package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import vigqyno.C0201;

/* renamed from: r71  reason: default package */
public final class r71<T> implements o71<T>, Serializable {
    @NullableDecl
    private final T a;

    public r71(@NullableDecl T t) {
        this.a = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof r71)) {
            return false;
        }
        T t = this.a;
        T t2 = ((r71) obj).a;
        if (t == t2) {
            return true;
        }
        if (t == null || !t.equals(t2)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.o71
    public final T get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append(C0201.m82(23812));
        sb.append(valueOf);
        sb.append(C0201.m82(23813));
        return sb.toString();
    }
}
