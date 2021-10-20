package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import defpackage.sb0;

/* renamed from: fc0  reason: default package */
/* compiled from: AnimatedImageCompositor */
public class fc0 {
    private final rb0 a;
    private final b b;
    private final Paint c;

    /* access modifiers changed from: package-private */
    /* renamed from: fc0$a */
    /* compiled from: AnimatedImageCompositor */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            iArr[c.REQUIRED.ordinal()] = 1;
            a[c.NOT_REQUIRED.ordinal()] = 2;
            a[c.ABORT.ordinal()] = 3;
            try {
                a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: fc0$b */
    /* compiled from: AnimatedImageCompositor */
    public interface b {
        void a(int i, Bitmap bitmap);

        v60<Bitmap> b(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: fc0$c */
    /* compiled from: AnimatedImageCompositor */
    public enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public fc0(rb0 rb0, b bVar) {
        this.a = rb0;
        this.b = bVar;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(0);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, sb0 sb0) {
        int i = sb0.a;
        int i2 = sb0.b;
        canvas.drawRect((float) i, (float) i2, (float) (i + sb0.c), (float) (i2 + sb0.d), this.c);
    }

    private c b(int i) {
        sb0 e = this.a.e(i);
        sb0.b bVar = e.f;
        if (bVar == sb0.b.DISPOSE_DO_NOT) {
            return c.REQUIRED;
        }
        if (bVar == sb0.b.DISPOSE_TO_BACKGROUND) {
            if (c(e)) {
                return c.NOT_REQUIRED;
            }
            return c.REQUIRED;
        } else if (bVar == sb0.b.DISPOSE_TO_PREVIOUS) {
            return c.SKIP;
        } else {
            return c.ABORT;
        }
    }

    private boolean c(sb0 sb0) {
        return sb0.a == 0 && sb0.b == 0 && sb0.c == this.a.j() && sb0.d == this.a.i();
    }

    private boolean d(int i) {
        if (i == 0) {
            return true;
        }
        sb0 e = this.a.e(i);
        sb0 e2 = this.a.e(i - 1);
        if (e.e == sb0.a.NO_BLEND && c(e)) {
            return true;
        }
        if (e2.f != sb0.b.DISPOSE_TO_BACKGROUND || !c(e2)) {
            return false;
        }
        return true;
    }

    private int e(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = a.a[b(i).ordinal()];
            if (i2 == 1) {
                sb0 e = this.a.e(i);
                v60<Bitmap> b2 = this.b.b(i);
                if (b2 != null) {
                    try {
                        canvas.drawBitmap(b2.w(), 0.0f, 0.0f, (Paint) null);
                        if (e.f == sb0.b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, e);
                        }
                        return i + 1;
                    } finally {
                        b2.close();
                    }
                } else if (d(i)) {
                    return i;
                }
            } else if (i2 == 2) {
                return i + 1;
            } else {
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    public void f(int i, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int e = !d(i) ? e(i - 1, canvas) : i; e < i; e++) {
            sb0 e2 = this.a.e(e);
            sb0.b bVar = e2.f;
            if (bVar != sb0.b.DISPOSE_TO_PREVIOUS) {
                if (e2.e == sb0.a.NO_BLEND) {
                    a(canvas, e2);
                }
                this.a.f(e, canvas);
                this.b.a(e, bitmap);
                if (bVar == sb0.b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, e2);
                }
            }
        }
        sb0 e3 = this.a.e(i);
        if (e3.e == sb0.a.NO_BLEND) {
            a(canvas, e3);
        }
        this.a.f(i, canvas);
    }
}
