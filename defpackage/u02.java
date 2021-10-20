package defpackage;

import java.util.concurrent.ExecutionException;
import vigqyno.C0201;

/* renamed from: u02  reason: default package */
public final class u02 {
    public static <ResultT> s02<ResultT> a(Exception exc) {
        h12 h12 = new h12();
        h12.i(exc);
        return h12;
    }

    public static <ResultT> s02<ResultT> b(ResultT resultt) {
        h12 h12 = new h12();
        h12.j(resultt);
        return h12;
    }

    private static <ResultT> ResultT c(s02<ResultT> s02) throws ExecutionException {
        if (s02.g()) {
            return s02.e();
        }
        throw new ExecutionException(s02.d());
    }

    private static void d(s02<?> s02, i12 i12) {
        s02.c(t02.b, i12);
        s02.b(t02.b, i12);
    }

    public static <ResultT> ResultT e(s02<ResultT> s02) throws ExecutionException, InterruptedException {
        sy1.b(s02, C0201.m82(20394));
        if (s02.f()) {
            return (ResultT) c(s02);
        }
        i12 i12 = new i12(null);
        d(s02, i12);
        i12.a();
        return (ResultT) c(s02);
    }
}
