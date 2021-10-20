package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import defpackage.ra0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ta0  reason: default package */
/* compiled from: AnimationBackendDelegateWithInactivityCheck */
public class ta0<T extends ra0> extends sa0<T> {
    private final com.facebook.common.time.b c;
    private final ScheduledExecutorService d;
    private boolean e = false;
    private long f;
    private long g = 2000;
    private long h = 1000;
    private b i;
    private final Runnable j = new a();

    /* renamed from: ta0$a */
    /* compiled from: AnimationBackendDelegateWithInactivityCheck */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            synchronized (ta0.this) {
                ta0.this.e = false;
                if (!ta0.this.p()) {
                    ta0.this.q();
                } else if (ta0.this.i != null) {
                    ta0.this.i.f();
                }
            }
        }
    }

    /* renamed from: ta0$b */
    /* compiled from: AnimationBackendDelegateWithInactivityCheck */
    public interface b {
        void f();
    }

    private ta0(T t, b bVar, com.facebook.common.time.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.i = bVar;
        this.c = bVar2;
        this.d = scheduledExecutorService;
    }

    public static <T extends ra0 & b> sa0<T> n(T t, com.facebook.common.time.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return o(t, (b) t, bVar, scheduledExecutorService);
    }

    public static <T extends ra0> sa0<T> o(T t, b bVar, com.facebook.common.time.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new ta0(t, bVar, bVar2, scheduledExecutorService);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean p() {
        return this.c.now() - this.f > this.g;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void q() {
        if (!this.e) {
            this.e = true;
            this.d.schedule(this.j, this.h, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.ra0, defpackage.sa0
    public boolean j(Drawable drawable, Canvas canvas, int i2) {
        this.f = this.c.now();
        boolean j2 = super.j(drawable, canvas, i2);
        q();
        return j2;
    }
}
