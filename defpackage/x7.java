package defpackage;

import defpackage.v7;

/* renamed from: x7  reason: default package */
/* compiled from: UnobservedErrorNotifier */
public class x7 {
    private v7<?> a;

    public x7(v7<?> v7Var) {
        this.a = v7Var;
    }

    public void a() {
        this.a = null;
    }

    public void finalize() throws Throwable {
        v7.d k;
        try {
            v7<?> v7Var = this.a;
            if (!(v7Var == null || (k = v7.k()) == null)) {
                k.a(v7Var, new y7(v7Var.i()));
            }
        } finally {
            super.finalize();
        }
    }
}
