package defpackage;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: n71  reason: default package */
public final class n71 {
    public static <T> o71<T> a(o71<T> o71) {
        if ((o71 instanceof p71) || (o71 instanceof q71)) {
            return o71;
        }
        if (o71 instanceof Serializable) {
            return new q71(o71);
        }
        return new p71(o71);
    }

    public static <T> o71<T> b(@NullableDecl T t) {
        return new r71(t);
    }
}
