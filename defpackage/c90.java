package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.w90;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: c90  reason: default package */
/* compiled from: DebugControllerOverlayDrawable */
public class c90 extends Drawable implements e90 {
    private String a;
    private String b;
    private int c;
    private int d;
    private int e;
    private String f;
    private w90.c g;
    private HashMap<String, String> h = new HashMap<>();
    private int i;
    private int j;
    private int k = 80;
    private final Paint l = new Paint(1);
    private final Matrix m = new Matrix();
    private final Rect n = new Rect();
    private final RectF o = new RectF();
    private int p;
    private int q;
    private int u;
    private int v;
    private int w;
    private long x;
    private String y;

    public c90() {
        e();
    }

    private void b(Canvas canvas, String str, Object... objArr) {
        if (objArr == null) {
            canvas.drawText(str, (float) this.v, (float) this.w, this.l);
        } else {
            canvas.drawText(String.format(str, objArr), (float) this.v, (float) this.w, this.l);
        }
        this.w += this.u;
    }

    private void d(Rect rect, int i2, int i3) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i3, rect.height() / i2)));
        this.l.setTextSize((float) min);
        int i4 = min + 8;
        this.u = i4;
        if (this.k == 80) {
            this.u = i4 * -1;
        }
        this.p = rect.left + 10;
        this.q = this.k == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    @Override // defpackage.e90
    public void a(long j2) {
        this.x = j2;
        invalidateSelf();
    }

    public int c(int i2, int i3, w90.c cVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i2 > 0 && i3 > 0) {
            if (cVar != null) {
                Rect rect = this.n;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.m.reset();
                cVar.a(this.m, this.n, i2, i3, 0.0f, 0.0f);
                RectF rectF = this.o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i2;
                rectF.bottom = (float) i3;
                this.m.mapRect(rectF);
                width = Math.min(width, (int) this.o.width());
                height = Math.min(height, (int) this.o.height());
            }
            float f2 = (float) width;
            float f3 = f2 * 0.1f;
            float f4 = f2 * 0.5f;
            float f5 = (float) height;
            float f6 = 0.1f * f5;
            float f7 = f5 * 0.5f;
            int abs = Math.abs(i2 - width);
            int abs2 = Math.abs(i3 - height);
            float f8 = (float) abs;
            if (f8 < f3 && ((float) abs2) < f6) {
                return 1716301648;
            }
            if (f8 >= f4 || ((float) abs2) >= f7) {
                return 1727284022;
            }
            return 1728026624;
        }
        return 1727284022;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(2.0f);
        this.l.setColor(-26624);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.l);
        this.l.setStyle(Paint.Style.FILL);
        this.l.setColor(c(this.c, this.d, this.g));
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.l);
        this.l.setStyle(Paint.Style.FILL);
        this.l.setStrokeWidth(0.0f);
        this.l.setColor(-1);
        this.v = this.p;
        this.w = this.q;
        String str = this.b;
        if (str != null) {
            b(canvas, C0201.m82(12074), this.a, str);
        } else {
            b(canvas, C0201.m82(12075), this.a);
        }
        b(canvas, C0201.m82(12076), Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        b(canvas, C0201.m82(12077), Integer.valueOf(this.c), Integer.valueOf(this.d));
        b(canvas, C0201.m82(12078), Integer.valueOf(this.e / 1024));
        String str2 = this.f;
        if (str2 != null) {
            b(canvas, C0201.m82(12079), str2);
        }
        int i2 = this.i;
        if (i2 > 0) {
            b(canvas, C0201.m82(12080), Integer.valueOf(i2), Integer.valueOf(this.j));
        }
        w90.c cVar = this.g;
        if (cVar != null) {
            b(canvas, C0201.m82(12081), cVar);
        }
        long j2 = this.x;
        if (j2 >= 0) {
            b(canvas, C0201.m82(12082), Long.valueOf(j2));
        }
        String str3 = this.y;
        if (str3 != null) {
            b(canvas, C0201.m82(12083), str3);
        }
        for (Map.Entry<String, String> entry : this.h.entrySet()) {
            b(canvas, C0201.m82(12084), entry.getKey(), entry.getValue());
        }
    }

    public void e() {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.h = new HashMap<>();
        this.i = -1;
        this.j = -1;
        this.f = null;
        f(null);
        this.x = -1;
        this.y = null;
        invalidateSelf();
    }

    public void f(String str) {
        if (str == null) {
            str = C0201.m82(12085);
        }
        this.a = str;
        invalidateSelf();
    }

    public void g(int i2, int i3) {
        this.c = i2;
        this.d = i3;
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void h(int i2) {
        this.e = i2;
    }

    public void i(String str) {
        this.y = str;
        invalidateSelf();
    }

    public void j(w90.c cVar) {
        this.g = cVar;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d(rect, 9, 8);
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
