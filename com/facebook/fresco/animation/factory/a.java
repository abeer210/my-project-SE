package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.common.time.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import vigqyno.C0201;

/* compiled from: ExperimentalBitmapAnimationDrawableFactory */
public class a implements ve0 {
    private final dc0 a;
    private final ScheduledExecutorService b;
    private final ExecutorService c;
    private final b d;
    private final oc0 e;
    private final yc0<m40, ye0> f;
    private final c60<Integer> g;
    private final c60<Integer> h;

    /* renamed from: com.facebook.fresco.animation.factory.a$a  reason: collision with other inner class name */
    /* compiled from: ExperimentalBitmapAnimationDrawableFactory */
    public static class C0036a implements m40 {
        private final String a;

        public C0036a(int i) {
            this.a = C0201.m82(38984) + i;
        }

        @Override // defpackage.m40
        public boolean a(Uri uri) {
            return uri.toString().startsWith(this.a);
        }

        @Override // defpackage.m40
        public String b() {
            return this.a;
        }
    }

    public a(dc0 dc0, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, b bVar, oc0 oc0, yc0<m40, ye0> yc0, c60<Integer> c60, c60<Integer> c602) {
        this.a = dc0;
        this.b = scheduledExecutorService;
        this.c = executorService;
        this.d = bVar;
        this.e = oc0;
        this.f = yc0;
        this.g = c60;
        this.h = c602;
    }

    private rb0 c(vb0 vb0) {
        tb0 c2 = vb0.c();
        return this.a.a(vb0, new Rect(0, 0, c2.c(), c2.a()));
    }

    private ec0 d(vb0 vb0) {
        return new ec0(new C0036a(vb0.hashCode()), this.f);
    }

    private ra0 e(vb0 vb0) {
        cb0 cb0;
        eb0 eb0;
        rb0 c2 = c(vb0);
        wa0 f2 = f(vb0);
        gb0 gb0 = new gb0(f2, c2);
        int intValue = this.h.get().intValue();
        if (intValue > 0) {
            eb0 eb02 = new eb0(intValue);
            cb0 = g(gb0);
            eb0 = eb02;
        } else {
            eb0 = null;
            cb0 = null;
        }
        return ta0.n(new va0(this.e, f2, new fb0(c2), gb0, eb0, cb0), this.d, this.b);
    }

    private wa0 f(vb0 vb0) {
        int intValue = this.g.get().intValue();
        if (intValue == 1) {
            return new ya0(d(vb0), true);
        }
        if (intValue == 2) {
            return new ya0(d(vb0), false);
        }
        if (intValue != 3) {
            return new ab0();
        }
        return new za0();
    }

    private cb0 g(xa0 xa0) {
        return new db0(this.e, xa0, Bitmap.Config.ARGB_8888, this.c);
    }

    @Override // defpackage.ve0
    public boolean a(ye0 ye0) {
        return ye0 instanceof we0;
    }

    /* renamed from: h */
    public hb0 b(ye0 ye0) {
        return new hb0(e(((we0) ye0).n()));
    }
}
