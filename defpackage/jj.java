package defpackage;

import androidx.core.util.e;
import com.bumptech.glide.load.g;
import defpackage.gp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vigqyno.C0201;

/* renamed from: jj  reason: default package */
/* compiled from: SafeKeyGenerator */
public class jj {
    private final bp<g, String> a = new bp<>(1000);
    private final e<b> b = gp.d(10, new a(this));

    /* renamed from: jj$a */
    /* compiled from: SafeKeyGenerator */
    class a implements gp.d<b> {
        public a(jj jjVar) {
        }

        /* renamed from: a */
        public b create() {
            try {
                return new b(MessageDigest.getInstance(C0201.m82(7301)));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: jj$b */
    /* compiled from: SafeKeyGenerator */
    public static final class b implements gp.f {
        public final MessageDigest a;
        private final ip b = ip.a();

        public b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // defpackage.gp.f
        public ip f() {
            return this.b;
        }
    }

    private String a(g gVar) {
        b b2 = this.b.b();
        ep.d(b2);
        b bVar = b2;
        try {
            gVar.a(bVar.a);
            return fp.s(bVar.a.digest());
        } finally {
            this.b.a(bVar);
        }
    }

    public String b(g gVar) {
        String g;
        synchronized (this.a) {
            g = this.a.g(gVar);
        }
        if (g == null) {
            g = a(gVar);
        }
        synchronized (this.a) {
            this.a.k(gVar, g);
        }
        return g;
    }
}
