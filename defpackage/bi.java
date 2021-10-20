package defpackage;

import com.bumptech.glide.load.g;
import vigqyno.C0201;

/* renamed from: bi  reason: default package */
/* compiled from: EngineResource */
public class bi<Z> implements hi<Z> {
    private final boolean a;
    private final boolean b;
    private final hi<Z> c;
    private final a d;
    private final g e;
    private int f;
    private boolean g;

    /* renamed from: bi$a */
    /* compiled from: EngineResource */
    interface a {
        void d(g gVar, bi<?> biVar);
    }

    public bi(hi<Z> hiVar, boolean z, boolean z2, g gVar, a aVar) {
        ep.d(hiVar);
        this.c = hiVar;
        this.a = z;
        this.b = z2;
        this.e = gVar;
        ep.d(aVar);
        this.d = aVar;
    }

    @Override // defpackage.hi
    public int a() {
        return this.c.a();
    }

    @Override // defpackage.hi
    public Class<Z> b() {
        return this.c.b();
    }

    public synchronized void c() {
        if (!this.g) {
            this.f++;
        } else {
            throw new IllegalStateException(C0201.m82(5704));
        }
    }

    public hi<Z> d() {
        return this.c;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        boolean z;
        synchronized (this) {
            if (this.f > 0) {
                z = true;
                int i = this.f - 1;
                this.f = i;
                if (i != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException(C0201.m82(5705));
            }
        }
        if (z) {
            this.d.d(this.e, this);
        }
    }

    @Override // defpackage.hi
    public Z get() {
        return this.c.get();
    }

    @Override // defpackage.hi
    public synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException(C0201.m82(5707));
        } else if (!this.g) {
            this.g = true;
            if (this.b) {
                this.c.recycle();
            }
        } else {
            throw new IllegalStateException(C0201.m82(5706));
        }
    }

    public synchronized String toString() {
        return C0201.m82(5708) + this.a + C0201.m82(5709) + this.d + C0201.m82(5710) + this.e + C0201.m82(5711) + this.f + C0201.m82(5712) + this.g + C0201.m82(5713) + this.c + '}';
    }
}
