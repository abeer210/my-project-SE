package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: i12  reason: default package */
public final class i12 implements q02, p02 {
    private final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ i12(byte[] bArr) {
    }

    public final void a() throws InterruptedException {
        this.a.await();
    }

    @Override // defpackage.p02
    public final void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.q02
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
