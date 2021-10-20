package defpackage;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import vigqyno.C0201;

/* renamed from: q71  reason: default package */
public final class q71<T> implements o71<T>, Serializable {
    private final o71<T> a;
    private volatile transient boolean b;
    @NullableDecl
    private transient T c;

    public q71(o71<T> o71) {
        l71.a(o71);
        this.a = o71;
    }

    @Override // defpackage.o71
    public final T get() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T t = this.a.get();
                    this.c = t;
                    this.b = true;
                    return t;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append(C0201.m82(26030));
            sb.append(valueOf);
            sb.append(C0201.m82(26031));
            obj = sb.toString();
        } else {
            obj = this.a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append(C0201.m82(26032));
        sb2.append(valueOf2);
        sb2.append(C0201.m82(26033));
        return sb2.toString();
    }
}
