package defpackage;

/* renamed from: m70  reason: default package */
/* compiled from: BaseDataSubscriber */
public abstract class m70<T> implements p70<T> {
    @Override // defpackage.p70
    public void a(n70<T> n70) {
    }

    @Override // defpackage.p70
    public void b(n70<T> n70) {
        try {
            e(n70);
        } finally {
            n70.close();
        }
    }

    @Override // defpackage.p70
    public void c(n70<T> n70) {
        boolean b = n70.b();
        try {
            f(n70);
        } finally {
            if (b) {
                n70.close();
            }
        }
    }

    @Override // defpackage.p70
    public void d(n70<T> n70) {
    }

    public abstract void e(n70<T> n70);

    public abstract void f(n70<T> n70);
}
