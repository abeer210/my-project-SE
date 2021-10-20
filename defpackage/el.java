package defpackage;

import android.os.Build;
import com.bumptech.glide.load.h;
import vigqyno.C0201;

/* renamed from: el  reason: default package */
/* compiled from: DownsampleStrategy */
public abstract class el {
    public static final el a = new c();
    public static final el b = new a();
    public static final el c = new b();
    public static final el d = new d();
    public static final el e;
    public static final h<el> f;
    public static final boolean g = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: el$a */
    /* compiled from: DownsampleStrategy */
    private static class a extends el {
        @Override // defpackage.el
        public e a(int i, int i2, int i3, int i4) {
            if (b(i, i2, i3, i4) == 1.0f) {
                return e.QUALITY;
            }
            return el.a.a(i, i2, i3, i4);
        }

        @Override // defpackage.el
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, el.a.b(i, i2, i3, i4));
        }
    }

    /* renamed from: el$b */
    /* compiled from: DownsampleStrategy */
    private static class b extends el {
        @Override // defpackage.el
        public e a(int i, int i2, int i3, int i4) {
            return e.QUALITY;
        }

        @Override // defpackage.el
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: el$c */
    /* compiled from: DownsampleStrategy */
    private static class c extends el {
        @Override // defpackage.el
        public e a(int i, int i2, int i3, int i4) {
            if (el.g) {
                return e.QUALITY;
            }
            return e.MEMORY;
        }

        @Override // defpackage.el
        public float b(int i, int i2, int i3, int i4) {
            if (el.g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: el$d */
    /* compiled from: DownsampleStrategy */
    private static class d extends el {
        @Override // defpackage.el
        public e a(int i, int i2, int i3, int i4) {
            return e.QUALITY;
        }

        @Override // defpackage.el
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: el$e */
    /* compiled from: DownsampleStrategy */
    public enum e {
        MEMORY,
        QUALITY
    }

    static {
        el elVar = c;
        e = elVar;
        f = h.f(C0201.m82(12988), elVar);
    }

    public abstract e a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
