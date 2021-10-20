package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: am0  reason: default package */
/* compiled from: RenderingHandler */
public class am0 extends Handler {
    private static final String f = am0.class.getName();
    private xl0 a;
    private RectF b = new RectF();
    private Rect c = new Rect();
    private Matrix d = new Matrix();
    private boolean e = false;

    /* renamed from: am0$a */
    /* compiled from: RenderingHandler */
    class a implements Runnable {
        public final /* synthetic */ pm0 a;

        public a(pm0 pm0) {
            this.a = pm0;
        }

        public void run() {
            am0.this.a.U(this.a);
        }
    }

    /* renamed from: am0$b */
    /* compiled from: RenderingHandler */
    class b implements Runnable {
        public final /* synthetic */ bm0 a;

        public b(bm0 bm0) {
            this.a = bm0;
        }

        public void run() {
            am0.this.a.V(this.a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: am0$c */
    /* compiled from: RenderingHandler */
    public class c {
        public float a;
        public float b;
        public RectF c;
        public int d;
        public boolean e;
        public int f;
        public boolean g;
        public boolean h;

        public c(am0 am0, float f2, float f3, RectF rectF, int i, boolean z, int i2, boolean z2, boolean z3) {
            this.d = i;
            this.a = f2;
            this.b = f3;
            this.c = rectF;
            this.e = z;
            this.f = i2;
            this.g = z2;
            this.h = z3;
        }
    }

    public am0(Looper looper, xl0 xl0) {
        super(looper);
        this.a = xl0;
    }

    private void c(int i, int i2, RectF rectF) {
        this.d.reset();
        float f2 = (float) i;
        float f3 = (float) i2;
        this.d.postTranslate((-rectF.left) * f2, (-rectF.top) * f3);
        this.d.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.b.set(0.0f, 0.0f, f2, f3);
        this.d.mapRect(this.b);
        this.b.round(this.c);
    }

    private pm0 d(c cVar) throws bm0 {
        zl0 zl0 = this.a.g;
        zl0.t(cVar.d);
        int round = Math.round(cVar.a);
        int round2 = Math.round(cVar.b);
        if (!(round == 0 || round2 == 0 || zl0.u(cVar.d))) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(round, round2, cVar.g ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                c(round, round2, cVar.c);
                zl0.z(createBitmap, cVar.d, this.c, cVar.h);
                return new pm0(cVar.d, createBitmap, cVar.c, cVar.e, cVar.f);
            } catch (IllegalArgumentException e2) {
                Log.e(f, C0201.m82(33437), e2);
            }
        }
        return null;
    }

    public void b(int i, float f2, float f3, RectF rectF, boolean z, int i2, boolean z2, boolean z3) {
        sendMessage(obtainMessage(1, new c(this, f2, f3, rectF, i, z, i2, z2, z3)));
    }

    public void e() {
        this.e = true;
    }

    public void f() {
        this.e = false;
    }

    public void handleMessage(Message message) {
        try {
            pm0 d2 = d((c) message.obj);
            if (d2 == null) {
                return;
            }
            if (this.e) {
                this.a.post(new a(d2));
            } else {
                d2.d().recycle();
            }
        } catch (bm0 e2) {
            this.a.post(new b(e2));
        }
    }
}
