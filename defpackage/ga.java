package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ga  reason: default package */
/* compiled from: LottieDrawable */
public class ga extends Drawable implements Drawable.Callback, Animatable {
    private final Matrix a = new Matrix();
    private ea b;
    private final xf c = new xf();
    private float d = 1.0f;
    private boolean e = true;
    private boolean f = false;
    private final ArrayList<o> g;
    private final ValueAnimator.AnimatorUpdateListener h;
    private ImageView.ScaleType i;
    private ec j;
    private String k;
    private ba l;
    private dc m;
    public aa n;
    public sa o;
    private boolean p;
    private ud q;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;

    /* access modifiers changed from: package-private */
    /* renamed from: ga$a */
    /* compiled from: LottieDrawable */
    public class a implements o {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.W(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$b */
    /* compiled from: LottieDrawable */
    public class b implements o {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.V(this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$c */
    /* compiled from: LottieDrawable */
    public class c implements o {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.P(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$d */
    /* compiled from: LottieDrawable */
    public class d implements o {
        public final /* synthetic */ float a;

        public d(float f) {
            this.a = f;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.b0(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$e */
    /* compiled from: LottieDrawable */
    public class e implements o {
        public final /* synthetic */ jc a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ dg c;

        public e(jc jcVar, Object obj, dg dgVar) {
            this.a = jcVar;
            this.b = obj;
            this.c = dgVar;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.d(this.a, this.b, this.c);
        }
    }

    /* renamed from: ga$f */
    /* compiled from: LottieDrawable */
    class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (ga.this.q != null) {
                ga.this.q.H(ga.this.c.i());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$g */
    /* compiled from: LottieDrawable */
    public class g implements o {
        public g() {
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$h */
    /* compiled from: LottieDrawable */
    public class h implements o {
        public h() {
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.K();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$i */
    /* compiled from: LottieDrawable */
    public class i implements o {
        public final /* synthetic */ int a;

        public i(int i) {
            this.a = i;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.X(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$j */
    /* compiled from: LottieDrawable */
    public class j implements o {
        public final /* synthetic */ float a;

        public j(float f) {
            this.a = f;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.Z(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$k */
    /* compiled from: LottieDrawable */
    public class k implements o {
        public final /* synthetic */ int a;

        public k(int i) {
            this.a = i;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.S(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$l */
    /* compiled from: LottieDrawable */
    public class l implements o {
        public final /* synthetic */ float a;

        public l(float f) {
            this.a = f;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.U(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$m */
    /* compiled from: LottieDrawable */
    public class m implements o {
        public final /* synthetic */ String a;

        public m(String str) {
            this.a = str;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.Y(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ga$n */
    /* compiled from: LottieDrawable */
    public class n implements o {
        public final /* synthetic */ String a;

        public n(String str) {
            this.a = str;
        }

        @Override // defpackage.ga.o
        public void a(ea eaVar) {
            ga.this.T(this.a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ga$o */
    /* compiled from: LottieDrawable */
    public interface o {
        void a(ea eaVar);
    }

    public ga() {
        new HashSet();
        this.g = new ArrayList<>();
        f fVar = new f();
        this.h = fVar;
        this.u = 255;
        this.x = true;
        this.y = false;
        this.c.addUpdateListener(fVar);
    }

    private void e() {
        this.q = new ud(this, we.a(this.b), this.b.j(), this.b);
    }

    private void h(Canvas canvas) {
        if (ImageView.ScaleType.FIT_XY == this.i) {
            i(canvas);
        } else {
            j(canvas);
        }
    }

    private void i(Canvas canvas) {
        float f2;
        if (this.q != null) {
            int i2 = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.b.b().width());
            float height = ((float) bounds.height()) / ((float) this.b.b().height());
            if (this.x) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f2 = 1.0f / min;
                    width /= f2;
                    height /= f2;
                } else {
                    f2 = 1.0f;
                }
                if (f2 > 1.0f) {
                    i2 = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f3 = width2 * min;
                    float f4 = min * height2;
                    canvas.translate(width2 - f3, height2 - f4);
                    canvas.scale(f2, f2, f3, f4);
                }
            }
            this.a.reset();
            this.a.preScale(width, height);
            this.q.g(canvas, this.a, this.u);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    private void j(Canvas canvas) {
        float f2;
        if (this.q != null) {
            float f3 = this.d;
            float v2 = v(canvas);
            if (f3 > v2) {
                f2 = this.d / v2;
            } else {
                v2 = f3;
                f2 = 1.0f;
            }
            int i2 = -1;
            if (f2 > 1.0f) {
                i2 = canvas.save();
                float width = ((float) this.b.b().width()) / 2.0f;
                float height = ((float) this.b.b().height()) / 2.0f;
                float f4 = width * v2;
                float f5 = height * v2;
                canvas.translate((B() * width) - f4, (B() * height) - f5);
                canvas.scale(f2, f2, f4, f5);
            }
            this.a.reset();
            this.a.preScale(v2, v2);
            this.q.g(canvas, this.a, this.u);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    private void k0() {
        if (this.b != null) {
            float B = B();
            setBounds(0, 0, (int) (((float) this.b.b().width()) * B), (int) (((float) this.b.b().height()) * B));
        }
    }

    private Context o() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private dc p() {
        if (getCallback() == null) {
            return null;
        }
        if (this.m == null) {
            this.m = new dc(getCallback(), this.n);
        }
        return this.m;
    }

    private ec s() {
        if (getCallback() == null) {
            return null;
        }
        ec ecVar = this.j;
        if (ecVar != null && !ecVar.b(o())) {
            this.j = null;
        }
        if (this.j == null) {
            this.j = new ec(getCallback(), this.k, this.l, this.b.i());
        }
        return this.j;
    }

    private float v(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.b.b().width()), ((float) canvas.getHeight()) / ((float) this.b.b().height()));
    }

    public int A() {
        return this.c.getRepeatMode();
    }

    public float B() {
        return this.d;
    }

    public float C() {
        return this.c.o();
    }

    public sa D() {
        return this.o;
    }

    public Typeface E(String str, String str2) {
        dc p2 = p();
        if (p2 != null) {
            return p2.b(str, str2);
        }
        return null;
    }

    public boolean F() {
        xf xfVar = this.c;
        if (xfVar == null) {
            return false;
        }
        return xfVar.isRunning();
    }

    public boolean G() {
        return this.w;
    }

    public void H() {
        this.g.clear();
        this.c.s();
    }

    public void I() {
        if (this.q == null) {
            this.g.add(new g());
            return;
        }
        if (this.e || z() == 0) {
            this.c.t();
        }
        if (!this.e) {
            P((int) (C() < 0.0f ? w() : u()));
            this.c.g();
        }
    }

    public List<jc> J(jc jcVar) {
        if (this.q == null) {
            wf.c(C0201.m82(16997));
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.q.d(jcVar, 0, arrayList, new jc(new String[0]));
        return arrayList;
    }

    public void K() {
        if (this.q == null) {
            this.g.add(new h());
            return;
        }
        if (this.e || z() == 0) {
            this.c.x();
        }
        if (!this.e) {
            P((int) (C() < 0.0f ? w() : u()));
            this.c.g();
        }
    }

    public void L() {
        this.c.y();
    }

    public void M(boolean z) {
        this.w = z;
    }

    public boolean N(ea eaVar) {
        if (this.b == eaVar) {
            return false;
        }
        this.y = false;
        g();
        this.b = eaVar;
        e();
        this.c.z(eaVar);
        b0(this.c.getAnimatedFraction());
        f0(this.d);
        k0();
        Iterator it = new ArrayList(this.g).iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(eaVar);
            it.remove();
        }
        this.g.clear();
        eaVar.u(this.v);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void O(aa aaVar) {
        this.n = aaVar;
        dc dcVar = this.m;
        if (dcVar != null) {
            dcVar.c(aaVar);
        }
    }

    public void P(int i2) {
        if (this.b == null) {
            this.g.add(new c(i2));
        } else {
            this.c.B((float) i2);
        }
    }

    public void Q(ba baVar) {
        this.l = baVar;
        ec ecVar = this.j;
        if (ecVar != null) {
            ecVar.d(baVar);
        }
    }

    public void R(String str) {
        this.k = str;
    }

    public void S(int i2) {
        if (this.b == null) {
            this.g.add(new k(i2));
        } else {
            this.c.C(((float) i2) + 0.99f);
        }
    }

    public void T(String str) {
        ea eaVar = this.b;
        if (eaVar == null) {
            this.g.add(new n(str));
            return;
        }
        mc k2 = eaVar.k(str);
        if (k2 != null) {
            S((int) (k2.b + k2.c));
            return;
        }
        throw new IllegalArgumentException(C0201.m82(16998) + str + C0201.m82(16999));
    }

    public void U(float f2) {
        ea eaVar = this.b;
        if (eaVar == null) {
            this.g.add(new l(f2));
        } else {
            S((int) zf.j(eaVar.o(), this.b.f(), f2));
        }
    }

    public void V(int i2, int i3) {
        if (this.b == null) {
            this.g.add(new b(i2, i3));
        } else {
            this.c.D((float) i2, ((float) i3) + 0.99f);
        }
    }

    public void W(String str) {
        ea eaVar = this.b;
        if (eaVar == null) {
            this.g.add(new a(str));
            return;
        }
        mc k2 = eaVar.k(str);
        if (k2 != null) {
            int i2 = (int) k2.b;
            V(i2, ((int) k2.c) + i2);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(17000) + str + C0201.m82(17001));
    }

    public void X(int i2) {
        if (this.b == null) {
            this.g.add(new i(i2));
        } else {
            this.c.F(i2);
        }
    }

    public void Y(String str) {
        ea eaVar = this.b;
        if (eaVar == null) {
            this.g.add(new m(str));
            return;
        }
        mc k2 = eaVar.k(str);
        if (k2 != null) {
            X((int) k2.b);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(17002) + str + C0201.m82(17003));
    }

    public void Z(float f2) {
        ea eaVar = this.b;
        if (eaVar == null) {
            this.g.add(new j(f2));
        } else {
            X((int) zf.j(eaVar.o(), this.b.f(), f2));
        }
    }

    public void a0(boolean z) {
        this.v = z;
        ea eaVar = this.b;
        if (eaVar != null) {
            eaVar.u(z);
        }
    }

    public void b0(float f2) {
        if (this.b == null) {
            this.g.add(new d(f2));
            return;
        }
        String r0 = C0201.m82(17004);
        ca.a(r0);
        this.c.B(zf.j(this.b.o(), this.b.f(), f2));
        ca.b(r0);
    }

    public void c(Animator.AnimatorListener animatorListener) {
        this.c.addListener(animatorListener);
    }

    public void c0(int i2) {
        this.c.setRepeatCount(i2);
    }

    public <T> void d(jc jcVar, T t, dg<T> dgVar) {
        if (this.q == null) {
            this.g.add(new e(jcVar, t, dgVar));
            return;
        }
        boolean z = true;
        if (jcVar.d() != null) {
            jcVar.d().h(t, dgVar);
        } else {
            List<jc> J = J(jcVar);
            for (int i2 = 0; i2 < J.size(); i2++) {
                J.get(i2).d().h(t, dgVar);
            }
            z = true ^ J.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == la.A) {
                b0(y());
            }
        }
    }

    public void d0(int i2) {
        this.c.setRepeatMode(i2);
    }

    public void draw(Canvas canvas) {
        this.y = false;
        String r0 = C0201.m82(17005);
        ca.a(r0);
        if (this.f) {
            try {
                h(canvas);
            } catch (Throwable th) {
                wf.b(C0201.m82(17006), th);
            }
        } else {
            h(canvas);
        }
        ca.b(r0);
    }

    public void e0(boolean z) {
        this.f = z;
    }

    public void f() {
        this.g.clear();
        this.c.cancel();
    }

    public void f0(float f2) {
        this.d = f2;
        k0();
    }

    public void g() {
        if (this.c.isRunning()) {
            this.c.cancel();
        }
        this.b = null;
        this.q = null;
        this.j = null;
        this.c.f();
        invalidateSelf();
    }

    public void g0(ImageView.ScaleType scaleType) {
        this.i = scaleType;
    }

    public int getAlpha() {
        return this.u;
    }

    public int getIntrinsicHeight() {
        ea eaVar = this.b;
        if (eaVar == null) {
            return -1;
        }
        return (int) (((float) eaVar.b().height()) * B());
    }

    public int getIntrinsicWidth() {
        ea eaVar = this.b;
        if (eaVar == null) {
            return -1;
        }
        return (int) (((float) eaVar.b().width()) * B());
    }

    public int getOpacity() {
        return -3;
    }

    public void h0(float f2) {
        this.c.G(f2);
    }

    public void i0(Boolean bool) {
        this.e = bool.booleanValue();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.y) {
            this.y = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return F();
    }

    public void j0(sa saVar) {
        this.o = saVar;
    }

    public void k(boolean z) {
        if (this.p != z) {
            if (Build.VERSION.SDK_INT < 19) {
                wf.c(C0201.m82(17007));
                return;
            }
            this.p = z;
            if (this.b != null) {
                e();
            }
        }
    }

    public boolean l() {
        return this.p;
    }

    public boolean l0() {
        return this.o == null && this.b.c().n() > 0;
    }

    public void m() {
        this.g.clear();
        this.c.g();
    }

    public ea n() {
        return this.b;
    }

    public int q() {
        return (int) this.c.j();
    }

    public Bitmap r(String str) {
        ec s = s();
        if (s != null) {
            return s.a(str);
        }
        return null;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        this.u = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        wf.c(C0201.m82(17008));
    }

    public void start() {
        I();
    }

    public void stop() {
        m();
    }

    public String t() {
        return this.k;
    }

    public float u() {
        return this.c.m();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float w() {
        return this.c.n();
    }

    public oa x() {
        ea eaVar = this.b;
        if (eaVar != null) {
            return eaVar.m();
        }
        return null;
    }

    public float y() {
        return this.c.i();
    }

    public int z() {
        return this.c.getRepeatCount();
    }
}
