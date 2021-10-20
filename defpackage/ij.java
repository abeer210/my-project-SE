package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: ij  reason: default package */
/* compiled from: MemorySizeCalculator */
public final class ij {
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    /* renamed from: ij$a */
    /* compiled from: MemorySizeCalculator */
    public static final class a {
        public static final int i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        public final Context a;
        public ActivityManager b;
        public c c;
        public float d = 2.0f;
        public float e = ((float) i);
        public float f = 0.4f;
        public float g = 0.33f;
        public int h = 4194304;

        public a(Context context) {
            this.a = context;
            this.b = (ActivityManager) context.getSystemService(C0201.m82(31087));
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && ij.e(this.b)) {
                this.e = 0.0f;
            }
        }

        public ij a() {
            return new ij(this);
        }
    }

    /* renamed from: ij$b */
    /* compiled from: MemorySizeCalculator */
    private static final class b implements c {
        private final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // defpackage.ij.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // defpackage.ij.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* renamed from: ij$c */
    /* compiled from: MemorySizeCalculator */
    interface c {
        int a();

        int b();
    }

    public ij(a aVar) {
        int i;
        this.c = aVar.a;
        if (e(aVar.b)) {
            i = aVar.h / 2;
        } else {
            i = aVar.h;
        }
        this.d = i;
        int c2 = c(aVar.b, aVar.f, aVar.g);
        float b2 = (float) (aVar.c.b() * aVar.c.a() * 4);
        int round = Math.round(aVar.e * b2);
        int round2 = Math.round(b2 * aVar.d);
        int i2 = c2 - this.d;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.b = round2;
            this.a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.e;
            float f3 = aVar.d;
            float f4 = f / (f2 + f3);
            this.b = Math.round(f3 * f4);
            this.a = Math.round(f4 * aVar.e);
        }
        String r2 = C0201.m82(21934);
        if (Log.isLoggable(r2, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(21935));
            sb.append(f(this.b));
            sb.append(C0201.m82(21936));
            sb.append(f(this.a));
            sb.append(C0201.m82(21937));
            sb.append(f(this.d));
            sb.append(C0201.m82(21938));
            sb.append(i3 > c2);
            sb.append(C0201.m82(21939));
            sb.append(f(c2));
            sb.append(C0201.m82(21940));
            sb.append(aVar.b.getMemoryClass());
            sb.append(C0201.m82(21941));
            sb.append(e(aVar.b));
            Log.d(r2, sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f, float f2) {
        boolean e = e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i) {
        return Formatter.formatFileSize(this.c, (long) i);
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}
