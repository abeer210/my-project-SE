package defpackage;

import defpackage.x32;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: b42  reason: default package */
/* compiled from: TypeAdapterRuntimeTypeWrapper */
public final class b42<T> extends x22<T> {
    private final k22 a;
    private final x22<T> b;
    private final Type c;

    public b42(k22 k22, x22<T> x22, Type type) {
        this.a = k22;
        this.b = x22;
        this.c = type;
    }

    private Type d(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    @Override // defpackage.x22
    public void c(h42 h42, T t) throws IOException {
        x22<T> x22 = this.b;
        Type d = d(this.c, t);
        if (d != this.c) {
            x22 = this.a.f(g42.b(d));
            if (x22 instanceof x32.b) {
                x22<T> x222 = this.b;
                if (!(x222 instanceof x32.b)) {
                    x22 = x222;
                }
            }
        }
        x22.c(h42, t);
    }
}
