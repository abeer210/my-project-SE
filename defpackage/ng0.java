package defpackage;

import defpackage.ag0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: ng0  reason: default package */
/* compiled from: NetworkFetcher */
public interface ng0<FETCH_STATE extends ag0> {

    /* renamed from: ng0$a */
    /* compiled from: NetworkFetcher */
    public interface a {
        void a(Throwable th);

        void b();

        void c(InputStream inputStream, int i) throws IOException;
    }

    void a(FETCH_STATE fetch_state, int i);

    boolean b(FETCH_STATE fetch_state);

    Map<String, String> c(FETCH_STATE fetch_state, int i);

    void d(FETCH_STATE fetch_state, a aVar);

    FETCH_STATE e(sf0<af0> sf0, sg0 sg0);
}
