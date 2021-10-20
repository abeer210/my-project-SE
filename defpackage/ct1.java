package defpackage;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import vigqyno.C0201;

/* renamed from: ct1  reason: default package */
public final class ct1 {

    /* access modifiers changed from: package-private */
    /* renamed from: ct1$b */
    public interface b extends ts1, vs1, ws1<Object> {
    }

    public static <TResult> TResult a(zs1<TResult> zs1) throws ExecutionException, InterruptedException {
        u.i();
        u.l(zs1, C0201.m82(30535));
        if (zs1.o()) {
            return (TResult) f(zs1);
        }
        a aVar = new a(null);
        e(zs1, aVar);
        aVar.a();
        return (TResult) f(zs1);
    }

    public static <TResult> TResult b(zs1<TResult> zs1, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        u.i();
        u.l(zs1, C0201.m82(30536));
        u.l(timeUnit, C0201.m82(30537));
        if (zs1.o()) {
            return (TResult) f(zs1);
        }
        a aVar = new a(null);
        e(zs1, aVar);
        if (aVar.b(j, timeUnit)) {
            return (TResult) f(zs1);
        }
        throw new TimeoutException(C0201.m82(30538));
    }

    public static <TResult> zs1<TResult> c(Executor executor, Callable<TResult> callable) {
        u.l(executor, C0201.m82(30539));
        u.l(callable, C0201.m82(30540));
        ut1 ut1 = new ut1();
        executor.execute(new vt1(ut1, callable));
        return ut1;
    }

    public static <TResult> zs1<TResult> d(TResult tresult) {
        ut1 ut1 = new ut1();
        ut1.s(tresult);
        return ut1;
    }

    private static void e(zs1<?> zs1, b bVar) {
        zs1.g(bt1.b, bVar);
        zs1.e(bt1.b, bVar);
        zs1.a(bt1.b, bVar);
    }

    private static <TResult> TResult f(zs1<TResult> zs1) throws ExecutionException {
        if (zs1.p()) {
            return zs1.l();
        }
        if (zs1.n()) {
            throw new CancellationException(C0201.m82(30541));
        }
        throw new ExecutionException(zs1.k());
    }

    /* access modifiers changed from: private */
    /* renamed from: ct1$a */
    public static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        public final void a() throws InterruptedException {
            this.a.await();
        }

        public final boolean b(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.a.await(j, timeUnit);
        }

        @Override // defpackage.ts1
        public final void onCanceled() {
            this.a.countDown();
        }

        @Override // defpackage.vs1
        public final void onFailure(Exception exc) {
            this.a.countDown();
        }

        @Override // defpackage.ws1
        public final void onSuccess(Object obj) {
            this.a.countDown();
        }

        public /* synthetic */ a(vt1 vt1) {
            this();
        }
    }
}
