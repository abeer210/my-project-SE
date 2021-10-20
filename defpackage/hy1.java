package defpackage;

/* renamed from: hy1  reason: default package */
public abstract class hy1 implements Runnable {
    private final d12<?> a;

    public hy1() {
        this.a = null;
    }

    public hy1(d12<?> d12) {
        this.a = d12;
    }

    public abstract void a();

    public final d12<?> b() {
        return this.a;
    }

    public final void run() {
        try {
            a();
        } catch (Exception e) {
            d12<?> d12 = this.a;
            if (d12 != null) {
                d12.d(e);
            }
        }
    }
}
