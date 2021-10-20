package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* renamed from: ge0  reason: default package */
/* compiled from: ProducerFactory */
public class ge0 {
    private ContentResolver a;
    private Resources b;
    private AssetManager c;
    private final k60 d;
    private final qe0 e;
    private final se0 f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final zd0 j;
    private final r60 k;
    private final vc0 l;
    private final vc0 m;
    private final gd0<m40, q60> n;
    private final gd0<m40, ye0> o;
    private final wc0 p;
    private final oc0 q;
    private final int r;
    private final int s;
    private boolean t;
    private final ud0 u;
    private final int v;

    public ge0(Context context, k60 k60, qe0 qe0, se0 se0, boolean z, boolean z2, boolean z3, zd0 zd0, r60 r60, gd0<m40, ye0> gd0, gd0<m40, q60> gd02, vc0 vc0, vc0 vc02, wc0 wc0, oc0 oc0, int i2, int i3, boolean z4, int i4, ud0 ud0) {
        this.a = context.getApplicationContext().getContentResolver();
        this.b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = k60;
        this.e = qe0;
        this.f = se0;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = zd0;
        this.k = r60;
        this.o = gd0;
        this.n = gd02;
        this.l = vc0;
        this.m = vc02;
        this.p = wc0;
        this.q = oc0;
        this.r = i2;
        this.s = i3;
        this.t = z4;
        this.v = i4;
        this.u = ud0;
    }

    public static <T> zg0<T> A(rg0<T> rg0) {
        return new zg0<>(rg0);
    }

    public static if0 a(rg0<af0> rg0) {
        return new if0(rg0);
    }

    public static rf0 g(rg0<af0> rg0, rg0<af0> rg02) {
        return new rf0(rg0, rg02);
    }

    public <T> ch0<T> B(rg0<T> rg0) {
        return new ch0<>(5, this.j.b(), rg0);
    }

    public dh0 C(eh0<af0>[] eh0Arr) {
        return new dh0(eh0Arr);
    }

    public gh0 D(rg0<af0> rg0) {
        return new gh0(this.j.c(), this.k, rg0);
    }

    public <T> ah0<T> b(rg0<T> rg0, bh0 bh0) {
        return new ah0<>(rg0, bh0);
    }

    public nf0 c(rg0<v60<ye0>> rg0) {
        return new nf0(this.o, this.p, rg0);
    }

    public of0 d(rg0<v60<ye0>> rg0) {
        return new of0(this.p, rg0);
    }

    public pf0 e(rg0<v60<ye0>> rg0) {
        return new pf0(this.o, this.p, rg0);
    }

    public qf0 f(rg0<v60<ye0>> rg0) {
        return new qf0(rg0, this.r, this.s, this.t);
    }

    public tf0 h() {
        return new tf0(this.k);
    }

    public uf0 i(rg0<af0> rg0) {
        return new uf0(this.d, this.j.a(), this.e, this.f, this.g, this.h, this.i, rg0, this.v, this.u);
    }

    public wf0 j(rg0<af0> rg0) {
        return new wf0(this.l, this.m, this.p, rg0);
    }

    public xf0 k(rg0<af0> rg0) {
        return new xf0(this.l, this.m, this.p, rg0);
    }

    public yf0 l(rg0<af0> rg0) {
        return new yf0(this.p, rg0);
    }

    public zf0 m(rg0<af0> rg0) {
        return new zf0(this.n, this.p, rg0);
    }

    public dg0 n() {
        return new dg0(this.j.e(), this.k, this.c);
    }

    public eg0 o() {
        return new eg0(this.j.e(), this.k, this.a);
    }

    public fg0 p() {
        return new fg0(this.j.e(), this.k, this.a);
    }

    public gg0 q() {
        return new gg0(this.j.e(), this.k, this.a);
    }

    public ig0 r() {
        return new ig0(this.j.e(), this.k);
    }

    public jg0 s() {
        return new jg0(this.j.e(), this.k, this.b);
    }

    public kg0 t() {
        return new kg0(this.j.e(), this.a);
    }

    public mg0 u(ng0 ng0) {
        return new mg0(this.k, this.d, ng0);
    }

    public og0 v(rg0<af0> rg0) {
        return new og0(this.l, this.p, this.k, this.d, rg0);
    }

    public pg0 w(rg0<v60<ye0>> rg0) {
        return new pg0(this.o, this.p, rg0);
    }

    public qg0 x(rg0<v60<ye0>> rg0) {
        return new qg0(rg0, this.q, this.j.c());
    }

    public vg0 y() {
        return new vg0(this.j.e(), this.k, this.a);
    }

    public wg0 z(rg0<af0> rg0, boolean z, sh0 sh0) {
        return new wg0(this.j.c(), this.k, rg0, z, sh0);
    }
}
