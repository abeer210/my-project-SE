package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;
import defpackage.km;
import java.nio.ByteBuffer;
import java.util.List;
import vigqyno.C0201;

/* renamed from: gm  reason: default package */
/* compiled from: GifDrawable */
public class gm extends Drawable implements km.b, Animatable {
    private final a a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;
    private List<i7> k;

    /* access modifiers changed from: package-private */
    /* renamed from: gm$a */
    /* compiled from: GifDrawable */
    public static final class a extends Drawable.ConstantState {
        public final km a;

        public a(km kmVar) {
            this.a = kmVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new gm(this);
        }
    }

    public gm(Context context, ng ngVar, m<Bitmap> mVar, int i2, int i3, Bitmap bitmap) {
        this(new a(new km(c.c(context), ngVar, i2, i3, mVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private Paint h() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    private void j() {
        List<i7> list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.get(i2).a(this);
            }
        }
    }

    private void l() {
        this.f = 0;
    }

    private void n() {
        ep.a(!this.d, C0201.m82(17912));
        if (this.a.a.f() == 1) {
            invalidateSelf();
        } else if (!this.b) {
            this.b = true;
            this.a.a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.b = false;
        this.a.a.s(this);
    }

    @Override // defpackage.km.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f++;
        }
        int i2 = this.g;
        if (i2 != -1 && this.f >= i2) {
            j();
            stop();
        }
    }

    public ByteBuffer c() {
        return this.a.a.b();
    }

    public void draw(Canvas canvas) {
        if (!this.d) {
            if (this.h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
                this.h = false;
            }
            canvas.drawBitmap(this.a.a.c(), (Rect) null, d(), h());
        }
    }

    public Bitmap e() {
        return this.a.a.e();
    }

    public int f() {
        return this.a.a.f();
    }

    public int g() {
        return this.a.a.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        return this.a.a.h();
    }

    public int getIntrinsicWidth() {
        return this.a.a.k();
    }

    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.a.a.j();
    }

    public boolean isRunning() {
        return this.b;
    }

    public void k() {
        this.d = true;
        this.a.a.a();
    }

    public void m(m<Bitmap> mVar, Bitmap bitmap) {
        this.a.a.o(mVar, bitmap);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    public void setAlpha(int i2) {
        h().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        ep.a(!this.d, C0201.m82(17913));
        this.e = z;
        if (!z) {
            o();
        } else if (this.c) {
            n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.c = true;
        l();
        if (this.e) {
            n();
        }
    }

    public void stop() {
        this.c = false;
        o();
    }

    public gm(a aVar) {
        this.e = true;
        this.g = -1;
        ep.d(aVar);
        this.a = aVar;
    }
}
