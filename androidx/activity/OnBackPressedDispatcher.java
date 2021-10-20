package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    private final Runnable a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements e, a {
        private final d a;
        private final b b;
        private a c;

        public LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.a = dVar;
            this.b = bVar;
            dVar.a(this);
        }

        @Override // androidx.lifecycle.e
        public void c(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                this.c = OnBackPressedDispatcher.this.b(this.b);
            } else if (aVar == d.a.ON_STOP) {
                a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == d.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.a.c(this);
            this.b.e(this);
            a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public class a implements a {
        private final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a(g gVar, b bVar) {
        d lifecycle = gVar.getLifecycle();
        if (lifecycle.b() != d.b.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    public a b(b bVar) {
        this.b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
