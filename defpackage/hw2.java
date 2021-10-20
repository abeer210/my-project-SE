package defpackage;

import java.io.Serializable;

/* renamed from: hw2  reason: default package */
/* compiled from: CallableReference */
public abstract class hw2 implements zw2, Serializable {
    public static final Object c = a.a;
    private transient zw2 a;
    public final Object b;

    /* renamed from: hw2$a */
    /* compiled from: CallableReference */
    private static class a implements Serializable {
        private static final a a = new a();

        private a() {
        }
    }

    public hw2() {
        this(c);
    }

    public zw2 b() {
        zw2 zw2 = this.a;
        if (zw2 != null) {
            return zw2;
        }
        c();
        this.a = this;
        return this;
    }

    public abstract zw2 c();

    public Object d() {
        return this.b;
    }

    public String e() {
        throw new AbstractMethodError();
    }

    public bx2 f() {
        throw new AbstractMethodError();
    }

    public String g() {
        throw new AbstractMethodError();
    }

    public hw2(Object obj) {
        this.b = obj;
    }
}
