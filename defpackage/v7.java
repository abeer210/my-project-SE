package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: v7  reason: default package */
/* compiled from: Task */
public class v7<TResult> {
    public static final ExecutorService i = r7.a();
    private static final Executor j = r7.b();
    public static final Executor k = q7.c();
    private static volatile d l;
    private static v7<?> m = new v7<>((Object) null);
    private static v7<Boolean> n = new v7<>(Boolean.TRUE);
    private static v7<Boolean> o = new v7<>(Boolean.FALSE);
    private final Object a = new Object();
    private boolean b;
    private boolean c;
    private TResult d;
    private Exception e;
    private boolean f;
    private x7 g;
    private List<t7<TResult, Void>> h = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: v7$a */
    /* compiled from: Task */
    public class a implements t7<TResult, Void> {
        public final /* synthetic */ w7 a;
        public final /* synthetic */ t7 b;
        public final /* synthetic */ Executor c;
        public final /* synthetic */ s7 d;

        public a(v7 v7Var, w7 w7Var, t7 t7Var, Executor executor, s7 s7Var) {
            this.a = w7Var;
            this.b = t7Var;
            this.c = executor;
            this.d = s7Var;
        }

        /* renamed from: b */
        public Void a(v7<TResult> v7Var) {
            v7.d(this.a, this.b, v7Var, this.c, this.d);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v7$b */
    /* compiled from: Task */
    public static class b implements Runnable {
        public final /* synthetic */ s7 a;
        public final /* synthetic */ w7 b;
        public final /* synthetic */ t7 c;
        public final /* synthetic */ v7 d;

        public b(s7 s7Var, w7 w7Var, t7 t7Var, v7 v7Var) {
            this.a = s7Var;
            this.b = w7Var;
            this.c = t7Var;
            this.d = v7Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: w7 */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            s7 s7Var = this.a;
            if (s7Var == null) {
                try {
                    this.b.d(this.c.a(this.d));
                } catch (CancellationException unused) {
                    this.b.b();
                } catch (Exception e) {
                    this.b.c(e);
                }
            } else {
                s7Var.a();
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v7$c */
    /* compiled from: Task */
    public static class c implements Runnable {
        public final /* synthetic */ s7 a;
        public final /* synthetic */ w7 b;
        public final /* synthetic */ Callable c;

        public c(s7 s7Var, w7 w7Var, Callable callable) {
            this.a = s7Var;
            this.b = w7Var;
            this.c = callable;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: w7 */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            s7 s7Var = this.a;
            if (s7Var == null) {
                try {
                    this.b.d(this.c.call());
                } catch (CancellationException unused) {
                    this.b.b();
                } catch (Exception e) {
                    this.b.c(e);
                }
            } else {
                s7Var.a();
                throw null;
            }
        }
    }

    /* renamed from: v7$d */
    /* compiled from: Task */
    public interface d {
        void a(v7<?> v7Var, y7 y7Var);
    }

    static {
        new v7(true);
    }

    public v7() {
    }

    public static <TResult> v7<TResult> b(Callable<TResult> callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static <TResult> v7<TResult> c(Callable<TResult> callable, Executor executor, s7 s7Var) {
        w7 w7Var = new w7();
        try {
            executor.execute(new c(s7Var, w7Var, callable));
        } catch (Exception e2) {
            w7Var.c(new u7(e2));
        }
        return w7Var.a();
    }

    /* access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(w7<TContinuationResult> w7Var, t7<TResult, TContinuationResult> t7Var, v7<TResult> v7Var, Executor executor, s7 s7Var) {
        try {
            executor.execute(new b(s7Var, w7Var, t7Var, v7Var));
        } catch (Exception e2) {
            w7Var.c(new u7(e2));
        }
    }

    public static <TResult> v7<TResult> g(Exception exc) {
        w7 w7Var = new w7();
        w7Var.c(exc);
        return w7Var.a();
    }

    public static <TResult> v7<TResult> h(TResult tresult) {
        if (tresult == null) {
            return (v7<TResult>) m;
        }
        if (tresult instanceof Boolean) {
            return tresult.booleanValue() ? (v7<TResult>) n : (v7<TResult>) o;
        }
        w7 w7Var = new w7();
        w7Var.d(tresult);
        return w7Var.a();
    }

    public static d k() {
        return l;
    }

    private void o() {
        synchronized (this.a) {
            for (t7<TResult, Void> t7Var : this.h) {
                try {
                    t7Var.a(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.h = null;
        }
    }

    public <TContinuationResult> v7<TContinuationResult> e(t7<TResult, TContinuationResult> t7Var) {
        return f(t7Var, j, null);
    }

    public <TContinuationResult> v7<TContinuationResult> f(t7<TResult, TContinuationResult> t7Var, Executor executor, s7 s7Var) {
        boolean m2;
        w7 w7Var = new w7();
        synchronized (this.a) {
            m2 = m();
            if (!m2) {
                this.h.add(new a(this, w7Var, t7Var, executor, s7Var));
            }
        }
        if (m2) {
            d(w7Var, t7Var, this, executor, s7Var);
        }
        return w7Var.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.a) {
            if (this.e != null) {
                this.f = true;
                if (this.g != null) {
                    this.g.a();
                    this.g = null;
                }
            }
            exc = this.e;
        }
        return exc;
    }

    public TResult j() {
        TResult tresult;
        synchronized (this.a) {
            tresult = this.d;
        }
        return tresult;
    }

    public boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    public boolean n() {
        boolean z;
        synchronized (this.a) {
            z = i() != null;
        }
        return z;
    }

    public boolean p() {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.a.notifyAll();
            o();
            return true;
        }
    }

    public boolean q(Exception exc) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.e = exc;
            this.f = false;
            this.a.notifyAll();
            o();
            if (!this.f && k() != null) {
                this.g = new x7(this);
            }
            return true;
        }
    }

    public boolean r(TResult tresult) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.d = tresult;
            this.a.notifyAll();
            o();
            return true;
        }
    }

    private v7(TResult tresult) {
        r(tresult);
    }

    private v7(boolean z) {
        if (z) {
            p();
        } else {
            r(null);
        }
    }
}
