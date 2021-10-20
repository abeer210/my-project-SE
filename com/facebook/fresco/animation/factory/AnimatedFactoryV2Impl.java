package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;

@u50
public class AnimatedFactoryV2Impl implements xb0 {
    private final oc0 a;
    private final zd0 b;
    private final yc0<m40, ye0> c;
    private final boolean d;
    private ac0 e;
    private dc0 f;
    private gc0 g;
    private ve0 h;

    class a implements qe0 {
        public final /* synthetic */ Bitmap.Config a;

        public a(Bitmap.Config config) {
            this.a = config;
        }

        @Override // defpackage.qe0
        public ye0 a(af0 af0, int i, df0 df0, od0 od0) {
            return AnimatedFactoryV2Impl.this.k().a(af0, od0, this.a);
        }
    }

    class b implements qe0 {
        public final /* synthetic */ Bitmap.Config a;

        public b(Bitmap.Config config) {
            this.a = config;
        }

        @Override // defpackage.qe0
        public ye0 a(af0 af0, int i, df0 df0, od0 od0) {
            return AnimatedFactoryV2Impl.this.k().b(af0, od0, this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements c60<Integer> {
        public c(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        /* renamed from: a */
        public Integer get() {
            return 2;
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements c60<Integer> {
        public d(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        /* renamed from: a */
        public Integer get() {
            return 3;
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements dc0 {
        public e() {
        }

        @Override // defpackage.dc0
        public rb0 a(vb0 vb0, Rect rect) {
            return new cc0(AnimatedFactoryV2Impl.this.j(), vb0, rect, AnimatedFactoryV2Impl.this.d);
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements dc0 {
        public f() {
        }

        @Override // defpackage.dc0
        public rb0 a(vb0 vb0, Rect rect) {
            return new cc0(AnimatedFactoryV2Impl.this.j(), vb0, rect, AnimatedFactoryV2Impl.this.d);
        }
    }

    @u50
    public AnimatedFactoryV2Impl(oc0 oc0, zd0 zd0, yc0<m40, ye0> yc0, boolean z) {
        this.a = oc0;
        this.b = zd0;
        this.c = yc0;
        this.d = z;
    }

    private ac0 g() {
        return new bc0(new f(), this.a);
    }

    private a h() {
        c cVar = new c(this);
        return new a(i(), n50.g(), new j50(this.b.a()), RealtimeSinceBootClock.get(), this.a, this.c, cVar, new d(this));
    }

    private dc0 i() {
        if (this.f == null) {
            this.f = new e();
        }
        return this.f;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private gc0 j() {
        if (this.g == null) {
            this.g = new gc0();
        }
        return this.g;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private ac0 k() {
        if (this.e == null) {
            this.e = g();
        }
        return this.e;
    }

    @Override // defpackage.xb0
    public ve0 a(Context context) {
        if (this.h == null) {
            this.h = h();
        }
        return this.h;
    }

    @Override // defpackage.xb0
    public qe0 b(Bitmap.Config config) {
        return new a(config);
    }

    @Override // defpackage.xb0
    public qe0 c(Bitmap.Config config) {
        return new b(config);
    }
}
