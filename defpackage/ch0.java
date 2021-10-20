package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: ch0  reason: default package */
/* compiled from: ThrottlingProducer */
public class ch0<T> implements rg0<T> {
    private final rg0<T> a;
    private final int b;
    private int c = 0;
    private final ConcurrentLinkedQueue<Pair<sf0<T>, sg0>> d = new ConcurrentLinkedQueue<>();
    private final Executor e;

    /* access modifiers changed from: private */
    /* renamed from: ch0$b */
    /* compiled from: ThrottlingProducer */
    public class b extends vf0<T, T> {

        /* access modifiers changed from: package-private */
        /* renamed from: ch0$b$a */
        /* compiled from: ThrottlingProducer */
        public class a implements Runnable {
            public final /* synthetic */ Pair a;

            public a(Pair pair) {
                this.a = pair;
            }

            public void run() {
                ch0 ch0 = ch0.this;
                Pair pair = this.a;
                ch0.f((sf0) pair.first, (sg0) pair.second);
            }
        }

        private void q() {
            Pair pair;
            synchronized (ch0.this) {
                pair = (Pair) ch0.this.d.poll();
                if (pair == null) {
                    ch0.d(ch0.this);
                }
            }
            if (pair != null) {
                ch0.this.e.execute(new a(pair));
            }
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void g() {
            p().b();
            q();
        }

        @Override // defpackage.vf0, defpackage.jf0
        public void h(Throwable th) {
            p().a(th);
            q();
        }

        @Override // defpackage.jf0
        public void i(T t, int i) {
            p().d(t, i);
            if (jf0.e(i)) {
                q();
            }
        }

        private b(sf0<T> sf0) {
            super(sf0);
        }
    }

    public ch0(int i, Executor executor, rg0<T> rg0) {
        this.b = i;
        z50.g(executor);
        this.e = executor;
        z50.g(rg0);
        this.a = rg0;
    }

    public static /* synthetic */ int d(ch0 ch0) {
        int i = ch0.c;
        ch0.c = i - 1;
        return i;
    }

    @Override // defpackage.rg0
    public void b(sf0<T> sf0, sg0 sg0) {
        boolean z;
        sg0.f().b(sg0.t(), C0201.m82(2218));
        synchronized (this) {
            z = true;
            if (this.c >= this.b) {
                this.d.add(Pair.create(sf0, sg0));
            } else {
                this.c++;
                z = false;
            }
        }
        if (!z) {
            f(sf0, sg0);
        }
    }

    public void f(sf0<T> sf0, sg0 sg0) {
        sg0.f().i(sg0.t(), C0201.m82(2219), null);
        this.a.b(new b(sf0), sg0);
    }
}
