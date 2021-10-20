package defpackage;

import android.content.Context;
import defpackage.ce0;
import defpackage.j70;

/* renamed from: de0  reason: default package */
/* compiled from: ImagePipelineExperiments */
public class de0 {
    private final boolean a;
    private final j70.a b;
    private final boolean c;
    private final j70 d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final d m;
    private final c60<Boolean> n;
    private final boolean o;
    private final boolean p;

    /* renamed from: de0$b */
    /* compiled from: ImagePipelineExperiments */
    public static class b {
        private boolean a = false;
        private j70.a b;
        private boolean c = false;
        private j70 d;
        private boolean e = false;
        private boolean f = false;
        private int g = 0;
        private int h = 0;
        public boolean i = false;
        private int j = 2048;
        private boolean k = false;
        private boolean l = false;
        private d m;
        public c60<Boolean> n;
        public boolean o;
        public boolean p;

        public b(ce0.b bVar) {
        }

        public de0 m() {
            return new de0(this);
        }
    }

    /* renamed from: de0$c */
    /* compiled from: ImagePipelineExperiments */
    public static class c implements d {
        @Override // defpackage.de0.d
        public ge0 a(Context context, k60 k60, qe0 qe0, se0 se0, boolean z, boolean z2, boolean z3, zd0 zd0, r60 r60, gd0<m40, ye0> gd0, gd0<m40, q60> gd02, vc0 vc0, vc0 vc02, wc0 wc0, oc0 oc0, int i, int i2, boolean z4, int i3, ud0 ud0) {
            return new ge0(context, k60, qe0, se0, z, z2, z3, zd0, r60, gd0, gd02, vc0, vc02, wc0, oc0, i, i2, z4, i3, ud0);
        }
    }

    /* renamed from: de0$d */
    /* compiled from: ImagePipelineExperiments */
    public interface d {
        ge0 a(Context context, k60 k60, qe0 qe0, se0 se0, boolean z, boolean z2, boolean z3, zd0 zd0, r60 r60, gd0<m40, ye0> gd0, gd0<m40, q60> gd02, vc0 vc0, vc0 vc02, wc0 wc0, oc0 oc0, int i, int i2, boolean z4, int i3, ud0 ud0);
    }

    public boolean a() {
        return this.i;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.j;
    }

    public d e() {
        return this.m;
    }

    public boolean f() {
        return this.f;
    }

    public boolean g() {
        return this.e;
    }

    public j70 h() {
        return this.d;
    }

    public j70.a i() {
        return this.b;
    }

    public boolean j() {
        return this.c;
    }

    public boolean k() {
        return this.o;
    }

    public c60<Boolean> l() {
        return this.n;
    }

    public boolean m() {
        return this.k;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.a;
    }

    public boolean p() {
        return this.p;
    }

    private de0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        if (bVar.m == null) {
            this.m = new c();
        } else {
            this.m = bVar.m;
        }
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
    }
}
