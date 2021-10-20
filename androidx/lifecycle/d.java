package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle */
public abstract class d {

    /* compiled from: Lifecycle */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* compiled from: Lifecycle */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean b(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public d() {
        new AtomicReference();
    }

    public abstract void a(f fVar);

    public abstract b b();

    public abstract void c(f fVar);
}
