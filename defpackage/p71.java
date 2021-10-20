package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import vigqyno.C0201;

/* renamed from: p71  reason: default package */
public final class p71<T> implements o71<T> {
    private volatile o71<T> a;
    private volatile boolean b;
    @NullableDecl
    private T c;

    public p71(o71<T> o71) {
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
                    this.a = null;
                    return t;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append(C0201.m82(36426));
            sb.append(valueOf);
            sb.append(C0201.m82(36427));
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append(C0201.m82(36428));
        sb2.append(valueOf2);
        sb2.append(C0201.m82(36429));
        return sb2.toString();
    }
}
