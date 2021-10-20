package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: km  reason: default package */
/* compiled from: GifFrameLoader */
public class km {
    private final ng a;
    private final Handler b;
    private final List<b> c;
    public final k d;
    private final qi e;
    private boolean f;
    private boolean g;
    private boolean h;
    private j<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private a n;
    private d o;
    private int p;
    private int q;
    private int r;

    /* access modifiers changed from: package-private */
    /* renamed from: km$a */
    /* compiled from: GifFrameLoader */
    public static class a extends go<Bitmap> {
        private final Handler d;
        public final int e;
        private final long f;
        private Bitmap g;

        public a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        @Override // defpackage.no
        public void g(Drawable drawable) {
            this.g = null;
        }

        public Bitmap i() {
            return this.g;
        }

        /* renamed from: j */
        public void b(Bitmap bitmap, qo<? super Bitmap> qoVar) {
            this.g = bitmap;
            this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.f);
        }
    }

    /* renamed from: km$b */
    /* compiled from: GifFrameLoader */
    public interface b {
        void a();
    }

    /* renamed from: km$c */
    /* compiled from: GifFrameLoader */
    private class c implements Handler.Callback {
        public c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                km.this.m((a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                km.this.d.m((a) message.obj);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: km$d */
    /* compiled from: GifFrameLoader */
    public interface d {
        void a();
    }

    public km(com.bumptech.glide.c cVar, ng ngVar, int i2, int i3, m<Bitmap> mVar, Bitmap bitmap) {
        this(cVar.f(), com.bumptech.glide.c.t(cVar.h()), ngVar, null, i(com.bumptech.glide.c.t(cVar.h()), i2, i3), mVar, bitmap);
    }

    private static g g() {
        return new uo(Double.valueOf(Math.random()));
    }

    private static j<Bitmap> i(k kVar, int i2, int i3) {
        return kVar.j().a(((ao) ((ao) ao.o0(vh.a).m0(true)).f0(true)).W(i2, i3));
    }

    private void l() {
        if (this.f && !this.g) {
            if (this.h) {
                ep.a(this.n == null, C0201.m82(27597));
                this.a.h();
                this.h = false;
            }
            a aVar = this.n;
            if (aVar != null) {
                this.n = null;
                m(aVar);
                return;
            }
            this.g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.e());
            this.a.d();
            this.l = new a(this.b, this.a.i(), uptimeMillis);
            this.i.a(ao.p0(g())).F0(this.a).z0(this.l);
        }
    }

    private void n() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.c(bitmap);
            this.m = null;
        }
    }

    private void p() {
        if (!this.f) {
            this.f = true;
            this.k = false;
            l();
        }
    }

    private void q() {
        this.f = false;
    }

    public void a() {
        this.c.clear();
        n();
        q();
        a aVar = this.j;
        if (aVar != null) {
            this.d.m(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.m(aVar2);
            this.l = null;
        }
        a aVar3 = this.n;
        if (aVar3 != null) {
            this.d.m(aVar3);
            this.n = null;
        }
        this.a.clear();
        this.k = true;
    }

    public ByteBuffer b() {
        return this.a.g().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.i() : this.m;
    }

    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    public Bitmap e() {
        return this.m;
    }

    public int f() {
        return this.a.b();
    }

    public int h() {
        return this.r;
    }

    public int j() {
        return this.a.j() + this.p;
    }

    public int k() {
        return this.q;
    }

    public void m(a aVar) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.a();
        }
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f) {
            this.n = aVar;
        } else {
            if (aVar.i() != null) {
                n();
                a aVar2 = this.j;
                this.j = aVar;
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    public void o(m<Bitmap> mVar, Bitmap bitmap) {
        ep.d(mVar);
        ep.d(bitmap);
        this.m = bitmap;
        this.i = this.i.a(new ao().h0(mVar));
        this.p = fp.g(bitmap);
        this.q = bitmap.getWidth();
        this.r = bitmap.getHeight();
    }

    public void r(b bVar) {
        if (this.k) {
            throw new IllegalStateException(C0201.m82(27599));
        } else if (!this.c.contains(bVar)) {
            boolean isEmpty = this.c.isEmpty();
            this.c.add(bVar);
            if (isEmpty) {
                p();
            }
        } else {
            throw new IllegalStateException(C0201.m82(27598));
        }
    }

    public void s(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            q();
        }
    }

    public km(qi qiVar, k kVar, ng ngVar, Handler handler, j<Bitmap> jVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = qiVar;
        this.b = handler;
        this.i = jVar;
        this.a = ngVar;
        o(mVar, bitmap);
    }
}
