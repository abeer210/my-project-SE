package defpackage;

/* renamed from: mt1  reason: default package */
public final class mt1 implements Runnable {
    private final /* synthetic */ zs1 a;
    private final /* synthetic */ lt1 b;

    public mt1(lt1 lt1, zs1 zs1) {
        this.b = lt1;
        this.a = zs1;
    }

    public final void run() {
        synchronized (lt1.b(this.b)) {
            if (lt1.c(this.b) != null) {
                lt1.c(this.b).onFailure(this.a.k());
            }
        }
    }
}
