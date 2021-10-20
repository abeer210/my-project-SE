package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: wi  reason: default package */
/* compiled from: LruBitmapPool */
public class wi implements qi {
    private static final Bitmap.Config j = Bitmap.Config.ARGB_8888;
    private final xi a;
    private final Set<Bitmap.Config> b;
    private final a c;
    private long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* access modifiers changed from: private */
    /* renamed from: wi$a */
    /* compiled from: LruBitmapPool */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* renamed from: wi$b */
    /* compiled from: LruBitmapPool */
    private static final class b implements a {
        @Override // defpackage.wi.a
        public void a(Bitmap bitmap) {
        }

        @Override // defpackage.wi.a
        public void b(Bitmap bitmap) {
        }
    }

    public wi(long j2, xi xiVar, Set<Bitmap.Config> set) {
        this.d = j2;
        this.a = xiVar;
        this.b = set;
        this.c = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException(C0201.m82(15070) + config + C0201.m82(15071));
        }
    }

    private static Bitmap g(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    private void h() {
        if (Log.isLoggable(C0201.m82(15072), 2)) {
            i();
        }
    }

    private void i() {
        Log.v(C0201.m82(15080), C0201.m82(15073) + this.f + C0201.m82(15074) + this.g + C0201.m82(15075) + this.h + C0201.m82(15076) + this.i + C0201.m82(15077) + this.e + C0201.m82(15078) + this.d + C0201.m82(15079) + this.a);
    }

    private void j() {
        q(this.d);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static xi l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new zi();
        }
        return new oi();
    }

    private synchronized Bitmap m(int i2, int i3, Bitmap.Config config) {
        Bitmap d2;
        f(config);
        d2 = this.a.d(i2, i3, config != null ? config : j);
        if (d2 == null) {
            if (Log.isLoggable(C0201.m82(15081), 3)) {
                Log.d(C0201.m82(15082), C0201.m82(15083) + this.a.a(i2, i3, config));
            }
            this.g++;
        } else {
            this.f++;
            this.e -= (long) this.a.b(d2);
            this.c.a(d2);
            p(d2);
        }
        if (Log.isLoggable(C0201.m82(15084), 2)) {
            Log.v(C0201.m82(15085), C0201.m82(15086) + this.a.a(i2, i3, config));
        }
        h();
        return d2;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j2) {
        while (this.e > j2) {
            Bitmap removeLast = this.a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable(C0201.m82(15087), 5)) {
                    Log.w(C0201.m82(15088), C0201.m82(15089));
                    i();
                }
                this.e = 0;
                return;
            }
            this.c.a(removeLast);
            this.e -= (long) this.a.b(removeLast);
            this.i++;
            if (Log.isLoggable(C0201.m82(15090), 3)) {
                Log.d(C0201.m82(15091), C0201.m82(15092) + this.a.e(removeLast));
            }
            h();
            removeLast.recycle();
        }
    }

    @Override // defpackage.qi
    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        String r0 = C0201.m82(15093);
        if (Log.isLoggable(r0, 3)) {
            Log.d(r0, C0201.m82(15094) + i2);
        }
        if (i2 >= 40 || (Build.VERSION.SDK_INT >= 23 && i2 >= 20)) {
            b();
        } else if (i2 >= 20 || i2 == 15) {
            q(n() / 2);
        }
    }

    @Override // defpackage.qi
    public void b() {
        String r0 = C0201.m82(15095);
        if (Log.isLoggable(r0, 3)) {
            Log.d(r0, C0201.m82(15096));
        }
        q(0);
    }

    @Override // defpackage.qi
    public synchronized void c(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException(C0201.m82(15106));
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable() && ((long) this.a.b(bitmap)) <= this.d) {
                if (this.b.contains(bitmap.getConfig())) {
                    int b2 = this.a.b(bitmap);
                    this.a.c(bitmap);
                    this.c.b(bitmap);
                    this.h++;
                    this.e += (long) b2;
                    if (Log.isLoggable(C0201.m82(15097), 2)) {
                        Log.v(C0201.m82(15098), C0201.m82(15099) + this.a.e(bitmap));
                    }
                    h();
                    j();
                    return;
                }
            }
            if (Log.isLoggable(C0201.m82(15100), 2)) {
                Log.v(C0201.m82(15101), C0201.m82(15102) + this.a.e(bitmap) + C0201.m82(15103) + bitmap.isMutable() + C0201.m82(15104) + this.b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } else {
            throw new IllegalStateException(C0201.m82(15105));
        }
    }

    @Override // defpackage.qi
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap m = m(i2, i3, config);
        if (m == null) {
            return g(i2, i3, config);
        }
        m.eraseColor(0);
        return m;
    }

    @Override // defpackage.qi
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        Bitmap m = m(i2, i3, config);
        return m == null ? g(i2, i3, config) : m;
    }

    public long n() {
        return this.d;
    }

    public wi(long j2) {
        this(j2, l(), k());
    }
}
