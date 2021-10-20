package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: f90  reason: default package */
/* compiled from: ArrayDrawable */
public class f90 extends Drawable implements Drawable.Callback, y90, x90 {
    private y90 a;
    private final i90 b = new i90();
    private final Drawable[] c;
    private final h90[] d;
    private final Rect e = new Rect();
    private boolean f;
    private boolean g;
    private boolean h;

    /* access modifiers changed from: package-private */
    /* renamed from: f90$a */
    /* compiled from: ArrayDrawable */
    public class a implements h90 {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // defpackage.h90
        public Drawable g(Drawable drawable) {
            return f90.this.g(this.a, drawable);
        }

        @Override // defpackage.h90
        public Drawable l() {
            return f90.this.c(this.a);
        }
    }

    public f90(Drawable[] drawableArr) {
        int i = 0;
        this.f = false;
        this.g = false;
        this.h = false;
        z50.g(drawableArr);
        this.c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.c;
            if (i < drawableArr2.length) {
                j90.d(drawableArr2[i], this, this);
                i++;
            } else {
                this.d = new h90[drawableArr2.length];
                return;
            }
        }
    }

    private h90 a(int i) {
        return new a(i);
    }

    @Override // defpackage.x90
    public void b(y90 y90) {
        this.a = y90;
    }

    public Drawable c(int i) {
        boolean z = true;
        z50.b(i >= 0);
        if (i >= this.c.length) {
            z = false;
        }
        z50.b(z);
        return this.c[i];
    }

    @Override // defpackage.y90
    public void d(Matrix matrix) {
        y90 y90 = this.a;
        if (y90 != null) {
            y90.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public h90 e(int i) {
        boolean z = true;
        z50.b(i >= 0);
        if (i >= this.d.length) {
            z = false;
        }
        z50.b(z);
        h90[] h90Arr = this.d;
        if (h90Arr[i] == null) {
            h90Arr[i] = a(i);
        }
        return this.d[i];
    }

    public int f() {
        return this.c.length;
    }

    public Drawable g(int i, Drawable drawable) {
        boolean z = true;
        z50.b(i >= 0);
        if (i >= this.c.length) {
            z = false;
        }
        z50.b(z);
        Drawable drawable2 = this.c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.h) {
                drawable.mutate();
            }
            j90.d(this.c[i], null, null);
            j90.d(drawable, null, null);
            j90.e(drawable, this.b);
            j90.a(drawable, this);
            j90.d(drawable, this, this);
            this.g = false;
            this.c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.c.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.e;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // defpackage.y90
    public void h(RectF rectF) {
        y90 y90 = this.a;
        if (y90 != null) {
            y90.h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        if (!this.g) {
            this.f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f = z2 | z;
                i++;
            }
            this.g = true;
        }
        return this.f;
    }

    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.h = true;
                return this;
            }
        }
    }

    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.b.b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z) {
        this.b.d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.b.e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @TargetApi(21)
    public void setHotspot(float f2, float f3) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f2, f3);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
