package com.google.android.gms.common.api;

import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class h<R extends m> {

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface a {
        void a(Status status);
    }

    public abstract void b(a aVar);

    public abstract R c(long j, TimeUnit timeUnit);

    public abstract void d(n<? super R> nVar);
}
