package defpackage;

import android.content.Context;
import android.os.Handler;
import defpackage.yt2;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: xt2  reason: default package */
/* compiled from: FingerprintManagerCompat */
public final class xt2 {
    private static final e b = new a();
    private Context a;

    /* renamed from: xt2$a */
    /* compiled from: FingerprintManagerCompat */
    private static class a implements e {

        /* access modifiers changed from: package-private */
        /* renamed from: xt2$a$a  reason: collision with other inner class name */
        /* compiled from: FingerprintManagerCompat */
        public static class C0226a extends yt2.b {
            public final /* synthetic */ b a;

            public C0226a(b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.yt2.b
            public void a(int i, CharSequence charSequence) {
                this.a.a(i, charSequence);
            }

            @Override // defpackage.yt2.b
            public void b() {
                this.a.b();
            }

            @Override // defpackage.yt2.b
            public void c(int i, CharSequence charSequence) {
                this.a.c(i, charSequence);
            }

            @Override // defpackage.yt2.b
            public void d(yt2.c cVar) {
                this.a.d(new c(a.d(cVar.a())));
            }
        }

        public static d d(yt2.d dVar) {
            if (dVar == null) {
                return null;
            }
            if (dVar.a() != null) {
                return new d(dVar.a());
            }
            if (dVar.c() != null) {
                return new d(dVar.c());
            }
            if (dVar.b() != null) {
                return new d(dVar.b());
            }
            return null;
        }

        private static yt2.b e(b bVar) {
            return new C0226a(bVar);
        }

        private static yt2.d f(d dVar) {
            if (dVar == null) {
                return null;
            }
            if (dVar.a() != null) {
                return new yt2.d(dVar.a());
            }
            if (dVar.c() != null) {
                return new yt2.d(dVar.c());
            }
            if (dVar.b() != null) {
                return new yt2.d(dVar.b());
            }
            return null;
        }

        @Override // defpackage.xt2.e
        public boolean a(Context context) {
            return yt2.d(context);
        }

        @Override // defpackage.xt2.e
        public boolean b(Context context) {
            return yt2.e(context);
        }

        @Override // defpackage.xt2.e
        public void c(Context context, d dVar, int i, c2 c2Var, b bVar, Handler handler) {
            yt2.b(context, f(dVar), i, c2Var != null ? c2Var.b() : null, e(bVar), handler);
        }
    }

    /* renamed from: xt2$b */
    /* compiled from: FingerprintManagerCompat */
    public static abstract class b {
        public void a(int i, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i, CharSequence charSequence) {
        }

        public void d(c cVar) {
        }
    }

    /* renamed from: xt2$c */
    /* compiled from: FingerprintManagerCompat */
    public static final class c {
        public c(d dVar) {
        }
    }

    /* renamed from: xt2$e */
    /* compiled from: FingerprintManagerCompat */
    private interface e {
        boolean a(Context context);

        boolean b(Context context);

        void c(Context context, d dVar, int i, c2 c2Var, b bVar, Handler handler);
    }

    private xt2(Context context) {
        this.a = context;
    }

    public static xt2 b(Context context) {
        return new xt2(context);
    }

    public void a(d dVar, int i, c2 c2Var, b bVar, Handler handler) {
        b.c(this.a, dVar, i, c2Var, bVar, handler);
    }

    public boolean c() {
        return b.a(this.a);
    }

    public boolean d() {
        return b.b(this.a);
    }

    /* renamed from: xt2$d */
    /* compiled from: FingerprintManagerCompat */
    public static class d {
        private final Signature a;
        private final Cipher b;
        private final Mac c;

        public d(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
        }

        public Cipher a() {
            return this.b;
        }

        public Mac b() {
            return this.c;
        }

        public Signature c() {
            return this.a;
        }

        public d(Cipher cipher) {
            this.b = cipher;
            this.a = null;
            this.c = null;
        }

        public d(Mac mac) {
            this.c = mac;
            this.b = null;
            this.a = null;
        }
    }
}
