package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class k<L> {
    private final c a;
    private volatile L b;
    private final a<L> c;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a<L> {
        private final L a;
        private final String b;

        public a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b<L> {
        void a(L l);

        void b();
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class c extends et0 {
        public c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            u.a(z);
            k.this.d((b) message.obj);
        }
    }

    public k(Looper looper, L l, String str) {
        this.a = new c(looper);
        u.l(l, C0201.m82(39074));
        this.b = l;
        u.g(str);
        this.c = new a<>(l, str);
    }

    public final void a() {
        this.b = null;
    }

    public final a<L> b() {
        return this.c;
    }

    public final void c(b<? super L> bVar) {
        u.l(bVar, C0201.m82(39075));
        this.a.sendMessage(this.a.obtainMessage(1, bVar));
    }

    public final void d(b<? super L> bVar) {
        L l = this.b;
        if (l == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(l);
        } catch (RuntimeException e) {
            bVar.b();
            throw e;
        }
    }
}
